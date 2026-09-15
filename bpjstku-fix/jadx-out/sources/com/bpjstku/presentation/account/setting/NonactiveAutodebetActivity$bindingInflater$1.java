package com.bpjstku.presentation.account.setting;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityNonactiveAutodebetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class NonactiveAutodebetActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityNonactiveAutodebetBinding> {
    public static final NonactiveAutodebetActivity$bindingInflater$1 b = new NonactiveAutodebetActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityNonactiveAutodebetBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityNonactiveAutodebetBinding.inflate(layoutInflater);
    }

    NonactiveAutodebetActivity$bindingInflater$1() {
        super(1, ActivityNonactiveAutodebetBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityNonactiveAutodebetBinding;", 0);
    }
}
