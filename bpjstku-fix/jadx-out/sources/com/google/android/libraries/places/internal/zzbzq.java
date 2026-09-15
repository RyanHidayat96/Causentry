package com.google.android.libraries.places.internal;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzq {
    String zza;
    String zzb;
    int zzc = -1;

    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075 A[LOOP:3: B:32:0x005c->B:42:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0080 A[LOOP:2: B:24:0x0049->B:45:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0 A[LOOP:1: B:51:0x0093->B:54:0x00a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x00a6 A[EDGE_INSN: B:81:0x00a6->B:55:0x00a6 BREAK  A[LOOP:1: B:51:0x0093->B:54:0x00a0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008c, code lost:
    
        if (r9 == r7) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress zzf(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbzq.zzf(java.lang.String, int, int):java.net.InetAddress");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zza);
        sb.append("://");
        if (this.zzb.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.zzb);
            sb.append(']');
        } else {
            sb.append(this.zzb);
        }
        int iZzd = zzd();
        if (iZzd != zzbzr.zzc(this.zza)) {
            sb.append(':');
            sb.append(iZzd);
        }
        return sb.toString();
    }

    public final zzbzq zzb(String str) {
        int i;
        String strSubstring;
        if (str == null) {
            throw new IllegalArgumentException("host == null");
        }
        int i2 = 0;
        int iCharCount = 0;
        while (true) {
            int length = str.length();
            i = -1;
            if (iCharCount >= length) {
                strSubstring = str.substring(0, length);
                break;
            }
            if (str.charAt(iCharCount) == '%') {
                zzcbj zzcbjVar = new zzcbj();
                zzcbjVar.zzw(str, 0, iCharCount);
                while (iCharCount < length) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt != 37) {
                        zzcbjVar.zzx(iCodePointAt);
                    } else {
                        int i3 = iCharCount + 2;
                        if (i3 < length) {
                            int iZzd = zzbzr.zzd(str.charAt(iCharCount + 1));
                            int iZzd2 = zzbzr.zzd(str.charAt(i3));
                            if (iZzd != -1 && iZzd2 != -1) {
                                zzcbjVar.zzA((iZzd << 4) + iZzd2);
                                iCharCount = i3;
                                iCodePointAt = 37;
                            }
                        }
                        iCodePointAt = 37;
                        zzcbjVar.zzx(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                strSubstring = zzcbjVar.zzo();
                break;
            }
            iCharCount++;
        }
        String strZzo = null;
        if (strSubstring.startsWith("[") && strSubstring.endsWith("]")) {
            InetAddress inetAddressZzf = zzf(strSubstring, 1, strSubstring.length() - 1);
            if (inetAddressZzf != null) {
                byte[] address = inetAddressZzf.getAddress();
                if (address.length != 16) {
                    throw new AssertionError();
                }
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    int i8 = i7 > i5 ? i7 : i5;
                    if (i7 > i5) {
                        i = i4;
                    }
                    i4 = i6 + 2;
                    i5 = i8;
                }
                zzcbj zzcbjVar2 = new zzcbj();
                while (i2 < address.length) {
                    if (i2 == i) {
                        zzcbjVar2.zzA(58);
                        i2 += i5;
                        if (i2 == 16) {
                            zzcbjVar2.zzA(58);
                        }
                    } else {
                        if (i2 > 0) {
                            zzcbjVar2.zzA(58);
                        }
                        zzcbjVar2.zzD(((address[i2] & UByte.MAX_VALUE) << 8) | (address[i2 + 1] & UByte.MAX_VALUE));
                        i2 += 2;
                    }
                }
                strZzo = zzcbjVar2.zzo();
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i2 >= lowerCase.length()) {
                            strZzo = lowerCase;
                            break;
                        }
                        char cCharAt = lowerCase.charAt(i2);
                        if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                            break;
                            break;
                            break;
                        }
                        i2++;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        if (strZzo == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.zzb = strZzo;
        return this;
    }

    public final zzbzq zzc(int i) {
        if (i > 0 && i <= 65535) {
            this.zzc = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
        sb.append("unexpected port: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    final int zzd() {
        int i = this.zzc;
        return i != -1 ? i : zzbzr.zzc(this.zza);
    }

    public final zzbzr zze() {
        if (this.zza == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.zzb != null) {
            return new zzbzr(this, null);
        }
        throw new IllegalStateException("host == null");
    }

    public final zzbzq zza(String str) {
        this.zza = "https";
        return this;
    }
}
