package defpackage;

import androidx.p002lifecycle.DefaultLifecycleObserver;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleObserver;
import androidx.p002lifecycle.LifecycleOwner;
import coil.util.Lifecycles$awaitStarted$1;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getQueue {
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, getQueue$TuitionPaymentFragmentbindingInflater1] */
    public static final Object TuitionPaymentFragmentbindingInflater1(Lifecycle lifecycle, Continuation<? super Unit> continuation) throws Throwable {
        Lifecycles$awaitStarted$1 lifecycles$awaitStarted$1;
        Lifecycle lifecycle2;
        Ref.ObjectRef objectRef;
        Throwable th;
        LifecycleObserver lifecycleObserver;
        LifecycleObserver lifecycleObserver2;
        if (continuation instanceof Lifecycles$awaitStarted$1) {
            lifecycles$awaitStarted$1 = (Lifecycles$awaitStarted$1) continuation;
            if ((lifecycles$awaitStarted$1.label & Integer.MIN_VALUE) != 0) {
                lifecycles$awaitStarted$1.label -= Integer.MIN_VALUE;
            } else {
                lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuation);
            }
        } else {
            lifecycles$awaitStarted$1 = new Lifecycles$awaitStarted$1(continuation);
        }
        Object obj = lifecycles$awaitStarted$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = lifecycles$awaitStarted$1.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) lifecycles$awaitStarted$1.L$1;
            lifecycle2 = (Lifecycle) lifecycles$awaitStarted$1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                lifecycleObserver2 = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver2 != null) {
                    lifecycle2.removeObserver(lifecycleObserver2);
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                lifecycleObserver = (LifecycleObserver) objectRef.element;
                if (lifecycleObserver != null) {
                    lifecycle2.removeObserver(lifecycleObserver);
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            return Unit.INSTANCE;
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        try {
            lifecycles$awaitStarted$1.L$0 = lifecycle;
            lifecycles$awaitStarted$1.L$1 = objectRef2;
            lifecycles$awaitStarted$1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(lifecycles$awaitStarted$1), 1);
            cancellableContinuationImpl.initCancellability();
            objectRef2.element = new TuitionPaymentFragmentbindingInflater1(cancellableContinuationImpl);
            Object obj2 = objectRef2.element;
            Intrinsics.checkNotNull(obj2);
            lifecycle.addObserver((LifecycleObserver) obj2);
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(lifecycles$awaitStarted$1);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            lifecycleObserver2 = (LifecycleObserver) objectRef.element;
            if (lifecycleObserver2 != null) {
                lifecycle2.removeObserver(lifecycleObserver2);
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            lifecycle2 = lifecycle;
            objectRef = objectRef2;
            th = th3;
            lifecycleObserver = (LifecycleObserver) objectRef.element;
            if (lifecycleObserver != null) {
                lifecycle2.removeObserver(lifecycleObserver);
            }
            throw th;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements DefaultLifecycleObserver {
        private /* synthetic */ MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentbindingInflater1(MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
        }

        @Override // androidx.p002lifecycle.DefaultLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            MediaFormatMustNotUseFrameRateToFindEncoderQuirk<Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Result.Companion companion = Result.INSTANCE;
            mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(Unit.INSTANCE));
        }
    }

    public static final void b(Lifecycle lifecycle, LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        lifecycle.addObserver(lifecycleObserver);
    }
}
