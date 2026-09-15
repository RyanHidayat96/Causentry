package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityResultContractSynchronousResult {
    public final String TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final String b;

    public ActivityResultContractSynchronousResult(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.b = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityResultContractSynchronousResult)) {
            return false;
        }
        ActivityResultContractSynchronousResult activityResultContractSynchronousResult = (ActivityResultContractSynchronousResult) obj;
        return Intrinsics.areEqual(this.b, activityResultContractSynchronousResult.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, activityResultContractSynchronousResult.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, activityResultContractSynchronousResult.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == activityResultContractSynchronousResult.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode()) * 31) + Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final String toString() {
        String str = this.b;
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("Survey(remarks=");
        sb.append(str);
        sb.append(", surveyCode=");
        sb.append(str2);
        sb.append(", surveyName=");
        sb.append(str3);
        sb.append(", rating=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
