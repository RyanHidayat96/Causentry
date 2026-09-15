package androidx.compose.foundation.text.input.internal;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JP\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/AndroidTextFieldKeyEventHandler;", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEvent;", "p0", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "p1", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "p2", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "p3", "", "p4", "p5", "Lkotlin/Function0;", "", "p6", "onKeyEvent-6ptp14s", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZZLkotlin/jvm/functions/Function0;)Z", "onKeyEvent", "Landroidx/compose/ui/focus/FocusManager;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "onPreKeyEvent-MyFupTE", "(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z", "onPreKeyEvent"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidTextFieldKeyEventHandler extends TextFieldKeyEventHandler {
    public static final int $stable = 0;

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* JADX INFO: renamed from: onPreKeyEvent-MyFupTE, reason: not valid java name */
    public final boolean mo1455onPreKeyEventMyFupTE(KeyEvent p0, TransformedTextFieldState p1, TextFieldSelectionState p2, FocusManager p3, SoftwareKeyboardController p4) {
        if (super.mo1455onPreKeyEventMyFupTE(p0, p1, p2, p3, p4)) {
            return true;
        }
        InputDevice device = p0.getDevice();
        if (device == null || !device.supportsSource(InputDeviceCompat.SOURCE_DPAD) || device.isVirtual() || !KeyEventType.m5357equalsimpl0(KeyEvent_androidKt.m5365getTypeZmokQxo(p0), KeyEventType.INSTANCE.m5361getKeyDownCS__XNY()) || p0.getSource() == 257) {
            return false;
        }
        if (TextFieldKeyEventHandler_androidKt.m1527isKeyCodeYhN2O0w(p0, 19)) {
            return p3.mo3867moveFocus3ESFkO8(FocusDirection.INSTANCE.m3864getUpdhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m1527isKeyCodeYhN2O0w(p0, 20)) {
            return p3.mo3867moveFocus3ESFkO8(FocusDirection.INSTANCE.m3857getDowndhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m1527isKeyCodeYhN2O0w(p0, 21)) {
            return p3.mo3867moveFocus3ESFkO8(FocusDirection.INSTANCE.m3860getLeftdhqQ8s());
        }
        if (TextFieldKeyEventHandler_androidKt.m1527isKeyCodeYhN2O0w(p0, 22)) {
            return p3.mo3867moveFocus3ESFkO8(FocusDirection.INSTANCE.m3863getRightdhqQ8s());
        }
        if (!TextFieldKeyEventHandler_androidKt.m1527isKeyCodeYhN2O0w(p0, 23)) {
            return false;
        }
        p4.show();
        return true;
    }

    @Override // androidx.compose.foundation.text.input.internal.TextFieldKeyEventHandler
    /* JADX INFO: renamed from: onKeyEvent-6ptp14s, reason: not valid java name */
    public final boolean mo1454onKeyEvent6ptp14s(KeyEvent p0, TransformedTextFieldState p1, TextLayoutState p2, TextFieldSelectionState p3, boolean p4, boolean p5, Function0<Unit> p6) {
        if (KeyEventType.m5357equalsimpl0(KeyEvent_androidKt.m5365getTypeZmokQxo(p0), KeyEventType.INSTANCE.m5361getKeyDownCS__XNY()) && p0.isFromSource(257) && !TextFieldKeyEventHandler_androidKt.m1526isFromSoftKeyboardZmokQxo(p0)) {
            p3.setInTouchMode(false);
        }
        return super.mo1454onKeyEvent6ptp14s(p0, p1, p2, p3, p4, p5, p6);
    }
}
