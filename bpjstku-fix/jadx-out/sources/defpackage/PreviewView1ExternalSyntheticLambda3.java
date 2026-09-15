package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
final class PreviewView1ExternalSyntheticLambda3 extends onSurfaceNotInUse {
    private int TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final List<String> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final getDisplayManager asBinder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewView1ExternalSyntheticLambda3(PreviewStreamStateObserver2 previewStreamStateObserver2, getDisplayManager getdisplaymanager) {
        super(previewStreamStateObserver2, getdisplaymanager, null, null, 12, null);
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(getdisplaymanager, "");
        this.asBinder = getdisplaymanager;
        List<String> list = CollectionsKt.toList(getdisplaymanager.keySet());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list.size() * 2;
        this.TuitionPaymentFragmentbindingInflater1 = -1;
    }

    @Override // defpackage.onSurfaceNotInUse
    /* JADX INFO: renamed from: asInterface */
    public final getDisplayManager g() {
        return this.asBinder;
    }

    @Override // defpackage.onSurfaceNotInUse, defpackage.setImageCaptureTargetSize
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(createImageAnalysis createimageanalysis, int i) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i / 2);
    }

    @Override // defpackage.onSurfaceNotInUse, defpackage.setActiveRecording
    public final int decodeElementIndex(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        int i = this.TuitionPaymentFragmentbindingInflater1;
        if (i >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.TuitionPaymentFragmentbindingInflater1 = i2;
        return i2;
    }

    @Override // defpackage.onSurfaceNotInUse, defpackage.getOutputTransform
    protected final isTransformationInfoReady TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (isTransformationInfoReady) (this.TuitionPaymentFragmentbindingInflater1 % 2 == 0 ? getRotatedViewportSize.b(str) : MapsKt.getValue(this.asBinder, str));
    }

    @Override // defpackage.onSurfaceNotInUse, defpackage.getOutputTransform
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ isTransformationInfoReady getTuitionPaymentFragmentbindingInflater1() {
        return this.asBinder;
    }

    @Override // defpackage.onSurfaceNotInUse, defpackage.getOutputTransform, defpackage.ForwardingLiveData, defpackage.setActiveRecording
    public final void endStructure(createImageAnalysis createimageanalysis) {
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
    }
}
