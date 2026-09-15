package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public abstract class stopSendingAudio<T, U, V> extends lambdarelease4androidxcameravideointernalaudioAudioSource implements deriveMediaType<T>, isMotoC<U, V> {
    public volatile boolean TuitionPaymentFragmentbindingInflater1;
    public final deriveMediaType<? super V> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final getBytesPerFrame<U> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public Throwable b;

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3(deriveMediaType<? super V> derivemediatype, U u) {
    }

    public stopSendingAudio(deriveMediaType<? super V> derivemediatype, getBytesPerFrame<U> getbytesperframe) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getbytesperframe;
    }

    @Override // defpackage.isMotoC
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.isMotoC
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    protected final void b(U u, BufferProviderState bufferProviderState) {
        deriveMediaType<? super V> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        getBytesPerFrame<U> getbytesperframe = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (this.g.get() == 0 && this.g.compareAndSet(0, 1)) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivemediatype, u);
            if (this.g.addAndGet(-1) == 0) {
                return;
            }
        } else {
            getbytesperframe.TuitionPaymentFragmentbindingInflater1(u);
            if (this.g.getAndIncrement() != 0) {
                return;
            }
        }
        isAffectedSamsungDevice.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getbytesperframe, derivemediatype, false, bufferProviderState, this);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(U u, boolean z, BufferProviderState bufferProviderState) {
        deriveMediaType<? super V> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        getBytesPerFrame<U> getbytesperframe = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (this.g.get() == 0 && this.g.compareAndSet(0, 1)) {
            if (getbytesperframe.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivemediatype, u);
                if (this.g.addAndGet(-1) == 0) {
                    return;
                }
            } else {
                getbytesperframe.TuitionPaymentFragmentbindingInflater1(u);
            }
        } else {
            getbytesperframe.TuitionPaymentFragmentbindingInflater1(u);
            if (this.g.getAndIncrement() != 0) {
                return;
            }
        }
        isAffectedSamsungDevice.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getbytesperframe, derivemediatype, false, bufferProviderState, this);
    }

    @Override // defpackage.isMotoC
    public final Throwable b() {
        return this.b;
    }

    @Override // defpackage.isMotoC
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        return this.g.addAndGet(i);
    }
}
