package com.bpjstku.presentation.streaming;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityTermsAndAgreementVisionPlusBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TermsAndAgreementVisionPlusActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityTermsAndAgreementVisionPlusBinding> {
    public static final TermsAndAgreementVisionPlusActivity$bindingInflater$1 b = new TermsAndAgreementVisionPlusActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityTermsAndAgreementVisionPlusBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityTermsAndAgreementVisionPlusBinding.inflate(layoutInflater);
    }

    TermsAndAgreementVisionPlusActivity$bindingInflater$1() {
        super(1, ActivityTermsAndAgreementVisionPlusBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityTermsAndAgreementVisionPlusBinding;", 0);
    }
}
