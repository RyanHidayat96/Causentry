package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityResultRegistryExternalSyntheticLambda1 {
    public final Boolean TuitionPaymentFragmentbindingInflater1;

    public ActivityResultRegistryExternalSyntheticLambda1(Boolean bool) {
        this.TuitionPaymentFragmentbindingInflater1 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActivityResultRegistryExternalSyntheticLambda1) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, ((ActivityResultRegistryExternalSyntheticLambda1) obj).TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        Boolean bool = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("NotificationBadge(isBadge=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }
}
