package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes4.dex */
final class EncoderProfilesProxyVideoProfileProxy extends EncoderProfilesProxyAudioProfileProxyAudioEncoder {
    private final short TuitionPaymentFragmentbindingInflater1;
    private final short TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    EncoderProfilesProxyVideoProfileProxy(EncoderProfilesProxyAudioProfileProxyAudioEncoder encoderProfilesProxyAudioProfileProxyAudioEncoder, int i, int i2) {
        super(encoderProfilesProxyAudioProfileProxyAudioEncoder);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (short) i;
        this.TuitionPaymentFragmentbindingInflater1 = (short) i2;
    }

    @Override // defpackage.EncoderProfilesProxyAudioProfileProxyAudioEncoder
    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFlashType getflashtype, byte[] bArr) {
        getflashtype.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentbindingInflater1);
    }

    public final String toString() {
        short s = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        short s2 = this.TuitionPaymentFragmentbindingInflater1;
        StringBuilder sb = new StringBuilder("<");
        int i = 1 << s2;
        sb.append(Integer.toBinaryString((s & (i - 1)) | i | (1 << this.TuitionPaymentFragmentbindingInflater1)).substring(1));
        sb.append(Typography.greater);
        return sb.toString();
    }
}
