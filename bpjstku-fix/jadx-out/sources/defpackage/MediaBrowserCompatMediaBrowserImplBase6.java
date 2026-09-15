package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes5.dex */
public final class MediaBrowserCompatMediaBrowserImplBase6 {

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        public static byte[] b(byte[]... bArr) {
            int length = 0;
            for (byte[] bArr2 : bArr) {
                length += bArr2.length;
            }
            byte[] bArr3 = new byte[length];
            int length2 = 0;
            for (byte[] bArr4 : bArr) {
                System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                length2 += bArr4.length;
            }
            return bArr3;
        }

        public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr, byte[] bArr2) {
            if (bArr2 != null && bArr.length == bArr2.length) {
                int i = 0;
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    i |= bArr[i2] ^ bArr2[i2];
                }
                if (i == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 {
        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, String str) {
            if (i3 <= i) {
                return;
            }
            StringBuilder sb = new StringBuilder("cannot get ");
            sb.append(str);
            sb.append(" from index out of bounds: 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }

        public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, String str) {
            if (i == i2) {
                return;
            }
            StringBuilder sb = new StringBuilder("cannot convert to ");
            sb.append(str);
            sb.append(" if length != ");
            sb.append(i2);
            sb.append(" bytes (was ");
            sb.append(i);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Iterator<Byte> {
        private final byte[] TuitionPaymentFragmentbindingInflater1;
        private int b = 0;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
            this.TuitionPaymentFragmentbindingInflater1 = bArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.b != this.TuitionPaymentFragmentbindingInflater1.length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            try {
                int i = this.b;
                byte b = this.TuitionPaymentFragmentbindingInflater1[i];
                this.b = i + 1;
                return Byte.valueOf(b);
            } catch (IndexOutOfBoundsException unused) {
                throw new NoSuchElementException();
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("The Bytes iterator does not support removing");
        }
    }
}
