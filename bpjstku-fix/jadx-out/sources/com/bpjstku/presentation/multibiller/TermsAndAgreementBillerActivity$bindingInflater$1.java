package com.bpjstku.presentation.multibiller;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityTermsAndAgreementBillerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TermsAndAgreementBillerActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityTermsAndAgreementBillerBinding> {
    public static final TermsAndAgreementBillerActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TermsAndAgreementBillerActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityTermsAndAgreementBillerBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityTermsAndAgreementBillerBinding.inflate(layoutInflater);
    }

    TermsAndAgreementBillerActivity$bindingInflater$1() {
        super(1, ActivityTermsAndAgreementBillerBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityTermsAndAgreementBillerBinding;", 0);
    }
}
