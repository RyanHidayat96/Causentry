package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class SilentAudioStreamExternalSyntheticLambda0<T> extends deriveCodec<T> {
    private logToString<? super BufferProviderState> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private generateBackupProfile<T> b;

    public SilentAudioStreamExternalSyntheticLambda0(generateBackupProfile<T> generatebackupprofile, logToString<? super BufferProviderState> logtostring) {
        this.b = generatebackupprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = logtostring;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        this.b.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(getdefaultvideoprofile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> implements getDefaultVideoProfile<T> {
        private logToString<? super BufferProviderState> TuitionPaymentFragmentbindingInflater1;
        private getDefaultVideoProfile<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(getDefaultVideoProfile<? super T> getdefaultvideoprofile, logToString<? super BufferProviderState> logtostring) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getdefaultvideoprofile;
            this.TuitionPaymentFragmentbindingInflater1 = logtostring;
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            try {
                this.TuitionPaymentFragmentbindingInflater1.accept(bufferProviderState);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onSubscribe(bufferProviderState);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                bufferProviderState.dispose();
                EmptyDisposable.b(th, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(t);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.onError(th);
            }
        }
    }
}
