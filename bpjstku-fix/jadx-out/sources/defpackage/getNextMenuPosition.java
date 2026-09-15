package defpackage;

import android.content.Context;
import com.bpjstku.data.danasiaga.model.response.EligibleIctMenuResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getNextMenuPosition implements Function1 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    private /* synthetic */ createPopupWindow TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static int b() {
        int i = b;
        int i2 = i % 6097782;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().screenHeightDp;
        TuitionPaymentFragmentbindingInflater1 = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return createPopupWindow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (EligibleIctMenuResponse) obj);
    }
}
