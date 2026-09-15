package com.bpjstku.presentation.investation;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityInvestasiConcentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class InvestasiConcentActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityInvestasiConcentBinding> {
    public static final InvestasiConcentActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new InvestasiConcentActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityInvestasiConcentBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityInvestasiConcentBinding.inflate(layoutInflater);
    }

    InvestasiConcentActivity$bindingInflater$1() {
        super(1, ActivityInvestasiConcentBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityInvestasiConcentBinding;", 0);
    }
}
