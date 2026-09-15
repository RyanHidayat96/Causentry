package com.bpjstku.presentation.asik.active;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentAsikActiveParticipantContactDataBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class AsikActiveParticipantContactDataFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantContactDataBinding> {
    public static final AsikActiveParticipantContactDataFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AsikActiveParticipantContactDataFragment$bindingInflater$1();

    public final FragmentAsikActiveParticipantContactDataBinding TuitionPaymentFragmentbindingInflater1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentAsikActiveParticipantContactDataBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentAsikActiveParticipantContactDataBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentbindingInflater1(layoutInflater, viewGroup, bool.booleanValue());
    }

    AsikActiveParticipantContactDataFragment$bindingInflater$1() {
        super(3, FragmentAsikActiveParticipantContactDataBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentAsikActiveParticipantContactDataBinding;", 0);
    }
}
