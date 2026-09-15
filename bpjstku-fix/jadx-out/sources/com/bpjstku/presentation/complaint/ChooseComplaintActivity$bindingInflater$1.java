package com.bpjstku.presentation.complaint;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityChooseComplaintBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ChooseComplaintActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityChooseComplaintBinding> {
    public static final ChooseComplaintActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new ChooseComplaintActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityChooseComplaintBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityChooseComplaintBinding.inflate(layoutInflater);
    }

    ChooseComplaintActivity$bindingInflater$1() {
        super(1, ActivityChooseComplaintBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityChooseComplaintBinding;", 0);
    }
}
