package com.bpjstku.presentation.program.jpn;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityJpnMainBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class JpnMainActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityJpnMainBinding> {
    public static final JpnMainActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new JpnMainActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityJpnMainBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityJpnMainBinding.inflate(layoutInflater);
    }

    JpnMainActivity$bindingInflater$1() {
        super(1, ActivityJpnMainBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityJpnMainBinding;", 0);
    }
}
