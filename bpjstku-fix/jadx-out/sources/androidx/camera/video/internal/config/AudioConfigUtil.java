package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import androidx.core.util.Supplier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioConfigUtil {
    static final int AUDIO_CHANNEL_COUNT_DEFAULT = 1;
    static final int AUDIO_SAMPLE_RATE_DEFAULT = 44100;
    static final int AUDIO_SOURCE_DEFAULT = 5;
    static final int AUDIO_SOURCE_FORMAT_DEFAULT = 2;
    private static final String TAG = "AudioConfigUtil";

    private AudioConfigUtil() {
    }

    public static AudioMimeInfo resolveAudioMimeInfo(MediaSpec mediaSpec, VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        EncoderProfilesProxy.AudioProfileProxy defaultAudioProfile;
        String strOutputFormatToAudioMime = MediaSpec.outputFormatToAudioMime(mediaSpec.getOutputFormat());
        int iOutputFormatToAudioProfile = MediaSpec.outputFormatToAudioProfile(mediaSpec.getOutputFormat());
        if (videoValidatedEncoderProfilesProxy == null || videoValidatedEncoderProfilesProxy.getDefaultAudioProfile() == null) {
            defaultAudioProfile = null;
        } else {
            defaultAudioProfile = videoValidatedEncoderProfilesProxy.getDefaultAudioProfile();
            String mediaType = defaultAudioProfile.getMediaType();
            int profile = defaultAudioProfile.getProfile();
            if (Objects.equals(mediaType, EncoderProfilesProxy.AudioProfileProxy.MEDIA_TYPE_NONE)) {
                StringBuilder sb = new StringBuilder("EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: ");
                sb.append(strOutputFormatToAudioMime);
                sb.append("(profile: ");
                sb.append(iOutputFormatToAudioProfile);
                sb.append(")]");
                Logger.d(TAG, sb.toString());
            } else if (mediaSpec.getOutputFormat() == -1) {
                StringBuilder sb2 = new StringBuilder("MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: ");
                sb2.append(mediaType);
                sb2.append("(profile: ");
                sb2.append(profile);
                sb2.append(")]");
                Logger.d(TAG, sb2.toString());
                strOutputFormatToAudioMime = mediaType;
                iOutputFormatToAudioProfile = profile;
            } else if (Objects.equals(strOutputFormatToAudioMime, mediaType) && iOutputFormatToAudioProfile == profile) {
                StringBuilder sb3 = new StringBuilder("MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: ");
                sb3.append(mediaType);
                sb3.append("(profile: ");
                sb3.append(iOutputFormatToAudioProfile);
                sb3.append(")]");
                Logger.d(TAG, sb3.toString());
                strOutputFormatToAudioMime = mediaType;
            } else {
                StringBuilder sb4 = new StringBuilder("MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: ");
                sb4.append(mediaType);
                sb4.append("(profile: ");
                sb4.append(profile);
                sb4.append("), chosen mime type: ");
                sb4.append(strOutputFormatToAudioMime);
                sb4.append("(profile: ");
                sb4.append(iOutputFormatToAudioProfile);
                sb4.append(")]");
                Logger.d(TAG, sb4.toString());
            }
            defaultAudioProfile = null;
        }
        AudioMimeInfo.Builder profile2 = AudioMimeInfo.builder(strOutputFormatToAudioMime).setProfile(iOutputFormatToAudioProfile);
        if (defaultAudioProfile != null) {
            profile2.setCompatibleAudioProfile(defaultAudioProfile);
        }
        return profile2.build();
    }

    public static AudioSettings resolveAudioSettings(AudioMimeInfo audioMimeInfo, AudioSpec audioSpec) {
        Supplier audioSettingsDefaultResolver;
        EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile = audioMimeInfo.getCompatibleAudioProfile();
        if (compatibleAudioProfile != null) {
            audioSettingsDefaultResolver = new AudioSettingsAudioProfileResolver(audioSpec, compatibleAudioProfile);
        } else {
            audioSettingsDefaultResolver = new AudioSettingsDefaultResolver(audioSpec);
        }
        return (AudioSettings) audioSettingsDefaultResolver.get();
    }

    public static AudioEncoderConfig resolveAudioEncoderConfig(AudioMimeInfo audioMimeInfo, Timebase timebase, AudioSettings audioSettings, AudioSpec audioSpec) {
        Supplier audioEncoderConfigDefaultResolver;
        EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile = audioMimeInfo.getCompatibleAudioProfile();
        if (compatibleAudioProfile != null) {
            audioEncoderConfigDefaultResolver = new AudioEncoderConfigAudioProfileResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings, compatibleAudioProfile);
        } else {
            audioEncoderConfigDefaultResolver = new AudioEncoderConfigDefaultResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings);
        }
        return (AudioEncoderConfig) audioEncoderConfigDefaultResolver.get();
    }

    static int resolveAudioSource(AudioSpec audioSpec) {
        int source = audioSpec.getSource();
        if (source == -1) {
            Logger.d(TAG, "Using default AUDIO source: 5");
            return 5;
        }
        Logger.d(TAG, "Using provided AUDIO source: ".concat(String.valueOf(source)));
        return source;
    }

    static int resolveAudioSourceFormat(AudioSpec audioSpec) {
        int sourceFormat = audioSpec.getSourceFormat();
        if (sourceFormat == -1) {
            Logger.d(TAG, "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.d(TAG, "Using provided AUDIO source format: ".concat(String.valueOf(sourceFormat)));
        return sourceFormat;
    }

    static int selectSampleRateOrNearestSupported(Range<Integer> range, int i, int i2, final int i3) {
        ArrayList arrayList = null;
        int i4 = 0;
        int iIntValue = i3;
        while (true) {
            if (range.contains(Integer.valueOf(iIntValue))) {
                if (AudioSource.isSettingsSupported(iIntValue, i, i2)) {
                    return iIntValue;
                }
                StringBuilder sb = new StringBuilder("Sample rate ");
                sb.append(iIntValue);
                sb.append("Hz is not supported by audio source with channel count ");
                sb.append(i);
                sb.append(" and source format ");
                sb.append(i2);
                Logger.d(TAG, sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("Sample rate ");
                sb2.append(iIntValue);
                sb2.append("Hz is not in target range ");
                sb2.append(range);
                Logger.d(TAG, sb2.toString());
            }
            if (arrayList == null) {
                StringBuilder sb3 = new StringBuilder("Trying common sample rates in proximity order to target ");
                sb3.append(i3);
                sb3.append("Hz");
                Logger.d(TAG, sb3.toString());
                arrayList = new ArrayList(AudioSettings.COMMON_SAMPLE_RATES);
                Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.internal.config.AudioConfigUtil$$ExternalSyntheticLambda0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return AudioConfigUtil.lambda$selectSampleRateOrNearestSupported$0(i3, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i4 < arrayList.size()) {
                iIntValue = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                Logger.d(TAG, "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return AUDIO_SAMPLE_RATE_DEFAULT;
            }
        }
    }

    static /* synthetic */ int lambda$selectSampleRateOrNearestSupported$0(int i, Integer num, Integer num2) {
        float fSignum;
        int iAbs = Math.abs(num.intValue() - i) - Math.abs(num2.intValue() - i);
        if (iAbs == 0) {
            fSignum = Math.signum(num.intValue() - num2.intValue());
        } else {
            fSignum = Math.signum(iAbs);
        }
        return (int) fSignum;
    }

    static int scaleAndClampBitrate(int i, int i2, int i3, int i4, int i5, Range<Integer> range) {
        String string;
        int iDoubleValue = (int) (((double) i) * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue());
        if (!Logger.isDebugEnabled(TAG)) {
            string = "";
        } else {
            string = String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(iDoubleValue));
        }
        if (!AudioSpec.BITRATE_RANGE_AUTO.equals(range)) {
            iDoubleValue = ((Integer) range.clamp(Integer.valueOf(iDoubleValue))).intValue();
            if (Logger.isDebugEnabled(TAG)) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(String.format("\nClamped to range %s -> %dbps", range, Integer.valueOf(iDoubleValue)));
                string = sb.toString();
            }
        }
        Logger.d(TAG, string);
        return iDoubleValue;
    }
}
