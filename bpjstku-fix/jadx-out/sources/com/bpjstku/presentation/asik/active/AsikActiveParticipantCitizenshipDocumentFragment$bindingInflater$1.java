package com.bpjstku.presentation.asik.active;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentAsikActiveParticipantCitizenshipDocumentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class AsikActiveParticipantCitizenshipDocumentFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentAsikActiveParticipantCitizenshipDocumentBinding> {
    public static final AsikActiveParticipantCitizenshipDocumentFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AsikActiveParticipantCitizenshipDocumentFragment$bindingInflater$1();

    public final FragmentAsikActiveParticipantCitizenshipDocumentBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentAsikActiveParticipantCitizenshipDocumentBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentAsikActiveParticipantCitizenshipDocumentBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutInflater, viewGroup, bool.booleanValue());
    }

    AsikActiveParticipantCitizenshipDocumentFragment$bindingInflater$1() {
        super(3, FragmentAsikActiveParticipantCitizenshipDocumentBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentAsikActiveParticipantCitizenshipDocumentBinding;", 0);
    }
}
