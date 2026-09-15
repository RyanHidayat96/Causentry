package defpackage;

import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class isMirroring<T> {
    private static final TuitionPaymentFragmentbindingInflater1<Object> TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1<Object>() { // from class: isMirroring.5
        @Override // isMirroring.TuitionPaymentFragmentbindingInflater1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    };
    volatile byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final TuitionPaymentFragmentbindingInflater1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final T b;

    public interface TuitionPaymentFragmentbindingInflater1<T> {
        void TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public static <T> isMirroring<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        return new isMirroring<>(str, null, TuitionPaymentFragmentbindingInflater1);
    }

    public static <T> isMirroring<T> TuitionPaymentFragmentbindingInflater1(String str, T t) {
        return new isMirroring<>(str, t, TuitionPaymentFragmentbindingInflater1);
    }

    public static <T> isMirroring<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, T t, TuitionPaymentFragmentbindingInflater1<T> tuitionPaymentFragmentbindingInflater1) {
        return new isMirroring<>(str, t, tuitionPaymentFragmentbindingInflater1);
    }

    private isMirroring(String str, T t, TuitionPaymentFragmentbindingInflater1<T> tuitionPaymentFragmentbindingInflater1) {
        if (!TextUtils.isEmpty(str)) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.b = t;
            if (tuitionPaymentFragmentbindingInflater1 == null) {
                throw new NullPointerException("Argument must not be null");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof isMirroring) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(((isMirroring) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        return false;
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option{key='");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("'}");
        return sb.toString();
    }
}
