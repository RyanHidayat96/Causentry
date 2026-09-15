package defpackage;

import android.os.Process;
import com.google.common.collect.ImmutableList;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class CaptureBundle implements BiConsumer {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public static int TuitionPaymentFragmentbindingInflater1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 6028171;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int iMyUid = Process.myUid();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iMyUid;
        return iMyUid;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((ImmutableList.TuitionPaymentFragmentbindingInflater1) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj2);
    }
}
