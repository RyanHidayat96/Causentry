package com.bpjstku.presentation.ewallet;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityEwalletUnlinkBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class EwalletUnlinkActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityEwalletUnlinkBinding> {
    public static final EwalletUnlinkActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new EwalletUnlinkActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityEwalletUnlinkBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityEwalletUnlinkBinding.inflate(layoutInflater);
    }

    EwalletUnlinkActivity$bindingInflater$1() {
        super(1, ActivityEwalletUnlinkBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityEwalletUnlinkBinding;", 0);
    }
}
