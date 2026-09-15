package androidx.room;

import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.LiveData;
import com.midtrans.sdk.corekit.models.snap.TransactionResult;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0000H¦@¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00038\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00078\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010)\u001a\u00020(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0082\u0001\u0002+,"}, d2 = {"Landroidx/room/RoomTrackingLiveData;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveData;", "Landroidx/room/RoomDatabase;", "p0", "Landroidx/room/InvalidationLiveDataContainer;", "p1", "", "p2", "", "", "p3", "<init>", "(Landroidx/room/RoomDatabase;Landroidx/room/InvalidationLiveDataContainer;Z[Ljava/lang/String;)V", "", "refresh", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invalidated", "()V", "compute", "onActive", "onInactive", "database", "Landroidx/room/RoomDatabase;", "getDatabase", "()Landroidx/room/RoomDatabase;", "container", "Landroidx/room/InvalidationLiveDataContainer;", "inTransaction", "Z", "getInTransaction", "()Z", "Landroidx/room/InvalidationTracker$Observer;", "observer", "Landroidx/room/InvalidationTracker$Observer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", TransactionResult.STATUS_INVALID, "Ljava/util/concurrent/atomic/AtomicBoolean;", "computing", "registeredObserver", "Lkotlin/coroutines/CoroutineContext;", "launchContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/room/RoomCallableTrackingLiveData;", "Landroidx/room/RoomLambdaTrackingLiveData;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RoomTrackingLiveData<T> extends LiveData<T> {
    private final AtomicBoolean computing;
    private final InvalidationLiveDataContainer container;
    private final RoomDatabase database;
    private final boolean inTransaction;
    private final AtomicBoolean invalid;
    private final CoroutineContext launchContext;
    private final InvalidationTracker.Observer observer;
    private final AtomicBoolean registeredObserver;

    /* JADX INFO: renamed from: androidx.room.RoomTrackingLiveData$refresh$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomTrackingLiveData", f = "RoomTrackingLiveData.android.kt", i = {0, 0}, l = {82}, m = "refresh", n = {"this", "computed"}, s = {"L$0", "I$0"})
    static final class C06611 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06611(RoomTrackingLiveData<T> roomTrackingLiveData, Continuation<? super C06611> continuation) {
            super(continuation);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.refresh(this);
        }
    }

    public abstract Object compute(Continuation<? super T> continuation);

    protected final RoomDatabase getDatabase() {
        return this.database;
    }

    protected final boolean getInTransaction() {
        return this.inTransaction;
    }

    private RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr) {
        EmptyCoroutineContext queryContext;
        this.database = roomDatabase;
        this.container = invalidationLiveDataContainer;
        this.inTransaction = z;
        this.observer = new RoomTrackingLiveData$observer$1(strArr, this);
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.registeredObserver = new AtomicBoolean(false);
        if (!roomDatabase.inCompatibilityMode$room_runtime_release()) {
            queryContext = EmptyCoroutineContext.INSTANCE;
        } else if (z) {
            queryContext = roomDatabase.getTransactionContext$room_runtime_release();
        } else {
            queryContext = roomDatabase.getQueryContext();
        }
        this.launchContext = queryContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068 A[Catch: all -> 0x0031, Exception -> 0x0033, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002d, B:29:0x0068), top: B:48:0x002d, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075 A[LOOP:0: B:27:0x0060->B:32:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:27:0x0060, B:29:0x0068, B:36:0x0083, B:33:0x0077, B:34:0x0080), top: B:47:0x0023, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005c -> B:27:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0093 -> B:41:0x0094). Please report as a decompilation issue!!! */
    public final Object refresh(Continuation<? super Unit> continuation) {
        C06611 c06611;
        RoomTrackingLiveData roomTrackingLiveData;
        RoomTrackingLiveData roomTrackingLiveData2;
        int i;
        RoomTrackingLiveData roomTrackingLiveData3;
        if (continuation instanceof C06611) {
            c06611 = (C06611) continuation;
            if ((c06611.label & Integer.MIN_VALUE) != 0) {
                c06611.label -= Integer.MIN_VALUE;
            } else {
                c06611 = new C06611(this, continuation);
            }
        } else {
            c06611 = new C06611(this, continuation);
        }
        Object objCompute = c06611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c06611.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCompute);
                if (this.registeredObserver.compareAndSet(false, true)) {
                    this.database.getInvalidationTracker().addWeakObserver(this.observer);
                }
                roomTrackingLiveData2 = this;
                roomTrackingLiveData2 = roomTrackingLiveData3;
                if (roomTrackingLiveData2.computing.compareAndSet(false, true)) {
                    roomTrackingLiveData = roomTrackingLiveData2;
                    objCompute = null;
                    i = 0;
                    while (roomTrackingLiveData.invalid.compareAndSet(true, false)) {
                        c06611.L$0 = roomTrackingLiveData;
                        c06611.I$0 = 1;
                        c06611.label = 1;
                        objCompute = roomTrackingLiveData.compute(c06611);
                        if (objCompute == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = 1;
                    }
                    if (i != 0) {
                        roomTrackingLiveData.postValue(objCompute);
                    }
                    roomTrackingLiveData.computing.set(false);
                    roomTrackingLiveData3 = roomTrackingLiveData;
                } else {
                    i = 0;
                    roomTrackingLiveData3 = roomTrackingLiveData2;
                }
                if (i != 0) {
                }
                roomTrackingLiveData2 = roomTrackingLiveData3;
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c06611.I$0;
            roomTrackingLiveData = (RoomTrackingLiveData) c06611.L$0;
            try {
                ResultKt.throwOnFailure(objCompute);
                roomTrackingLiveData = roomTrackingLiveData;
                while (roomTrackingLiveData.invalid.compareAndSet(true, false)) {
                    c06611.L$0 = roomTrackingLiveData;
                    c06611.I$0 = 1;
                    c06611.label = 1;
                    objCompute = roomTrackingLiveData.compute(c06611);
                    if (objCompute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = 1;
                }
                if (i != 0) {
                    roomTrackingLiveData.postValue(objCompute);
                }
                roomTrackingLiveData.computing.set(false);
                roomTrackingLiveData3 = roomTrackingLiveData;
                if (i != 0 || !roomTrackingLiveData3.invalid.get()) {
                    roomTrackingLiveData2 = roomTrackingLiveData3;
                    return Unit.INSTANCE;
                }
                roomTrackingLiveData2 = roomTrackingLiveData3;
                if (roomTrackingLiveData2.computing.compareAndSet(false, true)) {
                    roomTrackingLiveData = roomTrackingLiveData2;
                    objCompute = null;
                    i = 0;
                    while (roomTrackingLiveData.invalid.compareAndSet(true, false)) {
                        c06611.L$0 = roomTrackingLiveData;
                        c06611.I$0 = 1;
                        c06611.label = 1;
                        objCompute = roomTrackingLiveData.compute(c06611);
                        if (objCompute == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = 1;
                    }
                    if (i != 0) {
                        roomTrackingLiveData.postValue(objCompute);
                    }
                    roomTrackingLiveData.computing.set(false);
                    roomTrackingLiveData3 = roomTrackingLiveData;
                } else {
                    i = 0;
                    roomTrackingLiveData3 = roomTrackingLiveData2;
                }
                if (i != 0) {
                }
                roomTrackingLiveData2 = roomTrackingLiveData3;
                return Unit.INSTANCE;
            } catch (Exception e2) {
                throw new RuntimeException("Exception while computing database live data.", e2);
            }
        } catch (Throwable th) {
            roomTrackingLiveData.computing.set(false);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidated() {
        boolean zHasActiveObservers = hasActiveObservers();
        if (this.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            b.TuitionPaymentFragmentbindingInflater1(this.database.getCoroutineScope(), this.launchContext, null, new AnonymousClass1(this, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: androidx.room.RoomTrackingLiveData$invalidated$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomTrackingLiveData$invalidated$1", f = "RoomTrackingLiveData.android.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.this$0.refresh(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RoomTrackingLiveData<T> roomTrackingLiveData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.p002lifecycle.LiveData
    public void onActive() {
        super.onActive();
        this.container.onActive(this);
        b.TuitionPaymentFragmentbindingInflater1(this.database.getCoroutineScope(), this.launchContext, null, new C06601(this, null), 2, null);
    }

    /* JADX INFO: renamed from: androidx.room.RoomTrackingLiveData$onActive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomTrackingLiveData$onActive$1", f = "RoomTrackingLiveData.android.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    static final class C06601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ RoomTrackingLiveData<T> this$0;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.this$0.refresh(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C06601(RoomTrackingLiveData<T> roomTrackingLiveData, Continuation<? super C06601> continuation) {
            super(2, continuation);
            this.this$0 = roomTrackingLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C06601(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C06601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.p002lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        this.container.onInactive(this);
    }

    public /* synthetic */ RoomTrackingLiveData(RoomDatabase roomDatabase, InvalidationLiveDataContainer invalidationLiveDataContainer, boolean z, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(roomDatabase, invalidationLiveDataContainer, z, strArr);
    }
}
