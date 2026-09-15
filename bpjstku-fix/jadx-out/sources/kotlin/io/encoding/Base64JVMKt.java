package kotlin.io.encoding;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u001a,\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u0007\u0010\b\u001a,\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\n\u0010\u000b\u001a<\u0010\u000e\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a,\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0081\b¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "p0", "", "p1", "p2", "", "platformCharsToBytes", "(Lkotlin/io/encoding/Base64;Ljava/lang/CharSequence;II)[B", "", "platformEncodeToString", "(Lkotlin/io/encoding/Base64;[BII)Ljava/lang/String;", "p3", "p4", "platformEncodeIntoByteArray", "(Lkotlin/io/encoding/Base64;[B[BIII)I", "platformEncodeToByteArray", "(Lkotlin/io/encoding/Base64;[BII)[B"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Base64JVMKt {
    private static final byte[] platformCharsToBytes(Base64 base64, CharSequence charSequence, int i, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(base64, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            base64.checkSourceBounds$kotlin_stdlib(str.length(), i, i2);
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "");
            byte[] bytes = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return bytes;
        }
        return base64.charsToBytesImpl$kotlin_stdlib(charSequence, i, i2);
    }

    private static final String platformEncodeToString(Base64 base64, byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(base64, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        return new String(base64.encodeToByteArrayImpl$kotlin_stdlib(bArr, i, i2), Charsets.ISO_8859_1);
    }

    private static final int platformEncodeIntoByteArray(Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(base64, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        return base64.encodeIntoByteArrayImpl$kotlin_stdlib(bArr, bArr2, i, i2, i3);
    }

    private static final byte[] platformEncodeToByteArray(Base64 base64, byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(base64, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        return base64.encodeToByteArrayImpl$kotlin_stdlib(bArr, i, i2);
    }
}
