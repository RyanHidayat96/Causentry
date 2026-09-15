package com.bpjstku.presentation.vocational;

import com.bpjstku.presentation.vocational.model.VocationRegistrationStep;
import com.bpjstku.presentation.vocational.model.VocationalRegistration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class VocationalRegistrationActivity$onStepChanged$replacementFragment$1$1 extends FunctionReferenceImpl implements Function2<VocationRegistrationStep, VocationalRegistration, Unit> {
    public final void TuitionPaymentFragmentbindingInflater1(VocationRegistrationStep vocationRegistrationStep, VocationalRegistration vocationalRegistration) {
        Intrinsics.checkNotNullParameter(vocationRegistrationStep, "");
        Intrinsics.checkNotNullParameter(vocationalRegistration, "");
        VocationalRegistrationActivity.TuitionPaymentFragmentbindingInflater1((VocationalRegistrationActivity) this.receiver, vocationRegistrationStep, vocationalRegistration);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(VocationRegistrationStep vocationRegistrationStep, VocationalRegistration vocationalRegistration) {
        TuitionPaymentFragmentbindingInflater1(vocationRegistrationStep, vocationalRegistration);
        return Unit.INSTANCE;
    }

    VocationalRegistrationActivity$onStepChanged$replacementFragment$1$1(Object obj) {
        super(2, obj, VocationalRegistrationActivity.class, "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault3(Lcom/bpjstku/presentation/vocational/model/VocationRegistrationStep;Lcom/bpjstku/presentation/vocational/model/VocationalRegistration;)V", 0);
    }
}
