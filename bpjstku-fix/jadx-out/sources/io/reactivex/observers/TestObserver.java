package io.reactivex.observers;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.BufferProviderState;
import defpackage.CameraUseInconsistentTimebaseQuirk;
import defpackage.VideoOutputSourceState;
import defpackage.deriveMediaType;
import defpackage.errorToString;
import defpackage.getDefaultVideoProfile;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class TestObserver<T> extends CameraUseInconsistentTimebaseQuirk<T, TestObserver<T>> implements deriveMediaType<T>, errorToString<T>, getDefaultVideoProfile<T>, VideoOutputSourceState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<BufferProviderState> f1214a;
    private final deriveMediaType<? super T> d;

    /* JADX INFO: loaded from: classes7.dex */
    enum EmptyObserver implements deriveMediaType<Object> {
        INSTANCE;

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(Object obj) {
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    private TestObserver(deriveMediaType<? super T> derivemediatype) {
        this.f1214a = new AtomicReference<>();
        this.d = derivemediatype;
    }

    @Override // defpackage.deriveMediaType
    public void onSubscribe(BufferProviderState bufferProviderState) {
        this.asBinder = Thread.currentThread();
        if (bufferProviderState == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.f1214a, null, bufferProviderState)) {
            bufferProviderState.dispose();
            if (this.f1214a.get() != DisposableHelper.DISPOSED) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(new IllegalStateException("onSubscribe received multiple subscriptions: ".concat(String.valueOf(bufferProviderState))));
                return;
            }
            return;
        }
        int i = this.g;
        this.d.onSubscribe(bufferProviderState);
    }

    @Override // defpackage.deriveMediaType
    public void onNext(T t) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            if (this.f1214a.get() == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.asBinder = Thread.currentThread();
        int i = this.b;
        this.asInterface.add(t);
        if (t == null) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(new NullPointerException("onNext received a null value"));
        }
        this.d.onNext(t);
    }

    @Override // defpackage.deriveMediaType
    public void onError(Throwable th) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            if (this.f1214a.get() == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.asBinder = Thread.currentThread();
            if (th == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(th);
            }
            this.d.onError(th);
        } finally {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.countDown();
        }
    }

    @Override // defpackage.deriveMediaType
    public void onComplete() {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            if (this.f1214a.get() == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.asBinder = Thread.currentThread();
            this.TuitionPaymentFragmentbindingInflater1++;
            this.d.onComplete();
        } finally {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.countDown();
        }
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.f1214a);
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.f1214a.get());
    }

    @Override // defpackage.errorToString
    public final void b(T t) {
        onNext(t);
        onComplete();
    }
}
