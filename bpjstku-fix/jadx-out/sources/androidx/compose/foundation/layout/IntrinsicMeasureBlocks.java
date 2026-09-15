package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "<init>", "()V", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "p0", "", "p1", "p2", "HorizontalMaxHeight", "(Ljava/util/List;II)I", "HorizontalMaxWidth", "HorizontalMinHeight", "HorizontalMinWidth", "VerticalMaxHeight", "VerticalMaxWidth", "VerticalMinHeight", "VerticalMinWidth"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntrinsicMeasureBlocks {
    public static final int $stable = 0;
    public static final IntrinsicMeasureBlocks INSTANCE = new IntrinsicMeasureBlocks();

    private IntrinsicMeasureBlocks() {
    }

    public final int HorizontalMinWidth(List<? extends IntrinsicMeasurable> p0, int p1, int p2) {
        if (p0.isEmpty()) {
            return 0;
        }
        int size = p0.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable = p0.get(i2);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(p1);
            if (weight == 0.0f) {
                i += iMinIntrinsicWidth;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMinIntrinsicWidth / weight));
            }
        }
        return Math.round(iMax * f) + i + ((p0.size() - 1) * p2);
    }

    public final int VerticalMinWidth(List<? extends IntrinsicMeasurable> p0, int p1, int p2) {
        int iRound;
        if (p0.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((p0.size() - 1) * p2, p1);
        int size = p0.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable = p0.get(i);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p1 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.minIntrinsicWidth(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            iRound = 0;
        } else {
            iRound = p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(p1 - iMin, 0) / f);
        }
        int size2 = p0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            IntrinsicMeasurable intrinsicMeasurable2 = p0.get(i2);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.minIntrinsicWidth(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int HorizontalMinHeight(List<? extends IntrinsicMeasurable> p0, int p1, int p2) {
        int iRound;
        if (p0.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((p0.size() - 1) * p2, p1);
        int size = p0.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable = p0.get(i);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p1 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.minIntrinsicHeight(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            iRound = 0;
        } else {
            iRound = p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(p1 - iMin, 0) / f);
        }
        int size2 = p0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            IntrinsicMeasurable intrinsicMeasurable2 = p0.get(i2);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.minIntrinsicHeight(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int VerticalMinHeight(List<? extends IntrinsicMeasurable> p0, int p1, int p2) {
        if (p0.isEmpty()) {
            return 0;
        }
        int size = p0.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable = p0.get(i2);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(p1);
            if (weight == 0.0f) {
                i += iMinIntrinsicHeight;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMinIntrinsicHeight / weight));
            }
        }
        return Math.round(iMax * f) + i + ((p0.size() - 1) * p2);
    }

    public final int HorizontalMaxWidth(List<? extends IntrinsicMeasurable> p0, int p1, int p2) {
        if (p0.isEmpty()) {
            return 0;
        }
        int size = p0.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable = p0.get(i2);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(p1);
            if (weight == 0.0f) {
                i += iMaxIntrinsicWidth;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMaxIntrinsicWidth / weight));
            }
        }
        return Math.round(iMax * f) + i + ((p0.size() - 1) * p2);
    }

    public final int VerticalMaxWidth(List<? extends IntrinsicMeasurable> p0, int p1, int p2) {
        int iRound;
        if (p0.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((p0.size() - 1) * p2, p1);
        int size = p0.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable = p0.get(i);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE), p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p1 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.maxIntrinsicWidth(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            iRound = 0;
        } else {
            iRound = p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(p1 - iMin, 0) / f);
        }
        int size2 = p0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            IntrinsicMeasurable intrinsicMeasurable2 = p0.get(i2);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.maxIntrinsicWidth(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int HorizontalMaxHeight(List<? extends IntrinsicMeasurable> p0, int p1, int p2) {
        int iRound;
        if (p0.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((p0.size() - 1) * p2, p1);
        int size = p0.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            IntrinsicMeasurable intrinsicMeasurable = p0.get(i);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            if (weight == 0.0f) {
                int iMin2 = Math.min(intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE), p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p1 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, intrinsicMeasurable.maxIntrinsicHeight(iMin2));
            } else if (weight > 0.0f) {
                f += weight;
            }
        }
        if (f == 0.0f) {
            iRound = 0;
        } else {
            iRound = p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(p1 - iMin, 0) / f);
        }
        int size2 = p0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            IntrinsicMeasurable intrinsicMeasurable2 = p0.get(i2);
            float weight2 = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable2));
            if (weight2 > 0.0f) {
                iMax = Math.max(iMax, intrinsicMeasurable2.maxIntrinsicHeight(iRound != Integer.MAX_VALUE ? Math.round(iRound * weight2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int VerticalMaxHeight(List<? extends IntrinsicMeasurable> p0, int p1, int p2) {
        if (p0.isEmpty()) {
            return 0;
        }
        int size = p0.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable = p0.get(i2);
            float weight = RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(intrinsicMeasurable));
            int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(p1);
            if (weight == 0.0f) {
                i += iMaxIntrinsicHeight;
            } else if (weight > 0.0f) {
                f += weight;
                iMax = Math.max(iMax, Math.round(iMaxIntrinsicHeight / weight));
            }
        }
        return Math.round(iMax * f) + i + ((p0.size() - 1) * p2);
    }
}
