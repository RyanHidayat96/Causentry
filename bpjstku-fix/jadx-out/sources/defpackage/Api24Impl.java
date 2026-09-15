package defpackage;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes4.dex */
public final class Api24Impl<T> extends deriveCodec<T> {
    final T TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
    private generateBackupProfile<? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final readableMs<? super Throwable, ? extends T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public Api24Impl(generateBackupProfile<? extends T> generatebackupprofile, readableMs<? super Throwable, ? extends T> readablems) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = generatebackupprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(getdefaultvideoprofile));
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getDefaultVideoProfile<T> {
        private final getDefaultVideoProfile<? super T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
            this.b = getdefaultvideoprofile;
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            T tApply;
            if (Api24Impl.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                try {
                    tApply = Api24Impl.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.apply(th);
                } catch (Throwable th2) {
                    dumpMediaCodecListForFormat.b(th2);
                    this.b.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                tApply = Api24Impl.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            if (tApply == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.b.onError(nullPointerException);
                return;
            }
            this.b.b(tApply);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            this.b.onSubscribe(bufferProviderState);
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            this.b.b(t);
        }
    }
}
