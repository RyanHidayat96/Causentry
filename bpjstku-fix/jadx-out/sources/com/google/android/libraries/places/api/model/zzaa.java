package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
final class zzaa extends zzeo {
    private int zza;
    private int zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.libraries.places.api.model.zzeo
    final LocalDate zzd() {
        if (this.zzd == 7) {
            return new zzcu(this.zza, this.zzb, this.zzc);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb.append(" year");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" month");
        }
        if ((this.zzd & 4) == 0) {
            sb.append(" day");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    zzaa() {
    }

    final zzeo zza(int i) {
        this.zza = i;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzeo
    final zzeo zzb(int i) {
        this.zzb = i;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.zzeo
    final zzeo zzc(int i) {
        this.zzc = i;
        this.zzd = (byte) (this.zzd | 4);
        return this;
    }
}
