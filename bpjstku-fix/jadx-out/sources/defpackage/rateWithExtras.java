package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class rateWithExtras<V> {
    final Throwable TuitionPaymentFragmentbindingInflater1;
    public final V TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public rateWithExtras(V v) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = v;
        this.TuitionPaymentFragmentbindingInflater1 = null;
    }

    public rateWithExtras(Throwable th) {
        this.TuitionPaymentFragmentbindingInflater1 = th;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rateWithExtras)) {
            return false;
        }
        rateWithExtras ratewithextras = (rateWithExtras) obj;
        V v = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (v != null && v.equals(ratewithextras.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            return true;
        }
        Throwable th = this.TuitionPaymentFragmentbindingInflater1;
        if (th == null || ratewithextras.TuitionPaymentFragmentbindingInflater1 == null) {
            return false;
        }
        return th.toString().equals(this.TuitionPaymentFragmentbindingInflater1.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1});
    }
}
