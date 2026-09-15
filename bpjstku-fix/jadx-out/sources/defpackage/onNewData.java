package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class onNewData extends addTagBundle {
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {1, 10, 34, 70, 126};
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {4, 20, 48, 81};
    private static final int[] g = {0, 161, 961, 2015, 2715};
    private static final int[] TuitionPaymentFragmentbindingInflater1 = {0, 336, 1036, 1516};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f1301a = {8, 6, 4, 3, 1};
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {2, 4, 6, 8};
    private static final int[][] b = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    private final List<OptionsBundle> d = new ArrayList();
    private final List<OptionsBundle> asInterface = new ArrayList();

    @Override // defpackage.insertOption
    public final DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws NotFoundException {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.d, TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, false, i, map));
        getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.asInterface, TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, true, i, map));
        getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        for (OptionsBundle optionsBundle : this.d) {
            if (optionsBundle.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > 1) {
                for (OptionsBundle optionsBundle2 : this.asInterface) {
                    if (optionsBundle2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > 1) {
                        int i2 = optionsBundle.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i3 = optionsBundle2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i4 = (optionsBundle.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 9) + optionsBundle2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (i4 > 72) {
                            i4--;
                        }
                        if (i4 > 8) {
                            i4--;
                        }
                        if ((i2 + (i3 * 16)) % 79 == i4) {
                            String strValueOf = String.valueOf((((long) optionsBundle.TuitionPaymentFragmentbindingInflater1) * 4537077) + ((long) optionsBundle2.TuitionPaymentFragmentbindingInflater1));
                            StringBuilder sb = new StringBuilder(14);
                            for (int length = 13 - strValueOf.length(); length > 0; length--) {
                                sb.append('0');
                            }
                            sb.append(strValueOf);
                            int i5 = 0;
                            for (int i6 = 0; i6 < 13; i6++) {
                                int iCharAt = sb.charAt(i6) - '0';
                                if ((i6 & 1) == 0) {
                                    iCharAt *= 3;
                                }
                                i5 += iCharAt;
                            }
                            int i7 = 10 - (i5 % 10);
                            if (i7 == 10) {
                                i7 = 0;
                            }
                            sb.append(i7);
                            DeferrableSurfaces1[] deferrableSurfaces1Arr = optionsBundle.b.TuitionPaymentFragmentbindingInflater1;
                            DeferrableSurfaces1[] deferrableSurfaces1Arr2 = optionsBundle2.b.TuitionPaymentFragmentbindingInflater1;
                            return new DynamicRanges(String.valueOf(sb.toString()), null, new DeferrableSurfaces1[]{deferrableSurfaces1Arr[0], deferrableSurfaces1Arr[1], deferrableSurfaces1Arr2[0], deferrableSurfaces1Arr2[1]}, BarcodeFormat.RSS_14);
                        }
                    }
                }
            }
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Collection<OptionsBundle> collection, OptionsBundle optionsBundle) {
        if (optionsBundle == null) {
            return;
        }
        for (OptionsBundle optionsBundle2 : collection) {
            if (optionsBundle2.TuitionPaymentFragmentbindingInflater1 == optionsBundle.TuitionPaymentFragmentbindingInflater1) {
                optionsBundle2.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                return;
            }
        }
        collection.add(optionsBundle);
    }

    @Override // defpackage.insertOption, defpackage.canMatchBitDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        this.d.clear();
        this.asInterface.clear();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[PHI: r4 r9
  0x00dd: PHI (r4v11 boolean) = (r4v9 boolean), (r4v30 boolean) binds: [B:53:0x00db, B:42:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x00dd: PHI (r9v4 boolean) = (r9v2 boolean), (r9v14 boolean) binds: [B:53:0x00db, B:42:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2 A[PHI: r4 r9
  0x00e2: PHI (r4v12 boolean) = (r4v9 boolean), (r4v30 boolean) binds: [B:55:0x00e0, B:44:0x00cb] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r9v5 boolean) = (r9v2 boolean), (r9v14 boolean) binds: [B:55:0x00e0, B:44:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e4 A[PHI: r4 r9
  0x00e4: PHI (r4v26 boolean) = (r4v9 boolean), (r4v30 boolean) binds: [B:55:0x00e0, B:44:0x00cb] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r9v12 boolean) = (r9v2 boolean), (r9v14 boolean) binds: [B:55:0x00e0, B:44:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    private MutableTagBundle TuitionPaymentFragmentspecialinlinedviewModeldefault1(getFlashType getflashtype, OptionsBundleExternalSyntheticLambda0 optionsBundleExternalSyntheticLambda0, boolean z) throws NotFoundException {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[1] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[2] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[3] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[4] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[5] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[6] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[7] = 0;
        if (z) {
            TuitionPaymentFragmentbindingInflater1(getflashtype, optionsBundleExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0], iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else {
            b(getflashtype, optionsBundleExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1] + 1, iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i = 0;
            for (int length = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length - 1; i < length; length--) {
                int i2 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i];
                iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i] = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[length];
                iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[length] = i2;
                i++;
            }
        }
        int i3 = z ? 16 : 15;
        int i4 = 0;
        for (int i5 : iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            i4 += i5;
        }
        float f = i4 / i3;
        int[] iArrD = d();
        int[] iArrB = b();
        float[] fArrAsInterface = asInterface();
        float[] fArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        for (int i6 = 0; i6 < iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length; i6++) {
            float f2 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i6] / f;
            int i7 = (int) (f2 + 0.5f);
            if (i7 <= 0) {
                i7 = 1;
            } else if (i7 > 8) {
                i7 = 8;
            }
            int i8 = i6 / 2;
            if ((i6 & 1) == 0) {
                iArrD[i8] = i7;
                fArrAsInterface[i8] = f2 - i7;
            } else {
                iArrB[i8] = i7;
                fArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i8] = f2 - i7;
            }
        }
        int i9 = 0;
        for (int i10 : d()) {
            i9 += i10;
        }
        int i11 = 0;
        for (int i12 : b()) {
            i11 += i12;
        }
        if (z) {
            if (i9 > 12) {
                z3 = true;
                z2 = false;
            } else {
                z2 = i9 < 4;
                z3 = false;
            }
            if (i11 > 12) {
                z4 = true;
                z5 = false;
            } else {
                if (i11 < 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z4 = false;
            }
        } else {
            if (i9 > 11) {
                z3 = true;
                z2 = false;
            } else {
                z2 = i9 < 5;
                z3 = false;
            }
            if (i11 > 10) {
                z4 = true;
                z5 = false;
            } else {
                if (i11 < 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z4 = false;
            }
        }
        int i13 = (i9 + i11) - i3;
        boolean z6 = (i9 & 1) == z;
        boolean z7 = (i11 & 1) == 1;
        if (i13 == 1) {
            if (z6) {
                if (z7) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                z3 = true;
            } else {
                if (!z7) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                z4 = true;
            }
        } else if (i13 != -1) {
            if (i13 != 0) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            if (z6) {
                if (!z7) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                if (i9 < i11) {
                    z2 = true;
                    z4 = true;
                } else {
                    z3 = true;
                    z5 = true;
                }
            } else if (z7) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
        } else if (z6) {
            if (z7) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            z2 = true;
        } else {
            if (!z7) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            z5 = true;
        }
        if (z2) {
            if (z3) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(d(), asInterface());
        }
        if (z3) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(d(), asInterface());
        }
        if (z5) {
            if (z4) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(b(), asInterface());
        }
        if (z4) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(b(), TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        int i14 = 0;
        int i15 = 0;
        for (int length2 = iArrD.length - 1; length2 >= 0; length2--) {
            int i16 = iArrD[length2];
            i14 = (i14 * 9) + i16;
            i15 += i16;
        }
        int i17 = 0;
        int i18 = 0;
        for (int length3 = iArrB.length - 1; length3 >= 0; length3--) {
            int i19 = iArrB[length3];
            i17 = (i17 * 9) + i19;
            i18 += i19;
        }
        int i20 = i14 + (i17 * 3);
        if (!z) {
            if ((i18 & 1) != 0 || i18 > 10 || i18 < 4) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            int i21 = (10 - i18) / 2;
            int i22 = TuitionPaymentFragmentspecialinlinedviewModeldefault2[i21];
            return new MutableTagBundle((OutputSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArrB, 9 - i22, false) * TuitionPaymentFragmentspecialinlinedviewModeldefault1[i21]) + OutputSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArrD, i22, true) + TuitionPaymentFragmentbindingInflater1[i21], i20);
        }
        if ((i15 & 1) != 0 || i15 > 12 || i15 < 4) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        int i23 = (12 - i15) / 2;
        int i24 = f1301a[i23];
        return new MutableTagBundle((OutputSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArrD, i24, false) * TuitionPaymentFragmentspecialinlinedviewModeldefault3[i23]) + OutputSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArrB, 9 - i24, true) + g[i23], i20);
    }

    private OptionsBundle TuitionPaymentFragmentspecialinlinedviewModeldefault1(getFlashType getflashtype, boolean z, int i, Map<DecodeHintType, ?> map) {
        int i2;
        int i3;
        try {
            int[] iArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
            iArrTuitionPaymentFragmentbindingInflater1[0] = 0;
            iArrTuitionPaymentFragmentbindingInflater1[1] = 0;
            iArrTuitionPaymentFragmentbindingInflater1[2] = 0;
            iArrTuitionPaymentFragmentbindingInflater1[3] = 0;
            int i4 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i5 = 0;
            boolean z2 = false;
            while (i5 < i4) {
                z2 = !(((1 << (i5 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i5 / 32]) != 0);
                if (z == z2) {
                    break;
                }
                i5++;
            }
            int i6 = 0;
            boolean z3 = z2;
            int i7 = i5;
            while (i5 < i4) {
                if (((getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i5 / 32] & (1 << (i5 & 31))) != 0) ^ z3) {
                    iArrTuitionPaymentFragmentbindingInflater1[i6] = iArrTuitionPaymentFragmentbindingInflater1[i6] + 1;
                } else {
                    if (i6 != 3) {
                        i6++;
                    } else {
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArrTuitionPaymentFragmentbindingInflater1)) {
                            int[] iArr = {i7, i5};
                            int i8 = iArr[0];
                            boolean z4 = (getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i8 / 32] & (1 << (i8 & 31))) != 0;
                            int i9 = iArr[0] - 1;
                            while (i9 >= 0) {
                                if (!((((1 << (i9 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i9 / 32]) != 0) ^ z4)) {
                                    break;
                                }
                                i9--;
                            }
                            int i10 = i9 + 1;
                            int i11 = iArr[0];
                            int[] iArrTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1();
                            System.arraycopy(iArrTuitionPaymentFragmentbindingInflater2, 0, iArrTuitionPaymentFragmentbindingInflater2, 1, iArrTuitionPaymentFragmentbindingInflater2.length - 1);
                            iArrTuitionPaymentFragmentbindingInflater2[0] = i11 - i10;
                            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArrTuitionPaymentFragmentbindingInflater2, b);
                            int i12 = iArr[1];
                            if (z) {
                                i3 = (getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) - i10;
                                i2 = (getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) - i12;
                            } else {
                                i2 = i12;
                                i3 = i10;
                            }
                            OptionsBundleExternalSyntheticLambda0 optionsBundleExternalSyntheticLambda0 = new OptionsBundleExternalSyntheticLambda0(iTuitionPaymentFragmentspecialinlinedviewModeldefault1, new int[]{i10, iArr[1]}, i3, i2, i);
                            canMatchEncoding canmatchencoding = map == null ? null : (canMatchEncoding) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
                            if (canmatchencoding != null) {
                                float f = (iArr[0] + iArr[1]) / 2.0f;
                                if (z) {
                                    f = (getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - 1) - f;
                                }
                                canmatchencoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new DeferrableSurfaces1(f, i));
                            }
                            MutableTagBundle mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, optionsBundleExternalSyntheticLambda0, true);
                            MutableTagBundle mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype, optionsBundleExternalSyntheticLambda0, false);
                            return new OptionsBundle((mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 * 1597) + mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + (mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * 4), optionsBundleExternalSyntheticLambda0);
                        }
                        i7 += iArrTuitionPaymentFragmentbindingInflater1[0] + iArrTuitionPaymentFragmentbindingInflater1[1];
                        iArrTuitionPaymentFragmentbindingInflater1[0] = iArrTuitionPaymentFragmentbindingInflater1[2];
                        iArrTuitionPaymentFragmentbindingInflater1[1] = iArrTuitionPaymentFragmentbindingInflater1[3];
                        iArrTuitionPaymentFragmentbindingInflater1[2] = 0;
                        iArrTuitionPaymentFragmentbindingInflater1[3] = 0;
                        i6--;
                    }
                    iArrTuitionPaymentFragmentbindingInflater1[i6] = 1;
                    z3 = !z3;
                }
                i5++;
            }
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        } catch (NotFoundException unused) {
            return null;
        }
    }
}
