package com.bpjstku.presentation.queueing;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityQueueingServiceBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class QueueingServiceActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityQueueingServiceBinding> {
    public static final QueueingServiceActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new QueueingServiceActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final ActivityQueueingServiceBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityQueueingServiceBinding.inflate(layoutInflater);
    }

    QueueingServiceActivity$bindingInflater$1() {
        super(1, ActivityQueueingServiceBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityQueueingServiceBinding;", 0);
    }
}
