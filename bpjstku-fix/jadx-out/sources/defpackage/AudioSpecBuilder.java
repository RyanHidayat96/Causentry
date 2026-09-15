package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AudioSpecBuilder<T extends Animator> {
    public getInstancelambda0.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1;
    public long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 350;
    public T b = (T) TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public abstract T TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public abstract AudioSpecBuilder b(float f);

    public AudioSpecBuilder(getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentbindingInflater1;
    }

    public AudioSpecBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        T t = this.b;
        if (t instanceof ValueAnimator) {
            t.setDuration(j);
        }
        return this;
    }

    public final void b() {
        T t = this.b;
        if (t == null || t.isRunning()) {
            return;
        }
        this.b.start();
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        T t = this.b;
        if (t == null || !t.isStarted()) {
            return;
        }
        this.b.end();
    }
}
