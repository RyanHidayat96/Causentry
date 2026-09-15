package com.bpjstku.presentation.digitalcard;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDetailDigitalCardBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DetailDigitalCardActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDetailDigitalCardBinding> {
    public static final DetailDigitalCardActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new DetailDigitalCardActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityDetailDigitalCardBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDetailDigitalCardBinding.inflate(layoutInflater);
    }

    DetailDigitalCardActivity$bindingInflater$1() {
        super(1, ActivityDetailDigitalCardBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDetailDigitalCardBinding;", 0);
    }
}
