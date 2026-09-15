package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.messaging.Constants;
import defpackage.RotationProviderListenerWrapper;
import defpackage.canProvideSurface;
import defpackage.recalculate;
import defpackage.setSensorRect;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 ]2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001]B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016J\u0011\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J,\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u0010H\u0010¢\u0006\u0002\b#J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0000J\u0013\u0010'\u001a\u00020%2\b\u0010\u001a\u001a\u0004\u0018\u00010(H\u0096\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0087\u0002¢\u0006\u0002\b,J\u0015\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020\tH\u0007¢\u0006\u0002\b-J\r\u0010.\u001a\u00020\tH\u0010¢\u0006\u0002\b/J\b\u0010\b\u001a\u00020\tH\u0016J\b\u00100\u001a\u00020\u0010H\u0016J\u001d\u00101\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u0000H\u0010¢\u0006\u0002\b3J\u0010\u00104\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u0010\u00105\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u0010\u00106\u001a\u00020\u00002\u0006\u00102\u001a\u00020\u0000H\u0016J\u001a\u00107\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\tH\u0017J\u001a\u00107\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\tH\u0007J\r\u00109\u001a\u00020\u0004H\u0010¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020\tH\u0010¢\u0006\u0002\b=J\u001a\u0010>\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u00108\u001a\u00020\tH\u0017J\u001a\u0010>\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u00108\u001a\u00020\tH\u0007J\u0006\u0010?\u001a\u00020\u0000J(\u0010@\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J(\u0010@\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0016J\u0010\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020DH\u0002J\u0006\u0010E\u001a\u00020\u0000J\u0006\u0010F\u001a\u00020\u0000J\u0006\u0010G\u001a\u00020\u0000J\r\u0010\u000e\u001a\u00020\tH\u0007¢\u0006\u0002\bHJ\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\u0000J\u0010\u0010K\u001a\u00020\u00102\u0006\u0010L\u001a\u00020MH\u0016J\u001c\u0010N\u001a\u00020\u00002\b\b\u0002\u0010O\u001a\u00020\t2\b\b\u0002\u0010P\u001a\u00020\tH\u0017J\b\u0010Q\u001a\u00020\u0000H\u0016J\b\u0010R\u001a\u00020\u0000H\u0016J\b\u0010S\u001a\u00020\u0004H\u0016J\b\u0010T\u001a\u00020\u0010H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010U\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020WH\u0016J%\u0010U\u001a\u00020\u001c2\u0006\u0010X\u001a\u00020Y2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010 \u001a\u00020\tH\u0010¢\u0006\u0002\bZJ\u0010\u0010[\u001a\u00020\u001c2\u0006\u0010V\u001a\u00020\\H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006^"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "([B)V", "getData$okio", "()[B", "hashCode", "", "getHashCode$okio", "()I", "setHashCode$okio", "(I)V", "size", "utf8", "", "getUtf8$okio", "()Ljava/lang/String;", "setUtf8$okio", "(Ljava/lang/String;)V", "asByteBuffer", "Ljava/nio/ByteBuffer;", "base64", "base64Url", "compareTo", "other", "copyInto", "", TypedValues.CycleType.S_WAVE_OFFSET, TypedValues.AttributesType.S_TARGET, "targetOffset", "byteCount", "digest", "algorithm", "digest$okio", "endsWith", "", DynamicLink.Builder.KEY_SUFFIX, "equals", "", "get", "", FirebaseAnalytics.Param.INDEX, "getByte", "-deprecated_getByte", "getSize", "getSize$okio", "hex", "hmac", "key", "hmac$okio", "hmacSha1", "hmacSha256", "hmacSha512", "indexOf", "fromIndex", "internalArray", "internalArray$okio", "internalGet", "pos", "internalGet$okio", "lastIndexOf", "md5", "rangeEquals", "otherOffset", "readObject", "in", "Ljava/io/ObjectInputStream;", "sha1", "sha256", "sha512", "-deprecated_size", "startsWith", "prefix", TypedValues.Custom.S_STRING, "charset", "Ljava/nio/charset/Charset;", "substring", "beginIndex", "endIndex", "toAsciiLowercase", "toAsciiUppercase", "toByteArray", "toString", "write", "out", "Ljava/io/OutputStream;", "buffer", "Lokio/Buffer;", "write$okio", "writeObject", "Ljava/io/ObjectOutputStream;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ByteString implements Serializable, Comparable<ByteString> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    public transient String utf8;

    public ByteString(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.data = bArr;
    }

    /* JADX INFO: renamed from: getData$okio, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from getter */
    public final int getHashCode() {
        return this.hashCode;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        this.hashCode = i;
    }

    public ByteString b(String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNull(bArrDigest);
        return new ByteString(bArrDigest);
    }

    public static /* synthetic */ ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault3(ByteString byteString, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        return byteString.b(i, i2);
    }

    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2(RotationProviderListenerWrapper rotationProviderListenerWrapper, int i, int i2) {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, rotationProviderListenerWrapper, 0, i2);
    }

    public static /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault1(ByteString byteString, ByteString byteString2) {
        Intrinsics.checkNotNullParameter(byteString2, "");
        return byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 0);
    }

    public static /* synthetic */ int TuitionPaymentFragmentbindingInflater1(ByteString byteString, ByteString byteString2) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        Intrinsics.checkNotNullParameter(byteString2, "");
        return byteString.TuitionPaymentFragmentbindingInflater1(byteString2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private final void readObject(ObjectInputStream in) throws IllegalAccessException, NoSuchFieldException, IOException {
        ByteString byteStringB = Companion.b(in, in.readInt());
        Field declaredField = ByteString.class.getDeclaredField(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        declaredField.setAccessible(true);
        declaredField.set(this, byteStringB.data);
    }

    private final void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    /* JADX INFO: renamed from: okio.ByteString$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00020\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\b\u001a\u00020\u0007*\u00020\nH\u0007¢\u0006\u0004\b\b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u0007*\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\fJ\u001b\u0010\u0012\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lokio/ByteString$b;", "", "<init>", "()V", "", "", "p0", "Lokio/ByteString;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "([B)Lokio/ByteString;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;)Lokio/ByteString;", "Ljava/nio/charset/Charset;", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/ByteString;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Ljava/io/InputStream;", "", "b", "(Ljava/io/InputStream;I)Lokio/ByteString;", "EMPTY", "Lokio/ByteString;", "", "serialVersionUID", "J"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ ByteString b(byte[] bArr) {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intrinsics.checkNotNullParameter(bArr, "");
            int iB = recalculate.b(bArr, iTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr.length, 0L, iB);
            return new ByteString(ArraysKt.copyOfRange(bArr, 0, iB));
        }

        private Companion() {
        }

        @JvmStatic
        public static ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, Charset charset) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(charset, "");
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return new ByteString(bytes);
        }

        @JvmStatic
        public static ByteString b(InputStream inputStream, int i) throws IOException {
            Intrinsics.checkNotNullParameter(inputStream, "");
            if (i < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(i)).toString());
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    throw new EOFException();
                }
                i2 += i3;
            }
            return new ByteString(bArr);
        }

        @JvmStatic
        public static ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte... p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            byte[] bArrCopyOf = Arrays.copyOf(p0, p0.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
            return new ByteString(bArrCopyOf);
        }

        @JvmStatic
        public static ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str, "");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            ByteString byteString = new ByteString(bytes);
            byteString.utf8 = str;
            return byteString;
        }

        @JvmStatic
        public static ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            byte[] bArrTuitionPaymentFragmentbindingInflater1 = setSensorRect.TuitionPaymentFragmentbindingInflater1(str);
            if (bArrTuitionPaymentFragmentbindingInflater1 != null) {
                return new ByteString(bArrTuitionPaymentFragmentbindingInflater1);
            }
            return null;
        }

        @JvmStatic
        public static ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(String.valueOf(str)).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str.charAt(i2)) << 4) + canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str.charAt(i2 + 1)));
            }
            return new ByteString(bArr);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public String b() {
        return setSensorRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getData());
    }

    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        char[] cArr = new char[getData().length * 2];
        byte[] data = getData();
        int length = data.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            byte b = data[i2];
            cArr[i] = canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[(b >> 4) & 15];
            cArr[i + 1] = canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2()[b & 15];
            i2++;
            i += 2;
        }
        return StringsKt.concatToString(cArr);
    }

    public ByteString g() {
        for (int i = 0; i < getData().length; i++) {
            byte b = getData()[i];
            if (b >= 65 && b <= 90) {
                byte[] data = getData();
                byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    public ByteString b(int i, int i2) {
        int iB = recalculate.b(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
        if (iB <= getData().length) {
            if (iB - i >= 0) {
                return (i == 0 && iB == getData().length) ? this : new ByteString(ArraysKt.copyOfRange(getData(), i, iB));
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        StringBuilder sb = new StringBuilder("endIndex > length(");
        sb.append(getData().length);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public byte b(int i) {
        return getData()[i];
    }

    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return getData().length;
    }

    public byte[] asBinder() {
        byte[] data = getData();
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }

    public byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return getData();
    }

    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, ByteString byteString, int i2) {
        Intrinsics.checkNotNullParameter(byteString, "");
        return byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, getData(), i, i2);
    }

    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return i >= 0 && i <= getData().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getData(), i, bArr, i2, i3);
    }

    public int TuitionPaymentFragmentspecialinlinedviewModeldefault3(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int length = getData().length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getData(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int TuitionPaymentFragmentbindingInflater1(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        for (int iMin = Math.min(recalculate.b(this, i), getData().length - bArr.length); iMin >= 0; iMin--) {
            if (recalculate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getData(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other instanceof ByteString) {
            ByteString byteString = (ByteString) other;
            if (byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3() == getData().length && byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0, getData(), 0, getData().length)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        if (getData().length == 0) {
            return "[size=0]";
        }
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = canProvideSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getData());
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1) {
            if (getData().length <= 64) {
                StringBuilder sb = new StringBuilder("[hex=");
                sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                sb.append(']');
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("[size=");
            sb2.append(getData().length);
            sb2.append(" hex=");
            int iB = recalculate.b(this, 64);
            if (iB > getData().length) {
                StringBuilder sb3 = new StringBuilder("endIndex > length(");
                sb3.append(getData().length);
                sb3.append(')');
                throw new IllegalArgumentException(sb3.toString().toString());
            }
            if (iB >= 0) {
                sb2.append((iB == getData().length ? this : new ByteString(ArraysKt.copyOfRange(getData(), 0, iB))).TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new IllegalArgumentException("endIndex < beginIndex".toString());
        }
        String str = this.utf8;
        if (str == null) {
            byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
            this.utf8 = str2;
            str = str2;
        }
        String strSubstring = str.substring(0, iTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 < str.length()) {
            StringBuilder sb4 = new StringBuilder("[size=");
            sb4.append(getData().length);
            sb4.append(" text=");
            sb4.append(strReplace$default);
            sb4.append("…]");
            return sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder("[text=");
        sb5.append(strReplace$default);
        sb5.append(']');
        return sb5.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "");
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = byteString.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iMin = Math.min(iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault4);
        for (int i = 0; i < iMin; i++) {
            int iB = b(i) & UByte.MAX_VALUE;
            int iB2 = byteString.b(i) & UByte.MAX_VALUE;
            if (iB != iB2) {
                return iB < iB2 ? -1 : 1;
            }
        }
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == iTuitionPaymentFragmentspecialinlinedviewModeldefault4) {
            return 0;
        }
        return iTuitionPaymentFragmentspecialinlinedviewModeldefault3 < iTuitionPaymentFragmentspecialinlinedviewModeldefault4 ? -1 : 1;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(getData());
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public final String asInterface() {
        String str = this.utf8;
        if (str != null) {
            return str;
        }
        byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
        this.utf8 = str2;
        return str2;
    }

    @JvmStatic
    public static final ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        return Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
    }

    @JvmStatic
    public static final ByteString TuitionPaymentFragmentbindingInflater1(String str) {
        return Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str);
    }

    @JvmStatic
    public static final ByteString TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        return Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
    }

    @JvmStatic
    public static final ByteString TuitionPaymentFragmentbindingInflater1(byte... bArr) {
        return Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bArr);
    }
}
