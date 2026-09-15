package com.bpjstku.presentation.asik;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityAsikMembershipStatusBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AsikMembershipStatusActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityAsikMembershipStatusBinding> {
    public static final AsikMembershipStatusActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AsikMembershipStatusActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityAsikMembershipStatusBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityAsikMembershipStatusBinding.inflate(layoutInflater);
    }

    AsikMembershipStatusActivity$bindingInflater$1() {
        super(1, ActivityAsikMembershipStatusBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityAsikMembershipStatusBinding;", 0);
    }
}
