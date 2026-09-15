package com.bpjstku.presentation.syariah;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivitySyariahBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class SyariahActivationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivitySyariahBinding> {
    public static final SyariahActivationActivity$bindingInflater$1 b = new SyariahActivationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivitySyariahBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivitySyariahBinding.inflate(layoutInflater);
    }

    SyariahActivationActivity$bindingInflater$1() {
        super(1, ActivitySyariahBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivitySyariahBinding;", 0);
    }
}
