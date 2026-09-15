package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes6.dex */
final class zzdf extends zzdh {
    static final zzdf zza = new zzdf();

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return false;
    }

    private zzdf() {
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
