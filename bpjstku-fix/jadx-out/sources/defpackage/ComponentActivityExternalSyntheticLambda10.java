package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ComponentActivityExternalSyntheticLambda10 {
    public final ComponentActivityExternalSyntheticLambda12 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final boolean b;

    public ComponentActivityExternalSyntheticLambda10(boolean z, String str, ComponentActivityExternalSyntheticLambda12 componentActivityExternalSyntheticLambda12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(componentActivityExternalSyntheticLambda12, "");
        this.b = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = componentActivityExternalSyntheticLambda12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentActivityExternalSyntheticLambda10)) {
            return false;
        }
        ComponentActivityExternalSyntheticLambda10 componentActivityExternalSyntheticLambda10 = (ComponentActivityExternalSyntheticLambda10) obj;
        return this.b == componentActivityExternalSyntheticLambda10.b && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, componentActivityExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, componentActivityExternalSyntheticLambda10.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        return (((Boolean.hashCode(this.b) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public final String toString() {
        boolean z = this.b;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        ComponentActivityExternalSyntheticLambda12 componentActivityExternalSyntheticLambda12 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("JhtGenerateCode(isSuccessful=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str);
        sb.append(", data=");
        sb.append(componentActivityExternalSyntheticLambda12);
        sb.append(")");
        return sb.toString();
    }
}
