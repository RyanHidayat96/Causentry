package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class resume {
    public abstract Integer TuitionPaymentFragmentbindingInflater1();

    public abstract issueNextRequest TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public abstract long TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public abstract byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public abstract String a();

    public abstract String asBinder();

    public abstract Integer asInterface();

    protected abstract Map<String, String> b();

    public abstract byte[] d();

    public abstract long g();

    public final Map<String, String> INotificationSideChannel() {
        return Collections.unmodifiableMap(b());
    }

    public final int TuitionPaymentFragmentbindingInflater1(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 cancelAll() {
        abortRequests.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new abortRequests.TuitionPaymentFragmentbindingInflater1();
        String strA = a();
        if (strA == null) {
            throw new NullPointerException("Null transportName");
        }
        tuitionPaymentFragmentbindingInflater1.b = strA;
        return tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentbindingInflater1()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(asInterface()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(asBinder()).TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault3()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(d()).b(TuitionPaymentFragmentspecialinlinedviewModeldefault1()).TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault2()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(g()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new HashMap(b()));
    }

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(long j);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(String str);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(byte[] bArr);

        protected abstract Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Integer num);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j);

        protected abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Map<String, String> map);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(Integer num);

        public abstract TuitionPaymentFragmentspecialinlinedviewModeldefault2 b(issueNextRequest issuenextrequest);

        public abstract resume b();

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1().put(str, str2);
            return this;
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, long j) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1().put(str, String.valueOf(j));
            return this;
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, int i) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1().put(str, String.valueOf(i));
            return this;
        }
    }
}
