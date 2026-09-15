package com.bpjstku.presentation.membership.registration.newregistration;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bpjstku.databinding.FragmentRegistrationBiometricBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class RegistrationBiometricFragment$bindingInflater$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, FragmentRegistrationBiometricBinding> {
    public static final RegistrationBiometricFragment$bindingInflater$1 b = new RegistrationBiometricFragment$bindingInflater$1();

    public final FragmentRegistrationBiometricBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return FragmentRegistrationBiometricBinding.inflate(layoutInflater, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ FragmentRegistrationBiometricBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(layoutInflater, viewGroup, bool.booleanValue());
    }

    RegistrationBiometricFragment$bindingInflater$1() {
        super(3, FragmentRegistrationBiometricBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/bpjstku/databinding/FragmentRegistrationBiometricBinding;", 0);
    }
}
