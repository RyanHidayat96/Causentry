package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.single.SingleZipArray;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class getActiveRecordingConfiguration<T, R> extends deriveCodec<R> {
    final readableMs<? super Object[], ? extends R> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Iterable<? extends generateBackupProfile<? extends T>> b;

    public getActiveRecordingConfiguration(Iterable<? extends generateBackupProfile<? extends T>> iterable, readableMs<? super Object[], ? extends R> readablems) {
        this.b = iterable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = readablems;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super R> getdefaultvideoprofile) {
        generateBackupProfile[] generatebackupprofileArr = new generateBackupProfile[8];
        try {
            int i = 0;
            for (generateBackupProfile<? extends T> generatebackupprofile : this.b) {
                if (generatebackupprofile == null) {
                    EmptyDisposable.b(new NullPointerException("One of the sources is null"), getdefaultvideoprofile);
                    return;
                }
                if (i == generatebackupprofileArr.length) {
                    generatebackupprofileArr = (generateBackupProfile[]) Arrays.copyOf(generatebackupprofileArr, (i >> 2) + i);
                }
                generatebackupprofileArr[i] = generatebackupprofile;
                i++;
            }
            if (i == 0) {
                EmptyDisposable.b(new NoSuchElementException(), getdefaultvideoprofile);
                return;
            }
            if (i == 1) {
                generatebackupprofileArr[0].TuitionPaymentFragmentbindingInflater1(new Api23Impl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getdefaultvideoprofile, new TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
                return;
            }
            SingleZipArray.ZipCoordinator zipCoordinator = new SingleZipArray.ZipCoordinator(getdefaultvideoprofile, i, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            getdefaultvideoprofile.onSubscribe(zipCoordinator);
            for (int i2 = 0; i2 < i && !zipCoordinator.isDisposed(); i2++) {
                generatebackupprofileArr[i2].TuitionPaymentFragmentbindingInflater1(zipCoordinator.observers[i2]);
            }
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            EmptyDisposable.b(th, getdefaultvideoprofile);
        }
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements readableMs<T, R> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // defpackage.readableMs
        public final R apply(T t) throws Exception {
            return (R) share.b(getActiveRecordingConfiguration.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.apply(new Object[]{t}), "The zipper returned a null value");
        }
    }
}
