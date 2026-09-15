package com.bpjstku.presentation.danasiaga;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDanasiagaConcentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DanaSiagaConcentActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDanasiagaConcentBinding> {
    public static final DanaSiagaConcentActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new DanaSiagaConcentActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityDanasiagaConcentBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDanasiagaConcentBinding.inflate(layoutInflater);
    }

    DanaSiagaConcentActivity$bindingInflater$1() {
        super(1, ActivityDanasiagaConcentBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDanasiagaConcentBinding;", 0);
    }
}
