package androidx.camera.video.internal.config;

import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.core.util.Supplier;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSettingsAudioProfileResolver implements Supplier<AudioSettings> {
    private static final String TAG = "AudioSrcAdPrflRslvr";
    private final EncoderProfilesProxy.AudioProfileProxy mAudioProfile;
    private final AudioSpec mAudioSpec;

    public AudioSettingsAudioProfileResolver(AudioSpec audioSpec, EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.mAudioSpec = audioSpec;
        this.mAudioProfile = audioProfileProxy;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.util.Supplier
    public final AudioSettings get() {
        int iResolveAudioSource = AudioConfigUtil.resolveAudioSource(this.mAudioSpec);
        int iResolveAudioSourceFormat = AudioConfigUtil.resolveAudioSourceFormat(this.mAudioSpec);
        int channelCount = this.mAudioSpec.getChannelCount();
        Range<Integer> sampleRate = this.mAudioSpec.getSampleRate();
        int channels = this.mAudioProfile.getChannels();
        if (channelCount == -1) {
            Logger.d(TAG, "Resolved AUDIO channel count from AudioProfile: ".concat(String.valueOf(channels)));
            channelCount = channels;
        } else {
            StringBuilder sb = new StringBuilder("Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: ");
            sb.append(channels);
            sb.append(", Resolved Channel Count: ");
            sb.append(channelCount);
            sb.append("]");
            Logger.d(TAG, sb.toString());
        }
        int sampleRate2 = this.mAudioProfile.getSampleRate();
        int iSelectSampleRateOrNearestSupported = AudioConfigUtil.selectSampleRateOrNearestSupported(sampleRate, channelCount, iResolveAudioSourceFormat, sampleRate2);
        StringBuilder sb2 = new StringBuilder("Using resolved AUDIO sample rate or nearest supported from AudioProfile: ");
        sb2.append(iSelectSampleRateOrNearestSupported);
        sb2.append("Hz. [AudioProfile sample rate: ");
        sb2.append(sampleRate2);
        sb2.append("Hz]");
        Logger.d(TAG, sb2.toString());
        return AudioSettings.builder().setAudioSource(iResolveAudioSource).setAudioFormat(iResolveAudioSourceFormat).setChannelCount(channelCount).setSampleRate(iSelectSampleRateOrNearestSupported).build();
    }
}
