package com.bpjstku.presentation.vocational;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentVocationalChooseTrainingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class VocationalChooseTrainingFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentVocationalChooseTrainingBinding> {
    public static final VocationalChooseTrainingFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new VocationalChooseTrainingFragment$bindingInflater$1();

    public final FragmentVocationalChooseTrainingBinding b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentVocationalChooseTrainingBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentVocationalChooseTrainingBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return b(layoutInflater, viewGroup, bool.booleanValue());
    }

    VocationalChooseTrainingFragment$bindingInflater$1() {
        super(3, FragmentVocationalChooseTrainingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentVocationalChooseTrainingBinding;", 0);
    }
}
