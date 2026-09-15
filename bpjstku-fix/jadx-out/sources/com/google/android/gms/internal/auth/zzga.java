package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes6.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private final void zzA(Object obj, int i, int i2) {
        zzhj.zzn(obj, zzl(i2) & 1048575, i);
    }

    private final void zzB(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzo(i) & 1048575, obj2);
        zzz(obj, i);
    }

    private final void zzC(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzo(i2) & 1048575, obj2);
        zzA(obj, i, i2);
    }

    private final boolean zzD(Object obj, Object obj2, int i) {
        return zzE(obj, i) == zzE(obj2, i);
    }

    private final boolean zzE(Object obj, int i) {
        int iZzl = zzl(i);
        long j = iZzl & 1048575;
        if (j != 1048575) {
            return (zzhj.zzc(obj, j) & (1 << (iZzl >>> 20))) != 0;
        }
        int iZzo = zzo(i);
        long j2 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j2)) != 0;
            case 2:
                return zzhj.zzd(obj, j2) != 0;
            case 3:
                return zzhj.zzd(obj, j2) != 0;
            case 4:
                return zzhj.zzc(obj, j2) != 0;
            case 5:
                return zzhj.zzd(obj, j2) != 0;
            case 6:
                return zzhj.zzc(obj, j2) != 0;
            case 7:
                return zzhj.zzt(obj, j2);
            case 8:
                Object objZzf = zzhj.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzef) {
                    return !zzef.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j2) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j2));
            case 11:
                return zzhj.zzc(obj, j2) != 0;
            case 12:
                return zzhj.zzc(obj, j2) != 0;
            case 13:
                return zzhj.zzc(obj, j2) != 0;
            case 14:
                return zzhj.zzd(obj, j2) != 0;
            case 15:
                return zzhj.zzc(obj, j2) != 0;
            case 16:
                return zzhj.zzd(obj, j2) != 0;
            case 17:
                return zzhj.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzE(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzG(Object obj, int i, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i, int i2) {
        return zzhj.zzc(obj, (long) (zzl(i2) & 1048575)) == i;
    }

    static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0250  */
    /* JADX WARN: Code duplicated, block: B:124:0x0253  */
    /* JADX WARN: Code duplicated, block: B:127:0x026b  */
    /* JADX WARN: Code duplicated, block: B:128:0x026e  */
    static zzga zzj(Class cls, zzfu zzfuVar, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        Class<?> cls2;
        int iObjectFieldOffset;
        int i18;
        int i19;
        int i20;
        int iObjectFieldOffset2;
        Field fieldZzv;
        char cCharAt9;
        int i21;
        int i22;
        int i23;
        Object obj;
        Field fieldZzv2;
        int i24;
        Object obj2;
        Field fieldZzv3;
        int i25;
        char cCharAt10;
        int i26;
        char cCharAt11;
        int i27;
        char cCharAt12;
        int i28;
        char cCharAt13;
        if (!(zzfuVar instanceof zzgh)) {
            throw null;
        }
        zzgh zzghVar = (zzgh) zzfuVar;
        String strZzd = zzghVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (strZzd.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int iCharAt3 = strZzd.charAt(i);
        if (iCharAt3 >= 55296) {
            int i31 = iCharAt3 & 8191;
            int i32 = 13;
            while (true) {
                i28 = i30 + 1;
                cCharAt13 = strZzd.charAt(i30);
                if (cCharAt13 < 55296) {
                    break;
                }
                i31 |= (cCharAt13 & 8191) << i32;
                i32 += 13;
                i30 = i28;
            }
            iCharAt3 = i31 | (cCharAt13 << i32);
            i30 = i28;
        }
        if (iCharAt3 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            i3 = 0;
            i6 = 0;
            i2 = 0;
            i4 = 0;
            iArr = zza;
            i5 = 0;
        } else {
            int i33 = i30 + 1;
            int iCharAt4 = strZzd.charAt(i30);
            if (iCharAt4 >= 55296) {
                int i34 = iCharAt4 & 8191;
                int i35 = 13;
                while (true) {
                    i14 = i33 + 1;
                    cCharAt8 = strZzd.charAt(i33);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i34 |= (cCharAt8 & 8191) << i35;
                    i35 += 13;
                    i33 = i14;
                }
                iCharAt4 = i34 | (cCharAt8 << i35);
                i33 = i14;
            }
            int i36 = i33 + 1;
            int iCharAt5 = strZzd.charAt(i33);
            if (iCharAt5 >= 55296) {
                int i37 = iCharAt5 & 8191;
                int i38 = 13;
                while (true) {
                    i13 = i36 + 1;
                    cCharAt7 = strZzd.charAt(i36);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt7 & 8191) << i38;
                    i38 += 13;
                    i36 = i13;
                }
                iCharAt5 = i37 | (cCharAt7 << i38);
                i36 = i13;
            }
            int i39 = i36 + 1;
            int iCharAt6 = strZzd.charAt(i36);
            if (iCharAt6 >= 55296) {
                int i40 = iCharAt6 & 8191;
                int i41 = 13;
                while (true) {
                    i12 = i39 + 1;
                    cCharAt6 = strZzd.charAt(i39);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt6 & 8191) << i41;
                    i41 += 13;
                    i39 = i12;
                }
                iCharAt6 = i40 | (cCharAt6 << i41);
                i39 = i12;
            }
            int i42 = i39 + 1;
            int iCharAt7 = strZzd.charAt(i39);
            if (iCharAt7 >= 55296) {
                int i43 = iCharAt7 & 8191;
                int i44 = 13;
                while (true) {
                    i11 = i42 + 1;
                    cCharAt5 = strZzd.charAt(i42);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt5 & 8191) << i44;
                    i44 += 13;
                    i42 = i11;
                }
                iCharAt7 = i43 | (cCharAt5 << i44);
                i42 = i11;
            }
            int i45 = i42 + 1;
            iCharAt = strZzd.charAt(i42);
            if (iCharAt >= 55296) {
                int i46 = iCharAt & 8191;
                int i47 = 13;
                while (true) {
                    i10 = i45 + 1;
                    cCharAt4 = strZzd.charAt(i45);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt4 & 8191) << i47;
                    i47 += 13;
                    i45 = i10;
                }
                iCharAt = i46 | (cCharAt4 << i47);
                i45 = i10;
            }
            int i48 = i45 + 1;
            iCharAt2 = strZzd.charAt(i45);
            if (iCharAt2 >= 55296) {
                int i49 = iCharAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i9 = i48 + 1;
                    cCharAt3 = strZzd.charAt(i48);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt3 & 8191) << i50;
                    i50 += 13;
                    i48 = i9;
                }
                iCharAt2 = i49 | (cCharAt3 << i50);
                i48 = i9;
            }
            int i51 = i48 + 1;
            int iCharAt8 = strZzd.charAt(i48);
            if (iCharAt8 >= 55296) {
                int i52 = iCharAt8 & 8191;
                int i53 = 13;
                while (true) {
                    i8 = i51 + 1;
                    cCharAt2 = strZzd.charAt(i51);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt2 & 8191) << i53;
                    i53 += 13;
                    i51 = i8;
                }
                iCharAt8 = i52 | (cCharAt2 << i53);
                i51 = i8;
            }
            int i54 = i51 + 1;
            int iCharAt9 = strZzd.charAt(i51);
            if (iCharAt9 >= 55296) {
                int i55 = iCharAt9 & 8191;
                int i56 = 13;
                while (true) {
                    i7 = i54 + 1;
                    cCharAt = strZzd.charAt(i54);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i55 |= (cCharAt & 8191) << i56;
                    i56 += 13;
                    i54 = i7;
                }
                iCharAt9 = i55 | (cCharAt << i56);
                i54 = i7;
            }
            i2 = iCharAt4 + iCharAt4 + iCharAt5;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i3 = iCharAt6;
            i4 = iCharAt9;
            i5 = iCharAt4;
            i6 = iCharAt7;
            i30 = i54;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzghVar.zze();
        Class<?> cls3 = zzghVar.zza().getClass();
        int i57 = i4 + iCharAt2;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt + iCharAt];
        int i58 = 0;
        int i59 = 0;
        int i60 = i4;
        int i61 = i57;
        while (i30 < length) {
            int i62 = i30 + 1;
            int iCharAt10 = strZzd.charAt(i30);
            if (iCharAt10 >= c) {
                int i63 = iCharAt10 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i27 = i64 + 1;
                    cCharAt12 = strZzd.charAt(i64);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i63 |= (cCharAt12 & 8191) << i65;
                    i65 += 13;
                    i64 = i27;
                }
                iCharAt10 = i63 | (cCharAt12 << i65);
                i15 = i27;
            } else {
                i15 = i62;
            }
            int i66 = i15 + 1;
            int iCharAt11 = strZzd.charAt(i15);
            if (iCharAt11 >= c) {
                int i67 = iCharAt11 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i26 = i68 + 1;
                    cCharAt11 = strZzd.charAt(i68);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i67 |= (cCharAt11 & 8191) << i69;
                    i69 += 13;
                    i68 = i26;
                }
                iCharAt11 = i67 | (cCharAt11 << i69);
                i16 = i26;
            } else {
                i16 = i66;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i59] = i58;
                i59++;
            }
            int i70 = iCharAt11 & 255;
            int i71 = length;
            if (i70 >= 51) {
                int i72 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                char c2 = 55296;
                if (iCharAt12 >= 55296) {
                    int i73 = iCharAt12 & 8191;
                    int i74 = 13;
                    while (true) {
                        i25 = i72 + 1;
                        cCharAt10 = strZzd.charAt(i72);
                        if (cCharAt10 < c2) {
                            break;
                        }
                        i73 |= (cCharAt10 & 8191) << i74;
                        i74 += 13;
                        i72 = i25;
                        c2 = 55296;
                    }
                    iCharAt12 = i73 | (cCharAt10 << i74);
                    i72 = i25;
                }
                int i75 = i70 - 51;
                int i76 = i72;
                if (i75 == 9 || i75 == 17) {
                    int i77 = i58 / 3;
                    i22 = i2 + 1;
                    objArr[i77 + i77 + 1] = objArrZze[i2];
                } else {
                    if (i75 == 12 && (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0)) {
                        int i78 = i58 / 3;
                        i22 = i2 + 1;
                        objArr[i78 + i78 + 1] = objArrZze[i2];
                    }
                    i23 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i23];
                    if (obj instanceof Field) {
                        fieldZzv2 = (Field) obj;
                    } else {
                        fieldZzv2 = zzv(cls3, (String) obj);
                        objArrZze[i23] = fieldZzv2;
                    }
                    int i79 = i3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv2);
                    i24 = i23 + 1;
                    obj2 = objArrZze[i24];
                    if (obj2 instanceof Field) {
                        fieldZzv3 = (Field) obj2;
                    } else {
                        fieldZzv3 = zzv(cls3, (String) obj2);
                        objArrZze[i24] = fieldZzv3;
                    }
                    strZzd = strZzd;
                    i17 = i79;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv3);
                    cls2 = cls3;
                    i20 = i2;
                    i18 = i76;
                    i19 = 0;
                }
                i2 = i22;
                i23 = iCharAt12 + iCharAt12;
                obj = objArrZze[i23];
                if (obj instanceof Field) {
                    fieldZzv2 = (Field) obj;
                } else {
                    fieldZzv2 = zzv(cls3, (String) obj);
                    objArrZze[i23] = fieldZzv2;
                }
                int i710 = i3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzv2);
                i24 = i23 + 1;
                obj2 = objArrZze[i24];
                if (obj2 instanceof Field) {
                    fieldZzv3 = (Field) obj2;
                } else {
                    fieldZzv3 = zzv(cls3, (String) obj2);
                    objArrZze[i24] = fieldZzv3;
                }
                strZzd = strZzd;
                i17 = i710;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv3);
                cls2 = cls3;
                i20 = i2;
                i18 = i76;
                i19 = 0;
            } else {
                int i80 = i3;
                int i81 = i2 + 1;
                Field fieldZzv4 = zzv(cls3, (String) objArrZze[i2]);
                if (i70 == 9 || i70 == 17) {
                    i17 = i80;
                    int i82 = i58 / 3;
                    objArr[i82 + i82 + 1] = fieldZzv4.getType();
                } else {
                    if (i70 == 27 || i70 == 49) {
                        i17 = i80;
                        int i83 = i58 / 3;
                        i21 = i2 + 2;
                        objArr[i83 + i83 + 1] = objArrZze[i81];
                    } else if (i70 == 12 || i70 == 30 || i70 == 44) {
                        i17 = i80;
                        if (zzghVar.zzc() == 1 || (iCharAt11 & 2048) != 0) {
                            int i84 = i58 / 3;
                            i21 = i2 + 2;
                            objArr[i84 + i84 + 1] = objArrZze[i81];
                        }
                    } else {
                        if (i70 == 50) {
                            iArr[i60] = i58;
                            int i85 = i58 / 3;
                            int i86 = i2 + 2;
                            int i87 = i85 + i85;
                            objArr[i87] = objArrZze[i81];
                            if ((iCharAt11 & 2048) != 0) {
                                objArr[i87 + 1] = objArrZze[i86];
                                i86 = i2 + 3;
                            }
                            i60++;
                            i81 = i86;
                        }
                        i17 = i80;
                    }
                    i81 = i21;
                }
                cls2 = cls3;
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzv4);
                if ((iCharAt11 & 4096) == 0 || i70 > 17) {
                    iObjectFieldOffset = 1048575;
                    i18 = i16;
                    i19 = 0;
                } else {
                    int i88 = i16 + 1;
                    int iCharAt13 = strZzd.charAt(i16);
                    if (iCharAt13 >= 55296) {
                        int i89 = iCharAt13 & 8191;
                        int i90 = 13;
                        while (true) {
                            i18 = i88 + 1;
                            cCharAt9 = strZzd.charAt(i88);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i89 |= (cCharAt9 & 8191) << i90;
                            i90 += 13;
                            i88 = i18;
                        }
                        iCharAt13 = i89 | (cCharAt9 << i90);
                    } else {
                        i18 = i88;
                    }
                    int i91 = i5 + i5 + (iCharAt13 / 32);
                    Object obj3 = objArrZze[i91];
                    if (obj3 instanceof Field) {
                        fieldZzv = (Field) obj3;
                    } else {
                        fieldZzv = zzv(cls2, (String) obj3);
                        objArrZze[i91] = fieldZzv;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzv);
                    i19 = iCharAt13 % 32;
                }
                if (i70 >= 18 && i70 <= 49) {
                    iArr[i61] = iObjectFieldOffset3;
                    i61++;
                }
                i20 = i81;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            iArr2[i58] = iCharAt10;
            iArr2[i58 + 1] = iObjectFieldOffset2 | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i70 << 20);
            iArr2[i58 + 2] = iObjectFieldOffset | (i19 << 20);
            i58 += 3;
            cls3 = cls2;
            i2 = i20;
            i30 = i18;
            i3 = i17;
            strZzd = strZzd;
            length = i71;
            i6 = i6;
            c = 55296;
        }
        return new zzga(iArr2, objArr, i3, i6, zzghVar.zza(), zzghVar.zzc(), false, iArr, i4, i57, zzgcVar, zzflVar, zzgzVar, zzemVar, zzfsVar);
    }

    private static int zzk(Object obj, long j) {
        return ((Integer) zzhj.zzf(obj, j)).intValue();
    }

    private final int zzl(int i) {
        return this.zzc[i + 2];
    }

    private final int zzm(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzn(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzo(int i) {
        return this.zzc[i + 1];
    }

    private static long zzp(Object obj, long j) {
        return ((Long) zzhj.zzf(obj, j)).longValue();
    }

    private final zzey zzq(int i) {
        int i2 = i / 3;
        return (zzey) this.zzd[i2 + i2 + 1];
    }

    private final zzgi zzr(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgi zzgiVar = (zzgi) this.zzd[i3];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    private final Object zzs(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzt(Object obj, int i) {
        zzgi zzgiVarZzr = zzr(i);
        int iZzo = zzo(i);
        if (!zzE(obj, i)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, 1048575 & iZzo);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private final Object zzu(Object obj, int i, int i2) {
        zzgi zzgiVarZzr = zzr(i2);
        if (!zzI(obj, i, i2)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i2) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private static Field zzv(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void zzx(Object obj, Object obj2, int i) {
        if (zzE(obj2, i)) {
            int iZzo = zzo(i);
            Unsafe unsafe = zzb;
            long j = iZzo & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i);
            if (!zzE(obj, i)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j, objZzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzz(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzI(obj2, i2, i)) {
            int iZzo = zzo(i);
            Unsafe unsafe = zzb;
            long j = iZzo & 1048575;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i);
            if (!zzI(obj, i2, i)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j, objZzd);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzA(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i) {
        int iZzl = zzl(i);
        long j = 1048575 & iZzl;
        if (j == 1048575) {
            return;
        }
        zzhj.zzn(obj, j, (1 << (iZzl >>> 20)) | zzhj.zzc(obj, j));
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01c3  */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final int zza(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzo = zzo(i3);
            int i4 = this.zzc[i3];
            long j = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    i = i2 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhj.zza(obj, j));
                    byte[] bArr = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 1:
                    i = i2 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhj.zzb(obj, j));
                    i2 = i + iFloatToIntBits;
                    break;
                case 2:
                    i = i2 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr2 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 3:
                    i = i2 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr3 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 4:
                    i = i2 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 5:
                    i = i2 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr4 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 6:
                    i = i2 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 7:
                    i = i2 * 53;
                    iFloatToIntBits = zzfa.zza(zzhj.zzt(obj, j));
                    i2 = i + iFloatToIntBits;
                    break;
                case 8:
                    i = i2 * 53;
                    iFloatToIntBits = ((String) zzhj.zzf(obj, j)).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 9:
                    Object objZzf = zzhj.zzf(obj, j);
                    if (objZzf != null) {
                        iFloatToIntBits = objZzf.hashCode();
                    } else {
                        iFloatToIntBits = 37;
                    }
                    i = i2 * 53;
                    i2 = i + iFloatToIntBits;
                    break;
                case 10:
                    i = i2 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 11:
                    i = i2 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 12:
                    i = i2 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 13:
                    i = i2 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 14:
                    i = i2 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr5 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 15:
                    i = i2 * 53;
                    iFloatToIntBits = zzhj.zzc(obj, j);
                    i2 = i + iFloatToIntBits;
                    break;
                case 16:
                    i = i2 * 53;
                    jDoubleToLongBits = zzhj.zzd(obj, j);
                    byte[] bArr6 = zzfa.zzd;
                    iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                    i2 = i + iFloatToIntBits;
                    break;
                case 17:
                    Object objZzf2 = zzhj.zzf(obj, j);
                    if (objZzf2 != null) {
                        iFloatToIntBits = objZzf2.hashCode();
                    } else {
                        iFloatToIntBits = 37;
                    }
                    i = i2 * 53;
                    i2 = i + iFloatToIntBits;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 50:
                    i = i2 * 53;
                    iFloatToIntBits = zzhj.zzf(obj, j).hashCode();
                    i2 = i + iFloatToIntBits;
                    break;
                case 51:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zzhj.zzf(obj, j)).doubleValue());
                        byte[] bArr7 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 52:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zzhj.zzf(obj, j)).floatValue());
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 53:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzp(obj, j);
                        byte[] bArr8 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 54:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzp(obj, j);
                        byte[] bArr9 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 55:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzk(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 56:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzp(obj, j);
                        byte[] bArr10 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 57:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzk(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 58:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzfa.zza(((Boolean) zzhj.zzf(obj, j)).booleanValue());
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 59:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = ((String) zzhj.zzf(obj, j)).hashCode();
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 60:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 61:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 62:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzk(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 63:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzk(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 64:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzk(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 65:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzp(obj, j);
                        byte[] bArr11 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 66:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzk(obj, j);
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 67:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        jDoubleToLongBits = zzp(obj, j);
                        byte[] bArr12 = zzfa.zzd;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        i2 = i + iFloatToIntBits;
                    }
                    break;
                case 68:
                    if (zzI(obj, i4, i3)) {
                        i = i2 * 53;
                        iFloatToIntBits = zzhj.zzf(obj, j).hashCode();
                        i2 = i + iFloatToIntBits;
                    }
                    break;
            }
        }
        return (i2 * 53) + this.zzl.zzb(obj).hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0245  */
    /* JADX WARN: Code duplicated, block: B:107:0x025c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:549:0x0cf1 A[PHI: r4 r5 r6 r7 r21 r25
  0x0cf1: PHI (r4v91 int) = (r4v62 int), (r4v63 int), (r4v64 int), (r4v66 int), (r4v67 int), (r4v68 int), (r4v70 int), (r4v82 int), (r4v92 int) binds: [B:547:0x0cda, B:544:0x0cb5, B:540:0x0c93, B:537:0x0c73, B:534:0x0c52, B:531:0x0c30, B:529:0x0c1f, B:506:0x0bb0, B:478:0x0aa9] A[DONT_GENERATE, DONT_INLINE]
  0x0cf1: PHI (r5v76 com.google.android.gms.internal.auth.zzdt) = 
  (r5v60 com.google.android.gms.internal.auth.zzdt)
  (r5v61 com.google.android.gms.internal.auth.zzdt)
  (r5v62 com.google.android.gms.internal.auth.zzdt)
  (r5v64 com.google.android.gms.internal.auth.zzdt)
  (r5v65 com.google.android.gms.internal.auth.zzdt)
  (r5v66 com.google.android.gms.internal.auth.zzdt)
  (r5v68 com.google.android.gms.internal.auth.zzdt)
  (r5v73 com.google.android.gms.internal.auth.zzdt)
  (r5v77 com.google.android.gms.internal.auth.zzdt)
 binds: [B:547:0x0cda, B:544:0x0cb5, B:540:0x0c93, B:537:0x0c73, B:534:0x0c52, B:531:0x0c30, B:529:0x0c1f, B:506:0x0bb0, B:478:0x0aa9] A[DONT_GENERATE, DONT_INLINE]
  0x0cf1: PHI (r6v70 int) = (r6v45 int), (r6v46 int), (r6v47 int), (r6v49 int), (r6v50 int), (r6v51 int), (r6v53 int), (r6v63 int), (r6v71 int) binds: [B:547:0x0cda, B:544:0x0cb5, B:540:0x0c93, B:537:0x0c73, B:534:0x0c52, B:531:0x0c30, B:529:0x0c1f, B:506:0x0bb0, B:478:0x0aa9] A[DONT_GENERATE, DONT_INLINE]
  0x0cf1: PHI (r7v57 java.lang.Object) = 
  (r7v36 java.lang.Object)
  (r7v37 java.lang.Object)
  (r7v38 java.lang.Object)
  (r7v40 java.lang.Object)
  (r7v41 java.lang.Object)
  (r7v42 java.lang.Object)
  (r7v44 java.lang.Object)
  (r7v51 java.lang.Object)
  (r7v58 java.lang.Object)
 binds: [B:547:0x0cda, B:544:0x0cb5, B:540:0x0c93, B:537:0x0c73, B:534:0x0c52, B:531:0x0c30, B:529:0x0c1f, B:506:0x0bb0, B:478:0x0aa9] A[DONT_GENERATE, DONT_INLINE]
  0x0cf1: PHI (r21v25 int) = 
  (r21v8 int)
  (r21v9 int)
  (r21v10 int)
  (r21v12 int)
  (r21v13 int)
  (r21v14 int)
  (r21v16 int)
  (r5v59 int)
  (r21v26 int)
 binds: [B:547:0x0cda, B:544:0x0cb5, B:540:0x0c93, B:537:0x0c73, B:534:0x0c52, B:531:0x0c30, B:529:0x0c1f, B:506:0x0bb0, B:478:0x0aa9] A[DONT_GENERATE, DONT_INLINE]
  0x0cf1: PHI (r25v21 int) = (r25v4 int), (r25v5 int), (r25v6 int), (r25v8 int), (r25v9 int), (r25v10 int), (r25v12 int), (r1v109 int), (r25v22 int) binds: [B:547:0x0cda, B:544:0x0cb5, B:540:0x0c93, B:537:0x0c73, B:534:0x0c52, B:531:0x0c30, B:529:0x0c1f, B:506:0x0bb0, B:478:0x0aa9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:620:0x0a2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:0x0cf4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0a3b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x0d0b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:681:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:683:0x0210 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:684:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x022e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:690:0x0204 A[EDGE_INSN: B:690:0x0204->B:686:0x0204 BREAK  A[LOOP:4: B:87:0x0217->B:90:0x0221], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0206  */
    /* JADX WARN: Code duplicated, block: B:88:0x0219  */
    /* JADX WARN: Code duplicated, block: B:90:0x0221 A[LOOP:4: B:87:0x0217->B:90:0x0221, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x0230  */
    /* JADX WARN: Code duplicated, block: B:97:0x023d  */
    final int zzb(Object obj, byte[] bArr, int i, int i2, int i3, zzdt zzdtVar) throws IOException {
        Unsafe unsafe;
        int i4;
        int i5;
        int i6;
        int iZzi;
        int iZzm;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Unsafe unsafe2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zzez zzezVar;
        int i20;
        int i21;
        int i22;
        int iZzh;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Unsafe unsafe3;
        int iZzf;
        int iZzh2;
        int iZzh3;
        Object obj2;
        int i28;
        int i29;
        int iZzj;
        int i30;
        int i31;
        int i32;
        int iZzh4;
        int i33;
        int i34;
        zzdt zzdtVar2;
        int iZzk;
        int i35;
        int iZzk2;
        int i36;
        zzdt zzdtVar3;
        int iZza;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int iZzl;
        int i45;
        int i46;
        byte b;
        byte b2;
        int i47;
        int iZzk3;
        int i48;
        int i49;
        zzga<T> zzgaVar = this;
        Object obj3 = obj;
        i2 = i2;
        int i50 = i3;
        zzdt zzdtVar4 = zzdtVar;
        zzw(obj);
        Unsafe unsafe4 = zzb;
        int i51 = 0;
        int iZzg = i;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = -1;
        int i56 = 1048575;
        while (true) {
            if (iZzg < i2) {
                int i57 = iZzg + 1;
                int i58 = bArr[iZzg];
                if (i58 < 0) {
                    iZzi = zzdu.zzi(i58, bArr, i57, zzdtVar4);
                    i6 = zzdtVar4.zza;
                } else {
                    i6 = i58;
                    iZzi = i57;
                }
                int i59 = i6 >>> 3;
                if (i59 > i55) {
                    int i60 = i52 / 3;
                    if (i59 < zzgaVar.zze || i59 > zzgaVar.zzf) {
                        i7 = -1;
                        i8 = -1;
                    } else {
                        iZzm = zzgaVar.zzm(i59, i60);
                        i8 = iZzm;
                        i7 = -1;
                    }
                } else if (i59 < zzgaVar.zze || i59 > zzgaVar.zzf) {
                    i7 = -1;
                    i8 = -1;
                } else {
                    iZzm = zzgaVar.zzm(i59, i51);
                    i8 = iZzm;
                    i7 = -1;
                }
                if (i8 != i7) {
                    int i61 = i6 & 7;
                    int[] iArr = zzgaVar.zzc;
                    int i62 = iArr[i8 + 1];
                    int i63 = i6;
                    int iZzn = zzn(i62);
                    long j = i62 & 1048575;
                    if (iZzn <= 17) {
                        int i64 = iArr[i8 + 2];
                        int i65 = 1 << (i64 >>> 20);
                        int i66 = 1048575;
                        int i67 = i64 & 1048575;
                        if (i67 != i56) {
                            if (i56 != 1048575) {
                                unsafe4.putInt(obj3, i56, i54);
                                i66 = 1048575;
                            }
                            i38 = i67 == i66 ? 0 : unsafe4.getInt(obj3, i67);
                            i37 = i67;
                        } else {
                            i38 = i54;
                            i37 = i56;
                        }
                        switch (iZzn) {
                            case 0:
                                i39 = i8;
                                i40 = i63;
                                i41 = 0;
                                if (i61 == 1) {
                                    zzhj.zzl(obj3, j, Double.longBitsToDouble(zzdu.zzn(bArr, iZzi)));
                                    i42 = iZzi + 8;
                                    i43 = i38 | i65;
                                    i13 = i41;
                                    i44 = i40;
                                    i52 = i39;
                                    iZzl = i42;
                                    zzdtVar4 = zzdtVar4;
                                    i18 = i59;
                                    i2 = i2;
                                    iZzg = iZzl;
                                    i53 = i44;
                                    i56 = i37;
                                    unsafe4 = unsafe4;
                                    i54 = i43;
                                    obj3 = obj;
                                    i50 = i3;
                                    unsafe4 = unsafe4;
                                    i55 = i18;
                                    i51 = i13;
                                } else {
                                    i13 = i41;
                                    i47 = i40;
                                    i8 = i39;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 1:
                                i39 = i8;
                                i40 = i63;
                                i41 = 0;
                                if (i61 == 5) {
                                    zzhj.zzm(obj3, j, Float.intBitsToFloat(zzdu.zzb(bArr, iZzi)));
                                    i42 = iZzi + 4;
                                    i43 = i38 | i65;
                                    i13 = i41;
                                    i44 = i40;
                                    i52 = i39;
                                    iZzl = i42;
                                    zzdtVar4 = zzdtVar4;
                                    i18 = i59;
                                    i2 = i2;
                                    iZzg = iZzl;
                                    i53 = i44;
                                    i56 = i37;
                                    unsafe4 = unsafe4;
                                    i54 = i43;
                                    obj3 = obj;
                                    i50 = i3;
                                    unsafe4 = unsafe4;
                                    i55 = i18;
                                    i51 = i13;
                                } else {
                                    i13 = i41;
                                    i47 = i40;
                                    i8 = i39;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 2:
                            case 3:
                                i39 = i8;
                                i40 = i63;
                                i41 = 0;
                                if (i61 == 0) {
                                    int iZzk4 = zzdu.zzk(bArr, iZzi, zzdtVar4);
                                    unsafe4.putLong(obj, j, zzdtVar4.zzb);
                                    i54 = i38 | i65;
                                    i13 = 0;
                                    i53 = i40;
                                    i52 = i39;
                                    iZzg = iZzk4;
                                    i18 = i59;
                                    i56 = i37;
                                    obj3 = obj;
                                    i50 = i3;
                                    unsafe4 = unsafe4;
                                    i55 = i18;
                                    i51 = i13;
                                } else {
                                    i13 = i41;
                                    i47 = i40;
                                    i8 = i39;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 4:
                            case 11:
                                i39 = i8;
                                i40 = i63;
                                i41 = 0;
                                if (i61 == 0) {
                                    iZzg = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                    unsafe4.putInt(obj3, j, zzdtVar4.zza);
                                    i54 = i38 | i65;
                                    i13 = i41;
                                    i53 = i40;
                                    i52 = i39;
                                    i18 = i59;
                                    i56 = i37;
                                    obj3 = obj;
                                    i50 = i3;
                                    unsafe4 = unsafe4;
                                    i55 = i18;
                                    i51 = i13;
                                } else {
                                    i13 = i41;
                                    i47 = i40;
                                    i8 = i39;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 5:
                            case 14:
                                int i68 = iZzi;
                                i39 = i8;
                                i40 = i63;
                                i41 = 0;
                                if (i61 == 1) {
                                    unsafe4.putLong(obj, j, zzdu.zzn(bArr, i68));
                                    iZzg = i68 + 8;
                                    i54 = i38 | i65;
                                    i13 = i41;
                                    i53 = i40;
                                    i52 = i39;
                                    i18 = i59;
                                    i56 = i37;
                                    obj3 = obj;
                                    i50 = i3;
                                    unsafe4 = unsafe4;
                                    i55 = i18;
                                    i51 = i13;
                                } else {
                                    iZzi = i68;
                                    i13 = i41;
                                    i47 = i40;
                                    i8 = i39;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 6:
                            case 13:
                                i45 = iZzi;
                                i39 = i8;
                                i40 = i63;
                                i41 = 0;
                                if (i61 == 5) {
                                    unsafe4.putInt(obj3, j, zzdu.zzb(bArr, i45));
                                    iZzg = i45 + 4;
                                    i54 = i38 | i65;
                                    i13 = i41;
                                    i53 = i40;
                                    i52 = i39;
                                    i18 = i59;
                                    i56 = i37;
                                    obj3 = obj;
                                    i50 = i3;
                                    unsafe4 = unsafe4;
                                    i55 = i18;
                                    i51 = i13;
                                } else {
                                    iZzi = i45;
                                    i13 = i41;
                                    i47 = i40;
                                    i8 = i39;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 7:
                                i45 = iZzi;
                                i39 = i8;
                                i40 = i63;
                                i41 = 0;
                                if (i61 == 0) {
                                    iZzg = zzdu.zzk(bArr, i45, zzdtVar4);
                                    zzhj.zzk(obj3, j, zzdtVar4.zzb != 0);
                                    i54 = i38 | i65;
                                    i13 = i41;
                                    i53 = i40;
                                    i52 = i39;
                                    i18 = i59;
                                    i56 = i37;
                                    obj3 = obj;
                                    i50 = i3;
                                    unsafe4 = unsafe4;
                                    i55 = i18;
                                    i51 = i13;
                                } else {
                                    iZzi = i45;
                                    i13 = i41;
                                    i47 = i40;
                                    i8 = i39;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 8:
                                i45 = iZzi;
                                i39 = i8;
                                i40 = i63;
                                if (i61 == 2) {
                                    if ((i62 & 536870912) != 0) {
                                        iZzg = zzdu.zzh(bArr, i45, zzdtVar4);
                                        int i69 = zzdtVar4.zza;
                                        if (i69 < 0) {
                                            throw zzfb.zzc();
                                        }
                                        if (i69 == 0) {
                                            zzdtVar4.zzc = "";
                                            i41 = 0;
                                        } else {
                                            int i70 = zzhn.zza;
                                            int length = bArr.length;
                                            if ((((length - iZzg) - i69) | iZzg | i69) < 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzg), Integer.valueOf(i69)));
                                            }
                                            int i71 = iZzg + i69;
                                            char[] cArr = new char[i69];
                                            int i72 = 0;
                                            while (iZzg < i71) {
                                                byte b3 = bArr[iZzg];
                                                if (zzhk.zzd(b3)) {
                                                    iZzg++;
                                                    cArr[i72] = (char) b3;
                                                    i72++;
                                                } else {
                                                    while (iZzg < i71) {
                                                        i46 = iZzg + 1;
                                                        b = bArr[iZzg];
                                                        if (zzhk.zzd(b)) {
                                                            cArr[i72] = (char) b;
                                                            i72++;
                                                            iZzg = i46;
                                                            while (iZzg < i71) {
                                                                b2 = bArr[iZzg];
                                                                if (zzhk.zzd(b2)) {
                                                                }
                                                                iZzg++;
                                                                cArr[i72] = (char) b2;
                                                                i72++;
                                                            }
                                                        } else {
                                                            if (b < -32) {
                                                                if (i46 < i71) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                zzhk.zzc(b, bArr[i46], cArr, i72);
                                                                iZzg += 2;
                                                            } else if (b < -16) {
                                                                if (i46 < i71 - 1) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                zzhk.zzb(b, bArr[i46], bArr[iZzg + 2], cArr, i72);
                                                                iZzg += 3;
                                                            } else {
                                                                if (i46 < i71 - 2) {
                                                                    throw zzfb.zzb();
                                                                }
                                                                zzhk.zza(b, bArr[i46], bArr[iZzg + 2], bArr[iZzg + 3], cArr, i72);
                                                                i72 += 2;
                                                                iZzg += 4;
                                                            }
                                                            i72++;
                                                        }
                                                        break;
                                                    }
                                                    i41 = 0;
                                                    zzdtVar4.zzc = new String(cArr, 0, i72);
                                                    iZzg = i71;
                                                }
                                            }
                                            while (iZzg < i71) {
                                                i46 = iZzg + 1;
                                                b = bArr[iZzg];
                                                if (zzhk.zzd(b)) {
                                                    cArr[i72] = (char) b;
                                                    i72++;
                                                    iZzg = i46;
                                                    while (iZzg < i71) {
                                                        b2 = bArr[iZzg];
                                                        if (zzhk.zzd(b2)) {
                                                        }
                                                        iZzg++;
                                                        cArr[i72] = (char) b2;
                                                        i72++;
                                                    }
                                                } else {
                                                    if (b < -32) {
                                                        if (i46 < i71) {
                                                            throw zzfb.zzb();
                                                        }
                                                        zzhk.zzc(b, bArr[i46], cArr, i72);
                                                        iZzg += 2;
                                                    } else if (b < -16) {
                                                        if (i46 < i71 - 1) {
                                                            throw zzfb.zzb();
                                                        }
                                                        zzhk.zzb(b, bArr[i46], bArr[iZzg + 2], cArr, i72);
                                                        iZzg += 3;
                                                    } else {
                                                        if (i46 < i71 - 2) {
                                                            throw zzfb.zzb();
                                                        }
                                                        zzhk.zza(b, bArr[i46], bArr[iZzg + 2], bArr[iZzg + 3], cArr, i72);
                                                        i72 += 2;
                                                        iZzg += 4;
                                                    }
                                                    i72++;
                                                }
                                                break;
                                            }
                                            i41 = 0;
                                            zzdtVar4.zzc = new String(cArr, 0, i72);
                                            iZzg = i71;
                                        }
                                    } else {
                                        i41 = 0;
                                        iZzg = zzdu.zzh(bArr, i45, zzdtVar4);
                                        int i73 = zzdtVar4.zza;
                                        if (i73 < 0) {
                                            throw zzfb.zzc();
                                        }
                                        if (i73 == 0) {
                                            zzdtVar4.zzc = "";
                                        } else {
                                            zzdtVar4.zzc = new String(bArr, iZzg, i73, zzfa.zzb);
                                            iZzg += i73;
                                        }
                                    }
                                    unsafe4.putObject(obj3, j, zzdtVar4.zzc);
                                    i54 = i38 | i65;
                                    i13 = i41;
                                    i53 = i40;
                                    i52 = i39;
                                    i18 = i59;
                                    i56 = i37;
                                    obj3 = obj;
                                    i50 = i3;
                                    unsafe4 = unsafe4;
                                    i55 = i18;
                                    i51 = i13;
                                } else {
                                    i41 = 0;
                                    iZzi = i45;
                                    i13 = i41;
                                    i47 = i40;
                                    i8 = i39;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 9:
                                i48 = i8;
                                i49 = i63;
                                if (i61 == 2) {
                                    Object objZzt = zzgaVar.zzt(obj3, i48);
                                    iZzg = zzdu.zzm(objZzt, zzgaVar.zzr(i48), bArr, iZzi, i2, zzdtVar);
                                    zzgaVar.zzB(obj3, i48, objZzt);
                                    i10 = i38 | i65;
                                    i14 = i48;
                                    unsafe2 = unsafe4;
                                    zzdtVar2 = zzdtVar4;
                                    i12 = i59;
                                    i13 = 0;
                                    i33 = i49;
                                    zzgaVar = this;
                                    i50 = i3;
                                    i55 = i12;
                                    zzdtVar4 = zzdtVar2;
                                    i2 = i2;
                                    i54 = i10;
                                    i51 = i13;
                                    i53 = i33;
                                    i52 = i14;
                                    unsafe4 = unsafe2;
                                    i56 = i37;
                                } else {
                                    iZzi = iZzi;
                                    i47 = i49;
                                    i8 = i48;
                                    i13 = 0;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 10:
                                i48 = i8;
                                i49 = i63;
                                if (i61 == 2) {
                                    iZzk3 = zzdu.zza(bArr, iZzi, zzdtVar4);
                                    unsafe4.putObject(obj3, j, zzdtVar4.zzc);
                                    i10 = i38 | i65;
                                    iZzg = iZzk3;
                                    i14 = i48;
                                    unsafe2 = unsafe4;
                                    zzdtVar2 = zzdtVar4;
                                    i12 = i59;
                                    i13 = 0;
                                    i33 = i49;
                                    zzgaVar = this;
                                    i50 = i3;
                                    i55 = i12;
                                    zzdtVar4 = zzdtVar2;
                                    i2 = i2;
                                    i54 = i10;
                                    i51 = i13;
                                    i53 = i33;
                                    i52 = i14;
                                    unsafe4 = unsafe2;
                                    i56 = i37;
                                } else {
                                    iZzi = iZzi;
                                    i47 = i49;
                                    i8 = i48;
                                    i13 = 0;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 12:
                                i48 = i8;
                                i49 = i63;
                                if (i61 == 0) {
                                    iZzk3 = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                    int i74 = zzdtVar4.zza;
                                    zzey zzeyVarZzq = zzgaVar.zzq(i48);
                                    if ((i62 & Integer.MIN_VALUE) == 0 || zzeyVarZzq == null || zzeyVarZzq.zza()) {
                                        unsafe4.putInt(obj3, j, i74);
                                        i10 = i38 | i65;
                                        iZzg = iZzk3;
                                        i14 = i48;
                                        unsafe2 = unsafe4;
                                        zzdtVar2 = zzdtVar4;
                                        i12 = i59;
                                        i13 = 0;
                                        i33 = i49;
                                        zzgaVar = this;
                                        i50 = i3;
                                        i55 = i12;
                                        zzdtVar4 = zzdtVar2;
                                        i2 = i2;
                                        i54 = i10;
                                        i51 = i13;
                                        i53 = i33;
                                        i52 = i14;
                                        unsafe4 = unsafe2;
                                        i56 = i37;
                                    } else {
                                        zzc(obj).zzh(i49, Long.valueOf(i74));
                                        i2 = i2;
                                        iZzg = iZzk3;
                                        i53 = i49;
                                        i52 = i48;
                                        unsafe4 = unsafe4;
                                        i18 = i59;
                                        i54 = i38;
                                        i56 = i37;
                                        i13 = 0;
                                        obj3 = obj;
                                        i50 = i3;
                                        unsafe4 = unsafe4;
                                        i55 = i18;
                                        i51 = i13;
                                    }
                                } else {
                                    iZzi = iZzi;
                                    i47 = i49;
                                    i8 = i48;
                                    i13 = 0;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 15:
                                i48 = i8;
                                i49 = i63;
                                if (i61 == 0) {
                                    iZzg = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                    unsafe4.putInt(obj3, j, zzej.zzb(zzdtVar4.zza));
                                    i10 = i38 | i65;
                                    i14 = i48;
                                    unsafe2 = unsafe4;
                                    zzdtVar2 = zzdtVar4;
                                    i12 = i59;
                                    i13 = 0;
                                    i33 = i49;
                                    zzgaVar = this;
                                    i50 = i3;
                                    i55 = i12;
                                    zzdtVar4 = zzdtVar2;
                                    i2 = i2;
                                    i54 = i10;
                                    i51 = i13;
                                    i53 = i33;
                                    i52 = i14;
                                    unsafe4 = unsafe2;
                                    i56 = i37;
                                } else {
                                    iZzi = iZzi;
                                    i47 = i49;
                                    i8 = i48;
                                    i13 = 0;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            case 16:
                                if (i61 == 0) {
                                    iZzk3 = zzdu.zzk(bArr, iZzi, zzdtVar4);
                                    i48 = i8;
                                    i49 = i63;
                                    unsafe4.putLong(obj, j, zzej.zzc(zzdtVar4.zzb));
                                    i38 |= i65;
                                    i2 = i2;
                                    iZzg = iZzk3;
                                    i53 = i49;
                                    i52 = i48;
                                    unsafe4 = unsafe4;
                                    i18 = i59;
                                    i54 = i38;
                                    i56 = i37;
                                    i13 = 0;
                                    obj3 = obj;
                                    i50 = i3;
                                    unsafe4 = unsafe4;
                                    i55 = i18;
                                    i51 = i13;
                                } else {
                                    i47 = i63;
                                    i13 = 0;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                            default:
                                i39 = i8;
                                i40 = i63;
                                i41 = 0;
                                if (i61 == 3) {
                                    Object objZzt2 = zzgaVar.zzt(obj3, i39);
                                    i13 = 0;
                                    i52 = i39;
                                    i44 = i40;
                                    iZzl = zzdu.zzl(objZzt2, zzgaVar.zzr(i39), bArr, iZzi, i2, (i59 << 3) | 4, zzdtVar);
                                    zzgaVar.zzB(obj3, i52, objZzt2);
                                    i43 = i38 | i65;
                                    zzdtVar4 = zzdtVar4;
                                    i18 = i59;
                                    i2 = i2;
                                    iZzg = iZzl;
                                    i53 = i44;
                                    i56 = i37;
                                    unsafe4 = unsafe4;
                                    i54 = i43;
                                    obj3 = obj;
                                    i50 = i3;
                                    unsafe4 = unsafe4;
                                    i55 = i18;
                                    i51 = i13;
                                } else {
                                    i13 = i41;
                                    i47 = i40;
                                    i8 = i39;
                                    i4 = i3;
                                    i9 = iZzi;
                                    unsafe2 = unsafe4;
                                    i15 = i47;
                                    i10 = i38;
                                    i11 = i37;
                                    i14 = i8;
                                    i12 = i59;
                                }
                                break;
                        }
                    } else {
                        int i75 = i8;
                        int i76 = i54;
                        int i77 = i63;
                        i13 = 0;
                        int i78 = i56;
                        i2 = i2;
                        if (iZzn != 27) {
                            if (iZzn <= 49) {
                                long j2 = i62;
                                Unsafe unsafe5 = zzb;
                                unsafe4 = unsafe4;
                                zzez zzezVar2 = (zzez) unsafe5.getObject(obj3, j);
                                if (zzezVar2.zzc()) {
                                    zzezVar = zzezVar2;
                                } else {
                                    int size = zzezVar2.size();
                                    zzez zzezVarZzd = zzezVar2.zzd(size != 0 ? size + size : 10);
                                    unsafe5.putObject(obj3, j, zzezVarZzd);
                                    zzezVar = zzezVarZzd;
                                }
                                switch (iZzn) {
                                    case 18:
                                    case 35:
                                        iZzi = iZzi;
                                        i2 = i2;
                                        i18 = i59;
                                        i20 = i75;
                                        i21 = i77;
                                        i78 = i78;
                                        i22 = i76;
                                        unsafe4 = unsafe4;
                                        if (i61 != 2) {
                                            if (i61 == 1) {
                                                zzek zzekVar = (zzek) zzezVar;
                                                zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, iZzi)));
                                                iZzh = iZzi + 8;
                                                while (iZzh < i2) {
                                                    int iZzh5 = zzdu.zzh(bArr, iZzh, zzdtVar4);
                                                    if (i21 == zzdtVar4.zza) {
                                                        zzekVar.zze(Double.longBitsToDouble(zzdu.zzn(bArr, iZzh5)));
                                                        iZzh = iZzh5 + 8;
                                                    }
                                                }
                                            }
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            zzek zzekVar2 = (zzek) zzezVar;
                                            iZzh = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                            int i79 = zzdtVar4.zza + iZzh;
                                            while (iZzh < i79) {
                                                zzekVar2.zze(Double.longBitsToDouble(zzdu.zzn(bArr, iZzh)));
                                                iZzh += 8;
                                            }
                                            if (iZzh != i79) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i23 = iZzh;
                                        i53 = i21;
                                        i52 = i20;
                                        i24 = iZzi;
                                        i54 = i22;
                                        i25 = i78;
                                        iZzi = i24;
                                        iZzg = i23;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        iZzi = iZzi;
                                        i2 = i2;
                                        i18 = i59;
                                        i20 = i75;
                                        i21 = i77;
                                        i78 = i78;
                                        i22 = i76;
                                        unsafe4 = unsafe4;
                                        if (i61 != 2) {
                                            if (i61 == 5) {
                                                zzer zzerVar = (zzer) zzezVar;
                                                zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr, iZzi)));
                                                iZzh = iZzi + 4;
                                                while (iZzh < i2) {
                                                    int iZzh6 = zzdu.zzh(bArr, iZzh, zzdtVar4);
                                                    if (i21 == zzdtVar4.zza) {
                                                        zzerVar.zze(Float.intBitsToFloat(zzdu.zzb(bArr, iZzh6)));
                                                        iZzh = iZzh6 + 4;
                                                    }
                                                }
                                            }
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            zzer zzerVar2 = (zzer) zzezVar;
                                            iZzh = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                            int i80 = zzdtVar4.zza + iZzh;
                                            while (iZzh < i80) {
                                                zzerVar2.zze(Float.intBitsToFloat(zzdu.zzb(bArr, iZzh)));
                                                iZzh += 4;
                                            }
                                            if (iZzh != i80) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i23 = iZzh;
                                        i53 = i21;
                                        i52 = i20;
                                        i24 = iZzi;
                                        i54 = i22;
                                        i25 = i78;
                                        iZzi = i24;
                                        iZzg = i23;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        iZzi = iZzi;
                                        i2 = i2;
                                        i18 = i59;
                                        i20 = i75;
                                        i21 = i77;
                                        i78 = i78;
                                        i22 = i76;
                                        unsafe4 = unsafe4;
                                        if (i61 != 2) {
                                            if (i61 == 0) {
                                                zzfm zzfmVar = (zzfm) zzezVar;
                                                iZzh = zzdu.zzk(bArr, iZzi, zzdtVar4);
                                                zzfmVar.zze(zzdtVar4.zzb);
                                                while (iZzh < i2) {
                                                    int iZzh7 = zzdu.zzh(bArr, iZzh, zzdtVar4);
                                                    if (i21 == zzdtVar4.zza) {
                                                        iZzh = zzdu.zzk(bArr, iZzh7, zzdtVar4);
                                                        zzfmVar.zze(zzdtVar4.zzb);
                                                    }
                                                }
                                            }
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            zzfm zzfmVar2 = (zzfm) zzezVar;
                                            iZzh = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                            int i81 = zzdtVar4.zza + iZzh;
                                            while (iZzh < i81) {
                                                iZzh = zzdu.zzk(bArr, iZzh, zzdtVar4);
                                                zzfmVar2.zze(zzdtVar4.zzb);
                                            }
                                            if (iZzh != i81) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        i23 = iZzh;
                                        i53 = i21;
                                        i52 = i20;
                                        i24 = iZzi;
                                        i54 = i22;
                                        i25 = i78;
                                        iZzi = i24;
                                        iZzg = i23;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i26 = i59;
                                        i27 = i75;
                                        i21 = i77;
                                        i78 = i78;
                                        i22 = i76;
                                        unsafe3 = unsafe4;
                                        if (i61 != 2) {
                                            if (i61 == 0) {
                                                iZzi = iZzi;
                                                unsafe4 = unsafe3;
                                                i18 = i26;
                                                i20 = i27;
                                                i2 = i2;
                                                iZzh = zzdu.zzj(i21, bArr, iZzi, i2, zzezVar, zzdtVar);
                                                i23 = iZzh;
                                                i53 = i21;
                                                i52 = i20;
                                                i24 = iZzi;
                                                i54 = i22;
                                                i25 = i78;
                                                iZzi = i24;
                                                iZzg = i23;
                                                if (iZzg != iZzi) {
                                                    i56 = i78;
                                                    obj3 = obj;
                                                    i50 = i3;
                                                    unsafe4 = unsafe4;
                                                    i55 = i18;
                                                    i51 = i13;
                                                } else {
                                                    obj3 = obj;
                                                    i19 = i52;
                                                    i11 = i25;
                                                    unsafe2 = unsafe4;
                                                    i12 = i18;
                                                    i2 = i2;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i14 = i19;
                                                    i15 = i53;
                                                    i10 = i54;
                                                }
                                            }
                                            unsafe4 = unsafe3;
                                            i18 = i26;
                                            i20 = i27;
                                            i2 = i2;
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                            break;
                                        } else {
                                            iZzf = zzdu.zzf(bArr, iZzi, zzezVar, zzdtVar4);
                                            iZzh2 = iZzf;
                                            i78 = i78;
                                            i23 = iZzh2;
                                            unsafe4 = unsafe3;
                                            i52 = i27;
                                            i2 = i2;
                                            i24 = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            i78 = i78;
                                            i18 = i26;
                                            i53 = i21;
                                            iZzi = i24;
                                            iZzg = i23;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i26 = i59;
                                        i27 = i75;
                                        i21 = i77;
                                        i78 = i78;
                                        i22 = i76;
                                        unsafe3 = unsafe4;
                                        if (i61 != 2) {
                                            if (i61 == 1) {
                                                zzfm zzfmVar3 = (zzfm) zzezVar;
                                                zzfmVar3.zze(zzdu.zzn(bArr, iZzi));
                                                iZzf = iZzi + 8;
                                                while (iZzf < i2) {
                                                    int iZzh8 = zzdu.zzh(bArr, iZzf, zzdtVar4);
                                                    if (i21 == zzdtVar4.zza) {
                                                        zzfmVar3.zze(zzdu.zzn(bArr, iZzh8));
                                                        iZzf = iZzh8 + 8;
                                                    }
                                                }
                                            }
                                            unsafe4 = unsafe3;
                                            i18 = i26;
                                            i20 = i27;
                                            i2 = i2;
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            zzfm zzfmVar4 = (zzfm) zzezVar;
                                            iZzf = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                            int i82 = zzdtVar4.zza + iZzf;
                                            while (iZzf < i82) {
                                                zzfmVar4.zze(zzdu.zzn(bArr, iZzf));
                                                iZzf += 8;
                                            }
                                            if (iZzf != i82) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        iZzh2 = iZzf;
                                        i78 = i78;
                                        i23 = iZzh2;
                                        unsafe4 = unsafe3;
                                        i52 = i27;
                                        i2 = i2;
                                        i24 = iZzi;
                                        i54 = i22;
                                        i25 = i78;
                                        i78 = i78;
                                        i18 = i26;
                                        i53 = i21;
                                        iZzi = i24;
                                        iZzg = i23;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i26 = i59;
                                        i27 = i75;
                                        i21 = i77;
                                        i78 = i78;
                                        i22 = i76;
                                        unsafe3 = unsafe4;
                                        if (i61 != 2) {
                                            if (i61 == 5) {
                                                zzew zzewVar = (zzew) zzezVar;
                                                zzewVar.zze(zzdu.zzb(bArr, iZzi));
                                                iZzf = iZzi + 4;
                                                while (iZzf < i2) {
                                                    int iZzh9 = zzdu.zzh(bArr, iZzf, zzdtVar4);
                                                    if (i21 == zzdtVar4.zza) {
                                                        zzewVar.zze(zzdu.zzb(bArr, iZzh9));
                                                        iZzf = iZzh9 + 4;
                                                    }
                                                }
                                            }
                                            unsafe4 = unsafe3;
                                            i18 = i26;
                                            i20 = i27;
                                            i2 = i2;
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            zzew zzewVar2 = (zzew) zzezVar;
                                            iZzf = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                            int i83 = zzdtVar4.zza + iZzf;
                                            while (iZzf < i83) {
                                                zzewVar2.zze(zzdu.zzb(bArr, iZzf));
                                                iZzf += 4;
                                            }
                                            if (iZzf != i83) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        iZzh2 = iZzf;
                                        i78 = i78;
                                        i23 = iZzh2;
                                        unsafe4 = unsafe3;
                                        i52 = i27;
                                        i2 = i2;
                                        i24 = iZzi;
                                        i54 = i22;
                                        i25 = i78;
                                        i78 = i78;
                                        i18 = i26;
                                        i53 = i21;
                                        iZzi = i24;
                                        iZzg = i23;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i26 = i59;
                                        i27 = i75;
                                        i21 = i77;
                                        i78 = i78;
                                        i22 = i76;
                                        unsafe3 = unsafe4;
                                        if (i61 != 2) {
                                            if (i61 == 0) {
                                                zzdv zzdvVar = (zzdv) zzezVar;
                                                iZzf = zzdu.zzk(bArr, iZzi, zzdtVar4);
                                                zzdvVar.zze(zzdtVar4.zzb != 0);
                                                while (iZzf < i2) {
                                                    int iZzh10 = zzdu.zzh(bArr, iZzf, zzdtVar4);
                                                    if (i21 == zzdtVar4.zza) {
                                                        iZzf = zzdu.zzk(bArr, iZzh10, zzdtVar4);
                                                        zzdvVar.zze(zzdtVar4.zzb != 0);
                                                    }
                                                }
                                            }
                                            unsafe4 = unsafe3;
                                            i18 = i26;
                                            i20 = i27;
                                            i2 = i2;
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            zzdv zzdvVar2 = (zzdv) zzezVar;
                                            iZzf = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                            int i84 = zzdtVar4.zza + iZzf;
                                            while (iZzf < i84) {
                                                iZzf = zzdu.zzk(bArr, iZzf, zzdtVar4);
                                                zzdvVar2.zze(zzdtVar4.zzb != 0);
                                            }
                                            if (iZzf != i84) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        iZzh2 = iZzf;
                                        i78 = i78;
                                        i23 = iZzh2;
                                        unsafe4 = unsafe3;
                                        i52 = i27;
                                        i2 = i2;
                                        i24 = iZzi;
                                        i54 = i22;
                                        i25 = i78;
                                        i78 = i78;
                                        i18 = i26;
                                        i53 = i21;
                                        iZzi = i24;
                                        iZzg = i23;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                    case 26:
                                        i26 = i59;
                                        i27 = i75;
                                        i21 = i77;
                                        i78 = i78;
                                        i22 = i76;
                                        unsafe3 = unsafe4;
                                        if (i61 == 2) {
                                            if ((j2 & 536870912) == 0) {
                                                int iZzh11 = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                                int i85 = zzdtVar4.zza;
                                                if (i85 < 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i85 == 0) {
                                                    obj2 = "";
                                                    zzezVar.add(obj2);
                                                } else {
                                                    obj2 = r3;
                                                    zzezVar.add(new String(bArr, iZzh11, i85, zzfa.zzb));
                                                    iZzh11 += i85;
                                                }
                                                while (true) {
                                                    int i86 = iZzh11;
                                                    i28 = iZzi;
                                                    iZzh2 = i86;
                                                    while (true) {
                                                        if (iZzh2 < i2) {
                                                            int iZzh12 = zzdu.zzh(bArr, iZzh2, zzdtVar4);
                                                            if (i21 == zzdtVar4.zza) {
                                                                iZzh2 = zzdu.zzh(bArr, iZzh12, zzdtVar4);
                                                                int i87 = zzdtVar4.zza;
                                                                if (i87 < 0) {
                                                                    throw zzfb.zzc();
                                                                }
                                                                if (i87 == 0) {
                                                                    zzezVar.add(obj2);
                                                                } else {
                                                                    zzezVar.add(new String(bArr, iZzh2, i87, zzfa.zzb));
                                                                    iZzi = i28;
                                                                    iZzh11 = iZzh2 + i87;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                iZzi = i28;
                                            } else {
                                                int iZzh13 = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                                int i88 = zzdtVar4.zza;
                                                if (i88 < 0) {
                                                    throw zzfb.zzc();
                                                }
                                                if (i88 == 0) {
                                                    zzezVar.add(r3);
                                                    iZzh3 = iZzh13;
                                                } else {
                                                    iZzh3 = iZzh13 + i88;
                                                    if (!zzhn.zzc(bArr, iZzh13, iZzh3)) {
                                                        throw zzfb.zzb();
                                                    }
                                                    zzezVar.add(new String(bArr, iZzh13, i88, zzfa.zzb));
                                                }
                                                while (iZzh3 < i2) {
                                                    int iZzh14 = zzdu.zzh(bArr, iZzh3, zzdtVar4);
                                                    if (i21 == zzdtVar4.zza) {
                                                        iZzh3 = zzdu.zzh(bArr, iZzh14, zzdtVar4);
                                                        int i89 = zzdtVar4.zza;
                                                        if (i89 < 0) {
                                                            throw zzfb.zzc();
                                                        }
                                                        if (i89 == 0) {
                                                            zzezVar.add(r3);
                                                        } else {
                                                            int i90 = iZzh3 + i89;
                                                            if (!zzhn.zzc(bArr, iZzh3, i90)) {
                                                                throw zzfb.zzb();
                                                            }
                                                            zzezVar.add(new String(bArr, iZzh3, i89, zzfa.zzb));
                                                            iZzh3 = i90;
                                                        }
                                                    } else {
                                                        iZzh2 = iZzh3;
                                                        i78 = i78;
                                                    }
                                                }
                                                iZzh2 = iZzh3;
                                                i78 = i78;
                                            }
                                            i23 = iZzh2;
                                            unsafe4 = unsafe3;
                                            i52 = i27;
                                            i2 = i2;
                                            i24 = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            i78 = i78;
                                            i18 = i26;
                                            i53 = i21;
                                            iZzi = i24;
                                            iZzg = i23;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        }
                                        unsafe4 = unsafe3;
                                        i18 = i26;
                                        i20 = i27;
                                        i2 = i2;
                                        i53 = i21;
                                        i52 = i20;
                                        iZzg = iZzi;
                                        i54 = i22;
                                        i25 = i78;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                    case 27:
                                        iZzi = iZzi;
                                        i29 = i75;
                                        i78 = i78;
                                        i22 = i76;
                                        if (i61 == 2) {
                                            i24 = iZzi;
                                            int iZze = zzdu.zze(zzgaVar.zzr(i29), i77, bArr, iZzi, i2, zzezVar, zzdtVar);
                                            zzdtVar4 = zzdtVar4;
                                            i18 = i59;
                                            i2 = i2;
                                            i53 = i77;
                                            i23 = iZze;
                                            i25 = i78;
                                            unsafe4 = unsafe4;
                                            i52 = i29;
                                            i54 = i22;
                                            iZzi = i24;
                                            iZzg = i23;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            i21 = i77;
                                            i2 = i2;
                                            i20 = i29;
                                            i18 = i59;
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        }
                                        break;
                                    case 28:
                                        iZzi = iZzi;
                                        i29 = i75;
                                        i78 = i78;
                                        i22 = i76;
                                        if (i61 == 2) {
                                            iZzh2 = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                            int i91 = zzdtVar4.zza;
                                            if (i91 < 0) {
                                                throw zzfb.zzc();
                                            }
                                            if (i91 > bArr.length - iZzh2) {
                                                throw zzfb.zzf();
                                            }
                                            if (i91 == 0) {
                                                zzezVar.add(zzef.zzb);
                                            } else {
                                                zzezVar.add(zzef.zzk(bArr, iZzh2, i91));
                                                iZzh2 += i91;
                                            }
                                            while (iZzh2 < i2) {
                                                int iZzh15 = zzdu.zzh(bArr, iZzh2, zzdtVar4);
                                                if (i77 != zzdtVar4.zza) {
                                                    i22 = i22;
                                                    i26 = i59;
                                                    i78 = i78;
                                                    i21 = i77;
                                                    i27 = i29;
                                                    i78 = i78;
                                                    i2 = i2;
                                                    unsafe3 = unsafe4;
                                                    i23 = iZzh2;
                                                    unsafe4 = unsafe3;
                                                    i52 = i27;
                                                    i2 = i2;
                                                    i24 = iZzi;
                                                    i54 = i22;
                                                    i25 = i78;
                                                    i78 = i78;
                                                    i18 = i26;
                                                    i53 = i21;
                                                    iZzi = i24;
                                                    iZzg = i23;
                                                    if (iZzg != iZzi) {
                                                        i56 = i78;
                                                        obj3 = obj;
                                                        i50 = i3;
                                                        unsafe4 = unsafe4;
                                                        i55 = i18;
                                                        i51 = i13;
                                                    } else {
                                                        obj3 = obj;
                                                        i19 = i52;
                                                        i11 = i25;
                                                        unsafe2 = unsafe4;
                                                        i12 = i18;
                                                        i2 = i2;
                                                        i4 = i3;
                                                        i9 = iZzg;
                                                        i14 = i19;
                                                        i15 = i53;
                                                        i10 = i54;
                                                    }
                                                    break;
                                                } else {
                                                    iZzh2 = zzdu.zzh(bArr, iZzh15, zzdtVar4);
                                                    int i92 = zzdtVar4.zza;
                                                    if (i92 < 0) {
                                                        throw zzfb.zzc();
                                                    }
                                                    if (i92 > bArr.length - iZzh2) {
                                                        throw zzfb.zzf();
                                                    }
                                                    if (i92 == 0) {
                                                        zzezVar.add(zzef.zzb);
                                                    } else {
                                                        zzezVar.add(zzef.zzk(bArr, iZzh2, i92));
                                                        iZzh2 += i92;
                                                    }
                                                }
                                            }
                                            i22 = i22;
                                            i26 = i59;
                                            i78 = i78;
                                            i21 = i77;
                                            i27 = i29;
                                            i78 = i78;
                                            i2 = i2;
                                            unsafe3 = unsafe4;
                                            i23 = iZzh2;
                                            unsafe4 = unsafe3;
                                            i52 = i27;
                                            i2 = i2;
                                            i24 = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            i78 = i78;
                                            i18 = i26;
                                            i53 = i21;
                                            iZzi = i24;
                                            iZzg = i23;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            i2 = i2;
                                            i21 = i77;
                                            i20 = i29;
                                            i18 = i59;
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        int i93 = i77;
                                        if (i61 == 2) {
                                            iZzj = zzdu.zzf(bArr, iZzi, zzezVar, zzdtVar4);
                                            iZzi = iZzi;
                                        } else if (i61 != 0) {
                                            i29 = i75;
                                            i78 = i78;
                                            i22 = i76;
                                            iZzi = iZzi;
                                            i21 = i93;
                                            i2 = i2;
                                            i20 = i29;
                                            i18 = i59;
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            iZzi = iZzi;
                                            iZzj = zzdu.zzj(i93, bArr, iZzi, i2, zzezVar, zzdtVar);
                                        }
                                        zzey zzeyVarZzq2 = zzgaVar.zzq(r17);
                                        zzgz zzgzVar = zzgaVar.zzl;
                                        int i94 = zzgk.zza;
                                        if (zzeyVarZzq2 == null) {
                                            i30 = iZzj;
                                            i31 = i93;
                                        } else if (zzezVar instanceof RandomAccess) {
                                            int size2 = zzezVar.size();
                                            i30 = iZzj;
                                            Object objZzc = null;
                                            int i95 = 0;
                                            int i96 = 0;
                                            while (i95 < size2) {
                                                int i97 = i93;
                                                int iIntValue = ((Integer) zzezVar.get(i95)).intValue();
                                                if (zzeyVarZzq2.zza()) {
                                                    if (i95 != i96) {
                                                        zzezVar.set(i96, Integer.valueOf(iIntValue));
                                                    }
                                                    i96++;
                                                } else {
                                                    objZzc = zzgk.zzc(obj3, i59, iIntValue, objZzc, zzgzVar);
                                                }
                                                i95++;
                                                i93 = i97;
                                            }
                                            i31 = i93;
                                            if (i96 != size2) {
                                                zzezVar.subList(i96, size2).clear();
                                            }
                                        } else {
                                            i30 = iZzj;
                                            i31 = i93;
                                            Iterator it = zzezVar.iterator();
                                            Object objZzc2 = null;
                                            while (it.hasNext()) {
                                                int iIntValue2 = ((Integer) it.next()).intValue();
                                                if (!zzeyVarZzq2.zza()) {
                                                    objZzc2 = zzgk.zzc(obj3, i59, iIntValue2, objZzc2, zzgzVar);
                                                    it.remove();
                                                }
                                            }
                                        }
                                        iZzg = i30;
                                        i2 = i2;
                                        i52 = i75;
                                        i18 = i59;
                                        i54 = i76;
                                        i25 = i78;
                                        i53 = i31;
                                        unsafe4 = unsafe4;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i32 = i77;
                                        if (i61 != 2) {
                                            if (i61 == 0) {
                                                zzew zzewVar3 = (zzew) zzezVar;
                                                iZzh4 = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                                zzewVar3.zze(zzej.zzb(zzdtVar4.zza));
                                                while (iZzh4 < i2) {
                                                    int iZzh16 = zzdu.zzh(bArr, iZzh4, zzdtVar4);
                                                    if (i32 == zzdtVar4.zza) {
                                                        iZzh4 = zzdu.zzh(bArr, iZzh16, zzdtVar4);
                                                        zzewVar3.zze(zzej.zzb(zzdtVar4.zza));
                                                    }
                                                }
                                            }
                                            i18 = i59;
                                            i21 = i32;
                                            i20 = i75;
                                            i78 = i78;
                                            i22 = i76;
                                            unsafe4 = unsafe4;
                                            i2 = i2;
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            zzew zzewVar4 = (zzew) zzezVar;
                                            iZzh4 = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                            int i98 = zzdtVar4.zza + iZzh4;
                                            while (iZzh4 < i98) {
                                                iZzh4 = zzdu.zzh(bArr, iZzh4, zzdtVar4);
                                                zzewVar4.zze(zzej.zzb(zzdtVar4.zza));
                                            }
                                            if (iZzh4 != i98) {
                                                throw zzfb.zzf();
                                            }
                                        }
                                        iZzi = iZzi;
                                        iZzg = iZzh4;
                                        i18 = i59;
                                        i53 = i32;
                                        i52 = i75;
                                        i78 = i78;
                                        i54 = i76;
                                        unsafe4 = unsafe4;
                                        i2 = i2;
                                        i25 = i78;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        if (i61 == 2) {
                                            zzfm zzfmVar5 = (zzfm) zzezVar;
                                            iZzh4 = zzdu.zzh(bArr, iZzi, zzdtVar4);
                                            int i99 = zzdtVar4.zza + iZzh4;
                                            while (iZzh4 < i99) {
                                                iZzh4 = zzdu.zzk(bArr, iZzh4, zzdtVar4);
                                                zzfmVar5.zze(zzej.zzc(zzdtVar4.zzb));
                                            }
                                            if (iZzh4 != i99) {
                                                throw zzfb.zzf();
                                            }
                                        } else if (i61 == 0) {
                                            zzfm zzfmVar6 = (zzfm) zzezVar;
                                            iZzh4 = zzdu.zzk(bArr, iZzi, zzdtVar4);
                                            zzfmVar6.zze(zzej.zzc(zzdtVar4.zzb));
                                            while (true) {
                                                if (iZzh4 < i2) {
                                                    int iZzh17 = zzdu.zzh(bArr, iZzh4, zzdtVar4);
                                                    i32 = i77;
                                                    if (i32 == zzdtVar4.zza) {
                                                        iZzh4 = zzdu.zzk(bArr, iZzh17, zzdtVar4);
                                                        zzfmVar6.zze(zzej.zzc(zzdtVar4.zzb));
                                                        i77 = i32;
                                                    }
                                                }
                                            }
                                            iZzi = iZzi;
                                            iZzg = iZzh4;
                                            i18 = i59;
                                            i53 = i32;
                                            i52 = i75;
                                            i78 = i78;
                                            i54 = i76;
                                            unsafe4 = unsafe4;
                                            i2 = i2;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        } else {
                                            i32 = i77;
                                            i18 = i59;
                                            i21 = i32;
                                            i20 = i75;
                                            i78 = i78;
                                            i22 = i76;
                                            unsafe4 = unsafe4;
                                            i2 = i2;
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                            i54 = i22;
                                            i25 = i78;
                                            if (iZzg != iZzi) {
                                                i56 = i78;
                                                obj3 = obj;
                                                i50 = i3;
                                                unsafe4 = unsafe4;
                                                i55 = i18;
                                                i51 = i13;
                                            } else {
                                                obj3 = obj;
                                                i19 = i52;
                                                i11 = i25;
                                                unsafe2 = unsafe4;
                                                i12 = i18;
                                                i2 = i2;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i14 = i19;
                                                i15 = i53;
                                                i10 = i54;
                                            }
                                        }
                                        i32 = i77;
                                        iZzi = iZzi;
                                        iZzg = iZzh4;
                                        i18 = i59;
                                        i53 = i32;
                                        i52 = i75;
                                        i78 = i78;
                                        i54 = i76;
                                        unsafe4 = unsafe4;
                                        i2 = i2;
                                        i25 = i78;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                    default:
                                        iZzi = iZzi;
                                        i2 = i2;
                                        i18 = i59;
                                        i20 = i75;
                                        i21 = i77;
                                        i78 = i78;
                                        i22 = i76;
                                        unsafe4 = unsafe4;
                                        if (i61 == 3) {
                                            zzgi zzgiVarZzr = zzgaVar.zzr(i20);
                                            int i100 = (i21 & (-8)) | 4;
                                            iZzg = zzdu.zzc(zzgiVarZzr, bArr, iZzi, i2, i100, zzdtVar);
                                            zzezVar.add(zzdtVar4.zzc);
                                            while (iZzg < i2) {
                                                int iZzh18 = zzdu.zzh(bArr, iZzg, zzdtVar4);
                                                if (i21 == zzdtVar4.zza) {
                                                    iZzg = zzdu.zzc(zzgiVarZzr, bArr, iZzh18, i2, i100, zzdtVar);
                                                    zzezVar.add(zzdtVar4.zzc);
                                                } else {
                                                    i53 = i21;
                                                    i52 = i20;
                                                }
                                            }
                                            i53 = i21;
                                            i52 = i20;
                                        } else {
                                            i53 = i21;
                                            i52 = i20;
                                            iZzg = iZzi;
                                        }
                                        i54 = i22;
                                        i25 = i78;
                                        if (iZzg != iZzi) {
                                            i56 = i78;
                                            obj3 = obj;
                                            i50 = i3;
                                            unsafe4 = unsafe4;
                                            i55 = i18;
                                            i51 = i13;
                                        } else {
                                            obj3 = obj;
                                            i19 = i52;
                                            i11 = i25;
                                            unsafe2 = unsafe4;
                                            i12 = i18;
                                            i2 = i2;
                                            i4 = i3;
                                            i9 = iZzg;
                                            i14 = i19;
                                            i15 = i53;
                                            i10 = i54;
                                        }
                                        break;
                                }
                            } else {
                                unsafe2 = unsafe4;
                                i11 = i78;
                                i10 = i76;
                                i17 = iZzi;
                                i14 = i75;
                                i12 = i59;
                                if (iZzn != 50) {
                                    i33 = i77;
                                    Unsafe unsafe6 = zzb;
                                    long j3 = iArr[i14 + 2] & 1048575;
                                    switch (iZzn) {
                                        case 51:
                                            i14 = i14;
                                            i34 = i17;
                                            i33 = i33;
                                            zzdtVar2 = zzdtVar4;
                                            obj3 = obj;
                                            i2 = i2;
                                            if (i61 == 1) {
                                                unsafe6.putObject(obj3, j, Double.valueOf(Double.longBitsToDouble(zzdu.zzn(bArr, i34))));
                                                iZzg = i34 + 8;
                                                unsafe6.putInt(obj3, j3, i12);
                                            } else {
                                                iZzg = i34;
                                            }
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 52:
                                            i14 = i14;
                                            i34 = i17;
                                            i33 = i33;
                                            zzdtVar2 = zzdtVar4;
                                            obj3 = obj;
                                            i2 = i2;
                                            if (i61 == 5) {
                                                unsafe6.putObject(obj3, j, Float.valueOf(Float.intBitsToFloat(zzdu.zzb(bArr, i34))));
                                                iZzg = i34 + 4;
                                                unsafe6.putInt(obj3, j3, i12);
                                            } else {
                                                iZzg = i34;
                                            }
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            i14 = i14;
                                            i34 = i17;
                                            i33 = i33;
                                            zzdtVar2 = zzdtVar4;
                                            obj3 = obj;
                                            i2 = i2;
                                            if (i61 == 0) {
                                                iZzk = zzdu.zzk(bArr, i34, zzdtVar2);
                                                unsafe6.putObject(obj3, j, Long.valueOf(zzdtVar2.zzb));
                                                unsafe6.putInt(obj3, j3, i12);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i34;
                                            }
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            i14 = i14;
                                            i34 = i17;
                                            i33 = i33;
                                            zzdtVar2 = zzdtVar4;
                                            obj3 = obj;
                                            i2 = i2;
                                            if (i61 == 0) {
                                                iZzk = zzdu.zzh(bArr, i34, zzdtVar2);
                                                unsafe6.putObject(obj3, j, Integer.valueOf(zzdtVar2.zza));
                                                unsafe6.putInt(obj3, j3, i12);
                                                iZzg = iZzk;
                                            } else {
                                                iZzg = i34;
                                            }
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            i14 = i14;
                                            i34 = i17;
                                            i33 = i33;
                                            zzdtVar2 = zzdtVar4;
                                            obj3 = obj;
                                            i2 = i2;
                                            if (i61 == 1) {
                                                unsafe6.putObject(obj3, j, Long.valueOf(zzdu.zzn(bArr, i34)));
                                                iZzg = i34 + 8;
                                                unsafe6.putInt(obj3, j3, i12);
                                            } else {
                                                iZzg = i34;
                                            }
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            i14 = i14;
                                            i34 = i17;
                                            i33 = i33;
                                            zzdtVar2 = zzdtVar4;
                                            obj3 = obj;
                                            i2 = i2;
                                            if (i61 == 5) {
                                                unsafe6.putObject(obj3, j, Integer.valueOf(zzdu.zzb(bArr, i34)));
                                                iZzg = i34 + 4;
                                                unsafe6.putInt(obj3, j3, i12);
                                            } else {
                                                iZzg = i34;
                                            }
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 58:
                                            i14 = i14;
                                            i35 = i17;
                                            i33 = i33;
                                            zzdtVar2 = zzdtVar4;
                                            obj3 = obj;
                                            i2 = i2;
                                            if (i61 == 0) {
                                                iZzk2 = zzdu.zzk(bArr, i35, zzdtVar2);
                                                i34 = i35;
                                                unsafe6.putObject(obj3, j, Boolean.valueOf(zzdtVar2.zzb != 0));
                                                unsafe6.putInt(obj3, j3, i12);
                                                iZzg = iZzk2;
                                                if (iZzg != i34) {
                                                    i12 = i12;
                                                    i37 = i11;
                                                    zzgaVar = this;
                                                    i50 = i3;
                                                    i55 = i12;
                                                    zzdtVar4 = zzdtVar2;
                                                    i2 = i2;
                                                    i54 = i10;
                                                    i51 = i13;
                                                    i53 = i33;
                                                    i52 = i14;
                                                    unsafe4 = unsafe2;
                                                    i56 = i37;
                                                } else {
                                                    i12 = i12;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i15 = i33;
                                                }
                                            }
                                            i34 = i35;
                                            iZzg = i34;
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 59:
                                            i14 = i14;
                                            i35 = i17;
                                            i33 = i33;
                                            zzdtVar2 = zzdtVar4;
                                            obj3 = obj;
                                            i2 = i2;
                                            if (i61 == 2) {
                                                iZzk2 = zzdu.zzh(bArr, i35, zzdtVar2);
                                                int i101 = zzdtVar2.zza;
                                                if (i101 == 0) {
                                                    unsafe6.putObject(obj3, j, "");
                                                } else {
                                                    if ((i62 & 536870912) != 0 && !zzhn.zzc(bArr, iZzk2, iZzk2 + i101)) {
                                                        throw zzfb.zzb();
                                                    }
                                                    unsafe6.putObject(obj3, j, new String(bArr, iZzk2, i101, zzfa.zzb));
                                                    iZzk2 += i101;
                                                }
                                                unsafe6.putInt(obj3, j3, i12);
                                                i34 = i35;
                                                iZzg = iZzk2;
                                                if (iZzg != i34) {
                                                    i12 = i12;
                                                    i37 = i11;
                                                    zzgaVar = this;
                                                    i50 = i3;
                                                    i55 = i12;
                                                    zzdtVar4 = zzdtVar2;
                                                    i2 = i2;
                                                    i54 = i10;
                                                    i51 = i13;
                                                    i53 = i33;
                                                    i52 = i14;
                                                    unsafe4 = unsafe2;
                                                    i56 = i37;
                                                } else {
                                                    i12 = i12;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i15 = i33;
                                                }
                                            }
                                            i34 = i35;
                                            iZzg = i34;
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 60:
                                            obj3 = obj;
                                            i36 = i17;
                                            zzdtVar3 = zzdtVar4;
                                            if (i61 == 2) {
                                                Object objZzu = zzgaVar.zzu(obj3, i12, i14);
                                                i33 = i33;
                                                iZzg = zzdu.zzm(objZzu, zzgaVar.zzr(i14), bArr, i36, i2, zzdtVar);
                                                zzgaVar.zzC(obj3, i12, i14, objZzu);
                                                i14 = i14;
                                                zzdtVar2 = zzdtVar3;
                                                i2 = i2;
                                                i34 = i36;
                                            } else {
                                                zzdtVar2 = zzdtVar3;
                                                i34 = i36;
                                                i2 = i2;
                                                iZzg = i34;
                                            }
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 61:
                                            zzdtVar3 = zzdtVar4;
                                            obj3 = obj;
                                            i36 = i17;
                                            if (i61 == 2) {
                                                iZza = zzdu.zza(bArr, i36, zzdtVar3);
                                                unsafe6.putObject(obj3, j, zzdtVar3.zzc);
                                                unsafe6.putInt(obj3, j3, i12);
                                                i14 = i14;
                                                iZzg = iZza;
                                                i33 = i33;
                                                zzdtVar2 = zzdtVar3;
                                                i34 = i36;
                                                i2 = i2;
                                                if (iZzg != i34) {
                                                    i12 = i12;
                                                    i37 = i11;
                                                    zzgaVar = this;
                                                    i50 = i3;
                                                    i55 = i12;
                                                    zzdtVar4 = zzdtVar2;
                                                    i2 = i2;
                                                    i54 = i10;
                                                    i51 = i13;
                                                    i53 = i33;
                                                    i52 = i14;
                                                    unsafe4 = unsafe2;
                                                    i56 = i37;
                                                } else {
                                                    i12 = i12;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i15 = i33;
                                                }
                                            }
                                            zzdtVar2 = zzdtVar3;
                                            i34 = i36;
                                            i2 = i2;
                                            iZzg = i34;
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 63:
                                            zzdtVar3 = zzdtVar4;
                                            obj3 = obj;
                                            i36 = i17;
                                            if (i61 == 0) {
                                                iZza = zzdu.zzh(bArr, i36, zzdtVar3);
                                                int i102 = zzdtVar3.zza;
                                                zzey zzeyVarZzq3 = zzgaVar.zzq(i14);
                                                if (zzeyVarZzq3 == null || zzeyVarZzq3.zza()) {
                                                    unsafe6.putObject(obj3, j, Integer.valueOf(i102));
                                                    unsafe6.putInt(obj3, j3, i12);
                                                } else {
                                                    zzc(obj).zzh(i33, Long.valueOf(i102));
                                                }
                                                i14 = i14;
                                                iZzg = iZza;
                                                i33 = i33;
                                                zzdtVar2 = zzdtVar3;
                                                i34 = i36;
                                                i2 = i2;
                                                if (iZzg != i34) {
                                                    i12 = i12;
                                                    i37 = i11;
                                                    zzgaVar = this;
                                                    i50 = i3;
                                                    i55 = i12;
                                                    zzdtVar4 = zzdtVar2;
                                                    i2 = i2;
                                                    i54 = i10;
                                                    i51 = i13;
                                                    i53 = i33;
                                                    i52 = i14;
                                                    unsafe4 = unsafe2;
                                                    i56 = i37;
                                                } else {
                                                    i12 = i12;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i15 = i33;
                                                }
                                            }
                                            zzdtVar2 = zzdtVar3;
                                            i34 = i36;
                                            i2 = i2;
                                            iZzg = i34;
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 66:
                                            zzdtVar3 = zzdtVar4;
                                            obj3 = obj;
                                            i36 = i17;
                                            if (i61 == 0) {
                                                iZza = zzdu.zzh(bArr, i36, zzdtVar3);
                                                unsafe6.putObject(obj3, j, Integer.valueOf(zzej.zzb(zzdtVar3.zza)));
                                                unsafe6.putInt(obj3, j3, i12);
                                                i14 = i14;
                                                iZzg = iZza;
                                                i33 = i33;
                                                zzdtVar2 = zzdtVar3;
                                                i34 = i36;
                                                i2 = i2;
                                                if (iZzg != i34) {
                                                    i12 = i12;
                                                    i37 = i11;
                                                    zzgaVar = this;
                                                    i50 = i3;
                                                    i55 = i12;
                                                    zzdtVar4 = zzdtVar2;
                                                    i2 = i2;
                                                    i54 = i10;
                                                    i51 = i13;
                                                    i53 = i33;
                                                    i52 = i14;
                                                    unsafe4 = unsafe2;
                                                    i56 = i37;
                                                } else {
                                                    i12 = i12;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i15 = i33;
                                                }
                                            }
                                            zzdtVar2 = zzdtVar3;
                                            i34 = i36;
                                            i2 = i2;
                                            iZzg = i34;
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 67:
                                            zzdtVar3 = zzdtVar4;
                                            obj3 = obj;
                                            i36 = i17;
                                            if (i61 == 0) {
                                                iZza = zzdu.zzk(bArr, i36, zzdtVar3);
                                                unsafe6.putObject(obj3, j, Long.valueOf(zzej.zzc(zzdtVar3.zzb)));
                                                unsafe6.putInt(obj3, j3, i12);
                                                i14 = i14;
                                                iZzg = iZza;
                                                i33 = i33;
                                                zzdtVar2 = zzdtVar3;
                                                i34 = i36;
                                                i2 = i2;
                                                if (iZzg != i34) {
                                                    i12 = i12;
                                                    i37 = i11;
                                                    zzgaVar = this;
                                                    i50 = i3;
                                                    i55 = i12;
                                                    zzdtVar4 = zzdtVar2;
                                                    i2 = i2;
                                                    i54 = i10;
                                                    i51 = i13;
                                                    i53 = i33;
                                                    i52 = i14;
                                                    unsafe4 = unsafe2;
                                                    i56 = i37;
                                                } else {
                                                    i12 = i12;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i15 = i33;
                                                }
                                            }
                                            zzdtVar2 = zzdtVar3;
                                            i34 = i36;
                                            i2 = i2;
                                            iZzg = i34;
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                        case 68:
                                            if (i61 == 3) {
                                                obj3 = obj;
                                                Object objZzu2 = zzgaVar.zzu(obj3, i12, i14);
                                                i36 = i17;
                                                zzdtVar3 = zzdtVar4;
                                                int iZzl2 = zzdu.zzl(objZzu2, zzgaVar.zzr(i14), bArr, i17, i2, (i33 & (-8)) | 4, zzdtVar);
                                                zzgaVar.zzC(obj3, i12, i14, objZzu2);
                                                iZza = iZzl2;
                                                i14 = i14;
                                                iZzg = iZza;
                                                i33 = i33;
                                                zzdtVar2 = zzdtVar3;
                                                i34 = i36;
                                                i2 = i2;
                                                if (iZzg != i34) {
                                                    i12 = i12;
                                                    i37 = i11;
                                                    zzgaVar = this;
                                                    i50 = i3;
                                                    i55 = i12;
                                                    zzdtVar4 = zzdtVar2;
                                                    i2 = i2;
                                                    i54 = i10;
                                                    i51 = i13;
                                                    i53 = i33;
                                                    i52 = i14;
                                                    unsafe4 = unsafe2;
                                                    i56 = i37;
                                                } else {
                                                    i12 = i12;
                                                    i4 = i3;
                                                    i9 = iZzg;
                                                    i15 = i33;
                                                }
                                                break;
                                            }
                                        default:
                                            obj3 = obj;
                                            i2 = i2;
                                            i14 = i14;
                                            i33 = i33;
                                            i34 = i17;
                                            zzdtVar2 = zzdtVar4;
                                            iZzg = i34;
                                            if (iZzg != i34) {
                                                i12 = i12;
                                                i37 = i11;
                                                zzgaVar = this;
                                                i50 = i3;
                                                i55 = i12;
                                                zzdtVar4 = zzdtVar2;
                                                i2 = i2;
                                                i54 = i10;
                                                i51 = i13;
                                                i53 = i33;
                                                i52 = i14;
                                                unsafe4 = unsafe2;
                                                i56 = i37;
                                            } else {
                                                i12 = i12;
                                                i4 = i3;
                                                i9 = iZzg;
                                                i15 = i33;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i61 == 2) {
                                        Unsafe unsafe7 = zzb;
                                        Object objZzs = zzgaVar.zzs(i14);
                                        Object object = unsafe7.getObject(obj, j);
                                        if (!((zzfr) object).zze()) {
                                            zzfr zzfrVarZzb = zzfr.zza().zzb();
                                            zzfs.zza(zzfrVarZzb, object);
                                            unsafe7.putObject(obj, j, zzfrVarZzb);
                                        }
                                        throw null;
                                    }
                                    i16 = i77;
                                    obj3 = obj;
                                    i19 = i14;
                                    i53 = i16;
                                    iZzg = i17;
                                    i54 = i10;
                                    i4 = i3;
                                    i9 = iZzg;
                                    i14 = i19;
                                    i15 = i53;
                                    i10 = i54;
                                }
                            }
                        } else if (i61 == 2) {
                            zzez zzezVarZzd2 = (zzez) unsafe4.getObject(obj3, j);
                            if (!zzezVarZzd2.zzc()) {
                                int size3 = zzezVarZzd2.size();
                                zzezVarZzd2 = zzezVarZzd2.zzd(size3 != 0 ? size3 + size3 : 10);
                                unsafe4.putObject(obj3, j, zzezVarZzd2);
                            }
                            iZzg = zzdu.zze(zzgaVar.zzr(i75), i77, bArr, iZzi, i2, zzezVarZzd2, zzdtVar);
                            i18 = i59;
                            unsafe4 = unsafe4;
                            zzdtVar4 = zzdtVar4;
                            i52 = i75;
                            i2 = i2;
                            i53 = i77;
                            i56 = i78;
                            i54 = i76;
                            obj3 = obj;
                            i50 = i3;
                            unsafe4 = unsafe4;
                            i55 = i18;
                            i51 = i13;
                        } else {
                            i12 = i59;
                            unsafe2 = unsafe4;
                            i16 = i77;
                            i11 = i78;
                            i10 = i76;
                            i17 = iZzi;
                            i14 = i75;
                            i19 = i14;
                            i53 = i16;
                            iZzg = i17;
                            i54 = i10;
                            i4 = i3;
                            i9 = iZzg;
                            i14 = i19;
                            i15 = i53;
                            i10 = i54;
                        }
                    }
                } else {
                    i9 = iZzi;
                    i10 = i54;
                    i11 = i56;
                    i12 = i59;
                    i13 = i51;
                    i14 = i13;
                    unsafe2 = unsafe4;
                    i4 = i50;
                    i2 = i2;
                    i15 = i6;
                }
                if (i15 != i4 || i4 == 0) {
                    iZzg = zzdu.zzg(i15, bArr, i9, i2, zzc(obj), zzdtVar);
                    zzdtVar4 = zzdtVar;
                    i53 = i15;
                    i50 = i4;
                    i2 = i2;
                    i55 = i12;
                    i54 = i10;
                    i51 = i13;
                    i56 = i11;
                    i52 = i14;
                    unsafe4 = unsafe2;
                    zzgaVar = this;
                } else {
                    iZzg = i9;
                    i5 = i2;
                    i53 = i15;
                    i54 = i10;
                    i56 = i11;
                    unsafe = unsafe2;
                }
            } else {
                unsafe = unsafe4;
                i4 = i50;
                i5 = i2;
            }
        }
        if (i56 != 1048575) {
            unsafe.putInt(obj3, i56, i54);
        }
        for (int i103 = this.zzi; i103 < this.zzj; i103++) {
            int i104 = this.zzh[i103];
            int i105 = this.zzc[i104];
            Object objZzf = zzhj.zzf(obj3, zzo(i104) & 1048575);
            if (objZzf != null && zzq(i104) != null) {
                throw null;
            }
        }
        if (i4 == 0) {
            if (iZzg != i5) {
                throw zzfb.zzd();
            }
        } else if (iZzg > i5 || i53 != i4) {
            throw zzfb.zzd();
        }
        return iZzg;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zze(Object obj) {
        if (zzH(obj)) {
            if (obj instanceof zzev) {
                zzev zzevVar = (zzev) obj;
                zzevVar.zzl(Integer.MAX_VALUE);
                zzevVar.zza = 0;
                zzevVar.zzj();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int iZzo = zzo(i);
                int iZzn = zzn(iZzo);
                long j = iZzo & 1048575;
                if (iZzn != 9) {
                    if (iZzn != 60 && iZzn != 68) {
                        switch (iZzn) {
                            case 17:
                                if (zzE(obj, i)) {
                                    zzr(i).zze(zzb.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzk.zza(obj, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzfr) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzI(obj, this.zzc[i], i)) {
                        zzr(i).zze(zzb.getObject(obj, j));
                    }
                } else if (zzE(obj, i)) {
                    zzr(i).zze(zzb.getObject(obj, j));
                }
            }
            this.zzl.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzf(Object obj, Object obj2) {
        zzw(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzo = zzo(i);
            int i2 = this.zzc[i];
            long j = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (zzE(obj2, i)) {
                        zzhj.zzl(obj, j, zzhj.zza(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 1:
                    if (zzE(obj2, i)) {
                        zzhj.zzm(obj, j, zzhj.zzb(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 2:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 3:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 4:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 5:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 6:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 7:
                    if (zzE(obj2, i)) {
                        zzhj.zzk(obj, j, zzhj.zzt(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 8:
                    if (zzE(obj2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 9:
                    zzx(obj, obj2, i);
                    break;
                case 10:
                    if (zzE(obj2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 11:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 12:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 13:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 14:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 15:
                    if (zzE(obj2, i)) {
                        zzhj.zzn(obj, j, zzhj.zzc(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 16:
                    if (zzE(obj2, i)) {
                        zzhj.zzo(obj, j, zzhj.zzd(obj2, j));
                        zzz(obj, i);
                    }
                    break;
                case 17:
                    zzx(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzk.zzb(obj, obj2, j);
                    break;
                case 50:
                    int i3 = zzgk.zza;
                    zzhj.zzp(obj, j, zzfs.zza(zzhj.zzf(obj, j), zzhj.zzf(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzI(obj2, i2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzA(obj, i2, i);
                    }
                    break;
                case 60:
                    zzy(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzI(obj2, i2, i)) {
                        zzhj.zzp(obj, j, zzhj.zzf(obj2, j));
                        zzA(obj, i2, i);
                    }
                    break;
                case 68:
                    zzy(obj, obj2, i);
                    break;
            }
        }
        zzgk.zzd(this.zzl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i, int i2, zzdt zzdtVar) throws IOException {
        zzb(obj, bArr, i, i2, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        boolean zZzf;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzo = zzo(i);
            long j = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzD(obj, obj2, i) || Double.doubleToLongBits(zzhj.zza(obj, j)) != Double.doubleToLongBits(zzhj.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzD(obj, obj2, i) || Float.floatToIntBits(zzhj.zzb(obj, j)) != Float.floatToIntBits(zzhj.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzD(obj, obj2, i) || zzhj.zzd(obj, j) != zzhj.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzD(obj, obj2, i) || zzhj.zzd(obj, j) != zzhj.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzD(obj, obj2, i) || zzhj.zzc(obj, j) != zzhj.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzD(obj, obj2, i) || zzhj.zzd(obj, j) != zzhj.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzD(obj, obj2, i) || zzhj.zzc(obj, j) != zzhj.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzD(obj, obj2, i) || zzhj.zzt(obj, j) != zzhj.zzt(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzD(obj, obj2, i) || !zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzD(obj, obj2, i) || !zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzD(obj, obj2, i) || !zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzD(obj, obj2, i) || zzhj.zzc(obj, j) != zzhj.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzD(obj, obj2, i) || zzhj.zzc(obj, j) != zzhj.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzD(obj, obj2, i) || zzhj.zzc(obj, j) != zzhj.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzD(obj, obj2, i) || zzhj.zzd(obj, j) != zzhj.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzD(obj, obj2, i) || zzhj.zzc(obj, j) != zzhj.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzD(obj, obj2, i) || zzhj.zzd(obj, j) != zzhj.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzD(obj, obj2, i) || !zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j));
                    break;
                case 50:
                    zZzf = zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jZzl = zzl(i) & 1048575;
                    if (zzhj.zzc(obj, jZzl) != zzhj.zzc(obj2, jZzl) || !zzgk.zzf(zzhj.zzf(obj, j), zzhj.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzf) {
                return false;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009c  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1 A[LOOP:1: B:45:0x00b0->B:50:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00de A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzi(Object obj) {
        int i;
        int i2;
        List list;
        zzgi zzgiVarZzr;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzi) {
            int i7 = this.zzh[i5];
            int i8 = this.zzc[i7];
            int iZzo = zzo(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i2 = i4;
                i = i10;
            } else {
                i = i6;
                i2 = i4;
            }
            if ((268435456 & iZzo) != 0 && !zzF(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzn = zzn(iZzo);
            if (iZzn == 9 || iZzn == 17) {
                if (zzF(obj, i7, i, i2, i11) && !zzG(obj, iZzo, zzr(i7))) {
                    return false;
                }
            } else if (iZzn == 27) {
                list = (List) zzhj.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgiVarZzr = zzr(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzgiVarZzr.zzi(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzn == 60 || iZzn == 68) {
                if (zzI(obj, i8, i7) && !zzG(obj, iZzo, zzr(i7))) {
                    return false;
                }
            } else if (iZzn == 49) {
                list = (List) zzhj.zzf(obj, iZzo & 1048575);
                if (list.isEmpty()) {
                    zzgiVarZzr = zzr(i7);
                    while (i3 < list.size()) {
                        if (!zzgiVarZzr.zzi(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzn == 50 && !((zzfr) zzhj.zzf(obj, iZzo & 1048575)).isEmpty()) {
                throw null;
            }
            i5++;
            i6 = i;
            i4 = i2;
        }
        return true;
    }

    private zzga(int[] iArr, Object[] objArr, int i, int i2, zzfx zzfxVar, int i3, boolean z, int[] iArr2, int i4, int i5, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzh = iArr2;
        this.zzi = i4;
        this.zzj = i5;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }
}
