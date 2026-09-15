package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.os.Process;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SearchBarAnimationHelper$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;
    public final /* synthetic */ View f$0;

    public /* synthetic */ SearchBarAnimationHelper$$ExternalSyntheticLambda0(View view) {
        this.f$0 = view;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 7549764;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        b = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SearchBarAnimationHelper.lambda$getFadeOutChildrenAnimator$2(this.f$0, valueAnimator);
    }
}
