package androidx.compose.foundation.pager;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\u0082\u0001\u0001\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PageInfo;", "", "", "getIndex", "()I", FirebaseAnalytics.Param.INDEX, "getKey", "()Ljava/lang/Object;", "key", "getOffset", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/foundation/pager/MeasuredPage;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PageInfo {
    int getIndex();

    Object getKey();

    int getOffset();
}
