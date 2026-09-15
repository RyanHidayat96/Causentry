package com.bpjstku.presentation.membership.accountactivation;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityActivationSuccessBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ActivationSuccessActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityActivationSuccessBinding> {
    public static final ActivationSuccessActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new ActivationSuccessActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityActivationSuccessBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityActivationSuccessBinding.inflate(layoutInflater);
    }

    ActivationSuccessActivity$bindingInflater$1() {
        super(1, ActivityActivationSuccessBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityActivationSuccessBinding;", 0);
    }
}
