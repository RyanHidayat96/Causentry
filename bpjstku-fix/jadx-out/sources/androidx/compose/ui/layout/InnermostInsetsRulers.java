package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00158\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019"}, d2 = {"Landroidx/compose/ui/layout/InnermostInsetsRulers;", "Landroidx/compose/ui/layout/WindowInsetsRulers;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;[Landroidx/compose/ui/layout/WindowInsetsRulers;)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/layout/WindowInsetsAnimation;", "getAnimation", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/WindowInsetsAnimation;", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName", "rulers", "[Landroidx/compose/ui/layout/WindowInsetsRulers;", "getRulers", "()[Landroidx/compose/ui/layout/WindowInsetsRulers;", "Landroidx/compose/ui/layout/RectRulers;", "current", "Landroidx/compose/ui/layout/RectRulers;", "getCurrent", "()Landroidx/compose/ui/layout/RectRulers;", "maximum", "getMaximum"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class InnermostInsetsRulers implements WindowInsetsRulers {
    private final RectRulers current;
    private final RectRulers maximum;
    private final String name;
    private final WindowInsetsRulers[] rulers;

    public InnermostInsetsRulers(String str, WindowInsetsRulers[] windowInsetsRulersArr) {
        this.name = str;
        this.rulers = windowInsetsRulersArr;
        RectRulers.Companion companion = RectRulers.INSTANCE;
        ArrayList arrayList = new ArrayList(windowInsetsRulersArr.length);
        for (WindowInsetsRulers windowInsetsRulers : windowInsetsRulersArr) {
            arrayList.add(windowInsetsRulers.getCurrent());
        }
        RectRulers[] rectRulersArr = (RectRulers[]) arrayList.toArray(new RectRulers[0]);
        this.current = RectRulersKt.innermostOf(companion, (RectRulers[]) Arrays.copyOf(rectRulersArr, rectRulersArr.length));
        RectRulers.Companion companion2 = RectRulers.INSTANCE;
        WindowInsetsRulers[] windowInsetsRulersArr2 = this.rulers;
        ArrayList arrayList2 = new ArrayList(windowInsetsRulersArr2.length);
        for (WindowInsetsRulers windowInsetsRulers2 : windowInsetsRulersArr2) {
            arrayList2.add(windowInsetsRulers2.getMaximum());
        }
        RectRulers[] rectRulersArr2 = (RectRulers[]) arrayList2.toArray(new RectRulers[0]);
        this.maximum = RectRulersKt.innermostOf(companion2, (RectRulers[]) Arrays.copyOf(rectRulersArr2, rectRulersArr2.length));
    }

    public final String getName() {
        return this.name;
    }

    public final WindowInsetsRulers[] getRulers() {
        return this.rulers;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public final RectRulers getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public final RectRulers getMaximum() {
        return this.maximum;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public final WindowInsetsAnimation getAnimation(Placeable.PlacementScope p0) {
        return new InnermostAnimationProperties(p0, this.rulers);
    }

    public final String toString() {
        String str = this.name;
        return str == null ? ArraysKt.joinToString$default(this.rulers, (CharSequence) null, "innermostOf(", ")", 0, (CharSequence) null, (Function1) null, 57, (Object) null) : str;
    }
}
