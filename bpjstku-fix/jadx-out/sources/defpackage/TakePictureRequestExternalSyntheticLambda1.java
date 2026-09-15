package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class TakePictureRequestExternalSyntheticLambda1 implements getSurfaceConfig<TakePictureRequestExternalSyntheticLambda2> {
    private final ExtraSupportedResolutionQuirk<CameraConfigs> TuitionPaymentFragmentbindingInflater1;
    private final ExtraSupportedResolutionQuirk<CameraConfigs> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ExtraSupportedResolutionQuirk<Context> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public TakePictureRequestExternalSyntheticLambda1(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<CameraConfigs> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<CameraConfigs> extraSupportedResolutionQuirk3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = extraSupportedResolutionQuirk;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = extraSupportedResolutionQuirk2;
        this.TuitionPaymentFragmentbindingInflater1 = extraSupportedResolutionQuirk3;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final /* bridge */ /* synthetic */ Object get() {
        return new TakePictureRequestExternalSyntheticLambda2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(), this.TuitionPaymentFragmentbindingInflater1.get());
    }
}
