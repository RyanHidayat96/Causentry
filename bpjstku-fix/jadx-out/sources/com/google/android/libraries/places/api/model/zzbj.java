package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
final class zzbj extends SubDestination.Builder {
    private String zza;
    private String zzb;

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final SubDestination build() {
        String str;
        String str2 = this.zza;
        if (str2 != null && (str = this.zzb) != null) {
            return new zzeg(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" id");
        }
        if (this.zzb == null) {
            sb.append(" name");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final SubDestination.Builder setId(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.SubDestination.Builder
    public final SubDestination.Builder setName(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.zzb = str;
        return this;
    }

    zzbj() {
    }
}
