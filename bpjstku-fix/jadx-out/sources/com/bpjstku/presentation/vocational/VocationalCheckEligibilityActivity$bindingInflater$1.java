package com.bpjstku.presentation.vocational;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityVocationalCheckEligibilityBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class VocationalCheckEligibilityActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityVocationalCheckEligibilityBinding> {
    public static final VocationalCheckEligibilityActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new VocationalCheckEligibilityActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityVocationalCheckEligibilityBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityVocationalCheckEligibilityBinding.inflate(layoutInflater);
    }

    VocationalCheckEligibilityActivity$bindingInflater$1() {
        super(1, ActivityVocationalCheckEligibilityBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityVocationalCheckEligibilityBinding;", 0);
    }
}
