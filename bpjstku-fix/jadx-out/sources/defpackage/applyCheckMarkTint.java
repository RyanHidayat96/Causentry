package defpackage;

import android.content.Context;
import androidx.p002lifecycle.Observer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class applyCheckMarkTint implements Observer {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    private /* synthetic */ setCheckMarkDrawable TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public /* synthetic */ applyCheckMarkTint(setCheckMarkDrawable setcheckmarkdrawable) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = setcheckmarkdrawable;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 5510990;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().smallestScreenWidthDp;
        b = i3;
        return i3;
    }

    @Override // androidx.p002lifecycle.Observer
    public final void onChanged(Object obj) {
        setCheckMarkDrawable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
    }
}
