package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class recalculateAvailableCameras {
    private final String TuitionPaymentFragmentbindingInflater1;

    /* synthetic */ recalculateAvailableCameras(recalculateAvailableCameras recalculateavailablecameras, byte b) {
        this(recalculateavailablecameras);
    }

    public static recalculateAvailableCameras TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        return new recalculateAvailableCameras(str);
    }

    public static recalculateAvailableCameras TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new recalculateAvailableCameras(",");
    }

    private recalculateAvailableCameras(String str) {
        this.TuitionPaymentFragmentbindingInflater1 = str;
    }

    private recalculateAvailableCameras(recalculateAvailableCameras recalculateavailablecameras) {
        this.TuitionPaymentFragmentbindingInflater1 = recalculateavailablecameras.TuitionPaymentFragmentbindingInflater1;
    }

    public <A extends Appendable> A TuitionPaymentFragmentspecialinlinedviewModeldefault1(A a2, Iterator<? extends Object> it) throws IOException {
        if (it.hasNext()) {
            Object next = it.next();
            Objects.requireNonNull(next);
            a2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
            while (it.hasNext()) {
                a2.append(this.TuitionPaymentFragmentbindingInflater1);
                Object next2 = it.next();
                Objects.requireNonNull(next2);
                a2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
            }
        }
        return a2;
    }

    public final StringBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2(StringBuilder sb, Iterator<? extends Object> it) {
        try {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb, it);
            return sb;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, str, (byte) 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private final String TuitionPaymentFragmentbindingInflater1;
        private final recalculateAvailableCameras TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculateAvailableCameras recalculateavailablecameras, String str, byte b) {
            this(recalculateavailablecameras, str);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculateAvailableCameras recalculateavailablecameras, String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = recalculateavailablecameras;
            this.TuitionPaymentFragmentbindingInflater1 = str;
        }

        public final StringBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                if (it.hasNext()) {
                    Map.Entry<?, ?> next = it.next();
                    sb.append(recalculateAvailableCameras.TuitionPaymentFragmentspecialinlinedviewModeldefault3(next.getKey()));
                    sb.append((CharSequence) this.TuitionPaymentFragmentbindingInflater1);
                    sb.append(recalculateAvailableCameras.TuitionPaymentFragmentspecialinlinedviewModeldefault3(next.getValue()));
                    while (it.hasNext()) {
                        sb.append((CharSequence) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
                        Map.Entry<?, ?> next2 = it.next();
                        sb.append(recalculateAvailableCameras.TuitionPaymentFragmentspecialinlinedviewModeldefault3(next2.getKey()));
                        sb.append((CharSequence) this.TuitionPaymentFragmentbindingInflater1);
                        sb.append(recalculateAvailableCameras.TuitionPaymentFragmentspecialinlinedviewModeldefault3(next2.getValue()));
                    }
                }
                return sb;
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    static CharSequence TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
