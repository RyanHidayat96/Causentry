package defpackage;

import android.content.Context;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setVisibility implements Predicate {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ setVisibility(Function1 function1) {
        this.TuitionPaymentFragmentbindingInflater1 = function1;
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 6142577;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().navigation;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        return i3;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return refreshVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, obj);
    }
}
