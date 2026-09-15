package defpackage;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class setVideoCaptureMirrorMode<K, V> extends setCameraSelector<K, V, Pair<? extends K, ? extends V>> {
    private final createImageAnalysis b;

    @Override // defpackage.setCameraSelector
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        Pair pair = (Pair) obj;
        Intrinsics.checkNotNullParameter(pair, "");
        return pair.getFirst();
    }

    @Override // defpackage.setCameraSelector
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        Pair pair = (Pair) obj;
        Intrinsics.checkNotNullParameter(pair, "");
        return pair.getSecond();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setVideoCaptureMirrorMode(final videoProfileHdrFormatsToDynamicRangeEncoding<K> videoprofilehdrformatstodynamicrangeencoding, final videoProfileHdrFormatsToDynamicRangeEncoding<V> videoprofilehdrformatstodynamicrangeencoding2) {
        super(videoprofilehdrformatstodynamicrangeencoding, videoprofilehdrformatstodynamicrangeencoding2, null);
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding2, "");
        this.b = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("kotlin.Pair", new createImageAnalysis[0], new Function1() { // from class: setVideoCaptureDynamicRange
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setVideoCaptureMirrorMode.TuitionPaymentFragmentbindingInflater1(videoprofilehdrformatstodynamicrangeencoding, videoprofilehdrformatstodynamicrangeencoding2, (calculateUptimeToRealtimeOffsetUs) obj);
            }
        });
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.b;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding, videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding2, calculateUptimeToRealtimeOffsetUs calculateuptimetorealtimeoffsetus) {
        Intrinsics.checkNotNullParameter(calculateuptimetorealtimeoffsetus, "");
        calculateuptimetorealtimeoffsetus.b("first", videoprofilehdrformatstodynamicrangeencoding.getDescriptor(), CollectionsKt.emptyList(), false);
        calculateuptimetorealtimeoffsetus.b("second", videoprofilehdrformatstodynamicrangeencoding2.getDescriptor(), CollectionsKt.emptyList(), false);
        return Unit.INSTANCE;
    }

    @Override // defpackage.setCameraSelector
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, Object obj2) {
        return TuplesKt.to(obj, obj2);
    }
}
