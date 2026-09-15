package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 {
    public final String TuitionPaymentFragmentbindingInflater1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4)) {
            return false;
        }
        r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4 r8lambdai2xi7mochmmaz9qzzewheaxs4 = (r8lambdaI2Xi7mOChmMAZ9qZZEwheaxs4) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == r8lambdai2xi7mochmmaz9qzzewheaxs4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        StringBuilder sb = new StringBuilder("BpjsService(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", image=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
