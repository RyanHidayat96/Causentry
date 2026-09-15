package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B%\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00028\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H$¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00028\u00022\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0005X\u0085\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0005X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\t\u001a\u00028\u0000*\u00028\u00028%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016R\u0018\u0010\u0017\u001a\u00028\u0001*\u00028\u00028%X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016\u0082\u0001\u0002\u0018\u0019"}, d2 = {"LsetCameraSelector;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "R", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "p0", "p1", "<init>", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;LvideoProfileHdrFormatsToDynamicRangeEncoding;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "LstartListeningToRotationEvents;", "", "serialize", "(LstartListeningToRotationEvents;Ljava/lang/Object;)V", "LstopListeningToRotationEvents;", "deserialize", "(LstopListeningToRotationEvents;)Ljava/lang/Object;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LsetImageAnalysisResolutionSelector;", "LsetVideoCaptureMirrorMode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class setCameraSelector<K, V, R> implements videoProfileHdrFormatsToDynamicRangeEncoding<R> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final videoProfileHdrFormatsToDynamicRangeEncoding<K> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final videoProfileHdrFormatsToDynamicRangeEncoding<V> b;

    protected abstract K TuitionPaymentFragmentbindingInflater1(R r);

    protected abstract R TuitionPaymentFragmentspecialinlinedviewModeldefault1(K p0, V p1);

    protected abstract V TuitionPaymentFragmentspecialinlinedviewModeldefault2(R r);

    private setCameraSelector(videoProfileHdrFormatsToDynamicRangeEncoding<K> videoprofilehdrformatstodynamicrangeencoding, videoProfileHdrFormatsToDynamicRangeEncoding<V> videoprofilehdrformatstodynamicrangeencoding2) {
        this.TuitionPaymentFragmentbindingInflater1 = videoprofilehdrformatstodynamicrangeencoding;
        this.b = videoprofilehdrformatstodynamicrangeencoding2;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public void serialize(startListeningToRotationEvents p0, R p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        isUseCaseEnabled isusecaseenabledBeginStructure = p0.beginStructure(getDescriptor());
        isusecaseenabledBeginStructure.encodeSerializableElement(getDescriptor(), 0, this.TuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1(p1));
        isusecaseenabledBeginStructure.encodeSerializableElement(getDescriptor(), 1, this.b, TuitionPaymentFragmentspecialinlinedviewModeldefault2(p1));
        isusecaseenabledBeginStructure.endStructure(getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.isBitDepthMatched
    public R deserialize(stopListeningToRotationEvents p0) {
        R r;
        Intrinsics.checkNotNullParameter(p0, "");
        createImageAnalysis descriptor = getDescriptor();
        setActiveRecording setactiverecordingBeginStructure = p0.beginStructure(descriptor);
        if (!setactiverecordingBeginStructure.decodeSequentially()) {
            Object objDecodeSerializableElement = propagateIfHasValue.b;
            Object objDecodeSerializableElement2 = propagateIfHasValue.b;
            while (true) {
                int iDecodeElementIndex = setactiverecordingBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objDecodeSerializableElement != propagateIfHasValue.b) {
                        if (objDecodeSerializableElement2 == propagateIfHasValue.b) {
                            throw new SerializationException("Element 'value' is missing");
                        }
                        r = (R) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objDecodeSerializableElement, objDecodeSerializableElement2);
                        break;
                    }
                    throw new SerializationException("Element 'key' is missing");
                }
                if (iDecodeElementIndex == 0) {
                    objDecodeSerializableElement = setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 0, this.TuitionPaymentFragmentbindingInflater1, null);
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new SerializationException("Invalid index: ".concat(String.valueOf(iDecodeElementIndex)));
                    }
                    objDecodeSerializableElement2 = setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 1, this.b, null);
                }
            }
        } else {
            r = (R) TuitionPaymentFragmentspecialinlinedviewModeldefault1(setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 0, this.TuitionPaymentFragmentbindingInflater1, null), setactiverecordingBeginStructure.decodeSerializableElement(getDescriptor(), 1, this.b, null));
        }
        setactiverecordingBeginStructure.endStructure(descriptor);
        return r;
    }

    public /* synthetic */ setCameraSelector(videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding, videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencoding2, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoprofilehdrformatstodynamicrangeencoding, videoprofilehdrformatstodynamicrangeencoding2);
    }
}
