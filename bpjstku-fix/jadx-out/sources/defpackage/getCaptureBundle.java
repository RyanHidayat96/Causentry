package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class getCaptureBundle {
    public Object TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final List<byte[]> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final int asBinder;
    public final int asInterface;
    public final byte[] b;
    public final String d;

    public getCaptureBundle(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public getCaptureBundle(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.b = bArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bArr == null ? 0 : bArr.length * 8;
        this.d = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
        this.asInterface = i2;
        this.asBinder = i;
    }
}
