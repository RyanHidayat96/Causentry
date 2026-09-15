package androidx.concurrent.futures;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.MediaFormatMustNotUseFrameRateToFindEncoderQuirk;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/concurrent/futures/ToContinuation;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Runnable;", "Lcom/google/common/util/concurrent/ListenableFuture;", "p0", "LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "p1", "<init>", "(Lcom/google/common/util/concurrent/ListenableFuture;LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;)V", "", "run", "()V", "futureToObserve", "Lcom/google/common/util/concurrent/ListenableFuture;", "getFutureToObserve", "()Lcom/google/common/util/concurrent/ListenableFuture;", "continuation", "LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;", "getContinuation", "()LMediaFormatMustNotUseFrameRateToFindEncoderQuirk;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ToContinuation<T> implements Runnable {
    private final MediaFormatMustNotUseFrameRateToFindEncoderQuirk<T> continuation;
    private final ListenableFuture<T> futureToObserve;

    /* JADX WARN: Multi-variable type inference failed */
    public ToContinuation(ListenableFuture<T> listenableFuture, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super T> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) {
        this.futureToObserve = listenableFuture;
        this.continuation = mediaFormatMustNotUseFrameRateToFindEncoderQuirk;
    }

    public final ListenableFuture<T> getFutureToObserve() {
        return this.futureToObserve;
    }

    public final MediaFormatMustNotUseFrameRateToFindEncoderQuirk<T> getContinuation() {
        return this.continuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.futureToObserve.isCancelled()) {
            try {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<T> mediaFormatMustNotUseFrameRateToFindEncoderQuirk = this.continuation;
                Result.Companion companion = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk.resumeWith(Result.m8024constructorimpl(AbstractResolvableFuture.getUninterruptibly(this.futureToObserve)));
                return;
            } catch (ExecutionException e2) {
                MediaFormatMustNotUseFrameRateToFindEncoderQuirk<T> mediaFormatMustNotUseFrameRateToFindEncoderQuirk2 = this.continuation;
                Result.Companion companion2 = Result.INSTANCE;
                mediaFormatMustNotUseFrameRateToFindEncoderQuirk2.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(ListenableFutureKt.nonNullCause(e2))));
                return;
            }
        }
        this.continuation.TuitionPaymentFragmentbindingInflater1(null);
    }
}
