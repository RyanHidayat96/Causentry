package com.bpjstku.presentation.util;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityNewWebviewCustomBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class NewWebviewCustomActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityNewWebviewCustomBinding> {
    public static final NewWebviewCustomActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new NewWebviewCustomActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityNewWebviewCustomBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityNewWebviewCustomBinding.inflate(layoutInflater);
    }

    NewWebviewCustomActivity$bindingInflater$1() {
        super(1, ActivityNewWebviewCustomBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityNewWebviewCustomBinding;", 0);
    }
}
