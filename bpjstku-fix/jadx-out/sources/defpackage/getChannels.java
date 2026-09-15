package defpackage;

import androidx.compose.material3.CalendarModelKt;
import androidx.work.WorkRequest;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class getChannels implements getSurfaceConfig<SchedulerConfig> {
    private final ExtraSupportedResolutionQuirk<CameraConfigs> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public getChannels(ExtraSupportedResolutionQuirk<CameraConfigs> extraSupportedResolutionQuirk) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = extraSupportedResolutionQuirk;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final /* bridge */ /* synthetic */ Object get() {
        CameraConfigs cameraConfigs = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
        SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Priority priority = Priority.DEFAULT;
        getDefaultDurationSeconds.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new getDefaultDurationSeconds.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Set<SchedulerConfig.Flag> setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setEmptySet;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(priority, tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).TuitionPaymentFragmentbindingInflater1().b());
        Priority priority2 = Priority.HIGHEST;
        getDefaultDurationSeconds.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = new getDefaultDurationSeconds.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Set<SchedulerConfig.Flag> setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setEmptySet2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(priority2, tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1000L).TuitionPaymentFragmentbindingInflater1().b());
        Priority priority3 = Priority.VERY_LOW;
        getDefaultDurationSeconds.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = new getDefaultDurationSeconds.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Set<SchedulerConfig.Flag> setEmptySet3 = Collections.emptySet();
        if (setEmptySet3 == null) {
            throw new NullPointerException("Null flags");
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setEmptySet3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(priority3, tuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CalendarModelKt.MillisecondsIn24Hours).TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault3(Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.DEVICE_IDLE)))).b());
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraConfigs;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        Map<Priority, SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2> map = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashMap();
        return new getAudioProfiles(tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, map);
    }
}
