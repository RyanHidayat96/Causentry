package com.bpjstku.presentation.asik.active;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityAsikActiveParticipantBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AsikActiveParticipantActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityAsikActiveParticipantBinding> {
    public static final AsikActiveParticipantActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AsikActiveParticipantActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityAsikActiveParticipantBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityAsikActiveParticipantBinding.inflate(layoutInflater);
    }

    AsikActiveParticipantActivity$bindingInflater$1() {
        super(1, ActivityAsikActiveParticipantBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityAsikActiveParticipantBinding;", 0);
    }
}
