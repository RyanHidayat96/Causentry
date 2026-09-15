package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class isCloseToRealtime {
    public static final videoProfileHdrFormatsToDynamicRangeEncoding<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2(PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener, KType kType) {
        Intrinsics.checkNotNullParameter(previewViewImplementationOnSurfaceNotInUseListener, "");
        Intrinsics.checkNotNullParameter(kType, "");
        videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(previewViewImplementationOnSurfaceNotInUseListener, kType, true);
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            return videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        KClass<Object> kClassTuitionPaymentFragmentbindingInflater1 = updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(kType);
        Intrinsics.checkNotNullParameter(kClassTuitionPaymentFragmentbindingInflater1, "");
        updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1((KClass<?>) kClassTuitionPaymentFragmentbindingInflater1);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    public static final videoProfileHdrFormatsToDynamicRangeEncoding<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1(PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener, KType kType, boolean z) {
        videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        getFirstVideoProfile getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        KClass<Object> kClassTuitionPaymentFragmentbindingInflater1 = updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(kType);
        boolean zIsMarkedNullable = kType.isMarkedNullable();
        List<KTypeProjection> arguments = kType.getArguments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            arrayList.add(updatePreviewViewTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2((KTypeProjection) it.next()));
        }
        final ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            Intrinsics.checkNotNullParameter(kClassTuitionPaymentFragmentbindingInflater1, "");
            if (!JvmClassMappingKt.getJavaClass((KClass) kClassTuitionPaymentFragmentbindingInflater1).isInterface() || previewViewImplementationOnSurfaceNotInUseListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClassTuitionPaymentFragmentbindingInflater1, CollectionsKt.emptyList()) == null) {
                videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = QualityResolutionModifiedEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClassTuitionPaymentFragmentbindingInflater1, zIsMarkedNullable);
            } else {
                videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
            }
        } else if (previewViewImplementationOnSurfaceNotInUseListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        } else {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = QualityResolutionModifiedEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(kClassTuitionPaymentFragmentbindingInflater1, arrayList2, zIsMarkedNullable);
            if (Result.m8030isFailureimpl(objTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            }
            videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault3 = (videoProfileHdrFormatsToDynamicRangeEncoding) objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            return videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        if (arrayList2.isEmpty()) {
            getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = VideoEncoderInfoWrapper.TuitionPaymentFragmentbindingInflater1(kClassTuitionPaymentFragmentbindingInflater1);
            if (getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null && (getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = previewViewImplementationOnSurfaceNotInUseListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClassTuitionPaymentFragmentbindingInflater1, CollectionsKt.emptyList())) == null) {
                Intrinsics.checkNotNullParameter(kClassTuitionPaymentFragmentbindingInflater1, "");
                getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = JvmClassMappingKt.getJavaClass((KClass) kClassTuitionPaymentFragmentbindingInflater1).isInterface() ? new getFirstVideoProfile(kClassTuitionPaymentFragmentbindingInflater1) : null;
            }
        } else {
            List<videoProfileHdrFormatsToDynamicRangeEncoding<Object>> listTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(previewViewImplementationOnSurfaceNotInUseListener, arrayList2, z);
            if (listTuitionPaymentFragmentbindingInflater1 == null) {
                return null;
            }
            videoProfileHdrFormatsToDynamicRangeEncoding<? extends Object> videoprofilehdrformatstodynamicrangeencodingB = b(kClassTuitionPaymentFragmentbindingInflater1, listTuitionPaymentFragmentbindingInflater1, new Function0() { // from class: VideoTimebaseConverter
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ((KType) arrayList2.get(0)).getClassifier();
                }
            });
            if (videoprofilehdrformatstodynamicrangeencodingB == null) {
                getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = previewViewImplementationOnSurfaceNotInUseListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(kClassTuitionPaymentFragmentbindingInflater1, listTuitionPaymentFragmentbindingInflater1);
                if (getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    Intrinsics.checkNotNullParameter(kClassTuitionPaymentFragmentbindingInflater1, "");
                    getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = JvmClassMappingKt.getJavaClass((KClass) kClassTuitionPaymentFragmentbindingInflater1).isInterface() ? new getFirstVideoProfile(kClassTuitionPaymentFragmentbindingInflater1) : null;
                }
            } else {
                getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoprofilehdrformatstodynamicrangeencodingB;
            }
        }
        if (getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            return null;
        }
        if (zIsMarkedNullable) {
            return addExtraSupportedSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        Intrinsics.checkNotNull(getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        return getfirstvideoprofileTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static final List<videoProfileHdrFormatsToDynamicRangeEncoding<Object>> TuitionPaymentFragmentbindingInflater1(PreviewViewImplementationOnSurfaceNotInUseListener previewViewImplementationOnSurfaceNotInUseListener, List<? extends KType> list, boolean z) {
        Intrinsics.checkNotNullParameter(previewViewImplementationOnSurfaceNotInUseListener, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (z) {
            List<? extends KType> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewViewImplementationOnSurfaceNotInUseListener, (KType) it.next()));
            }
            return arrayList;
        }
        List<? extends KType> list3 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        for (KType kType : list3) {
            Intrinsics.checkNotNullParameter(previewViewImplementationOnSurfaceNotInUseListener, "");
            Intrinsics.checkNotNullParameter(kType, "");
            videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(previewViewImplementationOnSurfaceNotInUseListener, kType, false);
            if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                return null;
            }
            arrayList2.add(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return arrayList2;
    }

    public static final videoProfileHdrFormatsToDynamicRangeEncoding<? extends Object> b(KClass<Object> kClass, List<? extends videoProfileHdrFormatsToDynamicRangeEncoding<Object>> list, Function0<? extends KClassifier> function0) {
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        videoProfileHdrFormatsToDynamicRangeEncoding<? extends Object> videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(kClass, list, function0);
        return videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(kClass, list) : videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private static final videoProfileHdrFormatsToDynamicRangeEncoding<? extends Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1(KClass<Object> kClass, List<? extends videoProfileHdrFormatsToDynamicRangeEncoding<Object>> list) {
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = (videoProfileHdrFormatsToDynamicRangeEncoding[]) list.toArray(new videoProfileHdrFormatsToDynamicRangeEncoding[0]);
        videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr2 = (videoProfileHdrFormatsToDynamicRangeEncoding[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, videoprofilehdrformatstodynamicrangeencodingArr.length);
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr2, "");
        return updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) kClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr2, videoprofilehdrformatstodynamicrangeencodingArr2.length));
    }

    private static final videoProfileHdrFormatsToDynamicRangeEncoding<? extends Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1(KClass<Object> kClass, List<? extends videoProfileHdrFormatsToDynamicRangeEncoding<Object>> list, Function0<? extends KClassifier> function0) {
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new unbindImageCaptureAndRecreate(list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new isPinchToZoomEnabled(list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new onTapToFocus(list.get(0));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new isImageCaptureEnabled(list.get(0), list.get(1));
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new setImageAnalysisAnalyzer(list.get(0), list.get(1));
        }
        if (!Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            if (!Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
                if (!Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Triple.class))) {
                    Intrinsics.checkNotNullParameter(kClass, "");
                    if (!JvmClassMappingKt.getJavaClass((KClass) kClass).isArray()) {
                        return null;
                    }
                    KClassifier kClassifierInvoke = function0.invoke();
                    Intrinsics.checkNotNull(kClassifierInvoke, "");
                    KClass kClass2 = (KClass) kClassifierInvoke;
                    videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencoding = list.get(0);
                    Intrinsics.checkNotNullParameter(kClass2, "");
                    Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding, "");
                    return new lambdaaccept0androidxcameraviewCameraController2(kClass2, videoprofilehdrformatstodynamicrangeencoding);
                }
                videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencoding2 = list.get(0);
                videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencoding3 = list.get(1);
                videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencoding4 = list.get(2);
                Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding2, "");
                Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding3, "");
                Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding4, "");
                return new r8lambdaQiw_1x4yhF4ntlZsRCSMeKTMWf8(videoprofilehdrformatstodynamicrangeencoding2, videoprofilehdrformatstodynamicrangeencoding3, videoprofilehdrformatstodynamicrangeencoding4);
            }
            videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencoding5 = list.get(0);
            videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencoding6 = list.get(1);
            Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding5, "");
            Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding6, "");
            return new setVideoCaptureMirrorMode(videoprofilehdrformatstodynamicrangeencoding5, videoprofilehdrformatstodynamicrangeencoding6);
        }
        videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencoding7 = list.get(0);
        videoProfileHdrFormatsToDynamicRangeEncoding<Object> videoprofilehdrformatstodynamicrangeencoding8 = list.get(1);
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding7, "");
        Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencoding8, "");
        return new setImageAnalysisResolutionSelector(videoprofilehdrformatstodynamicrangeencoding7, videoprofilehdrformatstodynamicrangeencoding8);
    }
}
