package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class onTapToFocus<E> extends getImageAnalysisBackpressureStrategy<E, Set<? extends E>, LinkedHashSet<E>> {
    private final createImageAnalysis TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        Set set = (Set) obj;
        Intrinsics.checkNotNullParameter(set, "");
        LinkedHashSet linkedHashSet = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
        return linkedHashSet == null ? new LinkedHashSet(set) : linkedHashSet;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
        return linkedHashSet;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
        return linkedHashSet.size();
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, int i, Object obj2) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
        linkedHashSet.add(obj2);
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, int i) {
        Intrinsics.checkNotNullParameter((LinkedHashSet) obj, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onTapToFocus(videoProfileHdrFormatsToDynamicRangeEncoding<E> videoprofilehdrformatstodynamicrangeencoding) {
        super(videoprofilehdrformatstodynamicrangeencoding);
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        this.TuitionPaymentFragmentbindingInflater1 = new setEnabledUseCases(videoprofilehdrformatstodynamicrangeencoding.getDescriptor());
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new LinkedHashSet();
    }
}
