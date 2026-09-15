package com.bpjstku.presentation.program.jht.olddaysecurity;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityOldDaySecurityBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class OldDaySecurityActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityOldDaySecurityBinding> {
    public static final OldDaySecurityActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new OldDaySecurityActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityOldDaySecurityBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityOldDaySecurityBinding.inflate(layoutInflater);
    }

    OldDaySecurityActivity$bindingInflater$1() {
        super(1, ActivityOldDaySecurityBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityOldDaySecurityBinding;", 0);
    }
}
