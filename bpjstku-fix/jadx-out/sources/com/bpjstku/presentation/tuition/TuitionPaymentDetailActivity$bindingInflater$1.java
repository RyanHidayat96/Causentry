package com.bpjstku.presentation.tuition;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityTuitionPaymentDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TuitionPaymentDetailActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityTuitionPaymentDetailBinding> {
    public static final TuitionPaymentDetailActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentDetailActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityTuitionPaymentDetailBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityTuitionPaymentDetailBinding.inflate(layoutInflater);
    }

    TuitionPaymentDetailActivity$bindingInflater$1() {
        super(1, ActivityTuitionPaymentDetailBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityTuitionPaymentDetailBinding;", 0);
    }
}
