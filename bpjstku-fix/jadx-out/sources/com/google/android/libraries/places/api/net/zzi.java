package com.google.android.libraries.places.api.net;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
final class zzi extends FetchResolvedPhotoUriResponse {
    private final Uri zza;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchResolvedPhotoUriResponse)) {
            return false;
        }
        FetchResolvedPhotoUriResponse fetchResolvedPhotoUriResponse = (FetchResolvedPhotoUriResponse) obj;
        Uri uri = this.zza;
        if (uri == null) {
            return fetchResolvedPhotoUriResponse.getUri() == null;
        }
        return uri.equals(fetchResolvedPhotoUriResponse.getUri());
    }

    public final int hashCode() {
        Uri uri = this.zza;
        return (uri == null ? 0 : uri.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 35);
        sb.append("FetchResolvedPhotoUriResponse{uri=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    zzi(Uri uri) {
        this.zza = uri;
    }

    @Override // com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse
    public final Uri getUri() {
        return this.zza;
    }
}
