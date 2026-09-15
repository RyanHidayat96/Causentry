package com.bpjstku.presentation.asik.active;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentAsikActiveParticipantConfirmationPhoneBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class AsikActiveParticipantConfirmationHpFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantConfirmationPhoneBinding> {
    public static final AsikActiveParticipantConfirmationHpFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AsikActiveParticipantConfirmationHpFragment$bindingInflater$1();

    public final FragmentAsikActiveParticipantConfirmationPhoneBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentAsikActiveParticipantConfirmationPhoneBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentAsikActiveParticipantConfirmationPhoneBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutInflater, viewGroup, bool.booleanValue());
    }

    AsikActiveParticipantConfirmationHpFragment$bindingInflater$1() {
        super(3, FragmentAsikActiveParticipantConfirmationPhoneBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentAsikActiveParticipantConfirmationPhoneBinding;", 0);
    }
}
