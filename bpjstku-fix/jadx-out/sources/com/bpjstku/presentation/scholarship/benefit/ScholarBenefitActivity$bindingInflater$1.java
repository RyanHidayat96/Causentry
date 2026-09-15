package com.bpjstku.presentation.scholarship.benefit;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityScholarBenefitBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ScholarBenefitActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityScholarBenefitBinding> {
    public static final ScholarBenefitActivity$bindingInflater$1 b = new ScholarBenefitActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityScholarBenefitBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityScholarBenefitBinding.inflate(layoutInflater);
    }

    ScholarBenefitActivity$bindingInflater$1() {
        super(1, ActivityScholarBenefitBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityScholarBenefitBinding;", 0);
    }
}
