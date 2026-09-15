package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityResultRegistryExternalSyntheticLambda0 {
    public final String TuitionPaymentFragmentbindingInflater1;

    public ActivityResultRegistryExternalSyntheticLambda0(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentbindingInflater1 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActivityResultRegistryExternalSyntheticLambda0) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((ActivityResultRegistryExternalSyntheticLambda0) obj).TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        return this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("ResetPasswordStatus(message=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
