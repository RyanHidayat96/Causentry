package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class isImageCaptureEnabled<K, V> extends setImageCaptureIoExecutor<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    private final createImageAnalysis TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = map instanceof HashMap ? (HashMap) map : null;
        return map2 == null ? new HashMap(map) : map2;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        HashMap map = (HashMap) obj;
        Intrinsics.checkNotNullParameter(map, "");
        return map;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        HashMap map = (HashMap) obj;
        Intrinsics.checkNotNullParameter(map, "");
        return map.size() * 2;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Iterator TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "");
        return map.entrySet().iterator();
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, int i) {
        Intrinsics.checkNotNullParameter((HashMap) obj, "");
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "");
        return map.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isImageCaptureEnabled(videoProfileHdrFormatsToDynamicRangeEncoding<K> videoprofilehdrformatstodynamicrangeencoding, videoProfileHdrFormatsToDynamicRangeEncoding<V> videoprofilehdrformatstodynamicrangeencoding2) {
        super(videoprofilehdrformatstodynamicrangeencoding, videoprofilehdrformatstodynamicrangeencoding2, null);
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding2, "");
        this.TuitionPaymentFragmentbindingInflater1 = new isTapToFocusEnabled(videoprofilehdrformatstodynamicrangeencoding.getDescriptor(), videoprofilehdrformatstodynamicrangeencoding2.getDescriptor());
    }

    @Override // defpackage.setImageCaptureIoExecutor, defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new HashMap();
    }
}
