package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class startActivityForResult {
    public final List<removeOnUserLeaveHintListener> TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public startActivityForResult(String str, List<removeOnUserLeaveHintListener> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentbindingInflater1 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof startActivityForResult)) {
            return false;
        }
        startActivityForResult startactivityforresult = (startActivityForResult) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, startactivityforresult.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, startactivityforresult.TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        return (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        List<removeOnUserLeaveHintListener> list = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("JhtContribution(companyName=");
        sb.append(str);
        sb.append(", contributions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
