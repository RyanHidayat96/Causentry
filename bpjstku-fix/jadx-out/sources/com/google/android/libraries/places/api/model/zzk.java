package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
final class zzk extends zzej {
    private int zza;
    private int zzb;
    private byte zzc;

    @Override // com.google.android.libraries.places.api.model.zzej
    public final zzek zzc() {
        if (this.zzc == 3) {
            return new zzca(this.zza, this.zzb);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(" offset");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" length");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    zzk() {
    }

    @Override // com.google.android.libraries.places.api.model.zzej
    public final zzej zza(int i) {
        this.zza = i;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzej
    public final zzej zzb(int i) {
        this.zzb = i;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }
}
