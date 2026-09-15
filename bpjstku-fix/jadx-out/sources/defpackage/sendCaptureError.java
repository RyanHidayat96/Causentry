package defpackage;

import android.os.SystemClock;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class sendCaptureError {
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final ScheduledExecutorService TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SurfaceRequestExternalSyntheticLambda5 f1353a;
    public mergeConfigs asBinder;
    public ScheduledFuture<?> d;
    public CaptureNodeExternalSyntheticLambda1 g;
    public long notify;
    private final List<CaptureNodeExternalSyntheticLambda2> onTransact;
    public CaptureNodeExternalSyntheticLambda4 TuitionPaymentFragmentbindingInflater1 = null;
    public CaptureNodeExternalSyntheticLambda4 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    public int asInterface = 0;
    public boolean b = false;
    public final Runnable cancelAll = new Runnable() { // from class: sendCaptureError.4
        @Override // java.lang.Runnable
        public final void run() {
            sendCaptureError sendcaptureerror = sendCaptureError.this;
            synchronized (sendcaptureerror) {
                if (sendcaptureerror.TuitionPaymentFragmentbindingInflater1 == null) {
                    return;
                }
                if ((sendcaptureerror.f1353a.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime()) - sendcaptureerror.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > sendcaptureerror.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        String str = sendCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("timespan difference exceeded");
                    }
                    synchronized (sendcaptureerror) {
                        sendcaptureerror.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                    }
                } else {
                    ScheduledFuture<?> scheduledFuture = sendcaptureerror.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    sendcaptureerror.d = sendcaptureerror.TuitionPaymentFragmentspecialinlinedviewModeldefault3.schedule(sendcaptureerror.cancelAll, sendcaptureerror.notify, TimeUnit.MILLISECONDS);
                }
            }
        }
    };

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("RageTapDetector");
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
    }

    public sendCaptureError(List<CaptureNodeExternalSyntheticLambda2> list, ScheduledExecutorService scheduledExecutorService, SurfaceRequestExternalSyntheticLambda5 surfaceRequestExternalSyntheticLambda5) {
        this.onTransact = Collections.unmodifiableList(list);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = scheduledExecutorService;
        this.f1353a = surfaceRequestExternalSyntheticLambda5;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z) {
        if (this.b) {
            if (this.asInterface >= this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                transform transformVar = new transform(this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.asInterface);
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("rage tap detected: ".concat(String.valueOf(transformVar)));
                }
                Iterator<CaptureNodeExternalSyntheticLambda2> it = this.onTransact.iterator();
                while (it.hasNext()) {
                    it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault1(transformVar, z);
                }
            }
            TuitionPaymentFragmentbindingInflater1();
        }
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        ScheduledFuture<?> scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.d = null;
        }
        this.TuitionPaymentFragmentbindingInflater1 = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        this.asInterface = 0;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CaptureNodeExternalSyntheticLambda4 captureNodeExternalSyntheticLambda4) {
        if (this.asBinder.g > captureNodeExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("discard tap because it partially occurred outside of the session");
            }
            TuitionPaymentFragmentbindingInflater1();
        } else {
            this.TuitionPaymentFragmentbindingInflater1 = captureNodeExternalSyntheticLambda4;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = captureNodeExternalSyntheticLambda4;
            this.asInterface = 1;
        }
    }
}
