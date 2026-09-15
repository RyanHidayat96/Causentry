package com.google.android.libraries.places.widget.internal.placedetails;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.places.widget.internal.placedetails.zzab[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.places.widget.internal.placedetails.zzab[]) from 0x0044: INVOKE (r0v1 com.google.android.libraries.places.widget.internal.placedetails.zzab[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
final class zzab {
    UNKNOWN,
    OPEN_NOW,
    OPEN_24_HOURS,
    CLOSED,
    TEMPORARILY_CLOSED,
    PERMANENTLY_CLOSED;

    static {
        EnumEntriesKt.enumEntries(zzabVarArr);
    }

    private zzab() {
        super(str, i);
    }

    public static zzab valueOf(String str) {
        return (zzab) Enum.valueOf(zzab.class, str);
    }

    public static zzab[] values() {
        return (zzab[]) zzg.clone();
    }
}
