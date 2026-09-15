package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.R;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.google.android.libraries.places.internal.zzoe[], still in use, count: 1, list:
  (r0v1 com.google.android.libraries.places.internal.zzoe[]) from 0x002c: INVOKE (r0v1 com.google.android.libraries.places.internal.zzoe[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m)]
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
public final class zzoe {
    WHITE(0, R.color.place_details_attribution_color_white),
    GRAY(1, R.color.place_details_attribution_color_gray),
    BLACK(2, R.color.place_details_attribution_color_black);

    private final int zzd;
    private final int zze;

    static {
        EnumEntriesKt.enumEntries(zzoeVarArr);
    }

    private zzoe(int i, int i2) {
        super(str, i);
        this.zzd = i;
        this.zze = i2;
    }

    public static zzoe valueOf(String str) {
        return (zzoe) Enum.valueOf(zzoe.class, str);
    }

    public static zzoe[] values() {
        return (zzoe[]) zzf.clone();
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zze;
    }
}
