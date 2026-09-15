package com.bpjstku.presentation.digitalcard;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDigitalCardBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DigitalCardActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDigitalCardBinding> {
    public static final DigitalCardActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new DigitalCardActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityDigitalCardBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDigitalCardBinding.inflate(layoutInflater);
    }

    DigitalCardActivity$bindingInflater$1() {
        super(1, ActivityDigitalCardBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDigitalCardBinding;", 0);
    }
}
