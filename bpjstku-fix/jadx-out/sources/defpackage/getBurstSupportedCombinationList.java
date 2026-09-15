package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import com.bpjstku.presentation.queueing.BookingAntreanSuccessActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getBurstSupportedCombinationList implements Function1 {
    private /* synthetic */ Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private /* synthetic */ BookingAntreanSuccessActivity b;

    public /* synthetic */ getBurstSupportedCombinationList(BookingAntreanSuccessActivity bookingAntreanSuccessActivity, Bitmap bitmap) {
        this.b = bookingAntreanSuccessActivity;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bitmap;
    }

    public static /* synthetic */ void b() {
        removeTimestamp.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = Class.forName("cancelInputBuffer").getDeclaredField("TuitionPaymentFragmentbindingInflater1");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return BookingAntreanSuccessActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
    }
}
