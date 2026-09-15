package androidx.camera.video.internal;

import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_VideoValidatedEncoderProfilesProxy extends VideoValidatedEncoderProfilesProxy {
    private final List<EncoderProfilesProxy.AudioProfileProxy> audioProfiles;
    private final EncoderProfilesProxy.AudioProfileProxy defaultAudioProfile;
    private final int defaultDurationSeconds;
    private final EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile;
    private final int recommendedFileFormat;
    private final List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles;

    AutoValue_VideoValidatedEncoderProfilesProxy(int i, int i2, List<EncoderProfilesProxy.AudioProfileProxy> list, List<EncoderProfilesProxy.VideoProfileProxy> list2, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy, EncoderProfilesProxy.VideoProfileProxy videoProfileProxy) {
        this.defaultDurationSeconds = i;
        this.recommendedFileFormat = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.audioProfiles = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.videoProfiles = list2;
        this.defaultAudioProfile = audioProfileProxy;
        if (videoProfileProxy == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.defaultVideoProfile = videoProfileProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getDefaultDurationSeconds() {
        return this.defaultDurationSeconds;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final int getRecommendedFileFormat() {
        return this.recommendedFileFormat;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List<EncoderProfilesProxy.AudioProfileProxy> getAudioProfiles() {
        return this.audioProfiles;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public final List<EncoderProfilesProxy.VideoProfileProxy> getVideoProfiles() {
        return this.videoProfiles;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public final EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile() {
        return this.defaultAudioProfile;
    }

    @Override // androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy
    public final EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile() {
        return this.defaultVideoProfile;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.defaultDurationSeconds);
        sb.append(", recommendedFileFormat=");
        sb.append(this.recommendedFileFormat);
        sb.append(", audioProfiles=");
        sb.append(this.audioProfiles);
        sb.append(", videoProfiles=");
        sb.append(this.videoProfiles);
        sb.append(", defaultAudioProfile=");
        sb.append(this.defaultAudioProfile);
        sb.append(", defaultVideoProfile=");
        sb.append(this.defaultVideoProfile);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoValidatedEncoderProfilesProxy)) {
            return false;
        }
        VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy = (VideoValidatedEncoderProfilesProxy) obj;
        if (this.defaultDurationSeconds != videoValidatedEncoderProfilesProxy.getDefaultDurationSeconds() || this.recommendedFileFormat != videoValidatedEncoderProfilesProxy.getRecommendedFileFormat() || !this.audioProfiles.equals(videoValidatedEncoderProfilesProxy.getAudioProfiles()) || !this.videoProfiles.equals(videoValidatedEncoderProfilesProxy.getVideoProfiles())) {
            return false;
        }
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.defaultAudioProfile;
        if (audioProfileProxy == null) {
            if (videoValidatedEncoderProfilesProxy.getDefaultAudioProfile() != null) {
                return false;
            }
        } else if (!audioProfileProxy.equals(videoValidatedEncoderProfilesProxy.getDefaultAudioProfile())) {
            return false;
        }
        return this.defaultVideoProfile.equals(videoValidatedEncoderProfilesProxy.getDefaultVideoProfile());
    }

    public final int hashCode() {
        int i = this.defaultDurationSeconds;
        int i2 = this.recommendedFileFormat;
        int iHashCode = this.audioProfiles.hashCode();
        int iHashCode2 = this.videoProfiles.hashCode();
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.defaultAudioProfile;
        return ((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode())) * 1000003) ^ this.defaultVideoProfile.hashCode();
    }
}
