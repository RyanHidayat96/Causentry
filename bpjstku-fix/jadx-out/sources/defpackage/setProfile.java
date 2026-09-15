package defpackage;

/* JADX INFO: loaded from: classes4.dex */
final class setProfile implements MimeInfoBuilder {
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.MimeInfoBuilder
    public final AutoValue_AudioEncoderConfig TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return null;
    }

    public setProfile(boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
    }

    @Override // defpackage.MimeInfoBuilder
    public final boolean k_() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(k_() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
