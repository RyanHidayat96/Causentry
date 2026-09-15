package androidx.compose.ui;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bç\u0080\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0003\f\r\u000bJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment;", "", "Landroidx/compose/ui/unit/IntSize;", "p0", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "Landroidx/compose/ui/unit/IntOffset;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "align", "Companion", "Horizontal", "Vertical"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Alignment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: renamed from: align-KFBX0sM, reason: not valid java name */
    long mo3697alignKFBX0sM(long p0, long p1, LayoutDirection p2);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH§\u0002¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Horizontal;", "", "", "p0", "p1", "Landroidx/compose/ui/unit/LayoutDirection;", "p2", "align", "(IILandroidx/compose/ui/unit/LayoutDirection;)I", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/ui/Alignment;", "plus", "(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Alignment;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Horizontal {
        int align(int p0, int p1, LayoutDirection p2);

        default Alignment plus(Vertical p0) {
            return new CombinedAlignment(this, p0);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H§\u0002¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Vertical;", "", "", "p0", "p1", "align", "(II)I", "Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/Alignment;", "plus", "(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Alignment;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Vertical {
        int align(int p0, int p1);

        default Alignment plus(Horizontal p0) {
            return new CombinedAlignment(p0, this);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR \u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR \u0010\u0010\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR \u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR \u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR \u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR \u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR \u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR \u0010#\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R \u0010(\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010$\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010&R \u0010+\u001a\u00020\"8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010$\u0012\u0004\b-\u0010\u0003\u001a\u0004\b,\u0010&R \u0010/\u001a\u00020.8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010\u0003\u001a\u0004\b1\u00102R \u00104\u001a\u00020.8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00100\u0012\u0004\b6\u0010\u0003\u001a\u0004\b5\u00102R \u00107\u001a\u00020.8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00100\u0012\u0004\b9\u0010\u0003\u001a\u0004\b8\u00102"}, d2 = {"Landroidx/compose/ui/Alignment$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/Alignment;", "TopStart", "Landroidx/compose/ui/Alignment;", "getTopStart", "()Landroidx/compose/ui/Alignment;", "getTopStart$annotations", "TopCenter", "getTopCenter", "getTopCenter$annotations", "TopEnd", "getTopEnd", "getTopEnd$annotations", "CenterStart", "getCenterStart", "getCenterStart$annotations", "Center", "getCenter", "getCenter$annotations", "CenterEnd", "getCenterEnd", "getCenterEnd$annotations", "BottomStart", "getBottomStart", "getBottomStart$annotations", "BottomCenter", "getBottomCenter", "getBottomCenter$annotations", "BottomEnd", "getBottomEnd", "getBottomEnd$annotations", "Landroidx/compose/ui/Alignment$Vertical;", "Top", "Landroidx/compose/ui/Alignment$Vertical;", "getTop", "()Landroidx/compose/ui/Alignment$Vertical;", "getTop$annotations", "CenterVertically", "getCenterVertically", "getCenterVertically$annotations", "Bottom", "getBottom", "getBottom$annotations", "Landroidx/compose/ui/Alignment$Horizontal;", "Start", "Landroidx/compose/ui/Alignment$Horizontal;", "getStart", "()Landroidx/compose/ui/Alignment$Horizontal;", "getStart$annotations", "CenterHorizontally", "getCenterHorizontally", "getCenterHorizontally$annotations", "End", "getEnd", "getEnd$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Alignment TopStart = new BiasAlignment(-1.0f, -1.0f);
        private static final Alignment TopCenter = new BiasAlignment(0.0f, -1.0f);
        private static final Alignment TopEnd = new BiasAlignment(1.0f, -1.0f);
        private static final Alignment CenterStart = new BiasAlignment(-1.0f, 0.0f);
        private static final Alignment Center = new BiasAlignment(0.0f, 0.0f);
        private static final Alignment CenterEnd = new BiasAlignment(1.0f, 0.0f);
        private static final Alignment BottomStart = new BiasAlignment(-1.0f, 1.0f);
        private static final Alignment BottomCenter = new BiasAlignment(0.0f, 1.0f);
        private static final Alignment BottomEnd = new BiasAlignment(1.0f, 1.0f);
        private static final Vertical Top = new BiasAlignment.Vertical(-1.0f);
        private static final Vertical CenterVertically = new BiasAlignment.Vertical(0.0f);
        private static final Vertical Bottom = new BiasAlignment.Vertical(1.0f);
        private static final Horizontal Start = new BiasAlignment.Horizontal(-1.0f);
        private static final Horizontal CenterHorizontally = new BiasAlignment.Horizontal(0.0f);
        private static final Horizontal End = new BiasAlignment.Horizontal(1.0f);

        public static /* synthetic */ void getBottom$annotations() {
        }

        public static /* synthetic */ void getBottomCenter$annotations() {
        }

        public static /* synthetic */ void getBottomEnd$annotations() {
        }

        public static /* synthetic */ void getBottomStart$annotations() {
        }

        public static /* synthetic */ void getCenter$annotations() {
        }

        public static /* synthetic */ void getCenterEnd$annotations() {
        }

        public static /* synthetic */ void getCenterHorizontally$annotations() {
        }

        public static /* synthetic */ void getCenterStart$annotations() {
        }

        public static /* synthetic */ void getCenterVertically$annotations() {
        }

        public static /* synthetic */ void getEnd$annotations() {
        }

        public static /* synthetic */ void getStart$annotations() {
        }

        public static /* synthetic */ void getTop$annotations() {
        }

        public static /* synthetic */ void getTopCenter$annotations() {
        }

        public static /* synthetic */ void getTopEnd$annotations() {
        }

        public static /* synthetic */ void getTopStart$annotations() {
        }

        private Companion() {
        }

        public final Alignment getTopStart() {
            return TopStart;
        }

        public final Alignment getTopCenter() {
            return TopCenter;
        }

        public final Alignment getTopEnd() {
            return TopEnd;
        }

        public final Alignment getCenterStart() {
            return CenterStart;
        }

        public final Alignment getCenter() {
            return Center;
        }

        public final Alignment getCenterEnd() {
            return CenterEnd;
        }

        public final Alignment getBottomStart() {
            return BottomStart;
        }

        public final Alignment getBottomCenter() {
            return BottomCenter;
        }

        public final Alignment getBottomEnd() {
            return BottomEnd;
        }

        public final Vertical getTop() {
            return Top;
        }

        public final Vertical getCenterVertically() {
            return CenterVertically;
        }

        public final Vertical getBottom() {
            return Bottom;
        }

        public final Horizontal getStart() {
            return Start;
        }

        public final Horizontal getCenterHorizontally() {
            return CenterHorizontally;
        }

        public final Horizontal getEnd() {
            return End;
        }
    }
}
