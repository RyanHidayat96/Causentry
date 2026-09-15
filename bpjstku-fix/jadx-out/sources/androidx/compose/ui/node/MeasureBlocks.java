package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "MeasureBlocks was deprecated. Please use MeasurePolicy instead.")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J-\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011J-\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\b\u001a\u00020\u000fH&¢\u0006\u0004\b\u0014\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/MeasureBlocks;", "", "Landroidx/compose/ui/layout/MeasureScope;", "p0", "", "Landroidx/compose/ui/layout/Measurable;", "p1", "Landroidx/compose/ui/unit/Constraints;", "p2", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Ljava/util/List;I)I", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MeasureBlocks {
    int maxIntrinsicHeight(IntrinsicMeasureScope p0, List<? extends IntrinsicMeasurable> p1, int p2);

    int maxIntrinsicWidth(IntrinsicMeasureScope p0, List<? extends IntrinsicMeasurable> p1, int p2);

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    MeasureResult m5878measure3p2s80s(MeasureScope p0, List<? extends Measurable> p1, long p2);

    int minIntrinsicHeight(IntrinsicMeasureScope p0, List<? extends IntrinsicMeasurable> p1, int p2);

    int minIntrinsicWidth(IntrinsicMeasureScope p0, List<? extends IntrinsicMeasurable> p1, int p2);
}
