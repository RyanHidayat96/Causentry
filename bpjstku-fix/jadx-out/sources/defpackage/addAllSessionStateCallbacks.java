package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes6.dex */
public final class addAllSessionStateCallbacks {
    public final getBufferFormat TuitionPaymentFragmentbindingInflater1;
    public canMatchEncoding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public addAllSessionStateCallbacks(getBufferFormat getbufferformat) {
        this.TuitionPaymentFragmentbindingInflater1 = getbufferformat;
    }

    private float TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else if (i5 >= this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            f = ((this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1) - i) / (i5 - i);
            i5 = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i7 = (int) (f3 - ((i4 - i2) * f));
        if (i7 < 0) {
            f2 = f3 / (i2 - i7);
        } else if (i7 >= this.TuitionPaymentFragmentbindingInflater1.b) {
            f2 = ((this.TuitionPaymentFragmentbindingInflater1.b - 1) - i2) / (i7 - i2);
            i6 = this.TuitionPaymentFragmentbindingInflater1.b - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (fTuitionPaymentFragmentspecialinlinedviewModeldefault1 + TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }

    private float TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        double dSqrt;
        int i10 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int iAbs = Math.abs(i7 - i5);
        int i11 = i8 - i6;
        int iAbs2 = Math.abs(i11);
        int i12 = 2;
        int i13 = (-iAbs) / 2;
        int i14 = i5 < i7 ? 1 : -1;
        int i15 = i6 < i8 ? 1 : -1;
        int i16 = i7 + i14;
        int i17 = i5;
        int i18 = i6;
        int i19 = 0;
        while (true) {
            if (i17 == i16) {
                i16 = i16;
                i11 = i11;
                i9 = i12;
                break;
            }
            boolean z2 = z;
            if ((i19 == i10 ? i10 : 0) == this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z ? i18 : i17, z ? i17 : i18)) {
                if (i19 == 2) {
                    int i20 = i17 - i5;
                    int i21 = i18 - i6;
                    dSqrt = Math.sqrt((i20 * i20) + (i21 * i21));
                } else {
                    i19++;
                }
                return (float) dSqrt;
            }
            i13 += iAbs2;
            if (i13 > 0) {
                if (i18 == i8) {
                    i9 = 2;
                    break;
                }
                i18 += i15;
                i13 -= iAbs;
            }
            i17 += i14;
            i11 = i11;
            i16 = i16;
            z = z2;
            i10 = 1;
            i12 = 2;
        }
        if (i19 != i9) {
            return Float.NaN;
        }
        int i22 = i16 - i5;
        dSqrt = Math.sqrt((i22 * i22) + (i11 * i11));
        return (float) dSqrt;
    }

    private float b(DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2) {
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2((int) deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (int) deferrableSurfaces1.b, (int) deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (int) deferrableSurfaces2.b);
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2((int) deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (int) deferrableSurfaces2.b, (int) deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (int) deferrableSurfaces1.b);
        if (Float.isNaN(fTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
            return fTuitionPaymentFragmentspecialinlinedviewModeldefault3 / 7.0f;
        }
        return Float.isNaN(fTuitionPaymentFragmentspecialinlinedviewModeldefault3) ? fTuitionPaymentFragmentspecialinlinedviewModeldefault2 / 7.0f : (fTuitionPaymentFragmentspecialinlinedviewModeldefault2 + fTuitionPaymentFragmentspecialinlinedviewModeldefault3) / 14.0f;
    }

    public getMaxCaptureStages TuitionPaymentFragmentbindingInflater1(addRepeatingCameraCaptureCallback addrepeatingcameracapturecallback) throws NotFoundException, FormatException {
        int i;
        int i2;
        SessionConfigBaseBuilder sessionConfigBaseBuilderB;
        float f;
        float f2;
        float f3;
        DeferrableSurfaces1[] deferrableSurfaces1Arr;
        int i3;
        int i4;
        int i5;
        char c;
        int i6;
        addAllSessionStateCallbacks addallsessionstatecallbacks = this;
        addNonRepeatingSurface addnonrepeatingsurface = addrepeatingcameracapturecallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        addNonRepeatingSurface addnonrepeatingsurface2 = addrepeatingcameracapturecallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        addNonRepeatingSurface addnonrepeatingsurface3 = addrepeatingcameracapturecallback.b;
        float fB = (addallsessionstatecallbacks.b(addnonrepeatingsurface, addnonrepeatingsurface2) + addallsessionstatecallbacks.b(addnonrepeatingsurface, addnonrepeatingsurface3)) / 2.0f;
        if (fB < 1.0f) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        float fTuitionPaymentFragmentbindingInflater1 = DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(addnonrepeatingsurface, addnonrepeatingsurface2) / fB;
        int i7 = (int) (fTuitionPaymentFragmentbindingInflater1 + (fTuitionPaymentFragmentbindingInflater1 < 0.0f ? -0.5f : 0.5f));
        float fTuitionPaymentFragmentbindingInflater2 = DeferrableSurfaces1.TuitionPaymentFragmentbindingInflater1(addnonrepeatingsurface, addnonrepeatingsurface3) / fB;
        int i8 = (i7 + ((int) (fTuitionPaymentFragmentbindingInflater2 + (fTuitionPaymentFragmentbindingInflater2 >= 0.0f ? 0.5f : -0.5f)))) / 2;
        int i9 = i8 + 7;
        int i10 = i9 & 3;
        if (i10 == 0) {
            i9 = i8 + 8;
        } else if (i10 == 2) {
            i9 = i8 + 6;
        } else if (i10 == 3) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        int i11 = i9;
        SessionConfigBuilder sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1 = SessionConfigBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i11);
        int i12 = sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 * 4;
        int i13 = 0;
        int i14 = 1;
        if (sessionConfigBuilderTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length <= 0) {
            i = i14;
            i2 = i11;
            sessionConfigBaseBuilderB = null;
            break;
        }
        float f4 = addnonrepeatingsurface2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f5 = addnonrepeatingsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f6 = addnonrepeatingsurface3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f7 = addnonrepeatingsurface2.b;
        float f8 = addnonrepeatingsurface.b;
        float f9 = addnonrepeatingsurface3.b;
        float f10 = 1.0f - (3.0f / (i12 + 10));
        int i15 = (int) (addnonrepeatingsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + ((((f4 - f5) + f6) - addnonrepeatingsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2) * f10));
        int i16 = (int) (addnonrepeatingsurface.b + (f10 * (((f7 - f8) + f9) - addnonrepeatingsurface.b)));
        int i17 = 4;
        loop0: while (true) {
            if (i17 > 16) {
                i = i14;
                i2 = i11;
                sessionConfigBaseBuilderB = null;
                break;
            }
            int i18 = (int) (i17 * fB);
            try {
                int iMax = Math.max(i13, i15 - i18);
                int iMin = Math.min(addallsessionstatecallbacks.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - i14, i15 + i18) - iMax;
                float f11 = fB * 3.0f;
                if (iMin < f11) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                int iMax2 = Math.max(i13, i16 - i18);
                int iMin2 = Math.min(addallsessionstatecallbacks.TuitionPaymentFragmentbindingInflater1.b - i14, i18 + i16) - iMax2;
                if (iMin2 < f11) {
                    throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                }
                getBufferFormat getbufferformat = addallsessionstatecallbacks.TuitionPaymentFragmentbindingInflater1;
                i3 = i16;
                try {
                    canMatchEncoding canmatchencoding = addallsessionstatecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    i4 = i15;
                    int i19 = i13;
                    i2 = i11;
                    try {
                        getSingleCameraCaptureCallbacks getsinglecameracapturecallbacks = new getSingleCameraCaptureCallbacks(getbufferformat, iMax, iMax2, iMin, iMin2, fB, canmatchencoding);
                        int i20 = getsinglecameracapturecallbacks.TuitionPaymentFragmentbindingInflater1;
                        int i21 = getsinglecameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        int i22 = getsinglecameracapturecallbacks.d + i20;
                        int i23 = getsinglecameracapturecallbacks.b;
                        int i24 = i21 / 2;
                        int[] iArr = new int[3];
                        int i25 = i19;
                        while (i25 < i21) {
                            if ((i25 & 1) == 0) {
                                c = 2;
                                i6 = (i25 + 1) / 2;
                            } else {
                                c = 2;
                                i6 = -((i25 + 1) / 2);
                            }
                            int i26 = i6 + i23 + i24;
                            iArr[i19] = i19;
                            try {
                                iArr[1] = i19;
                                iArr[c] = i19;
                                int i27 = i20;
                                while (i27 < i22 && !getsinglecameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i27, i26)) {
                                    i27++;
                                }
                                int i28 = 0;
                                while (i27 < i22) {
                                    fB = fB;
                                    try {
                                        if (!getsinglecameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i27, i26)) {
                                            i20 = i20;
                                            i5 = 1;
                                            if (i28 == 1) {
                                                i28++;
                                            }
                                            iArr[i28] = iArr[i28] + 1;
                                        } else if (i28 == 1) {
                                            try {
                                                iArr[1] = iArr[1] + 1;
                                                i5 = 1;
                                            } catch (NotFoundException unused) {
                                                i5 = 1;
                                            }
                                        } else if (i28 == 2) {
                                            if (getsinglecameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr) && (sessionConfigBaseBuilderB = getsinglecameracapturecallbacks.b(iArr, i26, i27)) != null) {
                                                i = 1;
                                                break loop0;
                                            }
                                            iArr[0] = iArr[2];
                                            try {
                                                iArr[1] = 1;
                                                iArr[2] = 0;
                                                i28 = 1;
                                                i5 = 1;
                                            } catch (NotFoundException unused2) {
                                                i5 = 1;
                                            }
                                        } else {
                                            i28++;
                                            i20 = i20;
                                            i5 = 1;
                                            iArr[i28] = iArr[i28] + 1;
                                        }
                                        try {
                                            i27++;
                                            fB = fB;
                                            i20 = i20;
                                        } catch (NotFoundException unused3) {
                                        }
                                    } catch (NotFoundException unused4) {
                                        i5 = 1;
                                    }
                                }
                                float f12 = fB;
                                int i29 = i20;
                                i = 1;
                                if (getsinglecameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault2(iArr) && (sessionConfigBaseBuilderB = getsinglecameracapturecallbacks.b(iArr, i26, i22)) != null) {
                                    break loop0;
                                }
                                i25++;
                                fB = f12;
                                i20 = i29;
                                i19 = 0;
                            } catch (NotFoundException unused5) {
                                fB = fB;
                                i5 = 1;
                            }
                        }
                        i = 1;
                        if (!getsinglecameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isEmpty()) {
                            sessionConfigBaseBuilderB = getsinglecameracapturecallbacks.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(0);
                            break loop0;
                        }
                        throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
                    } catch (NotFoundException unused6) {
                        fB = fB;
                    }
                } catch (NotFoundException unused7) {
                    i4 = i15;
                    i5 = i14;
                    i2 = i11;
                }
            } catch (NotFoundException unused8) {
                i3 = i16;
            }
            i4 = i15;
            i5 = i14;
            i2 = i11;
            i17 <<= 1;
            addallsessionstatecallbacks = this;
            i14 = i5;
            i16 = i3;
            i15 = i4;
            fB = fB;
            i11 = i2;
            i13 = 0;
        }
        int i30 = i2;
        float f13 = i30 - 3.5f;
        if (sessionConfigBaseBuilderB != null) {
            f = sessionConfigBaseBuilderB.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            f2 = sessionConfigBaseBuilderB.b;
            f3 = f13 - 3.0f;
        } else {
            f = (addnonrepeatingsurface2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - addnonrepeatingsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2) + addnonrepeatingsurface3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            f2 = (addnonrepeatingsurface2.b - addnonrepeatingsurface.b) + addnonrepeatingsurface3.b;
            f3 = f13;
        }
        int i31 = i;
        getBufferFormat getbufferformatB = isSoftwareJpegEncoderRequested.TuitionPaymentFragmentspecialinlinedviewModeldefault3().b(this.TuitionPaymentFragmentbindingInflater1, i30, i30, ImageInputConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(3.5f, 3.5f, f13, 3.5f, f3, f3, 3.5f, f13, addnonrepeatingsurface.TuitionPaymentFragmentspecialinlinedviewModeldefault2, addnonrepeatingsurface.b, addnonrepeatingsurface2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, addnonrepeatingsurface2.b, f, f2, addnonrepeatingsurface3.TuitionPaymentFragmentspecialinlinedviewModeldefault2, addnonrepeatingsurface3.b));
        if (sessionConfigBaseBuilderB == null) {
            deferrableSurfaces1Arr = new DeferrableSurfaces1[3];
            deferrableSurfaces1Arr[0] = addnonrepeatingsurface3;
            deferrableSurfaces1Arr[i31] = addnonrepeatingsurface;
            deferrableSurfaces1Arr[2] = addnonrepeatingsurface2;
        } else {
            DeferrableSurfaces1[] deferrableSurfaces1Arr2 = new DeferrableSurfaces1[4];
            deferrableSurfaces1Arr2[0] = addnonrepeatingsurface3;
            deferrableSurfaces1Arr2[i31] = addnonrepeatingsurface;
            deferrableSurfaces1Arr2[2] = addnonrepeatingsurface2;
            deferrableSurfaces1Arr2[3] = sessionConfigBaseBuilderB;
            deferrableSurfaces1Arr = deferrableSurfaces1Arr2;
        }
        return new getMaxCaptureStages(getbufferformatB, deferrableSurfaces1Arr);
    }
}
