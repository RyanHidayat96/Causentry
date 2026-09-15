package defpackage;

import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.BytesTransformer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public interface MediaBrowserCompatMediaBrowserImplBase1 {

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        String b(byte[] bArr, ByteOrder byteOrder);
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        byte[] TuitionPaymentFragmentbindingInflater1(CharSequence charSequence);
    }

    public static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements MediaBrowserCompatMediaBrowserImplBase4 {
        private final boolean b;
        private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        private static final char[] TuitionPaymentFragmentbindingInflater1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this(true);
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z) {
            this.b = z;
        }

        @Override // MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final String b(byte[] bArr, ByteOrder byteOrder) {
            char[] cArr = new char[bArr.length * 2];
            char[] cArr2 = this.b ? TuitionPaymentFragmentbindingInflater1 : TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i << 1;
                byte b = bArr[byteOrder == ByteOrder.BIG_ENDIAN ? i : (bArr.length - i) - 1];
                cArr[i2] = cArr2[(b >> 4) & 15];
                cArr[i2 + 1] = cArr2[b & 15];
            }
            return new String(cArr);
        }

        @Override // MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final byte[] TuitionPaymentFragmentbindingInflater1(CharSequence charSequence) {
            int i = (((CharSequence) Objects.requireNonNull(charSequence)).length() > 2 && charSequence.charAt(0) == '0' && charSequence.charAt(1) == 'x') ? 2 : 0;
            int length = charSequence.length();
            boolean z = length % 2 != 0;
            if (z) {
                i--;
            }
            byte[] bArr = new byte[(length - i) / 2];
            int i2 = i;
            while (i2 < length) {
                int iDigit = (i2 == i && z) ? 0 : Character.digit(charSequence.charAt(i2), 16);
                int i3 = i2 + 1;
                int iDigit2 = Character.digit(charSequence.charAt(i3), 16);
                if (iDigit == -1 || iDigit2 == -1) {
                    if (i2 != i || !z) {
                        StringBuilder sb = new StringBuilder("'");
                        sb.append(charSequence.charAt(i2));
                        sb.append(charSequence.charAt(i3));
                        sb.append("' at index ");
                        sb.append(i2);
                        sb.append(" is not hex formatted");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder("'");
                    sb2.append(charSequence.charAt(i3));
                    sb2.append("' at index ");
                    sb2.append(i3);
                    sb2.append(" is not hex formatted");
                    throw new IllegalArgumentException(sb2.toString());
                }
                bArr[(i2 - i) / 2] = (byte) ((iDigit << 4) + iDigit2);
                i2 += 2;
            }
            return bArr;
        }
    }

    public static class TuitionPaymentFragmentbindingInflater1 implements MediaBrowserCompatMediaBrowserImplBase4 {
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final boolean b;

        public TuitionPaymentFragmentbindingInflater1() {
            this(false, true);
        }

        public TuitionPaymentFragmentbindingInflater1(boolean z, boolean z2) {
            this.b = false;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        }

        @Override // MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final String b(byte[] bArr, ByteOrder byteOrder) {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1(bArr);
                bArr = bytesTuitionPaymentFragmentbindingInflater1.factory.b(new BytesTransformer.b().b(bytesTuitionPaymentFragmentbindingInflater1.byteArray, bytesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesTuitionPaymentFragmentbindingInflater1.byteOrder).byteArray;
            }
            return new String(MediaBrowserCompatMediaBrowserImplBase2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bArr, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1), StandardCharsets.US_ASCII);
        }

        @Override // MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentspecialinlinedviewModeldefault3
        public final byte[] TuitionPaymentFragmentbindingInflater1(CharSequence charSequence) {
            return MediaBrowserCompatMediaBrowserImplBase2.b(charSequence);
        }
    }
}
