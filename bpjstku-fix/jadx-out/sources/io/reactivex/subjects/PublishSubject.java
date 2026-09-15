package io.reactivex.subjects;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.ExtraSupportedQualityQuirk;
import defpackage.deriveMediaType;
import defpackage.share;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class PublishSubject<T> extends ExtraSupportedQualityQuirk<T> {
    private static PublishDisposable[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new PublishDisposable[0];
    private static PublishDisposable[] b = new PublishDisposable[0];
    private Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private AtomicReference<PublishDisposable<T>[]> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AtomicReference<>(b);

    public static <T> PublishSubject<T> b() {
        return new PublishSubject<>();
    }

    PublishSubject() {
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(derivemediatype, this);
        derivemediatype.onSubscribe(publishDisposable);
        do {
            publishDisposableArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (publishDisposableArr == TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                Throwable th = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (th != null) {
                    derivemediatype.onError(th);
                    return;
                } else {
                    derivemediatype.onComplete();
                    return;
                }
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, publishDisposableArr, publishDisposableArr2));
        if (publishDisposable.isDisposed()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(publishDisposable);
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
            if (publishDisposableArr == TuitionPaymentFragmentspecialinlinedviewModeldefault1 || publishDisposableArr == b) {
                return;
            }
            int length = publishDisposableArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishDisposableArr[i] == publishDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = b;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i);
                System.arraycopy(publishDisposableArr, i + 1, publishDisposableArr3, i, (length - i) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, publishDisposableArr, publishDisposableArr2));
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get() == TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            bufferProviderState.dispose();
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        share.b(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable<T> publishDisposable : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.downstream.onNext(t);
            }
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        share.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishDisposable<T>[] publishDisposableArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
        PublishDisposable<T>[] publishDisposableArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (publishDisposableArr == publishDisposableArr2) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = th;
        for (PublishDisposable<T> publishDisposable : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAndSet(publishDisposableArr2)) {
            if (publishDisposable.get()) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                publishDisposable.downstream.onError(th);
            }
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get();
        PublishDisposable<T>[] publishDisposableArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (publishDisposableArr != publishDisposableArr2) {
            for (PublishDisposable<T> publishDisposable : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getAndSet(publishDisposableArr2)) {
                if (!publishDisposable.get()) {
                    publishDisposable.downstream.onComplete();
                }
            }
        }
    }

    static final class PublishDisposable<T> extends AtomicBoolean implements BufferProviderState {
        private static final long serialVersionUID = 3562861878281475070L;
        final deriveMediaType<? super T> downstream;
        final PublishSubject<T> parent;

        PublishDisposable(deriveMediaType<? super T> derivemediatype, PublishSubject<T> publishSubject) {
            this.downstream = derivemediatype;
            this.parent = publishSubject;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get();
        }
    }
}
