package com.bpjstku.presentation.program.jkk;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityJkkServiceBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JkkServiceActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJkkServiceBinding> {
    public static final JkkServiceActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new JkkServiceActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityJkkServiceBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityJkkServiceBinding.inflate(layoutInflater);
    }

    JkkServiceActivity$bindingInflater$1() {
        super(1, ActivityJkkServiceBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJkkServiceBinding;", 0);
    }
}
