package defpackage;

import io.reactivex.internal.schedulers.ExecutorScheduler;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class isSamsungJ2 {
    private static appendBackupVideoProfile TuitionPaymentFragmentbindingInflater1;
    private static appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private static appendBackupVideoProfile b;

    static final class g {
        static final appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new isClientSilenced();

        g() {
        }
    }

    static final class b {
        static final appendBackupVideoProfile b = new Api29Impl();

        b() {
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        static final appendBackupVideoProfile b = new getInputChannelCountRanges();

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        static final appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new unregisterAudioRecordingCallback();

        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }
    }

    static {
        a aVar = new a();
        share.b(aVar, "Scheduler Callable can't be null");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentbindingInflater1(aVar);
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1();
        share.b(tuitionPaymentFragmentbindingInflater1, "Scheduler Callable can't be null");
        b = DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        share.b(tuitionPaymentFragmentspecialinlinedviewModeldefault1, "Scheduler Callable can't be null");
        TuitionPaymentFragmentbindingInflater1 = DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = AudioTimestampFramePositionIncorrectQuirk.b();
        asInterface asinterface = new asInterface();
        share.b(asinterface, "Scheduler Callable can't be null");
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentbindingInflater1(asinterface);
    }

    public static appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return b;
    }

    public static appendBackupVideoProfile b() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    public static appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static appendBackupVideoProfile TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static appendBackupVideoProfile b(Executor executor) {
        return new ExecutorScheduler(executor);
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Callable<appendBackupVideoProfile> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ appendBackupVideoProfile call() throws Exception {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
        }
    }

    static final class asInterface implements Callable<appendBackupVideoProfile> {
        asInterface() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ appendBackupVideoProfile call() throws Exception {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }

    static final class a implements Callable<appendBackupVideoProfile> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ appendBackupVideoProfile call() throws Exception {
            return g.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements Callable<appendBackupVideoProfile> {
        TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ appendBackupVideoProfile call() throws Exception {
            return b.b;
        }
    }
}
