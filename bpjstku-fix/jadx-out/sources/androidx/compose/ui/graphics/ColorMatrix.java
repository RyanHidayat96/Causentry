package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\rH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J<\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\"\u0010\u0007\u001a\u001e\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0017\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0017\u0012\u0004\u0012\u00020\r0\u0016H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u0015J\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010#\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b$\u0010\u001eJ\u0015\u0010'\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b&\u0010\u001eJ\u0015\u0010)\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b(\u0010\u001eJ\r\u0010+\u001a\u00020\r¢\u0006\u0004\b*\u0010\u0012J\r\u0010-\u001a\u00020\r¢\u0006\u0004\b,\u0010\u0012J\u001a\u0010/\u001a\u00020.2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109\u0088\u00016\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "", "p0", "constructor-impl", "([F)[F", "", "p1", "", "get-impl", "([FII)F", "get", "p2", "", "set-impl", "([FIIF)V", "set", "reset-impl", "([F)V", "reset", "set-jHG-Opc", "([F[F)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "rotateInternal-impl", "([FFLkotlin/jvm/functions/Function2;)V", "rotateInternal", "timesAssign-jHG-Opc", "timesAssign", "setToSaturation-impl", "([FF)V", "setToSaturation", "p3", "setToScale-impl", "([FFFFF)V", "setToScale", "setToRotateRed-impl", "setToRotateRed", "setToRotateGreen-impl", "setToRotateGreen", "setToRotateBlue-impl", "setToRotateBlue", "convertRgbToYuv-impl", "convertRgbToYuv", "convertYuvToRgb-impl", "convertYuvToRgb", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "values", "[F", "getValues", "()[F"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class ColorMatrix {
    private final float[] values;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m4274constructorimpl(float[] fArr) {
        return fArr;
    }

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    public final float[] getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m4275constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m4274constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m4280getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m4284setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    /* JADX INFO: renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m4285setjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length < 20 || fArr2.length < 20) {
            return;
        }
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[3];
        fArr[4] = fArr2[4];
        fArr[5] = fArr2[5];
        fArr[6] = fArr2[6];
        fArr[7] = fArr2[7];
        fArr[8] = fArr2[8];
        fArr[9] = fArr2[9];
        fArr[10] = fArr2[10];
        fArr[11] = fArr2[11];
        fArr[12] = fArr2[12];
        fArr[13] = fArr2[13];
        fArr[14] = fArr2[14];
        fArr[15] = fArr2[15];
        fArr[16] = fArr2[16];
        fArr[17] = fArr2[17];
        fArr[18] = fArr2[18];
        fArr[19] = fArr2[19];
    }

    /* JADX INFO: renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m4291timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length < 20) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[5];
        float f5 = fArr[2];
        float f6 = fArr2[10];
        float f7 = fArr[3];
        float f8 = fArr2[15];
        float f9 = fArr2[1];
        float f10 = fArr2[6];
        float f11 = fArr2[11];
        float f12 = fArr2[16];
        float f13 = fArr2[2];
        float f14 = fArr2[7];
        float f15 = fArr2[12];
        float f16 = fArr2[17];
        float f17 = fArr2[3];
        float f18 = fArr2[8];
        float f19 = fArr2[13];
        float f20 = fArr2[18];
        float f21 = fArr2[4];
        float f22 = fArr2[9];
        float f23 = fArr2[14];
        float f24 = fArr2[19];
        float f25 = fArr[4];
        float f26 = fArr[5];
        float f27 = fArr[6];
        float f28 = fArr[7];
        float f29 = fArr[8];
        float f30 = fArr[9];
        float f31 = fArr[10];
        float f32 = fArr[11];
        float f33 = fArr[12];
        float f34 = fArr[13];
        float f35 = fArr[14];
        float f36 = fArr[15];
        float f37 = fArr[16];
        float f38 = fArr[17];
        float f39 = fArr[18];
        float f40 = fArr[19];
        fArr[0] = (f * f2) + (f3 * f4) + (f5 * f6) + (f7 * f8);
        fArr[1] = (f * f9) + (f3 * f10) + (f5 * f11) + (f7 * f12);
        fArr[2] = (f * f13) + (f3 * f14) + (f5 * f15) + (f7 * f16);
        fArr[3] = (f * f17) + (f3 * f18) + (f5 * f19) + (f7 * f20);
        fArr[4] = (f * f21) + (f3 * f22) + (f5 * f23) + (f7 * f24) + f25;
        fArr[5] = (f26 * f2) + (f27 * f4) + (f28 * f6) + (f29 * f8);
        fArr[6] = (f26 * f9) + (f27 * f10) + (f28 * f11) + (f29 * f12);
        fArr[7] = (f26 * f13) + (f27 * f14) + (f28 * f15) + (f29 * f16);
        fArr[8] = (f26 * f17) + (f27 * f18) + (f28 * f19) + (f29 * f20);
        fArr[9] = (f26 * f21) + (f27 * f22) + (f28 * f23) + (f29 * f24) + f30;
        fArr[10] = (f31 * f2) + (f32 * f4) + (f33 * f6) + (f34 * f8);
        fArr[11] = (f31 * f9) + (f32 * f10) + (f33 * f11) + (f34 * f12);
        fArr[12] = (f31 * f13) + (f32 * f14) + (f33 * f15) + (f34 * f16);
        fArr[13] = (f31 * f17) + (f32 * f18) + (f33 * f19) + (f34 * f20);
        fArr[14] = (f31 * f21) + (f32 * f22) + (f33 * f23) + (f34 * f24) + f35;
        fArr[15] = (f2 * f36) + (f4 * f37) + (f6 * f38) + (f8 * f39);
        fArr[16] = (f9 * f36) + (f10 * f37) + (f11 * f38) + (f12 * f39);
        fArr[17] = (f13 * f36) + (f14 * f37) + (f15 * f38) + (f16 * f39);
        fArr[18] = (f17 * f36) + (f18 * f37) + (f19 * f38) + (f20 * f39);
        fArr[19] = (f36 * f21) + (f37 * f22) + (f38 * f23) + (f39 * f24) + f40;
    }

    /* JADX INFO: renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m4289setToSaturationimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = 1.0f - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    /* JADX INFO: renamed from: setToScale-impl, reason: not valid java name */
    public static final void m4290setToScaleimpl(float[] fArr, float f, float f2, float f3, float f4) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    /* JADX INFO: renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m4288setToRotateRedimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float f3 = 0.25f + f2;
        float fFloor = f3 - ((float) Math.floor(f3 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f4 = 1.0f - fAbs;
        float f5 = ((fFloor * 8.0f) * f4) / (1.25f - (fAbs * f4));
        float fFloor2 = f2 - ((float) Math.floor(0.5f + f2));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f6 = 1.0f - fAbs2;
        float f7 = ((fFloor2 * 8.0f) * f6) / (1.25f - (fAbs2 * f6));
        fArr[6] = f5;
        fArr[7] = f7;
        fArr[11] = -f7;
        fArr[12] = f5;
    }

    /* JADX INFO: renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m4287setToRotateGreenimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float f3 = 0.25f + f2;
        float fFloor = f3 - ((float) Math.floor(f3 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f4 = 1.0f - fAbs;
        float f5 = ((fFloor * 8.0f) * f4) / (1.25f - (fAbs * f4));
        float fFloor2 = f2 - ((float) Math.floor(0.5f + f2));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f6 = 1.0f - fAbs2;
        float f7 = ((fFloor2 * 8.0f) * f6) / (1.25f - (fAbs2 * f6));
        fArr[0] = f5;
        fArr[2] = -f7;
        fArr[10] = f7;
        fArr[12] = f5;
    }

    /* JADX INFO: renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m4286setToRotateBlueimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float f3 = 0.25f + f2;
        float fFloor = f3 - ((float) Math.floor(f3 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f4 = 1.0f - fAbs;
        float f5 = ((fFloor * 8.0f) * f4) / (1.25f - (fAbs * f4));
        float fFloor2 = f2 - ((float) Math.floor(0.5f + f2));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f6 = 1.0f - fAbs2;
        float f7 = ((fFloor2 * 8.0f) * f6) / (1.25f - (fAbs2 * f6));
        fArr[0] = f5;
        fArr[1] = f7;
        fArr[5] = -f7;
        fArr[6] = f5;
    }

    /* JADX INFO: renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m4276convertRgbToYuvimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* JADX INFO: renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m4277convertYuvToRgbimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m4282resetimpl(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
    }

    /* JADX INFO: renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m4283rotateInternalimpl(float[] fArr, float f, Function2<? super Float, ? super Float, Unit> function2) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float f3 = 0.25f + f2;
        float fFloor = f3 - ((float) Math.floor(f3 + 0.5f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f4 = 1.0f - fAbs;
        float fFloor2 = f2 - ((float) Math.floor(0.5f + f2));
        float fAbs2 = Math.abs(fFloor2) * 2.0f;
        float f5 = 1.0f - fAbs2;
        function2.invoke(Float.valueOf(((fFloor * 8.0f) * f4) / (1.25f - (fAbs * f4))), Float.valueOf(((fFloor2 * 8.0f) * f5) / (1.25f - (fAbs2 * f5))));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m4273boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4278equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && Intrinsics.areEqual(fArr, ((ColorMatrix) obj).m4293unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4279equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4281hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4292toStringimpl(float[] fArr) {
        StringBuilder sb = new StringBuilder("ColorMatrix(values=");
        sb.append(Arrays.toString(fArr));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return m4278equalsimpl(this.values, p0);
    }

    public final int hashCode() {
        return m4281hashCodeimpl(this.values);
    }

    public final String toString() {
        return m4292toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m4293unboximpl() {
        return this.values;
    }
}
