package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class setImageAnalysisResolutionSelector<K, V> extends setCameraSelector<K, V, Map.Entry<? extends K, ? extends V>> {
    private final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.setCameraSelector
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "");
        return entry.getKey();
    }

    @Override // defpackage.setCameraSelector
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "");
        return entry.getValue();
    }

    static final class TuitionPaymentFragmentbindingInflater1<K, V> implements Map.Entry<K, V>, KMappedMarker {
        private final K TuitionPaymentFragmentbindingInflater1;
        private final V b;

        public TuitionPaymentFragmentbindingInflater1(K k, V v) {
            this.TuitionPaymentFragmentbindingInflater1 = k;
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentbindingInflater1.b);
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.TuitionPaymentFragmentbindingInflater1;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.b;
            return (iHashCode * 31) + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MapEntry(key=");
            sb.append(this.TuitionPaymentFragmentbindingInflater1);
            sb.append(", value=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setImageAnalysisResolutionSelector(final videoProfileHdrFormatsToDynamicRangeEncoding<K> videoprofilehdrformatstodynamicrangeencoding, final videoProfileHdrFormatsToDynamicRangeEncoding<V> videoprofilehdrformatstodynamicrangeencoding2) {
        super(videoprofilehdrformatstodynamicrangeencoding, videoprofilehdrformatstodynamicrangeencoding2, null);
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getViewportAspectRatioStrategy.TuitionPaymentFragmentbindingInflater1("kotlin.collections.Map.Entry", isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE, new createImageAnalysis[0], new Function1() { // from class: setImageCaptureResolutionSelector
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setImageAnalysisResolutionSelector.TuitionPaymentFragmentbindingInflater1(videoprofilehdrformatstodynamicrangeencoding, videoprofilehdrformatstodynamicrangeencoding2, (calculateUptimeToRealtimeOffsetUs) obj);
            }
        });
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding, videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding2, calculateUptimeToRealtimeOffsetUs calculateuptimetorealtimeoffsetus) {
        Intrinsics.checkNotNullParameter(calculateuptimetorealtimeoffsetus, "");
        calculateuptimetorealtimeoffsetus.b("key", videoprofilehdrformatstodynamicrangeencoding.getDescriptor(), CollectionsKt.emptyList(), false);
        calculateuptimetorealtimeoffsetus.b("value", videoprofilehdrformatstodynamicrangeencoding2.getDescriptor(), CollectionsKt.emptyList(), false);
        return Unit.INSTANCE;
    }

    @Override // defpackage.setCameraSelector
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, Object obj2) {
        return new TuitionPaymentFragmentbindingInflater1(obj, obj2);
    }
}
