package io.reactivex.internal.observers;

import defpackage.BufferProviderState;
import defpackage.deriveMediaType;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class BlockingObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T>, BufferProviderState {
    public static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingObserver(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        this.queue.offer(NotificationLite.TuitionPaymentFragmentbindingInflater1(t));
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        this.queue.offer(NotificationLite.TuitionPaymentFragmentbindingInflater1(th));
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        this.queue.offer(NotificationLite.b());
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        if (DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this)) {
            this.queue.offer(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }
}
