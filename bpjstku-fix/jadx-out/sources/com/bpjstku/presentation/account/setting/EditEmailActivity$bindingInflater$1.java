package com.bpjstku.presentation.account.setting;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityEditEmailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class EditEmailActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityEditEmailBinding> {
    public static final EditEmailActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new EditEmailActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityEditEmailBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityEditEmailBinding.inflate(layoutInflater);
    }

    EditEmailActivity$bindingInflater$1() {
        super(1, ActivityEditEmailBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityEditEmailBinding;", 0);
    }
}
