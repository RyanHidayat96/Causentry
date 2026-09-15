package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;

/* JADX INFO: loaded from: classes4.dex */
public final class getSourceFormat extends getSource {
    public getSourceFormat(getInstancelambda0.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        super(tuitionPaymentFragmentbindingInflater1);
    }

    @Override // defpackage.getSource
    protected final PropertyValuesHolder b(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = (int) (this.asInterface * this.g);
            i2 = this.asInterface;
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i = this.asInterface;
            i2 = (int) (this.asInterface * this.g);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i, i2);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }
}
