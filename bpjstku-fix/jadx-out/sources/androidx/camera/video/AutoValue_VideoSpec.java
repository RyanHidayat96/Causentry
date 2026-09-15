package androidx.camera.video;

import android.util.Range;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_VideoSpec extends VideoSpec {
    private final int aspectRatio;
    private final Range<Integer> bitrate;
    private final Range<Integer> frameRate;
    private final QualitySelector qualitySelector;

    private AutoValue_VideoSpec(QualitySelector qualitySelector, Range<Integer> range, Range<Integer> range2, int i) {
        this.qualitySelector = qualitySelector;
        this.frameRate = range;
        this.bitrate = range2;
        this.aspectRatio = i;
    }

    @Override // androidx.camera.video.VideoSpec
    public final QualitySelector getQualitySelector() {
        return this.qualitySelector;
    }

    @Override // androidx.camera.video.VideoSpec
    public final Range<Integer> getFrameRate() {
        return this.frameRate;
    }

    @Override // androidx.camera.video.VideoSpec
    public final Range<Integer> getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.VideoSpec
    final int getAspectRatio() {
        return this.aspectRatio;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.qualitySelector);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", aspectRatio=");
        sb.append(this.aspectRatio);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoSpec)) {
            return false;
        }
        VideoSpec videoSpec = (VideoSpec) obj;
        return this.qualitySelector.equals(videoSpec.getQualitySelector()) && this.frameRate.equals(videoSpec.getFrameRate()) && this.bitrate.equals(videoSpec.getBitrate()) && this.aspectRatio == videoSpec.getAspectRatio();
    }

    public final int hashCode() {
        int iHashCode = this.qualitySelector.hashCode();
        return ((((((iHashCode ^ 1000003) * 1000003) ^ this.frameRate.hashCode()) * 1000003) ^ this.bitrate.hashCode()) * 1000003) ^ this.aspectRatio;
    }

    @Override // androidx.camera.video.VideoSpec
    public final VideoSpec.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends VideoSpec.Builder {
        private Integer aspectRatio;
        private Range<Integer> bitrate;
        private Range<Integer> frameRate;
        private QualitySelector qualitySelector;

        Builder() {
        }

        private Builder(VideoSpec videoSpec) {
            this.qualitySelector = videoSpec.getQualitySelector();
            this.frameRate = videoSpec.getFrameRate();
            this.bitrate = videoSpec.getBitrate();
            this.aspectRatio = Integer.valueOf(videoSpec.getAspectRatio());
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public final VideoSpec.Builder setQualitySelector(QualitySelector qualitySelector) {
            if (qualitySelector == null) {
                throw new NullPointerException("Null qualitySelector");
            }
            this.qualitySelector = qualitySelector;
            return this;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public final VideoSpec.Builder setFrameRate(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null frameRate");
            }
            this.frameRate = range;
            return this;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public final VideoSpec.Builder setBitrate(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.bitrate = range;
            return this;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        final VideoSpec.Builder setAspectRatio(int i) {
            this.aspectRatio = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.VideoSpec.Builder
        public final VideoSpec build() {
            String string;
            if (this.qualitySelector != null) {
                string = "";
            } else {
                string = " qualitySelector";
            }
            if (this.frameRate == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" frameRate");
                string = sb.toString();
            }
            if (this.bitrate == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" bitrate");
                string = sb2.toString();
            }
            if (this.aspectRatio == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" aspectRatio");
                string = sb3.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new AutoValue_VideoSpec(this.qualitySelector, this.frameRate, this.bitrate, this.aspectRatio.intValue());
        }
    }
}
