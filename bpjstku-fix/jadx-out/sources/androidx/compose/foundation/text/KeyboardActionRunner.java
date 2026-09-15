package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\tR\"\u0010\u000e\u001a\u00020\r8\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "p0", "<init>", "(Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "Landroidx/compose/ui/text/input/ImeAction;", "", "defaultKeyboardAction-KlQnJC8", "(I)V", "defaultKeyboardAction", "runAction-KlQnJC8", "runAction", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyboardActionRunner implements KeyboardActionScope {
    public static final int $stable = 8;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;
    private final SoftwareKeyboardController keyboardController;

    public KeyboardActionRunner(SoftwareKeyboardController softwareKeyboardController) {
        this.keyboardController = softwareKeyboardController;
    }

    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions = this.keyboardActions;
        if (keyboardActions != null) {
            return keyboardActions;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setKeyboardActions(KeyboardActions keyboardActions) {
        this.keyboardActions = keyboardActions;
    }

    public final FocusManager getFocusManager() {
        FocusManager focusManager = this.focusManager;
        if (focusManager != null) {
            return focusManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setFocusManager(FocusManager focusManager) {
        this.focusManager = focusManager;
    }

    /* JADX INFO: renamed from: runAction-KlQnJC8, reason: not valid java name */
    public final void m1320runActionKlQnJC8(int p0) {
        Function1<KeyboardActionScope, Unit> onSend;
        Unit unit = null;
        if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6580getDoneeUduSuo())) {
            onSend = getKeyboardActions().getOnDone();
        } else if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6581getGoeUduSuo())) {
            onSend = getKeyboardActions().getOnGo();
        } else if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6582getNexteUduSuo())) {
            onSend = getKeyboardActions().getOnNext();
        } else if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6584getPreviouseUduSuo())) {
            onSend = getKeyboardActions().getOnPrevious();
        } else if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6585getSearcheUduSuo())) {
            onSend = getKeyboardActions().getOnSearch();
        } else if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6586getSendeUduSuo())) {
            onSend = getKeyboardActions().getOnSend();
        } else {
            if (!ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6579getDefaulteUduSuo()) && !ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6583getNoneeUduSuo())) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            onSend = null;
        }
        if (onSend != null) {
            onSend.invoke(this);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            mo1319defaultKeyboardActionKlQnJC8(p0);
        }
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* JADX INFO: renamed from: defaultKeyboardAction-KlQnJC8, reason: not valid java name */
    public final void mo1319defaultKeyboardActionKlQnJC8(int p0) {
        if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6582getNexteUduSuo())) {
            getFocusManager().mo3867moveFocus3ESFkO8(FocusDirection.INSTANCE.m3861getNextdhqQ8s());
            return;
        }
        if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6584getPreviouseUduSuo())) {
            getFocusManager().mo3867moveFocus3ESFkO8(FocusDirection.INSTANCE.m3862getPreviousdhqQ8s());
            return;
        }
        if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6580getDoneeUduSuo())) {
            SoftwareKeyboardController softwareKeyboardController = this.keyboardController;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
                return;
            }
            return;
        }
        if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6581getGoeUduSuo()) || ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6585getSearcheUduSuo()) || ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6586getSendeUduSuo()) || ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6579getDefaulteUduSuo())) {
            return;
        }
        ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6583getNoneeUduSuo());
    }
}
