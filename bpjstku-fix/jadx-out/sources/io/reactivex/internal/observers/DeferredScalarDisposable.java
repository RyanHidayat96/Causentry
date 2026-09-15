package io.reactivex.internal.observers;

import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.deriveMediaType;

/* JADX INFO: loaded from: classes4.dex */
public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    private static final long serialVersionUID = -5502432239815349361L;
    public final deriveMediaType<? super T> downstream;
    protected T value;

    public DeferredScalarDisposable(deriveMediaType<? super T> derivemediatype) {
        this.downstream = derivemediatype;
    }

    @Override // defpackage.VideoValidatedEncoderProfilesProxy
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(T t) {
        int i = get();
        if ((i & 54) == 0) {
            deriveMediaType<? super T> derivemediatype = this.downstream;
            if (i == 8) {
                this.value = t;
                lazySet(16);
                derivemediatype.onNext(null);
            } else {
                lazySet(2);
                derivemediatype.onNext(t);
            }
            if (get() != 4) {
                derivemediatype.onComplete();
            }
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
        if ((get() & 54) != 0) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        } else {
            lazySet(2);
            this.downstream.onError(th);
        }
    }

    public final void b() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.downstream.onComplete();
    }

    @Override // defpackage.AudioSettingsBuilder
    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return get() != 16;
    }

    @Override // defpackage.AudioSettingsBuilder
    public final void TuitionPaymentFragmentbindingInflater1() {
        lazySet(32);
        this.value = null;
    }

    @Override // defpackage.BufferProviderState
    public void dispose() {
        set(4);
        this.value = null;
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return get() == 4;
    }
}
