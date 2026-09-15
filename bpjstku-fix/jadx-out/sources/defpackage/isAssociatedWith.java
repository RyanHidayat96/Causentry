package defpackage;

import android.view.View;
import com.bpjstku.presentation.news.DetailNewsActivity;
import java.util.Random;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isAssociatedWith implements Function1 {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int b;

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = b;
        int i2 = i % 5891860;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        int iNextInt = new Random().nextInt();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iNextInt;
        return iNextInt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return DetailNewsActivity.TuitionPaymentFragmentbindingInflater1((View) obj);
    }
}
