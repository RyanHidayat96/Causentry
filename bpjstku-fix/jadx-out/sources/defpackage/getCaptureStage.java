package defpackage;

import com.google.zxing.NotFoundException;

/* JADX INFO: loaded from: classes6.dex */
public final class getCaptureStage {
    private final int TuitionPaymentFragmentbindingInflater1;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getBufferFormat TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f920a;
    private final int asBinder;
    private final int b;

    public getCaptureStage(getBufferFormat getbufferformat, int i, int i2, int i3) throws NotFoundException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbufferformat;
        int i4 = getbufferformat.b;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4;
        int i5 = getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.f920a = i5;
        int i6 = i / 2;
        int i7 = i2 - i6;
        this.b = i7;
        int i8 = i2 + i6;
        this.TuitionPaymentFragmentbindingInflater1 = i8;
        int i9 = i3 - i6;
        this.asBinder = i9;
        int i10 = i3 + i6;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i10;
        if (i9 < 0 || i7 < 0 || i10 >= i4 || i8 >= i5) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
    }

    public final DeferrableSurfaces1[] TuitionPaymentFragmentbindingInflater1() throws NotFoundException {
        int i = this.b;
        int i2 = this.TuitionPaymentFragmentbindingInflater1;
        int i3 = this.asBinder;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (z7) {
            boolean z8 = false;
            boolean zTuitionPaymentFragmentbindingInflater1 = true;
            while (true) {
                if ((!zTuitionPaymentFragmentbindingInflater1 && z2) || i2 >= this.f920a) {
                    break;
                }
                zTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(i3, i4, i2, false);
                if (zTuitionPaymentFragmentbindingInflater1) {
                    i2++;
                    z2 = true;
                    z8 = true;
                } else if (!z2) {
                    i2++;
                }
            }
            if (i2 < this.f920a) {
                boolean zTuitionPaymentFragmentbindingInflater2 = true;
                while (true) {
                    if ((!zTuitionPaymentFragmentbindingInflater2 && z4) || i4 >= this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        break;
                    }
                    zTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1(i, i2, i4, true);
                    if (zTuitionPaymentFragmentbindingInflater2) {
                        i4++;
                        z4 = true;
                        z8 = true;
                    } else if (!z4) {
                        i4++;
                    }
                }
                if (i4 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    boolean zTuitionPaymentFragmentbindingInflater3 = true;
                    while (true) {
                        if ((!zTuitionPaymentFragmentbindingInflater3 && z5) || i < 0) {
                            break;
                        }
                        zTuitionPaymentFragmentbindingInflater3 = TuitionPaymentFragmentbindingInflater1(i3, i4, i, false);
                        if (zTuitionPaymentFragmentbindingInflater3) {
                            i--;
                            z5 = true;
                            z8 = true;
                        } else if (!z5) {
                            i--;
                        }
                    }
                    if (i >= 0) {
                        z7 = z8;
                        boolean zTuitionPaymentFragmentbindingInflater4 = true;
                        while (true) {
                            if ((!zTuitionPaymentFragmentbindingInflater4 && z6) || i3 < 0) {
                                break;
                            }
                            zTuitionPaymentFragmentbindingInflater4 = TuitionPaymentFragmentbindingInflater1(i, i2, i3, true);
                            if (zTuitionPaymentFragmentbindingInflater4) {
                                i3--;
                                z7 = true;
                                z6 = true;
                            } else if (!z6) {
                                i3--;
                            }
                        }
                        if (i3 >= 0) {
                            if (z7) {
                                z3 = true;
                            }
                        }
                    }
                }
            }
            z = true;
            break;
        }
        if (z || !z3) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        int i5 = i2 - i;
        DeferrableSurfaces1 deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        DeferrableSurfaces1 deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault4 = null;
        for (int i6 = 1; deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault4 == null && i6 < i5; i6++) {
            deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault4 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i4 - i6, i + i6, i4);
        }
        if (deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        DeferrableSurfaces1 deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault5 = null;
        for (int i7 = 1; deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault5 == null && i7 < i5; i7++) {
            deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault5 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, i3 + i7, i + i7, i3);
        }
        if (deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        DeferrableSurfaces1 deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault6 = null;
        for (int i8 = 1; deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault6 == null && i8 < i5; i8++) {
            deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault6 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, i3 + i8, i2 - i8, i3);
        }
        if (deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        for (int i9 = 1; deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null && i9 < i5; i9++) {
            deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, i4 - i9, i2 - i9, i4);
        }
        if (deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            throw NotFoundException.TuitionPaymentFragmentbindingInflater1();
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2(deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault3, deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault4, deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault6, deferrableSurfaces1TuitionPaymentFragmentspecialinlinedviewModeldefault5);
    }

    private boolean TuitionPaymentFragmentbindingInflater1(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public getCaptureStage(getBufferFormat getbufferformat) throws NotFoundException {
        this(getbufferformat, 10, getbufferformat.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 2, getbufferformat.b / 2);
    }

    private DeferrableSurfaces1[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(DeferrableSurfaces1 deferrableSurfaces1, DeferrableSurfaces1 deferrableSurfaces2, DeferrableSurfaces1 deferrableSurfaces3, DeferrableSurfaces1 deferrableSurfaces4) {
        float f = deferrableSurfaces1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f2 = deferrableSurfaces1.b;
        float f3 = deferrableSurfaces2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f4 = deferrableSurfaces2.b;
        float f5 = deferrableSurfaces3.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f6 = deferrableSurfaces3.b;
        float f7 = deferrableSurfaces4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        float f8 = deferrableSurfaces4.b;
        if (f < this.f920a / 2.0f) {
            return new DeferrableSurfaces1[]{new DeferrableSurfaces1(f7 - 1.0f, f8 + 1.0f), new DeferrableSurfaces1(f3 + 1.0f, f4 + 1.0f), new DeferrableSurfaces1(f5 - 1.0f, f6 - 1.0f), new DeferrableSurfaces1(f + 1.0f, f2 - 1.0f)};
        }
        return new DeferrableSurfaces1[]{new DeferrableSurfaces1(f7 + 1.0f, f8 + 1.0f), new DeferrableSurfaces1(f3 + 1.0f, f4 - 1.0f), new DeferrableSurfaces1(f5 - 1.0f, f6 + 1.0f), new DeferrableSurfaces1(f - 1.0f, f2 - 1.0f)};
    }

    private DeferrableSurfaces1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fSqrt = (float) Math.sqrt((f5 * f5) + (f6 * f6));
        int i = (int) (fSqrt + (fSqrt < 0.0f ? -0.5f : 0.5f));
        float f7 = i;
        float f8 = (f3 - f) / f7;
        float f9 = (f4 - f2) / f7;
        for (int i2 = 0; i2 < i; i2++) {
            float f10 = i2;
            float f11 = (f10 * f8) + f;
            int i3 = (int) (f11 + (f11 < 0.0f ? -0.5f : 0.5f));
            float f12 = (f10 * f9) + f2;
            int i4 = (int) (f12 + (f12 < 0.0f ? -0.5f : 0.5f));
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i3, i4)) {
                return new DeferrableSurfaces1(i3, i4);
            }
        }
        return null;
    }
}
