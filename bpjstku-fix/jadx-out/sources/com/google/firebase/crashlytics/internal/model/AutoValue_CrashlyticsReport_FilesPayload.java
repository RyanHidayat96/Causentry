package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {
    private final List<CrashlyticsReport.FilesPayload.File> files;
    private final String orgId;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -287968131;
    }

    /* synthetic */ AutoValue_CrashlyticsReport_FilesPayload(List list, String str, AnonymousClass1 anonymousClass1) {
        this(list, str);
    }

    private AutoValue_CrashlyticsReport_FilesPayload(List<CrashlyticsReport.FilesPayload.File> list, String str) {
        this.files = list;
        this.orgId = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final List<CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.files;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final String getOrgId() {
        return this.orgId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.files);
        sb.append(", orgId=");
        sb.append(this.orgId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (!this.files.equals(filesPayload.getFiles())) {
            return false;
        }
        String str = this.orgId;
        if (str == null) {
            if (filesPayload.getOrgId() != null) {
                return false;
            }
        } else if (!str.equals(filesPayload.getOrgId())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.files.hashCode();
        String str = this.orgId;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    final CrashlyticsReport.FilesPayload.Builder toBuilder() {
        return new Builder(this, null);
    }

    static final class Builder extends CrashlyticsReport.FilesPayload.Builder {
        private List<CrashlyticsReport.FilesPayload.File> files;
        private String orgId;

        /* synthetic */ Builder(CrashlyticsReport.FilesPayload filesPayload, AnonymousClass1 anonymousClass1) {
            this(filesPayload);
        }

        Builder() {
        }

        private Builder(CrashlyticsReport.FilesPayload filesPayload) {
            this.files = filesPayload.getFiles();
            this.orgId = filesPayload.getOrgId();
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder setFiles(List<CrashlyticsReport.FilesPayload.File> list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.files = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.orgId = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload build() {
            List<CrashlyticsReport.FilesPayload.File> list = this.files;
            if (list == null) {
                throw new IllegalStateException("Missing required properties: files");
            }
            return new AutoValue_CrashlyticsReport_FilesPayload(list, this.orgId, null);
        }
    }
}
