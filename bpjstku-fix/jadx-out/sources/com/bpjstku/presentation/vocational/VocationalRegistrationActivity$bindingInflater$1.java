package com.bpjstku.presentation.vocational;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityVocationalRegistrationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class VocationalRegistrationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityVocationalRegistrationBinding> {
    public static final VocationalRegistrationActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new VocationalRegistrationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityVocationalRegistrationBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityVocationalRegistrationBinding.inflate(layoutInflater);
    }

    VocationalRegistrationActivity$bindingInflater$1() {
        super(1, ActivityVocationalRegistrationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityVocationalRegistrationBinding;", 0);
    }
}
