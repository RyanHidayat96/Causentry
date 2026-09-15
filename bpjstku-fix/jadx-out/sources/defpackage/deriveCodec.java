package defpackage;

import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleCreate;
import io.reactivex.internal.operators.single.SingleZipArray;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class deriveCodec<T> implements generateBackupProfile<T> {
    protected abstract void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile);

    public static <T> deriveCodec<T> b(scaleBitrate<T> scalebitrate) {
        share.b(scalebitrate, "source is null");
        return new SingleCreate(scalebitrate);
    }

    public static <T> deriveCodec<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
        share.b(th, "exception is null");
        Callable callableTuitionPaymentFragmentbindingInflater1 = Functions.TuitionPaymentFragmentbindingInflater1(th);
        share.b(callableTuitionPaymentFragmentbindingInflater1, "errorSupplier is null");
        return new SilentAudioStream(callableTuitionPaymentFragmentbindingInflater1);
    }

    public static <T> deriveCodec<T> b(Callable<? extends T> callable) {
        share.b(callable, "callable is null");
        return new blockUntilSystemTimeReached(callable);
    }

    public static <T> deriveCodec<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
        share.b(t, "item is null");
        return new createAudioRecordBuilder(t);
    }

    public static <T> deriveCodec<T> b(generateBackupProfile<T> generatebackupprofile) {
        share.b(generatebackupprofile, "source is null");
        if (generatebackupprofile instanceof deriveCodec) {
            return (deriveCodec) generatebackupprofile;
        }
        return new getClientAudioSessionId(generatebackupprofile);
    }

    public static <T, R> deriveCodec<R> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Iterable<? extends generateBackupProfile<? extends T>> iterable, readableMs<? super Object[], ? extends R> readablems) {
        share.b(readablems, "zipper is null");
        share.b(iterable, "sources is null");
        return new getActiveRecordingConfiguration(iterable, readablems);
    }

    public static <T1, T2, R> deriveCodec<R> TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateBackupProfile<? extends T1> generatebackupprofile, generateBackupProfile<? extends T2> generatebackupprofile2, dumpCodecCapabilities<? super T1, ? super T2, ? extends R> dumpcodeccapabilities) {
        share.b(generatebackupprofile, "source1 is null");
        share.b(generatebackupprofile2, "source2 is null");
        readableMs readablemsB = Functions.b(dumpcodeccapabilities);
        generateBackupProfile[] generatebackupprofileArr = {generatebackupprofile, generatebackupprofile2};
        share.b(readablemsB, "zipper is null");
        share.b(generatebackupprofileArr, "sources is null");
        return new SingleZipArray(generatebackupprofileArr, readablemsB);
    }

    public final T b() {
        AudioSource audioSource = new AudioSource();
        TuitionPaymentFragmentbindingInflater1(audioSource);
        return (T) audioSource.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault3(logToString<? super T> logtostring, logToString<? super Throwable> logtostring2) {
        share.b(logtostring, "onSuccess is null");
        share.b(logtostring2, "onError is null");
        ConsumerSingleObserver consumerSingleObserver = new ConsumerSingleObserver(logtostring, logtostring2);
        TuitionPaymentFragmentbindingInflater1(consumerSingleObserver);
        return consumerSingleObserver;
    }

    @Override // defpackage.generateBackupProfile
    public final void TuitionPaymentFragmentbindingInflater1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        share.b(getdefaultvideoprofile, "observer is null");
        share.b(getdefaultvideoprofile, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(getdefaultvideoprofile);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
