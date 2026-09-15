package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class setSurfaceGroupId extends setExpectedFrameRateRange {
    private final int TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f1393a;
    private final int b;

    /* synthetic */ setSurfaceGroupId(long j, int i, int i2, long j2, int i3, byte b) {
        this(j, i, i2, j2, i3);
    }

    private setSurfaceGroupId(long j, int i, int i2, long j2, int i3) {
        this.f1393a = j;
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.b = i2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
    }

    @Override // defpackage.setExpectedFrameRateRange
    final long b() {
        return this.f1393a;
    }

    @Override // defpackage.setExpectedFrameRateRange
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.setExpectedFrameRateRange
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.b;
    }

    @Override // defpackage.setExpectedFrameRateRange
    final long TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.setExpectedFrameRateRange
    final int TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f1393a);
        sb.append(", loadBatchSize=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.b);
        sb.append(", eventCleanUpAge=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setExpectedFrameRateRange)) {
            return false;
        }
        setExpectedFrameRateRange setexpectedframeraterange = (setExpectedFrameRateRange) obj;
        return this.f1393a == setexpectedframeraterange.b() && this.TuitionPaymentFragmentbindingInflater1 == setexpectedframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && this.b == setexpectedframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == setexpectedframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3() && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == setexpectedframeraterange.TuitionPaymentFragmentbindingInflater1();
    }

    public final int hashCode() {
        long j = this.f1393a;
        int i = this.TuitionPaymentFragmentbindingInflater1;
        int i2 = this.b;
        long j2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1 {
        private Long TuitionPaymentFragmentbindingInflater1;
        private Integer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private Integer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private Integer TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Long b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1
        final setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1 a() {
            this.TuitionPaymentFragmentbindingInflater1 = 10485760L;
            return this;
        }

        @Override // setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1
        final setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 200;
            return this;
        }

        @Override // setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1
        final setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 10000;
            return this;
        }

        @Override // setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1
        final setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1() {
            this.b = 604800000L;
            return this;
        }

        @Override // setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1
        final setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1 b() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 81920;
            return this;
        }

        @Override // setExpectedFrameRateRange.TuitionPaymentFragmentbindingInflater1
        final setExpectedFrameRateRange TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            String string;
            if (this.TuitionPaymentFragmentbindingInflater1 != null) {
                string = "";
            } else {
                string = " maxStorageSizeInBytes";
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(" loadBatchSize");
                string = sb.toString();
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" criticalSectionEnterTimeoutMs");
                string = sb2.toString();
            }
            if (this.b == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append(" eventCleanUpAge");
                string = sb3.toString();
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string);
                sb4.append(" maxBlobByteSizePerRow");
                string = sb4.toString();
            }
            if (!string.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(String.valueOf(string)));
            }
            return new setSurfaceGroupId(this.TuitionPaymentFragmentbindingInflater1.longValue(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.intValue(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.intValue(), this.b.longValue(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.intValue(), (byte) 0);
        }
    }
}
