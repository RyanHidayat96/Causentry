package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzaja implements zzbak {
    static final zzbak zza = new zzaja();

    private zzaja() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i) {
        zzajb zzajbVar;
        if (i == 0) {
            zzajbVar = zzajb.VARIANT_UNDEFINED;
        } else if (i != 1) {
            zzajbVar = i != 2 ? null : zzajb.VARIANT_FULL;
        } else {
            zzajbVar = zzajb.VARIANT_COMPACT;
        }
        return zzajbVar != null;
    }
}
