package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.Place;

/* JADX INFO: loaded from: classes3.dex */
final class zzq extends IsOpenRequest {
    private final Place zza;
    private final String zzb;
    private final long zzc;
    private final CancellationToken zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IsOpenRequest)) {
            return false;
        }
        IsOpenRequest isOpenRequest = (IsOpenRequest) obj;
        Place place = this.zza;
        if (place == null) {
            if (isOpenRequest.getPlace() != null) {
                return false;
            }
        } else if (!place.equals(isOpenRequest.getPlace())) {
            return false;
        }
        String str = this.zzb;
        if (str == null) {
            if (isOpenRequest.getPlaceId() != null) {
                return false;
            }
        } else if (!str.equals(isOpenRequest.getPlaceId())) {
            return false;
        }
        if (this.zzc != isOpenRequest.getUtcTimeMillis()) {
            return false;
        }
        CancellationToken cancellationToken = this.zzd;
        if (cancellationToken == null) {
            if (isOpenRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(isOpenRequest.getCancellationToken())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        CancellationToken cancellationToken = this.zzd;
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(cancellationToken);
        int length = String.valueOf(strValueOf).length();
        String str = this.zzb;
        int length2 = String.valueOf(str).length();
        long j = this.zzc;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 16 + String.valueOf(j).length() + 20 + String.valueOf(strValueOf2).length() + 1);
        sb.append("IsOpenRequest{place=");
        sb.append(strValueOf);
        sb.append(", placeId=");
        sb.append(str);
        sb.append(", utcTimeMillis=");
        sb.append(j);
        sb.append(", cancellationToken=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Place place = this.zza;
        int iHashCode = place == null ? 0 : place.hashCode();
        String str = this.zzb;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j = this.zzc;
        CancellationToken cancellationToken = this.zzd;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (cancellationToken != null ? cancellationToken.hashCode() : 0);
    }

    /* synthetic */ zzq(Place place, String str, long j, CancellationToken cancellationToken, byte[] bArr) {
        this.zza = place;
        this.zzb = str;
        this.zzc = j;
        this.zzd = cancellationToken;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest, com.google.android.libraries.places.internal.zzmg
    public final CancellationToken getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    public final Place getPlace() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    public final String getPlaceId() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenRequest
    public final long getUtcTimeMillis() {
        return this.zzc;
    }
}
