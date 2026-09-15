package defpackage;

import android.os.Process;
import android.view.View;
import com.bpjstku.presentation.membership.payment.RegisterAutoDebetActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class setRelative implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private /* synthetic */ RegisterAutoDebetActivity b;

    public /* synthetic */ setRelative(RegisterAutoDebetActivity registerAutoDebetActivity) {
        this.b = registerAutoDebetActivity;
    }

    public static int b() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = i % 5013294;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int iMyUid = Process.myUid();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iMyUid;
        return iMyUid;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return RegisterAutoDebetActivity.a(this.b, (View) obj);
    }
}
