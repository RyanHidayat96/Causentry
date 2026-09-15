package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class onSeekTo extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> TuitionPaymentFragmentbindingInflater1 = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new CopyOnWriteArraySet();

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.TuitionPaymentFragmentbindingInflater1.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.TuitionPaymentFragmentbindingInflater1.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.TuitionPaymentFragmentbindingInflater1.clear();
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.clear();
    }

    final void TuitionPaymentFragmentbindingInflater1(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Iterator<Animator.AnimatorListener> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    final void b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Iterator<Animator.AnimatorListener> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.TuitionPaymentFragmentbindingInflater1.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }
}
