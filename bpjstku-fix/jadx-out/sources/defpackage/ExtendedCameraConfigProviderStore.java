package defpackage;

/* JADX INFO: loaded from: classes4.dex */
final class ExtendedCameraConfigProviderStore {
    static final ExtendedCameraConfigProviderStore TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ExtendedCameraConfigProviderStore(EncoderProfilesProxyAudioProfileProxyAudioEncoder.TuitionPaymentFragmentspecialinlinedviewModeldefault1, 0, 0, 0);
    final EncoderProfilesProxyAudioProfileProxyAudioEncoder TuitionPaymentFragmentbindingInflater1;
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final int b;

    private ExtendedCameraConfigProviderStore(EncoderProfilesProxyAudioProfileProxyAudioEncoder encoderProfilesProxyAudioProfileProxyAudioEncoder, int i, int i2, int i3) {
        this.TuitionPaymentFragmentbindingInflater1 = encoderProfilesProxyAudioProfileProxyAudioEncoder;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.b = i2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
    }

    final ExtendedCameraConfigProviderStore TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) {
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        EncoderProfilesProxyAudioProfileProxyAudioEncoder encoderProfilesProxyVideoProfileProxy = this.TuitionPaymentFragmentbindingInflater1;
        if (i != this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            int i4 = getAudioCodecMimeType.b[this.TuitionPaymentFragmentspecialinlinedviewModeldefault3][i];
            int i5 = i4 >> 16;
            i3 += i5;
            encoderProfilesProxyVideoProfileProxy = new EncoderProfilesProxyVideoProfileProxy(encoderProfilesProxyVideoProfileProxy, i4 & 65535, i5);
        }
        int i6 = i == 2 ? 4 : 5;
        return new ExtendedCameraConfigProviderStore(new EncoderProfilesProxyVideoProfileProxy(encoderProfilesProxyVideoProfileProxy, i2, i6), i, 0, i3 + i6);
    }

    final ExtendedCameraConfigProviderStore b(int i, int i2) {
        EncoderProfilesProxyAudioProfileProxyAudioEncoder encoderProfilesProxyAudioProfileProxyAudioEncoder = this.TuitionPaymentFragmentbindingInflater1;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == 2 ? 4 : 5;
        return new ExtendedCameraConfigProviderStore(new EncoderProfilesProxyVideoProfileProxy(new EncoderProfilesProxyVideoProfileProxy(encoderProfilesProxyAudioProfileProxyAudioEncoder, getAudioCodecMimeType.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.TuitionPaymentFragmentspecialinlinedviewModeldefault3][i], i3), i2, 5), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + i3 + 5);
    }

    final ExtendedCameraConfigProviderStore TuitionPaymentFragmentbindingInflater1(int i) {
        int i2;
        EncoderProfilesProxyAudioProfileProxyAudioEncoder encoderProfilesProxyAudioProfileProxyAudioEncoder = this.TuitionPaymentFragmentbindingInflater1;
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (i3 == 4 || i3 == 2) {
            int i5 = getAudioCodecMimeType.b[i3][0];
            int i6 = i5 >> 16;
            EncoderProfilesProxyVideoProfileProxy encoderProfilesProxyVideoProfileProxy = new EncoderProfilesProxyVideoProfileProxy(encoderProfilesProxyAudioProfileProxyAudioEncoder, i5 & 65535, i6);
            i4 += i6;
            i3 = 0;
            encoderProfilesProxyAudioProfileProxyAudioEncoder = encoderProfilesProxyVideoProfileProxy;
        }
        int i7 = this.b;
        if (i7 == 0 || i7 == 31) {
            i2 = 18;
        } else {
            i2 = i7 == 62 ? 9 : 8;
        }
        ExtendedCameraConfigProviderStore extendedCameraConfigProviderStore = new ExtendedCameraConfigProviderStore(encoderProfilesProxyAudioProfileProxyAudioEncoder, i3, i7 + 1, i4 + i2);
        return extendedCameraConfigProviderStore.b == 2078 ? extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i + 1) : extendedCameraConfigProviderStore;
    }

    final ExtendedCameraConfigProviderStore TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        int i2 = this.b;
        return i2 == 0 ? this : new ExtendedCameraConfigProviderStore(new EncoderProfilesProxy(this.TuitionPaymentFragmentbindingInflater1, i - i2, i2), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    final boolean b(ExtendedCameraConfigProviderStore extendedCameraConfigProviderStore) {
        int i;
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (getAudioCodecMimeType.b[this.TuitionPaymentFragmentspecialinlinedviewModeldefault3][extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault3] >> 16);
        int i3 = extendedCameraConfigProviderStore.b;
        if (i3 > 0 && ((i = this.b) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= extendedCameraConfigProviderStore.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", getAudioCodecMimeType.TuitionPaymentFragmentspecialinlinedviewModeldefault2[this.TuitionPaymentFragmentspecialinlinedviewModeldefault3], Integer.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2), Integer.valueOf(this.b));
    }
}
