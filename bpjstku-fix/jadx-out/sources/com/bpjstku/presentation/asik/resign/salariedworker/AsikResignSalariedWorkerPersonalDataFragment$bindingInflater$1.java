package com.bpjstku.presentation.asik.resign.salariedworker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentAsikActiveParticipantPersonalDataBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class AsikResignSalariedWorkerPersonalDataFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantPersonalDataBinding> {
    public static final AsikResignSalariedWorkerPersonalDataFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AsikResignSalariedWorkerPersonalDataFragment$bindingInflater$1();

    public final FragmentAsikActiveParticipantPersonalDataBinding b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentAsikActiveParticipantPersonalDataBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentAsikActiveParticipantPersonalDataBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return b(layoutInflater, viewGroup, bool.booleanValue());
    }

    AsikResignSalariedWorkerPersonalDataFragment$bindingInflater$1() {
        super(3, FragmentAsikActiveParticipantPersonalDataBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentAsikActiveParticipantPersonalDataBinding;", 0);
    }
}
