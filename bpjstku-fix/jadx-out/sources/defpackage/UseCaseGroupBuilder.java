package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class UseCaseGroupBuilder implements addEffect {
    private final SurfaceRequestExternalSyntheticLambda5 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public UseCaseGroupBuilder(SurfaceRequestExternalSyntheticLambda5 surfaceRequestExternalSyntheticLambda5) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = surfaceRequestExternalSyntheticLambda5;
    }

    @Override // defpackage.addEffect
    public final setViewPort TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new setViewPort(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime(), ViewPort.b());
    }
}
