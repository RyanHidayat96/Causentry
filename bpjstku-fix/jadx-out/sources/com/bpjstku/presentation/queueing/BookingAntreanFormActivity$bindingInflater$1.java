package com.bpjstku.presentation.queueing;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityBookingAntreanFormBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class BookingAntreanFormActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityBookingAntreanFormBinding> {
    public static final BookingAntreanFormActivity$bindingInflater$1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new BookingAntreanFormActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
    public final ActivityBookingAntreanFormBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityBookingAntreanFormBinding.inflate(layoutInflater);
    }

    BookingAntreanFormActivity$bindingInflater$1() {
        super(1, ActivityBookingAntreanFormBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityBookingAntreanFormBinding;", 0);
    }
}
