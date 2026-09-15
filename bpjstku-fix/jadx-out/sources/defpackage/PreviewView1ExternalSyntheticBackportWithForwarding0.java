package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
final class PreviewView1ExternalSyntheticBackportWithForwarding0 extends getOutputTransform {
    private final PreviewStreamStateObserverExternalSyntheticLambda2 TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewView1ExternalSyntheticBackportWithForwarding0(PreviewStreamStateObserver2 previewStreamStateObserver2, PreviewStreamStateObserverExternalSyntheticLambda2 previewStreamStateObserverExternalSyntheticLambda2) {
        super(previewStreamStateObserver2, previewStreamStateObserverExternalSyntheticLambda2, null, 4, null);
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(previewStreamStateObserverExternalSyntheticLambda2, "");
        this.TuitionPaymentFragmentbindingInflater1 = previewStreamStateObserverExternalSyntheticLambda2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = previewStreamStateObserverExternalSyntheticLambda2.size();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1;
    }

    @Override // defpackage.setImageCaptureTargetSize
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(createImageAnalysis createimageanalysis, int i) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        return String.valueOf(i);
    }

    @Override // defpackage.setActiveRecording
    public final int decodeElementIndex(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2;
        return i2;
    }

    @Override // defpackage.getOutputTransform
    protected final isTransformationInfoReady TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        PreviewStreamStateObserverExternalSyntheticLambda2 previewStreamStateObserverExternalSyntheticLambda2 = this.TuitionPaymentFragmentbindingInflater1;
        return previewStreamStateObserverExternalSyntheticLambda2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(Integer.parseInt(str));
    }

    @Override // defpackage.getOutputTransform
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ isTransformationInfoReady getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }
}
