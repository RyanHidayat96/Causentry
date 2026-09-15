package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes7.dex */
public final class lambdaaccept0androidxcameraviewCameraController2<ElementKlass, Element extends ElementKlass> extends getImageAnalysisOutputImageFormat<Element, Element[], ArrayList<Element>> {
    private final KClass<ElementKlass> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final createImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "");
        return new ArrayList(ArraysKt.asList(objArr));
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "");
        KClass<ElementKlass> kClass = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        Object objNewInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass((KClass) kClass), arrayList.size());
        Intrinsics.checkNotNull(objNewInstance, "");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(array, "");
        return array;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "");
        return arrayList.size();
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.add(i, obj2);
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Iterator TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "");
        return ArrayIteratorKt.iterator(objArr);
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, int i) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.ensureCapacity(i);
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ int b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "");
        return objArr.length;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdaaccept0androidxcameraviewCameraController2(KClass<ElementKlass> kClass, videoProfileHdrFormatsToDynamicRangeEncoding<Element> videoprofilehdrformatstodynamicrangeencoding) {
        super(videoprofilehdrformatstodynamicrangeencoding, null);
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = kClass;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new unbindAllAndRecreate(videoprofilehdrformatstodynamicrangeencoding.getDescriptor());
    }

    @Override // defpackage.getImageAnalysisOutputImageFormat, defpackage.videoProfileHdrFormatsToDynamicRangeEncoding, defpackage.QualityAddedEncoderProfilesProvider, defpackage.isBitDepthMatched
    public final createImageAnalysis getDescriptor() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.speedUpZoomBy2X
    public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new ArrayList();
    }
}
