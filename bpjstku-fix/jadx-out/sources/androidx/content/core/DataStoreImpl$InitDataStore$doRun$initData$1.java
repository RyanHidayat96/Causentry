package androidx.content.core;

import androidx.exifinterface.media.ExifInterface;
import defpackage.VideoEncoderConfig;
import defpackage.toIllegalArgumentException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", ExifInterface.GPS_DIRECTION_TRUE}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {437, 458, 546, 468}, m = "invokeSuspend", n = {"updateLock", "initializationComplete", "currentData", "updateLock", "initializationComplete", "currentData", "api", "initializationComplete", "currentData", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
final class DataStoreImpl$InitDataStore$doRun$initData$1<T> extends SuspendLambda implements Function1<Continuation<? super Data<T>>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;
    final /* synthetic */ DataStoreImpl<T>.InitDataStore this$1;

    /* JADX WARN: Code duplicated, block: B:22:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:36:0x0117  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[LOOP:0: B:20:0x00ae->B:48:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws CorruptionException {
        VideoEncoderConfig videoEncoderConfig;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        Iterator<T> it;
        Ref.BooleanRef booleanRef2;
        VideoEncoderConfig videoEncoderConfig2;
        Ref.ObjectRef objectRef3;
        Function2 function2;
        Object obj2;
        T t;
        int iHashCode;
        Object version;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            VideoEncoderConfig videoEncoderConfigB = toIllegalArgumentException.b(false);
            Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            this.L$0 = videoEncoderConfigB;
            this.L$1 = booleanRef3;
            this.L$2 = objectRef4;
            this.L$3 = objectRef4;
            this.label = 1;
            Object dataOrHandleCorruption = this.this$0.readDataOrHandleCorruption(true, this);
            if (dataOrHandleCorruption != coroutine_suspended) {
                videoEncoderConfig = videoEncoderConfigB;
                booleanRef = booleanRef3;
                objectRef = objectRef4;
                obj = dataOrHandleCorruption;
                objectRef2 = objectRef;
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            objectRef = (Ref.ObjectRef) this.L$3;
            Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.L$2;
            Ref.BooleanRef booleanRef4 = (Ref.BooleanRef) this.L$1;
            VideoEncoderConfig videoEncoderConfig3 = (VideoEncoderConfig) this.L$0;
            ResultKt.throwOnFailure(obj);
            videoEncoderConfig = videoEncoderConfig3;
            booleanRef = booleanRef4;
            objectRef2 = objectRef5;
        } else {
            if (i2 == 2) {
                it = (Iterator) this.L$4;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$3;
                objectRef2 = (Ref.ObjectRef) this.L$2;
                booleanRef = (Ref.BooleanRef) this.L$1;
                videoEncoderConfig = (VideoEncoderConfig) this.L$0;
                ResultKt.throwOnFailure(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    this.L$0 = videoEncoderConfig;
                    this.L$1 = booleanRef;
                    this.L$2 = objectRef2;
                    this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                    this.L$4 = it;
                    this.label = 2;
                    if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                booleanRef2 = booleanRef;
                videoEncoderConfig2 = videoEncoderConfig;
                ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
                this.L$0 = booleanRef2;
                this.L$1 = objectRef2;
                this.L$2 = videoEncoderConfig2;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                if (videoEncoderConfig2.lock(null, this) != coroutine_suspended) {
                    objectRef3 = objectRef2;
                    booleanRef2.element = true;
                    Unit unit = Unit.INSTANCE;
                    videoEncoderConfig2.unlock(null);
                    obj2 = objectRef3.element;
                    t = objectRef3.element;
                    if (t != null) {
                        iHashCode = t.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    version = this.this$0.getCoordinator().getVersion(this);
                    if (version != coroutine_suspended) {
                        i = iHashCode;
                        obj = version;
                    }
                }
                return coroutine_suspended;
            }
            if (i2 == 3) {
                videoEncoderConfig2 = (VideoEncoderConfig) this.L$2;
                objectRef3 = (Ref.ObjectRef) this.L$1;
                booleanRef2 = (Ref.BooleanRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                try {
                    booleanRef2.element = true;
                    Unit unit2 = Unit.INSTANCE;
                    videoEncoderConfig2.unlock(null);
                    obj2 = objectRef3.element;
                    t = objectRef3.element;
                    if (t != null) {
                        iHashCode = t.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    version = this.this$0.getCoordinator().getVersion(this);
                    if (version != coroutine_suspended) {
                        i = iHashCode;
                        obj = version;
                    }
                    return coroutine_suspended;
                } catch (Throwable th) {
                    videoEncoderConfig2.unlock(null);
                    throw th;
                }
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            obj2 = this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return new Data(obj2, i, ((Number) obj).intValue());
        objectRef.element = (T) ((Data) obj).getValue();
        dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1(videoEncoderConfig, booleanRef, objectRef2, this.this$0);
        List list = ((DataStoreImpl.InitDataStore) this.this$1).initTasks;
        if (list == null) {
            booleanRef2 = booleanRef;
            videoEncoderConfig2 = videoEncoderConfig;
            ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
            this.L$0 = booleanRef2;
            this.L$1 = objectRef2;
            this.L$2 = videoEncoderConfig2;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (videoEncoderConfig2.lock(null, this) != coroutine_suspended) {
                objectRef3 = objectRef2;
                booleanRef2.element = true;
                Unit unit3 = Unit.INSTANCE;
                videoEncoderConfig2.unlock(null);
                obj2 = objectRef3.element;
                t = objectRef3.element;
                if (t != null) {
                    iHashCode = t.hashCode();
                } else {
                    iHashCode = 0;
                }
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = iHashCode;
                this.label = 4;
                version = this.this$0.getCoordinator().getVersion(this);
                if (version != coroutine_suspended) {
                    i = iHashCode;
                    obj = version;
                    return new Data(obj2, i, ((Number) obj).intValue());
                }
            }
        } else {
            it = list.iterator();
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.L$0 = videoEncoderConfig;
                this.L$1 = booleanRef;
                this.L$2 = objectRef2;
                this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.L$4 = it;
                this.label = 2;
                if (function2.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == coroutine_suspended) {
                }
            }
            booleanRef2 = booleanRef;
            videoEncoderConfig2 = videoEncoderConfig;
            ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
            this.L$0 = booleanRef2;
            this.L$1 = objectRef2;
            this.L$2 = videoEncoderConfig2;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            if (videoEncoderConfig2.lock(null, this) != coroutine_suspended) {
                objectRef3 = objectRef2;
                booleanRef2.element = true;
                Unit unit4 = Unit.INSTANCE;
                videoEncoderConfig2.unlock(null);
                obj2 = objectRef3.element;
                t = objectRef3.element;
                if (t != null) {
                    iHashCode = t.hashCode();
                } else {
                    iHashCode = 0;
                }
                this.L$0 = obj2;
                this.L$1 = null;
                this.L$2 = null;
                this.I$0 = iHashCode;
                this.label = 4;
                version = this.this$0.getCoordinator().getVersion(this);
                if (version != coroutine_suspended) {
                    i = iHashCode;
                    obj = version;
                    return new Data(obj2, i, ((Number) obj).intValue());
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, Continuation<? super DataStoreImpl$InitDataStore$doRun$initData$1> continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Data<T>> continuation) {
        return ((DataStoreImpl$InitDataStore$doRun$initData$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
