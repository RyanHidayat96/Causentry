package defpackage;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class isHdrEncodingMatched {
    public static final <T> Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Task<T> task, CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    StringBuilder sb = new StringBuilder("Task ");
                    sb.append(task);
                    sb.append(" was cancelled normally.");
                    throw new CancellationException(sb.toString());
                }
                return task.getResult();
            }
            throw exception;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        task.addOnCompleteListener(isHdrSettingsMatched.INSTANCE, new TuitionPaymentFragmentbindingInflater1(cancellableContinuationImpl2));
        if (cancellationTokenSource != null) {
            cancellableContinuationImpl2.b((Function1<? super Throwable, Unit>) new b(cancellationTokenSource));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    static final class TuitionPaymentFragmentbindingInflater1<TResult> implements OnCompleteListener {
        private /* synthetic */ MediaFormatMustNotUseFrameRateToFindEncoderQuirk<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception == null) {
                if (!task.isCanceled()) {
                    Continuation continuation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m8024constructorimpl(task.getResult()));
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(null);
                return;
            }
            Continuation continuation2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Result.Companion companion2 = Result.INSTANCE;
            continuation2.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(exception)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentbindingInflater1(MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super T> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
        }
    }

    static final class b implements Function1<Throwable, Unit> {
        private /* synthetic */ CancellationTokenSource b;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            this.b.cancel();
            return Unit.INSTANCE;
        }

        b(CancellationTokenSource cancellationTokenSource) {
            this.b = cancellationTokenSource;
        }
    }
}
