package androidx.content.core;

import defpackage.VideoEncoderConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J9\u0010\u0007\u001a\u00028\u00002'\u0010\u0006\u001a#\b\u0001\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1;", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "p0", "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements InitializerApi<T> {
    final /* synthetic */ Ref.ObjectRef<T> $currentData;
    final /* synthetic */ Ref.BooleanRef $initializationComplete;
    final /* synthetic */ VideoEncoderConfig $updateLock;
    final /* synthetic */ DataStoreImpl<T> this$0;

    DataStoreImpl$InitDataStore$doRun$initData$1$api$1(VideoEncoderConfig videoEncoderConfig, Ref.BooleanRef booleanRef, Ref.ObjectRef<T> objectRef, DataStoreImpl<T> dataStoreImpl) {
        this.$updateLock = videoEncoderConfig;
        this.$initializationComplete = booleanRef;
        this.$currentData = objectRef;
        this.this$0 = dataStoreImpl;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b8 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:21:0x0053, B:34:0x00b0, B:36:0x00b8), top: B:54:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // androidx.content.core.InitializerApi
    public final Object updateData(Function2<? super T, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Throwable {
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        VideoEncoderConfig videoEncoderConfig;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef<T> objectRef;
        Function2<? super T, ? super Continuation<? super T>, ? extends Object> function3;
        DataStoreImpl dataStoreImpl;
        VideoEncoderConfig videoEncoderConfig2;
        DataStoreImpl dataStoreImpl2;
        VideoEncoderConfig videoEncoderConfig3;
        T t;
        Ref.ObjectRef<T> objectRef2;
        if (continuation instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) continuation;
            if ((dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label -= Integer.MIN_VALUE;
            } else {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
            }
        } else {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuation);
        }
        Object obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                videoEncoderConfig = this.$updateLock;
                Ref.BooleanRef booleanRef2 = this.$initializationComplete;
                Ref.ObjectRef<T> objectRef3 = this.$currentData;
                DataStoreImpl dataStoreImpl3 = this.this$0;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = function2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = videoEncoderConfig;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = booleanRef2;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = objectRef3;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = dataStoreImpl3;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 1;
                if (videoEncoderConfig.lock(null, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutine_suspended) {
                    booleanRef = booleanRef2;
                    objectRef = objectRef3;
                    function3 = function2;
                    dataStoreImpl = dataStoreImpl3;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t = (T) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                    objectRef2 = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                    videoEncoderConfig3 = (VideoEncoderConfig) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        objectRef2.element = t;
                        objectRef = objectRef2;
                        T t2 = objectRef.element;
                        videoEncoderConfig3.unlock(null);
                        return t2;
                    } catch (Throwable th) {
                        th = th;
                        videoEncoderConfig = videoEncoderConfig3;
                        videoEncoderConfig.unlock(null);
                        throw th;
                    }
                }
                DataStoreImpl dataStoreImpl4 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                objectRef = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                videoEncoderConfig2 = (VideoEncoderConfig) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    dataStoreImpl2 = dataStoreImpl4;
                    if (!Intrinsics.areEqual(obj, objectRef.element)) {
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = videoEncoderConfig2;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                        if (dataStoreImpl2.writeData$datastore_core_release(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutine_suspended) {
                            t = (T) obj;
                            objectRef2 = objectRef;
                            videoEncoderConfig3 = videoEncoderConfig2;
                            objectRef2.element = t;
                            objectRef = objectRef2;
                        }
                        return coroutine_suspended;
                    }
                    videoEncoderConfig3 = videoEncoderConfig2;
                    T t3 = objectRef.element;
                    videoEncoderConfig3.unlock(null);
                    return t3;
                } catch (Throwable th2) {
                    th = th2;
                    videoEncoderConfig = videoEncoderConfig2;
                    videoEncoderConfig.unlock(null);
                    throw th;
                }
            }
            DataStoreImpl dataStoreImpl5 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4;
            objectRef = (Ref.ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3;
            booleanRef = (Ref.BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
            VideoEncoderConfig videoEncoderConfig4 = (VideoEncoderConfig) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
            function3 = (Function2) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
            ResultKt.throwOnFailure(obj);
            videoEncoderConfig = videoEncoderConfig4;
            dataStoreImpl = dataStoreImpl5;
            if (booleanRef.element) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.".toString());
            }
            T t4 = objectRef.element;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = videoEncoderConfig;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = dataStoreImpl;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 2;
            Object objInvoke = function3.invoke(t4, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
            if (objInvoke != coroutine_suspended) {
                videoEncoderConfig2 = videoEncoderConfig;
                obj = objInvoke;
                dataStoreImpl2 = dataStoreImpl;
                if (!Intrinsics.areEqual(obj, objectRef.element)) {
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = videoEncoderConfig2;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = objectRef;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                    if (dataStoreImpl2.writeData$datastore_core_release(obj, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutine_suspended) {
                        t = (T) obj;
                        objectRef2 = objectRef;
                        videoEncoderConfig3 = videoEncoderConfig2;
                        objectRef2.element = t;
                        objectRef = objectRef2;
                    }
                } else {
                    videoEncoderConfig3 = videoEncoderConfig2;
                }
                T t5 = objectRef.element;
                videoEncoderConfig3.unlock(null);
                return t5;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            videoEncoderConfig.unlock(null);
            throw th;
        }
    }
}
