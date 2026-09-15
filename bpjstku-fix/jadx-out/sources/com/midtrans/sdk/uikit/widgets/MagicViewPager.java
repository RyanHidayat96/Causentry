package com.midtrans.sdk.uikit.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes4.dex */
public class MagicViewPager extends ViewPager {
    public View TuitionPaymentFragmentbindingInflater1;

    public MagicViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        View view = this.TuitionPaymentFragmentbindingInflater1;
        if (view == null) {
            super.onMeasure(i, i2);
            return;
        }
        view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.TuitionPaymentFragmentbindingInflater1.getMeasuredHeight();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight > 0 ? measuredHeight : 0, BasicMeasure.EXACTLY));
    }

    public MagicViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
