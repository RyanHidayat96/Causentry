package com.bpjstku.presentation.treatment;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityTreatmentNotificationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class TreatmentNotificationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityTreatmentNotificationBinding> {
    public static final TreatmentNotificationActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new TreatmentNotificationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityTreatmentNotificationBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityTreatmentNotificationBinding.inflate(layoutInflater);
    }

    TreatmentNotificationActivity$bindingInflater$1() {
        super(1, ActivityTreatmentNotificationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityTreatmentNotificationBinding;", 0);
    }
}
