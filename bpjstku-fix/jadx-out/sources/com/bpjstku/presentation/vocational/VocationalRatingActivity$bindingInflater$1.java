package com.bpjstku.presentation.vocational;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityVocationalRatingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class VocationalRatingActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityVocationalRatingBinding> {
    public static final VocationalRatingActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new VocationalRatingActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityVocationalRatingBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityVocationalRatingBinding.inflate(layoutInflater);
    }

    VocationalRatingActivity$bindingInflater$1() {
        super(1, ActivityVocationalRatingBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityVocationalRatingBinding;", 0);
    }
}
