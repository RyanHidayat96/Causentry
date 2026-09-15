package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes7.dex */
public final class getPreviewBitmap {
    private static final String[] TuitionPaymentFragmentbindingInflater1;
    private static final byte[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public static final String[] TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            int i2 = (i >> 12) & 15;
            char c = (char) (i2 < 10 ? i2 + 48 : i2 + 87);
            int i3 = (i >> 8) & 15;
            char c2 = (char) (i3 < 10 ? i3 + 48 : i3 + 87);
            int i4 = (i >> 4) & 15;
            char c3 = (char) (i4 < 10 ? i4 + 48 : i4 + 87);
            int i5 = i & 15;
            char c4 = (char) (i5 < 10 ? i5 + 48 : i5 + 87);
            StringBuilder sb = new StringBuilder("\\u");
            sb.append(c);
            sb.append(c2);
            sb.append(c3);
            sb.append(c4);
            strArr[i] = sb.toString();
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        TuitionPaymentFragmentbindingInflater1 = strArr;
        byte[] bArr = new byte[93];
        for (int i6 = 0; i6 < 32; i6++) {
            bArr[i6] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bArr;
    }

    public static final byte[] b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(StringBuilder sb, String str) {
        Intrinsics.checkNotNullParameter(sb, "");
        Intrinsics.checkNotNullParameter(str, "");
        sb.append(Typography.quote);
        String str2 = str;
        int length = str2.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            String[] strArr = TuitionPaymentFragmentbindingInflater1;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) str2, i, i2);
                sb.append(strArr[cCharAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str2, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append(Typography.quote);
    }

    public static final Boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt.equals(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (StringsKt.equals(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }
}
