package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes6.dex */
public final class withAllQuirksDisabled extends addTagBundle {
    private boolean asBinder;
    private static final int[] b = {7, 5, 4, 3, 1};
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {4, 20, 52, 104, 204};
    private static final int[] TuitionPaymentFragmentbindingInflater1 = {0, 348, 1388, 2948, 3988};
    private static final int[][] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] d = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, ModuleDescriptor.MODULE_VERSION}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, DerHeader.TAG_CLASS_PRIVATE, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    private static final int[][] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};
    private final List<emptyBundle> asInterface = new ArrayList(11);
    private final List<QuirkSettings> g = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f1427a = new int[2];

    @Override // defpackage.insertOption
    public final DynamicRanges b(int i, getFlashType getflashtype, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.asInterface.clear();
        this.asBinder = false;
        try {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1(i, getflashtype));
        } catch (NotFoundException unused) {
            this.asInterface.clear();
            this.asBinder = true;
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1(i, getflashtype));
        }
    }

    @Override // defpackage.insertOption, defpackage.canMatchBitDepth
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        this.asInterface.clear();
        this.g.clear();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9 A[RETURN] */
    private List<emptyBundle> TuitionPaymentFragmentbindingInflater1(int i, getFlashType getflashtype) throws NotFoundException {
        List<emptyBundle> listB;
        List<emptyBundle> listB2;
        while (true) {
            try {
                this.asInterface.add(TuitionPaymentFragmentbindingInflater1(getflashtype, this.asInterface, i));
            } catch (NotFoundException e2) {
                if (this.asInterface.isEmpty()) {
                    throw e2;
                }
                if (a()) {
                    return this.asInterface;
                }
                boolean zIsEmpty = this.g.isEmpty();
                int i2 = 0;
                boolean zEquals = false;
                while (true) {
                    if (i2 < this.g.size()) {
                        QuirkSettings quirkSettings = this.g.get(i2);
                        if (quirkSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > i) {
                            if (!quirkSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(this.asInterface)) {
                            }
                            if (!zIsEmpty) {
                                listB = b(false);
                                if (listB != null) {
                                    return listB;
                                }
                                listB2 = b(true);
                                if (listB2 != null) {
                                    return listB2;
                                }
                            }
                            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                        }
                        zEquals = quirkSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1.equals(this.asInterface);
                        i2++;
                    }
                    if (!zEquals) {
                        List<emptyBundle> list = this.asInterface;
                        Iterator<T> it = this.g.iterator();
                        loop2: while (true) {
                            if (!it.hasNext()) {
                                this.g.add(i2, new QuirkSettings(this.asInterface, i, false));
                                List<emptyBundle> list2 = this.asInterface;
                                Iterator<QuirkSettings> it2 = this.g.iterator();
                                while (it2.hasNext()) {
                                    QuirkSettings next = it2.next();
                                    if (next.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size() != list2.size()) {
                                        Iterator<emptyBundle> it3 = next.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                emptyBundle next2 = it3.next();
                                                Iterator<emptyBundle> it4 = list2.iterator();
                                                do {
                                                    if (!it4.hasNext()) {
                                                        break;
                                                    }
                                                } while (!next2.equals(it4.next()));
                                            } else {
                                                it2.remove();
                                                break;
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            QuirkSettings quirkSettings2 = (QuirkSettings) it.next();
                            Iterator<T> it5 = list.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break loop2;
                                }
                                emptyBundle emptybundle = (emptyBundle) it5.next();
                                Iterator<emptyBundle> it6 = quirkSettings2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        if (emptybundle.equals(it6.next())) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!zIsEmpty) {
                        listB = b(false);
                        if (listB != null) {
                            return listB;
                        }
                        listB2 = b(true);
                        if (listB2 != null) {
                            return listB2;
                        }
                    }
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
            }
        }
    }

    private List<emptyBundle> b(boolean z) {
        List<emptyBundle> listB = null;
        if (this.g.size() > 25) {
            this.g.clear();
            return null;
        }
        this.asInterface.clear();
        if (z) {
            Collections.reverse(this.g);
        }
        try {
            listB = b(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.g);
        }
        return listB;
    }

    private List<emptyBundle> b(List<QuirkSettings> list, int i) throws NotFoundException {
        while (i < this.g.size()) {
            QuirkSettings quirkSettings = this.g.get(i);
            this.asInterface.clear();
            Iterator<QuirkSettings> it = list.iterator();
            while (it.hasNext()) {
                this.asInterface.addAll(it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
            this.asInterface.addAll(quirkSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            List<emptyBundle> list2 = this.asInterface;
            for (int[] iArr : TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                if (list2.size() <= iArr.length) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= list2.size()) {
                            if (a()) {
                                return this.asInterface;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(list);
                            arrayList.add(quirkSettings);
                            try {
                                return b(arrayList, i + 1);
                            } catch (NotFoundException unused) {
                                break;
                            }
                        }
                        if (list2.get(i2).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != iArr[i2]) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            i++;
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    private boolean a() {
        emptyBundle emptybundle = this.asInterface.get(0);
        MutableTagBundle mutableTagBundle = emptybundle.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        MutableTagBundle mutableTagBundle2 = emptybundle.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (mutableTagBundle2 == null) {
            return false;
        }
        int i = mutableTagBundle2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = 2;
        for (int i3 = 1; i3 < this.asInterface.size(); i3++) {
            emptyBundle emptybundle2 = this.asInterface.get(i3);
            i += emptybundle2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            MutableTagBundle mutableTagBundle3 = emptybundle2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (mutableTagBundle3 != null) {
                i += mutableTagBundle3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                i2 += 2;
            } else {
                i2++;
            }
        }
        return ((i2 + (-4)) * 211) + (i % 211) == mutableTagBundle.TuitionPaymentFragmentbindingInflater1;
    }

    private emptyBundle TuitionPaymentFragmentbindingInflater1(getFlashType getflashtype, List<emptyBundle> list, int i) throws NotFoundException {
        int i2;
        MutableTagBundle mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i3 = 2;
        int i4 = 0;
        boolean z = list.size() % 2 == 0;
        if (this.asBinder) {
            z = !z;
        }
        int i5 = -1;
        boolean z2 = true;
        while (true) {
            int[] iArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
            iArrTuitionPaymentFragmentbindingInflater1[i4] = i4;
            iArrTuitionPaymentFragmentbindingInflater1[1] = i4;
            iArrTuitionPaymentFragmentbindingInflater1[i3] = i4;
            iArrTuitionPaymentFragmentbindingInflater1[3] = i4;
            int i6 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i5 < 0) {
                i2 = list.isEmpty() ? i4 : list.get(list.size() - 1).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1];
            } else {
                i2 = i5;
            }
            int i7 = list.size() % i3 != 0 ? 1 : i4;
            if (this.asBinder) {
                i7 ^= 1;
            }
            int i8 = i4;
            while (i2 < i6) {
                int i9 = ((1 << (i2 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2 / 32]) != 0 ? 1 : i4;
                int i10 = i9 ^ 1;
                if (i9 != 0) {
                    i8 = i10;
                    break;
                }
                i2++;
                i8 = i10;
            }
            int i11 = i4;
            int i12 = i8;
            int i13 = i2;
            while (true) {
                if (i2 >= i6) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                if (((((1 << (i2 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2 / 32]) != 0 ? 1 : 0) ^ i12) != 0) {
                    iArrTuitionPaymentFragmentbindingInflater1[i11] = iArrTuitionPaymentFragmentbindingInflater1[i11] + 1;
                } else {
                    if (i11 == 3) {
                        if (i7 != 0) {
                            TuitionPaymentFragmentbindingInflater1(iArrTuitionPaymentFragmentbindingInflater1);
                        }
                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArrTuitionPaymentFragmentbindingInflater1)) {
                            break;
                        }
                        if (i7 != 0) {
                            TuitionPaymentFragmentbindingInflater1(iArrTuitionPaymentFragmentbindingInflater1);
                        }
                        i13 += iArrTuitionPaymentFragmentbindingInflater1[0] + iArrTuitionPaymentFragmentbindingInflater1[1];
                        iArrTuitionPaymentFragmentbindingInflater1[0] = iArrTuitionPaymentFragmentbindingInflater1[2];
                        iArrTuitionPaymentFragmentbindingInflater1[1] = iArrTuitionPaymentFragmentbindingInflater1[3];
                        iArrTuitionPaymentFragmentbindingInflater1[2] = 0;
                        iArrTuitionPaymentFragmentbindingInflater1[3] = 0;
                        i11--;
                    } else {
                        i11++;
                    }
                    iArrTuitionPaymentFragmentbindingInflater1[i11] = 1;
                    i12 ^= 1;
                }
                i2++;
            }
            int[] iArr = this.f1427a;
            iArr[0] = i13;
            iArr[1] = i2;
            OptionsBundleExternalSyntheticLambda0 optionsBundleExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(getflashtype, i, z);
            if (optionsBundleExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                int i14 = this.f1427a[0];
                if (((1 << (i14 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i14 / 32]) != 0) {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i14));
                } else {
                    iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i14));
                }
                i5 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                z2 = false;
            }
            if (!z2) {
                MutableTagBundle mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, optionsBundleExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2, z, true);
                if (!list.isEmpty() && list.get(list.size() - 1).TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                try {
                    mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, optionsBundleExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2, z, false);
                } catch (NotFoundException unused) {
                    mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
                }
                return new emptyBundle(mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault4, mutableTagBundleTuitionPaymentFragmentspecialinlinedviewModeldefault3, optionsBundleExternalSyntheticLambda0TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            i3 = 2;
            i4 = 0;
        }
    }

    private static void TuitionPaymentFragmentbindingInflater1(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    private OptionsBundleExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2(getFlashType getflashtype, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f1427a[0] - 1;
            while (i5 >= 0 && ((1 << (i5 & 31)) & getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i5 / 32]) == 0) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f1427a;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f1427a;
            int i7 = iArr2[0];
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iArr2[1] + 1);
            i2 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            i3 = i7;
            i4 = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 - this.f1427a[1];
        }
        int[] iArrTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        System.arraycopy(iArrTuitionPaymentFragmentbindingInflater1, 0, iArrTuitionPaymentFragmentbindingInflater1, 1, iArrTuitionPaymentFragmentbindingInflater1.length - 1);
        iArrTuitionPaymentFragmentbindingInflater1[0] = i4;
        try {
            return new OptionsBundleExternalSyntheticLambda0(TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArrTuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentspecialinlinedviewModeldefault1), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private MutableTagBundle TuitionPaymentFragmentspecialinlinedviewModeldefault3(getFlashType getflashtype, OptionsBundleExternalSyntheticLambda0 optionsBundleExternalSyntheticLambda0, boolean z, boolean z2) throws NotFoundException {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[0] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[1] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[2] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[3] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[4] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[5] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[6] = 0;
        iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[7] = 0;
        if (z2) {
            TuitionPaymentFragmentbindingInflater1(getflashtype, optionsBundleExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0], iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else {
            b(getflashtype, optionsBundleExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1], iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            int i = 0;
            for (int length = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length - 1; i < length; length--) {
                int i2 = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i];
                iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i] = iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[length];
                iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[length] = i2;
                i++;
            }
        }
        int i3 = 0;
        for (int i4 : iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            i3 += i4;
        }
        float f = i3 / 17.0f;
        float f2 = (optionsBundleExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3[1] - optionsBundleExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0]) / 15.0f;
        if (Math.abs(f - f2) / f2 > 0.3f) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        int[] iArrD = d();
        int[] iArrB = b();
        float[] fArrAsInterface = asInterface();
        float[] fArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        for (int i5 = 0; i5 < iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1.length; i5++) {
            float f3 = (iArrTuitionPaymentFragmentspecialinlinedviewModeldefault1[i5] * 1.0f) / f;
            int i6 = (int) (0.5f + f3);
            if (i6 <= 0) {
                if (f3 < 0.3f) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                i6 = 1;
            } else if (i6 > 8) {
                if (f3 > 8.7f) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                iArrD[i7] = i6;
                fArrAsInterface[i7] = f3 - i6;
            } else {
                iArrB[i7] = i6;
                fArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i7] = f3 - i6;
            }
        }
        int i8 = 0;
        for (int i9 : d()) {
            i8 += i9;
        }
        int i10 = 0;
        for (int i11 : b()) {
            i10 += i11;
        }
        if (i8 > 13) {
            z3 = false;
            z4 = true;
        } else if (i8 < 4) {
            z4 = false;
            z3 = true;
        } else {
            z3 = false;
            z4 = false;
        }
        if (i10 > 13) {
            z5 = false;
            z6 = true;
        } else if (i10 < 4) {
            z6 = false;
            z5 = true;
        } else {
            z5 = false;
            z6 = false;
        }
        int i12 = (i8 + i10) - 17;
        boolean z11 = (i8 & 1) == 1;
        boolean z12 = (i10 & 1) == 0;
        if (i12 == 1) {
            if (z11) {
                if (z12) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                z7 = true;
            } else {
                if (!z12) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                z10 = true;
            }
        } else if (i12 != -1) {
            if (i12 != 0) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            if (z11) {
                if (!z12) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                if (i8 < i10) {
                    z9 = true;
                    z10 = true;
                } else {
                    z7 = true;
                    z8 = true;
                }
            } else if (z12) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
        } else if (z11) {
            if (z12) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            z9 = true;
        } else {
            if (!z12) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            z8 = true;
        }
        if (z9) {
            if (z7) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(d(), asInterface());
        }
        if (z7) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(d(), asInterface());
        }
        if (z8) {
            if (z10) {
                throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(b(), asInterface());
        }
        if (z10) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(b(), TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
        int i13 = (((optionsBundleExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
        int i14 = 0;
        int i15 = 0;
        for (int length2 = iArrD.length - 1; length2 >= 0; length2--) {
            if (optionsBundleExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0 || !z || !z2) {
                i14 += iArrD[length2] * d[i13][length2 * 2];
            }
            i15 += iArrD[length2];
        }
        int i16 = 0;
        for (int length3 = iArrB.length - 1; length3 >= 0; length3--) {
            if (optionsBundleExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != 0 || !z || !z2) {
                i16 += iArrB[length3] * d[i13][(length3 * 2) + 1];
            }
        }
        if ((i15 & 1) != 0 || i15 > 13 || i15 < 4) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        int i17 = (13 - i15) / 2;
        int i18 = b[i17];
        return new MutableTagBundle((OutputSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArrD, i18, true) * TuitionPaymentFragmentspecialinlinedviewModeldefault3[i17]) + OutputSurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArrB, 9 - i18, false) + TuitionPaymentFragmentbindingInflater1[i17], i14 + i16);
    }

    private static DynamicRanges TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<emptyBundle> list) throws NotFoundException, FormatException {
        forceDisableQuirks quirkSettingsBuilder;
        int size = list.size() << 1;
        int i = size - 1;
        if (list.get(list.size() - 1).TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            i = size - 2;
        }
        getFlashType getflashtype = new getFlashType(i * 12);
        int i2 = list.get(0).TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
        int i3 = 0;
        for (int i4 = 11; i4 >= 0; i4--) {
            if (((1 << i4) & i2) != 0) {
                int[] iArr = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i5 = i3 / 32;
                iArr[i5] = (1 << (i3 & 31)) | iArr[i5];
            }
            i3++;
        }
        for (int i6 = 1; i6 < list.size(); i6++) {
            emptyBundle emptybundle = list.get(i6);
            int i7 = emptybundle.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
            for (int i8 = 11; i8 >= 0; i8--) {
                if (((1 << i8) & i7) != 0) {
                    int[] iArr2 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    int i9 = i3 / 32;
                    iArr2[i9] = (1 << (i3 & 31)) | iArr2[i9];
                }
                i3++;
            }
            if (emptybundle.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                int i10 = emptybundle.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
                for (int i11 = 11; i11 >= 0; i11--) {
                    if (((1 << i11) & i10) != 0) {
                        int[] iArr3 = getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i12 = i3 / 32;
                        iArr3[i12] = (1 << (i3 & 31)) | iArr3[i12];
                    }
                    i3++;
                }
            }
        }
        if ((getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] & 2) != 0) {
            quirkSettingsBuilder = new getForceDisabledQuirks(getflashtype);
        } else if ((getflashtype.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] & 4) == 0) {
            quirkSettingsBuilder = new QuirkSettingsBuilder(getflashtype);
        } else {
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = observe.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, 1, 4);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 4) {
                quirkSettingsBuilder = new PreviewConfig(getflashtype);
            } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault3 == 5) {
                quirkSettingsBuilder = new OutputSurfaceConfiguration(getflashtype);
            } else {
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault4 = observe.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, 1, 5);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 == 12) {
                    quirkSettingsBuilder = new Quirk(getflashtype);
                } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault4 == 13) {
                    quirkSettingsBuilder = new getForceEnabledQuirks(getflashtype);
                } else {
                    switch (observe.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getflashtype, 1, 7)) {
                        case 56:
                            quirkSettingsBuilder = new withQuirksForceEnabled(getflashtype, "310", "11");
                            break;
                        case 57:
                            quirkSettingsBuilder = new withQuirksForceEnabled(getflashtype, "320", "11");
                            break;
                        case 58:
                            quirkSettingsBuilder = new withQuirksForceEnabled(getflashtype, "310", "13");
                            break;
                        case 59:
                            quirkSettingsBuilder = new withQuirksForceEnabled(getflashtype, "320", "13");
                            break;
                        case 60:
                            quirkSettingsBuilder = new withQuirksForceEnabled(getflashtype, "310", "15");
                            break;
                        case 61:
                            quirkSettingsBuilder = new withQuirksForceEnabled(getflashtype, "320", "15");
                            break;
                        case 62:
                            quirkSettingsBuilder = new withQuirksForceEnabled(getflashtype, "310", "17");
                            break;
                        case 63:
                            quirkSettingsBuilder = new withQuirksForceEnabled(getflashtype, "320", "17");
                            break;
                        default:
                            throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(getflashtype)));
                    }
                }
            }
        }
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = quirkSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        DeferrableSurfaces1[] deferrableSurfaces1Arr = list.get(0).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
        DeferrableSurfaces1[] deferrableSurfaces1Arr2 = list.get(list.size() - 1).TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
        return new DynamicRanges(strTuitionPaymentFragmentspecialinlinedviewModeldefault3, null, new DeferrableSurfaces1[]{deferrableSurfaces1Arr[0], deferrableSurfaces1Arr[1], deferrableSurfaces1Arr2[0], deferrableSurfaces1Arr2[1]}, BarcodeFormat.RSS_EXPANDED);
    }
}
