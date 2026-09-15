package com.bpjstku.presentation.bsu;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityCheckEligibleBsuJmoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class CheckEligibleBsuJmoActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityCheckEligibleBsuJmoBinding> {
    public static final CheckEligibleBsuJmoActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CheckEligibleBsuJmoActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityCheckEligibleBsuJmoBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityCheckEligibleBsuJmoBinding.inflate(layoutInflater);
    }

    CheckEligibleBsuJmoActivity$bindingInflater$1() {
        super(1, ActivityCheckEligibleBsuJmoBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityCheckEligibleBsuJmoBinding;", 0);
    }
}
