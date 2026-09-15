package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzml extends zzmn {
    private String zza;
    private int zzb;
    private zzmo zzc;
    private byte zzd;

    final zzmn zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmn
    public final zzmn zzc(zzmo zzmoVar) {
        if (zzmoVar == null) {
            throw new NullPointerException("Null requestSource");
        }
        this.zzc = zzmoVar;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzmn
    final zzmp zzd() {
        String str;
        zzmo zzmoVar;
        if (this.zzd == 1 && (str = this.zza) != null && (zzmoVar = this.zzc) != null) {
            return new zzmm(str, this.zzb, zzmoVar, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" packageName");
        }
        if (this.zzd == 0) {
            sb.append(" versionCode");
        }
        if (this.zzc == null) {
            sb.append(" requestSource");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    zzml() {
    }

    @Override // com.google.android.libraries.places.internal.zzmn
    final zzmn zzb(int i) {
        this.zzb = i;
        this.zzd = (byte) 1;
        return this;
    }
}
