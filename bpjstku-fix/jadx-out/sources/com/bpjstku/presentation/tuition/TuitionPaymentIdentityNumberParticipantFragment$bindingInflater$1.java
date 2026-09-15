package com.bpjstku.presentation.tuition;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentTuitionPaymentIdentityParticipantBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class TuitionPaymentIdentityNumberParticipantFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentTuitionPaymentIdentityParticipantBinding> {
    public static final TuitionPaymentIdentityNumberParticipantFragment$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentIdentityNumberParticipantFragment$bindingInflater$1();

    public final FragmentTuitionPaymentIdentityParticipantBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentTuitionPaymentIdentityParticipantBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentTuitionPaymentIdentityParticipantBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1(layoutInflater, viewGroup, bool.booleanValue());
    }

    TuitionPaymentIdentityNumberParticipantFragment$bindingInflater$1() {
        super(3, FragmentTuitionPaymentIdentityParticipantBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentTuitionPaymentIdentityParticipantBinding;", 0);
    }
}
