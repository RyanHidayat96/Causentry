package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityNonSalariedWorkerRegistrationResultBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class NonSalariedWorkerRegistrationResultActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityNonSalariedWorkerRegistrationResultBinding> {
    public static final NonSalariedWorkerRegistrationResultActivity$bindingInflater$1 b = new NonSalariedWorkerRegistrationResultActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityNonSalariedWorkerRegistrationResultBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityNonSalariedWorkerRegistrationResultBinding.inflate(layoutInflater);
    }

    NonSalariedWorkerRegistrationResultActivity$bindingInflater$1() {
        super(1, ActivityNonSalariedWorkerRegistrationResultBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityNonSalariedWorkerRegistrationResultBinding;", 0);
    }
}
