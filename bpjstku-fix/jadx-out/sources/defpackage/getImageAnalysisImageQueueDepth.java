package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes7.dex */
final class getImageAnalysisImageQueueDepth<T> implements startCameraAndTrackStates<T> {
    private final getImageAnalysisTargetSize<setVideoCaptureTargetFrameRate<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Function2<KClass<Object>, List<? extends KType>, videoProfileHdrFormatsToDynamicRangeEncoding<T>> b;

    public static final class b implements Function0<T> {
        @Override // kotlin.jvm.functions.Function0
        public final T invoke() {
            return (T) new setVideoCaptureTargetFrameRate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getImageAnalysisImageQueueDepth(Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends videoProfileHdrFormatsToDynamicRangeEncoding<T>> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.b = function2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getImageAnalysisTargetSize<>();
    }

    @Override // defpackage.startCameraAndTrackStates
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(KClass<Object> kClass, List<? extends KType> list) {
        Object objM8024constructorimpl;
        Intrinsics.checkNotNullParameter(kClass, "");
        Intrinsics.checkNotNullParameter(list, "");
        setVideoCaptureTargetFrameRate<T> setvideocapturetargetframerate = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(JvmClassMappingKt.getJavaClass((KClass) kClass));
        Intrinsics.checkNotNullExpressionValue(setvideocapturetargetframerate, "");
        setImageCaptureFlashMode setimagecaptureflashmode = (setImageCaptureFlashMode) setvideocapturetargetframerate;
        T t = setimagecaptureflashmode.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get();
        if (t == null) {
            t = (T) setimagecaptureflashmode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new b());
        }
        setVideoCaptureTargetFrameRate setvideocapturetargetframerate2 = t;
        List<? extends KType> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new lambdasetEnabledUseCases2androidxcameraviewCameraController((KType) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        ConcurrentHashMap<List<lambdasetEnabledUseCases2androidxcameraviewCameraController>, Result<videoProfileHdrFormatsToDynamicRangeEncoding<T>>> concurrentHashMap = setvideocapturetargetframerate2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Result<videoProfileHdrFormatsToDynamicRangeEncoding<T>> resultM8023boximpl = concurrentHashMap.get(arrayList2);
        if (resultM8023boximpl == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM8024constructorimpl = Result.m8024constructorimpl(this.b.invoke(kClass, list));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM8024constructorimpl = Result.m8024constructorimpl(ResultKt.createFailure(th));
            }
            resultM8023boximpl = Result.m8023boximpl(objM8024constructorimpl);
            Result<videoProfileHdrFormatsToDynamicRangeEncoding<T>> resultPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, resultM8023boximpl);
            if (resultPutIfAbsent != null) {
                resultM8023boximpl = resultPutIfAbsent;
            }
        }
        Intrinsics.checkNotNullExpressionValue(resultM8023boximpl, "");
        return resultM8023boximpl.getValue();
    }
}
