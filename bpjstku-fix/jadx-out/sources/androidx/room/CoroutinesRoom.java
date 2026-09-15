package androidx.room;

import android.os.CancellationSignal;
import androidx.database.SQLiteConnection;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import defpackage.VideoMimeInfoBuilder;
import defpackage.clampVideoBitrateIfNotSupported;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/CoroutinesRoom;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoroutinesRoom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    private CoroutinesRoom() {
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@¢\u0006\u0004\b\u000b\u0010\fJ>\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087@¢\u0006\u0004\b\u000b\u0010\u000fJL\u0010\u0014\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00130\u0012\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "<init>", "()V", "R", "Landroidx/room/RoomDatabase;", "p0", "", "p1", "Ljava/util/concurrent/Callable;", "p2", "execute", "(Landroidx/room/RoomDatabase;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "p3", "(Landroidx/room/RoomDatabase;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "LclampVideoBitrateIfNotSupported;", "Lkotlin/jvm/JvmSuppressWildcards;", "createFlow", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)LclampVideoBitrateIfNotSupported;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        @Deprecated(message = "No longer called by generated implementation")
        @JvmStatic
        public final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, Continuation<? super R> continuation) {
            CoroutinesRoom$Companion$execute$1 coroutinesRoom$Companion$execute$1;
            if (continuation instanceof CoroutinesRoom$Companion$execute$1) {
                coroutinesRoom$Companion$execute$1 = (CoroutinesRoom$Companion$execute$1) continuation;
                if ((coroutinesRoom$Companion$execute$1.label & Integer.MIN_VALUE) != 0) {
                    coroutinesRoom$Companion$execute$1.label -= Integer.MIN_VALUE;
                } else {
                    coroutinesRoom$Companion$execute$1 = new CoroutinesRoom$Companion$execute$1(this, continuation);
                }
            } else {
                coroutinesRoom$Companion$execute$1 = new CoroutinesRoom$Companion$execute$1(this, continuation);
            }
            Object coroutineContext = coroutinesRoom$Companion$execute$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = coroutinesRoom$Companion$execute$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(coroutineContext);
                if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                    return callable.call();
                }
                coroutinesRoom$Companion$execute$1.L$0 = callable;
                coroutinesRoom$Companion$execute$1.label = 1;
                coroutineContext = DBUtil.getCoroutineContext(roomDatabase, z, coroutinesRoom$Companion$execute$1);
                if (coroutineContext != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(coroutineContext);
                return coroutineContext;
            }
            callable = (Callable) coroutinesRoom$Companion$execute$1.L$0;
            ResultKt.throwOnFailure(coroutineContext);
            CoroutinesRoom$Companion$execute$2 coroutinesRoom$Companion$execute$2 = new CoroutinesRoom$Companion$execute$2(callable, null);
            coroutinesRoom$Companion$execute$1.L$0 = null;
            coroutinesRoom$Companion$execute$1.label = 2;
            Object objTuitionPaymentFragmentbindingInflater1 = BuildersKt.TuitionPaymentFragmentbindingInflater1((CoroutineContext) coroutineContext, coroutinesRoom$Companion$execute$2, coroutinesRoom$Companion$execute$1);
            return objTuitionPaymentFragmentbindingInflater1 == coroutine_suspended ? coroutine_suspended : objTuitionPaymentFragmentbindingInflater1;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001a  */
        @Deprecated(message = "No longer called by generated implementation")
        @JvmStatic
        public final <R> Object execute(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
            CoroutinesRoom$Companion$execute$3 coroutinesRoom$Companion$execute$3;
            final CancellationSignal cancellationSignal2;
            Callable<R> callable2;
            Object coroutineContext;
            RoomDatabase roomDatabase2 = roomDatabase;
            if (continuation instanceof CoroutinesRoom$Companion$execute$3) {
                coroutinesRoom$Companion$execute$3 = (CoroutinesRoom$Companion$execute$3) continuation;
                if ((coroutinesRoom$Companion$execute$3.label & Integer.MIN_VALUE) != 0) {
                    coroutinesRoom$Companion$execute$3.label -= Integer.MIN_VALUE;
                } else {
                    coroutinesRoom$Companion$execute$3 = new CoroutinesRoom$Companion$execute$3(this, continuation);
                }
            } else {
                coroutinesRoom$Companion$execute$3 = new CoroutinesRoom$Companion$execute$3(this, continuation);
            }
            Object obj = coroutinesRoom$Companion$execute$3.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = coroutinesRoom$Companion$execute$3.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                    return callable.call();
                }
                coroutinesRoom$Companion$execute$3.L$0 = roomDatabase2;
                cancellationSignal2 = cancellationSignal;
                coroutinesRoom$Companion$execute$3.L$1 = cancellationSignal2;
                callable2 = callable;
                coroutinesRoom$Companion$execute$3.L$2 = callable2;
                coroutinesRoom$Companion$execute$3.label = 1;
                coroutineContext = DBUtil.getCoroutineContext(roomDatabase2, z, coroutinesRoom$Companion$execute$3);
                if (coroutineContext != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            Callable<R> callable3 = (Callable) coroutinesRoom$Companion$execute$3.L$2;
            CancellationSignal cancellationSignal3 = (CancellationSignal) coroutinesRoom$Companion$execute$3.L$1;
            RoomDatabase roomDatabase3 = (RoomDatabase) coroutinesRoom$Companion$execute$3.L$0;
            ResultKt.throwOnFailure(obj);
            callable2 = callable3;
            roomDatabase2 = roomDatabase3;
            coroutineContext = obj;
            cancellationSignal2 = cancellationSignal3;
            CoroutineContext coroutineContext2 = (CoroutineContext) coroutineContext;
            coroutinesRoom$Companion$execute$3.L$0 = roomDatabase2;
            coroutinesRoom$Companion$execute$3.L$1 = cancellationSignal2;
            coroutinesRoom$Companion$execute$3.L$2 = callable2;
            coroutinesRoom$Companion$execute$3.L$3 = coroutineContext2;
            coroutinesRoom$Companion$execute$3.label = 2;
            CoroutinesRoom$Companion$execute$3 coroutinesRoom$Companion$execute$4 = coroutinesRoom$Companion$execute$3;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(coroutinesRoom$Companion$execute$4), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            final VideoMimeInfoBuilder videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1 = b.TuitionPaymentFragmentbindingInflater1(roomDatabase2.getCoroutineScope(), coroutineContext2, null, new CoroutinesRoom$Companion$execute$4$job$1(callable2, cancellableContinuationImpl2, null), 2, null);
            cancellableContinuationImpl2.b((Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    CancellationSignal cancellationSignal4 = cancellationSignal2;
                    if (cancellationSignal4 != null) {
                        cancellationSignal4.cancel();
                    }
                    videoMimeInfoBuilderTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(coroutinesRoom$Companion$execute$4);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object createFlow$lambda$1(Callable callable, SQLiteConnection sQLiteConnection) {
            Intrinsics.checkNotNullParameter(sQLiteConnection, "");
            return callable.call();
        }

        @Deprecated(message = "No longer called by generated implementation")
        @JvmStatic
        public final <R> clampVideoBitrateIfNotSupported<R> createFlow(RoomDatabase p0, boolean p1, String[] p2, final Callable<R> p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            return FlowUtil.createFlow(p0, p1, p2, new Function1() { // from class: androidx.room.CoroutinesRoom$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CoroutinesRoom.Companion.createFlow$lambda$1(p3, (SQLiteConnection) obj);
                }
            });
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Deprecated(message = "No longer called by generated implementation")
    @JvmStatic
    public static final <R> clampVideoBitrateIfNotSupported<R> createFlow(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<R> callable) {
        return INSTANCE.createFlow(roomDatabase, z, strArr, callable);
    }

    @Deprecated(message = "No longer called by generated implementation")
    @JvmStatic
    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z, cancellationSignal, callable, continuation);
    }

    @Deprecated(message = "No longer called by generated implementation")
    @JvmStatic
    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z, Callable<R> callable, Continuation<? super R> continuation) {
        return INSTANCE.execute(roomDatabase, z, callable, continuation);
    }
}
