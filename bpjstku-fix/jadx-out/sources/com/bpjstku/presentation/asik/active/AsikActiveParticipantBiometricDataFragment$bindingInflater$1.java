package com.bpjstku.presentation.asik.active;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentAsikActiveParticipantBiometricDataBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class AsikActiveParticipantBiometricDataFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantBiometricDataBinding> {
    public static final AsikActiveParticipantBiometricDataFragment$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new AsikActiveParticipantBiometricDataFragment$bindingInflater$1();

    public final FragmentAsikActiveParticipantBiometricDataBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentAsikActiveParticipantBiometricDataBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentAsikActiveParticipantBiometricDataBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(layoutInflater, viewGroup, bool.booleanValue());
    }

    AsikActiveParticipantBiometricDataFragment$bindingInflater$1() {
        super(3, FragmentAsikActiveParticipantBiometricDataBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentAsikActiveParticipantBiometricDataBinding;", 0);
    }
}
