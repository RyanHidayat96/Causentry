package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\f\u001a\u00020\t*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "p0", "Landroidx/compose/ui/focus/FocusManager;", "p1", "interceptDPadAndMoveFocus", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/ui/focus/FocusManager;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "", "isKeyCode-YhN2O0w", "(Landroid/view/KeyEvent;I)Z", "isKeyCode"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldFocusModifier_androidKt {
    public static final Modifier interceptDPadAndMoveFocus(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final FocusManager focusManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus.1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1394invokeZmokQxo(keyEvent.m5353unboximpl());
            }

            /* JADX WARN: Code duplicated, block: B:30:0x0095  */
            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1394invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean zMo3867moveFocus3ESFkO8;
                InputDevice device = keyEvent.getDevice();
                if (device == null || !device.supportsSource(InputDeviceCompat.SOURCE_DPAD) || device.isVirtual() || !KeyEventType.m5357equalsimpl0(KeyEvent_androidKt.m5365getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m5361getKeyDownCS__XNY()) || keyEvent.getSource() == 257) {
                    zMo3867moveFocus3ESFkO8 = false;
                } else if (TextFieldFocusModifier_androidKt.m1393isKeyCodeYhN2O0w(keyEvent, 19)) {
                    zMo3867moveFocus3ESFkO8 = focusManager.mo3867moveFocus3ESFkO8(FocusDirection.INSTANCE.m3864getUpdhqQ8s());
                } else if (TextFieldFocusModifier_androidKt.m1393isKeyCodeYhN2O0w(keyEvent, 20)) {
                    zMo3867moveFocus3ESFkO8 = focusManager.mo3867moveFocus3ESFkO8(FocusDirection.INSTANCE.m3857getDowndhqQ8s());
                } else if (TextFieldFocusModifier_androidKt.m1393isKeyCodeYhN2O0w(keyEvent, 21)) {
                    zMo3867moveFocus3ESFkO8 = focusManager.mo3867moveFocus3ESFkO8(FocusDirection.INSTANCE.m3860getLeftdhqQ8s());
                } else if (TextFieldFocusModifier_androidKt.m1393isKeyCodeYhN2O0w(keyEvent, 22)) {
                    zMo3867moveFocus3ESFkO8 = focusManager.mo3867moveFocus3ESFkO8(FocusDirection.INSTANCE.m3863getRightdhqQ8s());
                } else if (TextFieldFocusModifier_androidKt.m1393isKeyCodeYhN2O0w(keyEvent, 23)) {
                    SoftwareKeyboardController keyboardController = legacyTextFieldState.getKeyboardController();
                    if (keyboardController != null) {
                        keyboardController.show();
                    }
                    zMo3867moveFocus3ESFkO8 = true;
                } else {
                    zMo3867moveFocus3ESFkO8 = false;
                }
                return Boolean.valueOf(zMo3867moveFocus3ESFkO8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isKeyCode-YhN2O0w, reason: not valid java name */
    public static final boolean m1393isKeyCodeYhN2O0w(android.view.KeyEvent keyEvent, int i) {
        return Key_androidKt.m5371getNativeKeyCodeYVgTNJs(KeyEvent_androidKt.m5364getKeyZmokQxo(keyEvent)) == i;
    }
}
