package com.bpjstku.presentation.complaint;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityDataUnmatchedComplaintBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class DataUnmatchedComplaintActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityDataUnmatchedComplaintBinding> {
    public static final DataUnmatchedComplaintActivity$bindingInflater$1 TuitionPaymentFragmentbindingInflater1 = new DataUnmatchedComplaintActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
    public final ActivityDataUnmatchedComplaintBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityDataUnmatchedComplaintBinding.inflate(layoutInflater);
    }

    DataUnmatchedComplaintActivity$bindingInflater$1() {
        super(1, ActivityDataUnmatchedComplaintBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityDataUnmatchedComplaintBinding;", 0);
    }
}
