package at.favre.lib.bytes;

import defpackage.MediaBrowserCompatMediaBrowserImplBase6;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public interface BytesTransformer {
    byte[] b(byte[] bArr, boolean z);

    public static final class BitWiseOperatorTransformer implements BytesTransformer {
        private final Mode TuitionPaymentFragmentbindingInflater1;
        private final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public enum Mode {
            AND,
            OR,
            XOR
        }

        public BitWiseOperatorTransformer(byte[] bArr, Mode mode) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (byte[]) Objects.requireNonNull(bArr, "the second byte array must not be null");
            this.TuitionPaymentFragmentbindingInflater1 = (Mode) Objects.requireNonNull(mode, "passed bitwise mode must not be null");
        }

        @Override // at.favre.lib.bytes.BytesTransformer
        public final byte[] b(byte[] bArr, boolean z) {
            if (bArr.length != this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length) {
                throw new IllegalArgumentException("all byte array must be of same length doing bit wise operation");
            }
            byte[] bArr2 = z ? bArr : new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = AnonymousClass3.b[this.TuitionPaymentFragmentbindingInflater1.ordinal()];
                if (i2 == 1) {
                    bArr2[i] = (byte) (bArr[i] & this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i]);
                } else if (i2 == 2) {
                    bArr2[i] = (byte) (bArr[i] ^ this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i]);
                } else {
                    bArr2[i] = (byte) (bArr[i] | this.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i]);
                }
            }
            return bArr2;
        }
    }

    public static final class ShiftTransformer implements BytesTransformer {
        private final Type TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public enum Type {
            LEFT_SHIFT,
            RIGHT_SHIFT
        }

        @Override // at.favre.lib.bytes.BytesTransformer
        public final byte[] b(byte[] bArr, boolean z) {
            if (!z) {
                byte[] bArr2 = Bytes.TuitionPaymentFragmentbindingInflater1(bArr).byteArray;
            }
            int[] iArr = AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            throw null;
        }
    }

    /* JADX INFO: renamed from: at.favre.lib.bytes.BytesTransformer$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ShiftTransformer.Type.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iArr;
            try {
                iArr[ShiftTransformer.Type.RIGHT_SHIFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2[ShiftTransformer.Type.LEFT_SHIFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[BitWiseOperatorTransformer.Mode.values().length];
            b = iArr2;
            try {
                iArr2[BitWiseOperatorTransformer.Mode.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[BitWiseOperatorTransformer.Mode.XOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[BitWiseOperatorTransformer.Mode.OR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements BytesTransformer {
        private final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (byte[]) Objects.requireNonNull(bArr, "the second byte array must not be null");
        }

        @Override // at.favre.lib.bytes.BytesTransformer
        public final byte[] b(byte[] bArr, boolean z) {
            return MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(bArr, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }

    public static final class b implements BytesTransformer {
        @Override // at.favre.lib.bytes.BytesTransformer
        public final byte[] b(byte[] bArr, boolean z) {
            if (!z) {
                bArr = Bytes.TuitionPaymentFragmentbindingInflater1(bArr).byteArray;
            }
            int length = bArr.length;
            Objects.requireNonNull(bArr);
            int i = 0;
            for (int i2 = length - 1; i < i2; i2--) {
                byte b = bArr[i];
                bArr[i] = bArr[i2];
                bArr[i2] = b;
                i++;
            }
            return bArr;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements BytesTransformer {
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
        }

        @Override // at.favre.lib.bytes.BytesTransformer
        public final byte[] b(byte[] bArr, boolean z) {
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bArr2, 0, i);
            return bArr2;
        }
    }

    public static final class ResizeTransformer implements BytesTransformer {
        private final Mode TuitionPaymentFragmentbindingInflater1;
        private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 23;

        public enum Mode {
            RESIZE_KEEP_FROM_ZERO_INDEX,
            RESIZE_KEEP_FROM_MAX_LENGTH
        }

        public ResizeTransformer(int i, Mode mode) {
            this.TuitionPaymentFragmentbindingInflater1 = mode;
        }

        @Override // at.favre.lib.bytes.BytesTransformer
        public final byte[] b(byte[] bArr, boolean z) {
            int length = bArr.length;
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (length == i) {
                return bArr;
            }
            if (i < 0) {
                throw new IllegalArgumentException("cannot resize to smaller than 0");
            }
            if (i == 0) {
                return new byte[0];
            }
            byte[] bArr2 = new byte[i];
            if (this.TuitionPaymentFragmentbindingInflater1 == Mode.RESIZE_KEEP_FROM_MAX_LENGTH) {
                int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (i2 > bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, Math.max(0, Math.abs(i2 - bArr.length)), Math.min(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bArr.length));
                    return bArr2;
                }
                System.arraycopy(bArr, Math.max(0, Math.abs(i2 - bArr.length)), bArr2, Math.min(0, Math.abs(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - bArr.length)), Math.min(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bArr.length));
                return bArr2;
            }
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }
    }

    public static class TuitionPaymentFragmentbindingInflater1 implements BytesTransformer {
        private final MessageDigest TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentbindingInflater1(String str) {
            try {
                this.TuitionPaymentFragmentbindingInflater1 = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException e2) {
                throw new IllegalArgumentException("could not get message digest algorithm ".concat(String.valueOf(str)), e2);
            }
        }

        @Override // at.favre.lib.bytes.BytesTransformer
        public final byte[] b(byte[] bArr, boolean z) {
            this.TuitionPaymentFragmentbindingInflater1.update(bArr);
            return this.TuitionPaymentFragmentbindingInflater1.digest();
        }
    }
}
