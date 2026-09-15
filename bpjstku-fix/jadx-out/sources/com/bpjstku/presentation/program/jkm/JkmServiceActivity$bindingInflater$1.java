package com.bpjstku.presentation.program.jkm;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityJkmServiceBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JkmServiceActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJkmServiceBinding> {
    public static final JkmServiceActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new JkmServiceActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityJkmServiceBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityJkmServiceBinding.inflate(layoutInflater);
    }

    JkmServiceActivity$bindingInflater$1() {
        super(1, ActivityJkmServiceBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJkmServiceBinding;", 0);
    }
}
