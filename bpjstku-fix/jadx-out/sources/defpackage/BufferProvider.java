package defpackage;

import android.os.Handler;
import android.os.Message;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class BufferProvider extends appendBackupVideoProfile {
    private final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;

    BufferProvider(Handler handler) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = handler;
    }

    @Override // defpackage.appendBackupVideoProfile
    public final appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static final class TuitionPaymentFragmentbindingInflater1 extends appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private final Handler TuitionPaymentFragmentbindingInflater1;
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentbindingInflater1(Handler handler, boolean z) {
            this.TuitionPaymentFragmentbindingInflater1 = handler;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        }

        @Override // appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final BufferProviderState TuitionPaymentFragmentbindingInflater1(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return EmptyDisposable.INSTANCE;
            }
            share.b(runnable, "run is null");
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, runnable);
            Message messageObtain = Message.obtain(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            messageObtain.obj = this;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                messageObtain.setAsynchronous(true);
            }
            this.TuitionPaymentFragmentbindingInflater1.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            this.TuitionPaymentFragmentbindingInflater1.removeCallbacks(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return EmptyDisposable.INSTANCE;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            this.TuitionPaymentFragmentbindingInflater1.removeCallbacksAndMessages(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Runnable, BufferProviderState {
        private final Runnable TuitionPaymentFragmentbindingInflater1;
        private final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private volatile boolean b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(Handler handler, Runnable runnable) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = handler;
            this.TuitionPaymentFragmentbindingInflater1 = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.TuitionPaymentFragmentbindingInflater1.run();
            } catch (Throwable th) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.removeCallbacks(this);
            this.b = true;
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.b;
        }
    }

    @Override // defpackage.appendBackupVideoProfile
    public final BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        share.b(runnable, "run is null");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, runnable);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.sendMessageDelayed(Message.obtain(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault3), timeUnit.toMillis(j));
        return tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
