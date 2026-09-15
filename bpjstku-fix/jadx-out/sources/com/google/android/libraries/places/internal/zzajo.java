package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzajo implements zzbak {
    static final zzbak zza = new zzajo();

    private zzajo() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i) {
        zzajp zzajpVar;
        if (i == 0) {
            zzajpVar = zzajp.SIZE_UNDEFINED;
        } else if (i == 1) {
            zzajpVar = zzajp.SMALL;
        } else if (i != 2) {
            zzajpVar = i != 3 ? null : zzajp.LARGE;
        } else {
            zzajpVar = zzajp.MEDIUM;
        }
        return zzajpVar != null;
    }
}
