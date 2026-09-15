package com.bpjstku.presentation.bsu;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityCheckEligibleBsuResultBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class CheckEligibleBsuResultActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityCheckEligibleBsuResultBinding> {
    public static final CheckEligibleBsuResultActivity$bindingInflater$1 b = new CheckEligibleBsuResultActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityCheckEligibleBsuResultBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityCheckEligibleBsuResultBinding.inflate(layoutInflater);
    }

    CheckEligibleBsuResultActivity$bindingInflater$1() {
        super(1, ActivityCheckEligibleBsuResultBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityCheckEligibleBsuResultBinding;", 0);
    }
}
