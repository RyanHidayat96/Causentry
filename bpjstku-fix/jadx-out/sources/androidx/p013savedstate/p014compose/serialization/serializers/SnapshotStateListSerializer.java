package androidx.p013savedstate.p014compose.serialization.serializers;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.exifinterface.media.ExifInterface;
import defpackage.createImageAnalysis;
import defpackage.getViewportAspectRatioStrategy;
import defpackage.startListeningToRotationEvents;
import defpackage.stopListeningToRotationEvents;
import defpackage.unbindImageCaptureAndRecreate;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R \u0010\u0014\u001a\u00020\u00138\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/savedstate/compose/serialization/serializers/SnapshotStateListSerializer;", ExifInterface.GPS_DIRECTION_TRUE, "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "p0", "<init>", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;)V", "LstartListeningToRotationEvents;", "p1", "", "serialize", "(LstartListeningToRotationEvents;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "LstopListeningToRotationEvents;", "deserialize", "(LstopListeningToRotationEvents;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "elementSerializer", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "base", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "getDescriptor$annotations", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SnapshotStateListSerializer<T> implements videoProfileHdrFormatsToDynamicRangeEncoding<SnapshotStateList<T>> {
    private final videoProfileHdrFormatsToDynamicRangeEncoding<List<T>> base;
    private final createImageAnalysis descriptor;
    private final videoProfileHdrFormatsToDynamicRangeEncoding<T> elementSerializer;

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    public SnapshotStateListSerializer(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        this.elementSerializer = videoprofilehdrformatstodynamicrangeencoding;
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        unbindImageCaptureAndRecreate unbindimagecaptureandrecreate = new unbindImageCaptureAndRecreate(videoprofilehdrformatstodynamicrangeencoding);
        this.base = unbindimagecaptureandrecreate;
        this.descriptor = getViewportAspectRatioStrategy.TuitionPaymentFragmentspecialinlinedviewModeldefault1("androidx.compose.runtime.SnapshotStateList", unbindimagecaptureandrecreate.getDescriptor());
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, SnapshotStateList<T> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        p0.encodeSerializableValue(this.base, p1);
    }

    @Override // defpackage.isBitDepthMatched
    public final SnapshotStateList<T> deserialize(stopListeningToRotationEvents p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        List list = (List) p0.decodeSerializableValue(this.base);
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(CollectionsKt.toList(list));
        return snapshotStateList;
    }
}
