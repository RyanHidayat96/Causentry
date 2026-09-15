package androidx.compose.foundation.text.input;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bR\u0017\u0010\u000f\u001a\u00020\u000b8G¢\u0006\f\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000b8G¢\u0006\f\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/foundation/text/input/UndoState;", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "p0", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldState;)V", "", "clearHistory", "()V", "redo", "undo", "", "getCanRedo", "()Z", "getCanRedo$annotations", "canRedo", "getCanUndo", "getCanUndo$annotations", "canUndo", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/text/input/TextFieldState;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UndoState {
    public static final int $stable = 0;
    private final TextFieldState state;

    public static /* synthetic */ void getCanRedo$annotations() {
    }

    public static /* synthetic */ void getCanUndo$annotations() {
    }

    public UndoState(TextFieldState textFieldState) {
        this.state = textFieldState;
    }

    public final boolean getCanUndo() {
        return this.state.getTextUndoManager().getCanUndo();
    }

    public final boolean getCanRedo() {
        return this.state.getTextUndoManager().getCanRedo();
    }

    public final void undo() {
        this.state.getTextUndoManager().undo(this.state);
    }

    public final void redo() {
        this.state.getTextUndoManager().redo(this.state);
    }

    public final void clearHistory() {
        this.state.getTextUndoManager().clearHistory();
    }
}
