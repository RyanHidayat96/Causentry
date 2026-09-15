package com.bpjstku.presentation.tuition;

import android.view.LayoutInflater;
import com.bpjstku.databinding.FragmentTuitionPaymentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TuitionPaymentActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, FragmentTuitionPaymentBinding> {
    public static final TuitionPaymentActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final FragmentTuitionPaymentBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentTuitionPaymentBinding.inflate(layoutInflater);
    }

    TuitionPaymentActivity$bindingInflater$1() {
        super(1, FragmentTuitionPaymentBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/FragmentTuitionPaymentBinding;", 0);
    }
}
