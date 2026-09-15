package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class setBufferSizeInBytes<T, R> extends deriveCodec<R> {
    private deriveProfile<? extends R, ? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private generateBackupProfile<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setBufferSizeInBytes(generateBackupProfile<T> generatebackupprofile, deriveProfile<? extends R, ? super T> deriveprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = generatebackupprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = deriveprofile;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super R> getdefaultvideoprofile) {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1((getDefaultVideoProfile) share.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getdefaultvideoprofile), "The onLift returned a null SingleObserver"));
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, getdefaultvideoprofile);
        }
    }
}
