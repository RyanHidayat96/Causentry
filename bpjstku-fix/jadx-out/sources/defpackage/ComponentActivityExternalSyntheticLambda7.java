package defpackage;

import com.bpjstku.util.enums.TrackingStatusEnum;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ComponentActivityExternalSyntheticLambda7 {
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final TrackingStatusEnum TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final String b;

    public ComponentActivityExternalSyntheticLambda7(String str, String str2, TrackingStatusEnum trackingStatusEnum) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(trackingStatusEnum, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
        this.b = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = trackingStatusEnum;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentActivityExternalSyntheticLambda7)) {
            return false;
        }
        ComponentActivityExternalSyntheticLambda7 componentActivityExternalSyntheticLambda7 = (ComponentActivityExternalSyntheticLambda7) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, componentActivityExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.b, componentActivityExternalSyntheticLambda7.b) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == componentActivityExternalSyntheticLambda7.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode() * 31) + this.b.hashCode()) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str2 = this.b;
        TrackingStatusEnum trackingStatusEnum = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("JkpClaimTracking(eventName=");
        sb.append(str);
        sb.append(", eventDate=");
        sb.append(str2);
        sb.append(", eventStatus=");
        sb.append(trackingStatusEnum);
        sb.append(")");
        return sb.toString();
    }
}
