package com.bpjstku.presentation.account.setting.addkpj;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityAddKpjBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AddKpjActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityAddKpjBinding> {
    public static final AddKpjActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new AddKpjActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityAddKpjBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityAddKpjBinding.inflate(layoutInflater);
    }

    AddKpjActivity$bindingInflater$1() {
        super(1, ActivityAddKpjBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityAddKpjBinding;", 0);
    }
}
