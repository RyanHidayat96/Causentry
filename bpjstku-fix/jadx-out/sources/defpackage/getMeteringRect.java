package defpackage;

import android.content.Context;
import android.view.View;
import com.bpjstku.presentation.promo.SearchCoMarketingActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getMeteringRect implements View.OnClickListener {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ SearchCoMarketingActivity TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public /* synthetic */ getMeteringRect(SearchCoMarketingActivity searchCoMarketingActivity) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = searchCoMarketingActivity;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 8840041;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getDisplayMetrics().densityDpi;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        return i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchCoMarketingActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, view);
    }
}
