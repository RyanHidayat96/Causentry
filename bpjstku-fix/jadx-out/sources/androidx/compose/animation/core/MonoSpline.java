package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0014J'\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J?\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010 "}, d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "", "p0", "", "p1", "", "p2", "<init>", "([F[[FF)V", "p3", "p4", "p5", "diff", "(FFFFFF)F", "Landroidx/compose/animation/core/AnimationVector;", "", "", "getPos", "(FLandroidx/compose/animation/core/AnimationVector;I)V", "(FI)F", "getSlope", "(F[F)V", "interpolate", "makeFloatArray", "(II)[[F", "", "isExtrapolate", "Z", "slopeTemp", "[F", "tangents", "[[F", "timePoints", "values"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MonoSpline {
    public static final int $stable = 8;
    private final boolean isExtrapolate = true;
    private final float[] slopeTemp;
    private final float[][] tangents;
    private final float[] timePoints;
    private final float[][] values;

    private final float diff(float p0, float p1, float p2, float p3, float p4, float p5) {
        float f = p1 * p1;
        float f2 = p1 * 6.0f;
        float f3 = 3.0f * p0;
        return ((((((((((-6.0f) * f) * p3) + (p3 * f2)) + ((6.0f * f) * p2)) - (f2 * p2)) + ((f3 * p5) * f)) + ((f3 * p4) * f)) - (((2.0f * p0) * p5) * p1)) - (((4.0f * p0) * p4) * p1)) + (p0 * p4);
    }

    private final float interpolate(float p0, float p1, float p2, float p3, float p4, float p5) {
        float f = p1 * p1;
        float f2 = f * p1;
        float f3 = 3.0f * f;
        float f4 = p5 * p0;
        float f5 = p0 * p4;
        return (((((((((((-2.0f) * f2) * p3) + (p3 * f3)) + ((f2 * 2.0f) * p2)) - (f3 * p2)) + p2) + (f4 * f2)) + (f2 * f5)) - (f4 * f)) - (((p0 * 2.0f) * p4) * f)) + (f5 * p1);
    }

    public MonoSpline(float[] fArr, float[][] fArr2, float f) {
        int i;
        int length = fArr.length;
        int i2 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i3 = length - 1;
        float[][] fArrMakeFloatArray = makeFloatArray(i3, length2);
        float[][] fArrMakeFloatArray2 = makeFloatArray(length, length2);
        for (int i4 = 0; i4 < length2; i4++) {
            int i5 = 0;
            while (i5 < i3) {
                int i6 = i5 + 1;
                float f2 = fArr[i6];
                float f3 = fArr[i5];
                float[] fArr3 = fArrMakeFloatArray[i5];
                float f4 = (fArr2[i6][i4] - fArr2[i5][i4]) / (f2 - f3);
                fArr3[i4] = f4;
                if (i5 == 0) {
                    fArrMakeFloatArray2[i5][i4] = f4;
                } else {
                    fArrMakeFloatArray2[i5][i4] = (fArrMakeFloatArray[i5 - 1][i4] + f4) * 0.5f;
                }
                i5 = i6;
            }
            fArrMakeFloatArray2[i3][i4] = fArrMakeFloatArray[length - 2][i4];
        }
        if (!Float.isNaN(f)) {
            for (int i7 = 0; i7 < length2; i7++) {
                float[] fArr4 = fArrMakeFloatArray[length - 2];
                float f5 = fArr4[i7];
                float[] fArr5 = fArrMakeFloatArray[0];
                float f6 = (f5 * (1.0f - f)) + (fArr5[i7] * f);
                fArr5[i7] = f6;
                fArr4[i7] = f6;
                fArrMakeFloatArray2[i3][i7] = f6;
                fArrMakeFloatArray2[0][i7] = f6;
            }
        }
        int i8 = 0;
        while (i8 < i3) {
            int i9 = i2;
            while (i9 < length2) {
                float f7 = fArrMakeFloatArray[i8][i9];
                if (f7 == 0.0f) {
                    fArrMakeFloatArray2[i8][i9] = 0.0f;
                    fArrMakeFloatArray2[i8 + 1][i9] = 0.0f;
                    i = length2;
                } else {
                    float f8 = fArrMakeFloatArray2[i8][i9] / f7;
                    int i10 = i8 + 1;
                    float f9 = fArrMakeFloatArray2[i10][i9] / f7;
                    i = length2;
                    float fHypot = (float) Math.hypot(f8, f9);
                    if (fHypot > 9.0d) {
                        float f10 = 3.0f / fHypot;
                        float[] fArr6 = fArrMakeFloatArray2[i8];
                        float[] fArr7 = fArrMakeFloatArray[i8];
                        fArr6[i9] = f8 * f10 * fArr7[i9];
                        fArrMakeFloatArray2[i10][i9] = f10 * f9 * fArr7[i9];
                    }
                }
                i9++;
                length2 = i;
            }
            i8++;
            i2 = 0;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = fArrMakeFloatArray2;
    }

    private final float[][] makeFloatArray(int p0, int p1) {
        float[][] fArr = new float[p0][];
        for (int i = 0; i < p0; i++) {
            fArr[i] = new float[p1];
        }
        return fArr;
    }

    public final float getPos(float p0, int p1) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i = 0;
        if (this.isExtrapolate) {
            float f = fArr[0];
            if (p0 <= f) {
                return this.values[0][p1] + ((p0 - f) * getSlope(f, p1));
            }
            int i2 = length - 1;
            float f2 = fArr[i2];
            if (p0 >= f2) {
                return this.values[i2][p1] + ((p0 - f2) * getSlope(f2, p1));
            }
        } else {
            if (p0 <= fArr[0]) {
                return this.values[0][p1];
            }
            int i3 = length - 1;
            if (p0 >= fArr[i3]) {
                return this.values[i3][p1];
            }
        }
        while (i < length - 1) {
            float[] fArr2 = this.timePoints;
            float f3 = fArr2[i];
            if (p0 == f3) {
                return this.values[i][p1];
            }
            int i4 = i + 1;
            float f4 = fArr2[i4];
            if (p0 < f4) {
                float f5 = f4 - f3;
                float f6 = (p0 - f3) / f5;
                float[][] fArr3 = this.values;
                float f7 = fArr3[i][p1];
                float f8 = fArr3[i4][p1];
                float[][] fArr4 = this.tangents;
                return interpolate(f5, f6, f7, f8, fArr4[i][p1], fArr4[i4][p1]);
            }
            i = i4;
        }
        return 0.0f;
    }

    public static /* synthetic */ void getPos$default(MonoSpline monoSpline, float f, AnimationVector animationVector, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        monoSpline.getPos(f, animationVector, i);
    }

    public final void getPos(float p0, AnimationVector p1, int p2) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i = 0;
        int length2 = this.values[0].length;
        if (this.isExtrapolate) {
            float f = fArr[0];
            if (p0 <= f) {
                getSlope(f, this.slopeTemp);
                for (int i2 = 0; i2 < length2; i2++) {
                    p1.set$animation_core_release(i2, this.values[0][i2] + ((p0 - this.timePoints[0]) * this.slopeTemp[i2]));
                }
                return;
            }
            int i3 = length - 1;
            float f2 = fArr[i3];
            if (p0 >= f2) {
                getSlope(f2, this.slopeTemp);
                while (i < length2) {
                    p1.set$animation_core_release(i, this.values[i3][i] + ((p0 - this.timePoints[i3]) * this.slopeTemp[i]));
                    i++;
                }
                return;
            }
        } else {
            if (p0 <= fArr[0]) {
                for (int i4 = 0; i4 < length2; i4++) {
                    p1.set$animation_core_release(i4, this.values[0][i4]);
                }
                return;
            }
            int i5 = length - 1;
            if (p0 >= fArr[i5]) {
                while (i < length2) {
                    p1.set$animation_core_release(i, this.values[i5][i]);
                    i++;
                }
                return;
            }
        }
        int i6 = p2;
        while (i6 < length - 1) {
            if (p0 == this.timePoints[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    p1.set$animation_core_release(i7, this.values[i6][i7]);
                }
            }
            float[] fArr2 = this.timePoints;
            int i8 = i6 + 1;
            float f3 = fArr2[i8];
            if (p0 < f3) {
                float f4 = fArr2[i6];
                float f5 = f3 - f4;
                float f6 = (p0 - f4) / f5;
                for (int i9 = 0; i9 < length2; i9++) {
                    float[][] fArr3 = this.values;
                    float f7 = fArr3[i6][i9];
                    float f8 = fArr3[i8][i9];
                    float[][] fArr4 = this.tangents;
                    p1.set$animation_core_release(i9, interpolate(f5, f6, f7, f8, fArr4[i6][i9], fArr4[i8][i9]));
                }
                return;
            }
            i6 = i8;
        }
    }

    public final void getSlope(float p0, float[] p1) {
        float f;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int length2 = this.values[0].length;
        float f2 = fArr[0];
        if (p0 <= f2) {
            f = f2;
        } else {
            f = fArr[length - 1];
            if (p0 < f) {
                f = p0;
            }
        }
        int i = 0;
        while (i < length - 1) {
            float[] fArr2 = this.timePoints;
            int i2 = i + 1;
            float f3 = fArr2[i2];
            if (f <= f3) {
                float f4 = fArr2[i];
                float f5 = f3 - f4;
                float f6 = (f - f4) / f5;
                for (int i3 = 0; i3 < length2; i3++) {
                    float[][] fArr3 = this.values;
                    float f7 = fArr3[i][i3];
                    float f8 = fArr3[i2][i3];
                    float[][] fArr4 = this.tangents;
                    p1[i3] = diff(f5, f6, f7, f8, fArr4[i][i3], fArr4[i2][i3]) / f5;
                }
                return;
            }
            i = i2;
        }
    }

    public static /* synthetic */ void getSlope$default(MonoSpline monoSpline, float f, AnimationVector animationVector, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        monoSpline.getSlope(f, animationVector, i);
    }

    public final void getSlope(float p0, AnimationVector p1, int p2) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int length2 = this.values[0].length;
        if (p0 <= fArr[0]) {
            for (int i = 0; i < length2; i++) {
                p1.set$animation_core_release(i, this.tangents[0][i]);
            }
            return;
        }
        int i2 = length - 1;
        if (p0 >= fArr[i2]) {
            for (int i3 = 0; i3 < length2; i3++) {
                p1.set$animation_core_release(i3, this.tangents[i2][i3]);
            }
            return;
        }
        int i4 = p2;
        while (i4 < i2) {
            float[] fArr2 = this.timePoints;
            int i5 = i4 + 1;
            float f = fArr2[i5];
            if (p0 <= f) {
                float f2 = fArr2[i4];
                float f3 = f - f2;
                float f4 = (p0 - f2) / f3;
                for (int i6 = 0; i6 < length2; i6++) {
                    float[][] fArr3 = this.values;
                    float f5 = fArr3[i4][i6];
                    float f6 = fArr3[i5][i6];
                    float[][] fArr4 = this.tangents;
                    p1.set$animation_core_release(i6, diff(f3, f4, f5, f6, fArr4[i4][i6], fArr4[i5][i6]) / f3);
                }
                return;
            }
            i4 = i5;
        }
    }

    private final float getSlope(float p0, int p1) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i = 0;
        float f = fArr[0];
        if (p0 >= f) {
            float f2 = fArr[length - 1];
            if (p0 >= f2) {
                p0 = f2;
            }
        } else {
            p0 = f;
        }
        while (i < length - 1) {
            float[] fArr2 = this.timePoints;
            int i2 = i + 1;
            float f3 = fArr2[i2];
            if (p0 <= f3) {
                float f4 = fArr2[i];
                float f5 = f3 - f4;
                float f6 = (p0 - f4) / f5;
                float[][] fArr3 = this.values;
                float f7 = fArr3[i][p1];
                float f8 = fArr3[i2][p1];
                float[][] fArr4 = this.tangents;
                return diff(f5, f6, f7, f8, fArr4[i][p1], fArr4[i2][p1]) / f5;
            }
            i = i2;
        }
        return 0.0f;
    }
}
