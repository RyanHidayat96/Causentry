package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.Key_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001e\u0010\t\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0018\u0010\f\u001a\u00020\u0006*\u00020\u00038AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "createTextFieldKeyEventHandler", "()Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "p0", "", "isKeyCode-YhN2O0w", "(Landroid/view/KeyEvent;I)Z", "isKeyCode", "isFromSoftKeyboard-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "isFromSoftKeyboard"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldKeyEventHandler_androidKt {
    public static final TextFieldKeyEventHandler createTextFieldKeyEventHandler() {
        return new AndroidTextFieldKeyEventHandler();
    }

    /* JADX INFO: renamed from: isFromSoftKeyboard-ZmokQxo, reason: not valid java name */
    public static final boolean m1526isFromSoftKeyboardZmokQxo(KeyEvent keyEvent) {
        return (keyEvent.getFlags() & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m1527isKeyCodeYhN2O0w(KeyEvent keyEvent, int i) {
        return Key_androidKt.m5371getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m5364getKeyZmokQxo(keyEvent)) == i;
    }
}
