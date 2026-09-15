package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzaiy implements zzbak {
    static final zzbak zza = new zzaiy();

    private zzaiy() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i) {
        zzaiz zzaizVar;
        if (i == 0) {
            zzaizVar = zzaiz.ORIENTATION_UNDEFINED;
        } else if (i != 1) {
            zzaizVar = i != 2 ? null : zzaiz.ORIENTATION_HORIZONTAL;
        } else {
            zzaizVar = zzaiz.ORIENTATION_VERTICAL;
        }
        return zzaizVar != null;
    }
}
