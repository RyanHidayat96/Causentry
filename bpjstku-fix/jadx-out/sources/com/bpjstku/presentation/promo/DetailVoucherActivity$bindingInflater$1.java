package com.bpjstku.presentation.promo;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDetailVoucherBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DetailVoucherActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDetailVoucherBinding> {
    public static final DetailVoucherActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new DetailVoucherActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityDetailVoucherBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDetailVoucherBinding.inflate(layoutInflater);
    }

    DetailVoucherActivity$bindingInflater$1() {
        super(1, ActivityDetailVoucherBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDetailVoucherBinding;", 0);
    }
}
