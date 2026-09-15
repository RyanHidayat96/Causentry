package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSpec {
    private boolean TuitionPaymentFragmentbindingInflater1;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final boolean b;

    public MediaSpec(String str, boolean z, boolean z2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.b = z;
        this.TuitionPaymentFragmentbindingInflater1 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaSpec mediaSpec = (MediaSpec) obj;
        if (this.b == mediaSpec.b && this.TuitionPaymentFragmentbindingInflater1 == mediaSpec.TuitionPaymentFragmentbindingInflater1) {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(mediaSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.TuitionPaymentFragmentbindingInflater1 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Permission{name='");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append("', granted=");
        sb.append(this.b);
        sb.append(", shouldShowRequestPermissionRationale=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append('}');
        return sb.toString();
    }
}
