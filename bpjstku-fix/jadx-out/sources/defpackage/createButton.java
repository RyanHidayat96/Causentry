package defpackage;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class createButton implements DatePickerDialog.OnDateSetListener {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ createViewFromTag TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ createButton(createViewFromTag createviewfromtag) {
        this.TuitionPaymentFragmentbindingInflater1 = createviewfromtag;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = i % 5778121;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().heightPixels;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        return i3;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        createViewFromTag.b(this.TuitionPaymentFragmentbindingInflater1, i, i2, i3);
    }
}
