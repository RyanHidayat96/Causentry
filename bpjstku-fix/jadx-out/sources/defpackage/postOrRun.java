package defpackage;

import at.favre.lib.bytes.Bytes;
import at.favre.lib.bytes.BytesTransformer;
import at.favre.lib.bytes.BytesValidator;
import at.favre.lib.bytes.MutableBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class postOrRun {
    private static final Charset TuitionPaymentFragmentspecialinlinedviewModeldefault2 = StandardCharsets.UTF_8;

    public static TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater1, new SecureRandom(), new fromMediaItem.TuitionPaymentFragmentbindingInflater1(((TuitionPaymentFragmentbindingInflater1) Objects.requireNonNull(tuitionPaymentFragmentbindingInflater1)).TuitionPaymentFragmentbindingInflater1), (byte) 0);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private final Charset TuitionPaymentFragmentbindingInflater1;
        private final fromMediaItem TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final SecureRandom TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, SecureRandom secureRandom, fromMediaItem frommediaitem, byte b) {
            this(tuitionPaymentFragmentbindingInflater1, secureRandom, frommediaitem);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, SecureRandom secureRandom, fromMediaItem frommediaitem) {
            this.TuitionPaymentFragmentbindingInflater1 = postOrRun.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentbindingInflater1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = secureRandom;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = frommediaitem;
        }

        public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, byte[] bArr, byte[] bArr2) {
            Bytes bytesB;
            MutableBytes mutableBytes;
            if (i > 31 || i < 4) {
                throw new IllegalArgumentException("cost factor must be between 4 and 31, was ".concat(String.valueOf(i)));
            }
            if (bArr == null) {
                throw new IllegalArgumentException("salt must not be null");
            }
            if (bArr.length != 16) {
                StringBuilder sb = new StringBuilder("salt must be exactly 16 bytes, was ");
                sb.append(bArr.length);
                throw new IllegalArgumentException(sb.toString());
            }
            if (bArr2 == null) {
                throw new IllegalArgumentException("provided password must not be null");
            }
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && bArr2.length == 0) {
                throw new IllegalArgumentException("provided password must at least be length 1 if no null terminator is appended");
            }
            if (bArr2.length > this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 + (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ? 1 : 0)) {
                bArr2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(bArr2);
            }
            boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Bytes bytesB2 = Bytes.b(bArr2);
            if (z) {
                bytesB = bytesB2.factory.b(new BytesTransformer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bytes.b((byte) 0).byteArray).b(bytesB2.byteArray, bytesB2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesB2.byteOrder);
            } else {
                bytesB = bytesB2.factory.b(new BytesTransformer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(0, bytesB2.byteArray.length).b(bytesB2.byteArray, bytesB2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesB2.byteOrder);
            }
            byte[] bArr3 = bytesB.byteArray;
            try {
                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2().TuitionPaymentFragmentspecialinlinedviewModeldefault1(1 << i, bArr, bArr3);
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (tuitionPaymentFragmentbindingInflater1.b) {
                    Bytes bytesB3 = Bytes.b(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bytesB3.factory.b(new BytesTransformer.ResizeTransformer(23, BytesTransformer.ResizeTransformer.Mode.RESIZE_KEEP_FROM_ZERO_INDEX).b(bytesB3.byteArray, bytesB3.TuitionPaymentFragmentspecialinlinedviewModeldefault1()), bytesB3.byteOrder).byteArray;
                }
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, tuitionPaymentFragmentbindingInflater1, bArr, bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            } finally {
                Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = Bytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr3);
                if (bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 instanceof MutableBytes) {
                    mutableBytes = (MutableBytes) bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    mutableBytes = new MutableBytes(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteOrder);
                }
                mutableBytes.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private byte[] TuitionPaymentFragmentbindingInflater1;
        private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private int b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, byte[] bArr, byte[] bArr2) {
            Objects.requireNonNull(bArr2);
            Objects.requireNonNull(bArr);
            Objects.requireNonNull(tuitionPaymentFragmentbindingInflater1);
            if (new BytesValidator.Logical(Arrays.asList(new BytesValidator.Length(16, BytesValidator.Length.Mode.EXACT)), BytesValidator.Logical.Operator.AND).TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bytes.b(bArr).byteArray)) {
                if (new BytesValidator.Logical(Arrays.asList(new BytesValidator.Logical(Arrays.asList(new BytesValidator.Length(23, BytesValidator.Length.Mode.EXACT), new BytesValidator.Length(24, BytesValidator.Length.Mode.EXACT)), BytesValidator.Logical.Operator.OR)), BytesValidator.Logical.Operator.AND).TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bytes.b(bArr2).byteArray)) {
                    this.b = i;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1;
                    this.TuitionPaymentFragmentbindingInflater1 = bArr;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bArr2;
                    return;
                }
            }
            throw new IllegalArgumentException("salt must be exactly 16 bytes and hash 23 bytes long");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj;
            if (this.b != tuitionPaymentFragmentspecialinlinedviewModeldefault3.b || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return false;
            }
            Bytes bytesB = Bytes.b(this.TuitionPaymentFragmentbindingInflater1);
            byte[] bArr = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
            if (bArr == null || !MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytesB.byteArray, bArr)) {
                return false;
            }
            Bytes bytesB2 = Bytes.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            byte[] bArr2 = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            return bArr2 != null && MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bytesB2.byteArray, bArr2);
        }

        public final int hashCode() {
            int i = this.b;
            return (((Objects.hash(Integer.valueOf(i), this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) * 31) + Arrays.hashCode(this.TuitionPaymentFragmentbindingInflater1)) * 31) + Arrays.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HashData{cost=");
            sb.append(this.b);
            sb.append(", version=");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            sb.append(", rawSalt=");
            Bytes bytesB = Bytes.b(this.TuitionPaymentFragmentbindingInflater1);
            sb.append(new MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false).b(bytesB.byteArray, bytesB.byteOrder));
            sb.append(", rawHash=");
            Bytes bytesB2 = Bytes.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append(new MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false).b(bytesB2.byteArray, bytesB2.byteOrder));
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 {
        public static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final int TuitionPaymentFragmentbindingInflater1;
        private onServiceDisconnected TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private byte[] asBinder;
        private MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1 asInterface;
        public final boolean b;

        static {
            onServiceDisconnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new onServiceDisconnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new MediaBrowserCompatMediaItem.TuitionPaymentFragmentbindingInflater1(), postOrRun.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new MediaBrowserCompatMediaItem.TuitionPaymentFragmentbindingInflater1(), postOrRun.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1(new byte[]{50, 97}, tuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentbindingInflater1;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new TuitionPaymentFragmentbindingInflater1(new byte[]{50, 98}, tuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater3 = new TuitionPaymentFragmentbindingInflater1(new byte[]{50, 120}, tuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater4 = new TuitionPaymentFragmentbindingInflater1(new byte[]{50, 121}, tuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            new TuitionPaymentFragmentbindingInflater1(new byte[]{50, 121}, true, false, 72, tuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            new TuitionPaymentFragmentbindingInflater1(new byte[]{50, 99}, false, false, 71, tuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Collections.unmodifiableList(Arrays.asList(tuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater2, tuitionPaymentFragmentbindingInflater3, tuitionPaymentFragmentbindingInflater4));
        }

        private TuitionPaymentFragmentbindingInflater1(byte[] bArr, onServiceDisconnected onservicedisconnected, MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1 mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1) {
            this(bArr, true, true, 71, onservicedisconnected, mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1);
        }

        private TuitionPaymentFragmentbindingInflater1(byte[] bArr, boolean z, boolean z2, int i, onServiceDisconnected onservicedisconnected, MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1 mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1) {
            this.asBinder = bArr;
            this.b = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z2;
            this.TuitionPaymentFragmentbindingInflater1 = i;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = onservicedisconnected;
            this.asInterface = mediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1;
            if (i > 72) {
                throw new IllegalArgumentException("allowed max pw length cannot be gt 72");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1) obj;
            return this.b == tuitionPaymentFragmentbindingInflater1.b && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.TuitionPaymentFragmentbindingInflater1 == tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1 && Arrays.equals(this.asBinder, tuitionPaymentFragmentbindingInflater1.asBinder);
        }

        public final int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), Integer.valueOf(this.TuitionPaymentFragmentbindingInflater1)) * 31) + Arrays.hashCode(this.asBinder);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("$");
            sb.append(new String(this.asBinder));
            sb.append("$");
            return sb.toString();
        }
    }
}
