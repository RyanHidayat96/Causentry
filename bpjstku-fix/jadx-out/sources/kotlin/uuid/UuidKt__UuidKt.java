package kotlin.uuid;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexExtensionsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\r\u001a\u00020\f*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u0017\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0019"}, d2 = {"", "p0", "Lkotlin/uuid/Uuid;", "uuidFromRandomBytes", "([B)Lkotlin/uuid/Uuid;", "", "", "getLongAtCommonImpl", "([BI)J", "p1", "p2", "p3", "", "formatBytesIntoCommonImpl", "(J[BIII)V", "", "checkHyphenAt", "(Ljava/lang/String;I)V", "setLongAtCommonImpl", "([BIJ)V", "uuidParseHexDashCommonImpl", "(Ljava/lang/String;)Lkotlin/uuid/Uuid;", "uuidParseHexCommonImpl", "truncateForErrorMessage$UuidKt__UuidKt", "(Ljava/lang/String;I)Ljava/lang/String;", "([BI)Ljava/lang/String;"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    public static final Uuid uuidFromRandomBytes(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & 63);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | ByteCompanionObject.MIN_VALUE);
        return Uuid.Companion.fromByteArray(bArr);
    }

    public static final long getLongAtCommonImpl(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (((long) bArr[i + 7]) & 255);
    }

    public static final void formatBytesIntoCommonImpl(long j, byte[] bArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = HexExtensionsKt.getBYTE_TO_LOWER_CASE_HEX_DIGITS()[(int) ((j >> (i4 << 3)) & 255)];
            bArr[i] = (byte) (i6 >> 8);
            int i7 = i + 2;
            bArr[i + 1] = (byte) i6;
            if (i4 == i5) {
                return;
            }
            i4--;
            i = i7;
        }
    }

    public static final void checkHyphenAt(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected '-' (hyphen) at index ");
        sb.append(i);
        sb.append(", but was '");
        sb.append(str.charAt(i));
        sb.append('\'');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static final void setLongAtCommonImpl(byte[] bArr, int i, long j) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int i2 = 7;
        while (i2 >= 0) {
            bArr[i] = (byte) (j >> (i2 << 3));
            i2--;
            i++;
        }
    }

    public static final Uuid uuidParseHexDashCommonImpl(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        long jHexToLong$default = HexExtensionsKt.hexToLong$default(str, 0, 8, null, 4, null);
        UuidKt.checkHyphenAt(str, 8);
        long jHexToLong$default2 = HexExtensionsKt.hexToLong$default(str, 9, 13, null, 4, null);
        UuidKt.checkHyphenAt(str, 13);
        long jHexToLong$default3 = HexExtensionsKt.hexToLong$default(str, 14, 18, null, 4, null);
        UuidKt.checkHyphenAt(str, 18);
        long jHexToLong$default4 = HexExtensionsKt.hexToLong$default(str, 19, 23, null, 4, null);
        UuidKt.checkHyphenAt(str, 23);
        return Uuid.Companion.fromLongs((jHexToLong$default << 32) | (jHexToLong$default2 << 16) | jHexToLong$default3, (jHexToLong$default4 << 48) | HexExtensionsKt.hexToLong$default(str, 24, 36, null, 4, null));
    }

    public static final Uuid uuidParseHexCommonImpl(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Uuid.Companion.fromLongs(HexExtensionsKt.hexToLong$default(str, 0, 16, null, 4, null), HexExtensionsKt.hexToLong$default(str, 16, 32, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage$UuidKt__UuidKt(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(str, "");
        String strSubstring = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        sb.append("...");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage$UuidKt__UuidKt(byte[] bArr, int i) {
        return ArraysKt.joinToString$default(bArr, (CharSequence) null, (CharSequence) "[", (CharSequence) "]", i, (CharSequence) null, (Function1) null, 49, (Object) null);
    }
}
