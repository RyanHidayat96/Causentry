package defpackage;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class abortRequests extends resume {
    private final Integer TuitionPaymentFragmentbindingInflater1;
    private final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f245a;
    private final Integer asBinder;
    private final String asInterface;
    private final issueNextRequest b;
    private final byte[] d;
    private final String g;

    /* synthetic */ abortRequests(String str, Integer num, issueNextRequest issuenextrequest, long j, long j2, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2, byte b) {
        this(str, num, issuenextrequest, j, j2, map, num2, str2, bArr, bArr2);
    }

    private abortRequests(String str, Integer num, issueNextRequest issuenextrequest, long j, long j2, Map<String, String> map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.asInterface = str;
        this.TuitionPaymentFragmentbindingInflater1 = num;
        this.b = issuenextrequest;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.f245a = j2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
        this.asBinder = num2;
        this.g = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bArr;
        this.d = bArr2;
    }

    @Override // defpackage.resume
    public final String a() {
        return this.asInterface;
    }

    @Override // defpackage.resume
    public final Integer TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.resume
    public final issueNextRequest TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.b;
    }

    @Override // defpackage.resume
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.resume
    public final long g() {
        return this.f245a;
    }

    @Override // defpackage.resume
    protected final Map<String, String> b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.resume
    public final Integer asInterface() {
        return this.asBinder;
    }

    @Override // defpackage.resume
    public final String asBinder() {
        return this.g;
    }

    @Override // defpackage.resume
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.resume
    public final byte[] d() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.asInterface);
        sb.append(", code=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", encodedPayload=");
        sb.append(this.b);
        sb.append(", eventMillis=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", uptimeMillis=");
        sb.append(this.f245a);
        sb.append(", autoMetadata=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", productId=");
        sb.append(this.asBinder);
        sb.append(", pseudonymousId=");
        sb.append(this.g);
        sb.append(", experimentIdsClear=");
        sb.append(Arrays.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
        sb.append(", experimentIdsEncrypted=");
        sb.append(Arrays.toString(this.d));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof resume)) {
            return false;
        }
        resume resumeVar = (resume) obj;
        if (!this.asInterface.equals(resumeVar.a())) {
            return false;
        }
        Integer num = this.TuitionPaymentFragmentbindingInflater1;
        if (num == null) {
            if (resumeVar.TuitionPaymentFragmentbindingInflater1() != null) {
                return false;
            }
        } else if (!num.equals(resumeVar.TuitionPaymentFragmentbindingInflater1())) {
            return false;
        }
        if (!this.b.equals(resumeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) || this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != resumeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2() || this.f245a != resumeVar.g() || !this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(resumeVar.b())) {
            return false;
        }
        Integer num2 = this.asBinder;
        if (num2 == null) {
            if (resumeVar.asInterface() != null) {
                return false;
            }
        } else if (!num2.equals(resumeVar.asInterface())) {
            return false;
        }
        String str = this.g;
        if (str == null) {
            if (resumeVar.asBinder() != null) {
                return false;
            }
        } else if (!str.equals(resumeVar.asBinder())) {
            return false;
        }
        boolean z = resumeVar instanceof abortRequests;
        if (Arrays.equals(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, z ? ((abortRequests) resumeVar).TuitionPaymentFragmentspecialinlinedviewModeldefault1 : resumeVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3())) {
            return Arrays.equals(this.d, z ? ((abortRequests) resumeVar).d : resumeVar.d());
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.asInterface.hashCode();
        Integer num = this.TuitionPaymentFragmentbindingInflater1;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int iHashCode3 = this.b.hashCode();
        long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.f245a;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        int iHashCode4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        Integer num2 = this.asBinder;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        String str = this.g;
        return ((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 1000003) ^ Arrays.hashCode(this.d);
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private Long TuitionPaymentFragmentbindingInflater1;
        private Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private issueNextRequest TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f246a;
        private byte[] asBinder;
        private byte[] asInterface;
        String b;
        private Integer d;
        private Long g;

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3(Integer num) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = num;
            return this;
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 b(issueNextRequest issuenextrequest) {
            if (issuenextrequest == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = issuenextrequest;
            return this;
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(long j) {
            this.TuitionPaymentFragmentbindingInflater1 = Long.valueOf(j);
            return this;
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j) {
            this.g = Long.valueOf(j);
            return this;
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        protected final resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Map<String, String> map) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
            return this;
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        protected final Map<String, String> TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            Map<String, String> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Integer num) {
            this.d = num;
            return this;
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            this.f246a = str;
            return this;
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1(byte[] bArr) {
            this.asInterface = bArr;
            return this;
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr) {
            this.asBinder = bArr;
            return this;
        }

        @Override // resume.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final resume b() {
            String string;
            if (this.b != null) {
                string = "";
            } else {
                string = " transportName";
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" encodedPayload");
                string = sb.toString();
            }
            if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" eventMillis");
                string = sb2.toString();
            }
            if (this.g == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" uptimeMillis");
                string = sb3.toString();
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" autoMetadata");
                string = sb4.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new abortRequests(this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentbindingInflater1.longValue(), this.g.longValue(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.d, this.f246a, this.asInterface, this.asBinder, (byte) 0);
        }
    }
}
