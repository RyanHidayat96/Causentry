package com.dynatrace.android.ragetap.measure;

import android.os.SystemClock;
import android.view.MotionEvent;
import defpackage.CaptureNodeExternalSyntheticLambda1;
import defpackage.CaptureNodeExternalSyntheticLambda3;
import defpackage.CaptureNodeExternalSyntheticLambda4;
import defpackage.CaptureNodeExternalSyntheticLambda5;
import defpackage.SurfaceRequestExternalSyntheticLambda1;
import defpackage.SurfaceRequestExternalSyntheticLambda5;
import defpackage.ViewPort;
import defpackage.processJpegImage;
import defpackage.sendCaptureError;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class TapMonitor implements processJpegImage {
    private static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final CaptureNodeExternalSyntheticLambda3 TuitionPaymentFragmentbindingInflater1;
    private State TuitionPaymentFragmentspecialinlinedviewModeldefault1 = State.NO_TAP;
    private final sendCaptureError TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final SurfaceRequestExternalSyntheticLambda5 asInterface;
    private CaptureNodeExternalSyntheticLambda5 b;

    enum State {
        NO_TAP,
        TAP_DOWN,
        INVALID_TAP_STATE
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("TapMonitor");
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sb.toString();
    }

    public TapMonitor(sendCaptureError sendcaptureerror, CaptureNodeExternalSyntheticLambda3 captureNodeExternalSyntheticLambda3, SurfaceRequestExternalSyntheticLambda5 surfaceRequestExternalSyntheticLambda5) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = sendcaptureerror;
        this.TuitionPaymentFragmentbindingInflater1 = captureNodeExternalSyntheticLambda3;
        this.asInterface = surfaceRequestExternalSyntheticLambda5;
    }

    @Override // defpackage.processJpegImage
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.b = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionEvent, this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = State.TAP_DOWN;
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked == 5 || actionMasked == 6) {
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == State.TAP_DOWN) {
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("multi-touch tap detected");
                        }
                        sendCaptureError sendcaptureerror = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        synchronized (sendcaptureerror) {
                            sendcaptureerror.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                        }
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = State.INVALID_TAP_STATE;
                    this.b = null;
                    return;
                }
                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    StringBuilder sb = new StringBuilder("unexpected event type detected: ");
                    sb.append(motionEvent.toString());
                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb.toString());
                    return;
                }
                return;
            }
            return;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == State.TAP_DOWN) {
            CaptureNodeExternalSyntheticLambda5 captureNodeExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionEvent, this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + SystemClock.elapsedRealtime());
            sendCaptureError sendcaptureerror2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            CaptureNodeExternalSyntheticLambda4 captureNodeExternalSyntheticLambda4 = new CaptureNodeExternalSyntheticLambda4(this.b, captureNodeExternalSyntheticLambda5TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            synchronized (sendcaptureerror2) {
                if (sendcaptureerror2.b) {
                    if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        String str = sendCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        StringBuilder sb2 = new StringBuilder("register tap: ");
                        sb2.append(captureNodeExternalSyntheticLambda4);
                        ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2(sb2.toString());
                    }
                    if (captureNodeExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - captureNodeExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > sendcaptureerror2.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            String str2 = sendCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("tap exceeds click duration");
                        }
                        synchronized (sendcaptureerror2) {
                            sendcaptureerror2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                        }
                    } else if (sendcaptureerror2.TuitionPaymentFragmentbindingInflater1 == null) {
                        sendcaptureerror2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(captureNodeExternalSyntheticLambda4);
                    } else {
                        if (captureNodeExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - sendcaptureerror2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > sendcaptureerror2.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b) {
                            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                String str3 = sendCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("tap exceeds timespan difference");
                            }
                            synchronized (sendcaptureerror2) {
                                sendcaptureerror2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                                sendcaptureerror2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(captureNodeExternalSyntheticLambda4);
                            }
                        } else {
                            CaptureNodeExternalSyntheticLambda1 captureNodeExternalSyntheticLambda1 = sendcaptureerror2.g;
                            CaptureNodeExternalSyntheticLambda4 captureNodeExternalSyntheticLambda5 = sendcaptureerror2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            float f = captureNodeExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - captureNodeExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            float f2 = captureNodeExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 - captureNodeExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
                            if ((f * f) + (f2 * f2) > captureNodeExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * captureNodeExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                    String str4 = sendCaptureError.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("tap exceeds dispersion radius");
                                }
                                synchronized (sendcaptureerror2) {
                                    sendcaptureerror2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                                    sendcaptureerror2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(captureNodeExternalSyntheticLambda4);
                                }
                            } else {
                                sendcaptureerror2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = captureNodeExternalSyntheticLambda4;
                                int i = sendcaptureerror2.asInterface + 1;
                                sendcaptureerror2.asInterface = i;
                                if (i >= sendcaptureerror2.g.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                    ScheduledFuture<?> scheduledFuture = sendcaptureerror2.d;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(false);
                                    }
                                    sendcaptureerror2.d = sendcaptureerror2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.schedule(sendcaptureerror2.cancelAll, sendcaptureerror2.notify, TimeUnit.MILLISECONDS);
                                }
                            }
                        }
                    }
                }
            }
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = State.NO_TAP;
        this.b = null;
    }
}
