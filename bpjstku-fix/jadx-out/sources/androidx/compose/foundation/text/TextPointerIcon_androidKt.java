package androidx.compose.foundation.text;

import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIcon_androidKt;
import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon;", "textPointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getTextPointerIcon", "()Landroidx/compose/ui/input/pointer/PointerIcon;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextPointerIcon_androidKt {
    private static final PointerIcon textPointerIcon = PointerIcon_androidKt.PointerIcon(PointerIconCompat.TYPE_TEXT);

    public static final PointerIcon getTextPointerIcon() {
        return textPointerIcon;
    }
}
