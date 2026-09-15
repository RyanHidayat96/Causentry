package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzajq implements zzbak {
    static final zzbak zza = new zzajq();

    private zzajq() {
    }

    @Override // com.google.android.libraries.places.internal.zzbak
    public final boolean zza(int i) {
        zzajr zzajrVar;
        switch (i) {
            case 0:
                zzajrVar = zzajr.CONTENT_UNDEFINED;
                break;
            case 1:
                zzajrVar = zzajr.PHOTO;
                break;
            case 2:
                zzajrVar = zzajr.ADDRESS;
                break;
            case 3:
                zzajrVar = zzajr.RATING;
                break;
            case 4:
                zzajrVar = zzajr.TYPE;
                break;
            case 5:
                zzajrVar = zzajr.PRICE;
                break;
            case 6:
                zzajrVar = zzajr.ACCESSIBILITY;
                break;
            case 7:
                zzajrVar = zzajr.OPEN_NOW_STATUS;
                break;
            default:
                zzajrVar = null;
                break;
        }
        return zzajrVar != null;
    }
}
