package androidx.camera.video.internal.config;

import androidx.camera.core.impl.EncoderProfilesProxy;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_AudioMimeInfo extends AudioMimeInfo {
    private final EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile;
    private final String mimeType;
    private final int profile;

    private AutoValue_AudioMimeInfo(String str, int i, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.mimeType = str;
        this.profile = i;
        this.compatibleAudioProfile = audioProfileProxy;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public final int getProfile() {
        return this.profile;
    }

    @Override // androidx.camera.video.internal.config.AudioMimeInfo
    public final EncoderProfilesProxy.AudioProfileProxy getCompatibleAudioProfile() {
        return this.compatibleAudioProfile;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioMimeInfo{mimeType=");
        sb.append(this.mimeType);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", compatibleAudioProfile=");
        sb.append(this.compatibleAudioProfile);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioMimeInfo)) {
            return false;
        }
        AudioMimeInfo audioMimeInfo = (AudioMimeInfo) obj;
        if (!this.mimeType.equals(audioMimeInfo.getMimeType()) || this.profile != audioMimeInfo.getProfile()) {
            return false;
        }
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.compatibleAudioProfile;
        if (audioProfileProxy == null) {
            if (audioMimeInfo.getCompatibleAudioProfile() != null) {
                return false;
            }
        } else if (!audioProfileProxy.equals(audioMimeInfo.getCompatibleAudioProfile())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.mimeType.hashCode();
        int i = this.profile;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.compatibleAudioProfile;
        return ((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode());
    }

    static final class Builder extends AudioMimeInfo.Builder {
        private EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile;
        private String mimeType;
        private Integer profile;

        @Override // androidx.camera.video.internal.config.AudioMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public final /* bridge */ /* synthetic */ MimeInfo build() {
            return build();
        }

        Builder() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        public final AudioMimeInfo.Builder setMimeType(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.mimeType = str;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        public final AudioMimeInfo.Builder setProfile(int i) {
            this.profile = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.internal.config.AudioMimeInfo.Builder
        public final AudioMimeInfo.Builder setCompatibleAudioProfile(EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
            this.compatibleAudioProfile = audioProfileProxy;
            return this;
        }

        @Override // androidx.camera.video.internal.config.AudioMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public final AudioMimeInfo build() {
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
            return new AutoValue_AudioMimeInfo(this.mimeType, this.profile.intValue(), this.compatibleAudioProfile);
        }
    }
}
