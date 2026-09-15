package at.favre.lib.bytes;

import defpackage.MediaBrowserCompatMediaBrowserImplBase1;
import defpackage.MediaBrowserCompatMediaBrowserImplBase6;
import defpackage.forceCloseConnection;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
public class Bytes implements Comparable<Bytes>, Serializable, Iterable<Byte> {
    private static final Bytes TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Bytes(new byte[0], ByteOrder.BIG_ENDIAN);
    static final long serialVersionUID = 1;
    private transient int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final byte[] byteArray;
    public final ByteOrder byteOrder;
    public final forceCloseConnection factory;

    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return false;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Bytes bytes) {
        Bytes bytes2 = bytes;
        return ByteBuffer.wrap(this.byteArray).order(this.byteOrder).compareTo(ByteBuffer.wrap(bytes2.byteArray).order(bytes2.byteOrder));
    }

    public static Bytes TuitionPaymentFragmentbindingInflater1() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static Bytes b(byte[] bArr) {
        return new Bytes((byte[]) Objects.requireNonNull(bArr, "passed array must not be null"), ByteOrder.BIG_ENDIAN);
    }

    public static Bytes TuitionPaymentFragmentbindingInflater1(byte[] bArr) {
        byte[] bArrCopyOf = Arrays.copyOf((byte[]) Objects.requireNonNull(bArr, "must at least pass a single byte"), bArr.length);
        return new Bytes((byte[]) Objects.requireNonNull(bArrCopyOf, "passed array must not be null"), ByteOrder.BIG_ENDIAN);
    }

    public static Bytes b(byte[]... bArr) {
        byte[] bArrB = MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(bArr);
        return new Bytes((byte[]) Objects.requireNonNull(bArrB, "passed array must not be null"), ByteOrder.BIG_ENDIAN);
    }

    public static Bytes TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bytes... bytesArr) {
        Objects.requireNonNull(bytesArr, "bytes most not be null");
        byte[][] bArr = new byte[bytesArr.length][];
        for (int i = 0; i < bytesArr.length; i++) {
            bArr[0] = bytesArr[0].byteArray;
        }
        return new Bytes((byte[]) Objects.requireNonNull(MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(bArr), "passed array must not be null"), ByteOrder.BIG_ENDIAN);
    }

    public static Bytes b(byte b2) {
        return new Bytes(new byte[]{b2}, ByteOrder.BIG_ENDIAN);
    }

    public static Bytes b(int i) {
        byte[] bArrArray = ByteBuffer.allocate(4).putInt(i).array();
        return new Bytes((byte[]) Objects.requireNonNull(bArrArray, "passed array must not be null"), ByteOrder.BIG_ENDIAN);
    }

    public static Bytes TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j) {
        byte[] bArrArray = ByteBuffer.allocate(8).putLong(j).array();
        return new Bytes((byte[]) Objects.requireNonNull(bArrArray, "passed array must not be null"), ByteOrder.BIG_ENDIAN);
    }

    public static Bytes b(float f) {
        byte[] bArrArray = ByteBuffer.allocate(4).putFloat(f).array();
        return new Bytes((byte[]) Objects.requireNonNull(bArrArray, "passed array must not be null"), ByteOrder.BIG_ENDIAN);
    }

    public static Bytes TuitionPaymentFragmentbindingInflater1(CharSequence charSequence) {
        byte[] bytes = ((CharSequence) Objects.requireNonNull(charSequence, "provided string must not be null")).toString().getBytes((Charset) Objects.requireNonNull(StandardCharsets.UTF_8, "provided charset must not be null"));
        return new Bytes((byte[]) Objects.requireNonNull(bytes, "passed array must not be null"), ByteOrder.BIG_ENDIAN);
    }

    public static Bytes b(CharSequence charSequence, Normalizer.Form form) {
        byte[] bytes = ((CharSequence) Objects.requireNonNull(Normalizer.normalize(charSequence, form), "provided string must not be null")).toString().getBytes((Charset) Objects.requireNonNull(StandardCharsets.UTF_8, "provided charset must not be null"));
        return new Bytes((byte[]) Objects.requireNonNull(bytes, "passed array must not be null"), ByteOrder.BIG_ENDIAN);
    }

    public static Bytes TuitionPaymentFragmentbindingInflater1(char[] cArr) {
        byte[] bArrArray;
        Charset charset = StandardCharsets.UTF_8;
        int length = cArr.length;
        if (cArr.length < 0) {
            throw new IllegalArgumentException("offset must be gt 0 and smaller than array length");
        }
        if (length < 0 || length > cArr.length) {
            throw new IllegalArgumentException("length must be at least 1 and less than array length");
        }
        if (length <= cArr.length) {
            if (length == 0) {
                bArrArray = new byte[0];
            } else {
                CharBuffer charBufferWrap = CharBuffer.wrap(cArr);
                if (length != charBufferWrap.remaining()) {
                    charBufferWrap = charBufferWrap.subSequence(0, length);
                }
                ByteBuffer byteBufferEncode = charset.encode(charBufferWrap);
                if (byteBufferEncode.capacity() != byteBufferEncode.limit()) {
                    byte[] bArr = new byte[byteBufferEncode.remaining()];
                    byteBufferEncode.get(bArr);
                    bArrArray = bArr;
                } else {
                    bArrArray = byteBufferEncode.array();
                }
            }
            return TuitionPaymentFragmentbindingInflater1(bArrArray);
        }
        throw new IllegalArgumentException("length + offset must be smaller than array length");
    }

    public static Bytes b(CharSequence charSequence) {
        byte[] bArrTuitionPaymentFragmentbindingInflater1 = new MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentbindingInflater1((CharSequence) Objects.requireNonNull(charSequence, "encoded data must not be null"));
        return new Bytes((byte[]) Objects.requireNonNull(bArrTuitionPaymentFragmentbindingInflater1, "passed array must not be null"), ByteOrder.BIG_ENDIAN);
    }

    public static Bytes TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return new Bytes(bArr, ByteOrder.BIG_ENDIAN);
    }

    public static Bytes b(int i, Random random) {
        byte[] bArr = new byte[i];
        random.nextBytes(bArr);
        return new Bytes(bArr, ByteOrder.BIG_ENDIAN);
    }

    Bytes(byte[] bArr, ByteOrder byteOrder) {
        this(bArr, byteOrder, new b((byte) 0));
    }

    Bytes(byte[] bArr, ByteOrder byteOrder, forceCloseConnection forcecloseconnection) {
        this.byteArray = bArr;
        this.byteOrder = byteOrder;
        this.factory = forcecloseconnection;
    }

    private Bytes TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        return this.factory.b(new BytesTransformer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, 4).b(this.byteArray, TuitionPaymentFragmentspecialinlinedviewModeldefault1()), this.byteOrder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Bytes bytes = (Bytes) obj;
        if (Arrays.equals(this.byteArray, bytes.byteArray)) {
            return Objects.equals(this.byteOrder, bytes.byteOrder);
        }
        return false;
    }

    public int hashCode() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0) {
            byte[] bArr = this.byteArray;
            ByteOrder byteOrder = this.byteOrder;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (Arrays.hashCode(bArr) * 31) + (byteOrder != null ? byteOrder.hashCode() : 0);
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new MediaBrowserCompatMediaBrowserImplBase6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.byteArray);
    }

    static class b implements forceCloseConnection {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // defpackage.forceCloseConnection
        public final Bytes b(byte[] bArr, ByteOrder byteOrder) {
            return new Bytes(bArr, byteOrder);
        }
    }

    public static Bytes TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte[] bArr) {
        if (bArr != null) {
            return new Bytes((byte[]) Objects.requireNonNull(bArr, "passed array must not be null"), ByteOrder.BIG_ENDIAN);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public String toString() {
        String string;
        byte[] bArr = this.byteArray;
        if (bArr.length == 0) {
            string = "";
        } else if (bArr.length > 8) {
            StringBuilder sb = new StringBuilder("(0x");
            Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(0);
            sb.append(new MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false).b(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault2.byteOrder));
            sb.append("...");
            Bytes bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.byteArray.length - 4);
            sb.append(new MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false).b(bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteArray, bytesTuitionPaymentFragmentspecialinlinedviewModeldefault3.byteOrder));
            sb.append(")");
            string = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("(0x");
            sb2.append(new MediaBrowserCompatMediaBrowserImplBase1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false).b(this.byteArray, this.byteOrder));
            sb2.append(")");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.byteArray.length);
        sb3.append(" ");
        sb3.append(this.byteArray.length == 1 ? "byte" : "bytes");
        sb3.append(" ");
        sb3.append(string);
        return sb3.toString();
    }
}
