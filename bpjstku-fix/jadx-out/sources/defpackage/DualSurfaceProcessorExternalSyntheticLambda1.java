package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class DualSurfaceProcessorExternalSyntheticLambda1 {
    private final Long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final long b;

    public DualSurfaceProcessorExternalSyntheticLambda1(long j, Long l) {
        this.b = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DualSurfaceProcessorExternalSyntheticLambda1)) {
            return false;
        }
        DualSurfaceProcessorExternalSyntheticLambda1 dualSurfaceProcessorExternalSyntheticLambda1 = (DualSurfaceProcessorExternalSyntheticLambda1) obj;
        return this.b == dualSurfaceProcessorExternalSyntheticLambda1.b && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, dualSurfaceProcessorExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    public final int hashCode() {
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        Long l = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        return (i * 31) + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KronosTime(posixTimeMs=");
        sb.append(this.b);
        sb.append(", timeSinceLastNtpSyncMs=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(")");
        return sb.toString();
    }
}
