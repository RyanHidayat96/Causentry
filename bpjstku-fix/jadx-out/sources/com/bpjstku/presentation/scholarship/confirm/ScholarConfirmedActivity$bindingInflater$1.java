package com.bpjstku.presentation.scholarship.confirm;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityScholarConfirmedBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ScholarConfirmedActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityScholarConfirmedBinding> {
    public static final ScholarConfirmedActivity$bindingInflater$1 b = new ScholarConfirmedActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityScholarConfirmedBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityScholarConfirmedBinding.inflate(layoutInflater);
    }

    ScholarConfirmedActivity$bindingInflater$1() {
        super(1, ActivityScholarConfirmedBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityScholarConfirmedBinding;", 0);
    }
}
