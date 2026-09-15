package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes6.dex */
final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {
    private final String crashlyticsInstallId;
    private final String firebaseAuthenticationToken;
    private final String firebaseInstallationId;

    AutoValue_InstallIdProvider_InstallIds(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.crashlyticsInstallId = str;
        this.firebaseInstallationId = str2;
        this.firebaseAuthenticationToken = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public final String getCrashlyticsInstallId() {
        return this.crashlyticsInstallId;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    @Override // com.google.firebase.crashlytics.internal.common.InstallIdProvider.InstallIds
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.crashlyticsInstallId);
        sb.append(", firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append(", firebaseAuthenticationToken=");
        sb.append(this.firebaseAuthenticationToken);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallIdProvider.InstallIds)) {
            return false;
        }
        InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
        if (!this.crashlyticsInstallId.equals(installIds.getCrashlyticsInstallId())) {
            return false;
        }
        String str = this.firebaseInstallationId;
        if (str == null) {
            if (installIds.getFirebaseInstallationId() != null) {
                return false;
            }
        } else if (!str.equals(installIds.getFirebaseInstallationId())) {
            return false;
        }
        String str2 = this.firebaseAuthenticationToken;
        if (str2 == null) {
            if (installIds.getFirebaseAuthenticationToken() != null) {
                return false;
            }
        } else if (!str2.equals(installIds.getFirebaseAuthenticationToken())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.crashlyticsInstallId.hashCode();
        String str = this.firebaseInstallationId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.firebaseAuthenticationToken;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }
}
