package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0003R\u0014\u0010\f\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\u0010\u001a\u00020\r8'X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00118'X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f\u0082\u0001\u0001\u0014ø\u0001\u0001\u0082\u0002\n\n\u0002\b!\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemInfo;", "", "getContentType", "()Ljava/lang/Object;", "contentType", "", "getIndex", "()I", FirebaseAnalytics.Param.INDEX, "getKey", "key", "getLane", "lane", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-nOcc-ac", "()J", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyStaggeredGridItemInfo {
    Object getContentType();

    int getIndex();

    Object getKey();

    int getLane();

    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: not valid java name */
    long mo1201getOffsetnOccac();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo1202getSizeYbymL2g();
}
