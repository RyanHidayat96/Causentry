package com.rd.animation.type;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.AudioSpecBuilder;
import defpackage.ProcessCameraProviderCompaniongetInstance1;
import defpackage.getInstancelambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class DropAnimation extends AudioSpecBuilder<AnimatorSet> {
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private ProcessCameraProviderCompaniongetInstance1 asBinder;
    private int asInterface;
    private int d;
    private int g;

    enum AnimationType {
        Width,
        Height,
        Radius
    }

    public DropAnimation(getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        super(tuitionPaymentFragmentbindingInflater1);
        this.asBinder = new ProcessCameraProviderCompaniongetInstance1();
    }

    public final DropAnimation TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j) {
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        return this;
    }

    private ValueAnimator TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, long j, final AnimationType animationType) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.rd.animation.type.DropAnimation.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DropAnimation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(DropAnimation.this, valueAnimator, animationType);
            }
        });
        return valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: com.rd.animation.type.DropAnimation$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        static {
            int[] iArr = new int[AnimationType.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
            try {
                iArr[AnimationType.Width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[AnimationType.Height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[AnimationType.Radius.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(DropAnimation dropAnimation, ValueAnimator valueAnimator, AnimationType animationType) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i = AnonymousClass5.TuitionPaymentFragmentspecialinlinedviewModeldefault2[animationType.ordinal()];
        if (i == 1) {
            dropAnimation.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
        } else if (i == 2) {
            dropAnimation.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iIntValue;
        } else if (i == 3) {
            dropAnimation.asBinder.b = iIntValue;
        }
        if (dropAnimation.TuitionPaymentFragmentbindingInflater1 != null) {
            dropAnimation.TuitionPaymentFragmentbindingInflater1.b(dropAnimation.asBinder);
        }
    }

    @Override // defpackage.AudioSpecBuilder
    public final /* synthetic */ Animator TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    @Override // defpackage.AudioSpecBuilder
    public final /* bridge */ /* synthetic */ AudioSpecBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        return this;
    }

    @Override // defpackage.AudioSpecBuilder
    public final /* synthetic */ AudioSpecBuilder b(float f) {
        if (this.b != null) {
            long j = (long) (f * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Iterator<Animator> it = ((AnimatorSet) this.b).getChildAnimations().iterator();
            boolean z = false;
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                long j2 = z ? j - duration : j;
                if (j2 >= 0) {
                    if (j2 >= duration) {
                        j2 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j2);
                    }
                    if (!z && duration >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        z = true;
                    }
                }
            }
        }
        return this;
    }

    public final DropAnimation TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, int i4, int i5) {
        if (this.g != i || this.asInterface != i2 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != i3 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != i4 || this.d != i5) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.b = animatorSet;
            this.g = i;
            this.asInterface = i2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
            this.d = i5;
            int i6 = (int) (((double) i5) / 1.5d);
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / 2;
            ValueAnimator valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, AnimationType.Width);
            ValueAnimator valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3, i4, j, AnimationType.Height);
            ValueAnimator valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5, i6, j, AnimationType.Radius);
            ValueAnimator valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4, i3, j, AnimationType.Height);
            ((AnimatorSet) this.b).play(valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault4).with(valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault5).with(valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault3).before(valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault6).before(TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6, i5, j, AnimationType.Radius));
        }
        return this;
    }
}
