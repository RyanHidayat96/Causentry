package defpackage;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getAudioProfiles extends SchedulerConfig {
    private final Map<Priority, SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final CameraConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getAudioProfiles(CameraConfigs cameraConfigs, Map<Priority, SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2> map) {
        if (cameraConfigs == null) {
            throw new NullPointerException("Null clock");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraConfigs;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final CameraConfigs TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map<Priority, SchedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault2> TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SchedulerConfig{clock=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", values=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(schedulerConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(schedulerConfig.TuitionPaymentFragmentbindingInflater1());
    }

    public final int hashCode() {
        return ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() ^ 1000003) * 1000003) ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }
}
