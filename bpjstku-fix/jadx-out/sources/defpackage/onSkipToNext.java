package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class onSkipToNext<T> {
    public float INotificationSideChannel;
    public Float TuitionPaymentFragmentbindingInflater1;
    public float TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final previous TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PointF f1310a;
    public final Interpolator asBinder;
    public final float asInterface;
    public T b;
    private float cancel;
    public final T d;
    public PointF g;
    private float notify;
    public int onTransact;

    public onSkipToNext(previous previousVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.INotificationSideChannel = -3987645.8f;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -3987645.8f;
        this.onTransact = 784923401;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 784923401;
        this.notify = Float.MIN_VALUE;
        this.cancel = Float.MIN_VALUE;
        this.f1310a = null;
        this.g = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = previousVar;
        this.d = t;
        this.b = t2;
        this.asBinder = interpolator;
        this.asInterface = f;
        this.TuitionPaymentFragmentbindingInflater1 = f2;
    }

    public onSkipToNext(T t) {
        this.INotificationSideChannel = -3987645.8f;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -3987645.8f;
        this.onTransact = 784923401;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 784923401;
        this.notify = Float.MIN_VALUE;
        this.cancel = Float.MIN_VALUE;
        this.f1310a = null;
        this.g = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        this.d = t;
        this.b = t;
        this.asBinder = null;
        this.asInterface = Float.MIN_VALUE;
        this.TuitionPaymentFragmentbindingInflater1 = Float.valueOf(Float.MAX_VALUE);
    }

    public final float TuitionPaymentFragmentbindingInflater1() {
        previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (previousVar == null) {
            return 0.0f;
        }
        if (this.notify == Float.MIN_VALUE) {
            float f = this.asInterface - previousVar.onTransact;
            previous previousVar2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.notify = f / (previousVar2.TuitionPaymentFragmentbindingInflater1 - previousVar2.onTransact);
        }
        return this.notify;
    }

    public final float TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            return 1.0f;
        }
        if (this.cancel == Float.MIN_VALUE) {
            if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                this.cancel = 1.0f;
            } else {
                float fTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
                float fFloatValue = this.TuitionPaymentFragmentbindingInflater1.floatValue() - this.asInterface;
                previous previousVar = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                this.cancel = fTuitionPaymentFragmentbindingInflater1 + (fFloatValue / (previousVar.TuitionPaymentFragmentbindingInflater1 - previousVar.onTransact));
            }
        }
        return this.cancel;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Keyframe{startValue=");
        sb.append(this.d);
        sb.append(", endValue=");
        sb.append(this.b);
        sb.append(", startFrame=");
        sb.append(this.asInterface);
        sb.append(", endFrame=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", interpolator=");
        sb.append(this.asBinder);
        sb.append('}');
        return sb.toString();
    }
}
