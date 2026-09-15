package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"LlambdaonSurfaceRequested0androidxcameraviewPreviewView1;", "LgetOutputTransform;", "LPreviewStreamStateObserver2;", "p0", "LisTransformationInfoReady;", "p1", "", "p2", "<init>", "(LPreviewStreamStateObserver2;LisTransformationInfoReady;Ljava/lang/String;)V", "LcreateImageAnalysis;", "", "decodeElementIndex", "(LcreateImageAnalysis;)I", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)LisTransformationInfoReady;", "LisTransformationInfoReady;", "g", "()LisTransformationInfoReady;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class lambdaonSurfaceRequested0androidxcameraviewPreviewView1 extends getOutputTransform {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final isTransformationInfoReady TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ lambdaonSurfaceRequested0androidxcameraviewPreviewView1(PreviewStreamStateObserver2 previewStreamStateObserver2, isTransformationInfoReady istransformationinfoready, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(previewStreamStateObserver2, istransformationinfoready, (i & 4) != 0 ? null : str);
    }

    @Override // defpackage.getOutputTransform
    /* JADX INFO: renamed from: g, reason: from getter */
    public final isTransformationInfoReady getTuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdaonSurfaceRequested0androidxcameraviewPreviewView1(PreviewStreamStateObserver2 previewStreamStateObserver2, isTransformationInfoReady istransformationinfoready, String str) {
        super(previewStreamStateObserver2, istransformationinfoready, str, null);
        Intrinsics.checkNotNullParameter(previewStreamStateObserver2, "");
        Intrinsics.checkNotNullParameter(istransformationinfoready, "");
        this.TuitionPaymentFragmentbindingInflater1 = istransformationinfoready;
        INotificationSideChannel("primitive");
    }

    @Override // defpackage.getOutputTransform
    protected final isTransformationInfoReady TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0 != "primitive") {
            throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag".toString());
        }
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.setActiveRecording
    public final int decodeElementIndex(createImageAnalysis p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return 0;
    }
}
