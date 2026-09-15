package com.bpjstku.presentation.program.jpn;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityJpnSimulationResultBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JpnSimulationResultActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJpnSimulationResultBinding> {
    public static final JpnSimulationResultActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new JpnSimulationResultActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityJpnSimulationResultBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityJpnSimulationResultBinding.inflate(layoutInflater);
    }

    JpnSimulationResultActivity$bindingInflater$1() {
        super(1, ActivityJpnSimulationResultBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJpnSimulationResultBinding;", 0);
    }
}
