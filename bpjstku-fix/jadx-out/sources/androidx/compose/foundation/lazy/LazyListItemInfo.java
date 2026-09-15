package androidx.compose.foundation.lazy;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0003R\u0014\u0010\f\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListItemInfo;", "", "getContentType", "()Ljava/lang/Object;", "contentType", "", "getIndex", "()I", FirebaseAnalytics.Param.INDEX, "getKey", "key", "getOffset", TypedValues.CycleType.S_WAVE_OFFSET, "getSize", "size"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyListItemInfo {
    default Object getContentType() {
        return null;
    }

    int getIndex();

    Object getKey();

    int getOffset();

    int getSize();
}
