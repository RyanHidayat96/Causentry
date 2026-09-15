package com.bpjstku.presentation.program.jpn;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityJpnSimulationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JpnSimulationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJpnSimulationBinding> {
    public static final JpnSimulationActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new JpnSimulationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityJpnSimulationBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityJpnSimulationBinding.inflate(layoutInflater);
    }

    JpnSimulationActivity$bindingInflater$1() {
        super(1, ActivityJpnSimulationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJpnSimulationBinding;", 0);
    }
}
