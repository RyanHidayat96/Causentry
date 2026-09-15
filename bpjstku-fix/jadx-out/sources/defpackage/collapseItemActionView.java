package defpackage;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class collapseItemActionView implements View.OnClickListener {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ BaseMenuPresenter TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ collapseItemActionView(BaseMenuPresenter baseMenuPresenter) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = baseMenuPresenter;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 6667746;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        return i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BaseMenuPresenter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, view);
    }
}
