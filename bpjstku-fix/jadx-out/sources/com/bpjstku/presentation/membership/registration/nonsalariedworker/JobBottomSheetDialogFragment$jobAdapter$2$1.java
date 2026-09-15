package com.bpjstku.presentation.membership.registration.nonsalariedworker;

import com.bpjstku.presentation.membership.registration.model.Job;
import defpackage.saveBitmap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class JobBottomSheetDialogFragment$jobAdapter$2$1 extends FunctionReferenceImpl implements Function1<Job, Unit> {
    public final void b(Job job) {
        Intrinsics.checkNotNullParameter(job, "");
        saveBitmap.TuitionPaymentFragmentbindingInflater1((saveBitmap) this.receiver, job);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Job job) {
        b(job);
        return Unit.INSTANCE;
    }

    public JobBottomSheetDialogFragment$jobAdapter$2$1(Object obj) {
        super(1, obj, saveBitmap.class, "handleItemClicked", "handleItemClicked(Lcom/bpjstku/presentation/membership/registration/model/Job;)V", 0);
    }
}
