package defpackage;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes4.dex */
public final class isSamsungJ7Nxt<T> extends ExtraSupportedQualityQuirk<T> implements getMinInputChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2<Object> {
    private getMinInputChannelCount<Object> TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private ExtraSupportedQualityQuirk<T> b;

    public isSamsungJ7Nxt(ExtraSupportedQualityQuirk<T> extraSupportedQualityQuirk) {
        this.b = extraSupportedQualityQuirk;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.b.subscribe(derivemediatype);
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            synchronized (this) {
                boolean z = true;
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        getMinInputChannelCount<Object> getmininputchannelcount = this.TuitionPaymentFragmentbindingInflater1;
                        if (getmininputchannelcount == null) {
                            getmininputchannelcount = new getMinInputChannelCount<>();
                            this.TuitionPaymentFragmentbindingInflater1 = getmininputchannelcount;
                        }
                        getmininputchannelcount.TuitionPaymentFragmentspecialinlinedviewModeldefault1(NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bufferProviderState));
                        return;
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                    z = false;
                }
                if (!z) {
                    this.b.onSubscribe(bufferProviderState);
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    return;
                }
            }
        }
        bufferProviderState.dispose();
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return;
        }
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getMinInputChannelCount<Object> getmininputchannelcount = this.TuitionPaymentFragmentbindingInflater1;
                if (getmininputchannelcount == null) {
                    getmininputchannelcount = new getMinInputChannelCount<>();
                    this.TuitionPaymentFragmentbindingInflater1 = getmininputchannelcount;
                }
                getmininputchannelcount.TuitionPaymentFragmentspecialinlinedviewModeldefault1(NotificationLite.TuitionPaymentFragmentbindingInflater1(t));
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.b.onNext(t);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            return;
        }
        synchronized (this) {
            boolean z = true;
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    getMinInputChannelCount<Object> getmininputchannelcount = this.TuitionPaymentFragmentbindingInflater1;
                    if (getmininputchannelcount == null) {
                        getmininputchannelcount = new getMinInputChannelCount<>();
                        this.TuitionPaymentFragmentbindingInflater1 = getmininputchannelcount;
                    }
                    getmininputchannelcount.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = NotificationLite.TuitionPaymentFragmentbindingInflater1(th);
                    return;
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                z = false;
            }
            if (z) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.b.onError(th);
            }
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            return;
        }
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                getMinInputChannelCount<Object> getmininputchannelcount = this.TuitionPaymentFragmentbindingInflater1;
                if (getmininputchannelcount == null) {
                    getmininputchannelcount = new getMinInputChannelCount<>();
                    this.TuitionPaymentFragmentbindingInflater1 = getmininputchannelcount;
                }
                getmininputchannelcount.TuitionPaymentFragmentspecialinlinedviewModeldefault1(NotificationLite.b());
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.b.onComplete();
        }
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        getMinInputChannelCount<Object> getmininputchannelcount;
        while (true) {
            synchronized (this) {
                getmininputchannelcount = this.TuitionPaymentFragmentbindingInflater1;
                if (getmininputchannelcount == null) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                    return;
                }
                this.TuitionPaymentFragmentbindingInflater1 = null;
            }
            getmininputchannelcount.TuitionPaymentFragmentspecialinlinedviewModeldefault1((getMinInputChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2<? super Object>) this);
        }
    }

    @Override // getMinInputChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2, defpackage.findQualityInTargetQualities
    public final boolean b(Object obj) {
        return NotificationLite.b(obj, this.b);
    }
}
