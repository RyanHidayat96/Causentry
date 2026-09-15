package com.bpjstku.presentation.syariah;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivitySyariahChooseCardMembershipBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class SyariahChooseCardMembershipActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivitySyariahChooseCardMembershipBinding> {
    public static final SyariahChooseCardMembershipActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new SyariahChooseCardMembershipActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivitySyariahChooseCardMembershipBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivitySyariahChooseCardMembershipBinding.inflate(layoutInflater);
    }

    SyariahChooseCardMembershipActivity$bindingInflater$1() {
        super(1, ActivitySyariahChooseCardMembershipBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivitySyariahChooseCardMembershipBinding;", 0);
    }
}
