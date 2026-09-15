package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0015B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rR \u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/animation/core/ArcSpline;", "", "", "p0", "", "p1", "", "p2", "<init>", "([I[F[[F)V", "", "", "getPos", "(F[F)V", "getSlope", "Landroidx/compose/animation/core/ArcSpline$Arc;", "arcs", "[[Landroidx/compose/animation/core/ArcSpline$Arc;", "", "isExtrapolate", "Z", "Companion", "Arc"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ArcSpline {
    public static final int ArcAbove = 5;
    public static final int ArcBelow = 4;
    public static final int ArcStartFlip = 3;
    public static final int ArcStartHorizontal = 2;
    public static final int ArcStartLinear = 0;
    public static final int ArcStartVertical = 1;
    private static final int DownArc = 4;
    private static final int StartHorizontal = 2;
    private static final int StartLinear = 3;
    private static final int StartVertical = 1;
    private static final int UpArc = 5;
    private final Arc[][] arcs;
    private final boolean isExtrapolate = true;
    public static final int $stable = 8;

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x002e A[PHI: r10
  0x002e: PHI (r10v1 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public ArcSpline(int[] iArr, float[] fArr, float[][] fArr2) {
        int length = fArr.length - 1;
        Arc[][] arcArr = new Arc[length][];
        int i = 1;
        int i2 = 1;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            int i5 = 3;
            if (i4 == 0) {
                i2 = i5;
            } else if (i4 == 1) {
                i = 1;
                i2 = i;
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        i5 = 4;
                        if (i4 != 4) {
                            i5 = 5;
                            if (i4 == 5) {
                                i2 = i5;
                            }
                        } else {
                            i2 = i5;
                        }
                    } else {
                        if (i != 1) {
                            i = 1;
                        }
                        i2 = i;
                    }
                }
                i = 2;
                i2 = i;
            }
            float[] fArr3 = fArr2[i3];
            int length2 = (fArr3.length / 2) + (fArr3.length % 2);
            Arc[] arcArr2 = new Arc[length2];
            for (int i6 = 0; i6 < length2; i6++) {
                int i7 = i6 * 2;
                float f = fArr[i3];
                int i8 = i3 + 1;
                float f2 = fArr[i8];
                float[] fArr4 = fArr2[i3];
                float f3 = fArr4[i7];
                int i9 = i7 + 1;
                float f4 = fArr4[i9];
                float[] fArr5 = fArr2[i8];
                arcArr2[i6] = new Arc(i2, f, f2, f3, f4, fArr5[i7], fArr5[i9]);
            }
            arcArr[i3] = arcArr2;
        }
        this.arcs = arcArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r9 > r0[r0.length - 1][0].getTime2()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getPos(float r9, float[] r10) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.ArcSpline.getPos(float, float[]):void");
    }

    public final void getSlope(float p0, float[] p1) {
        if (p0 < this.arcs[0][0].getTime1()) {
            p0 = this.arcs[0][0].getTime1();
        } else {
            Arc[][] arcArr = this.arcs;
            if (p0 > arcArr[arcArr.length - 1][0].getTime2()) {
                Arc[][] arcArr2 = this.arcs;
                p0 = arcArr2[arcArr2.length - 1][0].getTime2();
            }
        }
        int length = this.arcs.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < p1.length) {
                if (p0 <= this.arcs[i][i3].getTime2()) {
                    if (this.arcs[i][i3].getIsLinear()) {
                        p1[i2] = this.arcs[i][i3].getEllipseCenterX();
                        p1[i2 + 1] = this.arcs[i][i3].getEllipseCenterY();
                    } else {
                        this.arcs[i][i3].setPoint(p0);
                        p1[i2] = this.arcs[i][i3].calcDX();
                        p1[i2 + 1] = this.arcs[i][i3].calcDY();
                    }
                    z = true;
                }
                i2 += 2;
                i3++;
            }
            if (z) {
                return;
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u000e\b\u0007\u0018\u0000 72\u00020\u0001:\u00017BA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0011J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0011J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u001a\u0010%\u001a\u00020$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0014\u0010(\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001eR\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010\u0011R\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010\u0011R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010\u001eR\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010\u001eR\u0014\u00103\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010\u001eR\u0014\u00104\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u0010\u001eR\u0014\u00105\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010\u001eR\u0014\u00106\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010\u001e"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(IFFFFFF)V", "", "buildTable", "(FFFF)V", "calcDX", "()F", "calcDY", "calcX", "calcY", "getLinearDX", "getLinearDY", "getLinearX", "(F)F", "getLinearY", "lookup", "setPoint", "(F)V", "arcDistance", "F", "arcVelocity", "ellipseA", "ellipseB", "ellipseCenterX", "ellipseCenterY", "", "isLinear", "Z", "()Z", "isVertical", "", "lut", "[F", "oneOverDeltaTime", "time1", "getTime1", "time2", "getTime2", "tmpCosAngle", "tmpSinAngle", "x1", "x2", "y1", "y2", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Arc {
        private static final float Epsilon = 0.001f;
        private static float[] _ourPercent;
        private float arcDistance;
        private final float arcVelocity;
        private final float ellipseA;
        private final float ellipseB;
        private final float ellipseCenterX;
        private final float ellipseCenterY;
        private final boolean isLinear;
        private final boolean isVertical;
        private final float[] lut;
        private final float oneOverDeltaTime;
        private final float time1;
        private final float time2;
        private float tmpCosAngle;
        private float tmpSinAngle;
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public Arc(int i, float f, float f2, float f3, float f4, float f5, float f6) {
            this.time1 = f;
            this.time2 = f2;
            this.x1 = f3;
            this.y1 = f4;
            this.x2 = f5;
            this.y2 = f6;
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            boolean z = true;
            boolean z2 = i == 1 || (i == 4 ? f8 > 0.0f : !(i != 5 || f8 >= 0.0f));
            this.isVertical = z2;
            float f9 = f2 - f;
            float f10 = 1.0f / f9;
            this.oneOverDeltaTime = f10;
            boolean z3 = 3 == i;
            if (z3 || Math.abs(f7) < Epsilon || Math.abs(f8) < Epsilon) {
                float fHypot = (float) Math.hypot(f8, f7);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f10;
                this.ellipseCenterX = f7 / f9;
                this.ellipseCenterY = f8 / f9;
                this.lut = new float[101];
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.lut = new float[101];
                this.ellipseA = f7 * (z2 ? -1 : 1);
                this.ellipseB = f8 * (z2 ? 1 : -1);
                this.ellipseCenterX = z2 ? f5 : f3;
                this.ellipseCenterY = z2 ? f4 : f6;
                buildTable(f3, f4, f5, f6);
                this.arcVelocity = this.arcDistance * f10;
                z = z3;
            }
            this.isLinear = z;
        }

        public final float getTime1() {
            return this.time1;
        }

        public final float getTime2() {
            return this.time2;
        }

        /* JADX INFO: renamed from: isLinear, reason: from getter */
        public final boolean getIsLinear() {
            return this.isLinear;
        }

        public final void setPoint(float p0) {
            double dLookup = lookup((this.isVertical ? this.time2 - p0 : p0 - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(dLookup);
            this.tmpCosAngle = (float) Math.cos(dLookup);
        }

        public final float calcX() {
            return this.ellipseCenterX + (this.ellipseA * this.tmpSinAngle);
        }

        public final float calcY() {
            return this.ellipseCenterY + (this.ellipseB * this.tmpCosAngle);
        }

        public final float calcDX() {
            float f = this.ellipseA * this.tmpCosAngle;
            float fHypot = this.arcVelocity / ((float) Math.hypot(f, (-this.ellipseB) * this.tmpSinAngle));
            return this.isVertical ? (-f) * fHypot : f * fHypot;
        }

        public final float calcDY() {
            float f = this.ellipseA;
            float f2 = this.tmpCosAngle;
            float f3 = (-this.ellipseB) * this.tmpSinAngle;
            float fHypot = this.arcVelocity / ((float) Math.hypot(f * f2, f3));
            return this.isVertical ? (-f3) * fHypot : f3 * fHypot;
        }

        public final float getLinearX(float p0) {
            float f = this.time1;
            float f2 = this.oneOverDeltaTime;
            float f3 = this.x1;
            return f3 + ((p0 - f) * f2 * (this.x2 - f3));
        }

        public final float getLinearY(float p0) {
            float f = this.time1;
            float f2 = this.oneOverDeltaTime;
            float f3 = this.y1;
            return f3 + ((p0 - f) * f2 * (this.y2 - f3));
        }

        /* JADX INFO: renamed from: getLinearDX, reason: from getter */
        public final float getEllipseCenterX() {
            return this.ellipseCenterX;
        }

        /* JADX INFO: renamed from: getLinearDY, reason: from getter */
        public final float getEllipseCenterY() {
            return this.ellipseCenterY;
        }

        private final float lookup(float p0) {
            if (p0 <= 0.0f) {
                return 0.0f;
            }
            if (p0 >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.lut;
            float length = p0 * (fArr.length - 1);
            int i = (int) length;
            float f = fArr[i];
            return f + ((length - i) * (fArr[i + 1] - f));
        }

        private final void buildTable(float p0, float p1, float p2, float p3) {
            int length = INSTANCE.getOurPercent().length;
            float fHypot = 0.0f;
            float f = 0.0f;
            float f2 = 0.0f;
            int i = 0;
            while (i < length) {
                Companion companion = INSTANCE;
                double radians = (float) Math.toRadians((((double) i) * 90.0d) / ((double) (companion.getOurPercent().length - 1)));
                float fSin = ((float) Math.sin(radians)) * (p2 - p0);
                float fCos = ((float) Math.cos(radians)) * (p1 - p3);
                if (i > 0) {
                    fHypot += (float) Math.hypot(fSin - f, fCos - f2);
                    companion.getOurPercent()[i] = fHypot;
                }
                i++;
                f2 = fCos;
                f = fSin;
            }
            this.arcDistance = fHypot;
            int length2 = INSTANCE.getOurPercent().length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] ourPercent = INSTANCE.getOurPercent();
                ourPercent[i2] = ourPercent[i2] / fHypot;
            }
            int length3 = this.lut.length;
            for (int i3 = 0; i3 < length3; i3++) {
                float length4 = i3 / (this.lut.length - 1);
                Companion companion2 = INSTANCE;
                int iBinarySearch$default = ArraysKt.binarySearch$default(companion2.getOurPercent(), length4, 0, 0, 6, (Object) null);
                if (iBinarySearch$default >= 0) {
                    this.lut[i3] = iBinarySearch$default / (companion2.getOurPercent().length - 1);
                } else if (iBinarySearch$default == -1) {
                    this.lut[i3] = 0.0f;
                } else {
                    int i4 = -iBinarySearch$default;
                    int i5 = i4 - 2;
                    this.lut[i3] = (i5 + ((length4 - companion2.getOurPercent()[i5]) / (companion2.getOurPercent()[i4 - 1] - companion2.getOurPercent()[i5]))) / (companion2.getOurPercent().length - 1);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/animation/core/ArcSpline$Arc$Companion;", "", "<init>", "()V", "", "Epsilon", "F", "", "_ourPercent", "[F", "getOurPercent", "()[F", "ourPercent"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final float[] getOurPercent() {
                if (Arc._ourPercent != null) {
                    float[] fArr = Arc._ourPercent;
                    Intrinsics.checkNotNull(fArr);
                    return fArr;
                }
                Arc._ourPercent = new float[91];
                float[] fArr2 = Arc._ourPercent;
                Intrinsics.checkNotNull(fArr2);
                return fArr2;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
