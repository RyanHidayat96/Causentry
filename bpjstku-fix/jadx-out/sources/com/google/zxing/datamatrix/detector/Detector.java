package com.google.zxing.datamatrix.detector;

import com.google.zxing.NotFoundException;
import defpackage.DeferrableSurfaces1;
import defpackage.getBufferFormat;
import defpackage.getCaptureStage;
import defpackage.isSoftwareJpegEncoderRequested;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class Detector {
    public final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final getCaptureStage b;

    public Detector(getBufferFormat getbufferformat) throws NotFoundException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbufferformat;
        this.b = new getCaptureStage(getbufferformat);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Map<DeferrableSurfaces1, Integer> map, DeferrableSurfaces1 deferrableSurfaces1) {
        Integer num = map.get(deferrableSurfaces1);
        map.put(deferrableSurfaces1, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public static getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault2(getBufferFormat getbufferformat, DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2, DeferrableSurfaces1 deferrableSurfaces3, DeferrableSurfaces1 deferrableSurfaces4, int i, int i2) throws NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return isSoftwareJpegEncoderRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault3(getbufferformat, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces1.b, deferrableSurfaces4.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces4.b, deferrableSurfaces3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces3.b, deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces2.b);
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final DeferrableSurfaces1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final DeferrableSurfaces1 b;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2, int i, byte b) {
            this(deferrableSurfaces1, deferrableSurfaces2, i);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2, int i) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = deferrableSurfaces1;
            this.b = deferrableSurfaces2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb.append("/");
            sb.append(this.b);
            sb.append('/');
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return sb.toString();
        }
    }

    public static final class ResultPointsAndTransitionsComparator implements Serializable, Comparator<TuitionPaymentFragmentspecialinlinedviewModeldefault1> {
        private ResultPointsAndTransitionsComparator() {
        }

        public /* synthetic */ ResultPointsAndTransitionsComparator(byte b) {
            this();
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            return tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeferrableSurfaces1 deferrableSurfaces1) {
        return deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 >= 0.0f && deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < ((float) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && deferrableSurfaces1.b > 0.0f && deferrableSurfaces1.b < ((float) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
    }

    public final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2) {
        Detector detector = this;
        int i = (int) deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = (int) deferrableSurfaces1.b;
        int i3 = (int) deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = (int) deferrableSurfaces2.b;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i2 = i;
            i = i2;
            i4 = i3;
            i3 = i4;
        }
        int iAbs = Math.abs(i3 - i);
        int iAbs2 = Math.abs(i4 - i2);
        int i5 = (-iAbs) / 2;
        int i6 = i2 < i4 ? 1 : -1;
        int i7 = i >= i3 ? -1 : 1;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z ? i2 : i, z ? i : i2);
        int i8 = 0;
        while (i != i3) {
            int i9 = i3;
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = detector.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z ? i2 : i, z ? i : i2);
            if (zTuitionPaymentFragmentspecialinlinedviewModeldefault2 != zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                i8++;
                zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = zTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            i5 += iAbs2;
            if (i5 > 0) {
                if (i2 == i4) {
                    break;
                }
                i2 += i6;
                i5 -= iAbs;
            }
            i += i7;
            detector = this;
            i3 = i9;
        }
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(deferrableSurfaces1, deferrableSurfaces2, i8, (byte) 0);
    }
}
