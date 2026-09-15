package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.PhotoMetadata;

/* JADX INFO: loaded from: classes3.dex */
final class zzh extends FetchResolvedPhotoUriRequest {
    private final Integer zza;
    private final Integer zzb;
    private final PhotoMetadata zzc;
    private final CancellationToken zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchResolvedPhotoUriRequest)) {
            return false;
        }
        FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest = (FetchResolvedPhotoUriRequest) obj;
        Integer num = this.zza;
        if (num == null) {
            if (fetchResolvedPhotoUriRequest.getMaxWidth() != null) {
                return false;
            }
        } else if (!num.equals(fetchResolvedPhotoUriRequest.getMaxWidth())) {
            return false;
        }
        Integer num2 = this.zzb;
        if (num2 == null) {
            if (fetchResolvedPhotoUriRequest.getMaxHeight() != null) {
                return false;
            }
        } else if (!num2.equals(fetchResolvedPhotoUriRequest.getMaxHeight())) {
            return false;
        }
        if (!this.zzc.equals(fetchResolvedPhotoUriRequest.getPhotoMetadata())) {
            return false;
        }
        CancellationToken cancellationToken = this.zzd;
        if (cancellationToken == null) {
            if (fetchResolvedPhotoUriRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(fetchResolvedPhotoUriRequest.getCancellationToken())) {
            return false;
        }
        return true;
    }

    public final String toString() {
        CancellationToken cancellationToken = this.zzd;
        String string = this.zzc.toString();
        String strValueOf = String.valueOf(cancellationToken);
        Integer num = this.zza;
        int length = String.valueOf(num).length();
        Integer num2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 50 + String.valueOf(num2).length() + 16 + string.length() + 20 + String.valueOf(strValueOf).length() + 1);
        sb.append("FetchResolvedPhotoUriRequest{maxWidth=");
        sb.append(num);
        sb.append(", maxHeight=");
        sb.append(num2);
        sb.append(", photoMetadata=");
        sb.append(string);
        sb.append(", cancellationToken=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Integer num = this.zza;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.zzb;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int iHashCode3 = this.zzc.hashCode();
        CancellationToken cancellationToken = this.zzd;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ (cancellationToken != null ? cancellationToken.hashCode() : 0);
    }

    /* synthetic */ zzh(Integer num, Integer num2, PhotoMetadata photoMetadata, CancellationToken cancellationToken, byte[] bArr) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = cancellationToken;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest, com.google.android.libraries.places.internal.zzmg
    public final CancellationToken getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest
    public final PhotoMetadata getPhotoMetadata() {
        return this.zzc;
    }
}
