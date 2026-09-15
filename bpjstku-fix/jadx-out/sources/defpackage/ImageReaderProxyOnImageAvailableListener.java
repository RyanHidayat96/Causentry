package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class ImageReaderProxyOnImageAvailableListener {
    public final int TuitionPaymentFragmentbindingInflater1;
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final CharSequence TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ImageReaderProxyOnImageAvailableListener(CharSequence charSequence, int i, int i2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = charSequence;
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2;
        byte[] bArr = new byte[i * i2];
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.TuitionPaymentFragmentbindingInflater1;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[(i * this.TuitionPaymentFragmentbindingInflater1) + i2] = (byte) ((this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.charAt(i3) & (1 << (8 - i4))) == 0 ? 0 : 1);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4, i5, i3, 1);
        int i6 = i2 - 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4, i6, i3, 2);
        int i7 = i - 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7, i5, i3, 3);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7, i6, i3, 4);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7, i2, i3, 5);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i5, i3, 6);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i6, i3, 7);
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i2, i3, 8);
    }
}
