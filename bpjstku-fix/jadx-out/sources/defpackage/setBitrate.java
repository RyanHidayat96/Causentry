package defpackage;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public final class setBitrate extends getChannelCount {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1361a;
    private r8lambda1GtIzncz4245_HpTJbEZFoVqMQY asBinder;
    private int d;

    @Override // defpackage.getChannelCount, defpackage.AudioSpecBuilder
    public final /* synthetic */ Animator TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    public setBitrate(getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        super(tuitionPaymentFragmentbindingInflater1);
        this.asBinder = new r8lambda1GtIzncz4245_HpTJbEZFoVqMQY();
    }

    @Override // defpackage.getChannelCount
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final ValueAnimator TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: setBitrate.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                setBitrate.TuitionPaymentFragmentbindingInflater1(setBitrate.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    public final setBitrate b(int i, int i2, int i3, int i4) {
        if (this.b != null && (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != i || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != i2 || this.d != i3 || this.f1361a != i4)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
            this.d = i3;
            this.f1361a = i4;
            ((ValueAnimator) this.b).setValues(TuitionPaymentFragmentspecialinlinedviewModeldefault2(false), TuitionPaymentFragmentspecialinlinedviewModeldefault2(true), TuitionPaymentFragmentbindingInflater1(false), TuitionPaymentFragmentbindingInflater1(true), TuitionPaymentFragmentspecialinlinedviewModeldefault1(false), TuitionPaymentFragmentspecialinlinedviewModeldefault1(true));
        }
        return this;
    }

    private PropertyValuesHolder TuitionPaymentFragmentbindingInflater1(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i2 = this.d;
            i = i2 / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i = this.d;
            i2 = i / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, i2);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    private PropertyValuesHolder TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        int i;
        String str;
        int i2 = 0;
        if (z) {
            str = "ANIMATION_STROKE_REVERSE";
            i2 = this.d;
            i = 0;
        } else {
            i = this.d;
            str = "ANIMATION_STROKE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i2, i);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }

    static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(setBitrate setbitrate, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int iIntValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int iIntValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int iIntValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int iIntValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        setbitrate.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iIntValue;
        setbitrate.asBinder.TuitionPaymentFragmentbindingInflater1 = iIntValue2;
        setbitrate.asBinder.b = iIntValue3;
        setbitrate.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue4;
        setbitrate.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iIntValue5;
        setbitrate.asBinder.f1331a = iIntValue6;
        if (setbitrate.TuitionPaymentFragmentbindingInflater1 != null) {
            setbitrate.TuitionPaymentFragmentbindingInflater1.b(setbitrate.asBinder);
        }
    }
}
