package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethodsN;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroidx/compose/ui/input/pointer/PointerIcon;", "p1", "Landroid/view/PointerIcon;", "toAndroidPointerIcon", "(Landroid/content/Context;Landroidx/compose/ui/input/pointer/PointerIcon;)Landroid/view/PointerIcon;", "Landroid/view/View;", "", "setPointerIcon", "(Landroid/view/View;Landroidx/compose/ui/input/pointer/PointerIcon;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    public final PointerIcon toAndroidPointerIcon(Context p0, androidx.compose.ui.input.pointer.PointerIcon p1) {
        if (p1 instanceof AndroidPointerIcon) {
            return ((AndroidPointerIcon) p1).getPointerIcon();
        }
        return p1 instanceof AndroidPointerIconType ? PointerIcon.getSystemIcon(p0, ((AndroidPointerIconType) p1).getType()) : PointerIcon.getSystemIcon(p0, 1000);
    }

    public final void setPointerIcon(View p0, androidx.compose.ui.input.pointer.PointerIcon p1) {
        PointerIcon androidPointerIcon = toAndroidPointerIcon(p0.getContext(), p1);
        if (Intrinsics.areEqual(p0.getPointerIcon(), androidPointerIcon)) {
            return;
        }
        p0.setPointerIcon(androidPointerIcon);
    }
}
