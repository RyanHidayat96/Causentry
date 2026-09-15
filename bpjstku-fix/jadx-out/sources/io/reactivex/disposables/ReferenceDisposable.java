package io.reactivex.disposables;

import defpackage.BufferProviderState;
import defpackage.share;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
abstract class ReferenceDisposable<T> extends AtomicReference<T> implements BufferProviderState {
    private static final long serialVersionUID = 6537757548749041217L;

    protected abstract void b(T t);

    ReferenceDisposable(T t) {
        super(share.b(t, "value is null"));
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        b(andSet);
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return get() == null;
    }
}
