package com.google.android.gms.internal.mlkit_common;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
final class zzaz extends zzar {
    static final zzar zza = new zzaz(null, new Object[0], 0);
    final transient Object[] zzb;
    private final transient Object zzc;
    private final transient int zzd;

    /* JADX WARN: Code duplicated, block: B:79:0x0198  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v9 */
    static zzaz zzg(int i, Object[] objArr, zzaq zzaqVar) {
        int iHighestOneBit;
        byte[] bArr;
        short[] sArr;
        boolean z;
        ?? r8;
        Object[] objArr2;
        zzap zzapVar;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (zzaz) zza;
        }
        zzap zzapVar2 = null;
        ?? r4 = 0;
        zzap zzapVar3 = null;
        zzap zzapVar4 = null;
        if (i2 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            Object obj2 = objArrCopyOf[1];
            obj2.getClass();
            zzaf.zza(obj, obj2);
            return new zzaz(null, objArrCopyOf, 1);
        }
        zzac.zzb(i2, objArrCopyOf.length >> 1, FirebaseAnalytics.Param.INDEX);
        int iMax = Math.max(i2, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = BasicMeasure.EXACTLY;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i2 != 1) {
            int i3 = iHighestOneBit - 1;
            byte b = -1;
            if (iHighestOneBit <= 128) {
                bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 + i5;
                    int i7 = i4 + i4;
                    Object obj3 = objArrCopyOf[i6];
                    obj3.getClass();
                    Object obj4 = objArrCopyOf[i6 ^ 1];
                    obj4.getClass();
                    zzaf.zza(obj3, obj4);
                    int iZza = zzah.zza(obj3.hashCode());
                    while (true) {
                        int i8 = iZza & i3;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            bArr[i8] = (byte) i7;
                            if (i4 < i5) {
                                objArrCopyOf[i7] = obj3;
                                objArrCopyOf[i7 ^ 1] = obj4;
                            }
                            i4++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i9 == true ? 1 : 0])) {
                            int i10 = ~i9;
                            Object obj5 = objArrCopyOf[i10 == true ? 1 : 0];
                            obj5.getClass();
                            zzap zzapVar5 = new zzap(obj3, obj4, obj5);
                            objArrCopyOf[i10 == true ? 1 : 0] = obj4;
                            zzapVar3 = zzapVar5;
                            break;
                        }
                        iZza = i8 + 1;
                    }
                }
                if (i4 != i2) {
                    sArr = new Object[]{bArr, Integer.valueOf(i4), zzapVar3};
                }
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    int i13 = i12 + i12;
                    int i14 = i11 + i11;
                    Object obj6 = objArrCopyOf[i13];
                    obj6.getClass();
                    Object obj7 = objArrCopyOf[i13 ^ 1];
                    obj7.getClass();
                    zzaf.zza(obj6, obj7);
                    int iZza2 = zzah.zza(obj6.hashCode());
                    while (true) {
                        int i15 = iZza2 & i3;
                        char c = (char) sArr[i15];
                        if (c == 65535) {
                            sArr[i15] = (short) i14;
                            if (i11 < i12) {
                                objArrCopyOf[i14] = obj6;
                                objArrCopyOf[i14 ^ 1] = obj7;
                            }
                            i11++;
                            break;
                        }
                        if (obj6.equals(objArrCopyOf[c])) {
                            int i16 = c ^ 1;
                            Object obj8 = objArrCopyOf[i16 == true ? 1 : 0];
                            obj8.getClass();
                            zzap zzapVar6 = new zzap(obj6, obj7, obj8);
                            objArrCopyOf[i16 == true ? 1 : 0] = obj7;
                            zzapVar4 = zzapVar6;
                            break;
                        }
                        iZza2 = i15 + 1;
                    }
                }
                r4 = i11 == i2 ? sArr : new Object[]{sArr, Integer.valueOf(i11), zzapVar4};
            } else {
                bArr = new int[iHighestOneBit];
                Arrays.fill((int[]) bArr, -1);
                int i17 = 0;
                int i18 = 0;
                while (i17 < i2) {
                    int i19 = i17 + i17;
                    int i20 = i18 + i18;
                    Object obj9 = objArrCopyOf[i19];
                    obj9.getClass();
                    Object obj10 = objArrCopyOf[i19 ^ 1];
                    obj10.getClass();
                    zzaf.zza(obj9, obj10);
                    int iZza3 = zzah.zza(obj9.hashCode());
                    while (true) {
                        int i21 = iZza3 & i3;
                        ?? r15 = bArr[i21];
                        if (r15 == b) {
                            bArr[i21] = i20;
                            if (i18 < i17) {
                                objArrCopyOf[i20] = obj9;
                                objArrCopyOf[i20 ^ 1] = obj10;
                            }
                            i18++;
                            break;
                        }
                        if (obj9.equals(objArrCopyOf[r15])) {
                            int i22 = r15 ^ 1;
                            Object obj11 = objArrCopyOf[i22 == true ? 1 : 0];
                            obj11.getClass();
                            zzap zzapVar7 = new zzap(obj9, obj10, obj11);
                            objArrCopyOf[i22 == true ? 1 : 0] = obj10;
                            zzapVar2 = zzapVar7;
                            break;
                        }
                        iZza3 = i21 + 1;
                        b = -1;
                    }
                    i17++;
                    b = -1;
                }
                if (i18 != i2) {
                    bArr = new Object[]{bArr, Integer.valueOf(i18), zzapVar2};
                }
            }
            z = bArr instanceof Object[];
            r8 = bArr;
            if (z) {
                objArr2 = (Object[]) bArr;
                zzapVar = (zzap) objArr2[2];
                if (zzaqVar != null) {
                    throw zzapVar.zza();
                }
                zzaqVar.zzc = zzapVar;
                Object obj12 = objArr2[0];
                int iIntValue = ((Integer) objArr2[1]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r8 = obj12;
                i2 = iIntValue;
            }
            return new zzaz(r8, objArrCopyOf, i2);
        }
        Object obj13 = objArrCopyOf[0];
        obj13.getClass();
        Object obj14 = objArrCopyOf[1];
        obj14.getClass();
        zzaf.zza(obj13, obj14);
        bArr = r4;
        z = bArr instanceof Object[];
        r8 = bArr;
        if (z) {
            objArr2 = (Object[]) bArr;
            zzapVar = (zzap) objArr2[2];
            if (zzaqVar != null) {
                throw zzapVar.zza();
            }
            zzaqVar.zzc = zzapVar;
            Object obj15 = objArr2[0];
            int iIntValue2 = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r8 = obj15;
            i2 = iIntValue2;
        }
        return new zzaz(r8, objArrCopyOf, i2);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008f A[EDGE_INSN: B:43:0x008f->B:35:0x008f BREAK  A[LOOP:0: B:15:0x0035->B:21:0x004d], EDGE_INSN: B:45:0x008f->B:35:0x008f BREAK  A[LOOP:1: B:25:0x0060->B:31:0x0079], EDGE_INSN: B:47:0x008f->B:35:0x008f BREAK  A[LOOP:2: B:33:0x0087->B:42:0x00a1]] */
    @Override // com.google.android.gms.internal.mlkit_common.zzar, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3 = this.zzc;
        Object[] objArr = this.zzb;
        int i = this.zzd;
        if (obj == null) {
            obj2 = null;
        } else if (i == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            if (obj4.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
            } else {
                obj2 = null;
            }
        } else if (obj3 == null) {
            obj2 = null;
        } else if (obj3 instanceof byte[]) {
            byte[] bArr = (byte[]) obj3;
            int length = bArr.length;
            int iZza = zzah.zza(obj.hashCode());
            while (true) {
                int i2 = iZza & (length - 1);
                int i3 = bArr[i2] & UByte.MAX_VALUE;
                if (i3 == 255) {
                    break;
                }
                if (obj.equals(objArr[i3])) {
                    obj2 = objArr[i3 ^ 1];
                } else {
                    iZza = i2 + 1;
                }
            }
            obj2 = null;
        } else if (obj3 instanceof short[]) {
            short[] sArr = (short[]) obj3;
            int length2 = sArr.length;
            int iZza2 = zzah.zza(obj.hashCode());
            while (true) {
                int i4 = iZza2 & (length2 - 1);
                char c = (char) sArr[i4];
                if (c == 65535) {
                    break;
                }
                if (obj.equals(objArr[c])) {
                    obj2 = objArr[c ^ 1];
                } else {
                    iZza2 = i4 + 1;
                }
            }
            obj2 = null;
        } else {
            int[] iArr = (int[]) obj3;
            int length3 = iArr.length;
            int iZza3 = zzah.zza(obj.hashCode());
            while (true) {
                int i5 = iZza3 & (length3 - 1);
                int i6 = iArr[i5];
                if (i6 == -1) {
                    break;
                }
                if (obj.equals(objArr[i6])) {
                    obj2 = objArr[i6 ^ 1];
                } else {
                    iZza3 = i5 + 1;
                }
            }
            obj2 = null;
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar
    final zzak zza() {
        return new zzay(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar
    final zzas zzd() {
        return new zzaw(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzar
    final zzas zze() {
        return new zzax(this, new zzay(this.zzb, 0, this.zzd));
    }

    private zzaz(Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }
}
