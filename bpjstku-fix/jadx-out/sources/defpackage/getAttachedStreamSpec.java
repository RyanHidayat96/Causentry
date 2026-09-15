package defpackage;

import com.dynatrace.android.agent.conf.DataCollectionLevel;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class getAttachedStreamSpec {
    private static final String b;
    private final boolean TuitionPaymentFragmentbindingInflater1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final DataCollectionLevel TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        DataCollectionLevel b = DataCollectionLevel.OFF;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
        boolean TuitionPaymentFragmentbindingInflater1 = false;
        Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
    }

    /* synthetic */ getAttachedStreamSpec(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, byte b2) {
        this(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("UserPrivacyOptions");
        b = sb.toString();
    }

    private getAttachedStreamSpec(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getAttachedStreamSpec getattachedstreamspec = (getAttachedStreamSpec) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == getattachedstreamspec.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == getattachedstreamspec.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && this.TuitionPaymentFragmentbindingInflater1 == getattachedstreamspec.TuitionPaymentFragmentbindingInflater1 && Objects.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, getattachedstreamspec.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        boolean z2 = this.TuitionPaymentFragmentbindingInflater1;
        Boolean bool = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return (((((iHashCode * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + ((bool == null || !bool.booleanValue()) ? 0 : 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserPrivacyOptions{dataCollectionLevel=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", crashReportingOptedIn=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", crashReplayOptedIn=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", screenRecordOptedIn=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('}');
        return sb.toString();
    }
}
