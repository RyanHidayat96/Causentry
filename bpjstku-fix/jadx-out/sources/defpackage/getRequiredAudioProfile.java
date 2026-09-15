package defpackage;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
public final class getRequiredAudioProfile {
    private static final int[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {3808, 476, 2107, 1799};
    private int TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private int asBinder;
    private int asInterface;
    private boolean b;

    public getRequiredAudioProfile(getBufferFormat getbufferformat) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getbufferformat;
    }

    public final canResolveUnderSpecifiedTo TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z) throws NotFoundException {
        DeferrableSurfaces1[] deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(b());
        if (z) {
            DeferrableSurfaces1 deferrableSurfaces1 = deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
            deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[2];
            deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[2] = deferrableSurfaces1;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        getBufferFormat getbufferformat = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = this.asBinder;
        return new canResolveUnderSpecifiedTo(TuitionPaymentFragmentspecialinlinedviewModeldefault1(getbufferformat, deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[i % 4], deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[(i + 1) % 4], deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[(i + 2) % 4], deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2[(i + 3) % 4]), b(deferrableSurfaces1ArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * 2, TuitionPaymentFragmentspecialinlinedviewModeldefault3()), this.b, this.TuitionPaymentFragmentbindingInflater1, this.asInterface);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeferrableSurfaces1[] deferrableSurfaces1Arr) throws NotFoundException {
        long j;
        long j2;
        DeferrableSurfaces1 deferrableSurfaces1 = deferrableSurfaces1Arr[0];
        float f = deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i = (int) (f + (f < 0.0f ? -0.5f : 0.5f));
        float f2 = deferrableSurfaces1.b;
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, (int) (f2 + (f2 < 0.0f ? -0.5f : 0.5f)))) {
            DeferrableSurfaces1 deferrableSurfaces2 = deferrableSurfaces1Arr[1];
            float f3 = deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            int i2 = (int) (f3 + (f3 < 0.0f ? -0.5f : 0.5f));
            float f4 = deferrableSurfaces2.b;
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, (int) (f4 + (f4 < 0.0f ? -0.5f : 0.5f)))) {
                DeferrableSurfaces1 deferrableSurfaces3 = deferrableSurfaces1Arr[2];
                float f5 = deferrableSurfaces3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                int i3 = (int) (f5 + (f5 < 0.0f ? -0.5f : 0.5f));
                float f6 = deferrableSurfaces3.b;
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3, (int) (f6 + (f6 < 0.0f ? -0.5f : 0.5f)))) {
                    DeferrableSurfaces1 deferrableSurfaces4 = deferrableSurfaces1Arr[3];
                    float f7 = deferrableSurfaces4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    int i4 = (int) (f7 + (f7 < 0.0f ? -0.5f : 0.5f));
                    float f8 = deferrableSurfaces4.b;
                    if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4, (int) (f8 + (f8 >= 0.0f ? 0.5f : -0.5f)))) {
                        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * 2;
                        int[] iArr = {TuitionPaymentFragmentspecialinlinedviewModeldefault3(deferrableSurfaces1Arr[0], deferrableSurfaces1Arr[1], i5), TuitionPaymentFragmentspecialinlinedviewModeldefault3(deferrableSurfaces1Arr[1], deferrableSurfaces1Arr[2], i5), TuitionPaymentFragmentspecialinlinedviewModeldefault3(deferrableSurfaces1Arr[2], deferrableSurfaces1Arr[3], i5), TuitionPaymentFragmentspecialinlinedviewModeldefault3(deferrableSurfaces1Arr[3], deferrableSurfaces1Arr[0], i5)};
                        int i6 = 0;
                        for (int i7 = 0; i7 < 4; i7++) {
                            int i8 = iArr[i7];
                            i6 = (i6 << 3) + ((i8 >> (i5 - 2)) << 1) + (i8 & 1);
                        }
                        for (int i9 = 0; i9 < 4; i9++) {
                            if (Integer.bitCount(TuitionPaymentFragmentspecialinlinedviewModeldefault2[i9] ^ (((i6 & 1) << 11) + (i6 >> 1))) <= 2) {
                                this.asBinder = i9;
                                long j3 = 0;
                                for (int i10 = 0; i10 < 4; i10++) {
                                    int i11 = iArr[(this.asBinder + i10) % 4];
                                    if (this.b) {
                                        j = j3 << 7;
                                        j2 = (i11 >> 1) & 127;
                                    } else {
                                        j = j3 << 10;
                                        j2 = ((i11 >> 2) & 992) + ((i11 >> 1) & 31);
                                    }
                                    j3 = j + j2;
                                }
                                int iB = b(j3, this.b);
                                if (this.b) {
                                    this.asInterface = (iB >> 6) + 1;
                                    this.TuitionPaymentFragmentbindingInflater1 = (iB & 63) + 1;
                                    return;
                                } else {
                                    this.asInterface = (iB >> 11) + 1;
                                    this.TuitionPaymentFragmentbindingInflater1 = (iB & 2047) + 1;
                                    return;
                                }
                            }
                        }
                        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                    }
                }
            }
        }
        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
    }

    private static int b(long j, boolean z) throws NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int[] iArr = new int[i];
        for (int i3 = i - 1; i3 >= 0; i3--) {
            iArr[i3] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new getDefaultResolution(ImageInputConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).TuitionPaymentFragmentspecialinlinedviewModeldefault1(iArr, i - i2);
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                i4 = (i4 << 4) + iArr[i5];
            }
            return i4;
        } catch (ReedSolomonException unused) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
    }

    private DeferrableSurfaces1[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) throws NotFoundException {
        int i = 1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentbindingInflater1;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater3 = tuitionPaymentFragmentbindingInflater2;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater4 = tuitionPaymentFragmentbindingInflater3;
        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater5 = tuitionPaymentFragmentbindingInflater4;
        boolean z = true;
        while (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < 9) {
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater2, z, i, -1);
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater3, z, i, i);
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater4, z, -1, i);
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater5, z, -1, -1);
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 > 2) {
                double dTuitionPaymentFragmentbindingInflater1 = (TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault4, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1) * this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) / (TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater5, tuitionPaymentFragmentbindingInflater2) * (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 2));
                if (dTuitionPaymentFragmentbindingInflater1 < 0.75d || dTuitionPaymentFragmentbindingInflater1 > 1.25d) {
                    break;
                }
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater6 = new TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 3, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 + 3);
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater7 = new TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 3, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1 - 3);
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater8 = new TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 - 3);
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater9 = new TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 3, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1 + 3);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater9, tuitionPaymentFragmentbindingInflater6);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault2 == 0 || TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater6, tuitionPaymentFragmentbindingInflater7) != iTuitionPaymentFragmentspecialinlinedviewModeldefault2 || TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater7, tuitionPaymentFragmentbindingInflater8) != iTuitionPaymentFragmentspecialinlinedviewModeldefault2 || TuitionPaymentFragmentspecialinlinedviewModeldefault2(tuitionPaymentFragmentbindingInflater8, tuitionPaymentFragmentbindingInflater9) != iTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    break;
                }
            }
            z = !z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
            tuitionPaymentFragmentbindingInflater5 = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault4;
            tuitionPaymentFragmentbindingInflater3 = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentbindingInflater4 = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            tuitionPaymentFragmentbindingInflater2 = tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            i = 1;
        }
        int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i2 != 5 && i2 != 7) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        this.b = i2 == 5;
        DeferrableSurfaces1[] deferrableSurfaces1Arr = {new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 0.5f, tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1 - 0.5f), new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 0.5f, tuitionPaymentFragmentbindingInflater3.TuitionPaymentFragmentbindingInflater1 + 0.5f), new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 0.5f, tuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentbindingInflater1 + 0.5f), new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - 0.5f, tuitionPaymentFragmentbindingInflater5.TuitionPaymentFragmentbindingInflater1 - 0.5f)};
        int i3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * 2;
        return b(deferrableSurfaces1Arr, i3 - 3, i3);
    }

    private TuitionPaymentFragmentbindingInflater1 b() {
        DeferrableSurfaces1 deferrableSurfaces1;
        DeferrableSurfaces1 deferrableSurfaces2;
        DeferrableSurfaces1 deferrableSurfaces3;
        DeferrableSurfaces1 deferrableSurfaces4;
        DeferrableSurfaces1 deferrableSurfaces5;
        DeferrableSurfaces1 deferrableSurfaces6;
        DeferrableSurfaces1 deferrableSurfaces7;
        DeferrableSurfaces1 deferrableSurfaces8;
        try {
            DeferrableSurfaces1[] deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater1 = new getCaptureStage(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3).TuitionPaymentFragmentbindingInflater1();
            deferrableSurfaces4 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater1[0];
            deferrableSurfaces3 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater1[1];
            deferrableSurfaces2 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater1[2];
            deferrableSurfaces1 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater1[3];
        } catch (NotFoundException unused) {
            int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2;
            int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b / 2;
            int i3 = i + 7;
            int i4 = i2 - 7;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentbindingInflater1(i3, i4), false, 1, -1);
            DeferrableSurfaces1 deferrableSurfaces9 = new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
            int i5 = i2 + 7;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentbindingInflater1(i3, i5), false, 1, 1);
            DeferrableSurfaces1 deferrableSurfaces10 = new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1);
            int i6 = i - 7;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentbindingInflater1(i6, i5), false, -1, 1);
            DeferrableSurfaces1 deferrableSurfaces11 = new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1);
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentbindingInflater1(i6, i4), false, -1, -1);
            deferrableSurfaces1 = new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1);
            deferrableSurfaces2 = deferrableSurfaces11;
            deferrableSurfaces3 = deferrableSurfaces10;
            deferrableSurfaces4 = deferrableSurfaces9;
        }
        float f = (((deferrableSurfaces4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + deferrableSurfaces3.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / 4.0f;
        int i7 = (int) (f + (f < 0.0f ? -0.5f : 0.5f));
        float f2 = (((deferrableSurfaces4.b + deferrableSurfaces1.b) + deferrableSurfaces3.b) + deferrableSurfaces2.b) / 4.0f;
        int i8 = (int) (f2 + (f2 < 0.0f ? -0.5f : 0.5f));
        try {
            DeferrableSurfaces1[] deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater2 = new getCaptureStage(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, 15, i7, i8).TuitionPaymentFragmentbindingInflater1();
            deferrableSurfaces5 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater2[0];
            deferrableSurfaces6 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater2[1];
            deferrableSurfaces8 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater2[2];
            deferrableSurfaces7 = deferrableSurfaces1ArrTuitionPaymentFragmentbindingInflater2[3];
        } catch (NotFoundException unused2) {
            int i9 = i7 + 7;
            int i10 = i8 - 7;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentbindingInflater1(i9, i10), false, 1, -1);
            deferrableSurfaces5 = new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentbindingInflater1);
            int i11 = i8 + 7;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault6 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentbindingInflater1(i9, i11), false, 1, 1);
            deferrableSurfaces6 = new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentbindingInflater1);
            int i12 = i7 - 7;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault7 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentbindingInflater1(i12, i11), false, -1, 1);
            DeferrableSurfaces1 deferrableSurfaces12 = new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault7.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault7.TuitionPaymentFragmentbindingInflater1);
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault8 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(new TuitionPaymentFragmentbindingInflater1(i12, i10), false, -1, -1);
            deferrableSurfaces7 = new DeferrableSurfaces1(tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault8.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1TuitionPaymentFragmentspecialinlinedviewModeldefault8.TuitionPaymentFragmentbindingInflater1);
            deferrableSurfaces8 = deferrableSurfaces12;
        }
        float f3 = (((deferrableSurfaces5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + deferrableSurfaces7.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + deferrableSurfaces6.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + deferrableSurfaces8.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / 4.0f;
        int i13 = (int) (f3 + (f3 < 0.0f ? -0.5f : 0.5f));
        float f4 = (((deferrableSurfaces5.b + deferrableSurfaces7.b) + deferrableSurfaces6.b) + deferrableSurfaces8.b) / 4.0f;
        return new TuitionPaymentFragmentbindingInflater1(i13, (int) (f4 + (f4 >= 0.0f ? 0.5f : -0.5f)));
    }

    private getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault1(getBufferFormat getbufferformat, DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2, DeferrableSurfaces1 deferrableSurfaces3, DeferrableSurfaces1 deferrableSurfaces4) throws NotFoundException {
        isSoftwareJpegEncoderRequested issoftwarejpegencoderrequestedTuitionPaymentFragmentspecialinlinedviewModeldefault3 = isSoftwareJpegEncoderRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        float f = iTuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2.0f;
        float f2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        float f3 = f - f2;
        float f4 = f + f2;
        return issoftwarejpegencoderrequestedTuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getbufferformat, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, f3, f3, f4, f3, f4, f4, f3, f4, deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces1.b, deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces2.b, deferrableSurfaces3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces3.b, deferrableSurfaces4.TuitionPaymentFragmentspecialinlinedviewModeldefault2, deferrableSurfaces4.b);
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2, int i) {
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(deferrableSurfaces1, deferrableSurfaces2);
        float f = fTuitionPaymentFragmentspecialinlinedviewModeldefault3 / i;
        float f2 = deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f3 = deferrableSurfaces1.b;
        float f4 = ((deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) * f) / fTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        float f5 = (f * (deferrableSurfaces2.b - deferrableSurfaces1.b)) / fTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f6 = i3;
            float f7 = (f6 * f4) + f2;
            float f8 = (f6 * f5) + f3;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) (f7 + (f7 < 0.0f ? -0.5f : 0.5f)), (int) (f8 + (f8 >= 0.0f ? 0.5f : -0.5f)))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2) {
        float fTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(tuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater2);
        float f = (tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) / fTuitionPaymentFragmentbindingInflater1;
        float f2 = (tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1 - tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1) / fTuitionPaymentFragmentbindingInflater1;
        float f3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f4 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        int iCeil = (int) Math.ceil(fTuitionPaymentFragmentbindingInflater1);
        int i = 0;
        for (int i2 = 0; i2 < iCeil; i2++) {
            f3 += f;
            f4 += f2;
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1((int) ((f3 < 0.0f ? -0.5f : 0.5f) + f3), (int) ((f4 >= 0.0f ? 0.5f : -0.5f) + f4)) != zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                i++;
            }
        }
        float f5 = i / fTuitionPaymentFragmentbindingInflater1;
        if (f5 <= 0.1f || f5 >= 0.9f) {
            return (f5 <= 0.1f) == zTuitionPaymentFragmentspecialinlinedviewModeldefault1 ? 1 : -1;
        }
        return 0;
    }

    private static DeferrableSurfaces1[] b(DeferrableSurfaces1[] deferrableSurfaces1Arr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float f4 = deferrableSurfaces1Arr[0].TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f5 = deferrableSurfaces1Arr[2].TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f6 = deferrableSurfaces1Arr[0].b;
        float f7 = deferrableSurfaces1Arr[2].b;
        float f8 = (deferrableSurfaces1Arr[0].TuitionPaymentFragmentspecialinlinedviewModeldefault2 + deferrableSurfaces1Arr[2].TuitionPaymentFragmentspecialinlinedviewModeldefault2) / 2.0f;
        float f9 = (deferrableSurfaces1Arr[0].b + deferrableSurfaces1Arr[2].b) / 2.0f;
        float f10 = (f4 - f5) * f3;
        float f11 = (f6 - f7) * f3;
        DeferrableSurfaces1 deferrableSurfaces1 = new DeferrableSurfaces1(f8 + f10, f9 + f11);
        DeferrableSurfaces1 deferrableSurfaces2 = new DeferrableSurfaces1(f8 - f10, f9 - f11);
        float f12 = deferrableSurfaces1Arr[1].TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f13 = deferrableSurfaces1Arr[3].TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f14 = deferrableSurfaces1Arr[1].b;
        float f15 = deferrableSurfaces1Arr[3].b;
        float f16 = (deferrableSurfaces1Arr[1].TuitionPaymentFragmentspecialinlinedviewModeldefault2 + deferrableSurfaces1Arr[3].TuitionPaymentFragmentspecialinlinedviewModeldefault2) / 2.0f;
        float f17 = (deferrableSurfaces1Arr[1].b + deferrableSurfaces1Arr[3].b) / 2.0f;
        float f18 = (f12 - f13) * f3;
        float f19 = f3 * (f14 - f15);
        return new DeferrableSurfaces1[]{deferrableSurfaces1, new DeferrableSurfaces1(f16 + f18, f17 + f19), deferrableSurfaces2, new DeferrableSurfaces1(f16 - f18, f17 - f19)};
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2) {
        return i >= 0 && i < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && i2 > 0 && i2 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (this.b) {
            return (this.asInterface * 4) + 11;
        }
        int i = this.asInterface;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    static final class TuitionPaymentFragmentbindingInflater1 {
        final int TuitionPaymentFragmentbindingInflater1;
        final int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentbindingInflater1(int i, int i2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
            this.TuitionPaymentFragmentbindingInflater1 = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            sb.append(' ');
            sb.append(this.TuitionPaymentFragmentbindingInflater1);
            sb.append(Typography.greater);
            return sb.toString();
        }
    }

    private static float TuitionPaymentFragmentspecialinlinedviewModeldefault3(DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2) {
        float f = deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f2 = deferrableSurfaces1.b;
        float f3 = f - deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f4 = f2 - deferrableSurfaces2.b;
        return (float) Math.sqrt((f3 * f3) + (f4 * f4));
    }

    private static float TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2) {
        int i = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
        int i3 = i - tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        int i4 = i2 - tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1;
        return (float) Math.sqrt((i3 * i3) + (i4 * i4));
    }

    private TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, boolean z, int i, int i2) {
        int i3 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + i;
        int i4 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1;
        while (true) {
            i4 += i2;
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3, i4) || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3, i4) != z) {
                break;
            }
            i3 += i;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        while (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5, i6) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i5, i6) == z) {
            i5 += i;
        }
        int i7 = i5 - i;
        while (TuitionPaymentFragmentspecialinlinedviewModeldefault3(i7, i6) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i7, i6) == z) {
            i6 += i2;
        }
        return new TuitionPaymentFragmentbindingInflater1(i7, i6 - i2);
    }
}
