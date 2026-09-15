package androidx.p013savedstate.p014compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.exifinterface.media.ExifInterface;
import defpackage.createImageAnalysis;
import defpackage.getViewportAspectRatioStrategy;
import defpackage.setImageAnalysisAnalyzer;
import defpackage.startListeningToRotationEvents;
import defpackage.stopListeningToRotationEvents;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0005\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u00020\u00138\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/savedstate/compose/serialization/serializers/SnapshotStateMapSerializer;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "p0", "p1", "<init>", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;LvideoProfileHdrFormatsToDynamicRangeEncoding;)V", "LstartListeningToRotationEvents;", "", "serialize", "(LstartListeningToRotationEvents;Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "LstopListeningToRotationEvents;", "deserialize", "(LstopListeningToRotationEvents;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "base", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "getDescriptor$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotStateMapSerializer<K, V> implements videoProfileHdrFormatsToDynamicRangeEncoding<SnapshotStateMap<K, V>> {
    private final videoProfileHdrFormatsToDynamicRangeEncoding<Map<K, V>> base;
    private final createImageAnalysis descriptor;

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    public SnapshotStateMapSerializer(videoProfileHdrFormatsToDynamicRangeEncoding<K> videoprofilehdrformatstodynamicrangeencoding, videoProfileHdrFormatsToDynamicRangeEncoding<V> videoprofilehdrformatstodynamicrangeencoding2) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding2, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding2, "");
        setImageAnalysisAnalyzer setimageanalysisanalyzer = new setImageAnalysisAnalyzer(videoprofilehdrformatstodynamicrangeencoding, videoprofilehdrformatstodynamicrangeencoding2);
        this.base = setimageanalysisanalyzer;
        this.descriptor = getViewportAspectRatioStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault1("androidx.compose.runtime.SnapshotStateMap", setimageanalysisanalyzer.getDescriptor());
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, SnapshotStateMap<K, V> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        p0.encodeSerializableValue(this.base, p1);
    }

    @Override // defpackage.isBitDepthMatched
    public final SnapshotStateMap<K, V> deserialize(stopListeningToRotationEvents p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Map<? extends K, ? extends V> map = (Map) p0.decodeSerializableValue(this.base);
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(map);
        return snapshotStateMap;
    }
}
