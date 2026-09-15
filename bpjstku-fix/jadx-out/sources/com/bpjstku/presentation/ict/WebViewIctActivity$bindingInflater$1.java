package com.bpjstku.presentation.ict;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityWebViewIctBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class WebViewIctActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityWebViewIctBinding> {
    public static final WebViewIctActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new WebViewIctActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityWebViewIctBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityWebViewIctBinding.inflate(layoutInflater);
    }

    WebViewIctActivity$bindingInflater$1() {
        super(1, ActivityWebViewIctBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityWebViewIctBinding;", 0);
    }
}
