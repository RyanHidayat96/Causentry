package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class Api23Impl<T, R> extends deriveCodec<R> {
    private generateBackupProfile<? extends T> TuitionPaymentFragmentbindingInflater1;
    private readableMs<? super T, ? extends R> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public Api23Impl(generateBackupProfile<? extends T> generatebackupprofile, readableMs<? super T, ? extends R> readablems) {
        this.TuitionPaymentFragmentbindingInflater1 = generatebackupprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super R> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(getdefaultvideoprofile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, R> implements getDefaultVideoProfile<T> {
        private getDefaultVideoProfile<? super R> TuitionPaymentFragmentbindingInflater1;
        private readableMs<? super T, ? extends R> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(getDefaultVideoProfile<? super R> getdefaultvideoprofile, readableMs<? super T, ? extends R> readablems) {
            this.TuitionPaymentFragmentbindingInflater1 = getdefaultvideoprofile;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            this.TuitionPaymentFragmentbindingInflater1.onSubscribe(bufferProviderState);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            try {
                this.TuitionPaymentFragmentbindingInflater1.b(share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                onError(th);
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1.onError(th);
        }
    }
}
