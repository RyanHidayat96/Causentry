package defpackage;

import android.util.Base64;
import com.google.android.datatransport.Priority;

/* JADX INFO: loaded from: classes3.dex */
public abstract class retryRequest {

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(String str);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1(byte[] bArr);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority);

        public abstract retryRequest TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public abstract byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public abstract String TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public abstract Priority TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", TuitionPaymentFragmentspecialinlinedviewModeldefault2(), TuitionPaymentFragmentspecialinlinedviewModeldefault3(), TuitionPaymentFragmentspecialinlinedviewModeldefault1() == null ? "" : Base64.encodeToString(TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 2));
    }

    public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 b() {
        hasCapturingRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new hasCapturingRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        Priority priority = Priority.DEFAULT;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = priority;
        return tuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
