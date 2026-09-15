package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes4.dex */
public final class ExcludeStretchedVideoQualityQuirk<T> implements deriveMediaType<T>, BufferProviderState {
    private getMinInputChannelCount<Object> TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BufferProviderState f138a;
    private boolean b;

    public ExcludeStretchedVideoQualityQuirk(deriveMediaType<? super T> derivemediatype) {
        this(derivemediatype, (byte) 0);
    }

    private ExcludeStretchedVideoQualityQuirk(deriveMediaType<? super T> derivemediatype, byte b) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivemediatype;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        if (DisposableHelper.b(this.f138a, bufferProviderState)) {
            this.f138a = bufferProviderState;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onSubscribe(this);
        }
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        this.f138a.dispose();
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this.f138a.isDisposed();
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return;
        }
        if (t == null) {
            this.f138a.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            if (this.b) {
                getMinInputChannelCount<Object> getmininputchannelcount = this.TuitionPaymentFragmentbindingInflater1;
                if (getmininputchannelcount == null) {
                    getmininputchannelcount = new getMinInputChannelCount<>();
                    this.TuitionPaymentFragmentbindingInflater1 = getmininputchannelcount;
                }
                getmininputchannelcount.TuitionPaymentFragmentspecialinlinedviewModeldefault1(NotificationLite.TuitionPaymentFragmentbindingInflater1(t));
                return;
            }
            this.b = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onNext(t);
            while (true) {
                synchronized (this) {
                    getMinInputChannelCount<Object> getmininputchannelcount2 = this.TuitionPaymentFragmentbindingInflater1;
                    if (getmininputchannelcount2 == null) {
                        this.b = false;
                        return;
                    }
                    this.TuitionPaymentFragmentbindingInflater1 = null;
                    deriveMediaType<? super T> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i = getmininputchannelcount2.b;
                    for (Object[] objArr = getmininputchannelcount2.TuitionPaymentFragmentspecialinlinedviewModeldefault3; objArr != null; objArr = objArr[i]) {
                        for (int i2 = 0; i2 < i; i2++) {
                            Object[] objArr2 = objArr[i2];
                            if (objArr2 == null) {
                                break;
                            } else {
                                if (NotificationLite.b(objArr2, derivemediatype)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                if (this.b) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                    getMinInputChannelCount<Object> getmininputchannelcount = this.TuitionPaymentFragmentbindingInflater1;
                    if (getmininputchannelcount == null) {
                        getmininputchannelcount = new getMinInputChannelCount<>();
                        this.TuitionPaymentFragmentbindingInflater1 = getmininputchannelcount;
                    }
                    getmininputchannelcount.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = NotificationLite.TuitionPaymentFragmentbindingInflater1(th);
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                this.b = true;
                z = false;
            }
            if (z) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onError(th);
            }
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return;
        }
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            if (this.b) {
                getMinInputChannelCount<Object> getmininputchannelcount = this.TuitionPaymentFragmentbindingInflater1;
                if (getmininputchannelcount == null) {
                    getmininputchannelcount = new getMinInputChannelCount<>();
                    this.TuitionPaymentFragmentbindingInflater1 = getmininputchannelcount;
                }
                getmininputchannelcount.TuitionPaymentFragmentspecialinlinedviewModeldefault1(NotificationLite.b());
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.b = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onComplete();
        }
    }
}
