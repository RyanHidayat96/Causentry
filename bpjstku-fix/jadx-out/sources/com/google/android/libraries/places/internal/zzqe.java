package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableList;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
final class zzqe extends zzre {
    private final ImmutableList zza;
    private final ImmutableList zzb;
    private final UUID zzc;
    private final long zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzre)) {
            return false;
        }
        zzre zzreVar = (zzre) obj;
        return this.zza.equals(zzreVar.zza()) && this.zzb.equals(zzreVar.zzb()) && this.zzc.equals(zzreVar.zzc()) && this.zzd == zzreVar.zzd();
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode();
        int iHashCode2 = this.zzb.hashCode();
        int iHashCode3 = this.zzc.hashCode();
        long j = this.zzd;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    /* synthetic */ zzqe(ImmutableList immutableList, ImmutableList immutableList2, UUID uuid, long j, byte[] bArr) {
        this.zza = immutableList;
        this.zzb = immutableList2;
        this.zzc = uuid;
        this.zzd = j;
    }

    @Override // com.google.android.libraries.places.internal.zzre
    public final ImmutableList zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzre
    public final ImmutableList zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzre
    public final UUID zzc() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzre
    public final long zzd() {
        return this.zzd;
    }
}
