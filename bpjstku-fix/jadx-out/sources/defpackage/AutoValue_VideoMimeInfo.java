package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_VideoMimeInfo extends AutoValue_VideoMimeInfo1 implements selectSampleRateOrNearestSupported {
    private final Executor TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AutoValue_VideoMimeInfo(Executor executor) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.AutoValue_VideoMimeInfo1
    public final Executor TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static ScheduledFuture<?> TuitionPaymentFragmentbindingInflater1(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            TuitionPaymentFragmentbindingInflater1(coroutineContext, e2);
            return null;
        }
    }

    private static void TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        CancellationException cancellationException = new CancellationException("The task was rejected");
        cancellationException.initCause(rejectedExecutionException);
        VideoMimeInfoBuilder videoMimeInfoBuilder = (VideoMimeInfoBuilder) coroutineContext.get(VideoMimeInfoBuilder.b);
        if (videoMimeInfoBuilder != null) {
            videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(cancellationException);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AutoValue_VideoMimeInfo) && ((AutoValue_VideoMimeInfo) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3 == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.execute(runnable);
        } catch (RejectedExecutionException e2) {
            TuitionPaymentFragmentbindingInflater1(coroutineContext, e2);
            Dispatchers.getIO().dispatch(coroutineContext, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public final setCompatibleAudioProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> scheduledFutureTuitionPaymentFragmentbindingInflater1 = scheduledExecutorService != null ? TuitionPaymentFragmentbindingInflater1(scheduledExecutorService, runnable, coroutineContext, j) : null;
        if (scheduledFutureTuitionPaymentFragmentbindingInflater1 != null) {
            return new AudioSettingsDefaultResolver(scheduledFutureTuitionPaymentFragmentbindingInflater1);
        }
        return resolveAudioSettings.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, runnable, coroutineContext);
    }

    @Override // defpackage.selectSampleRateOrNearestSupported
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, MediaFormatMustNotUseFrameRateToFindEncoderQuirk<? super Unit> mediaFormatMustNotUseFrameRateToFindEncoderQuirk) throws Throwable {
        Executor executor = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture<?> scheduledFutureTuitionPaymentFragmentbindingInflater1 = scheduledExecutorService != null ? TuitionPaymentFragmentbindingInflater1(scheduledExecutorService, new AutoValue_VideoEncoderConfigBuilder(this, mediaFormatMustNotUseFrameRateToFindEncoderQuirk), mediaFormatMustNotUseFrameRateToFindEncoderQuirk.get$context(), j) : null;
        if (scheduledFutureTuitionPaymentFragmentbindingInflater1 != null) {
            isMpeg4 ismpeg4 = new isMpeg4(scheduledFutureTuitionPaymentFragmentbindingInflater1);
            if (!(mediaFormatMustNotUseFrameRateToFindEncoderQuirk instanceof CancellableContinuationImpl)) {
                throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
            }
            ((CancellableContinuationImpl) mediaFormatMustNotUseFrameRateToFindEncoderQuirk).TuitionPaymentFragmentspecialinlinedviewModeldefault1(ismpeg4);
            return;
        }
        resolveAudioSettings.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(j, mediaFormatMustNotUseFrameRateToFindEncoderQuirk);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString();
    }
}
