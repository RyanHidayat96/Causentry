package com.google.zxing.common;

import com.google.zxing.FormatException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes5.dex */
public enum CharacterSetECI {
    /* JADX INFO: Fake field, exist only in values array */
    Cp437(new int[]{0, 2}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_2(4, "ISO-8859-2"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_3(5, "ISO-8859-3"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_4(6, "ISO-8859-4"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_5(7, "ISO-8859-5"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_6(8, "ISO-8859-6"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_7(9, "ISO-8859-7"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_8(10, "ISO-8859-8"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_9(11, "ISO-8859-9"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_10(12, "ISO-8859-10"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_11(13, "ISO-8859-11"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_13(15, "ISO-8859-13"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_14(16, "ISO-8859-14"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_15(17, "ISO-8859-15"),
    /* JADX INFO: Fake field, exist only in values array */
    ISO8859_16(18, "ISO-8859-16"),
    /* JADX INFO: Fake field, exist only in values array */
    SJIS(20, "Shift_JIS"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1250(21, "windows-1250"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1251(22, "windows-1251"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1252(23, "windows-1252"),
    /* JADX INFO: Fake field, exist only in values array */
    Cp1256(24, "windows-1256"),
    /* JADX INFO: Fake field, exist only in values array */
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    /* JADX INFO: Fake field, exist only in values array */
    UTF8(26, Hex.DEFAULT_CHARSET_NAME),
    /* JADX INFO: Fake field, exist only in values array */
    ASCII(new int[]{27, 170}, "US-ASCII"),
    /* JADX INFO: Fake field, exist only in values array */
    Big5,
    /* JADX INFO: Fake field, exist only in values array */
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    /* JADX INFO: Fake field, exist only in values array */
    EUC_KR(30, "EUC-KR");

    private final String[] otherEncodingNames;
    public final int[] values;
    private static final Map<Integer, CharacterSetECI> TuitionPaymentFragmentbindingInflater1 = new HashMap();
    private static final Map<String, CharacterSetECI> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashMap();

    static {
        for (CharacterSetECI characterSetECI : values()) {
            for (int i : characterSetECI.values) {
                TuitionPaymentFragmentbindingInflater1.put(Integer.valueOf(i), characterSetECI);
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(characterSetECI.name(), characterSetECI);
            for (String str : characterSetECI.otherEncodingNames) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3.put(str, characterSetECI);
            }
        }
    }

    CharacterSetECI() {
        this(new int[]{28}, new String[0]);
    }

    CharacterSetECI(int i, String... strArr) {
        this.values = new int[]{i};
        this.otherEncodingNames = strArr;
    }

    CharacterSetECI(int[] iArr, String... strArr) {
        this.values = iArr;
        this.otherEncodingNames = strArr;
    }

    public static CharacterSetECI TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) throws FormatException {
        if (i < 0 || i >= 900) {
            throw FormatException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        return TuitionPaymentFragmentbindingInflater1.get(Integer.valueOf(i));
    }

    public static CharacterSetECI TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(str);
    }
}
