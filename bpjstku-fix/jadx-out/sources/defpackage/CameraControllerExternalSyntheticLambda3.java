package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u000209J\u000e\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\u0015J\u000e\u0010<\u001a\u0002062\u0006\u0010=\u001a\u00020\u0015J\u0010\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\bH\u0016J\u0010\u0010@\u001a\u0002092\u0006\u0010?\u001a\u00020\bH\u0016J\u0016\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010?\u001a\u00020\bH\u0016J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\bH\u0016J\u0010\u0010C\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0004H\u0016J\u0014\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0'H\u0002J\u0013\u0010E\u001a\u0002092\b\u0010F\u001a\u0004\u0018\u00010GH\u0096\u0002J\b\u0010H\u001a\u00020\bH\u0016J\b\u0010I\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u001e\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001d0\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0'X\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b3\u0010\u000e¨\u0006J"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "serialName", "", "generatedSerializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "elementsCount", "", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V", "getSerialName", "()Ljava/lang/String;", "getElementsCount", "()I", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "added", "names", "", "[Ljava/lang/String;", "propertiesAnnotations", "", "[Ljava/util/List;", "classAnnotations", "elementsOptionality", "", "serialNames", "", "getSerialNames", "()Ljava/util/Set;", "indices", "", "childSerializers", "Lkotlinx/serialization/KSerializer;", "getChildSerializers", "()[Lkotlinx/serialization/KSerializer;", "childSerializers$delegate", "Lkotlin/Lazy;", "typeParameterDescriptors", "getTypeParameterDescriptors$kotlinx_serialization_core", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors$delegate", "_hashCode", "get_hashCode", "_hashCode$delegate", "addElement", "", "name", "isOptional", "", "pushAnnotation", "annotation", "pushClassAnnotation", "a", "getElementDescriptor", FirebaseAnalytics.Param.INDEX, "isElementOptional", "getElementAnnotations", "getElementName", "getElementIndex", "buildIndices", "equals", "other", "", "hashCode", "toString", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CameraControllerExternalSyntheticLambda3 implements createImageAnalysis, createUseCaseGroup {
    private final String INotificationSideChannel;
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private List<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Annotation>[] f107a;
    private Map<String, Integer> asBinder;
    private final getVideoCaptureDynamicRange<?> asInterface;
    private int b;
    private final String[] d;
    private final boolean[] g;
    private final Lazy onTransact;

    @Override // defpackage.createImageAnalysis
    public boolean b() {
        return false;
    }

    @Override // defpackage.createImageAnalysis
    public final boolean d() {
        return false;
    }

    public CameraControllerExternalSyntheticLambda3(String str, getVideoCaptureDynamicRange<?> getvideocapturedynamicrange, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.INotificationSideChannel = str;
        this.asInterface = getvideocapturedynamicrange;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.b = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.d = strArr;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.f107a = new List[i3];
        this.g = new boolean[i3];
        this.asBinder = MapsKt.emptyMap();
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: CameraControllerExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraControllerExternalSyntheticLambda3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        this.onTransact = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: CameraControllerExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: updateScreenFlashToImageCapture
            public static int b = -906517010;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                return Integer.valueOf(CameraControllerExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cameraControllerExternalSyntheticLambda3, (createImageAnalysis[]) cameraControllerExternalSyntheticLambda3.onTransact.getValue()));
            }
        });
    }

    public /* synthetic */ CameraControllerExternalSyntheticLambda3(String str, getVideoCaptureDynamicRange getvideocapturedynamicrange, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : getvideocapturedynamicrange, i);
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from getter */
    public final String getINotificationSideChannel() {
        return this.INotificationSideChannel;
    }

    @Override // defpackage.createImageAnalysis
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.createImageAnalysis
    public deactivateRecording TuitionPaymentFragmentbindingInflater1() {
        return isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE;
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return CollectionsKt.emptyList();
    }

    @Override // defpackage.createUseCaseGroup
    public final Set<String> a() {
        return this.asBinder.keySet();
    }

    public final createImageAnalysis[] asBinder() {
        return (createImageAnalysis[]) this.onTransact.getValue();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        String[] strArr = this.d;
        int i = this.b + 1;
        this.b = i;
        strArr[i] = str;
        this.g[i] = z;
        this.f107a[i] = null;
        if (i == this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) {
            this.asBinder = g();
        }
    }

    @Override // defpackage.createImageAnalysis
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        return this.g[i];
    }

    @Override // defpackage.createImageAnalysis
    public final List<Annotation> b(int i) {
        List<Annotation> list = this.f107a[i];
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // defpackage.createImageAnalysis
    public final String TuitionPaymentFragmentbindingInflater1(int i) {
        return this.d[i];
    }

    @Override // defpackage.createImageAnalysis
    public final int TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Integer num = this.asBinder.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    private final Map<String, Integer> g() {
        HashMap map = new HashMap();
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            map.put(this.d[i], Integer.valueOf(i));
        }
        return map;
    }

    public boolean equals(Object other) {
        CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3 = this;
        if (cameraControllerExternalSyntheticLambda3 == other) {
            return true;
        }
        if (!(other instanceof CameraControllerExternalSyntheticLambda3)) {
            return false;
        }
        createImageAnalysis createimageanalysis = (createImageAnalysis) other;
        if (!Intrinsics.areEqual(cameraControllerExternalSyntheticLambda3.getINotificationSideChannel(), createimageanalysis.getINotificationSideChannel()) || !Arrays.equals((createImageAnalysis[]) this.onTransact.getValue(), (createImageAnalysis[]) ((CameraControllerExternalSyntheticLambda3) other).onTransact.getValue()) || cameraControllerExternalSyntheticLambda3.getTuitionPaymentFragmentspecialinlinedviewModeldefault1() != createimageanalysis.getTuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            return false;
        }
        int tuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraControllerExternalSyntheticLambda3.getTuitionPaymentFragmentspecialinlinedviewModeldefault1();
        for (int i = 0; i < tuitionPaymentFragmentspecialinlinedviewModeldefault1; i++) {
            if (!Intrinsics.areEqual(cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).getINotificationSideChannel(), createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).getINotificationSideChannel()) || !Intrinsics.areEqual(cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).TuitionPaymentFragmentbindingInflater1(), createimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).TuitionPaymentFragmentbindingInflater1())) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.INotificationSideChannel);
        sb.append('(');
        return CollectionsKt.joinToString$default(RangesKt.until(0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), ", ", sb.toString(), ")", 0, null, new Function1() { // from class: CameraControllerExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CameraControllerExternalSyntheticLambda3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((Integer) obj).intValue());
            }
        }, 24, null);
    }

    public static /* synthetic */ CharSequence b(CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(cameraControllerExternalSyntheticLambda3.d[i]);
        sb.append(": ");
        sb.append(cameraControllerExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i).getINotificationSideChannel());
        return sb.toString();
    }

    public static /* synthetic */ createImageAnalysis[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3) {
        ArrayList arrayList;
        videoProfileHdrFormatsToDynamicRangeEncoding<?>[] videoprofilehdrformatstodynamicrangeencodingArrTypeParametersSerializers;
        getVideoCaptureDynamicRange<?> getvideocapturedynamicrange = cameraControllerExternalSyntheticLambda3.asInterface;
        if (getvideocapturedynamicrange == null || (videoprofilehdrformatstodynamicrangeencodingArrTypeParametersSerializers = getvideocapturedynamicrange.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(videoprofilehdrformatstodynamicrangeencodingArrTypeParametersSerializers.length);
            for (videoProfileHdrFormatsToDynamicRangeEncoding<?> videoprofilehdrformatstodynamicrangeencoding : videoprofilehdrformatstodynamicrangeencodingArrTypeParametersSerializers) {
                arrayList2.add(videoprofilehdrformatstodynamicrangeencoding.getDescriptor());
            }
            arrayList = arrayList2;
        }
        return updatePreviewViewTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList);
    }

    public static /* synthetic */ videoProfileHdrFormatsToDynamicRangeEncoding[] b(CameraControllerExternalSyntheticLambda3 cameraControllerExternalSyntheticLambda3) {
        videoProfileHdrFormatsToDynamicRangeEncoding<?>[] videoprofilehdrformatstodynamicrangeencodingArrChildSerializers;
        getVideoCaptureDynamicRange<?> getvideocapturedynamicrange = cameraControllerExternalSyntheticLambda3.asInterface;
        return (getvideocapturedynamicrange == null || (videoprofilehdrformatstodynamicrangeencodingArrChildSerializers = getvideocapturedynamicrange.childSerializers()) == null) ? CameraControllerExternalSyntheticLambda6.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : videoprofilehdrformatstodynamicrangeencodingArrChildSerializers;
    }

    @Override // defpackage.createImageAnalysis
    public createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        return ((videoProfileHdrFormatsToDynamicRangeEncoding[]) this.TuitionPaymentFragmentbindingInflater1.getValue())[i].getDescriptor();
    }

    public int hashCode() {
        return ((Number) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).intValue();
    }
}
