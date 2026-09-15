package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class Api29Impl extends appendBackupVideoProfile {
    static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static RxThreadFactory TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreadFactory f63a;
    private AtomicReference<TuitionPaymentFragmentspecialinlinedviewModeldefault1> asInterface;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iAvailableProcessors;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(new RxThreadFactory("RxComputationShutdown"));
        TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = rxThreadFactory;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(0, rxThreadFactory);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        for (TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 : tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault4.dispose();
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private long TuitionPaymentFragmentbindingInflater1;
        final TuitionPaymentFragmentspecialinlinedviewModeldefault3[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, ThreadFactory threadFactory) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i2] = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(threadFactory);
            }
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i == 0) {
                return Api29Impl.TuitionPaymentFragmentbindingInflater1;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3[] tuitionPaymentFragmentspecialinlinedviewModeldefault3Arr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j = this.TuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentbindingInflater1 = 1 + j;
            return tuitionPaymentFragmentspecialinlinedviewModeldefault3Arr[(int) (j % ((long) i))];
        }
    }

    public Api29Impl() {
        this(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    private Api29Impl(ThreadFactory threadFactory) {
        this.f63a = threadFactory;
        this.asInterface = new AtomicReference<>(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    @Override // defpackage.appendBackupVideoProfile
    public final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new b(this.asInterface.get().TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    }

    @Override // defpackage.appendBackupVideoProfile
    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.asInterface.get().TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault3(runnable, j, timeUnit);
    }

    @Override // defpackage.appendBackupVideoProfile
    public final BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.asInterface.get().TuitionPaymentFragmentspecialinlinedviewModeldefault2().TuitionPaymentFragmentspecialinlinedviewModeldefault2(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.appendBackupVideoProfile
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.f63a);
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.asInterface, TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return;
        }
        for (TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 : tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
        }
    }

    static final class b extends appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private final acquireBuffer TuitionPaymentFragmentbindingInflater1;
        private final getCapabilitiesByQualityFor TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final getCapabilitiesByQualityFor b;

        b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getCapabilitiesByQualityFor getcapabilitiesbyqualityfor = new getCapabilitiesByQualityFor();
            this.b = getcapabilitiesbyqualityfor;
            acquireBuffer acquirebuffer = new acquireBuffer();
            this.TuitionPaymentFragmentbindingInflater1 = acquirebuffer;
            getCapabilitiesByQualityFor getcapabilitiesbyqualityfor2 = new getCapabilitiesByQualityFor();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getcapabilitiesbyqualityfor2;
            getcapabilitiesbyqualityfor2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getcapabilitiesbyqualityfor);
            getcapabilitiesbyqualityfor2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(acquirebuffer);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return EmptyDisposable.INSTANCE;
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(runnable, 0L, TimeUnit.MILLISECONDS, this.b);
        }

        @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                return EmptyDisposable.INSTANCE;
            }
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(runnable, j, timeUnit, this.TuitionPaymentFragmentbindingInflater1);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends registerAudioRecordingCallback {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}
