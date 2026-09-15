package defpackage;

import android.content.Context;
import com.bpjstku.presentation.scholarship.confirm.ScholarConfirmActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getSessionConfigTemplateType implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;
    private /* synthetic */ ScholarConfirmActivity TuitionPaymentFragmentbindingInflater1;

    public /* synthetic */ getSessionConfigTemplateType(ScholarConfirmActivity scholarConfirmActivity) {
        this.TuitionPaymentFragmentbindingInflater1 = scholarConfirmActivity;
    }

    public static int b() {
        int i = b;
        int i2 = i % 5030741;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().keyboard;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3;
        return i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ScholarConfirmActivity.b(this.TuitionPaymentFragmentbindingInflater1, (Boolean) obj);
    }
}
