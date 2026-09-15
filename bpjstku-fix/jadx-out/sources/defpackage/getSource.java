package defpackage;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public class getSource extends getChannelCount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AudioSpec f984a;
    int asInterface;
    float g;

    @Override // defpackage.getChannelCount, defpackage.AudioSpecBuilder
    public final /* synthetic */ Animator TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public getSource(getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        super(tuitionPaymentFragmentbindingInflater1);
        this.f984a = new AudioSpec();
    }

    @Override // defpackage.getChannelCount
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final ValueAnimator TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: getSource.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                getSource.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getSource.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    public final getSource TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, float f) {
        if (this.b != null && (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != i || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != i2 || this.asInterface != i3 || this.g != f)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
            this.asInterface = i3;
            this.g = f;
            ((ValueAnimator) this.b).setValues(TuitionPaymentFragmentspecialinlinedviewModeldefault2(false), TuitionPaymentFragmentspecialinlinedviewModeldefault2(true), b(false), b(true));
        }
        return this;
    }

    protected PropertyValuesHolder b(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.asInterface;
            i = (int) (i2 * this.g);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i = this.asInterface;
            i2 = (int) (i * this.g);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i2, i);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getSource getsource, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        getsource.f984a.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iIntValue;
        getsource.f984a.TuitionPaymentFragmentbindingInflater1 = iIntValue2;
        getsource.f984a.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue3;
        getsource.f984a.b = iIntValue4;
        if (getsource.TuitionPaymentFragmentbindingInflater1 != null) {
            getsource.TuitionPaymentFragmentbindingInflater1.b(getsource.f984a);
        }
    }
}
