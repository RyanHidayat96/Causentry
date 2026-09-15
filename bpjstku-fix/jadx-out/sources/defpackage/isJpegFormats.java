package defpackage;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes6.dex */
public final class isJpegFormats {
    byte[] TuitionPaymentFragmentbindingInflater1;
    Rect TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    int asInterface;
    int b;

    public isJpegFormats(byte[] bArr, int i, int i2, int i3, int i4) {
        this.TuitionPaymentFragmentbindingInflater1 = bArr;
        this.b = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2;
        this.asInterface = i4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
        if (i * i2 <= bArr.length) {
            return;
        }
        StringBuilder sb = new StringBuilder("Image data does not match the resolution. ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append(" > ");
        sb.append(bArr.length);
        throw new IllegalArgumentException(sb.toString());
    }
}
