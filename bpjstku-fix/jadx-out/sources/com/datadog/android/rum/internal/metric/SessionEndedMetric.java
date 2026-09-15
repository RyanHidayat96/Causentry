package com.datadog.android.rum.internal.metric;

import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0003\u0013!\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u000fR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u0015"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric;", "", "", "p0", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "p1", "", "p2", "", "p3", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;JZ)V", "", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/Map;", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentbindingInflater1", "b", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "d", "asBinder", "J", "asInterface", "Ljava/lang/String;", "g", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "a", "onTransact", "MissedEventType"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class SessionEndedMetric {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final Map<String, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Map<String, TuitionPaymentFragmentspecialinlinedviewModeldefault3> asInterface;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final long d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String g;
    public final boolean b;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Map<MissedEventType, Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final RumSessionScope.StartReason asBinder;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public boolean a;

    public SessionEndedMetric(String str, RumSessionScope.StartReason startReason, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(startReason, "");
        this.g = str;
        this.asBinder = startReason;
        this.d = j;
        this.b = z;
        this.asInterface = new LinkedHashMap();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new LinkedHashMap();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new LinkedHashMap();
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public final long TuitionPaymentFragmentbindingInflater1;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, long j, long j2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            this.TuitionPaymentFragmentbindingInflater1 = j;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) && this.TuitionPaymentFragmentbindingInflater1 == tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        public final int hashCode() {
            return (((((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + Long.hashCode(this.TuitionPaymentFragmentbindingInflater1)) * 31) + Long.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            long j = this.TuitionPaymentFragmentbindingInflater1;
            long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            StringBuilder sb = new StringBuilder("TrackedView(viewUrl=");
            sb.append(str);
            sb.append(", startMs=");
            sb.append(j);
            sb.append(", durationNs=");
            sb.append(j2);
            sb.append(", hasReplay=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType;", "", "<init>", "(Ljava/lang/String;I)V", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public enum MissedEventType {
        ACTION,
        RESOURCE,
        ERROR,
        LONG_TASK;


        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: com.datadog.android.rum.internal.metric.SessionEndedMetric$MissedEventType$b, reason: from kotlin metadata */
        /* JADX INFO: loaded from: classes6.dex */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/rum/internal/metric/SessionEndedMetric$MissedEventType$b;", "", "<init>", "()V"}, k = 1, mv = {1, 7, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
