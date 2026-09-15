package io.reactivex.internal.subscribers;

import defpackage.AudioConfig;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.OutputTransform;
import defpackage.VideoRecordEventPause;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class StrictSubscriber<T> extends AtomicInteger implements VideoRecordEventPause<T>, OutputTransform {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final AudioConfig<? super T> downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<OutputTransform> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(AudioConfig<? super T> audioConfig) {
        this.downstream = audioConfig;
    }

    @Override // defpackage.OutputTransform
    public final void b() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(this.upstream);
    }

    @Override // defpackage.VideoRecordEventPause, defpackage.AudioConfig
    public final void b(OutputTransform outputTransform) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.b(this);
            SubscriptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.upstream, this.requested, outputTransform);
        } else {
            outputTransform.b();
            if (!this.done) {
                SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(this.upstream);
            }
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // defpackage.AudioConfig
    public void onNext(T t) {
        AudioConfig<? super T> audioConfig = this.downstream;
        AtomicThrowable atomicThrowable = this.error;
        if (get() == 0 && compareAndSet(0, 1)) {
            audioConfig.onNext(t);
            if (decrementAndGet() != 0) {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    audioConfig.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    audioConfig.onComplete();
                }
            }
        }
    }

    @Override // defpackage.AudioConfig
    public void onError(Throwable th) {
        this.done = true;
        AudioConfig<? super T> audioConfig = this.downstream;
        AtomicThrowable atomicThrowable = this.error;
        if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th)) {
            if (getAndIncrement() == 0) {
                audioConfig.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                return;
            }
            return;
        }
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
    }

    @Override // defpackage.AudioConfig
    public void onComplete() {
        this.done = true;
        AudioConfig<? super T> audioConfig = this.downstream;
        AtomicThrowable atomicThrowable = this.error;
        if (getAndIncrement() == 0) {
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                audioConfig.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            } else {
                audioConfig.onComplete();
            }
        }
    }

    @Override // defpackage.OutputTransform
    public final void b(long j) {
        if (j > 0) {
            SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, this.requested, j);
            return;
        }
        if (!this.done) {
            SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(this.upstream);
        }
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was ".concat(String.valueOf(j))));
    }
}
