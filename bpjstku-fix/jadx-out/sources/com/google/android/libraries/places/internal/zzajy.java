package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzajy implements zzbak {
    static final zzbak zza = new zzajy();

    private zzajy() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i) {
        zzajz zzajzVar;
        if (i == 0) {
            zzajzVar = zzajz.POSITION_UNDEFINED;
        } else if (i != 1) {
            zzajzVar = i != 2 ? null : zzajz.POSITION_BOTTOM;
        } else {
            zzajzVar = zzajz.POSITION_TOP;
        }
        return zzajzVar != null;
    }
}
