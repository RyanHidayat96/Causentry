package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_VideoMimeInfo extends VideoMimeInfo {
    private final EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile;
    private final String mimeType;
    private final int profile;

    private AutoValue_VideoMimeInfo(String str, int i, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.mimeType = str;
        this.profile = i;
        this.compatibleVideoProfile = videoProfileProxy;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final int getProfile() {
        return this.profile;
    }

    @Override // androidx.camera.video.internal.config.VideoMimeInfo
    public final EncoderProfilesProxy.VideoProfileProxy getCompatibleVideoProfile() {
        return this.compatibleVideoProfile;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMimeInfo{mimeType=");
        sb.append(this.mimeType);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", compatibleVideoProfile=");
        sb.append(this.compatibleVideoProfile);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoMimeInfo)) {
            return false;
        }
        VideoMimeInfo videoMimeInfo = (VideoMimeInfo) obj;
        if (!this.mimeType.equals(videoMimeInfo.getMimeType()) || this.profile != videoMimeInfo.getProfile()) {
            return false;
        }
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.compatibleVideoProfile;
        if (videoProfileProxy == null) {
            if (videoMimeInfo.getCompatibleVideoProfile() != null) {
                return false;
            }
        } else if (!videoProfileProxy.equals(videoMimeInfo.getCompatibleVideoProfile())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.mimeType.hashCode();
        int i = this.profile;
        EncoderProfilesProxy.VideoProfileProxy videoProfileProxy = this.compatibleVideoProfile;
        return ((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ (videoProfileProxy == null ? 0 : videoProfileProxy.hashCode());
    }

    static final class Builder extends VideoMimeInfo.Builder {
        private EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile;
        private String mimeType;
        private Integer profile;

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public final /* bridge */ /* synthetic */ MimeInfo build() {
            return build();
        }

        Builder() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        public final VideoMimeInfo.Builder setMimeType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.mimeType = str;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        public final VideoMimeInfo.Builder setProfile(int i) {
            this.profile = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder
        public final VideoMimeInfo.Builder setCompatibleVideoProfile(EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
            this.compatibleVideoProfile = videoProfileProxy;
            return this;
        }

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public final VideoMimeInfo build() {
            String string;
            if (this.mimeType != null) {
                string = "";
            } else {
                string = " mimeType";
            }
            if (this.profile == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" profile");
                string = sb.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new AutoValue_VideoMimeInfo(this.mimeType, this.profile.intValue(), this.compatibleVideoProfile);
        }
    }
}
