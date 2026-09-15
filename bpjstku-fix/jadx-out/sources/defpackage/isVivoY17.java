package defpackage;

import android.os.Process;
import io.reactivex.exceptions.ProtocolViolationException;

/* JADX INFO: loaded from: classes5.dex */
public final class isVivoY17 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<?> cls) {
        String name = cls.getName();
        StringBuilder sb = new StringBuilder("It is not allowed to subscribe with a(n) ");
        sb.append(name);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(name);
        sb.append(" and subscribe that to the target source instead.");
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ProtocolViolationException(sb.toString()));
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 5021591;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        TuitionPaymentFragmentbindingInflater1 = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
