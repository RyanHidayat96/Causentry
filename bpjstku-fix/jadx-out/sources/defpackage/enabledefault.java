package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class enabledefault {
    public String TuitionPaymentFragmentbindingInflater1;
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public enabledefault(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enabledefault)) {
            return false;
        }
        enabledefault enabledefaultVar = (enabledefault) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, enabledefaultVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, enabledefaultVar.TuitionPaymentFragmentbindingInflater1) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == enabledefaultVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str2 = this.TuitionPaymentFragmentbindingInflater1;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("ScreenItem(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", img=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
