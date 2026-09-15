package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes3.dex */
final class zzae extends Money.Builder {
    private String zza;
    private Long zzb;
    private Integer zzc;

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Integer getNanos() {
        Integer num = this.zzc;
        if (num != null) {
            return num;
        }
        throw new IllegalStateException("Property \"nanos\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Long getUnits() {
        Long l = this.zzb;
        if (l != null) {
            return l;
        }
        throw new IllegalStateException("Property \"units\" has not been set");
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Money.Builder setCurrencyCode(String str) {
        if (str == null) {
            throw new NullPointerException("Null currencyCode");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Money.Builder setNanos(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null nanos");
        }
        this.zzc = num;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    public final Money.Builder setUnits(Long l) {
        if (l == null) {
            throw new NullPointerException("Null units");
        }
        this.zzb = l;
        return this;
    }

    @Override // com.google.android.libraries.places.api.model.Money.Builder
    final Money zza() {
        Long l;
        Integer num;
        String str = this.zza;
        if (str != null && (l = this.zzb) != null && (num = this.zzc) != null) {
            return new zzcy(str, l, num);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" currencyCode");
        }
        if (this.zzb == null) {
            sb.append(" units");
        }
        if (this.zzc == null) {
            sb.append(" nanos");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    zzae() {
    }
}
