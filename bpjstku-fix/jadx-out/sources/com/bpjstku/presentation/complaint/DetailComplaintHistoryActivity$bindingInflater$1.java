package com.bpjstku.presentation.complaint;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDetailComplaintHistoryBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DetailComplaintHistoryActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDetailComplaintHistoryBinding> {
    public static final DetailComplaintHistoryActivity$bindingInflater$1 b = new DetailComplaintHistoryActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
    public final ActivityDetailComplaintHistoryBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDetailComplaintHistoryBinding.inflate(layoutInflater);
    }

    DetailComplaintHistoryActivity$bindingInflater$1() {
        super(1, ActivityDetailComplaintHistoryBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDetailComplaintHistoryBinding;", 0);
    }
}
