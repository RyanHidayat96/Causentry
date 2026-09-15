package androidx.p013savedstate.p017serialization.serializers;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.CameraController1;
import defpackage.CameraControllerExternalSyntheticLambda3;
import defpackage.CorrectNegativeLatLongForMediaMuxer;
import defpackage.createImageAnalysis;
import defpackage.isUseCaseEnabled;
import defpackage.lambdanew1androidxcameraviewCameraController;
import defpackage.startCamera;
import defpackage.startListeningToRotationEvents;
import defpackage.stopListeningToRotationEvents;
import defpackage.unbindImageCaptureAndRecreate;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\u0017B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0004\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer;", ExifInterface.GPS_DIRECTION_TRUE, "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "Landroid/util/SparseArray;", "p0", "<init>", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;)V", "LstartListeningToRotationEvents;", "p1", "", "serialize", "(LstartListeningToRotationEvents;Landroid/util/SparseArray;)V", "LstopListeningToRotationEvents;", "deserialize", "(LstopListeningToRotationEvents;)Landroid/util/SparseArray;", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "surrogateSerializer", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "LcreateImageAnalysis;", "descriptor", "LcreateImageAnalysis;", "getDescriptor", "()LcreateImageAnalysis;", "SparseArraySurrogate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SparseArraySerializer<T> implements videoProfileHdrFormatsToDynamicRangeEncoding<SparseArray<T>> {
    private final createImageAnalysis descriptor;
    private final videoProfileHdrFormatsToDynamicRangeEncoding<SparseArraySurrogate<T>> surrogateSerializer;

    public SparseArraySerializer(videoProfileHdrFormatsToDynamicRangeEncoding<T> videoprofilehdrformatstodynamicrangeencoding) {
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        videoProfileHdrFormatsToDynamicRangeEncoding<SparseArraySurrogate<T>> videoprofilehdrformatstodynamicrangeencodingSerializer = SparseArraySurrogate.INSTANCE.serializer(videoprofilehdrformatstodynamicrangeencoding);
        this.surrogateSerializer = videoprofilehdrformatstodynamicrangeencodingSerializer;
        this.descriptor = videoprofilehdrformatstodynamicrangeencodingSerializer.getDescriptor();
    }

    @Override // defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.descriptor;
    }

    @Override // defpackage.QualityAddedEncoderProfilesProvider
    public final void serialize(startListeningToRotationEvents p0, SparseArray<T> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        int size = p1.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(p1.keyAt(i)));
        }
        ArrayList arrayList2 = arrayList;
        int size2 = p1.size();
        ArrayList arrayList3 = new ArrayList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList3.add(p1.valueAt(i2));
        }
        p0.encodeSerializableValue(this.surrogateSerializer, new SparseArraySurrogate(arrayList2, arrayList3));
    }

    @Override // defpackage.isBitDepthMatched
    public final SparseArray<T> deserialize(stopListeningToRotationEvents p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        SparseArraySurrogate sparseArraySurrogate = (SparseArraySurrogate) p0.decodeSerializableValue(this.surrogateSerializer);
        if (sparseArraySurrogate.getKeys().size() != sparseArraySurrogate.getValues().size()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        SparseArray<T> sparseArray = new SparseArray<>(sparseArraySurrogate.getKeys().size());
        int size = sparseArraySurrogate.getKeys().size();
        for (int i = 0; i < size; i++) {
            sparseArray.append(sparseArraySurrogate.getKeys().get(i).intValue(), sparseArraySurrogate.getValues().get(i));
        }
        return sparseArray;
    }

    @CorrectNegativeLatLongForMediaMuxer
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0003\u0018\u0000 \u0019*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u001a\u0019B#\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJG\u0010\u0011\u001a\u00020\u0010\"\n\b\u0002\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "", "p0", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "p2", "LCameraController1;", "p3", "(ILjava/util/List;Ljava/util/List;LCameraController1;)V", "LisUseCaseEnabled;", "LcreateImageAnalysis;", "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "", "write$Self$savedstate_release", "(Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;LisUseCaseEnabled;LcreateImageAnalysis;LvideoProfileHdrFormatsToDynamicRangeEncoding;)V", UserMetadata.KEYDATA_FILENAME, "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "values", "getValues", "Companion", "$serializer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class SparseArraySurrogate<T> {
        private static final createImageAnalysis $cachedDescriptor;
        private final List<Integer> keys;
        private final List<T> values;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<videoProfileHdrFormatsToDynamicRangeEncoding<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: androidx.savedstate.serialization.serializers.SparseArraySerializer$SparseArraySurrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SparseArraySerializer.SparseArraySurrogate._childSerializers$_anonymous_();
            }
        }), null};

        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u0005\"\u0004\b\u0002\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "LvideoProfileHdrFormatsToDynamicRangeEncoding;", "p0", "Landroidx/savedstate/serialization/serializers/SparseArraySerializer$SparseArraySurrogate;", "serializer", "(LvideoProfileHdrFormatsToDynamicRangeEncoding;)LvideoProfileHdrFormatsToDynamicRangeEncoding;"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final <T> videoProfileHdrFormatsToDynamicRangeEncoding<SparseArraySurrogate<T>> serializer(videoProfileHdrFormatsToDynamicRangeEncoding<T> p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return new SparseArraySerializer$SparseArraySurrogate$$serializer(p0);
            }

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3 = new CameraControllerExternalSyntheticLambda3("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
            cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(UserMetadata.KEYDATA_FILENAME, false);
            cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2("values", false);
            $cachedDescriptor = cameraControllerExternalSyntheticLambda3;
        }

        public /* synthetic */ SparseArraySurrogate(int i, List list, List list2, CameraController1 cameraController1) {
            if (3 != (i & 3)) {
                startCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 3, $cachedDescriptor);
            }
            this.keys = list;
            this.values = list2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$savedstate_release(SparseArraySurrogate p0, isUseCaseEnabled p1, createImageAnalysis p2, videoProfileHdrFormatsToDynamicRangeEncoding p3) {
            p1.encodeSerializableElement(p2, 0, $childSerializers[0].getValue(), p0.keys);
            p1.encodeSerializableElement(p2, 1, new unbindImageCaptureAndRecreate(p3), p0.values);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SparseArraySurrogate(List<Integer> list, List<? extends T> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.keys = list;
            this.values = list2;
        }

        public final List<Integer> getKeys() {
            return this.keys;
        }

        public final List<T> getValues() {
            return this.values;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ videoProfileHdrFormatsToDynamicRangeEncoding _childSerializers$_anonymous_() {
            return new unbindImageCaptureAndRecreate(lambdanew1androidxcameraviewCameraController.INSTANCE);
        }
    }
}
