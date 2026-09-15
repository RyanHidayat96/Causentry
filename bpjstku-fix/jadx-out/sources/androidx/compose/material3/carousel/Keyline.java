package androidx.compose.material3.carousel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJV\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH×\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0012R\u001a\u0010%\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010&\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u000eR\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b*\u0010\u000eR\u001a\u0010+\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\u000e"}, d2 = {"Landroidx/compose/material3/carousel/Keyline;", "", "", "p0", "p1", "p2", "", "p3", "p4", "p5", "p6", "<init>", "(FFFZZZF)V", "component1", "()F", "component2", "component3", "component4", "()Z", "component5", "component6", "component7", "copy", "(FFFZZZF)Landroidx/compose/material3/carousel/Keyline;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "cutoff", "F", "getCutoff", "isAnchor", "Z", "isFocal", "isPivot", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset", "size", "getSize", "unadjustedOffset", "getUnadjustedOffset"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Keyline {
    public static final int $stable = 0;
    private final float cutoff;
    private final boolean isAnchor;
    private final boolean isFocal;
    private final boolean isPivot;
    private final float offset;
    private final float size;
    private final float unadjustedOffset;

    public Keyline(float f, float f2, float f3, boolean z, boolean z2, boolean z3, float f4) {
        this.size = f;
        this.offset = f2;
        this.unadjustedOffset = f3;
        this.isFocal = z;
        this.isAnchor = z2;
        this.isPivot = z3;
        this.cutoff = f4;
    }

    public final float getSize() {
        return this.size;
    }

    public final float getOffset() {
        return this.offset;
    }

    public final float getUnadjustedOffset() {
        return this.unadjustedOffset;
    }

    public final boolean isFocal() {
        return this.isFocal;
    }

    public final boolean isAnchor() {
        return this.isAnchor;
    }

    public final boolean isPivot() {
        return this.isPivot;
    }

    public final float getCutoff() {
        return this.cutoff;
    }

    public static /* synthetic */ Keyline copy$default(Keyline keyline, float f, float f2, float f3, boolean z, boolean z2, boolean z3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = keyline.size;
        }
        if ((i & 2) != 0) {
            f2 = keyline.offset;
        }
        float f5 = f2;
        if ((i & 4) != 0) {
            f3 = keyline.unadjustedOffset;
        }
        float f6 = f3;
        if ((i & 8) != 0) {
            z = keyline.isFocal;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = keyline.isAnchor;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = keyline.isPivot;
        }
        boolean z6 = z3;
        if ((i & 64) != 0) {
            f4 = keyline.cutoff;
        }
        return keyline.copy(f, f5, f6, z4, z5, z6, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getUnadjustedOffset() {
        return this.unadjustedOffset;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsFocal() {
        return this.isFocal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsAnchor() {
        return this.isAnchor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsPivot() {
        return this.isPivot;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getCutoff() {
        return this.cutoff;
    }

    public final Keyline copy(float p0, float p1, float p2, boolean p3, boolean p4, boolean p5, float p6) {
        return new Keyline(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Keyline)) {
            return false;
        }
        Keyline keyline = (Keyline) p0;
        return Float.compare(this.size, keyline.size) == 0 && Float.compare(this.offset, keyline.offset) == 0 && Float.compare(this.unadjustedOffset, keyline.unadjustedOffset) == 0 && this.isFocal == keyline.isFocal && this.isAnchor == keyline.isAnchor && this.isPivot == keyline.isPivot && Float.compare(this.cutoff, keyline.cutoff) == 0;
    }

    public final int hashCode() {
        return (((((((((((Float.hashCode(this.size) * 31) + Float.hashCode(this.offset)) * 31) + Float.hashCode(this.unadjustedOffset)) * 31) + Boolean.hashCode(this.isFocal)) * 31) + Boolean.hashCode(this.isAnchor)) * 31) + Boolean.hashCode(this.isPivot)) * 31) + Float.hashCode(this.cutoff);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Keyline(size=");
        sb.append(this.size);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", unadjustedOffset=");
        sb.append(this.unadjustedOffset);
        sb.append(", isFocal=");
        sb.append(this.isFocal);
        sb.append(", isAnchor=");
        sb.append(this.isAnchor);
        sb.append(", isPivot=");
        sb.append(this.isPivot);
        sb.append(", cutoff=");
        sb.append(this.cutoff);
        sb.append(')');
        return sb.toString();
    }
}
