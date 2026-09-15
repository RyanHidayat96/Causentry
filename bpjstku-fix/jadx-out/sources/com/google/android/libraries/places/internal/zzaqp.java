package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqp {
    public static boolean zza(int i) {
        if (i <= 126) {
            return i >= 32 || i == 10 || i == 13 || i == 9 || i == 12;
        }
        if (i < 55296) {
            return i >= 160;
        }
        if (i < 64976) {
            return i > 57343;
        }
        return i > 65007 && (i & 65534) != 65534 && i <= 1114111;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0032  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x006c A[SYNTHETIC] */
    public static String zzb(String str, int i) {
        int length;
        StringBuilder sb;
        char cCharAt;
        int iCodePointAt;
        int i2;
        int iCodePointAt2;
        int length2 = str.length();
        int iCharCount = 0;
        int i3 = 0;
        while (i3 != length2) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 <= '~') {
                if (cCharAt2 < ' ') {
                    if (cCharAt2 < 55296) {
                        if (cCharAt2 > 57343) {
                            iCodePointAt2 = Character.codePointAt(str, i3);
                            if (iCodePointAt2 < 65536 && (iCodePointAt2 & 65534) != 65534) {
                                i3 += 2;
                            }
                        } else if (cCharAt2 >= 64976 && (cCharAt2 <= 65007 || cCharAt2 >= 65534)) {
                        }
                        length = str.length();
                        sb = new StringBuilder(length);
                        while (iCharCount < length) {
                            cCharAt = str.charAt(iCharCount);
                            if (zza(cCharAt)) {
                                sb.append(cCharAt);
                                iCharCount++;
                            } else {
                                iCodePointAt = Character.codePointAt(str, iCharCount);
                                if (true != zza(iCodePointAt)) {
                                    i2 = 65533;
                                } else {
                                    i2 = iCodePointAt;
                                }
                                sb.appendCodePoint(i2);
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                        }
                        return sb.toString();
                    }
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != '\t' && cCharAt2 != '\f') {
                        length = str.length();
                        sb = new StringBuilder(length);
                        while (iCharCount < length) {
                            cCharAt = str.charAt(iCharCount);
                            if (zza(cCharAt)) {
                                sb.append(cCharAt);
                                iCharCount++;
                            } else {
                                iCodePointAt = Character.codePointAt(str, iCharCount);
                                if (true != zza(iCodePointAt)) {
                                    i2 = 65533;
                                } else {
                                    i2 = iCodePointAt;
                                }
                                sb.appendCodePoint(i2);
                                iCharCount += Character.charCount(iCodePointAt);
                            }
                        }
                        return sb.toString();
                    }
                }
            } else if (cCharAt2 >= 55296 || cCharAt2 < 160) {
                if (cCharAt2 < 55296) {
                    if (cCharAt2 > 57343) {
                        iCodePointAt2 = Character.codePointAt(str, i3);
                        if (iCodePointAt2 < 65536) {
                        }
                    } else if (cCharAt2 >= 64976) {
                    }
                    length = str.length();
                    sb = new StringBuilder(length);
                    while (iCharCount < length) {
                        cCharAt = str.charAt(iCharCount);
                        if (zza(cCharAt)) {
                            sb.append(cCharAt);
                            iCharCount++;
                        } else {
                            iCodePointAt = Character.codePointAt(str, iCharCount);
                            if (true != zza(iCodePointAt)) {
                                i2 = 65533;
                            } else {
                                i2 = iCodePointAt;
                            }
                            sb.appendCodePoint(i2);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return sb.toString();
                }
                if (cCharAt2 != '\n') {
                    length = str.length();
                    sb = new StringBuilder(length);
                    while (iCharCount < length) {
                        cCharAt = str.charAt(iCharCount);
                        if (zza(cCharAt)) {
                            sb.append(cCharAt);
                            iCharCount++;
                        } else {
                            iCodePointAt = Character.codePointAt(str, iCharCount);
                            if (true != zza(iCodePointAt)) {
                                i2 = 65533;
                            } else {
                                i2 = iCodePointAt;
                            }
                            sb.appendCodePoint(i2);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return sb.toString();
                }
            }
            i3++;
        }
        return str;
    }
}
