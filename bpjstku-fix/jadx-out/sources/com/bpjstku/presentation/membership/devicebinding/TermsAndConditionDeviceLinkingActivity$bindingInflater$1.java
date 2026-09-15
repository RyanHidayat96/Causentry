package com.bpjstku.presentation.membership.devicebinding;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityTermsAndConditionDeviceLinkingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TermsAndConditionDeviceLinkingActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityTermsAndConditionDeviceLinkingBinding> {
    public static final TermsAndConditionDeviceLinkingActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new TermsAndConditionDeviceLinkingActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityTermsAndConditionDeviceLinkingBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityTermsAndConditionDeviceLinkingBinding.inflate(layoutInflater);
    }

    TermsAndConditionDeviceLinkingActivity$bindingInflater$1() {
        super(1, ActivityTermsAndConditionDeviceLinkingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityTermsAndConditionDeviceLinkingBinding;", 0);
    }
}
