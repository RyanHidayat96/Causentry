package com.google.android.libraries.places.api.net;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.PhotoMetadata;

/* JADX INFO: loaded from: classes3.dex */
final class zzb extends FetchPhotoRequest {
    private final Integer zza;
    private final Integer zzb;
    private final PhotoMetadata zzc;
    private final CancellationToken zzd;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchPhotoRequest)) {
            return false;
        }
        FetchPhotoRequest fetchPhotoRequest = (FetchPhotoRequest) obj;
        Integer num = this.zza;
        if (num == null) {
            if (fetchPhotoRequest.getMaxWidth() != null) {
                return false;
            }
        } else if (!num.equals(fetchPhotoRequest.getMaxWidth())) {
            return false;
        }
        Integer num2 = this.zzb;
        if (num2 == null) {
            if (fetchPhotoRequest.getMaxHeight() != null) {
                return false;
            }
        } else if (!num2.equals(fetchPhotoRequest.getMaxHeight())) {
            return false;
        }
        if (!this.zzc.equals(fetchPhotoRequest.getPhotoMetadata())) {
            return false;
        }
        CancellationToken cancellationToken = this.zzd;
        if (cancellationToken == null) {
            if (fetchPhotoRequest.getCancellationToken() != null) {
                return false;
            }
        } else if (!cancellationToken.equals(fetchPhotoRequest.getCancellationToken())) {
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
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(num2).length() + 16 + string.length() + 20 + String.valueOf(strValueOf).length() + 1);
        sb.append("FetchPhotoRequest{maxWidth=");
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

    /* synthetic */ zzb(Integer num, Integer num2, PhotoMetadata photoMetadata, CancellationToken cancellationToken, byte[] bArr) {
        this.zza = num;
        this.zzb = num2;
        this.zzc = photoMetadata;
        this.zzd = cancellationToken;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest, com.google.android.libraries.places.internal.zzmg
    public final CancellationToken getCancellationToken() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final Integer getMaxHeight() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final Integer getMaxWidth() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FetchPhotoRequest
    public final PhotoMetadata getPhotoMetadata() {
        return this.zzc;
    }
}
