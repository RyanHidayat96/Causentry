package androidx.camera.video.internal.audio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AudioSettings {
    public static final List<Integer> COMMON_SAMPLE_RATES = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    public abstract int getChannelCount();

    public abstract int getSampleRate();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new AutoValue_AudioSettings.Builder().setAudioSource(-1).setSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
    }

    AudioSettings() {
    }

    public int getBytesPerFrame() {
        return AudioUtils.getBytesPerFrame(getAudioFormat(), getChannelCount());
    }

    public static abstract class Builder {
        abstract AudioSettings autoBuild();

        public abstract Builder setAudioFormat(int i);

        public abstract Builder setAudioSource(int i);

        public abstract Builder setChannelCount(int i);

        public abstract Builder setSampleRate(int i);

        public final AudioSettings build() {
            String string;
            AudioSettings audioSettingsAutoBuild = autoBuild();
            if (audioSettingsAutoBuild.getAudioSource() != -1) {
                string = "";
            } else {
                string = " audioSource";
            }
            if (audioSettingsAutoBuild.getSampleRate() <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" sampleRate");
                string = sb.toString();
            }
            if (audioSettingsAutoBuild.getChannelCount() <= 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" channelCount");
                string = sb2.toString();
            }
            if (audioSettingsAutoBuild.getAudioFormat() == -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" audioFormat");
                string = sb3.toString();
            }
            if (string.isEmpty()) {
                return audioSettingsAutoBuild;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(String.valueOf(string)));
        }

        Builder() {
        }
    }
}
