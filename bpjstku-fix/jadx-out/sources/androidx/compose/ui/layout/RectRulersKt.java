package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0017\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0001\u0010\u0005\u001a'\u0010\b\u001a\u00020\u0000*\u00020\u00062\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0007\"\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u0000*\u00020\u00062\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0007\"\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Landroidx/compose/ui/layout/RectRulers;", "RectRulers", "()Landroidx/compose/ui/layout/RectRulers;", "", "p0", "(Ljava/lang/String;)Landroidx/compose/ui/layout/RectRulers;", "Landroidx/compose/ui/layout/RectRulers$Companion;", "", "innermostOf", "(Landroidx/compose/ui/layout/RectRulers$Companion;[Landroidx/compose/ui/layout/RectRulers;)Landroidx/compose/ui/layout/RectRulers;", "outermostOf"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RectRulersKt {
    public static final RectRulers RectRulers() {
        return new RectRulersImpl(null);
    }

    public static final RectRulers RectRulers(String str) {
        return new RectRulersImpl(str);
    }

    public static final RectRulers innermostOf(RectRulers.Companion companion, RectRulers... rectRulersArr) {
        return new InnerRectRulers(rectRulersArr);
    }

    public static final RectRulers outermostOf(RectRulers.Companion companion, RectRulers... rectRulersArr) {
        return new OuterRectRulers(rectRulersArr);
    }
}
