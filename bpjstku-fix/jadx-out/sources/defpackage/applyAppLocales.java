package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class applyAppLocales implements View.OnClickListener {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ setDefaultNightMode b;

    public /* synthetic */ applyAppLocales(setDefaultNightMode setdefaultnightmode) {
        this.b = setdefaultnightmode;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 7749798;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        return i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        setDefaultNightMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, view);
    }
}
