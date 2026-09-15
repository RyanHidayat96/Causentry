package com.google.zxing.qrcode.detector;

import android.os.SystemClock;
import defpackage.addNonRepeatingSurface;
import defpackage.canMatchEncoding;
import defpackage.getBufferFormat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FinderPatternFinder {
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final canMatchEncoding TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final List<addNonRepeatingSurface> TuitionPaymentFragmentbindingInflater1 = new ArrayList();
    private final int[] b = new int[5];

    public FinderPatternFinder(getBufferFormat getbufferformat, canMatchEncoding canmatchencoding) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getbufferformat;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = canmatchencoding;
    }

    public static boolean b(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - iArr[0]) < f2 && Math.abs(f - iArr[1]) < f2) {
            if (Math.abs((f * 3.0f) - iArr[2]) < 3.0f * f2 && Math.abs(f - iArr[3]) < f2 && Math.abs(f - iArr[4]) < f2) {
                return true;
            }
        }
        return false;
    }

    private float b(int i, int i2, int i3, int i4) {
        getBufferFormat getbufferformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = getbufferformat.b;
        int[] iArr = this.b;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        int i6 = i;
        while (i6 >= 0 && getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, i6)) {
            iArr[2] = iArr[2] + 1;
            i6--;
        }
        if (i6 < 0) {
            return Float.NaN;
        }
        while (i6 >= 0 && !getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, i6)) {
            int i7 = iArr[1];
            if (i7 > i3) {
                break;
            }
            iArr[1] = i7 + 1;
            i6--;
        }
        if (i6 >= 0 && iArr[1] <= i3) {
            while (i6 >= 0 && getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, i6)) {
                int i8 = iArr[0];
                if (i8 > i3) {
                    break;
                }
                iArr[0] = i8 + 1;
                i6--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i9 = i + 1;
            while (i9 < i5 && getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, i9)) {
                iArr[2] = iArr[2] + 1;
                i9++;
            }
            if (i9 == i5) {
                return Float.NaN;
            }
            while (i9 < i5 && !getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, i9)) {
                int i10 = iArr[3];
                if (i10 >= i3) {
                    break;
                }
                iArr[3] = i10 + 1;
                i9++;
            }
            if (i9 != i5 && iArr[3] < i3) {
                while (i9 < i5 && getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2, i9)) {
                    int i11 = iArr[4];
                    if (i11 >= i3) {
                        break;
                    }
                    iArr[4] = i11 + 1;
                    i9++;
                }
                int i12 = iArr[4];
                if (i12 >= i3) {
                    return Float.NaN;
                }
                if (Math.abs(((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + i12) - i4) * 5 < i4 * 2 && b(iArr)) {
                    return ((i9 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
                }
            }
        }
        return Float.NaN;
    }

    private float TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, int i4) {
        getBufferFormat getbufferformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int[] iArr = this.b;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        int i6 = i;
        while (i6 >= 0 && getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i6, i2)) {
            iArr[2] = iArr[2] + 1;
            i6--;
        }
        if (i6 < 0) {
            return Float.NaN;
        }
        while (i6 >= 0 && !getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i6, i2)) {
            int i7 = iArr[1];
            if (i7 > i3) {
                break;
            }
            iArr[1] = i7 + 1;
            i6--;
        }
        if (i6 >= 0 && iArr[1] <= i3) {
            while (i6 >= 0 && getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i6, i2)) {
                int i8 = iArr[0];
                if (i8 > i3) {
                    break;
                }
                iArr[0] = i8 + 1;
                i6--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i9 = i + 1;
            while (i9 < i5 && getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i9, i2)) {
                iArr[2] = iArr[2] + 1;
                i9++;
            }
            if (i9 == i5) {
                return Float.NaN;
            }
            while (i9 < i5 && !getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i9, i2)) {
                int i10 = iArr[3];
                if (i10 >= i3) {
                    break;
                }
                iArr[3] = i10 + 1;
                i9++;
            }
            if (i9 != i5 && iArr[3] < i3) {
                while (i9 < i5 && getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i9, i2)) {
                    int i11 = iArr[4];
                    if (i11 >= i3) {
                        break;
                    }
                    iArr[4] = i11 + 1;
                    i9++;
                }
                int i12 = iArr[4];
                if (i12 >= i3) {
                    return Float.NaN;
                }
                if (Math.abs(((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + i12) - i4) * 5 < i4 && b(iArr)) {
                    return ((i9 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
                }
            }
        }
        return Float.NaN;
    }

    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int[] iArr, int i, int i2, boolean z) {
        int i3 = iArr[0] + iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = i3 + i4 + i5 + i6;
        int i8 = (int) (((i2 - i6) - i5) - (i4 / 2.0f));
        float fB = b(i, i8, i4, i7);
        if (!Float.isNaN(fB)) {
            int i9 = (int) fB;
            float fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i8, i9, iArr[2], i7);
            if (!Float.isNaN(fTuitionPaymentFragmentspecialinlinedviewModeldefault3) && (!z || TuitionPaymentFragmentspecialinlinedviewModeldefault1(i9, (int) fTuitionPaymentFragmentspecialinlinedviewModeldefault3, iArr[2], i7))) {
                float f = i7 / 7.0f;
                for (int i10 = 0; i10 < this.TuitionPaymentFragmentbindingInflater1.size(); i10++) {
                    addNonRepeatingSurface addnonrepeatingsurface = this.TuitionPaymentFragmentbindingInflater1.get(i10);
                    if (addnonrepeatingsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3(f, fB, fTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                        this.TuitionPaymentFragmentbindingInflater1.set(i10, addnonrepeatingsurface.TuitionPaymentFragmentbindingInflater1(fB, fTuitionPaymentFragmentspecialinlinedviewModeldefault3, f));
                        return true;
                    }
                }
                addNonRepeatingSurface addnonrepeatingsurface2 = new addNonRepeatingSurface(fTuitionPaymentFragmentspecialinlinedviewModeldefault3, fB, f);
                this.TuitionPaymentFragmentbindingInflater1.add(addnonrepeatingsurface2);
                canMatchEncoding canmatchencoding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (canmatchencoding != null) {
                    canmatchencoding.TuitionPaymentFragmentspecialinlinedviewModeldefault1(addnonrepeatingsurface2);
                }
                return true;
            }
        }
        return false;
    }

    public boolean TuitionPaymentFragmentbindingInflater1() {
        int size = this.TuitionPaymentFragmentbindingInflater1.size();
        float fAbs = 0.0f;
        float f = 0.0f;
        int i = 0;
        for (addNonRepeatingSurface addnonrepeatingsurface : this.TuitionPaymentFragmentbindingInflater1) {
            if (addnonrepeatingsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >= 2) {
                i++;
                f += addnonrepeatingsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
        }
        if (i < 3) {
            return false;
        }
        float f2 = f / size;
        Iterator<addNonRepeatingSurface> it = this.TuitionPaymentFragmentbindingInflater1.iterator();
        while (it.hasNext()) {
            fAbs += Math.abs(it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault1 - f2);
        }
        return fAbs <= f * 0.05f;
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class FurthestFromAverageComparator implements Serializable, Comparator<addNonRepeatingSurface> {
        private final float average;

        public /* synthetic */ FurthestFromAverageComparator(float f, byte b) {
            this(f);
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(addNonRepeatingSurface addnonrepeatingsurface, addNonRepeatingSurface addnonrepeatingsurface2) {
            float fAbs = Math.abs(addnonrepeatingsurface2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - this.average);
            float fAbs2 = Math.abs(addnonrepeatingsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - this.average);
            if (fAbs < fAbs2) {
                return -1;
            }
            return fAbs == fAbs2 ? 0 : 1;
        }

        private FurthestFromAverageComparator(float f) {
            this.average = f;
        }
    }

    public static final class CenterComparator implements Serializable, Comparator<addNonRepeatingSurface> {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final float average;

        public /* synthetic */ CenterComparator(float f, byte b) {
            this(f);
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(addNonRepeatingSurface addnonrepeatingsurface, addNonRepeatingSurface addnonrepeatingsurface2) {
            addNonRepeatingSurface addnonrepeatingsurface3 = addnonrepeatingsurface;
            addNonRepeatingSurface addnonrepeatingsurface4 = addnonrepeatingsurface2;
            if (addnonrepeatingsurface4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == addnonrepeatingsurface3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                float fAbs = Math.abs(addnonrepeatingsurface4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - this.average);
                float fAbs2 = Math.abs(addnonrepeatingsurface3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 - this.average);
                if (fAbs < fAbs2) {
                    return 1;
                }
                return fAbs == fAbs2 ? 0 : -1;
            }
            return addnonrepeatingsurface4.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - addnonrepeatingsurface3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        private CenterComparator(float f) {
            this.average = f;
        }

        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i2 = i % 9093892;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iElapsedRealtime;
            return iElapsedRealtime;
        }
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr = this.b;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        int i12 = 0;
        while (i >= i12 && i2 >= i12 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2 - i12, i - i12)) {
            iArr[2] = iArr[2] + 1;
            i12++;
        }
        if (i >= i12 && i2 >= i12) {
            while (i >= i12 && i2 >= i12 && !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2 - i12, i - i12)) {
                int i13 = iArr[1];
                if (i13 > i3) {
                    break;
                }
                iArr[1] = i13 + 1;
                i12++;
            }
            if (i >= i12 && i2 >= i12 && iArr[1] <= i3) {
                while (i >= i12 && i2 >= i12 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i2 - i12, i - i12)) {
                    int i14 = iArr[0];
                    if (i14 > i3) {
                        break;
                    }
                    iArr[0] = i14 + 1;
                    i12++;
                }
                if (iArr[0] > i3) {
                    return false;
                }
                int i15 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                int i16 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int i17 = 1;
                while (true) {
                    i5 = i + i17;
                    if (i5 >= i15 || (i11 = i2 + i17) >= i16 || !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i11, i5)) {
                        break;
                    }
                    iArr[2] = iArr[2] + 1;
                    i17++;
                }
                if (i5 < i15 && i2 + i17 < i16) {
                    while (true) {
                        i6 = i + i17;
                        if (i6 >= i15 || (i9 = i2 + i17) >= i16 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i9, i6) || (i10 = iArr[3]) >= i3) {
                            break;
                        }
                        iArr[3] = i10 + 1;
                        i17++;
                    }
                    if (i6 < i15 && i2 + i17 < i16 && iArr[3] < i3) {
                        while (true) {
                            int i18 = i + i17;
                            if (i18 >= i15 || (i7 = i2 + i17) >= i16 || !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i7, i18) || (i8 = iArr[4]) >= i3) {
                                break;
                            }
                            iArr[4] = i8 + 1;
                            i17++;
                        }
                        int i19 = iArr[4];
                        if (i19 >= i3) {
                            return false;
                        }
                        if (Math.abs(((((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + i19) - i4) < i4 * 2 && b(iArr)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
