package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzajt implements zzbak {
    static final zzbak zza = new zzajt();

    private zzajt() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i) {
        zzaju zzajuVar;
        if (i == 0) {
            zzajuVar = zzaju.ORIENTATION_UNDEFINED;
        } else if (i != 1) {
            zzajuVar = i != 2 ? null : zzaju.ORIENTATION_HORIZONTAL;
        } else {
            zzajuVar = zzaju.ORIENTATION_VERTICAL;
        }
        return zzajuVar != null;
    }
}
