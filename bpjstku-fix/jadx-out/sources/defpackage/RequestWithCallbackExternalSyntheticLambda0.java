package defpackage;

import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class RequestWithCallbackExternalSyntheticLambda0 extends TakePictureManager {
    private final Integer TuitionPaymentFragmentbindingInflater1;
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ComplianceData TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NetworkConnectionInfo f204a;
    private final String asBinder;
    private final byte[] asInterface;
    private final checkNotClosed b;
    private final long d;

    /* synthetic */ RequestWithCallbackExternalSyntheticLambda0(long j, Integer num, ComplianceData complianceData, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo, checkNotClosed checknotclosed, byte b) {
        this(j, num, complianceData, j2, bArr, str, j3, networkConnectionInfo, checknotclosed);
    }

    private RequestWithCallbackExternalSyntheticLambda0(long j, Integer num, ComplianceData complianceData, long j2, byte[] bArr, String str, long j3, NetworkConnectionInfo networkConnectionInfo, checkNotClosed checknotclosed) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.TuitionPaymentFragmentbindingInflater1 = num;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = complianceData;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j2;
        this.asInterface = bArr;
        this.asBinder = str;
        this.d = j3;
        this.f204a = networkConnectionInfo;
        this.b = checknotclosed;
    }

    @Override // defpackage.TakePictureManager
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.TakePictureManager
    public final Integer b() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.TakePictureManager
    public final ComplianceData TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.TakePictureManager
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.TakePictureManager
    public final byte[] d() {
        return this.asInterface;
    }

    @Override // defpackage.TakePictureManager
    public final String g() {
        return this.asBinder;
    }

    @Override // defpackage.TakePictureManager
    public final long asInterface() {
        return this.d;
    }

    @Override // defpackage.TakePictureManager
    public final NetworkConnectionInfo asBinder() {
        return this.f204a;
    }

    @Override // defpackage.TakePictureManager
    public final checkNotClosed TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEvent{eventTimeMs=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", eventCode=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", complianceData=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", eventUptimeMs=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append(", sourceExtension=");
        sb.append(Arrays.toString(this.asInterface));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.asBinder);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.d);
        sb.append(", networkConnectionInfo=");
        sb.append(this.f204a);
        sb.append(", experimentIds=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TakePictureManager)) {
            return false;
        }
        TakePictureManager takePictureManager = (TakePictureManager) obj;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != takePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            return false;
        }
        Integer num = this.TuitionPaymentFragmentbindingInflater1;
        if (num == null) {
            if (takePictureManager.b() != null) {
                return false;
            }
        } else if (!num.equals(takePictureManager.b())) {
            return false;
        }
        ComplianceData complianceData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (complianceData == null) {
            if (takePictureManager.TuitionPaymentFragmentbindingInflater1() != null) {
                return false;
            }
        } else if (!complianceData.equals(takePictureManager.TuitionPaymentFragmentbindingInflater1())) {
            return false;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != takePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            return false;
        }
        if (!Arrays.equals(this.asInterface, takePictureManager instanceof RequestWithCallbackExternalSyntheticLambda0 ? ((RequestWithCallbackExternalSyntheticLambda0) takePictureManager).asInterface : takePictureManager.d())) {
            return false;
        }
        String str = this.asBinder;
        if (str == null) {
            if (takePictureManager.g() != null) {
                return false;
            }
        } else if (!str.equals(takePictureManager.g())) {
            return false;
        }
        if (this.d != takePictureManager.asInterface()) {
            return false;
        }
        NetworkConnectionInfo networkConnectionInfo = this.f204a;
        if (networkConnectionInfo == null) {
            if (takePictureManager.asBinder() != null) {
                return false;
            }
        } else if (!networkConnectionInfo.equals(takePictureManager.asBinder())) {
            return false;
        }
        checkNotClosed checknotclosed = this.b;
        if (checknotclosed == null) {
            if (takePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2() != null) {
                return false;
            }
        } else if (!checknotclosed.equals(takePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = (int) (j ^ (j >>> 32));
        Integer num = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode = num == null ? 0 : num.hashCode();
        ComplianceData complianceData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iHashCode2 = complianceData == null ? 0 : complianceData.hashCode();
        long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int iHashCode3 = Arrays.hashCode(this.asInterface);
        String str = this.asBinder;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j3 = this.d;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        NetworkConnectionInfo networkConnectionInfo = this.f204a;
        int iHashCode5 = networkConnectionInfo == null ? 0 : networkConnectionInfo.hashCode();
        checkNotClosed checknotclosed = this.b;
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ iHashCode) * 1000003) ^ iHashCode2) * 1000003) ^ i2) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ i3) * 1000003) ^ iHashCode5) * 1000003) ^ (checknotclosed != null ? checknotclosed.hashCode() : 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private ComplianceData TuitionPaymentFragmentbindingInflater1;
        private Long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private Long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private checkNotClosed TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f205a;
        private Long asBinder;
        private Integer b;
        private byte[] d;
        private NetworkConnectionInfo g;

        @Override // TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Long.valueOf(j);
            return this;
        }

        @Override // TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num) {
            this.b = num;
            return this;
        }

        @Override // TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 b(ComplianceData complianceData) {
            this.TuitionPaymentFragmentbindingInflater1 = complianceData;
            return this;
        }

        @Override // TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(String str) {
            this.f205a = str;
            return this;
        }

        @Override // TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(long j) {
            this.asBinder = Long.valueOf(j);
            return this;
        }

        @Override // TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(NetworkConnectionInfo networkConnectionInfo) {
            this.g = networkConnectionInfo;
            return this;
        }

        @Override // TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(checkNotClosed checknotclosed) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = checknotclosed;
            return this;
        }

        @Override // TakePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final TakePictureManager b() {
            String string;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                string = "";
            } else {
                string = " eventTimeMs";
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" eventUptimeMs");
                string = sb.toString();
            }
            if (this.asBinder == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" timezoneOffsetSeconds");
                string = sb2.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new RequestWithCallbackExternalSyntheticLambda0(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.longValue(), this.b, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.longValue(), this.d, this.f205a, this.asBinder.longValue(), this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (byte) 0);
        }
    }
}
