package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class setImageAnalysisAnalyzer<K, V> extends setImageCaptureIoExecutor<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    private final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap(map) : linkedHashMap;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        return linkedHashMap;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        return linkedHashMap.size() * 2;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Iterator TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "");
        return map.entrySet().iterator();
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, int i) {
        Intrinsics.checkNotNullParameter((LinkedHashMap) obj, "");
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "");
        return map.size();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setImageAnalysisAnalyzer(videoProfileHdrFormatsToDynamicRangeEncoding<K> videoprofilehdrformatstodynamicrangeencoding, videoProfileHdrFormatsToDynamicRangeEncoding<V> videoprofilehdrformatstodynamicrangeencoding2) {
        super(videoprofilehdrformatstodynamicrangeencoding, videoprofilehdrformatstodynamicrangeencoding2, null);
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new onPinchToZoom(videoprofilehdrformatstodynamicrangeencoding.getDescriptor(), videoprofilehdrformatstodynamicrangeencoding2.getDescriptor());
    }

    @Override // defpackage.setImageCaptureIoExecutor, defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new LinkedHashMap();
    }
}
