package androidx.compose.ui.text.input;

import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/text/input/BackspaceCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "<init>", "()V", "Landroidx/compose/ui/text/input/EditingBuffer;", "p0", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BackspaceCommand implements EditCommand {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(EditingBuffer p0) {
        if (p0.hasComposition$ui_text()) {
            p0.delete$ui_text(p0.getCompositionStart(), p0.getCompositionEnd());
            return;
        }
        if (p0.getCursor$ui_text() == -1) {
            int selectionStart = p0.getSelectionStart();
            int selectionEnd = p0.getSelectionEnd();
            p0.setCursor$ui_text(p0.getSelectionStart());
            p0.delete$ui_text(selectionStart, selectionEnd);
            return;
        }
        if (p0.getCursor$ui_text() == 0) {
            return;
        }
        p0.delete$ui_text(JvmCharHelpers_androidKt.findPrecedingBreak(p0.toString(), p0.getCursor$ui_text()), p0.getCursor$ui_text());
    }

    public final boolean equals(Object p0) {
        return p0 instanceof BackspaceCommand;
    }

    public final int hashCode() {
        return Reflection.getOrCreateKotlinClass(getClass()).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
