package androidx.compose.foundation.pager;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ7\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistance;", "", "", "p0", "p1", "", "p2", "p3", "p4", "calculateTargetPage", "(IIFII)I", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PagerSnapDistance {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    int calculateTargetPage(int p0, int p1, float p2, int p3, int p4);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistance$Companion;", "", "<init>", "()V", "", "p0", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "atMost", "(I)Landroidx/compose/foundation/pager/PagerSnapDistance;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final PagerSnapDistance atMost(int p0) {
            if (p0 < 0) {
                StringBuilder sb = new StringBuilder("pages should be greater than or equal to 0. You have used ");
                sb.append(p0);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            return new PagerSnapDistanceMaxPages(p0);
        }
    }
}
