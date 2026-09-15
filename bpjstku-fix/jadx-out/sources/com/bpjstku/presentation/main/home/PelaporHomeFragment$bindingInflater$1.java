package com.bpjstku.presentation.main.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentPelaporHomeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class PelaporHomeFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentPelaporHomeBinding> {
    public static final PelaporHomeFragment$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new PelaporHomeFragment$bindingInflater$1();

    public final FragmentPelaporHomeBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentPelaporHomeBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentPelaporHomeBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutInflater, viewGroup, bool.booleanValue());
    }

    PelaporHomeFragment$bindingInflater$1() {
        super(3, FragmentPelaporHomeBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentPelaporHomeBinding;", 0);
    }
}
