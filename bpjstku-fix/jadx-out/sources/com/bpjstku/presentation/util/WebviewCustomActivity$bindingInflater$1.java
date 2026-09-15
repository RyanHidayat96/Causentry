package com.bpjstku.presentation.util;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityWebviewCustomBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class WebviewCustomActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityWebviewCustomBinding> {
    public static final WebviewCustomActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new WebviewCustomActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityWebviewCustomBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityWebviewCustomBinding.inflate(layoutInflater);
    }

    WebviewCustomActivity$bindingInflater$1() {
        super(1, ActivityWebviewCustomBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityWebviewCustomBinding;", 0);
    }
}
