package com.bpjstku.presentation.vocational;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentVocationalFillParticipantDataBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class VocationalFillParticipantDataFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentVocationalFillParticipantDataBinding> {
    public static final VocationalFillParticipantDataFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new VocationalFillParticipantDataFragment$bindingInflater$1();

    public final FragmentVocationalFillParticipantDataBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentVocationalFillParticipantDataBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentVocationalFillParticipantDataBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(layoutInflater, viewGroup, bool.booleanValue());
    }

    VocationalFillParticipantDataFragment$bindingInflater$1() {
        super(3, FragmentVocationalFillParticipantDataBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentVocationalFillParticipantDataBinding;", 0);
    }
}
