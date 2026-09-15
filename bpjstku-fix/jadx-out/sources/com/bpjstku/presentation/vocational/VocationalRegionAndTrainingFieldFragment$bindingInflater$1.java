package com.bpjstku.presentation.vocational;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentVocationalRegionAndTrainingFieldBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class VocationalRegionAndTrainingFieldFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentVocationalRegionAndTrainingFieldBinding> {
    public static final VocationalRegionAndTrainingFieldFragment$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new VocationalRegionAndTrainingFieldFragment$bindingInflater$1();

    public final FragmentVocationalRegionAndTrainingFieldBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentVocationalRegionAndTrainingFieldBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentVocationalRegionAndTrainingFieldBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutInflater, viewGroup, bool.booleanValue());
    }

    VocationalRegionAndTrainingFieldFragment$bindingInflater$1() {
        super(3, FragmentVocationalRegionAndTrainingFieldBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentVocationalRegionAndTrainingFieldBinding;", 0);
    }
}
