package defpackage;

import android.os.Process;
import com.bpjstku.presentation.membership.registration.EmailVerificationActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SearchView9 implements Function0 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;

    public static int b() {
        int i = b;
        int i2 = i % 7879317;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int iMyTid = Process.myTid();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iMyTid;
        return iMyTid;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return EmailVerificationActivity.onTransact();
    }
}
