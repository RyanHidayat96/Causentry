package com.bpjstku.presentation.branchoffice;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentBpjstkuBranchOfficeMapBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class BpjstkuBranchOfficeMapFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentBpjstkuBranchOfficeMapBinding> {
    public static final BpjstkuBranchOfficeMapFragment$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new BpjstkuBranchOfficeMapFragment$bindingInflater$1();

    public final FragmentBpjstkuBranchOfficeMapBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentBpjstkuBranchOfficeMapBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentBpjstkuBranchOfficeMapBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutInflater, viewGroup, bool.booleanValue());
    }

    BpjstkuBranchOfficeMapFragment$bindingInflater$1() {
        super(3, FragmentBpjstkuBranchOfficeMapBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentBpjstkuBranchOfficeMapBinding;", 0);
    }
}
