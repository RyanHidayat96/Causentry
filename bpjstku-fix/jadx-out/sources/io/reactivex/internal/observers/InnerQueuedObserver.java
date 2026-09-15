package io.reactivex.internal.observers;

import defpackage.AudioSettingsBuilder;
import defpackage.BufferProviderState;
import defpackage.SharedByteBuffer;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.lambdanotifySuspended10;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class InnerQueuedObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, BufferProviderState {
    private static final long serialVersionUID = -5417183359794346637L;
    public volatile boolean done;
    int fusionMode;
    final lambdanotifySuspended10<T> parent;
    final int prefetch;
    public AudioSettingsBuilder<T> queue;

    public InnerQueuedObserver(lambdanotifySuspended10<T> lambdanotifysuspended10, int i) {
        this.parent = lambdanotifysuspended10;
        this.prefetch = i;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        AudioSettingsBuilder<T> spscArrayQueue;
        if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState)) {
            if (bufferProviderState instanceof SharedByteBuffer) {
                SharedByteBuffer sharedByteBuffer = (SharedByteBuffer) bufferProviderState;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(3);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
                    this.fusionMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    this.queue = sharedByteBuffer;
                    this.done = true;
                    this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                    return;
                }
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                    this.fusionMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    this.queue = sharedByteBuffer;
                    return;
                }
            }
            int i = -this.prefetch;
            if (i < 0) {
                spscArrayQueue = new createMediaMuxer<>(-i);
            } else {
                spscArrayQueue = new SpscArrayQueue<>(i);
            }
            this.queue = spscArrayQueue;
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        if (this.fusionMode == 0) {
            this.parent.b(this, t);
        } else {
            this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, th);
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
    }
}
