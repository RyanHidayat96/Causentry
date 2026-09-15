package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "<init>", "()V", "", "p0", "p1", "", "deceleration", "(FF)D", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "flingPosition-LfoxSSI", "(F)J", "flingPosition", "", "NbSamples", "I", "", "SplinePositions", "[F", "SplineTimes", "FlingResult"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class AndroidFlingSpline {
    private static final int NbSamples = 100;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final float[] SplinePositions = new float[101];
    private static final float[] SplineTimes = new float[101];

    private AndroidFlingSpline() {
    }

    static {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9 = 0.0f;
        int i = 0;
        float f10 = 0.0f;
        while (true) {
            float f11 = 1.0f;
            if (i < 100) {
                float f12 = i / 100.0f;
                float f13 = 1.0f;
                while (true) {
                    f = ((f13 - f9) / 2.0f) + f9;
                    f2 = 1.0f - f;
                    f3 = f * 3.0f * f2;
                    f4 = f * f * f;
                    float f14 = (((f2 * 0.175f) + (f * 0.35000002f)) * f3) + f4;
                    if (Math.abs(f14 - f12) < 1.0E-5d) {
                        break;
                    } else if (f14 > f12) {
                        f13 = f;
                    } else {
                        f9 = f;
                    }
                }
                SplinePositions[i] = (f3 * ((f2 * 0.5f) + f)) + f4;
                float f15 = 1.0f;
                while (true) {
                    f5 = ((f15 - f10) / 2.0f) + f10;
                    f6 = f11 - f5;
                    f7 = f5 * 3.0f * f6;
                    f8 = f5 * f5 * f5;
                    float f16 = (((f6 * 0.5f) + f5) * f7) + f8;
                    float f17 = f15;
                    if (Math.abs(f16 - f12) >= 1.0E-5d) {
                        if (f16 > f12) {
                            f15 = f5;
                        } else {
                            f10 = f5;
                            f15 = f17;
                        }
                        f11 = 1.0f;
                    }
                }
                SplineTimes[i] = (f7 * ((f6 * 0.175f) + (f5 * 0.35000002f))) + f8;
                i++;
            } else {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m872flingPositionLfoxSSI(float p0) {
        float f;
        float f2;
        int i = (int) (p0 * 100.0f);
        if (i < 100) {
            float f3 = i / 100.0f;
            int i2 = i + 1;
            float[] fArr = SplinePositions;
            float f4 = fArr[i];
            f2 = (fArr[i2] - f4) / ((i2 / 100.0f) - f3);
            f = f4 + ((p0 - f3) * f2);
        } else {
            f = 1.0f;
            f2 = 0.0f;
        }
        return FlingResult.m874constructorimpl((Float.floatToRawIntBits(f) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
    }

    public final double deceleration(float p0, float p1) {
        return Math.log(((double) (Math.abs(p0) * 0.35f)) / ((double) p1));
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014\u0088\u0001\u0016\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "", "p0", "constructor-impl", "(J)J", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "getDistanceCoefficient-impl", "(J)F", "distanceCoefficient", "packedValue", "J", "getVelocityCoefficient-impl", "velocityCoefficient"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    public static final class FlingResult {
        private final long packedValue;

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m874constructorimpl(long j) {
            return j;
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m876equalsimpl0(long j, long j2) {
            return j == j2;
        }

        private /* synthetic */ FlingResult(long j) {
            this.packedValue = j;
        }

        /* JADX INFO: renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m877getDistanceCoefficientimpl(long j) {
            return Float.intBitsToFloat((int) (j >> 32));
        }

        /* JADX INFO: renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m878getVelocityCoefficientimpl(long j) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m873boximpl(long j) {
            return new FlingResult(j);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m875equalsimpl(long j, Object obj) {
            return (obj instanceof FlingResult) && j == ((FlingResult) obj).getPackedValue();
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m879hashCodeimpl(long j) {
            return Long.hashCode(j);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m880toStringimpl(long j) {
            StringBuilder sb = new StringBuilder("FlingResult(packedValue=");
            sb.append(j);
            sb.append(')');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            return m875equalsimpl(this.packedValue, obj);
        }

        public final int hashCode() {
            return m879hashCodeimpl(this.packedValue);
        }

        public final String toString() {
            return m880toStringimpl(this.packedValue);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }
    }
}
