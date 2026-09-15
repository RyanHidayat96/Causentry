package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class unbindImageCaptureAndRecreate<E> extends getImageAnalysisBackpressureStrategy<E, List<? extends E>, ArrayList<E>> {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "");
        return arrayList;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "");
        return arrayList.size();
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.add(i, obj2);
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, int i) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.ensureCapacity(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unbindImageCaptureAndRecreate(videoProfileHdrFormatsToDynamicRangeEncoding<E> videoprofilehdrformatstodynamicrangeencoding) {
        super(videoprofilehdrformatstodynamicrangeencoding);
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new stopRecording(videoprofilehdrformatstodynamicrangeencoding.getDescriptor());
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new ArrayList();
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 9310658;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        TuitionPaymentFragmentbindingInflater1 = i3;
        return i3;
    }
}
