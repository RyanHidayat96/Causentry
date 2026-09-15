package androidx.compose.material3.carousel;

import androidx.annotation.FloatRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "<init>", "(IFIFIFI)V", "cost", "(F)F", "", "isValid", "()Z", "largeCount", "I", "largeSize", "F", "getLargeSize", "()F", "mediumCount", "mediumSize", "getMediumSize", "priority", "smallCount", "smallSize", "getSmallSize", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Arrangement {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float MediumItemFlexPercentage = 0.1f;
    private final int largeCount;
    private final float largeSize;
    private final int mediumCount;
    private final float mediumSize;
    private final int priority;
    private final int smallCount;
    private final float smallSize;

    public Arrangement(int i, float f, int i2, float f2, int i3, float f3, int i4) {
        this.priority = i;
        this.smallSize = f;
        this.smallCount = i2;
        this.mediumSize = f2;
        this.mediumCount = i3;
        this.largeSize = f3;
        this.largeCount = i4;
    }

    public final float getSmallSize() {
        return this.smallSize;
    }

    public final float getMediumSize() {
        return this.mediumSize;
    }

    public final float getLargeSize() {
        return this.largeSize;
    }

    private final boolean isValid() {
        int i = this.largeCount;
        if (i <= 0 || this.smallCount <= 0 || this.mediumCount <= 0) {
            return i <= 0 || this.smallCount <= 0 || this.largeSize > this.smallSize;
        }
        float f = this.largeSize;
        float f2 = this.mediumSize;
        return f > f2 && f2 > this.smallSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float cost(float p0) {
        if (isValid()) {
            return Math.abs(p0 - this.largeSize) * this.priority;
        }
        return Float.MAX_VALUE;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014JW\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/material3/carousel/Arrangement$Companion;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "p3", "p4", "calculateLargeSize", "(FIFII)F", "Landroidx/annotation/FloatRange;", "", "p5", "p6", "p7", "Landroidx/compose/material3/carousel/Arrangement;", "findLowestCostArrangement", "(FFLandroidx/annotation/FloatRange;[IF[IF[I)Landroidx/compose/material3/carousel/Arrangement;", "p8", "fit", "(IFIFLandroidx/annotation/FloatRange;IFIF)Landroidx/compose/material3/carousel/Arrangement;", "MediumItemFlexPercentage", "F"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private final float calculateLargeSize(float p0, int p1, float p2, int p3, int p4) {
            float f = p3 / 2.0f;
            return (p0 - ((p1 + f) * p2)) / (p4 + f);
        }

        private Companion() {
        }

        public final Arrangement findLowestCostArrangement(float p0, float p1, FloatRange p2, int[] p3, float p4, int[] p5, float p6, int[] p7) {
            int length = p7.length;
            Arrangement arrangement = null;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                int i3 = p7[i2];
                int length2 = p5.length;
                int i4 = 0;
                while (i4 < length2) {
                    int i5 = p5[i4];
                    int length3 = p3.length;
                    Arrangement arrangement2 = arrangement;
                    int i6 = i;
                    int i7 = 0;
                    while (i7 < length3) {
                        int i8 = i7;
                        Arrangement arrangement3 = arrangement2;
                        int i9 = length3;
                        int i10 = i4;
                        int i11 = length2;
                        int i12 = i2;
                        Arrangement arrangementFit = fit(i6, p0, p3[i7], p1, p2, i5, p4, i3, p6);
                        if (arrangement3 != null && arrangementFit.cost(p6) >= arrangement3.cost(p6)) {
                            arrangement2 = arrangement3;
                        } else {
                            if (arrangementFit.cost(p6) == 0.0f) {
                                return arrangementFit;
                            }
                            arrangement2 = arrangementFit;
                        }
                        i6++;
                        i7 = i8 + 1;
                        length3 = i9;
                        i4 = i10;
                        length2 = i11;
                        i2 = i12;
                    }
                    i4++;
                    arrangement = arrangement2;
                    i = i6;
                }
                i2++;
            }
            return arrangement;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x004a  */
        /* JADX WARN: Code duplicated, block: B:14:0x004c  */
        /* JADX WARN: Code duplicated, block: B:22:0x007a  */
        /* JADX WARN: Code duplicated, block: B:23:0x0080  */
        private final Arrangement fit(int p0, float p1, int p2, float p3, FloatRange p4, int p5, float p6, int p7, float p8) {
            float fMax;
            float f;
            float fCalculateLargeSize;
            float f2;
            float f3;
            float fMin;
            float fCoerceIn = RangesKt.coerceIn(p3, (float) p4.from(), (float) p4.to());
            float f4 = p7;
            float f5 = p5;
            float f6 = p2;
            float f7 = p1 - (((p8 * f4) + (p6 * f5)) + (fCoerceIn * f6));
            if (p2 > 0 && f7 > 0.0f) {
                fMax = Math.min(f7 / f6, ((float) p4.to()) - fCoerceIn);
            } else {
                if (p2 > 0 && f7 < 0.0f) {
                    fMax = Math.max(f7 / f6, ((float) p4.from()) - fCoerceIn);
                }
                if (p2 > 0) {
                    f = fCoerceIn;
                } else {
                    f = 0.0f;
                }
                fCalculateLargeSize = calculateLargeSize(p1, p2, f, p5, p7);
                f2 = (fCalculateLargeSize + f) / 2.0f;
                if (p5 > 0 && fCalculateLargeSize != p8) {
                    f3 = (p8 - fCalculateLargeSize) * f4;
                    fMin = Math.min(Math.abs(f3), 0.1f * f2 * f5);
                    if (f3 > 0.0f) {
                        f2 -= fMin / f5;
                        fCalculateLargeSize += fMin / f4;
                    } else {
                        f2 += fMin / f5;
                        fCalculateLargeSize -= fMin / f4;
                    }
                }
                return new Arrangement(p0, f, p2, f2, p5, fCalculateLargeSize, p7);
            }
            fCoerceIn += fMax;
            if (p2 > 0) {
                f = fCoerceIn;
            } else {
                f = 0.0f;
            }
            fCalculateLargeSize = calculateLargeSize(p1, p2, f, p5, p7);
            f2 = (fCalculateLargeSize + f) / 2.0f;
            if (p5 > 0) {
                f3 = (p8 - fCalculateLargeSize) * f4;
                fMin = Math.min(Math.abs(f3), 0.1f * f2 * f5);
                if (f3 > 0.0f) {
                    f2 -= fMin / f5;
                    fCalculateLargeSize += fMin / f4;
                } else {
                    f2 += fMin / f5;
                    fCalculateLargeSize -= fMin / f4;
                }
            }
            return new Arrangement(p0, f, p2, f2, p5, fCalculateLargeSize, p7);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
