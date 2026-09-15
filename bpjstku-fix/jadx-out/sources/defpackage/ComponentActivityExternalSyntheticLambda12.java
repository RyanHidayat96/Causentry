package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ComponentActivityExternalSyntheticLambda12 {
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ComponentActivityExternalSyntheticLambda12(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComponentActivityExternalSyntheticLambda12) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((ComponentActivityExternalSyntheticLambda12) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("JhtDataPengajuanItem(kodePengajuan=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
