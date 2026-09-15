package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_StreamSpec extends AutoValue_SurfaceSizeDefinition {
    private final long TuitionPaymentFragmentbindingInflater1;
    private final resume TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final retryRequest TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    AutoValue_StreamSpec(long j, retryRequest retryrequest, resume resumeVar) {
        this.TuitionPaymentFragmentbindingInflater1 = j;
        if (retryrequest == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = retryrequest;
        if (resumeVar == null) {
            throw new NullPointerException("Null event");
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = resumeVar;
    }

    @Override // defpackage.AutoValue_SurfaceSizeDefinition
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.AutoValue_SurfaceSizeDefinition
    public final retryRequest TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.AutoValue_SurfaceSizeDefinition
    public final resume b() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedEvent{id=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", transportContext=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", event=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_SurfaceSizeDefinition)) {
            return false;
        }
        AutoValue_SurfaceSizeDefinition autoValue_SurfaceSizeDefinition = (AutoValue_SurfaceSizeDefinition) obj;
        return this.TuitionPaymentFragmentbindingInflater1 == autoValue_SurfaceSizeDefinition.TuitionPaymentFragmentspecialinlinedviewModeldefault1() && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(autoValue_SurfaceSizeDefinition.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(autoValue_SurfaceSizeDefinition.b());
    }

    public final int hashCode() {
        long j = this.TuitionPaymentFragmentbindingInflater1;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode()) * 1000003) ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
    }
}
