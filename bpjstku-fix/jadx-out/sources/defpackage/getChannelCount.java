package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes4.dex */
public class getChannelCount extends AudioSpecBuilder<ValueAnimator> {
    int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private ProcessCameraProviderconfigureInstanceInternal111 d;

    public getChannelCount(getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        super(tuitionPaymentFragmentbindingInflater1);
        this.d = new ProcessCameraProviderconfigureInstanceInternal111();
    }

    @Override // defpackage.AudioSpecBuilder
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public ValueAnimator TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: getChannelCount.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                getChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getChannelCount.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    public final getChannelCount b(int i, int i2) {
        if (this.b != null && (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != i || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != i2)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
            ((ValueAnimator) this.b).setValues(TuitionPaymentFragmentspecialinlinedviewModeldefault2(false), TuitionPaymentFragmentspecialinlinedviewModeldefault2(true));
        }
        return this;
    }

    final PropertyValuesHolder TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, i2);
        propertyValuesHolderOfInt.setEvaluator(new ArgbEvaluator());
        return propertyValuesHolderOfInt;
    }

    static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getChannelCount getchannelcount, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        getchannelcount.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iIntValue;
        getchannelcount.d.TuitionPaymentFragmentbindingInflater1 = iIntValue2;
        if (getchannelcount.TuitionPaymentFragmentbindingInflater1 != null) {
            getchannelcount.TuitionPaymentFragmentbindingInflater1.b(getchannelcount.d);
        }
    }

    @Override // defpackage.AudioSpecBuilder
    public final /* synthetic */ AudioSpecBuilder b(float f) {
        if (this.b != null) {
            long j = (long) (f * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (((ValueAnimator) this.b).getValues() != null && ((ValueAnimator) this.b).getValues().length > 0) {
                ((ValueAnimator) this.b).setCurrentPlayTime(j);
            }
        }
        return this;
    }
}
