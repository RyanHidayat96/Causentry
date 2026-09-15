package com.google.android.libraries.places.api.net;

/* JADX INFO: loaded from: classes3.dex */
final class zzr extends IsOpenResponse {
    private final Boolean zza;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IsOpenResponse)) {
            return false;
        }
        IsOpenResponse isOpenResponse = (IsOpenResponse) obj;
        Boolean bool = this.zza;
        if (bool == null) {
            return isOpenResponse.isOpen() == null;
        }
        return bool.equals(isOpenResponse.isOpen());
    }

    public final int hashCode() {
        Boolean bool = this.zza;
        return (bool == null ? 0 : bool.hashCode()) ^ 1000003;
    }

    public final String toString() {
        Boolean bool = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(bool).length() + 23);
        sb.append("IsOpenResponse{isOpen=");
        sb.append(bool);
        sb.append("}");
        return sb.toString();
    }

    zzr(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.libraries.places.api.net.IsOpenResponse
    public final Boolean isOpen() {
        return this.zza;
    }
}
