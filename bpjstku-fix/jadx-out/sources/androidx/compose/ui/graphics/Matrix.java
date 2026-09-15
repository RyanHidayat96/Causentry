package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 H2\u00020\u0001:\u0001HB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0086\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010 \u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010#\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\r\u0010%\u001a\u00020\r¢\u0006\u0004\b$\u0010\"J\u0015\u0010'\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b&\u0010\u001bJ\u0015\u0010*\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b+\u0010)J\u0015\u0010.\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b-\u0010)J+\u00101\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b/\u00100J+\u00103\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b2\u00100J{\u0010>\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\b2\b\b\u0002\u00106\u001a\u00020\b2\b\b\u0002\u00107\u001a\u00020\b2\b\b\u0002\u00108\u001a\u00020\b2\b\b\u0002\u00109\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\b2\b\b\u0002\u0010;\u001a\u00020\b¢\u0006\u0004\b<\u0010=J\u001a\u0010@\u001a\u00020?2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\u0088\u0001D\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "", "p0", "constructor-impl", "([F)[F", "", "p1", "", "get-impl", "([FII)F", "get", "p2", "", "set-impl", "([FIIF)V", "set", "Landroidx/compose/ui/geometry/Offset;", "map-MK-Hz9U", "([FJ)J", "map", "Landroidx/compose/ui/geometry/Rect;", "map-impl", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "timesAssign-58bKbWc", "([F[F)V", "timesAssign", "", "toString-impl", "([F)Ljava/lang/String;", "toString", "invert-impl", "([F)V", "invert", "reset-impl", "reset", "setFrom-58bKbWc", "setFrom", "rotateX-impl", "([FF)V", "rotateX", "rotateY-impl", "rotateY", "rotateZ-impl", "rotateZ", "scale-impl", "([FFFF)V", "scale", "translate-impl", "translate", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "resetToPivotedTransform-impl", "([FFFFFFFFFFFF)V", "resetToPivotedTransform", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "values", "[F", "getValues", "()[F", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class Matrix {
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m4460constructorimpl(float[] fArr) {
        return fArr;
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    public final float[] getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m4461constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m4460constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m4464getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 4) + i2];
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m4478setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 4) + i2] = f;
    }

    /* JADX INFO: renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m4467mapMKHz9U(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1.0f / (((f3 * fIntBitsToFloat) + (f6 * fIntBitsToFloat2)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(f10 * ((f2 * fIntBitsToFloat) + (f5 * fIntBitsToFloat2) + f8))) & 4294967295L) | (Float.floatToRawIntBits((((f * fIntBitsToFloat) + (f4 * fIntBitsToFloat2)) + f7) * f10) << 32));
    }

    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final Rect m4468mapimpl(float[] fArr, Rect rect) {
        if (fArr.length < 16) {
            return rect;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        float f10 = f3 * left;
        float f11 = f6 * top;
        float f12 = 1.0f / ((f10 + f11) + f9);
        float f13 = (Float.floatToRawIntBits(f12) & Integer.MAX_VALUE) >= 2139095040 ? 0.0f : f12;
        float f14 = f * left;
        float f15 = f4 * top;
        float f16 = f13 * (f14 + f15 + f7);
        float f17 = left * f2;
        float f18 = top * f5;
        float f19 = f13 * (f17 + f18 + f8);
        float f20 = f6 * bottom;
        float f21 = 1.0f / ((f10 + f20) + f9);
        float f22 = (Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040 ? 0.0f : f21;
        float f23 = f4 * bottom;
        float f24 = (f14 + f23 + f7) * f22;
        float f25 = f5 * bottom;
        float f26 = f22 * (f17 + f25 + f8);
        float f27 = f3 * right;
        float f28 = 1.0f / ((f11 + f27) + f9);
        float f29 = (Float.floatToRawIntBits(f28) & Integer.MAX_VALUE) >= 2139095040 ? 0.0f : f28;
        float f30 = f * right;
        float f31 = f29 * (f30 + f15 + f7);
        float f32 = right * f2;
        float f33 = f29 * (f18 + f32 + f8);
        float f34 = 1.0f / ((f27 + f20) + f9);
        float f35 = (Float.floatToRawIntBits(f34) & Integer.MAX_VALUE) < 2139095040 ? f34 : 0.0f;
        float f36 = (f30 + f23 + f7) * f35;
        float f37 = f35 * (f32 + f25 + f8);
        return new Rect(Math.min(f16, Math.min(f24, Math.min(f31, f36))), Math.min(f19, Math.min(f26, Math.min(f33, f37))), Math.max(f16, Math.max(f24, Math.max(f31, f36))), Math.max(f19, Math.max(f26, Math.max(f33, f37))));
    }

    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final void m4469mapimpl(float[] fArr, MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f10 = f3 * left;
        float f11 = f6 * top;
        float f12 = 1.0f / ((f10 + f11) + f9);
        if ((Float.floatToRawIntBits(f12) & Integer.MAX_VALUE) >= 2139095040) {
            f12 = 0.0f;
        }
        float f13 = f * left;
        float f14 = f4 * top;
        float f15 = f12 * (f13 + f14 + f7);
        float f16 = left * f2;
        float f17 = top * f5;
        float f18 = f12 * (f16 + f17 + f8);
        float f19 = f6 * bottom;
        float f20 = 1.0f / ((f10 + f19) + f9);
        float f21 = (Float.floatToRawIntBits(f20) & Integer.MAX_VALUE) >= 2139095040 ? 0.0f : f20;
        float f22 = f4 * bottom;
        float f23 = (f13 + f22 + f7) * f21;
        float f24 = f5 * bottom;
        float f25 = f21 * (f16 + f24 + f8);
        float f26 = f3 * right;
        float f27 = 1.0f / ((f11 + f26) + f9);
        if ((Float.floatToRawIntBits(f27) & Integer.MAX_VALUE) >= 2139095040) {
            f27 = 0.0f;
        }
        float f28 = f * right;
        float f29 = f27 * (f28 + f14 + f7);
        float f30 = right * f2;
        float f31 = f27 * (f17 + f30 + f8);
        float f32 = 1.0f / ((f26 + f19) + f9);
        float f33 = (Float.floatToRawIntBits(f32) & Integer.MAX_VALUE) < 2139095040 ? f32 : 0.0f;
        float f34 = (f28 + f22 + f7) * f33;
        float f35 = f33 * (f30 + f24 + f8);
        mutableRect.setLeft(Math.min(f15, Math.min(f23, Math.min(f29, f34))));
        mutableRect.setTop(Math.min(f18, Math.min(f25, Math.min(f31, f35))));
        mutableRect.setRight(Math.max(f15, Math.max(f23, Math.max(f29, f34))));
        mutableRect.setBottom(Math.max(f18, Math.max(f25, Math.max(f31, f35))));
    }

    /* JADX INFO: renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m4480timesAssign58bKbWc(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[4];
        float f5 = fArr[2];
        float f6 = fArr2[8];
        float f7 = fArr[3];
        float f8 = fArr2[12];
        float f9 = fArr2[1];
        float f10 = fArr2[5];
        float f11 = fArr2[9];
        float f12 = fArr2[13];
        float f13 = fArr2[2];
        float f14 = fArr2[6];
        float f15 = fArr2[10];
        float f16 = fArr2[14];
        float f17 = fArr2[3];
        float f18 = fArr2[7];
        float f19 = fArr2[11];
        float f20 = fArr2[15];
        float f21 = fArr[4];
        float f22 = fArr[5];
        float f23 = fArr[6];
        float f24 = fArr[7];
        float f25 = fArr[8];
        float f26 = fArr[9];
        float f27 = fArr[10];
        float f28 = fArr[11];
        float f29 = fArr[12];
        float f30 = fArr[13];
        float f31 = fArr[14];
        float f32 = fArr[15];
        fArr[0] = (f * f2) + (f3 * f4) + (f5 * f6) + (f7 * f8);
        fArr[1] = (f * f9) + (f3 * f10) + (f5 * f11) + (f7 * f12);
        fArr[2] = (f * f13) + (f3 * f14) + (f5 * f15) + (f7 * f16);
        fArr[3] = (f * f17) + (f3 * f18) + (f5 * f19) + (f7 * f20);
        fArr[4] = (f21 * f2) + (f22 * f4) + (f23 * f6) + (f24 * f8);
        fArr[5] = (f21 * f9) + (f22 * f10) + (f23 * f11) + (f24 * f12);
        fArr[6] = (f21 * f13) + (f22 * f14) + (f23 * f15) + (f24 * f16);
        fArr[7] = (f21 * f17) + (f22 * f18) + (f23 * f19) + (f24 * f20);
        fArr[8] = (f25 * f2) + (f26 * f4) + (f27 * f6) + (f28 * f8);
        fArr[9] = (f25 * f9) + (f26 * f10) + (f27 * f11) + (f28 * f12);
        fArr[10] = (f25 * f13) + (f26 * f14) + (f27 * f15) + (f28 * f16);
        fArr[11] = (f25 * f17) + (f26 * f18) + (f27 * f19) + (f28 * f20);
        fArr[12] = (f2 * f29) + (f4 * f30) + (f6 * f31) + (f8 * f32);
        fArr[13] = (f9 * f29) + (f10 * f30) + (f11 * f31) + (f12 * f32);
        fArr[14] = (f13 * f29) + (f14 * f30) + (f15 * f31) + (f16 * f32);
        fArr[15] = (f29 * f17) + (f30 * f18) + (f31 * f19) + (f32 * f20);
    }

    public final String toString() {
        return m4481toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4481toStringimpl(float[] fArr) {
        StringBuilder sb = new StringBuilder("\n            |");
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return StringsKt.trimIndent(sb.toString());
    }

    /* JADX INFO: renamed from: invert-impl, reason: not valid java name */
    public static final void m4466invertimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f17 * f28) - (f18 * f27)) + (f19 * f26)) + (f20 * f25)) - (f21 * f24)) + (f22 * f23);
        if (f29 == 0.0f) {
            return;
        }
        float f30 = 1.0f / f29;
        fArr[0] = (((f6 * f28) - (f7 * f27)) + (f8 * f26)) * f30;
        fArr[1] = ((((-f2) * f28) + (f3 * f27)) - (f4 * f26)) * f30;
        fArr[2] = (((f14 * f22) - (f15 * f21)) + (f16 * f20)) * f30;
        fArr[3] = ((((-f10) * f22) + (f11 * f21)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr[4] = (((f31 * f28) + (f7 * f25)) - (f8 * f24)) * f30;
        fArr[5] = (((f28 * f) - (f3 * f25)) + (f4 * f24)) * f30;
        float f32 = -f13;
        fArr[6] = (((f32 * f22) + (f15 * f19)) - (f16 * f18)) * f30;
        fArr[7] = (((f22 * f9) - (f11 * f19)) + (f12 * f18)) * f30;
        fArr[8] = (((f5 * f27) - (f6 * f25)) + (f8 * f23)) * f30;
        fArr[9] = ((((-f) * f27) + (f25 * f2)) - (f4 * f23)) * f30;
        fArr[10] = (((f13 * f21) - (f14 * f19)) + (f16 * f17)) * f30;
        fArr[11] = ((((-f9) * f21) + (f19 * f10)) - (f12 * f17)) * f30;
        fArr[12] = (((f31 * f26) + (f6 * f24)) - (f7 * f23)) * f30;
        fArr[13] = (((f * f26) - (f2 * f24)) + (f3 * f23)) * f30;
        fArr[14] = (((f32 * f20) + (f14 * f18)) - (f15 * f17)) * f30;
        fArr[15] = (((f9 * f20) - (f10 * f18)) + (f11 * f17)) * f30;
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m4470resetimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* JADX INFO: renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m4479setFrom58bKbWc(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
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
    }

    /* JADX INFO: renamed from: rotateX-impl, reason: not valid java name */
    public static final void m4473rotateXimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = ((double) f) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * fCos) - (f3 * fSin);
        fArr[2] = (f2 * fSin) + (f3 * fCos);
        fArr[5] = (f4 * fCos) - (f5 * fSin);
        fArr[6] = (f4 * fSin) + (f5 * fCos);
        fArr[9] = (f6 * fCos) - (f7 * fSin);
        fArr[10] = (f6 * fSin) + (f7 * fCos);
        fArr[13] = (f8 * fCos) - (f9 * fSin);
        fArr[14] = (f8 * fSin) + (f9 * fCos);
    }

    /* JADX INFO: renamed from: rotateY-impl, reason: not valid java name */
    public static final void m4474rotateYimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = ((double) f) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[8];
        float f7 = fArr[10];
        float f8 = fArr[12];
        float f9 = fArr[14];
        fArr[0] = (f2 * fCos) + (f3 * fSin);
        fArr[2] = ((-f2) * fSin) + (f3 * fCos);
        fArr[4] = (f4 * fCos) + (f5 * fSin);
        fArr[6] = ((-f4) * fSin) + (f5 * fCos);
        fArr[8] = (f6 * fCos) + (f7 * fSin);
        fArr[10] = ((-f6) * fSin) + (f7 * fCos);
        fArr[12] = (f8 * fCos) + (f9 * fSin);
        fArr[14] = ((-f8) * fSin) + (f9 * fCos);
    }

    /* JADX INFO: renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m4475rotateZimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = ((double) f) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = -fSin;
        float f5 = fArr[1];
        float f6 = fArr[5];
        float f7 = fArr[2];
        float f8 = fArr[6];
        float f9 = fArr[3];
        float f10 = fArr[7];
        fArr[0] = (fCos * f2) + (fSin * f3);
        fArr[1] = (fCos * f5) + (fSin * f6);
        fArr[2] = (fCos * f7) + (fSin * f8);
        fArr[3] = (fCos * f9) + (fSin * f10);
        fArr[4] = (f2 * f4) + (f3 * fCos);
        fArr[5] = (f5 * f4) + (f6 * fCos);
        fArr[6] = (f7 * f4) + (f8 * fCos);
        fArr[7] = (f4 * f9) + (fCos * f10);
    }

    /* JADX INFO: renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4477scaleimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        m4476scaleimpl(fArr, f, f2, f3);
    }

    /* JADX INFO: renamed from: scale-impl, reason: not valid java name */
    public static final void m4476scaleimpl(float[] fArr, float f, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* JADX INFO: renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4483translateimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m4482translateimpl(fArr, f, f2, f3);
    }

    /* JADX INFO: renamed from: translate-impl, reason: not valid java name */
    public static final void m4482translateimpl(float[] fArr, float f, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        float f4 = fArr[0];
        float f5 = fArr[4];
        float f6 = fArr[8];
        float f7 = fArr[12];
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = fArr[9];
        float f11 = fArr[13];
        float f12 = fArr[2];
        float f13 = fArr[6];
        float f14 = fArr[10];
        float f15 = fArr[14];
        float f16 = fArr[3];
        float f17 = fArr[7];
        float f18 = fArr[11];
        float f19 = fArr[15];
        fArr[12] = (f4 * f) + (f5 * f2) + (f6 * f3) + f7;
        fArr[13] = (f8 * f) + (f9 * f2) + (f10 * f3) + f11;
        fArr[14] = (f12 * f) + (f13 * f2) + (f14 * f3) + f15;
        fArr[15] = (f16 * f) + (f17 * f2) + (f18 * f3) + f19;
    }

    /* JADX INFO: renamed from: resetToPivotedTransform-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4472resetToPivotedTransformimpl$default(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 16) != 0) {
            f5 = 0.0f;
        }
        if ((i & 32) != 0) {
            f6 = 0.0f;
        }
        if ((i & 64) != 0) {
            f7 = 0.0f;
        }
        if ((i & 128) != 0) {
            f8 = 0.0f;
        }
        if ((i & 256) != 0) {
            f9 = 1.0f;
        }
        if ((i & 512) != 0) {
            f10 = 1.0f;
        }
        if ((i & 1024) != 0) {
            f11 = 1.0f;
        }
        m4471resetToPivotedTransformimpl(fArr, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
    }

    /* JADX INFO: renamed from: resetToPivotedTransform-impl, reason: not valid java name */
    public static final void m4471resetToPivotedTransformimpl(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        double d = ((double) f6) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f12 = -fSin;
        float f13 = (f4 * fSin) + (f5 * fCos);
        double d2 = ((double) f7) * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d2);
        float fCos2 = (float) Math.cos(d2);
        float f14 = -fSin2;
        float f15 = fSin * fSin2;
        float f16 = fSin * fCos2;
        float f17 = -f3;
        double d3 = ((double) f8) * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d3);
        float fCos3 = (float) Math.cos(d3);
        float f18 = -fSin3;
        float f19 = ((fCos2 * fCos3) + (f15 * fSin3)) * f9;
        float f20 = fSin3 * fCos * f9;
        float f21 = ((fCos3 * f14) + (fSin3 * f16)) * f9;
        float f22 = ((f18 * fCos2) + (f15 * fCos3)) * f10;
        float f23 = fCos * fCos3 * f10;
        float f24 = ((f18 * f14) + (fCos3 * f16)) * f10;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f19;
        fArr[1] = f20;
        fArr[2] = f21;
        fArr[3] = 0.0f;
        fArr[4] = f22;
        fArr[5] = f23;
        fArr[6] = f24;
        fArr[7] = 0.0f;
        fArr[8] = fCos * fSin2 * f11;
        fArr[9] = f12 * f11;
        fArr[10] = fCos * fCos2 * f11;
        fArr[11] = 0.0f;
        float f25 = -f;
        fArr[12] = ((f19 * f25) - (f22 * f2)) + (f3 * fCos2) + (f13 * fSin2) + f;
        fArr[13] = ((f20 * f25) - (f23 * f2)) + ((f4 * fCos) - (f5 * fSin)) + f2;
        fArr[14] = ((f25 * f21) - (f2 * f24)) + (f17 * fSin2) + (f13 * fCos2);
        fArr[15] = 1.0f;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m4459boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4462equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).m4484unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4463equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4465hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public final boolean equals(Object p0) {
        return m4462equalsimpl(this.values, p0);
    }

    public final int hashCode() {
        return m4465hashCodeimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m4484unboximpl() {
        return this.values;
    }
}
