package com.bpjstku.presentation.complaint;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityNonRegisterCompanyComplaintBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class NonRegisterCompanyComplaintActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityNonRegisterCompanyComplaintBinding> {
    public static final NonRegisterCompanyComplaintActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new NonRegisterCompanyComplaintActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityNonRegisterCompanyComplaintBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityNonRegisterCompanyComplaintBinding.inflate(layoutInflater);
    }

    NonRegisterCompanyComplaintActivity$bindingInflater$1() {
        super(1, ActivityNonRegisterCompanyComplaintBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityNonRegisterCompanyComplaintBinding;", 0);
    }
}
