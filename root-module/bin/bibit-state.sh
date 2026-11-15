#!/system/bin/sh
# Causentry - Bibit security-state inspector / resetter.
#
# Bibit (com.bibit.bibitid) persists the result of every Talsec/freeRASP
# watcher in its DataStore as a boolean per threat, e.g. talsecRoot,
# talsecDebugger, talsecHook, talsecTamper, talsecAutomation, talsecEmulator.
#
# Those booleans are the *gate*: features/security/data/repository/a.g()
# reads the "talsecRoot" PreferencesKey and RootUseCase.isBlockRoot blocks
# the app while it is true. The value survives restarts until Talsec clears
# it, so hiding a signal is not enough - the stuck flag has to be reset too.
#
# dump  : show every talsec* key with its stored value (TRUE/FALSE).
# reset : force the given keys (default: talsecRoot) back to false.
# clear : force every talsec* key that is currently true back to false.
#
# DataStore Preferences files are protobuf: entry { key=1:string,
# value=2:ValueProto }; ValueProto { boolean=1 }. A stored true is the byte
# pair 08 01 right after the key field, so the whole repair is "flip that
# one byte back to 00" - nothing else in the file is touched.
#
# The app must be stopped first (run appcfg/force-stop); DataStore caches in
# memory and would otherwise rewrite the file on exit.

DIR=${CAUSENTRY_DIR:-/data/adb/causentry}
[ -f "$DIR/lib.sh" ] && . "$DIR/lib.sh"

APP=${BIBIT_PKG:-com.bibit.bibitid}
DATA=${BIBIT_DATA_DIR:-/data/data/$APP}

hexof() { od -An -tx1 -v "$1" | tr -d ' \n'; }

# All DataStore preference files that exist for this app.
pref_files() {
    find "$DATA" -name '*.preferences_pb' 2>/dev/null
}

# index of $2 (hex) inside $1 (hex), or empty when absent.
hex_index() {
    _hay=$1
    _pre=${_hay%%"$2"*}
    [ "$_pre" = "$_hay" ] && return 1
    printf '%s' "${#_pre}"
}

# Every talsec* key name present in the file (key names are plain ASCII in
# the protobuf stream, the values are not).
keys_of() {
    grep -ao 'talsec[A-Za-z0-9_]*' "$1" 2>/dev/null | sort -u
}

# TRUE / FALSE / absent for one key in one file.
# Layout: <key ascii> 12 <len> 08 01   -> boolean true
#                         12 <len> 08 00   -> boolean false
#                         12 00            -> proto3 default, i.e. false
key_state() {
    _f=$1
    _key=$2
    _hex=$(hexof "$_f")
    _khex=$(printf '%s' "$_key" | od -An -tx1 -v | tr -d ' \n')
    _i=$(hex_index "$_hex" "$_khex") || { echo "absent"; return; }
    _rest=$(printf '%s' "$_hex" | cut -c$((_i + 21))-$((_i + 40)))
    case "$_rest" in
        *0801*) echo "TRUE" ;;
        *0800*) echo "FALSE" ;;
        *) echo "FALSE" ;;   # proto3 omits default values
    esac
}

# Flip one key's stored bool to false. Prints what it did.
key_reset() {
    _f=$1
    _key=$2
    _hex=$(hexof "$_f")
    _khex=$(printf '%s' "$_key" | od -An -tx1 -v | tr -d ' \n')
    _i=$(hex_index "$_hex" "$_khex") || return 1
    _rest=$(printf '%s' "$_hex" | cut -c$((_i + 21))-$((_i + 40)))
    case "$_rest" in
        *0801*) ;;
        *) return 2 ;;   # already false / not set
    esac
    # byte offset of the 01 that follows the 08 field tag for this key.
    _hit=${_rest%%0801*}
    _off=$(( _i / 2 + (20 + ${#_hit}) / 2 + 1 ))
    _cur=$(od -An -tx1 -v -j "$_off" -N 1 "$_f" | tr -d ' \n')
    [ "$_cur" = "01" ] || return 3
    printf '\000' | dd of="$_f" bs=1 seek="$_off" conv=notrunc 2>/dev/null || return 3
    return 0
}

cmd_dump() {
    for f in $(pref_files); do
        echo "== $f"
        for k in $(keys_of "$f"); do
            printf '   %-28s %s\n' "$k" "$(key_state "$f" "$k")"
        done
    done
}

cmd_reset() {
    keys=${*:-talsecRoot}
    for f in $(pref_files); do
        for k in $keys; do
            key_reset "$f" "$k"
            case $? in
                0) echo "reset  $k -> false   ($f)" ;;
                1) echo "skip   $k (absent)   ($f)" ;;
                2) echo "ok     $k already false ($f)" ;;
                *) echo "fail   $k (write)    ($f)" ;;
            esac
        done
    done
}

cmd_clear() {
    for f in $(pref_files); do
        for k in $(keys_of "$f"); do
            [ "$(key_state "$f" "$k")" = TRUE ] || continue
            key_reset "$f" "$k" && echo "reset  $k -> false   ($f)"
        done
    done
}

case "$1" in
    dump)  cmd_dump ;;
    reset) shift; cmd_reset "$@" ;;
    clear) cmd_clear ;;
    *)
        echo "usage: $0 dump|reset [key...]|clear"
        echo "  dump  - show talsec* booleans stored by $APP"
        echo "  reset - force keys false (default: talsecRoot)"
        echo "  clear - force every true talsec* key false"
        exit 2
        ;;
esac
