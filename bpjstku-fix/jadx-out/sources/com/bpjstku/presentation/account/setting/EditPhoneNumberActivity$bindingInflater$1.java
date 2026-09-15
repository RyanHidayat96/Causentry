package com.bpjstku.presentation.account.setting;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityEditPhoneNumberBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class EditPhoneNumberActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityEditPhoneNumberBinding> {
    public static final EditPhoneNumberActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new EditPhoneNumberActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityEditPhoneNumberBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityEditPhoneNumberBinding.inflate(layoutInflater);
    }

    EditPhoneNumberActivity$bindingInflater$1() {
        super(1, ActivityEditPhoneNumberBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityEditPhoneNumberBinding;", 0);
    }
}
