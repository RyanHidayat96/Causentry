package com.bpjstku.presentation.danasiaga;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDanasiagaBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DanaSiagaActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDanasiagaBinding> {
    public static final DanaSiagaActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new DanaSiagaActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityDanasiagaBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDanasiagaBinding.inflate(layoutInflater);
    }

    DanaSiagaActivity$bindingInflater$1() {
        super(1, ActivityDanasiagaBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDanasiagaBinding;", 0);
    }
}
