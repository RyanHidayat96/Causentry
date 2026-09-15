package com.bpjstku.presentation.onboarding;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityOnboardingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class OnBoardingActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityOnboardingBinding> {
    public static final OnBoardingActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new OnBoardingActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityOnboardingBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityOnboardingBinding.inflate(layoutInflater);
    }

    OnBoardingActivity$bindingInflater$1() {
        super(1, ActivityOnboardingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityOnboardingBinding;", 0);
    }
}
