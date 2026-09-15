package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/LayoutBoundsHolder;", "p0", "layoutBounds", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/LayoutBoundsHolder;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LayoutBoundsHolderKt {
    public static final Modifier layoutBounds(Modifier modifier, LayoutBoundsHolder layoutBoundsHolder) {
        return modifier.then(new LayoutBoundsElement(layoutBoundsHolder));
    }
}
