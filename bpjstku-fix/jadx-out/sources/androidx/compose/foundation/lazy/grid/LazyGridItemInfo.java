package androidx.compose.foundation.lazy.grid;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00018'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\u0010\u001a\u00020\r8'X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0004R\u0017\u0010\u0015\u001a\u00020\u00138'X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000f\u0082\u0001\u0001\u0017ø\u0001\u0001\u0082\u0002\n\n\u0002\b!\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "", "", "getColumn", "()I", "column", "getContentType", "()Ljava/lang/Object;", "contentType", "getIndex", FirebaseAnalytics.Param.INDEX, "getKey", "key", "Landroidx/compose/ui/unit/IntOffset;", "getOffset-nOcc-ac", "()J", TypedValues.CycleType.S_WAVE_OFFSET, "getRow", "row", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "size", "Companion", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface LazyGridItemInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int UnknownColumn = -1;
    public static final int UnknownRow = -1;

    int getColumn();

    Object getContentType();

    int getIndex();

    Object getKey();

    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: not valid java name */
    long mo1138getOffsetnOccac();

    int getRow();

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo1139getSizeYbymL2g();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo$Companion;", "", "<init>", "()V", "", "UnknownColumn", "I", "UnknownRow"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int UnknownColumn = -1;
        public static final int UnknownRow = -1;

        private Companion() {
        }
    }
}
