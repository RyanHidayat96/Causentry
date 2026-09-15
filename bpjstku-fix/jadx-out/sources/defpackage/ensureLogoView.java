package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ensureLogoView implements Function1 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private /* synthetic */ setSplitTrack TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public /* synthetic */ ensureLogoView(setSplitTrack setsplittrack) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = setsplittrack;
    }

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentbindingInflater1;
        int i2 = i % 8235091;
        TuitionPaymentFragmentbindingInflater1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboardHidden;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return setSplitTrack.cancel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
    }
}
