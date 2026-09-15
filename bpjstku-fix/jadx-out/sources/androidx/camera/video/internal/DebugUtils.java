package androidx.camera.video.internal;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.Api28Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class DebugUtils {
    private static final String AUDIO_CAPS_PREFIX = "[AudioCaps] ";
    private static final String CODEC_CAPS_PREFIX = "[CodecCaps] ";
    private static final String ENCODER_CAPS_PREFIX = "[EncoderCaps] ";
    private static final String TAG = "DebugUtils";
    private static final String VIDEO_CAPS_PREFIX = "[VideoCaps] ";

    private DebugUtils() {
    }

    public static String readableUs(long j) {
        return readableMs(TimeUnit.MICROSECONDS.toMillis(j));
    }

    public static String readableMs(long j) {
        return formatInterval(j);
    }

    public static String readableBufferInfo(MediaCodec.BufferInfo bufferInfo) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Dump BufferInfo: ");
        sb2.append(bufferInfo.toString());
        sb2.append("\n");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("\toffset: ");
        sb3.append(bufferInfo.offset);
        sb3.append("\n");
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("\tsize: ");
        sb4.append(bufferInfo.size);
        sb4.append("\n");
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder("\tflag: ");
        sb5.append(bufferInfo.flags);
        sb.append(sb5.toString());
        ArrayList arrayList = new ArrayList();
        if ((bufferInfo.flags & 4) != 0) {
            arrayList.add("EOS");
        }
        if ((bufferInfo.flags & 2) != 0) {
            arrayList.add("CODEC_CONFIG");
        }
        if ((bufferInfo.flags & 1) != 0) {
            arrayList.add("KEY_FRAME");
        }
        if ((bufferInfo.flags & 8) != 0) {
            arrayList.add("PARTIAL_FRAME");
        }
        if (!arrayList.isEmpty()) {
            sb.append(" (");
            sb.append(TextUtils.join(" | ", arrayList));
            sb.append(")");
        }
        sb.append("\n");
        StringBuilder sb6 = new StringBuilder("\tpresentationTime: ");
        sb6.append(bufferInfo.presentationTimeUs);
        sb6.append(" (");
        sb6.append(readableUs(bufferInfo.presentationTimeUs));
        sb6.append(")\n");
        sb.append(sb6.toString());
        return sb.toString();
    }

    private static String formatInterval(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(j - TimeUnit.HOURS.toMillis(hours));
        long seconds = TimeUnit.MILLISECONDS.toSeconds((j - TimeUnit.HOURS.toMillis(hours)) - TimeUnit.MINUTES.toMillis(minutes));
        long millis = TimeUnit.HOURS.toMillis(hours);
        long millis2 = TimeUnit.MINUTES.toMillis(minutes);
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j - millis) - millis2) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static String dumpMediaCodecListForFormat(MediaCodecList mediaCodecList, MediaFormat mediaFormat) {
        StringBuilder sb = new StringBuilder();
        logToString(sb, "[Start] Dump MediaCodecList for mediaFormat ".concat(String.valueOf(mediaFormat)));
        String string = mediaFormat.getString("mime");
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z = true;
                try {
                    Preconditions.checkArgument(string != null);
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z = false;
                    }
                    Preconditions.checkArgument(z);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[Start] [");
                    sb2.append(mediaCodecInfo.getName());
                    sb2.append("]");
                    logToString(sb, sb2.toString());
                    dumpCodecCapabilities(sb, capabilitiesForType, mediaFormat);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("[End] [");
                    sb3.append(mediaCodecInfo.getName());
                    sb3.append("]");
                    logToString(sb, sb3.toString());
                } catch (IllegalArgumentException unused) {
                    StringBuilder sb4 = new StringBuilder("[");
                    sb4.append(mediaCodecInfo.getName());
                    sb4.append("] does not support mime ");
                    sb4.append(string);
                    logToString(sb, sb4.toString());
                }
            }
        }
        logToString(sb, "[End] Dump MediaCodecList");
        String string2 = sb.toString();
        stringToLog(string2);
        return string2;
    }

    public static String dumpCodecCapabilities(String str, MediaCodec mediaCodec, MediaFormat mediaFormat) {
        StringBuilder sb = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            Preconditions.checkArgument(capabilitiesForType != null);
            dumpCodecCapabilities(sb, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(mediaCodec.getName());
            sb2.append("] does not support mime ");
            sb2.append(str);
            logToString(sb, sb2.toString());
        }
        return sb.toString();
    }

    private static void dumpCodecCapabilities(StringBuilder sb, MediaCodecInfo.CodecCapabilities codecCapabilities, MediaFormat mediaFormat) {
        try {
            StringBuilder sb2 = new StringBuilder("[CodecCaps] isFormatSupported = ");
            sb2.append(codecCapabilities.isFormatSupported(mediaFormat));
            logToString(sb, sb2.toString());
        } catch (ClassCastException unused) {
            logToString(sb, "[CodecCaps] isFormatSupported=false");
        }
        StringBuilder sb3 = new StringBuilder("[CodecCaps] getDefaultFormat = ");
        sb3.append(codecCapabilities.getDefaultFormat());
        logToString(sb, sb3.toString());
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb4 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(toString(codecProfileLevel));
            }
            sb4.append(TextUtils.join(", ", arrayList));
            sb4.append("]");
            logToString(sb, "[CodecCaps] profileLevels = ".concat(String.valueOf(sb4)));
        }
        if (codecCapabilities.colorFormats != null) {
            StringBuilder sb5 = new StringBuilder("[CodecCaps] colorFormats = ");
            sb5.append(Arrays.toString(codecCapabilities.colorFormats));
            logToString(sb, sb5.toString());
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            dumpVideoCapabilities(sb, videoCapabilities, mediaFormat);
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            dumpAudioCapabilities(sb, audioCapabilities, mediaFormat);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            dumpEncoderCapabilities(sb, encoderCapabilities, mediaFormat);
        }
    }

    private static void dumpVideoCapabilities(StringBuilder sb, MediaCodecInfo.VideoCapabilities videoCapabilities, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z;
        StringBuilder sb2 = new StringBuilder("[VideoCaps] getBitrateRange = ");
        sb2.append(videoCapabilities.getBitrateRange());
        logToString(sb, sb2.toString());
        StringBuilder sb3 = new StringBuilder("[VideoCaps] getSupportedWidths = ");
        sb3.append(videoCapabilities.getSupportedWidths());
        sb3.append(", getWidthAlignment = ");
        sb3.append(videoCapabilities.getWidthAlignment());
        logToString(sb, sb3.toString());
        StringBuilder sb4 = new StringBuilder("[VideoCaps] getSupportedHeights = ");
        sb4.append(videoCapabilities.getSupportedHeights());
        sb4.append(", getHeightAlignment = ");
        sb4.append(videoCapabilities.getHeightAlignment());
        logToString(sb, sb4.toString());
        boolean z2 = true;
        int i = 0;
        try {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
            Preconditions.checkArgument(integer > 0 && integer2 > 0);
            z = true;
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb, "[VideoCaps] mediaFormat does not contain valid width and height");
            integer = 0;
            integer2 = 0;
            z = false;
        }
        if (z) {
            try {
                StringBuilder sb5 = new StringBuilder("[VideoCaps] getSupportedHeightsFor ");
                sb5.append(integer);
                sb5.append(" = ");
                sb5.append(videoCapabilities.getSupportedHeightsFor(integer));
                logToString(sb, sb5.toString());
            } catch (IllegalArgumentException unused2) {
                logToString(sb, "[VideoCaps] could not getSupportedHeightsFor ".concat(String.valueOf(integer)));
            }
            try {
                StringBuilder sb6 = new StringBuilder("[VideoCaps] getSupportedWidthsFor ");
                sb6.append(integer2);
                sb6.append(" = ");
                sb6.append(videoCapabilities.getSupportedWidthsFor(integer2));
                logToString(sb, sb6.toString());
            } catch (IllegalArgumentException unused3) {
                logToString(sb, "[VideoCaps] could not getSupportedWidthsFor ".concat(String.valueOf(integer2)));
            }
            StringBuilder sb7 = new StringBuilder("[VideoCaps] isSizeSupported for ");
            sb7.append(integer);
            sb7.append("x");
            sb7.append(integer2);
            sb7.append(" = ");
            sb7.append(videoCapabilities.isSizeSupported(integer, integer2));
            logToString(sb, sb7.toString());
        }
        StringBuilder sb8 = new StringBuilder("[VideoCaps] getSupportedFrameRates = ");
        sb8.append(videoCapabilities.getSupportedFrameRates());
        logToString(sb, sb8.toString());
        try {
            int integer3 = mediaFormat.getInteger("frame-rate");
            if (integer3 <= 0) {
                z2 = false;
            }
            Preconditions.checkArgument(z2);
            i = integer3;
        } catch (IllegalArgumentException | NullPointerException unused4) {
            logToString(sb, "[VideoCaps] mediaFormat does not contain frame rate");
        }
        if (z) {
            StringBuilder sb9 = new StringBuilder("[VideoCaps] getSupportedFrameRatesFor ");
            sb9.append(integer);
            sb9.append("x");
            sb9.append(integer2);
            sb9.append(" = ");
            sb9.append(videoCapabilities.getSupportedFrameRatesFor(integer, integer2));
            logToString(sb, sb9.toString());
        }
        if (!z || i <= 0) {
            return;
        }
        StringBuilder sb10 = new StringBuilder("[VideoCaps] areSizeAndRateSupported for ");
        sb10.append(integer);
        sb10.append("x");
        sb10.append(integer2);
        sb10.append(", ");
        sb10.append(i);
        sb10.append(" = ");
        sb10.append(videoCapabilities.areSizeAndRateSupported(integer, integer2, i));
        logToString(sb, sb10.toString());
    }

    private static void dumpAudioCapabilities(StringBuilder sb, MediaCodecInfo.AudioCapabilities audioCapabilities, MediaFormat mediaFormat) {
        StringBuilder sb2 = new StringBuilder("[AudioCaps] getBitrateRange = ");
        sb2.append(audioCapabilities.getBitrateRange());
        logToString(sb, sb2.toString());
        StringBuilder sb3 = new StringBuilder("[AudioCaps] getMaxInputChannelCount = ");
        sb3.append(audioCapabilities.getMaxInputChannelCount());
        logToString(sb, sb3.toString());
        if (Build.VERSION.SDK_INT >= 31) {
            StringBuilder sb4 = new StringBuilder("[AudioCaps] getMinInputChannelCount = ");
            sb4.append(Api31Impl.getMinInputChannelCount(audioCapabilities));
            logToString(sb, sb4.toString());
            StringBuilder sb5 = new StringBuilder("[AudioCaps] getInputChannelCountRanges = ");
            sb5.append(Arrays.toString(Api31Impl.getInputChannelCountRanges(audioCapabilities)));
            logToString(sb, sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder("[AudioCaps] getSupportedSampleRateRanges = ");
        sb6.append(Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        logToString(sb, sb6.toString());
        StringBuilder sb7 = new StringBuilder("[AudioCaps] getSupportedSampleRates = ");
        sb7.append(Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        logToString(sb, sb7.toString());
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            StringBuilder sb8 = new StringBuilder("[AudioCaps] isSampleRateSupported for ");
            sb8.append(integer);
            sb8.append(" = ");
            sb8.append(audioCapabilities.isSampleRateSupported(integer));
            logToString(sb, sb8.toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb, "[AudioCaps] mediaFormat does not contain sample rate");
        }
    }

    private static void dumpEncoderCapabilities(StringBuilder sb, MediaCodecInfo.EncoderCapabilities encoderCapabilities, MediaFormat mediaFormat) {
        StringBuilder sb2 = new StringBuilder("[EncoderCaps] getComplexityRange = ");
        sb2.append(encoderCapabilities.getComplexityRange());
        logToString(sb, sb2.toString());
        if (Build.VERSION.SDK_INT >= 28) {
            StringBuilder sb3 = new StringBuilder("[EncoderCaps] getQualityRange = ");
            sb3.append(Api28Impl.getQualityRange(encoderCapabilities));
            logToString(sb, sb3.toString());
        }
        try {
            int integer = mediaFormat.getInteger("bitrate-mode");
            StringBuilder sb4 = new StringBuilder("[EncoderCaps] isBitrateModeSupported = ");
            sb4.append(encoderCapabilities.isBitrateModeSupported(integer));
            logToString(sb, sb4.toString());
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb, "[EncoderCaps] mediaFormat does not contain bitrate mode");
        }
    }

    private static void logToString(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("\n");
    }

    private static void stringToLog(String str) {
        if (Logger.isInfoEnabled(TAG)) {
            Scanner scanner = new Scanner(str);
            while (scanner.hasNextLine()) {
                Logger.i(TAG, scanner.nextLine());
            }
        }
    }

    private static String toString(MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        if (codecProfileLevel == null) {
            return "null";
        }
        return String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile));
    }
}
