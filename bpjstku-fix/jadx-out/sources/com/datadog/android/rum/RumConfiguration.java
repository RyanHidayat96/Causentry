package com.datadog.android.rum;

import com.datadog.android.rum.tracking.ViewTrackingStrategy;
import defpackage.removeStaleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/RumConfiguration;", "", "", "p0", "LremoveStaleData$TuitionPaymentFragmentbindingInflater1;", "p1", "<init>", "(Ljava/lang/String;LremoveStaleData$TuitionPaymentFragmentbindingInflater1;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LremoveStaleData$TuitionPaymentFragmentbindingInflater1;", "Builder"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class RumConfiguration {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    final String b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    final removeStaleData.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public RumConfiguration(String str, removeStaleData.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentbindingInflater1, "");
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RumConfiguration)) {
            return false;
        }
        RumConfiguration rumConfiguration = (RumConfiguration) p0;
        return Intrinsics.areEqual(this.b, rumConfiguration.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, rumConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
    }

    public final String toString() {
        String str = this.b;
        removeStaleData.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder("RumConfiguration(b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(tuitionPaymentFragmentbindingInflater1);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u000e\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/rum/RumConfiguration$Builder;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "Lcom/datadog/android/rum/RumConfiguration;", "build", "()Lcom/datadog/android/rum/RumConfiguration;", "disableUserInteractionTracking", "()Lcom/datadog/android/rum/RumConfiguration$Builder;", "Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;", "useViewTrackingStrategy", "(Lcom/datadog/android/rum/tracking/ViewTrackingStrategy;)Lcom/datadog/android/rum/RumConfiguration$Builder;", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "b", "LremoveStaleData$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LremoveStaleData$TuitionPaymentFragmentbindingInflater1;"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private final String b;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        private removeStaleData.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1;

        public Builder(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.b = str;
            removeStaleData.Companion companion = removeStaleData.INSTANCE;
            this.TuitionPaymentFragmentbindingInflater1 = removeStaleData.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        public final Builder disableUserInteractionTracking() {
            this.TuitionPaymentFragmentbindingInflater1 = removeStaleData.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, null, 0.0f, 0.0f, 0.0f, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, 2097135);
            return this;
        }

        public final Builder useViewTrackingStrategy(ViewTrackingStrategy p0) {
            this.TuitionPaymentFragmentbindingInflater1 = removeStaleData.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, null, 0.0f, 0.0f, 0.0f, false, null, null, p0, null, null, null, null, null, null, null, false, false, false, null, null, null, 2097023);
            return this;
        }

        public final RumConfiguration build() {
            Object obj = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1.get("_dd.telemetry.configuration_sample_rate");
            Float fValueOf = null;
            if (obj != null && (obj instanceof Number)) {
                fValueOf = Float.valueOf(((Number) obj).floatValue());
            }
            String str = this.b;
            removeStaleData.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentbindingInflater1;
            if (fValueOf != null) {
                tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = removeStaleData.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3, null, 0.0f, 0.0f, fValueOf.floatValue(), false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, 2097143);
            }
            return new RumConfiguration(str, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }
}
