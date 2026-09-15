package com.bpjstku.presentation.program.jkp.claim;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityJkpEligibilityBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JkpEligibilityActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJkpEligibilityBinding> {
    public static final JkpEligibilityActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new JkpEligibilityActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityJkpEligibilityBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityJkpEligibilityBinding.inflate(layoutInflater);
    }

    JkpEligibilityActivity$bindingInflater$1() {
        super(1, ActivityJkpEligibilityBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJkpEligibilityBinding;", 0);
    }
}
