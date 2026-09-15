package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class setChannelCount extends AudioSpecBuilder<AnimatorSet> {
    int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1363a;
    int asBinder;
    private ProcessCameraProvidergetOrCreateCameraXInstance1111 asInterface;
    int d;
    boolean g;

    public setChannelCount(getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        super(tuitionPaymentFragmentbindingInflater1);
        this.asInterface = new ProcessCameraProvidergetOrCreateCameraXInstance1111();
    }

    @Override // defpackage.AudioSpecBuilder
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public setChannelCount TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(j);
        return this;
    }

    public setChannelCount b(int i, int i2, int i3, boolean z) {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i2, i3, z)) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            this.b = animatorSet;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
            this.d = i3;
            this.g = z;
            int i4 = i - i3;
            this.f1363a = i4;
            this.asBinder = i + i3;
            this.asInterface.TuitionPaymentFragmentbindingInflater1 = i4;
            this.asInterface.b = this.asBinder;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(z);
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / 2;
            ((AnimatorSet) this.b).playSequentially(TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1, j, false, this.asInterface), TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.b, tuitionPaymentFragmentspecialinlinedviewModeldefault2TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, j, true, this.asInterface));
        }
        return this;
    }

    @Override // defpackage.AudioSpecBuilder
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public setChannelCount b(float f) {
        if (this.b != null) {
            long j = (long) (f * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Iterator<Animator> it = ((AnimatorSet) this.b).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                if (j <= duration) {
                    duration = j;
                }
                valueAnimator.setCurrentPlayTime(duration);
                j -= duration;
            }
        }
        return this;
    }

    final ValueAnimator TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, long j, final boolean z, final ProcessCameraProvidergetOrCreateCameraXInstance1111 processCameraProvidergetOrCreateCameraXInstance1111) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: setChannelCount.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                setChannelCount.TuitionPaymentFragmentbindingInflater1(setChannelCount.this, processCameraProvidergetOrCreateCameraXInstance1111, valueAnimator, z);
            }
        });
        return valueAnimatorOfInt;
    }

    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, boolean z) {
        return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == i && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == i2 && this.d == i3 && this.g == z) ? false : true;
    }

    final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i6 = this.d;
            i = i5 + i6;
            int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            i2 = i7 + i6;
            i3 = i5 - i6;
            i4 = i7 - i6;
        } else {
            int i8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i9 = this.d;
            i = i8 - i9;
            int i10 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            i2 = i10 - i9;
            i3 = i8 + i9;
            i4 = i10 + i9;
        }
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2, i3, i4);
    }

    class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        final int TuitionPaymentFragmentbindingInflater1;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final int b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4) {
            this.TuitionPaymentFragmentbindingInflater1 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
            this.b = i3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(setChannelCount setchannelcount, ProcessCameraProvidergetOrCreateCameraXInstance1111 processCameraProvidergetOrCreateCameraXInstance1111, ValueAnimator valueAnimator, boolean z) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (setchannelcount.g) {
            if (z) {
                processCameraProvidergetOrCreateCameraXInstance1111.TuitionPaymentFragmentbindingInflater1 = iIntValue;
            } else {
                processCameraProvidergetOrCreateCameraXInstance1111.b = iIntValue;
            }
        } else if (!z) {
            processCameraProvidergetOrCreateCameraXInstance1111.TuitionPaymentFragmentbindingInflater1 = iIntValue;
        } else {
            processCameraProvidergetOrCreateCameraXInstance1111.b = iIntValue;
        }
        if (setchannelcount.TuitionPaymentFragmentbindingInflater1 != null) {
            setchannelcount.TuitionPaymentFragmentbindingInflater1.b(processCameraProvidergetOrCreateCameraXInstance1111);
        }
    }

    @Override // defpackage.AudioSpecBuilder
    public final /* synthetic */ Animator TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }
}
