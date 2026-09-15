package androidx.content.preferences.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ$\u0010\u0012\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0016\u0010\u000fJ&\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001c\u0010\u001e\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030 H\u0086\u0002¢\u0006\u0004\b\u001e\u0010!J)\u0010#\u001a\u00020\r2\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030 0\"\"\u0006\u0012\u0002\b\u00030 ¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b%\u0010\u0018J,\u0010&\u001a\u00020\r\"\u0004\b\u0000\u0010\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\u00020)H\u0017¢\u0006\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R*\u0010/\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\f"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Landroidx/datastore/preferences/core/Preferences;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "p0", "", "p1", "<init>", "(Ljava/util/Map;Z)V", "", "asMap", "()Ljava/util/Map;", "", "checkNotFrozen$datastore_preferences_core", "()V", "clear", ExifInterface.GPS_DIRECTION_TRUE, "contains", "(Landroidx/datastore/preferences/core/Preferences$Key;)Z", "equals", "(Ljava/lang/Object;)Z", "freeze$datastore_preferences_core", "get", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "", "hashCode", "()I", "minusAssign", "(Landroidx/datastore/preferences/core/Preferences$Key;)V", "plusAssign", "(Landroidx/datastore/preferences/core/Preferences;)V", "Landroidx/datastore/preferences/core/Preferences$Pair;", "(Landroidx/datastore/preferences/core/Preferences$Pair;)V", "", "putAll", "([Landroidx/datastore/preferences/core/Preferences$Pair;)V", "remove", "set", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "setUnchecked$datastore_preferences_core", "", "toString", "()Ljava/lang/String;", "Landroidx/datastore/preferences/core/AtomicBoolean;", "frozen", "Landroidx/datastore/preferences/core/AtomicBoolean;", "preferencesMap", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutablePreferences extends Preferences {
    private final AtomicBoolean frozen;
    private final Map<Preferences.Key<?>, Object> preferencesMap;

    public /* synthetic */ MutablePreferences(LinkedHashMap linkedHashMap, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap, (i & 2) != 0 ? true : z);
    }

    public final Map<Preferences.Key<?>, Object> getPreferencesMap$datastore_preferences_core() {
        return this.preferencesMap;
    }

    public MutablePreferences(Map<Preferences.Key<?>, Object> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "");
        this.preferencesMap = map;
        this.frozen = new AtomicBoolean(z);
    }

    public final void checkNotFrozen$datastore_preferences_core() {
        if (this.frozen.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void freeze$datastore_preferences_core() {
        this.frozen.set(true);
    }

    @Override // androidx.content.preferences.core.Preferences
    public final <T> boolean contains(Preferences.Key<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.preferencesMap.containsKey(p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.core.Preferences
    public final <T> T get(Preferences.Key<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        T t = (T) this.preferencesMap.get(p0);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        T t2 = (T) Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(t2, "");
        return t2;
    }

    @Override // androidx.content.preferences.core.Preferences
    public final Map<Preferences.Key<?>, Object> asMap() {
        Pair pair;
        Set<Map.Entry<Preferences.Key<?>, Object>> setEntrySet = this.preferencesMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return Actual_jvmKt.immutableMap(linkedHashMap);
    }

    public final <T> void set(Preferences.Key<T> p0, T p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        setUnchecked$datastore_preferences_core(p0, p1);
    }

    public final void setUnchecked$datastore_preferences_core(Preferences.Key<?> p0, Object p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkNotFrozen$datastore_preferences_core();
        if (p1 == null) {
            remove(p0);
            return;
        }
        if (p1 instanceof Set) {
            this.preferencesMap.put(p0, Actual_jvmKt.immutableCopyOfSet((Set) p1));
            return;
        }
        if (!(p1 instanceof byte[])) {
            this.preferencesMap.put(p0, p1);
            return;
        }
        Map<Preferences.Key<?>, Object> map = this.preferencesMap;
        byte[] bArr = (byte[]) p1;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        map.put(p0, bArrCopyOf);
    }

    public final void plusAssign(Preferences p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.putAll(p0.asMap());
    }

    public final void plusAssign(Preferences.Pair<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkNotFrozen$datastore_preferences_core();
        putAll(p0);
    }

    public final void minusAssign(Preferences.Key<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkNotFrozen$datastore_preferences_core();
        remove(p0);
    }

    public final void putAll(Preferences.Pair<?>... p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkNotFrozen$datastore_preferences_core();
        for (Preferences.Pair<?> pair : p0) {
            setUnchecked$datastore_preferences_core(pair.getKey$datastore_preferences_core(), pair.getValue$datastore_preferences_core());
        }
    }

    public final <T> T remove(Preferences.Key<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        checkNotFrozen$datastore_preferences_core();
        return (T) this.preferencesMap.remove(p0);
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.clear();
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof MutablePreferences)) {
            return false;
        }
        MutablePreferences mutablePreferences = (MutablePreferences) p0;
        Map<Preferences.Key<?>, Object> map = mutablePreferences.preferencesMap;
        if (map == this.preferencesMap) {
            return true;
        }
        if (map.size() != this.preferencesMap.size()) {
            return false;
        }
        Map<Preferences.Key<?>, Object> map2 = mutablePreferences.preferencesMap;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry<Preferences.Key<?>, Object> entry : map2.entrySet()) {
            Object obj = this.preferencesMap.get(entry.getKey());
            if (obj != null) {
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    if (!(obj instanceof byte[]) || !Arrays.equals((byte[]) value, (byte[]) obj)) {
                    }
                } else if (!Intrinsics.areEqual(value, obj)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Iterator<T> it = this.preferencesMap.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return CollectionsKt.joinToString$default(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, new Function1<Map.Entry<Preferences.Key<?>, Object>, CharSequence>() { // from class: androidx.datastore.preferences.core.MutablePreferences.toString.1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Map.Entry<Preferences.Key<?>, Object> entry) {
                Intrinsics.checkNotNullParameter(entry, "");
                Object value = entry.getValue();
                String strJoinToString$default = value instanceof byte[] ? ArraysKt.joinToString$default((byte[]) value, (CharSequence) ", ", (CharSequence) "[", (CharSequence) "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null) : String.valueOf(entry.getValue());
                StringBuilder sb = new StringBuilder("  ");
                sb.append(entry.getKey().getName());
                sb.append(" = ");
                sb.append(strJoinToString$default);
                return sb.toString();
            }
        }, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutablePreferences() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
