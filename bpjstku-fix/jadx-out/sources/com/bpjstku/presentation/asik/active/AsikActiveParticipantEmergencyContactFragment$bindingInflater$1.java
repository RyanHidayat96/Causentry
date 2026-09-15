package com.bpjstku.presentation.asik.active;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentAsikActiveParticipantEmergencyContactBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class AsikActiveParticipantEmergencyContactFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantEmergencyContactBinding> {
    public static final AsikActiveParticipantEmergencyContactFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AsikActiveParticipantEmergencyContactFragment$bindingInflater$1();

    public final FragmentAsikActiveParticipantEmergencyContactBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentAsikActiveParticipantEmergencyContactBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentAsikActiveParticipantEmergencyContactBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(layoutInflater, viewGroup, bool.booleanValue());
    }

    AsikActiveParticipantEmergencyContactFragment$bindingInflater$1() {
        super(3, FragmentAsikActiveParticipantEmergencyContactBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentAsikActiveParticipantEmergencyContactBinding;", 0);
    }
}
