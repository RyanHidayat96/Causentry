package defpackage;

import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.BytesTransformer;
import at.favre.lib.bytes.MutableBytes;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public interface MediaBrowserCompatItemReceiver {
    byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    void b();

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements MediaBrowserCompatItemReceiver {
        private final byte[][] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final SecureRandom TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(byte[] bArr, SecureRandom secureRandom) {
            Objects.requireNonNull(bArr);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (SecureRandom) Objects.requireNonNull(secureRandom);
            Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteArray.length, 8, "long");
            MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteArray.length, 0, 8, "long");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new byte[((int) (Math.abs(((ByteBuffer) ByteBuffer.wrap(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteArray).order(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteOrder).position(0)).getLong()) % 9)) + 2][];
            b(secureRandom, Bytes.TuitionPaymentFragmentbindingInflater1(bArr), bArr.length);
        }

        @Override // defpackage.MediaBrowserCompatItemReceiver
        public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            byte[] bArr;
            synchronized (this) {
                Bytes bytesTuitionPaymentFragmentbindingInflater1 = Bytes.TuitionPaymentFragmentbindingInflater1();
                for (int length = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length - 1; length >= 0; length--) {
                    if (bytesTuitionPaymentFragmentbindingInflater1.byteArray.length == 0) {
                        Bytes bytesTuitionPaymentFragmentbindingInflater2 = Bytes.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[length]);
                        if (bytesTuitionPaymentFragmentbindingInflater2 instanceof MutableBytes) {
                            bytesTuitionPaymentFragmentbindingInflater1 = (MutableBytes) bytesTuitionPaymentFragmentbindingInflater2;
                        } else {
                            bytesTuitionPaymentFragmentbindingInflater1 = new MutableBytes(bytesTuitionPaymentFragmentbindingInflater2.byteArray, bytesTuitionPaymentFragmentbindingInflater2.byteOrder);
                        }
                    } else {
                        bytesTuitionPaymentFragmentbindingInflater1.factory.b(new BytesTransformer.BitWiseOperatorTransformer(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[length], BytesTransformer.BitWiseOperatorTransformer.Mode.XOR).b(bytesTuitionPaymentFragmentbindingInflater1.byteArray, bytesTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesTuitionPaymentFragmentbindingInflater1.byteOrder);
                    }
                }
                b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bytesTuitionPaymentFragmentbindingInflater1), bytesTuitionPaymentFragmentbindingInflater1.byteArray.length);
                bArr = bytesTuitionPaymentFragmentbindingInflater1.byteArray;
            }
            return bArr;
        }

        @Override // defpackage.MediaBrowserCompatItemReceiver
        public final void b() {
            MutableBytes mutableBytes;
            for (byte[] bArr : this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                Bytes bytesB = Bytes.b(bArr);
                if (bytesB instanceof MutableBytes) {
                    mutableBytes = (MutableBytes) bytesB;
                } else {
                    mutableBytes = new MutableBytes(bytesB.byteArray, bytesB.byteOrder);
                }
                SecureRandom secureRandom = new SecureRandom();
                if (mutableBytes.byteArray.length > 0) {
                    secureRandom.nextBytes(mutableBytes.byteArray);
                }
            }
        }

        protected final void finalize() throws Throwable {
            b();
            super.finalize();
        }

        private void b(SecureRandom secureRandom, Bytes bytes, int i) {
            MutableBytes mutableBytes;
            if (bytes instanceof MutableBytes) {
                mutableBytes = (MutableBytes) bytes;
            } else {
                mutableBytes = new MutableBytes(bytes.byteArray, bytes.byteOrder);
            }
            int i2 = 0;
            while (true) {
                byte[][] bArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (i2 >= bArr.length - 1) {
                    bArr[bArr.length - 1] = mutableBytes.byteArray;
                    return;
                }
                byte[] bArr2 = Bytes.b(i, secureRandom).byteArray;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i2] = bArr2;
                mutableBytes.factory.b(new BytesTransformer.BitWiseOperatorTransformer(bArr2, BytesTransformer.BitWiseOperatorTransformer.Mode.XOR).b(mutableBytes.byteArray, mutableBytes.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), mutableBytes.byteOrder);
                i2++;
            }
        }
    }
}
