package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public class zzcbn implements Serializable, Comparable {
    public static final zzcbn zza = new zzcbn(new byte[0]);
    private final byte[] zzb;
    private transient int zzc;
    private transient String zzd;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        zzcbn zzcbnVar = (zzcbn) obj;
        Intrinsics.checkNotNullParameter(zzcbnVar, "");
        int iZzj = zzj();
        int iZzj2 = zzcbnVar.zzj();
        int iMin = Math.min(iZzj, iZzj2);
        for (int i = 0; i < iMin; i++) {
            int iZzi = zzi(i) & UByte.MAX_VALUE;
            int iZzi2 = zzcbnVar.zzi(i) & UByte.MAX_VALUE;
            if (iZzi != iZzi2) {
                return iZzi >= iZzi2 ? 1 : -1;
            }
        }
        if (iZzj == iZzj2) {
            return 0;
        }
        return iZzj >= iZzj2 ? 1 : -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcbn) {
            zzcbn zzcbnVar = (zzcbn) obj;
            int iZzj = zzcbnVar.zzj();
            byte[] bArr = this.zzb;
            int length = bArr.length;
            return iZzj == length && zzcbnVar.zzo(0, bArr, 0, length);
        }
        return false;
    }

    public int hashCode() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.zzb);
        this.zzc = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x013c A[EDGE_INSN: B:123:0x013c->B:124:0x013d BREAK  A[LOOP:0: B:7:0x000d->B:172:0x000d]] */
    public String toString() {
        int i;
        byte[] bArr = this.zzb;
        int length = bArr.length;
        if (length == 0) {
            return "[size=0]";
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i3 < length) {
            byte b = bArr[i3];
            if (b < 0) {
                if ((b >> 5) != -2) {
                    if ((b >> 4) != -2) {
                        if ((b >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i2 = -1;
                            break;
                        }
                        int i5 = i3 + 3;
                        if (length > i5) {
                            byte b2 = bArr[i3 + 1];
                            if ((b2 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                            byte b3 = bArr[i3 + 2];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                            byte b4 = bArr[i5];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                            int i6 = (((b4 ^ ByteCompanionObject.MIN_VALUE) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
                            if (i6 <= 1114111) {
                                if (i6 >= 55296 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    int i7 = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i2 += 2;
                                    Unit unit = Unit.INSTANCE;
                                    i3 += 4;
                                    i4 = i7;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i2 = -1;
                            break;
                        }
                    } else {
                        int i8 = i3 + 2;
                        if (length > i8) {
                            byte b5 = bArr[i3 + 1];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                            byte b6 = bArr[i8];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                            int i9 = ((b6 ^ ByteCompanionObject.MIN_VALUE) ^ (b5 << 6)) ^ (b << 12);
                            if (i9 >= 2048) {
                                if (i9 >= 55296 && i9 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i2 = -1;
                                    break;
                                }
                                int i10 = i4 + 1;
                                if (i4 != 64) {
                                    if (i9 == 65533) {
                                        i2 = -1;
                                        break;
                                    }
                                    i3 += 3;
                                    i2 += i9 < 65536 ? 1 : 2;
                                    Unit unit2 = Unit.INSTANCE;
                                    i4 = i10;
                                } else {
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i2 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i2 = -1;
                            break;
                        }
                    }
                } else {
                    int i11 = i3 + 1;
                    if (length > i11) {
                        byte b7 = bArr[i11];
                        if ((b7 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i2 = -1;
                            break;
                        }
                        int i12 = (b << 6) ^ (b7 ^ ByteCompanionObject.MIN_VALUE);
                        if (i12 < 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i2 = -1;
                            break;
                        }
                        i = i4 + 1;
                        if (i4 == 64) {
                            break;
                        }
                        if (i12 < 160 || i12 == 65533) {
                            i2 = -1;
                            break;
                        }
                        i3 += 2;
                        i2 += i12 < 65536 ? 1 : 2;
                        Unit unit3 = Unit.INSTANCE;
                        i4 = i;
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i2 = -1;
                        break;
                    }
                }
            } else {
                i = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if (b == 10 || b == 13 || (b >= 32 && b < 127)) {
                    i2++;
                    i3++;
                    while (true) {
                        if (i3 < length) {
                            byte b8 = bArr[i3];
                            if (b8 >= 0) {
                                i3++;
                                if (i == 64) {
                                    break loop0;
                                }
                                if (b8 == 10 || b8 == 13 || (b8 >= 32 && b8 < 127)) {
                                    i2++;
                                    i++;
                                }
                            }
                        }
                        Unit unit4 = Unit.INSTANCE;
                        i4 = i;
                    }
                }
                i2 = -1;
                break;
            }
        }
        if (i2 == -1) {
            int length2 = bArr.length;
            if (length2 <= 64) {
                String strZzg = zzg();
                StringBuilder sb = new StringBuilder(String.valueOf(strZzg).length() + 6);
                sb.append("[hex=");
                sb.append(strZzg);
                sb.append("]");
                return sb.toString();
            }
            Intrinsics.checkNotNullParameter(this, "");
            String strZzg2 = new zzcbn(ArraysKt.copyOfRange(bArr, 0, 64)).zzg();
            StringBuilder sb2 = new StringBuilder(String.valueOf(length2).length() + 11 + String.valueOf(strZzg2).length() + 2);
            sb2.append("[size=");
            sb2.append(length2);
            sb2.append(" hex=");
            sb2.append(strZzg2);
            sb2.append("…]");
            return sb2.toString();
        }
        String strZze = zze();
        String strSubstring = strZze.substring(0, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(strSubstring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
        if (i2 >= strZze.length()) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(strReplace$default).length() + 7);
            sb3.append("[text=");
            sb3.append(strReplace$default);
            sb3.append("]");
            return sb3.toString();
        }
        int length3 = bArr.length;
        StringBuilder sb4 = new StringBuilder(String.valueOf(length3).length() + 12 + String.valueOf(strReplace$default).length() + 2);
        sb4.append("[size=");
        sb4.append(length3);
        sb4.append(" text=");
        sb4.append(strReplace$default);
        sb4.append("…]");
        return sb4.toString();
    }

    public final String zze() {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        String strZza = zzccc.zza(zzl());
        this.zzd = strZza;
        return strZza;
    }

    public final String zzf() {
        return zzcbe.zza(this.zzb, null, 1, null);
    }

    public String zzg() {
        byte[] bArr = this.zzb;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            cArr[i] = zzcce.zza()[(b >> 4) & 15];
            cArr[i + 1] = zzcce.zza()[b & 15];
            i += 2;
        }
        return StringsKt.concatToString(cArr);
    }

    public zzcbn zzh() {
        int i = 0;
        while (true) {
            byte[] bArr = this.zzb;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
                bArrCopyOf[i] = (byte) (b + 32);
                while (i2 < bArrCopyOf.length) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                    i2++;
                }
                return new zzcbn(bArrCopyOf);
            }
            i = i2;
        }
    }

    public byte zzi(int i) {
        return this.zzb[i];
    }

    public int zzj() {
        return this.zzb.length;
    }

    public byte[] zzk() {
        byte[] bArr = this.zzb;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }

    public boolean zzn(int i, zzcbn zzcbnVar, int i2, int i3) {
        Intrinsics.checkNotNullParameter(zzcbnVar, "");
        return zzcbnVar.zzo(0, this.zzb, 0, i3);
    }

    public boolean zzo(int i, byte[] bArr, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.zzb;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && zzcbf.zzb(bArr2, i, bArr, i2, i3);
    }

    public final boolean zzp(zzcbn zzcbnVar) {
        Intrinsics.checkNotNullParameter(zzcbnVar, "");
        return zzn(0, zzcbnVar, 0, zzcbnVar.zzb.length);
    }

    public void zzm(zzcbj zzcbjVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        Intrinsics.checkNotNullParameter(this, "");
        Intrinsics.checkNotNullParameter(zzcbjVar, "");
        zzcbjVar.zzz(this.zzb, 0, i2);
    }

    public zzcbn(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.zzb = bArr;
    }

    public final byte[] zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final void zzc(int i) {
        this.zzc = i;
    }

    public final void zzd(String str) {
        this.zzd = str;
    }

    public byte[] zzl() {
        return this.zzb;
    }
}
