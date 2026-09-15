package defpackage;

import com.google.zxing.FormatException;

/* JADX INFO: loaded from: classes6.dex */
final class getRepeatingCameraCaptureCallbacks {
    boolean TuitionPaymentFragmentbindingInflater1;
    final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    addAllDeviceStateCallbacks TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    SessionConfigBuilder b;

    getRepeatingCameraCaptureCallbacks(getBufferFormat getbufferformat) throws FormatException {
        int i = getbufferformat.b;
        if (i < 21 || (i & 3) != 1) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getbufferformat;
    }

    final addAllDeviceStateCallbacks TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws FormatException {
        addAllDeviceStateCallbacks addalldevicestatecallbacks = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (addalldevicestatecallbacks != null) {
            return addalldevicestatecallbacks;
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = 0;
        for (int i = 0; i < 6; i++) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, 8, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(8, 7, TuitionPaymentFragmentspecialinlinedviewModeldefault3(8, 8, TuitionPaymentFragmentspecialinlinedviewModeldefault3(7, 8, iTuitionPaymentFragmentspecialinlinedviewModeldefault4)));
        for (int i2 = 5; i2 >= 0; i2--) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(8, i2, iTuitionPaymentFragmentspecialinlinedviewModeldefault5);
        }
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
        for (int i4 = i3 - 1; i4 >= i3 - 7; i4--) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(8, i4, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        for (int i5 = i3 - 8; i5 < i3; i5++) {
            iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5, 8, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        addAllDeviceStateCallbacks addalldevicestatecallbacksB = addAllDeviceStateCallbacks.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault5, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = addalldevicestatecallbacksB;
        if (addalldevicestatecallbacksB != null) {
            return addalldevicestatecallbacksB;
        }
        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    final SessionConfigBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws FormatException {
        SessionConfigBuilder sessionConfigBuilder = this.b;
        if (sessionConfigBuilder != null) {
            return sessionConfigBuilder;
        }
        int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
        int i2 = (i - 17) / 4;
        if (i2 <= 6) {
            return SessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i2);
        }
        int i3 = i - 11;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = 0;
        for (int i4 = 5; i4 >= 0; i4--) {
            for (int i5 = i - 9; i5 >= i3; i5--) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5, i4, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
            }
        }
        SessionConfigBuilder sessionConfigBuilderB = SessionConfigBuilder.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        if (sessionConfigBuilderB != null && (sessionConfigBuilderB.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * 4) + 17 == i) {
            this.b = sessionConfigBuilderB;
            return sessionConfigBuilderB;
        }
        for (int i6 = 5; i6 >= 0; i6--) {
            for (int i7 = i - 9; i7 >= i3; i7--) {
                iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6, i7, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        }
        SessionConfigBuilder sessionConfigBuilderB2 = SessionConfigBuilder.b(iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (sessionConfigBuilderB2 != null && (sessionConfigBuilderB2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * 4) + 17 == i) {
            this.b = sessionConfigBuilderB2;
            return sessionConfigBuilderB2;
        }
        throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3) {
        return this.TuitionPaymentFragmentbindingInflater1 ? this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, i) : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 0;
        while (i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b; i3++) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i3) != this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3, i)) {
                    getBufferFormat getbufferformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i4 = (getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i) + (i3 / 32);
                    int[] iArr = getbufferformat.TuitionPaymentFragmentbindingInflater1;
                    iArr[i4] = (1 << (i3 & 31)) ^ iArr[i4];
                    getBufferFormat getbufferformat2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i5 = (getbufferformat2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * i3) + (i / 32);
                    int[] iArr2 = getbufferformat2.TuitionPaymentFragmentbindingInflater1;
                    iArr2[i5] = (1 << (i & 31)) ^ iArr2[i5];
                }
            }
            i = i2;
        }
    }
}
