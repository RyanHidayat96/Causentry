package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LsetImageAnalysisOutputImageFormat;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "LonRotationChanged;", "", "LsetImageAnalysisImageQueueDepth;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setImageAnalysisOutputImageFormat extends onRotationChanged<Long, long[], setImageAnalysisImageQueueDepth> {
    public static final setImageAnalysisOutputImageFormat INSTANCE = new setImageAnalysisOutputImageFormat();

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.checkNotNullParameter(jArr, "");
        return new setImageAnalysisImageQueueDepth(jArr);
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUseCaseEnabled isusecaseenabled, long[] jArr, int i) {
        long[] jArr2 = jArr;
        Intrinsics.checkNotNullParameter(isusecaseenabled, "");
        Intrinsics.checkNotNullParameter(jArr2, "");
        for (int i2 = 0; i2 < i; i2++) {
            isusecaseenabled.encodeLongElement(getDescriptor(), i2, jArr2[i2]);
        }
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(setActiveRecording setactiverecording, int i, Object obj, boolean z) {
        setImageAnalysisImageQueueDepth setimageanalysisimagequeuedepth = (setImageAnalysisImageQueueDepth) obj;
        Intrinsics.checkNotNullParameter(setactiverecording, "");
        Intrinsics.checkNotNullParameter(setimageanalysisimagequeuedepth, "");
        long jDecodeLongElement = setactiverecording.decodeLongElement(getDescriptor(), i);
        setImageAnalysisImageQueueDepth setimageanalysisimagequeuedepth2 = setimageanalysisimagequeuedepth;
        setimageanalysisimagequeuedepth2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setimageanalysisimagequeuedepth2.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() + 1);
        long[] jArr = setimageanalysisimagequeuedepth.TuitionPaymentFragmentbindingInflater1;
        int i2 = setimageanalysisimagequeuedepth.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        setimageanalysisimagequeuedepth.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 + 1;
        jArr[i2] = jDecodeLongElement;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        long[] jArr = (long[]) obj;
        Intrinsics.checkNotNullParameter(jArr, "");
        return jArr.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private setImageAnalysisOutputImageFormat() {
        super(setImageAnalysisBackgroundExecutor.INSTANCE);
        Intrinsics.checkNotNullParameter(LongCompanionObject.INSTANCE, "");
    }

    @Override // defpackage.onRotationChanged
    public final /* synthetic */ long[] b() {
        return new long[0];
    }
}
