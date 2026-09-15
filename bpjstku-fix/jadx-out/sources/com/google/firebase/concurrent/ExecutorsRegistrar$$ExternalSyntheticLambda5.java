package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import defpackage.convertToExifDateTime;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ExecutorsRegistrar$$ExternalSyntheticLambda5 implements ComponentFactory {
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        convertToExifDateTime.TuitionPaymentFragmentbindingInflater1[0] = Class.forName("com.bpjstku.presentation.membership.forgotaccount.verifyotp.VerifyOtpByPhoneActivity$b").getDeclaredField("TuitionPaymentFragmentspecialinlinedviewModeldefault1");
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        return ExecutorsRegistrar.BLOCKING_EXECUTOR.get();
    }
}
