package com.bpjstku.presentation.vocational;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityVocationalDisabledBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class VocationalDisabledActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityVocationalDisabledBinding> {
    public static final VocationalDisabledActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new VocationalDisabledActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityVocationalDisabledBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityVocationalDisabledBinding.inflate(layoutInflater);
    }

    VocationalDisabledActivity$bindingInflater$1() {
        super(1, ActivityVocationalDisabledBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityVocationalDisabledBinding;", 0);
    }
}
