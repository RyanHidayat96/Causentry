package defpackage;

import com.bpjstku.util.enums.TrackingStatusEnum;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class enableEdgeToEdgelambda1 {
    public final TrackingStatusEnum TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public enableEdgeToEdgelambda1(String str, String str2, TrackingStatusEnum trackingStatusEnum) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(trackingStatusEnum, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.TuitionPaymentFragmentbindingInflater1 = trackingStatusEnum;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enableEdgeToEdgelambda1)) {
            return false;
        }
        enableEdgeToEdgelambda1 enableedgetoedgelambda1 = (enableEdgeToEdgelambda1) obj;
        return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, enableedgetoedgelambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, enableedgetoedgelambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentbindingInflater1 == enableedgetoedgelambda1.TuitionPaymentFragmentbindingInflater1;
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode()) * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode();
    }

    public final String toString() {
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        TrackingStatusEnum trackingStatusEnum = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("OldDaySecurityClaimTracking(eventName=");
        sb.append(str);
        sb.append(", eventDate=");
        sb.append(str2);
        sb.append(", eventStatus=");
        sb.append(trackingStatusEnum);
        sb.append(")");
        return sb.toString();
    }
}
