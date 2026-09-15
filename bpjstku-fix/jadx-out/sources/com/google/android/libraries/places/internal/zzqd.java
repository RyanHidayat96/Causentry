package com.google.android.libraries.places.internal;

import com.google.common.collect.ImmutableList;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
final class zzqd extends zzrd {
    private ImmutableList zza;
    private ImmutableList zzb;
    private UUID zzc;
    private long zzd;
    private byte zze;

    @Override // com.google.android.libraries.places.internal.zzrd
    public final zzrd zza(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null spansNames");
        }
        this.zza = immutableList;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzrd
    public final zzrd zzb(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null extras");
        }
        this.zzb = immutableList;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzrd
    public final zzrd zzc(UUID uuid) {
        if (uuid == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        this.zzc = uuid;
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzrd
    public final zzre zze() {
        ImmutableList immutableList;
        ImmutableList immutableList2;
        UUID uuid;
        if (this.zze == 1 && (immutableList = this.zza) != null && (immutableList2 = this.zzb) != null && (uuid = this.zzc) != null) {
            return new zzqe(immutableList, immutableList2, uuid, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" spansNames");
        }
        if (this.zzb == null) {
            sb.append(" extras");
        }
        if (this.zzc == null) {
            sb.append(" rootTraceId");
        }
        if (this.zze == 0) {
            sb.append(" rootDurationMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    zzqd() {
    }

    @Override // com.google.android.libraries.places.internal.zzrd
    public final zzrd zzd(long j) {
        this.zzd = -1L;
        this.zze = (byte) 1;
        return this;
    }
}
