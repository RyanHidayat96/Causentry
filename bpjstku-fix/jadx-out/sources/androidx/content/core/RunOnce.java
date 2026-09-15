package androidx.content.core;

import defpackage.VideoEncoderConfig;
import defpackage.getProblematicSizes;
import defpackage.isHuaweiMate20;
import defpackage.toIllegalArgumentException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/datastore/core/RunOnce;", "", "<init>", "()V", "", "awaitComplete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doRun", "runIfNeeded", "LisHuaweiMate20;", "didRun", "LisHuaweiMate20;", "LVideoEncoderConfig;", "runMutex", "LVideoEncoderConfig;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RunOnce {
    private final VideoEncoderConfig runMutex = toIllegalArgumentException.b(false);
    private final isHuaweiMate20<Unit> didRun = new getProblematicSizes(null);

    /* JADX INFO: renamed from: androidx.datastore.core.RunOnce$runIfNeeded$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", i = {0, 0, 1, 1}, l = {544, 497}, m = "runIfNeeded", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RunOnce.this.runIfNeeded(this);
        }
    }

    protected abstract Object doRun(Continuation<? super Unit> continuation);

    public final Object awaitComplete(Continuation<? super Unit> continuation) {
        Object objAwait = this.didRun.await(continuation);
        return objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object runIfNeeded(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        VideoEncoderConfig videoEncoderConfig;
        RunOnce runOnce;
        VideoEncoderConfig videoEncoderConfig2;
        RunOnce runOnce2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.didRun.cancel()) {
                    return Unit.INSTANCE;
                }
                videoEncoderConfig = this.runMutex;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = videoEncoderConfig;
                anonymousClass1.label = 1;
                if (videoEncoderConfig.lock(null, anonymousClass1) != coroutine_suspended) {
                    runOnce = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                videoEncoderConfig2 = (VideoEncoderConfig) anonymousClass1.L$1;
                runOnce2 = (RunOnce) anonymousClass1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    runOnce2.didRun.b(Unit.INSTANCE);
                    videoEncoderConfig2.unlock(null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    videoEncoderConfig = videoEncoderConfig2;
                    videoEncoderConfig.unlock(null);
                    throw th;
                }
            }
            videoEncoderConfig = (VideoEncoderConfig) anonymousClass1.L$1;
            runOnce = (RunOnce) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            if (!runOnce.didRun.cancel()) {
                anonymousClass1.L$0 = runOnce;
                anonymousClass1.L$1 = videoEncoderConfig;
                anonymousClass1.label = 2;
                if (runOnce.doRun(anonymousClass1) != coroutine_suspended) {
                    videoEncoderConfig2 = videoEncoderConfig;
                    runOnce2 = runOnce;
                    runOnce2.didRun.b(Unit.INSTANCE);
                    videoEncoderConfig2.unlock(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            Unit unit = Unit.INSTANCE;
            videoEncoderConfig.unlock(null);
            return unit;
        } catch (Throwable th2) {
            th = th2;
            videoEncoderConfig.unlock(null);
            throw th;
        }
    }
}
