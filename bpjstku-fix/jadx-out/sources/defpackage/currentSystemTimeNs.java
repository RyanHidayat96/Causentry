package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class currentSystemTimeNs<T> extends deriveCodec<T> {
    private generateBackupProfile<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final logToString<? super T> b;

    public currentSystemTimeNs(generateBackupProfile<T> generatebackupprofile, logToString<? super T> logtostring) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = generatebackupprofile;
        this.b = logtostring;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault1(getdefaultvideoprofile));
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getDefaultVideoProfile<T> {
        private getDefaultVideoProfile<? super T> TuitionPaymentFragmentbindingInflater1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
            this.TuitionPaymentFragmentbindingInflater1 = getdefaultvideoprofile;
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            this.TuitionPaymentFragmentbindingInflater1.onSubscribe(bufferProviderState);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            try {
                currentSystemTimeNs.this.b.accept(t);
                this.TuitionPaymentFragmentbindingInflater1.b(t);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.TuitionPaymentFragmentbindingInflater1.onError(th);
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1.onError(th);
        }
    }
}
