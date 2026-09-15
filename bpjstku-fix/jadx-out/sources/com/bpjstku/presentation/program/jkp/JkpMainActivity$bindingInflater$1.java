package com.bpjstku.presentation.program.jkp;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityJkpMainBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JkpMainActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJkpMainBinding> {
    public static final JkpMainActivity$bindingInflater$1 b = new JkpMainActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityJkpMainBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityJkpMainBinding.inflate(layoutInflater);
    }

    JkpMainActivity$bindingInflater$1() {
        super(1, ActivityJkpMainBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJkpMainBinding;", 0);
    }
}
