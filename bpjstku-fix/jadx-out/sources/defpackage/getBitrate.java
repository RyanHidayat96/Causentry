package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class getBitrate implements getSurfaceConfig<getExpectedFrameRateRange> {
    private final ExtraSupportedResolutionQuirk<AutoValue_StreamSpec1> TuitionPaymentFragmentbindingInflater1;
    private final ExtraSupportedResolutionQuirk<Context> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ExtraSupportedResolutionQuirk<CameraConfigs> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final ExtraSupportedResolutionQuirk<SchedulerConfig> b;

    public getBitrate(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<AutoValue_StreamSpec1> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<SchedulerConfig> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<CameraConfigs> extraSupportedResolutionQuirk4) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = extraSupportedResolutionQuirk;
        this.TuitionPaymentFragmentbindingInflater1 = extraSupportedResolutionQuirk2;
        this.b = extraSupportedResolutionQuirk3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = extraSupportedResolutionQuirk4;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final /* bridge */ /* synthetic */ Object get() {
        Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
        AutoValue_StreamSpec1 autoValue_StreamSpec1 = this.TuitionPaymentFragmentbindingInflater1.get();
        SchedulerConfig schedulerConfig = this.b.get();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
        return new AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(context, autoValue_StreamSpec1, schedulerConfig);
    }
}
