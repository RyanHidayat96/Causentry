package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class setSampleRate extends setChannelCount {
    private ProcessCameraProviderExtKt asInterface;

    public setSampleRate(getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        super(tuitionPaymentFragmentbindingInflater1);
        this.asInterface = new ProcessCameraProviderExtKt();
    }

    @Override // defpackage.setChannelCount
    public final setChannelCount b(int i, int i2, int i3, boolean z) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i2, i3, z)) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.b = animatorSet;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
            this.d = i3;
            this.g = z;
            int i4 = i3 * 2;
            this.f1363a = i - i3;
            this.asBinder = i + i3;
            this.asInterface.TuitionPaymentFragmentbindingInflater1 = this.f1363a;
            this.asInterface.b = this.asBinder;
            this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
            setChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(z);
            long j = (long) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 0.8d);
            long j2 = (long) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 0.2d);
            long j3 = (long) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 0.5d);
            long j4 = (long) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 0.5d);
            ValueAnimator valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, j, false, this.asInterface);
            ValueAnimator valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, j, true, this.asInterface);
            valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault3.setStartDelay(j2);
            ValueAnimator valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(i4, i3, j3);
            ValueAnimator valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(i3, i4, j3);
            valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault5.setStartDelay(j4);
            ((AnimatorSet) this.b).playTogether(valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault2, valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault3, valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault4, valueAnimatorTuitionPaymentFragmentspecialinlinedviewModeldefault5);
        }
        return this;
    }

    private ValueAnimator TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, long j) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: setSampleRate.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                setSampleRate.TuitionPaymentFragmentbindingInflater1(setSampleRate.this, valueAnimator);
            }
        });
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.setChannelCount, defpackage.AudioSpecBuilder
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public setSampleRate b(float f) {
        if (this.b != null) {
            long j = (long) (f * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int size = ((AnimatorSet) this.b).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.b).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }

    static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(setSampleRate setsamplerate, ValueAnimator valueAnimator) {
        setsamplerate.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (setsamplerate.TuitionPaymentFragmentbindingInflater1 != null) {
            setsamplerate.TuitionPaymentFragmentbindingInflater1.b(setsamplerate.asInterface);
        }
    }

    @Override // defpackage.setChannelCount, defpackage.AudioSpecBuilder
    public final /* synthetic */ AudioSpecBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        return this;
    }

    @Override // defpackage.setChannelCount
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* bridge */ /* synthetic */ setChannelCount TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        return this;
    }
}
