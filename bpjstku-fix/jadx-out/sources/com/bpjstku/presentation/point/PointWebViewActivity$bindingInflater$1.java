package com.bpjstku.presentation.point;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityPointWebViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class PointWebViewActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityPointWebViewBinding> {
    public static final PointWebViewActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new PointWebViewActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityPointWebViewBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityPointWebViewBinding.inflate(layoutInflater);
    }

    PointWebViewActivity$bindingInflater$1() {
        super(1, ActivityPointWebViewBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityPointWebViewBinding;", 0);
    }
}
