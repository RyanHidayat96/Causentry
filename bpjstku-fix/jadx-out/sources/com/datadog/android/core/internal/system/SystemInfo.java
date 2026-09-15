package com.datadog.android.core.internal.system;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012"}, d2 = {"Lcom/datadog/android/core/internal/system/SystemInfo;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "(ZIZZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Z", "b", "I", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "BatteryStatus"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class SystemInfo {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final boolean b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentbindingInflater1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    private SystemInfo(boolean z, int i, boolean z2, boolean z3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.b = z2;
        this.TuitionPaymentFragmentbindingInflater1 = z3;
    }

    public /* synthetic */ SystemInfo(boolean z, int i, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/datadog/android/core/internal/system/SystemInfo$BatteryStatus;", "", "<init>", "(Ljava/lang/String;I)V", "TuitionPaymentFragmentbindingInflater1", "a", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum BatteryStatus {
        UNKNOWN,
        CHARGING,
        DISCHARGING,
        NOT_CHARGING,
        FULL;


        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.datadog.android.core.internal.system.SystemInfo$BatteryStatus$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/system/SystemInfo$BatteryStatus$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "Lcom/datadog/android/core/internal/system/SystemInfo$BatteryStatus;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(I)Lcom/datadog/android/core/internal/system/SystemInfo$BatteryStatus;"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public static BatteryStatus TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0) {
                if (p0 == 2) {
                    return BatteryStatus.CHARGING;
                }
                if (p0 == 3) {
                    return BatteryStatus.DISCHARGING;
                }
                if (p0 == 4) {
                    return BatteryStatus.NOT_CHARGING;
                }
                if (p0 == 5) {
                    return BatteryStatus.FULL;
                }
                return BatteryStatus.UNKNOWN;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public static /* synthetic */ SystemInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2(SystemInfo systemInfo, boolean z, int i, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            z = systemInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        if ((i2 & 2) != 0) {
            i = systemInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        if ((i2 & 4) != 0) {
            z2 = systemInfo.b;
        }
        if ((i2 & 8) != 0) {
            z3 = systemInfo.TuitionPaymentFragmentbindingInflater1;
        }
        return new SystemInfo(z, i, z2, z3);
    }

    public SystemInfo() {
        this(false, 0, false, false, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SystemInfo)) {
            return false;
        }
        SystemInfo systemInfo = (SystemInfo) p0;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == systemInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == systemInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.b == systemInfo.b && this.TuitionPaymentFragmentbindingInflater1 == systemInfo.TuitionPaymentFragmentbindingInflater1;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 31) + Integer.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentbindingInflater1);
    }

    public final String toString() {
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean z2 = this.b;
        boolean z3 = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("SystemInfo(TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(z);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(i);
        sb.append(", b=");
        sb.append(z2);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
