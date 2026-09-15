package com.google.android.libraries.places.internal;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.places.internal.zzon[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.places.internal.zzon[]) from 0x0026: INVOKE (r0v1 com.google.android.libraries.places.internal.zzon[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
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
public final class zzon {
    REVIEWS_ARENT_VERIFIED,
    ABOUT_RESULTS,
    REVIEW_ORDERING;

    static {
        EnumEntriesKt.enumEntries(zzonVarArr);
    }

    private zzon() {
        super(str, i);
    }

    public static zzon valueOf(String str) {
        return (zzon) Enum.valueOf(zzon.class, str);
    }

    public static zzon[] values() {
        return (zzon[]) zzd.clone();
    }
}
