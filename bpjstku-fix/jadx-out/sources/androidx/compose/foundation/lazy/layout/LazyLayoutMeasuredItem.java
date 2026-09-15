package androidx.compose.foundation.lazy.layout;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00108'X¦\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010 \u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010$\u001a\u00020\u00178'@'X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0015R\u0014\u0010(\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0015ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "", "", "p0", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-Bjo55l4", "(I)J", "getOffset", "getParentData", "(I)Ljava/lang/Object;", "p1", "p2", "p3", "", "position", "(IIII)V", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-msEJaDk", "()J", "constraints", "getIndex", "()I", FirebaseAnalytics.Param.INDEX, "", "isVertical", "()Z", "getKey", "()Ljava/lang/Object;", "key", "getLane", "lane", "getMainAxisSizeWithSpacings", "mainAxisSizeWithSpacings", "getNonScrollableItem", "setNonScrollableItem", "(Z)V", "nonScrollableItem", "getPlaceablesCount", "placeablesCount", "getSpan", "span"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyLayoutMeasuredItem {
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    long mo1113getConstraintsmsEJaDk();

    int getIndex();

    Object getKey();

    int getLane();

    int getMainAxisSizeWithSpacings();

    boolean getNonScrollableItem();

    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    long mo1114getOffsetBjo55l4(int p0);

    Object getParentData(int p0);

    int getPlaceablesCount();

    int getSpan();

    boolean isVertical();

    void position(int p0, int p1, int p2, int p3);

    void setNonScrollableItem(boolean z);
}
