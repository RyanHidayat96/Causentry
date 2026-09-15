package com.bpjstku.presentation.partner;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityPartnerFilterBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class PartnerFilterActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityPartnerFilterBinding> {
    public static final PartnerFilterActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new PartnerFilterActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityPartnerFilterBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityPartnerFilterBinding.inflate(layoutInflater);
    }

    PartnerFilterActivity$bindingInflater$1() {
        super(1, ActivityPartnerFilterBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityPartnerFilterBinding;", 0);
    }
}
