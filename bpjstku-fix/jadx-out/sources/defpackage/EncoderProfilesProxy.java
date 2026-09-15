package defpackage;

import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
final class EncoderProfilesProxy extends EncoderProfilesProxyAudioProfileProxyAudioEncoder {
    private final short TuitionPaymentFragmentbindingInflater1;
    private final short TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    EncoderProfilesProxy(EncoderProfilesProxyAudioProfileProxyAudioEncoder encoderProfilesProxyAudioProfileProxyAudioEncoder, int i, int i2) {
        super(encoderProfilesProxyAudioProfileProxyAudioEncoder);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (short) i;
        this.TuitionPaymentFragmentbindingInflater1 = (short) i2;
    }

    @Override // defpackage.EncoderProfilesProxyAudioProfileProxyAudioEncoder
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFlashType getflashtype, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.TuitionPaymentFragmentbindingInflater1;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                getflashtype.TuitionPaymentFragmentbindingInflater1(31, 5);
                short s2 = this.TuitionPaymentFragmentbindingInflater1;
                if (s2 > 62) {
                    getflashtype.TuitionPaymentFragmentbindingInflater1(s2 - 31, 16);
                } else if (i == 0) {
                    getflashtype.TuitionPaymentFragmentbindingInflater1(Math.min((int) s2, 31), 5);
                } else {
                    getflashtype.TuitionPaymentFragmentbindingInflater1(s2 - 31, 5);
                }
            }
            getflashtype.TuitionPaymentFragmentbindingInflater1(bArr[this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("::");
        sb.append((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + this.TuitionPaymentFragmentbindingInflater1) - 1);
        sb.append(Typography.greater);
        return sb.toString();
    }
}
