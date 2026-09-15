package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.Encoder;
import defpackage.getInput;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/GlobalSnapshotManager;", "", "<init>", "()V", "", "ensureStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            final Encoder encoderTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getInput.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, null, 6);
            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(AndroidUiDispatcher.INSTANCE.getMain()), null, null, new AnonymousClass1(encoderTuitionPaymentFragmentspecialinlinedviewModeldefault3, null), 3, null);
            Snapshot.INSTANCE.registerGlobalWriteObserver(new Function1<Object, Unit>() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager.ensureStarted.2
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                    invoke2(obj);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object obj) {
                    if (GlobalSnapshotManager.sent.compareAndSet(false, true)) {
                        encoderTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Encoder<Unit> $channel;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: Code duplicated, block: B:14:0x0038 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0041 A[Catch: all -> 0x005e, TryCatch #1 {all -> 0x005e, blocks: (B:6:0x0013, B:15:0x0039, B:17:0x0041, B:12:0x002c, B:18:0x0055, B:11:0x0027), top: B:28:0x0007 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0036 -> B:15:0x0039). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r5.L$1
                getEncoderInfo r1 = (defpackage.getEncoderInfo) r1
                java.lang.Object r3 = r5.L$0
                EncoderSurfaceInput r3 = (defpackage.EncoderSurfaceInput) r3
                kotlin.ResultKt.throwOnFailure(r6)     // Catch: java.lang.Throwable -> L5e
                goto L39
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                kotlin.ResultKt.throwOnFailure(r6)
                Encoder<kotlin.Unit> r6 = r5.$channel
                r3 = r6
                EncoderSurfaceInput r3 = (defpackage.EncoderSurfaceInput) r3
                getEncoderInfo r6 = r3.a()     // Catch: java.lang.Throwable -> L5e
                r1 = r6
            L2c:
                r5.L$0 = r3     // Catch: java.lang.Throwable -> L5e
                r5.L$1 = r1     // Catch: java.lang.Throwable -> L5e
                r5.label = r2     // Catch: java.lang.Throwable -> L5e
                java.lang.Object r6 = r1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r5)     // Catch: java.lang.Throwable -> L5e
                if (r6 != r0) goto L39
                return r0
            L39:
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L5e
                boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L5e
                if (r6 == 0) goto L55
                java.lang.Object r6 = r1.b()     // Catch: java.lang.Throwable -> L5e
                kotlin.Unit r6 = (kotlin.Unit) r6     // Catch: java.lang.Throwable -> L5e
                java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.GlobalSnapshotManager.access$getSent$p()     // Catch: java.lang.Throwable -> L5e
                r4 = 0
                r6.set(r4)     // Catch: java.lang.Throwable -> L5e
                androidx.compose.runtime.snapshots.Snapshot$Companion r6 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L5e
                r6.sendApplyNotifications()     // Catch: java.lang.Throwable -> L5e
                goto L2c
            L55:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5e
                r6 = 0
                defpackage.EncoderByteBufferInput.b(r3, r6)
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L5e:
                r6 = move-exception
                throw r6     // Catch: java.lang.Throwable -> L60
            L60:
                r0 = move-exception
                defpackage.EncoderByteBufferInput.b(r3, r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Encoder<Unit> encoder, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$channel = encoder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$channel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }
}
