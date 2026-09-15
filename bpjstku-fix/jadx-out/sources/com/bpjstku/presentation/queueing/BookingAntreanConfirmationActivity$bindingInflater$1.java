package com.bpjstku.presentation.queueing;

import android.view.LayoutInflater;
import com.bpjstku.databinding.ActivityBookingAntreanConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class BookingAntreanConfirmationActivity$bindingInflater$1 extends FunctionReferenceImpl implements Function1<LayoutInflater, ActivityBookingAntreanConfirmationBinding> {
    public static final BookingAntreanConfirmationActivity$bindingInflater$1 b = new BookingAntreanConfirmationActivity$bindingInflater$1();

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityBookingAntreanConfirmationBinding invoke(LayoutInflater layoutInflater) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return ActivityBookingAntreanConfirmationBinding.inflate(layoutInflater);
    }

    BookingAntreanConfirmationActivity$bindingInflater$1() {
        super(1, ActivityBookingAntreanConfirmationBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lcom/bpjstku/databinding/ActivityBookingAntreanConfirmationBinding;", 0);
    }
}
