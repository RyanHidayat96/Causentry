package androidx.compose.material3.carousel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJS\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010#R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl;", "Landroidx/compose/material3/carousel/KeylineListScope;", "<init>", "()V", "", "p0", "", "p1", "", "add", "(FZ)V", "", "p2", "p3", "p4", "p5", "", "Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "p6", "Landroidx/compose/material3/carousel/Keyline;", "createKeylinesWithPivot", "(IFIIFFLjava/util/List;)Ljava/util/List;", "Landroidx/compose/material3/carousel/CarouselAlignment;", "Landroidx/compose/material3/carousel/KeylineList;", "createWithAlignment", "(FLandroidx/compose/material3/carousel/CarouselAlignment;)Landroidx/compose/material3/carousel/KeylineList;", "createWithPivot", "(FIF)Landroidx/compose/material3/carousel/KeylineList;", "findLastFocalIndex", "()I", "isCutoffLeft", "(FF)Z", "isCutoffRight", "(FFF)Z", "firstFocalIndex", "I", "focalItemSize", "F", "pivotIndex", "pivotOffset", "", "tmpKeylines", "Ljava/util/List;", "TmpKeyline"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class KeylineListScopeImpl implements KeylineListScope {
    private float focalItemSize;
    private float pivotOffset;
    private int firstFocalIndex = -1;
    private int pivotIndex = -1;
    private final List<TmpKeyline> tmpKeylines = new ArrayList();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CarouselAlignment.values().length];
            try {
                iArr[CarouselAlignment.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CarouselAlignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CarouselAlignment.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean isCutoffLeft(float p0, float p1) {
        float f = p0 / 2.0f;
        return p1 - f < 0.0f && p1 + f > 0.0f;
    }

    private final boolean isCutoffRight(float p0, float p1, float p2) {
        float f = p0 / 2.0f;
        return p1 - f < p2 && p1 + f > p2;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "", "", "p0", "", "p1", "<init>", "(FZ)V", "component1", "()F", "component2", "()Z", "copy", "(FZ)Landroidx/compose/material3/carousel/KeylineListScopeImpl$TmpKeyline;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isAnchor", "Z", "size", "F", "getSize"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class TmpKeyline {
        private final boolean isAnchor;
        private final float size;

        public TmpKeyline(float f, boolean z) {
            this.size = f;
            this.isAnchor = z;
        }

        public final float getSize() {
            return this.size;
        }

        public final boolean isAnchor() {
            return this.isAnchor;
        }

        public static /* synthetic */ TmpKeyline copy$default(TmpKeyline tmpKeyline, float f, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                f = tmpKeyline.size;
            }
            if ((i & 2) != 0) {
                z = tmpKeyline.isAnchor;
            }
            return tmpKeyline.copy(f, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getSize() {
            return this.size;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsAnchor() {
            return this.isAnchor;
        }

        public final TmpKeyline copy(float p0, boolean p1) {
            return new TmpKeyline(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TmpKeyline)) {
                return false;
            }
            TmpKeyline tmpKeyline = (TmpKeyline) p0;
            return Float.compare(this.size, tmpKeyline.size) == 0 && this.isAnchor == tmpKeyline.isAnchor;
        }

        public final int hashCode() {
            return (Float.hashCode(this.size) * 31) + Boolean.hashCode(this.isAnchor);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TmpKeyline(size=");
            sb.append(this.size);
            sb.append(", isAnchor=");
            sb.append(this.isAnchor);
            sb.append(')');
            return sb.toString();
        }
    }

    @Override // androidx.compose.material3.carousel.KeylineListScope
    public final void add(float p0, boolean p1) {
        this.tmpKeylines.add(new TmpKeyline(p0, p1));
        if (p0 > this.focalItemSize) {
            this.firstFocalIndex = CollectionsKt.getLastIndex(this.tmpKeylines);
            this.focalItemSize = p0;
        }
    }

    public final KeylineList createWithPivot(float p0, int p1, float p2) {
        return new KeylineList(createKeylinesWithPivot(p1, p2, this.firstFocalIndex, findLastFocalIndex(), this.focalItemSize, p0, this.tmpKeylines));
    }

    public final KeylineList createWithAlignment(float p0, CarouselAlignment p1) {
        float f;
        int iFindLastFocalIndex = findLastFocalIndex();
        int i = this.firstFocalIndex;
        this.pivotIndex = i;
        int i2 = WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
        if (i2 == 1) {
            f = this.focalItemSize / 2.0f;
        } else if (i2 == 2) {
            f = (p0 / 2.0f) - ((this.focalItemSize / 2.0f) * (iFindLastFocalIndex - i));
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = p0 - (this.focalItemSize / 2.0f);
        }
        float f2 = f;
        this.pivotOffset = f2;
        return new KeylineList(createKeylinesWithPivot(this.pivotIndex, f2, this.firstFocalIndex, iFindLastFocalIndex, this.focalItemSize, p0, this.tmpKeylines));
    }

    private final int findLastFocalIndex() {
        int i = this.firstFocalIndex;
        while (i < CollectionsKt.getLastIndex(this.tmpKeylines)) {
            int i2 = i + 1;
            if (this.tmpKeylines.get(i2).getSize() != this.focalItemSize) {
                break;
            }
            i = i2;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:33:0x0118  */
    /* JADX WARN: Code duplicated, block: B:34:0x0123  */
    /* JADX WARN: Code duplicated, block: B:39:0x0130  */
    private final List<Keyline> createKeylinesWithPivot(int p0, float p1, int p2, int p3, float p4, float p5, List<TmpKeyline> p6) {
        float f;
        float size;
        boolean z;
        boolean z2;
        float f2;
        float size2;
        Iterator<Integer> it;
        float f3;
        float size3;
        Iterator<Integer> it2;
        float f4;
        int iNextInt;
        TmpKeyline tmpKeyline;
        float size4;
        boolean z3;
        float size5;
        boolean z4;
        int iNextInt2;
        TmpKeyline tmpKeyline2;
        float size6;
        float size7;
        boolean z5;
        TmpKeyline tmpKeyline3 = p6.get(p0);
        ArrayList arrayList = new ArrayList();
        if (!isCutoffLeft(tmpKeyline3.getSize(), p1)) {
            if (isCutoffRight(tmpKeyline3.getSize(), p1, p5)) {
                size = ((tmpKeyline3.getSize() / 2.0f) + p1) - p5;
            } else {
                f = 0.0f;
            }
            float size8 = tmpKeyline3.getSize();
            if (p2 <= p0 || p0 > p3) {
                z = false;
            } else {
                z = true;
            }
            z2 = false;
            arrayList.add(new Keyline(size8, p1, p1, z, tmpKeyline3.isAnchor(), true, f));
            f2 = p4 / 2.0f;
            size2 = p1 - f2;
            it = RangesKt.downTo(p0 - 1, 0).iterator();
            f3 = size2;
            while (it.hasNext()) {
                iNextInt2 = ((IntIterator) it).nextInt();
                tmpKeyline2 = p6.get(iNextInt2);
                size6 = size2 - (tmpKeyline2.getSize() / 2.0f);
                if (isCutoffLeft(tmpKeyline2.getSize(), size6)) {
                    size7 = size6 - (tmpKeyline2.getSize() / 2.0f);
                } else {
                    size7 = 0.0f;
                }
                float size9 = tmpKeyline2.getSize();
                if (p2 <= iNextInt2 || iNextInt2 > p3) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                arrayList.add(0, new Keyline(size9, size6, f3 - f2, z5, tmpKeyline2.isAnchor(), false, size7));
                size2 -= tmpKeyline2.getSize();
                f3 -= p4;
            }
            size3 = p1 + f2;
            it2 = RangesKt.until(p0 + 1, p6.size()).iterator();
            f4 = size3;
            while (it2.hasNext()) {
                iNextInt = ((IntIterator) it2).nextInt();
                tmpKeyline = p6.get(iNextInt);
                size4 = (tmpKeyline.getSize() / 2.0f) + size3;
                z3 = z2;
                if (isCutoffRight(tmpKeyline.getSize(), size4, p5)) {
                    size5 = ((tmpKeyline.getSize() / 2.0f) + size4) - p5;
                } else {
                    size5 = 0.0f;
                }
                float size10 = tmpKeyline.getSize();
                if (p2 <= iNextInt || iNextInt > p3) {
                    z4 = z3;
                } else {
                    z4 = true;
                }
                arrayList.add(new Keyline(size10, size4, f4 + f2, z4, tmpKeyline.isAnchor(), false, size5));
                size3 += tmpKeyline.getSize();
                f4 += p4;
                z2 = z3;
            }
            return arrayList;
        }
        size = p1 - (tmpKeyline3.getSize() / 2.0f);
        f = size;
        float size11 = tmpKeyline3.getSize();
        if (p2 <= p0) {
            z = false;
        } else {
            z = false;
        }
        z2 = false;
        arrayList.add(new Keyline(size11, p1, p1, z, tmpKeyline3.isAnchor(), true, f));
        f2 = p4 / 2.0f;
        size2 = p1 - f2;
        it = RangesKt.downTo(p0 - 1, 0).iterator();
        f3 = size2;
        while (it.hasNext()) {
            iNextInt2 = ((IntIterator) it).nextInt();
            tmpKeyline2 = p6.get(iNextInt2);
            size6 = size2 - (tmpKeyline2.getSize() / 2.0f);
            if (isCutoffLeft(tmpKeyline2.getSize(), size6)) {
                size7 = size6 - (tmpKeyline2.getSize() / 2.0f);
            } else {
                size7 = 0.0f;
            }
            float size12 = tmpKeyline2.getSize();
            if (p2 <= iNextInt2) {
                z5 = false;
            } else {
                z5 = false;
            }
            arrayList.add(0, new Keyline(size12, size6, f3 - f2, z5, tmpKeyline2.isAnchor(), false, size7));
            size2 -= tmpKeyline2.getSize();
            f3 -= p4;
        }
        size3 = p1 + f2;
        it2 = RangesKt.until(p0 + 1, p6.size()).iterator();
        f4 = size3;
        while (it2.hasNext()) {
            iNextInt = ((IntIterator) it2).nextInt();
            tmpKeyline = p6.get(iNextInt);
            size4 = (tmpKeyline.getSize() / 2.0f) + size3;
            z3 = z2;
            if (isCutoffRight(tmpKeyline.getSize(), size4, p5)) {
                size5 = ((tmpKeyline.getSize() / 2.0f) + size4) - p5;
            } else {
                size5 = 0.0f;
            }
            float size13 = tmpKeyline.getSize();
            if (p2 <= iNextInt) {
                z4 = z3;
            } else {
                z4 = z3;
            }
            arrayList.add(new Keyline(size13, size4, f4 + f2, z4, tmpKeyline.isAnchor(), false, size5));
            size3 += tmpKeyline.getSize();
            f4 += p4;
            z2 = z3;
        }
        return arrayList;
    }
}
