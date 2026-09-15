package com.bpjstku.presentation.util;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityWebviewFaqCustomBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class WebviewFaqCustomActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityWebviewFaqCustomBinding> {
    public static final WebviewFaqCustomActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new WebviewFaqCustomActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityWebviewFaqCustomBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityWebviewFaqCustomBinding.inflate(layoutInflater);
    }

    WebviewFaqCustomActivity$bindingInflater$1() {
        super(1, ActivityWebviewFaqCustomBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityWebviewFaqCustomBinding;", 0);
    }
}
