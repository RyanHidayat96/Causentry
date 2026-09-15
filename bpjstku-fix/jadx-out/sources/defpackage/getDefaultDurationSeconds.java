package defpackage;

import androidx.compose.material3.CalendarModelKt;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class getDefaultDurationSeconds extends SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
    private final long TuitionPaymentFragmentbindingInflater1;
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Set<SchedulerConfig.Flag> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* synthetic */ getDefaultDurationSeconds(long j, long j2, Set set, byte b) {
        this(j, j2, set);
    }

    private getDefaultDurationSeconds(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        this.TuitionPaymentFragmentbindingInflater1 = j2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final long b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final Set<SchedulerConfig.Flag> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigValue{delta=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", maxAllowedDelay=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", flags=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            return false;
        }
        SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && this.TuitionPaymentFragmentbindingInflater1 == tuitionPaymentFragmentspecialinlinedviewModeldefault2.b() && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final int hashCode() {
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        long j2 = this.TuitionPaymentFragmentbindingInflater1;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 {
        private Long TuitionPaymentFragmentbindingInflater1;
        public Set<SchedulerConfig.Flag> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private Long b;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1
        public final SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1
        public final SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1() {
            this.TuitionPaymentFragmentbindingInflater1 = Long.valueOf(CalendarModelKt.MillisecondsIn24Hours);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1
        public final SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(Set<SchedulerConfig.Flag> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1
        public final SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2 b() {
            String string;
            if (this.b != null) {
                string = "";
            } else {
                string = " delta";
            }
            if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" maxAllowedDelay");
                string = sb.toString();
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" flags");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new getDefaultDurationSeconds(this.b.longValue(), this.TuitionPaymentFragmentbindingInflater1.longValue(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (byte) 0);
        }
    }
}
