package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraControlInternal implements getSurfaceConfig<setCompatibilityId> {
    private final ExtraSupportedResolutionQuirk<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final ExtraSupportedResolutionQuirk<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ExtraSupportedResolutionQuirk<Context> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public CameraControlInternal(ExtraSupportedResolutionQuirk<Context> extraSupportedResolutionQuirk, ExtraSupportedResolutionQuirk<String> extraSupportedResolutionQuirk2, ExtraSupportedResolutionQuirk<Integer> extraSupportedResolutionQuirk3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = extraSupportedResolutionQuirk;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = extraSupportedResolutionQuirk2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = extraSupportedResolutionQuirk3;
    }

    @Override // defpackage.ExtraSupportedResolutionQuirk
    public final /* bridge */ /* synthetic */ Object get() {
        return new setCompatibilityId(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get().intValue());
    }
}
