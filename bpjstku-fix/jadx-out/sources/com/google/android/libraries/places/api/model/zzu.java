package com.google.android.libraries.places.api.model;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzu extends EncodedPolyline {
    private final String zza;

    zzu(String str) {
        if (str == null) {
            throw new NullPointerException("Null encodedPolyline");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EncodedPolyline) {
            return this.zza.equals(((EncodedPolyline) obj).getEncodedPolyline());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append("EncodedPolyline{encodedPolyline=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.EncodedPolyline
    public final String getEncodedPolyline() {
        return this.zza;
    }
}
