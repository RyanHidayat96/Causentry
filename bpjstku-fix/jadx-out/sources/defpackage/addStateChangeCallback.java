package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class addStateChangeCallback {
    public static final addStateChangeCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new addStateChangeCallback(new b(), 0);
    final int TuitionPaymentFragmentbindingInflater1;
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final int asInterface;
    final boolean b;
    final int d;
    final int g;

    public /* synthetic */ addStateChangeCallback(b bVar, byte b2) {
        this(bVar);
    }

    private addStateChangeCallback(b bVar) {
        this.b = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bVar.b;
        this.g = bVar.d;
        this.d = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.TuitionPaymentFragmentbindingInflater1 = bVar.TuitionPaymentFragmentbindingInflater1;
        this.asInterface = bVar.g;
    }

    public static b TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return new b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        addStateChangeCallback addstatechangecallback = (addStateChangeCallback) obj;
        return this.b == addstatechangecallback.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == addstatechangecallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.d == addstatechangecallback.d && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == addstatechangecallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && this.TuitionPaymentFragmentbindingInflater1 == addstatechangecallback.TuitionPaymentFragmentbindingInflater1 && this.asInterface == addstatechangecallback.asInterface && this.g == addstatechangecallback.g;
    }

    public final int hashCode() {
        boolean z = this.b;
        boolean z2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean z3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = this.g;
        int i2 = this.d;
        return ((((((((((((z ? 1 : 0) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + i) * 31) + ((i2 >>> 32) ^ i2)) * 31) + this.TuitionPaymentFragmentbindingInflater1) * 31) + this.asInterface;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplayConfiguration{capture=");
        sb.append(this.b);
        sb.append(", fullSessionConfigReceived=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", crashesEnabled=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", trafficControlPercentage=");
        sb.append(this.g);
        sb.append(", retentionTime=");
        sb.append(this.d);
        sb.append(", protocolVersion=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", selfMonitoring=");
        sb.append(this.asInterface);
        sb.append('}');
        return sb.toString();
    }

    public static class b {
        int TuitionPaymentFragmentbindingInflater1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean b;
        int d;
        int g;

        public b() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
            this.b = false;
            this.d = 0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
            this.TuitionPaymentFragmentbindingInflater1 = 1;
            this.g = 0;
        }

        public b(addStateChangeCallback addstatechangecallback) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = addstatechangecallback.b;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = addstatechangecallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            this.b = addstatechangecallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.d = addstatechangecallback.g;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = addstatechangecallback.d;
            this.TuitionPaymentFragmentbindingInflater1 = addstatechangecallback.TuitionPaymentFragmentbindingInflater1;
            this.g = addstatechangecallback.asInterface;
        }
    }
}
