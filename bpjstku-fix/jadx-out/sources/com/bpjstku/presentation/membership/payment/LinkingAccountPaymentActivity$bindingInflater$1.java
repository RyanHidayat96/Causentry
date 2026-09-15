package com.bpjstku.presentation.membership.payment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityLinkingAccountPaymentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class LinkingAccountPaymentActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityLinkingAccountPaymentBinding> {
    public static final LinkingAccountPaymentActivity$bindingInflater$1 b = new LinkingAccountPaymentActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityLinkingAccountPaymentBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityLinkingAccountPaymentBinding.inflate(layoutInflater);
    }

    LinkingAccountPaymentActivity$bindingInflater$1() {
        super(1, ActivityLinkingAccountPaymentBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityLinkingAccountPaymentBinding;", 0);
    }
}
