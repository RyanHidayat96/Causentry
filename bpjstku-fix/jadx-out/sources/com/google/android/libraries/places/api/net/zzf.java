package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;

/* JADX INFO: loaded from: classes3.dex */
final class zzf extends FetchPlaceResponse {
    private final Place zza;

    zzf(Place place) {
        if (place == null) {
            throw new NullPointerException("Null place");
        }
        this.zza = place;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FetchPlaceResponse) {
            return this.zza.equals(((FetchPlaceResponse) obj).getPlace());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 26);
        sb.append("FetchPlaceResponse{place=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.net.FetchPlaceResponse
    public final Place getPlace() {
        return this.zza;
    }
}
