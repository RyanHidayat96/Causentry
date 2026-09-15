package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class getSynchronousResult {
    private final String TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final String b;

    public getSynchronousResult(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
        this.TuitionPaymentFragmentbindingInflater1 = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSynchronousResult)) {
            return false;
        }
        getSynchronousResult getsynchronousresult = (getSynchronousResult) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getsynchronousresult.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.b, getsynchronousresult.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, getsynchronousresult.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, getsynchronousresult.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, getsynchronousresult.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        return (((((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.b;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str4 = this.TuitionPaymentFragmentbindingInflater1;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("IksBlk(iksEnd=");
        sb.append(str);
        sb.append(", iksStart=");
        sb.append(str2);
        sb.append(", blkIksCode=");
        sb.append(str3);
        sb.append(", iksNumber=");
        sb.append(str4);
        sb.append(", activeStatus=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
