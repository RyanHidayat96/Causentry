package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class getUseCaseConfigFactory implements getSurfaceConfig<getConfigType> {
    private final ExtraSupportedResolutionQuirk<CameraConfigs> TuitionPaymentFragmentbindingInflater1;
    private final ExtraSupportedResolutionQuirk<setCompatibilityId> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ExtraSupportedResolutionQuirk<CameraConfigs> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ExtraSupportedResolutionQuirk<String> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final ExtraSupportedResolutionQuirk<setExpectedFrameRateRange> b;

    public getUseCaseConfigFactory(ExtraSupportedResolutionQuirk<CameraConfigs> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<CameraConfigs> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<setExpectedFrameRateRange> extraSupportedResolutionQuirk3, ExtraSupportedResolutionQuirk<setCompatibilityId> extraSupportedResolutionQuirk4, ExtraSupportedResolutionQuirk<String> extraSupportedResolutionQuirk5) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = extraSupportedResolutionQuirk;
        this.TuitionPaymentFragmentbindingInflater1 = extraSupportedResolutionQuirk2;
        this.b = extraSupportedResolutionQuirk3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = extraSupportedResolutionQuirk4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = extraSupportedResolutionQuirk5;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final /* bridge */ /* synthetic */ Object get() {
        CameraConfigs cameraConfigs = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
        CameraConfigs cameraConfigs2 = this.TuitionPaymentFragmentbindingInflater1.get();
        setExpectedFrameRateRange setexpectedframeraterange = this.b.get();
        return new getConfigType(cameraConfigs, cameraConfigs2, setexpectedframeraterange, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }
}
