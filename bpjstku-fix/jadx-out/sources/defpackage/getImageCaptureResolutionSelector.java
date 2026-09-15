package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes7.dex */
final class getImageCaptureResolutionSelector<T> implements startCameraAndTrackStates<T> {
    private final ConcurrentHashMap<Class<?>, setVideoCaptureTargetFrameRate<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Function2<KClass<Object>, List<? extends KType>, videoProfileHdrFormatsToDynamicRangeEncoding<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX WARN: Multi-variable type inference failed */
    public getImageCaptureResolutionSelector(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends videoProfileHdrFormatsToDynamicRangeEncoding<T>> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ConcurrentHashMap<>();
    }

    @Override // defpackage.startCameraAndTrackStates
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(KClass<Object> kClass, List<? extends KType> list) {
        Object objM8024constructorimpl;
        setVideoCaptureTargetFrameRate<T> setvideocapturetargetframeratePutIfAbsent;
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        ConcurrentHashMap<Class<?>, setVideoCaptureTargetFrameRate<T>> concurrentHashMap = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Class<?> javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass);
        setVideoCaptureTargetFrameRate<T> setvideocapturetargetframerate = concurrentHashMap.get(javaClass);
        if (setvideocapturetargetframerate == null && (setvideocapturetargetframeratePutIfAbsent = concurrentHashMap.putIfAbsent(javaClass, (setvideocapturetargetframerate = new setVideoCaptureTargetFrameRate<>()))) != null) {
            setvideocapturetargetframerate = setvideocapturetargetframeratePutIfAbsent;
        }
        setVideoCaptureTargetFrameRate<T> setvideocapturetargetframerate2 = setvideocapturetargetframerate;
        List<? extends KType> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new lambdasetEnabledUseCases2androidxcameraviewCameraController((KType) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        ConcurrentHashMap<List<lambdasetEnabledUseCases2androidxcameraviewCameraController>, Result<videoProfileHdrFormatsToDynamicRangeEncoding<T>>> concurrentHashMap2 = setvideocapturetargetframerate2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Result<videoProfileHdrFormatsToDynamicRangeEncoding<T>> resultM8023boximpl = concurrentHashMap2.get(arrayList2);
        if (resultM8023boximpl == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM8024constructorimpl = Result.m8024constructorimpl(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(kClass, list));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
            }
            resultM8023boximpl = Result.m8023boximpl(objM8024constructorimpl);
            Result<videoProfileHdrFormatsToDynamicRangeEncoding<T>> resultPutIfAbsent = concurrentHashMap2.putIfAbsent(arrayList2, resultM8023boximpl);
            if (resultPutIfAbsent != null) {
                resultM8023boximpl = resultPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(resultM8023boximpl, "");
        return resultM8023boximpl.getValue();
    }
}
