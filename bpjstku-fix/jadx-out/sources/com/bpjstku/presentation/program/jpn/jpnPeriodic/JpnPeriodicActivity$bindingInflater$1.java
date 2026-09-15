package com.bpjstku.presentation.program.jpn.jpnPeriodic;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityJpnPeriodicBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JpnPeriodicActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJpnPeriodicBinding> {
    public static final JpnPeriodicActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new JpnPeriodicActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityJpnPeriodicBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityJpnPeriodicBinding.inflate(layoutInflater);
    }

    JpnPeriodicActivity$bindingInflater$1() {
        super(1, ActivityJpnPeriodicBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJpnPeriodicBinding;", 0);
    }
}
