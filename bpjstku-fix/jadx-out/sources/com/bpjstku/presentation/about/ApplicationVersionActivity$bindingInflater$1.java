package com.bpjstku.presentation.about;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityApplicationVersionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ApplicationVersionActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityApplicationVersionBinding> {
    public static final ApplicationVersionActivity$bindingInflater$1 b = new ApplicationVersionActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityApplicationVersionBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityApplicationVersionBinding.inflate(layoutInflater);
    }

    ApplicationVersionActivity$bindingInflater$1() {
        super(1, ActivityApplicationVersionBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityApplicationVersionBinding;", 0);
    }
}
