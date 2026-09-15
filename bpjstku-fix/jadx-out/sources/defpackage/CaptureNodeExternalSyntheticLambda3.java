package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes5.dex */
public final class CaptureNodeExternalSyntheticLambda3 {
    private final float TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public CaptureNodeExternalSyntheticLambda3(float f) {
        float f2 = 1.0f / f;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = f2;
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            throw new ArithmeticException("invalid value");
        }
    }

    public final CaptureNodeExternalSyntheticLambda5 TuitionPaymentFragmentspecialinlinedviewModeldefault1(MotionEvent motionEvent, long j) {
        int actionIndex = motionEvent.getActionIndex();
        return new CaptureNodeExternalSyntheticLambda5(motionEvent.getX(actionIndex) * this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * motionEvent.getY(actionIndex), j, motionEvent.getEventTime());
    }
}
