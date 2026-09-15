package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getAudioFormat<T, R> implements deriveMediaType<T>, SharedByteBuffer<R> {
    public final deriveMediaType<? super R> TuitionPaymentFragmentbindingInflater1;
    private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public SharedByteBuffer<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public boolean b;

    public getAudioFormat(deriveMediaType<? super R> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1 = derivemediatype;
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        if (DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bufferProviderState)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bufferProviderState;
            if (bufferProviderState instanceof SharedByteBuffer) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (SharedByteBuffer) bufferProviderState;
            }
            this.TuitionPaymentFragmentbindingInflater1.onSubscribe(this);
        }
    }

    @Override // defpackage.deriveMediaType
    public void onError(Throwable th) {
        if (this.b) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        } else {
            this.b = true;
            this.TuitionPaymentFragmentbindingInflater1.onError(th);
        }
    }

    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        dumpMediaCodecListForFormat.b(th);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
        onError(th);
    }

    @Override // defpackage.deriveMediaType
    public void onComplete() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.TuitionPaymentFragmentbindingInflater1.onComplete();
    }

    protected final int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        SharedByteBuffer<T> sharedByteBuffer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (sharedByteBuffer == null || (i & 4) != 0) {
            return 0;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.BufferProviderState
    public void dispose() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
    }

    @Override // defpackage.BufferProviderState
    public boolean isDisposed() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed();
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // defpackage.AudioSettingsBuilder
    public void TuitionPaymentFragmentbindingInflater1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
