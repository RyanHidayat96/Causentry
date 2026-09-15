package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class QualitySelector {
    private static final String TAG = "QualitySelector";
    private final FallbackStrategy mFallbackStrategy;
    private final List<Quality> mPreferredQualityList;

    @Deprecated
    public static List<Quality> getSupportedQualities(CameraInfo cameraInfo) {
        return Recorder.getVideoCapabilities(cameraInfo).getSupportedQualities(DynamicRange.SDR);
    }

    @Deprecated
    public static boolean isQualitySupported(CameraInfo cameraInfo, Quality quality) {
        return Recorder.getVideoCapabilities(cameraInfo).isQualitySupported(quality, DynamicRange.SDR);
    }

    public static Size getResolution(CameraInfo cameraInfo, Quality quality) {
        checkQualityConstantsOrThrow(quality);
        VideoValidatedEncoderProfilesProxy profiles = Recorder.getVideoCapabilities(cameraInfo).getProfiles(quality, DynamicRange.SDR);
        if (profiles != null) {
            return getProfileVideoSize(profiles);
        }
        return null;
    }

    public static Map<Quality, Size> getQualityToResolutionMap(VideoCapabilities videoCapabilities, DynamicRange dynamicRange) {
        HashMap map = new HashMap();
        for (Quality quality : videoCapabilities.getSupportedQualities(dynamicRange)) {
            map.put(quality, getProfileVideoSize((VideoValidatedEncoderProfilesProxy) Objects.requireNonNull(videoCapabilities.getProfiles(quality, dynamicRange))));
        }
        return map;
    }

    QualitySelector(List<Quality> list, FallbackStrategy fallbackStrategy) {
        Preconditions.checkArgument((list.isEmpty() && fallbackStrategy == FallbackStrategy.NONE) ? false : true, "No preferred quality and fallback strategy.");
        this.mPreferredQualityList = Collections.unmodifiableList(new ArrayList(list));
        this.mFallbackStrategy = fallbackStrategy;
    }

    public static QualitySelector from(Quality quality) {
        return from(quality, FallbackStrategy.NONE);
    }

    public static QualitySelector from(Quality quality, FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(quality, "quality cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        checkQualityConstantsOrThrow(quality);
        return new QualitySelector(Collections.singletonList(quality), fallbackStrategy);
    }

    public static QualitySelector fromOrderedList(List<Quality> list) {
        return fromOrderedList(list, FallbackStrategy.NONE);
    }

    public static QualitySelector fromOrderedList(List<Quality> list, FallbackStrategy fallbackStrategy) {
        Preconditions.checkNotNull(list, "qualities cannot be null");
        Preconditions.checkNotNull(fallbackStrategy, "fallbackStrategy cannot be null");
        Preconditions.checkArgument(!list.isEmpty(), "qualities cannot be empty");
        checkQualityConstantsOrThrow(list);
        return new QualitySelector(list, fallbackStrategy);
    }

    final List<Quality> getPrioritizedQualities(List<Quality> list) {
        if (list.isEmpty()) {
            Logger.w(TAG, "No supported quality on the device.");
            return new ArrayList();
        }
        Logger.d(TAG, "supportedQualities = ".concat(String.valueOf(list)));
        Set<Quality> linkedHashSet = new LinkedHashSet<>();
        for (Quality quality : this.mPreferredQualityList) {
            if (quality == Quality.HIGHEST) {
                linkedHashSet.addAll(list);
                break;
            }
            if (quality == Quality.LOWEST) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(quality)) {
                linkedHashSet.add(quality);
            } else {
                Logger.w(TAG, "quality is not supported and will be ignored: ".concat(String.valueOf(quality)));
            }
        }
        addByFallbackStrategy(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualitySelector{preferredQualities=");
        sb.append(this.mPreferredQualityList);
        sb.append(", fallbackStrategy=");
        sb.append(this.mFallbackStrategy);
        sb.append("}");
        return sb.toString();
    }

    private void addByFallbackStrategy(List<Quality> list, Set<Quality> set) {
        Quality fallbackQuality;
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Select quality by fallbackStrategy = ");
        sb.append(this.mFallbackStrategy);
        Logger.d(TAG, sb.toString());
        if (this.mFallbackStrategy != FallbackStrategy.NONE) {
            Preconditions.checkState(this.mFallbackStrategy instanceof FallbackStrategy.RuleStrategy, "Currently only support type RuleStrategy");
            FallbackStrategy.RuleStrategy ruleStrategy = (FallbackStrategy.RuleStrategy) this.mFallbackStrategy;
            List<Quality> sortedQualities = Quality.getSortedQualities();
            if (ruleStrategy.getFallbackQuality() == Quality.HIGHEST) {
                fallbackQuality = sortedQualities.get(0);
            } else if (ruleStrategy.getFallbackQuality() == Quality.LOWEST) {
                fallbackQuality = sortedQualities.get(sortedQualities.size() - 1);
            } else {
                fallbackQuality = ruleStrategy.getFallbackQuality();
            }
            int iIndexOf = sortedQualities.indexOf(fallbackQuality);
            Preconditions.checkState(iIndexOf != -1);
            ArrayList arrayList = new ArrayList();
            for (int i = iIndexOf - 1; i >= 0; i--) {
                Quality quality = sortedQualities.get(i);
                if (list.contains(quality)) {
                    arrayList.add(quality);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = iIndexOf + 1; i2 < sortedQualities.size(); i2++) {
                Quality quality2 = sortedQualities.get(i2);
                if (list.contains(quality2)) {
                    arrayList2.add(quality2);
                }
            }
            StringBuilder sb2 = new StringBuilder("sizeSortedQualities = ");
            sb2.append(sortedQualities);
            sb2.append(", fallback quality = ");
            sb2.append(fallbackQuality);
            sb2.append(", largerQualities = ");
            sb2.append(arrayList);
            sb2.append(", smallerQualities = ");
            sb2.append(arrayList2);
            Logger.d(TAG, sb2.toString());
            int fallbackRule = ruleStrategy.getFallbackRule();
            if (fallbackRule != 0) {
                if (fallbackRule == 1) {
                    set.addAll(arrayList);
                    set.addAll(arrayList2);
                    return;
                }
                if (fallbackRule == 2) {
                    set.addAll(arrayList);
                    return;
                }
                if (fallbackRule == 3) {
                    set.addAll(arrayList2);
                    set.addAll(arrayList);
                } else if (fallbackRule == 4) {
                    set.addAll(arrayList2);
                } else {
                    StringBuilder sb3 = new StringBuilder("Unhandled fallback strategy: ");
                    sb3.append(this.mFallbackStrategy);
                    throw new AssertionError(sb3.toString());
                }
            }
        }
    }

    private static Size getProfileVideoSize(VideoValidatedEncoderProfilesProxy videoValidatedEncoderProfilesProxy) {
        EncoderProfilesProxy.VideoProfileProxy defaultVideoProfile = videoValidatedEncoderProfilesProxy.getDefaultVideoProfile();
        return new Size(defaultVideoProfile.getWidth(), defaultVideoProfile.getHeight());
    }

    private static void checkQualityConstantsOrThrow(List<Quality> list) {
        for (Quality quality : list) {
            Preconditions.checkArgument(Quality.containsQuality(quality), "qualities contain invalid quality: ".concat(String.valueOf(quality)));
        }
    }

    private static void checkQualityConstantsOrThrow(Quality quality) {
        Preconditions.checkArgument(Quality.containsQuality(quality), "Invalid quality: ".concat(String.valueOf(quality)));
    }
}
