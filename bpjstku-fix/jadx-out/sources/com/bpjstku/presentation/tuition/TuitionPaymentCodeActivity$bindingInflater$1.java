package com.bpjstku.presentation.tuition;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityTuitionPaymentCodeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TuitionPaymentCodeActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityTuitionPaymentCodeBinding> {
    public static final TuitionPaymentCodeActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentCodeActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityTuitionPaymentCodeBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityTuitionPaymentCodeBinding.inflate(layoutInflater);
    }

    TuitionPaymentCodeActivity$bindingInflater$1() {
        super(1, ActivityTuitionPaymentCodeBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityTuitionPaymentCodeBinding;", 0);
    }
}
