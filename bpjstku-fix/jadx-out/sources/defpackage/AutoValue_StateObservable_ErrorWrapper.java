package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoValue_StateObservable_ErrorWrapper implements getSurfaceConfig<getSharedSurfaces> {
    private final ExtraSupportedResolutionQuirk<CameraConfigProviderExternalSyntheticLambda0> TuitionPaymentFragmentbindingInflater1;
    private final ExtraSupportedResolutionQuirk<AutoValue_StreamSpec1> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ExtraSupportedResolutionQuirk<getExpectedFrameRateRange> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ExtraSupportedResolutionQuirk<Executor> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AutoValue_StateObservable_ErrorWrapper(ExtraSupportedResolutionQuirk<Executor> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<AutoValue_StreamSpec1> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<getExpectedFrameRateRange> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<CameraConfigProviderExternalSyntheticLambda0> extraSupportedResolutionQuirk4) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = extraSupportedResolutionQuirk;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = extraSupportedResolutionQuirk2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = extraSupportedResolutionQuirk3;
        this.TuitionPaymentFragmentbindingInflater1 = extraSupportedResolutionQuirk4;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final /* bridge */ /* synthetic */ Object get() {
        return new getSharedSurfaces(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(), this.TuitionPaymentFragmentbindingInflater1.get());
    }
}
