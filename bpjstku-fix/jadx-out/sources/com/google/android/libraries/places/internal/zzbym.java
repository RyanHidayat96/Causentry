package com.google.android.libraries.places.internal;

import javax.security.auth.x500.X500Principal;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
final class zzbym {
    private final String zza;
    private final int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private char[] zzg;

    public zzbym(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.zza = name;
        this.zzb = name.length();
    }

    private final String zzb() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        while (true) {
            i = this.zzc;
            i2 = this.zzb;
            if (i >= i2 || this.zzg[i] != ' ') {
                break;
            }
            this.zzc = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.zzd = i;
        this.zzc = i + 1;
        while (true) {
            i3 = this.zzc;
            if (i3 >= i2 || (c5 = this.zzg[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.zzc = i3 + 1;
        }
        if (i3 >= i2) {
            throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.zza)));
        }
        this.zze = i3;
        if (this.zzg[i3] == ' ') {
            while (true) {
                i3 = this.zzc;
                if (i3 >= i2 || (c4 = this.zzg[i3]) == '=' || c4 != ' ') {
                    break;
                }
                this.zzc = i3 + 1;
            }
            if (this.zzg[i3] != '=' || i3 == i2) {
                throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.zza)));
            }
        }
        do {
            i3++;
            this.zzc = i3;
            if (i3 >= i2) {
                break;
            }
        } while (this.zzg[i3] == ' ');
        int i4 = this.zze;
        int i5 = this.zzd;
        if (i4 - i5 > 4) {
            char[] cArr = this.zzg;
            if (cArr[i5 + 3] == '.' && (((c = cArr[i5]) == 'O' || c == 'o') && (((c2 = cArr[i5 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i5 + 2]) == 'D' || c3 == 'd')))) {
                i5 += 4;
                this.zzd = i5;
            }
        }
        return new String(this.zzg, i5, i4 - i5);
    }

    private final char zzc() {
        int i;
        int i2;
        int i3 = this.zzc + 1;
        this.zzc = i3;
        int i4 = this.zzb;
        if (i3 == i4) {
            throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.zza)));
        }
        char c = this.zzg[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iZzd = zzd(i3);
                            this.zzc++;
                            if (iZzd >= 128) {
                                if (iZzd < 192 || iZzd > 247) {
                                    iZzd = 63;
                                } else {
                                    if (iZzd <= 223) {
                                        i = iZzd & 31;
                                        i2 = 1;
                                    } else if (iZzd <= 239) {
                                        i = iZzd & 15;
                                        i2 = 2;
                                    } else {
                                        i = iZzd & 7;
                                        i2 = 3;
                                    }
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < i2) {
                                            int i6 = this.zzc;
                                            int i7 = i6 + 1;
                                            this.zzc = i7;
                                            if (i7 != i4 && this.zzg[i7] == '\\') {
                                                int i8 = i6 + 2;
                                                this.zzc = i8;
                                                int iZzd2 = zzd(i8);
                                                this.zzc++;
                                                if ((iZzd2 & DerHeader.TAG_CLASS_PRIVATE) == 128) {
                                                    i = (i << 6) + (iZzd2 & 63);
                                                    i5++;
                                                }
                                            }
                                            iZzd = 63;
                                        } else {
                                            iZzd = (char) i;
                                        }
                                    }
                                }
                            }
                            return (char) iZzd;
                    }
                case '*':
                case '+':
                case ',':
                    return c;
            }
        }
        return c;
    }

    private final int zzd(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.zzb) {
            throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.zza)));
        }
        char[] cArr = this.zzg;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.zza)));
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.zza)));
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public final String zza(String str) {
        String str2;
        char[] cArr;
        char c;
        int i;
        char c2;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        String str3 = this.zza;
        this.zzg = str3.toCharArray();
        String strZzb = zzb();
        if (strZzb == null) {
            return null;
        }
        do {
            int i2 = this.zzc;
            int i3 = this.zzb;
            if (i2 == i3) {
                return null;
            }
            char c3 = this.zzg[i2];
            if (c3 == '\"') {
                int i4 = i2 + 1;
                this.zzc = i4;
                this.zzd = i4;
                this.zze = i4;
                while (true) {
                    int i5 = this.zzc;
                    if (i5 == i3) {
                        throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(str3)));
                    }
                    char[] cArr2 = this.zzg;
                    char c4 = cArr2[i5];
                    if (c4 == '\"') {
                        this.zzc = i5 + 1;
                        while (true) {
                            int i6 = this.zzc;
                            if (i6 >= i3 || this.zzg[i6] != ' ') {
                                break;
                            }
                            this.zzc = i6 + 1;
                        }
                        char[] cArr3 = this.zzg;
                        int i7 = this.zzd;
                        str2 = new String(cArr3, i7, this.zze - i7);
                        break;
                    }
                    if (c4 == '\\') {
                        cArr2[this.zze] = zzc();
                    } else {
                        cArr2[this.zze] = c4;
                    }
                    this.zzc++;
                    this.zze++;
                }
            } else if (c3 != '#') {
                if (c3 == '+' || c3 == ',' || c3 == ';') {
                    str2 = "";
                } else {
                    this.zzd = i2;
                    this.zze = i2;
                    while (true) {
                        int i8 = this.zzc;
                        if (i8 >= i3) {
                            char[] cArr4 = this.zzg;
                            int i9 = this.zzd;
                            str2 = new String(cArr4, i9, this.zze - i9);
                            break;
                        }
                        char[] cArr5 = this.zzg;
                        char c5 = cArr5[i8];
                        if (c5 != ' ') {
                            if (c5 != ';') {
                                if (c5 == '\\') {
                                    int i10 = this.zze;
                                    this.zze = i10 + 1;
                                    cArr5[i10] = zzc();
                                    this.zzc++;
                                } else if (c5 != '+' && c5 != ',') {
                                    int i11 = this.zze;
                                    this.zze = i11 + 1;
                                    cArr5[i11] = c5;
                                    this.zzc = i8 + 1;
                                }
                            }
                            int i12 = this.zzd;
                            str2 = new String(cArr5, i12, this.zze - i12);
                            break;
                        }
                        int i13 = this.zze;
                        this.zzf = i13;
                        this.zzc = i8 + 1;
                        this.zze = i13 + 1;
                        cArr5[i13] = ' ';
                        while (true) {
                            i = this.zzc;
                            if (i >= i3) {
                                break;
                            }
                            char[] cArr6 = this.zzg;
                            if (cArr6[i] != ' ') {
                                break;
                            }
                            int i14 = this.zze;
                            this.zze = i14 + 1;
                            cArr6[i14] = ' ';
                            this.zzc = i + 1;
                        }
                        if (i == i3 || (c2 = this.zzg[i]) == ',' || c2 == '+' || c2 == ';') {
                            char[] cArr7 = this.zzg;
                            int i15 = this.zzd;
                            str2 = new String(cArr7, i15, this.zzf - i15);
                            break;
                        }
                    }
                }
            } else {
                if (i2 + 4 >= i3) {
                    throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(str3)));
                }
                this.zzd = i2;
                this.zzc = i2 + 1;
                while (true) {
                    int i16 = this.zzc;
                    if (i16 == i3 || (c = (cArr = this.zzg)[i16]) == '+' || c == ',' || c == ';') {
                        this.zze = i16;
                        break;
                    }
                    int i17 = i16 + 1;
                    if (c == ' ') {
                        this.zze = i16;
                        this.zzc = i17;
                        while (true) {
                            int i18 = this.zzc;
                            if (i18 >= i3 || this.zzg[i18] != ' ') {
                                break;
                            }
                            this.zzc = i18 + 1;
                        }
                    } else {
                        if (c >= 'A' && c <= 'F') {
                            cArr[i16] = (char) (c + ' ');
                        }
                        this.zzc = i17;
                    }
                }
                int i19 = this.zze;
                int i20 = this.zzd;
                int i21 = i19 - i20;
                if (i21 < 5 || (i21 & 1) == 0) {
                    throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(str3)));
                }
                int i22 = i21 >> 1;
                int i23 = i20 + 1;
                byte[] bArr = new byte[i22];
                int i24 = 0;
                while (i24 < i22) {
                    bArr[i24] = (byte) zzd(i23);
                    i24++;
                    i23 += 2;
                }
                str2 = new String(this.zzg, this.zzd, i21);
            }
            if ("cn".equalsIgnoreCase(strZzb)) {
                return str2;
            }
            int i25 = this.zzc;
            if (i25 >= i3) {
                return null;
            }
            char c6 = this.zzg[i25];
            if (c6 != ',' && c6 != ';' && c6 != '+') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(str3)));
            }
            this.zzc = i25 + 1;
            strZzb = zzb();
        } while (strZzb != null);
        throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(str3)));
    }
}
