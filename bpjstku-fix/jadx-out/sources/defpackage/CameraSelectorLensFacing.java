package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes3.dex */
final class CameraSelectorLensFacing {
    private final Handler TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Handler(Looper.getMainLooper(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2());
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    CameraSelectorLensFacing() {
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resource<?> resource, boolean z) {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || z) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.obtainMessage(1, resource).sendToTarget();
            } else {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                resource.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
            }
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Handler.Callback {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((Resource) message.obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            return true;
        }
    }
}
