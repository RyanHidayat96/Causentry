package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzbg extends SearchAlongRouteParameters {
    private final Polyline zza;

    zzbg(Polyline polyline) {
        if (polyline == null) {
            throw new NullPointerException("Null polyline");
        }
        this.zza = polyline;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SearchAlongRouteParameters) {
            return this.zza.equals(((SearchAlongRouteParameters) obj).getPolyline());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(string.length() + 37);
        sb.append("SearchAlongRouteParameters{polyline=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.SearchAlongRouteParameters
    public final Polyline getPolyline() {
        return this.zza;
    }
}
