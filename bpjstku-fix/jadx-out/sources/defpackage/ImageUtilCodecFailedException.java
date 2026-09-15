package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageUtilCodecFailedException {
    static ImageUtilCodecFailedException TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    HandlerThread TuitionPaymentFragmentbindingInflater1;
    public Handler TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    int b = 0;
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Object();

    ImageUtilCodecFailedException() {
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                if (this.b <= 0) {
                    throw new IllegalStateException("CameraThread is not open");
                }
                HandlerThread handlerThread = new HandlerThread("CameraThread");
                this.TuitionPaymentFragmentbindingInflater1 = handlerThread;
                handlerThread.start();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Handler(this.TuitionPaymentFragmentbindingInflater1.getLooper());
            }
        }
    }
}
