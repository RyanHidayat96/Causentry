package com.bpjstku.presentation.additionalservices;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityAdditionalServicesBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AdditionalServicesActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityAdditionalServicesBinding> {
    public static final AdditionalServicesActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AdditionalServicesActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityAdditionalServicesBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityAdditionalServicesBinding.inflate(layoutInflater);
    }

    AdditionalServicesActivity$bindingInflater$1() {
        super(1, ActivityAdditionalServicesBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityAdditionalServicesBinding;", 0);
    }
}
