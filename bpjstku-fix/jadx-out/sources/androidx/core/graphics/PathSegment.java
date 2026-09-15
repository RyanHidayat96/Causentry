package androidx.core.graphics;

import android.graphics.PointF;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(PointF pointF, float f, PointF pointF2, float f2) {
        this.mStart = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.mStartFraction = f;
        this.mEnd = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.mEndFraction = f2;
    }

    public final PointF getStart() {
        return this.mStart;
    }

    public final float getStartFraction() {
        return this.mStartFraction;
    }

    public final PointF getEnd() {
        return this.mEnd;
    }

    public final float getEndFraction() {
        return this.mEndFraction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        return Float.compare(this.mStartFraction, pathSegment.mStartFraction) == 0 && Float.compare(this.mEndFraction, pathSegment.mEndFraction) == 0 && this.mStart.equals(pathSegment.mStart) && this.mEnd.equals(pathSegment.mEnd);
    }

    public final int hashCode() {
        int iHashCode = this.mStart.hashCode();
        float f = this.mStartFraction;
        int iFloatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        int iHashCode2 = this.mEnd.hashCode();
        float f2 = this.mEndFraction;
        return (((((iHashCode * 31) + iFloatToIntBits) * 31) + iHashCode2) * 31) + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PathSegment{start=");
        sb.append(this.mStart);
        sb.append(", startFraction=");
        sb.append(this.mStartFraction);
        sb.append(", end=");
        sb.append(this.mEnd);
        sb.append(", endFraction=");
        sb.append(this.mEndFraction);
        sb.append('}');
        return sb.toString();
    }
}
