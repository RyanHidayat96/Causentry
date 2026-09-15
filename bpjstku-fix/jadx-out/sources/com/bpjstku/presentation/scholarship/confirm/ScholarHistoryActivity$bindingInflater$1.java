package com.bpjstku.presentation.scholarship.confirm;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityScholarHistoryBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class ScholarHistoryActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityScholarHistoryBinding> {
    public static final ScholarHistoryActivity$bindingInflater$1 b = new ScholarHistoryActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityScholarHistoryBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityScholarHistoryBinding.inflate(layoutInflater);
    }

    ScholarHistoryActivity$bindingInflater$1() {
        super(1, ActivityScholarHistoryBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityScholarHistoryBinding;", 0);
    }
}
