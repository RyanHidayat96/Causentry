package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getActivitySideSheetRoundedCornersPosition implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;
    private /* synthetic */ getActivitySideSheetPosition TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public /* synthetic */ getActivitySideSheetRoundedCornersPosition(getActivitySideSheetPosition getactivitysidesheetposition) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getactivitysidesheetposition;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 8871526;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return b;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        b = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return getActivitySideSheetPosition.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (String) obj);
    }
}
