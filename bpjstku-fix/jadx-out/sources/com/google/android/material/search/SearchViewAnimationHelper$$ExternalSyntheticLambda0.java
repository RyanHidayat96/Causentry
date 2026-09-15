package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import defpackage.postRotate;
import defpackage.preRotate;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class SearchViewAnimationHelper$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SearchViewAnimationHelper f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Rect f$3;

    public /* synthetic */ SearchViewAnimationHelper$$ExternalSyntheticLambda0(SearchViewAnimationHelper searchViewAnimationHelper, float f, float f2, Rect rect) {
        this.f$0 = searchViewAnimationHelper;
        this.f$1 = f;
        this.f$2 = f2;
        this.f$3 = rect;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        postRotate.TuitionPaymentFragmentbindingInflater1[0] = preRotate.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f$0.m7885xa183b80f(this.f$1, this.f$2, this.f$3, valueAnimator);
    }
}
