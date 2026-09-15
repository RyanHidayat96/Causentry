package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0082\u0001\u0002\u000e\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/WindowInsetsRulers;", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "p0", "Landroidx/compose/ui/layout/WindowInsetsAnimation;", "getAnimation", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/WindowInsetsAnimation;", "Landroidx/compose/ui/layout/RectRulers;", "getCurrent", "()Landroidx/compose/ui/layout/RectRulers;", "current", "getMaximum", "maximum", "Companion", "Landroidx/compose/ui/layout/InnermostInsetsRulers;", "Landroidx/compose/ui/layout/WindowInsetsRulersImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WindowInsetsRulers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    WindowInsetsAnimation getAnimation(Placeable.PlacementScope p0);

    RectRulers getCurrent();

    RectRulers getMaximum();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\f"}, d2 = {"Landroidx/compose/ui/layout/WindowInsetsRulers$Companion;", "", "<init>", "()V", "", "Landroidx/compose/ui/layout/WindowInsetsRulers;", "p0", "innermostOf", "([Landroidx/compose/ui/layout/WindowInsetsRulers;)Landroidx/compose/ui/layout/WindowInsetsRulers;", "CaptionBar", "Landroidx/compose/ui/layout/WindowInsetsRulers;", "getCaptionBar", "()Landroidx/compose/ui/layout/WindowInsetsRulers;", "DisplayCutout", "getDisplayCutout", "Ime", "getIme", "MandatorySystemGestures", "getMandatorySystemGestures", "NavigationBars", "getNavigationBars", "StatusBars", "getStatusBars", "SystemBars", "getSystemBars", "SystemGestures", "getSystemGestures", "TappableElement", "getTappableElement", "Waterfall", "getWaterfall", "SafeDrawing", "getSafeDrawing", "SafeGestures", "getSafeGestures", "SafeContent", "getSafeContent"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final WindowInsetsRulers CaptionBar;
        private static final WindowInsetsRulers DisplayCutout;
        private static final WindowInsetsRulers Ime;
        private static final WindowInsetsRulers MandatorySystemGestures;
        private static final WindowInsetsRulers NavigationBars;
        private static final WindowInsetsRulers SafeContent;
        private static final WindowInsetsRulers SafeDrawing;
        private static final WindowInsetsRulers SafeGestures;
        private static final WindowInsetsRulers StatusBars;
        private static final WindowInsetsRulers SystemBars;
        private static final WindowInsetsRulers SystemGestures;
        private static final WindowInsetsRulers TappableElement;
        private static final WindowInsetsRulers Waterfall;

        private Companion() {
        }

        static {
            WindowInsetsRulersImpl windowInsetsRulersImpl = new WindowInsetsRulersImpl("caption bar");
            CaptionBar = windowInsetsRulersImpl;
            WindowInsetsRulersImpl windowInsetsRulersImpl2 = new WindowInsetsRulersImpl("display cutout");
            DisplayCutout = windowInsetsRulersImpl2;
            WindowInsetsRulersImpl windowInsetsRulersImpl3 = new WindowInsetsRulersImpl("ime");
            Ime = windowInsetsRulersImpl3;
            WindowInsetsRulersImpl windowInsetsRulersImpl4 = new WindowInsetsRulersImpl("mandatory system gestures");
            MandatorySystemGestures = windowInsetsRulersImpl4;
            WindowInsetsRulersImpl windowInsetsRulersImpl5 = new WindowInsetsRulersImpl("navigation bars");
            NavigationBars = windowInsetsRulersImpl5;
            WindowInsetsRulersImpl windowInsetsRulersImpl6 = new WindowInsetsRulersImpl("status bars");
            StatusBars = windowInsetsRulersImpl6;
            SystemBars = new InnermostInsetsRulers("system bars", new WindowInsetsRulers[]{windowInsetsRulersImpl6, windowInsetsRulersImpl5, windowInsetsRulersImpl});
            WindowInsetsRulersImpl windowInsetsRulersImpl7 = new WindowInsetsRulersImpl("system gestures");
            SystemGestures = windowInsetsRulersImpl7;
            WindowInsetsRulersImpl windowInsetsRulersImpl8 = new WindowInsetsRulersImpl("tappable element");
            TappableElement = windowInsetsRulersImpl8;
            WindowInsetsRulersImpl windowInsetsRulersImpl9 = new WindowInsetsRulersImpl("waterfall");
            Waterfall = windowInsetsRulersImpl9;
            SafeDrawing = new InnermostInsetsRulers("safe drawing", new WindowInsetsRulers[]{windowInsetsRulersImpl6, windowInsetsRulersImpl5, windowInsetsRulersImpl, windowInsetsRulersImpl2, windowInsetsRulersImpl3, windowInsetsRulersImpl8});
            SafeGestures = new InnermostInsetsRulers("safe gestures", new WindowInsetsRulers[]{windowInsetsRulersImpl4, windowInsetsRulersImpl7, windowInsetsRulersImpl8, windowInsetsRulersImpl9});
            SafeContent = new InnermostInsetsRulers("safe content", new WindowInsetsRulers[]{windowInsetsRulersImpl6, windowInsetsRulersImpl5, windowInsetsRulersImpl, windowInsetsRulersImpl3, windowInsetsRulersImpl7, windowInsetsRulersImpl4, windowInsetsRulersImpl8, windowInsetsRulersImpl2, windowInsetsRulersImpl9});
        }

        public final WindowInsetsRulers getCaptionBar() {
            return CaptionBar;
        }

        public final WindowInsetsRulers getDisplayCutout() {
            return DisplayCutout;
        }

        public final WindowInsetsRulers getIme() {
            return Ime;
        }

        public final WindowInsetsRulers getMandatorySystemGestures() {
            return MandatorySystemGestures;
        }

        public final WindowInsetsRulers getNavigationBars() {
            return NavigationBars;
        }

        public final WindowInsetsRulers getStatusBars() {
            return StatusBars;
        }

        public final WindowInsetsRulers getSystemBars() {
            return SystemBars;
        }

        public final WindowInsetsRulers getSystemGestures() {
            return SystemGestures;
        }

        public final WindowInsetsRulers getTappableElement() {
            return TappableElement;
        }

        public final WindowInsetsRulers getWaterfall() {
            return Waterfall;
        }

        public final WindowInsetsRulers getSafeDrawing() {
            return SafeDrawing;
        }

        public final WindowInsetsRulers getSafeGestures() {
            return SafeGestures;
        }

        public final WindowInsetsRulers getSafeContent() {
            return SafeContent;
        }

        public final WindowInsetsRulers innermostOf(WindowInsetsRulers... p0) {
            return new InnermostInsetsRulers(null, p0);
        }
    }
}
