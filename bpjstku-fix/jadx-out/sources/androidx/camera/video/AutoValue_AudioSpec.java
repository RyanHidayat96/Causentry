package androidx.camera.video;

import android.util.Range;

/* JADX INFO: loaded from: classes5.dex */
final class AutoValue_AudioSpec extends AudioSpec {
    private final Range<Integer> bitrate;
    private final int channelCount;
    private final Range<Integer> sampleRate;
    private final int source;
    private final int sourceFormat;

    private AutoValue_AudioSpec(Range<Integer> range, int i, int i2, Range<Integer> range2, int i3) {
        this.bitrate = range;
        this.sourceFormat = i;
        this.source = i2;
        this.sampleRate = range2;
        this.channelCount = i3;
    }

    @Override // androidx.camera.video.AudioSpec
    public final Range<Integer> getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.video.AudioSpec
    public final int getSourceFormat() {
        return this.sourceFormat;
    }

    @Override // androidx.camera.video.AudioSpec
    public final int getSource() {
        return this.source;
    }

    @Override // androidx.camera.video.AudioSpec
    public final Range<Integer> getSampleRate() {
        return this.sampleRate;
    }

    @Override // androidx.camera.video.AudioSpec
    public final int getChannelCount() {
        return this.channelCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpec{bitrate=");
        sb.append(this.bitrate);
        sb.append(", sourceFormat=");
        sb.append(this.sourceFormat);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", sampleRate=");
        sb.append(this.sampleRate);
        sb.append(", channelCount=");
        sb.append(this.channelCount);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AudioSpec)) {
            return false;
        }
        AudioSpec audioSpec = (AudioSpec) obj;
        return this.bitrate.equals(audioSpec.getBitrate()) && this.sourceFormat == audioSpec.getSourceFormat() && this.source == audioSpec.getSource() && this.sampleRate.equals(audioSpec.getSampleRate()) && this.channelCount == audioSpec.getChannelCount();
    }

    public final int hashCode() {
        int iHashCode = this.bitrate.hashCode();
        int i = this.sourceFormat;
        return ((((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.source) * 1000003) ^ this.sampleRate.hashCode()) * 1000003) ^ this.channelCount;
    }

    @Override // androidx.camera.video.AudioSpec
    public final AudioSpec.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends AudioSpec.Builder {
        private Range<Integer> bitrate;
        private Integer channelCount;
        private Range<Integer> sampleRate;
        private Integer source;
        private Integer sourceFormat;

        Builder() {
        }

        private Builder(AudioSpec audioSpec) {
            this.bitrate = audioSpec.getBitrate();
            this.sourceFormat = Integer.valueOf(audioSpec.getSourceFormat());
            this.source = Integer.valueOf(audioSpec.getSource());
            this.sampleRate = audioSpec.getSampleRate();
            this.channelCount = Integer.valueOf(audioSpec.getChannelCount());
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public final AudioSpec.Builder setBitrate(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null bitrate");
            }
            this.bitrate = range;
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public final AudioSpec.Builder setSourceFormat(int i) {
            this.sourceFormat = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public final AudioSpec.Builder setSource(int i) {
            this.source = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public final AudioSpec.Builder setSampleRate(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null sampleRate");
            }
            this.sampleRate = range;
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public final AudioSpec.Builder setChannelCount(int i) {
            this.channelCount = Integer.valueOf(i);
            return this;
        }

        @Override // androidx.camera.video.AudioSpec.Builder
        public final AudioSpec build() {
            String string;
            if (this.bitrate != null) {
                string = "";
            } else {
                string = " bitrate";
            }
            if (this.sourceFormat == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" sourceFormat");
                string = sb.toString();
            }
            if (this.source == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" source");
                string = sb2.toString();
            }
            if (this.sampleRate == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" sampleRate");
                string = sb3.toString();
            }
            if (this.channelCount == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" channelCount");
                string = sb4.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new AutoValue_AudioSpec(this.bitrate, this.sourceFormat.intValue(), this.source.intValue(), this.sampleRate, this.channelCount.intValue());
        }
    }
}
