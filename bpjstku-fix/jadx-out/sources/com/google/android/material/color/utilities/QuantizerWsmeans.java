package com.google.android.material.color.utilities;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    private QuantizerWsmeans() {
    }

    static final class Distance implements Comparable<Distance> {
        int index = -1;
        double distance = -1.0d;

        Distance() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i) {
        int[] iArr3;
        int i2;
        int i3;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length][];
        int[] iArr4 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i4 = 0;
        for (int i5 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i5));
            if (num == null) {
                dArr[i4] = pointProviderLab.fromInt(i5);
                iArr4[i4] = i5;
                i4++;
                linkedHashMap.put(Integer.valueOf(i5), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i5), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr5 = new int[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            iArr5[i6] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr4[i6]))).intValue();
        }
        int iMin = Math.min(i, i4);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr2 = new double[iMin][];
        for (int i7 = 0; i7 < iArr2.length; i7++) {
            dArr2[i7] = pointProviderLab.fromInt(iArr2[i7]);
        }
        int[] iArr6 = new int[i4];
        for (int i8 = 0; i8 < i4; i8++) {
            iArr6[i8] = random.nextInt(iMin);
        }
        int[][] iArr7 = new int[iMin][];
        for (int i9 = 0; i9 < iMin; i9++) {
            iArr7[i9] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i10 = 0; i10 < iMin; i10++) {
            distanceArr[i10] = new Distance[iMin];
            for (int i11 = 0; i11 < iMin; i11++) {
                distanceArr[i10][i11] = new Distance();
            }
        }
        int[] iArr8 = new int[iMin];
        int i12 = 0;
        while (true) {
            if (i12 >= 10) {
                iArr3 = iArr8;
                i2 = 0;
                break;
            }
            int i13 = 0;
            while (i13 < iMin) {
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < iMin) {
                    int[] iArr9 = iArr8;
                    double dDistance = pointProviderLab.distance(dArr2[i13], dArr2[i15]);
                    distanceArr[i15][i13].distance = dDistance;
                    distanceArr[i15][i13].index = i13;
                    distanceArr[i13][i15].distance = dDistance;
                    distanceArr[i13][i15].index = i15;
                    i15++;
                    iArr8 = iArr9;
                }
                int[] iArr10 = iArr8;
                Arrays.sort(distanceArr[i13]);
                for (int i16 = 0; i16 < iMin; i16++) {
                    iArr7[i13][i16] = distanceArr[i13][i16].index;
                }
                iArr8 = iArr10;
                i13 = i14;
            }
            int[] iArr11 = iArr8;
            int i17 = 0;
            int i18 = 0;
            while (i17 < i4) {
                double[] dArr3 = dArr[i17];
                int i19 = iArr6[i17];
                double dDistance2 = pointProviderLab.distance(dArr3, dArr2[i19]);
                int[][] iArr12 = iArr7;
                int[] iArr13 = iArr5;
                double d = dDistance2;
                int i20 = -1;
                int i21 = 0;
                while (i21 < iMin) {
                    Distance[][] distanceArr2 = distanceArr;
                    int i22 = i4;
                    if (distanceArr[i19][i21].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr3, dArr2[i21]);
                        if (dDistance3 < d) {
                            i20 = i21;
                            d = dDistance3;
                        }
                    }
                    i21++;
                    i4 = i22;
                    distanceArr = distanceArr2;
                }
                Distance[][] distanceArr3 = distanceArr;
                int i23 = i4;
                if (i20 != -1 && Math.abs(Math.sqrt(d) - Math.sqrt(dDistance2)) > 3.0d) {
                    i18++;
                    iArr6[i17] = i20;
                }
                i17++;
                iArr7 = iArr12;
                iArr5 = iArr13;
                i4 = i23;
                distanceArr = distanceArr3;
            }
            int[] iArr14 = iArr5;
            int[][] iArr15 = iArr7;
            Distance[][] distanceArr4 = distanceArr;
            int i24 = i4;
            if (i18 == 0 && i12 != 0) {
                i2 = 0;
                iArr3 = iArr11;
                break;
            }
            double[] dArr4 = new double[iMin];
            double[] dArr5 = new double[iMin];
            double[] dArr6 = new double[iMin];
            char c = 0;
            Arrays.fill(iArr11, 0);
            int i25 = 0;
            while (true) {
                i3 = i24;
                if (i25 >= i3) {
                    break;
                }
                int i26 = iArr6[i25];
                double[] dArr7 = dArr[i25];
                int i27 = iArr14[i25];
                iArr11[i26] = iArr11[i26] + i27;
                double d2 = i27;
                dArr4[i26] = dArr4[i26] + (dArr7[c] * d2);
                dArr5[i26] = dArr5[i26] + (dArr7[1] * d2);
                dArr6[i26] = dArr6[i26] + (dArr7[2] * d2);
                i25++;
                i12 = i12;
                i24 = i3;
                c = 0;
            }
            int i28 = i12;
            for (int i29 = 0; i29 < iMin; i29++) {
                int i30 = iArr11[i29];
                if (i30 == 0) {
                    dArr2[i29] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d3 = i30;
                    double d4 = dArr4[i29] / d3;
                    double d5 = dArr5[i29] / d3;
                    double d6 = dArr6[i29] / d3;
                    double[] dArr8 = dArr2[i29];
                    dArr8[0] = d4;
                    dArr8[1] = d5;
                    dArr8[2] = d6;
                }
            }
            iArr7 = iArr15;
            i12 = i28 + 1;
            iArr8 = iArr11;
            i4 = i3;
            iArr5 = iArr14;
            distanceArr = distanceArr4;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i31 = i2; i31 < iMin; i31++) {
            int i32 = iArr3[i31];
            if (i32 != 0) {
                int i33 = pointProviderLab.toInt(dArr2[i31]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i33))) {
                    linkedHashMap2.put(Integer.valueOf(i33), Integer.valueOf(i32));
                }
            }
        }
        return linkedHashMap2;
    }
}
