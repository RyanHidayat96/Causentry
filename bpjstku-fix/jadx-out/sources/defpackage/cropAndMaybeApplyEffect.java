package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.core.view.MotionEventCompat;

/* JADX INFO: loaded from: classes4.dex */
final class cropAndMaybeApplyEffect {
    lambdaprocessInputPacket4 TuitionPaymentFragmentbindingInflater1;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final ScaleGestureDetector TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f891a;
    private VelocityTracker asBinder;
    private final float asInterface;
    private final float d;
    private float g;
    private int b = -1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;

    cropAndMaybeApplyEffect(Context context, lambdaprocessInputPacket4 lambdaprocessinputpacket4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.asInterface = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = viewConfiguration.getScaledTouchSlop();
        this.TuitionPaymentFragmentbindingInflater1 = lambdaprocessinputpacket4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: cropAndMaybeApplyEffect.4
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                if (scaleFactor < 0.0f) {
                    return true;
                }
                cropAndMaybeApplyEffect.this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
        });
    }

    private float TuitionPaymentFragmentspecialinlinedviewModeldefault2(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(MotionEvent motionEvent) {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTouchEvent(motionEvent);
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                this.b = motionEvent.getPointerId(0);
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.asBinder = velocityTrackerObtain;
                if (velocityTrackerObtain != null) {
                    velocityTrackerObtain.addMovement(motionEvent);
                }
                this.f891a = TuitionPaymentFragmentspecialinlinedviewModeldefault2(motionEvent);
                this.g = b(motionEvent);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
            } else if (action == 1) {
                this.b = -1;
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.asBinder != null) {
                    this.f891a = TuitionPaymentFragmentspecialinlinedviewModeldefault2(motionEvent);
                    this.g = b(motionEvent);
                    this.asBinder.addMovement(motionEvent);
                    this.asBinder.computeCurrentVelocity(1000);
                    float xVelocity = this.asBinder.getXVelocity();
                    float yVelocity = this.asBinder.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.asInterface) {
                        this.TuitionPaymentFragmentbindingInflater1.b(-xVelocity, -yVelocity);
                    }
                }
                VelocityTracker velocityTracker = this.asBinder;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.asBinder = null;
                }
            } else if (action == 2) {
                float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(motionEvent);
                float fB = b(motionEvent);
                float f = fTuitionPaymentFragmentspecialinlinedviewModeldefault2 - this.f891a;
                float f2 = fB - this.g;
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Math.sqrt((double) ((f * f) + (f2 * f2))) >= ((double) this.d);
                }
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(f, f2);
                    this.f891a = fTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    this.g = fB;
                    VelocityTracker velocityTracker2 = this.asBinder;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.b = -1;
                VelocityTracker velocityTracker3 = this.asBinder;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.asBinder = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                if (motionEvent.getPointerId(action2) == this.b) {
                    int i = action2 == 0 ? 1 : 0;
                    this.b = motionEvent.getPointerId(i);
                    this.f891a = motionEvent.getX(i);
                    this.g = motionEvent.getY(i);
                }
            }
            int i2 = this.b;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = motionEvent.findPointerIndex(i2 != -1 ? i2 : 0);
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }
}
