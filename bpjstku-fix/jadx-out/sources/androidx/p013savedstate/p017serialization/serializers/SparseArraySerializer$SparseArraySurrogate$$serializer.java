package androidx.p013savedstate.p017serialization.serializers;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.CameraControllerExternalSyntheticLambda3;
import defpackage.createImageAnalysis;
import defpackage.getVideoCaptureDynamicRange;
import defpackage.isBitDepthMatched;
import defpackage.isUseCaseEnabled;
import defpackage.setActiveRecording;
import defpackage.startListeningToRotationEvents;
import defpackage.stopListeningToRotationEvents;
import defpackage.unbindImageCaptureAndRecreate;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\u0007\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tH\u0007¢\u0006\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$$serializer;", ExifInterface.GPS_DIRECTION_TRUE, "LgetVideoCaptureDynamicRange;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "<init>", "()V", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "p0", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;)V", "", "childSerializers", "()[LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LstopListeningToRotationEvents;", "deserialize", "(LstopListeningToRotationEvents;)Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "LstartListeningToRotationEvents;", "p1", "", "serialize", "(LstartListeningToRotationEvents;Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;)V", "typeParametersSerializers", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class SparseArraySerializer$SparseArraySurrogate$$serializer<T> implements getVideoCaptureDynamicRange<SparseArraySerializer.SparseArraySurrogate<T>> {
    private final createImageAnalysis descriptor;
    private final /* synthetic */ videoProfileHdrFormatsToDynamicRangeEncoding<?> typeSerial0;

    private SparseArraySerializer$SparseArraySurrogate$$serializer() {
        CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3 = new CameraControllerExternalSyntheticLambda3("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(UserMetadata.KEYDATA_FILENAME, false);
        cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("values", false);
        this.descriptor = cameraControllerExternalSyntheticLambda3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SparseArraySerializer$SparseArraySurrogate$$serializer(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding) {
        this();
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        this.typeSerial0 = videoprofilehdrformatstodynamicrangeencoding;
    }

    private final /* synthetic */ videoProfileHdrFormatsToDynamicRangeEncoding getTypeSerial0() {
        return this.typeSerial0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] childSerializers() {
        return new videoProfileHdrFormatsToDynamicRangeEncoding[]{SparseArraySerializer.SparseArraySurrogate.$childSerializers[0].getValue(), new unbindImageCaptureAndRecreate(this.typeSerial0)};
    }

    @Override // defpackage.isBitDepthMatched
    public final SparseArraySerializer.SparseArraySurrogate<T> deserialize(stopListeningToRotationEvents p0) {
        List list;
        List list2;
        int i;
        Intrinsics.checkNotNullParameter(p0, "");
        createImageAnalysis createimageanalysis = this.descriptor;
        setActiveRecording setactiverecordingBeginStructure = p0.beginStructure(createimageanalysis);
        Lazy[] lazyArr = SparseArraySerializer.SparseArraySurrogate.$childSerializers;
        if (setactiverecordingBeginStructure.decodeSequentially()) {
            list = (List) setactiverecordingBeginStructure.decodeSerializableElement(createimageanalysis, 0, (isBitDepthMatched) lazyArr[0].getValue(), null);
            list2 = (List) setactiverecordingBeginStructure.decodeSerializableElement(createimageanalysis, 1, new unbindImageCaptureAndRecreate(this.typeSerial0), null);
            i = 3;
        } else {
            List list3 = null;
            List list4 = null;
            boolean z = true;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = setactiverecordingBeginStructure.decodeElementIndex(createimageanalysis);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list3 = (List) setactiverecordingBeginStructure.decodeSerializableElement(createimageanalysis, 0, (isBitDepthMatched) lazyArr[0].getValue(), list3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list4 = (List) setactiverecordingBeginStructure.decodeSerializableElement(createimageanalysis, 1, new unbindImageCaptureAndRecreate(this.typeSerial0), list4);
                    i2 |= 2;
                }
            }
            list = list3;
            list2 = list4;
            i = i2;
        }
        setactiverecordingBeginStructure.endStructure(createimageanalysis);
        return new SparseArraySerializer.SparseArraySurrogate<>(i, list, list2, null);
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, SparseArraySerializer.SparseArraySurrogate<T> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        createImageAnalysis createimageanalysis = this.descriptor;
        isUseCaseEnabled isusecaseenabledBeginStructure = p0.beginStructure(createimageanalysis);
        SparseArraySerializer.SparseArraySurrogate.write$Self$savedstate_release(p1, isusecaseenabledBeginStructure, createimageanalysis, this.typeSerial0);
        isusecaseenabledBeginStructure.endStructure(createimageanalysis);
    }

    @Override // defpackage.getVideoCaptureDynamicRange
    public final videoProfileHdrFormatsToDynamicRangeEncoding<?>[] typeParametersSerializers() {
        return new videoProfileHdrFormatsToDynamicRangeEncoding[]{this.typeSerial0};
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.descriptor;
    }
}
