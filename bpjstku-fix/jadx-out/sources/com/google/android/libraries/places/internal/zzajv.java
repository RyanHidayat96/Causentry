package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzajv implements zzbak {
    static final zzbak zza = new zzajv();

    private zzajv() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i) {
        zzajw zzajwVar;
        if (i == 0) {
            zzajwVar = zzajw.UNDEFINED;
        } else if (i != 1) {
            zzajwVar = i != 2 ? null : zzajw.SEARCH_NEARBY_REQUEST;
        } else {
            zzajwVar = zzajw.SEARCH_BY_TEXT_REQUEST;
        }
        return zzajwVar != null;
    }
}
