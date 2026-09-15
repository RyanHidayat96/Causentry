package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface fromMediaItem {
    byte[] b(byte[] bArr);

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements fromMediaItem {
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        abstract byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr);

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, byte b) {
            this(i);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        }

        @Override // defpackage.fromMediaItem
        public final byte[] b(byte[] bArr) {
            return bArr.length >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr) : bArr;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        TuitionPaymentFragmentbindingInflater1(int i) {
            super(i, (byte) 0);
        }

        @Override // fromMediaItem.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr) {
            StringBuilder sb = new StringBuilder("password must not be longer than ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(" bytes plus null terminator encoded in utf-8, was ");
            sb.append(bArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
