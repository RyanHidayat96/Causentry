package com.bpjstku.presentation.main;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityMainBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class MainActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityMainBinding> {
    public static final MainActivity$bindingInflater$1 b = new MainActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityMainBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityMainBinding.inflate(layoutInflater);
    }

    MainActivity$bindingInflater$1() {
        super(1, ActivityMainBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityMainBinding;", 0);
    }
}
