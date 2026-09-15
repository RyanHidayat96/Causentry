package androidx.compose.foundation;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00020\u0001*\u00020\f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\"\u0018\u0010\u0013\u001a\u00020\u0001*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "isComposeRootInScrollableContainer", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "Landroid/view/View;", "isInScrollableViewGroup", "(Landroid/view/View;)Z", "", "TapIndicationDelay", "J", "getTapIndicationDelay", "()J", "Landroidx/compose/ui/input/key/KeyEvent;", "isClick-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isClick", "isEnter-ZmokQxo", "isEnter", "isPress-ZmokQxo", "isPress"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final boolean isComposeRootInScrollableContainer(DelegatableNode delegatableNode) {
        return isInScrollableViewGroup(DelegatableNode_androidKt.requireView(delegatableNode));
    }

    private static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    /* JADX INFO: renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m604isPressZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m5357equalsimpl0(KeyEvent_androidKt.m5365getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m5361getKeyDownCS__XNY()) && m603isEnterZmokQxo(keyEvent);
    }

    /* JADX INFO: renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m602isClickZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m5357equalsimpl0(KeyEvent_androidKt.m5365getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m5362getKeyUpCS__XNY()) && m603isEnterZmokQxo(keyEvent);
    }

    /* JADX INFO: renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m603isEnterZmokQxo(KeyEvent keyEvent) {
        int iM5371getNativeKeyCodeYVgTNJs = Key_androidKt.m5371getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m5364getKeyZmokQxo(keyEvent));
        return iM5371getNativeKeyCodeYVgTNJs == 23 || iM5371getNativeKeyCodeYVgTNJs == 66 || iM5371getNativeKeyCodeYVgTNJs == 160;
    }
}
