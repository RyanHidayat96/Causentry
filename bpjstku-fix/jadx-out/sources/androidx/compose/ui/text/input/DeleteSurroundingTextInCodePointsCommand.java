package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "", "p0", "p1", "<init>", "(II)V", "Landroidx/compose/ui/text/input/EditingBuffer;", "", "applyTo", "(Landroidx/compose/ui/text/input/EditingBuffer;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "lengthBeforeCursor", "I", "getLengthBeforeCursor", "lengthAfterCursor", "getLengthAfterCursor"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    public static final int $stable = 0;
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ");
            sb.append(i);
            sb.append(" and ");
            sb.append(i2);
            sb.append(" respectively.");
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    @Override // androidx.compose.ui.text.input.EditCommand
    public final void applyTo(EditingBuffer p0) {
        int i = this.lengthBeforeCursor;
        int length$ui_text = 0;
        int selectionStart = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = selectionStart + 1;
            if (p0.getSelectionStart() > i3) {
                selectionStart = EditCommandKt.isSurrogatePair(p0.get$ui_text((p0.getSelectionStart() - i3) + (-1)), p0.get$ui_text(p0.getSelectionStart() - i3)) ? selectionStart + 2 : i3;
            } else {
                selectionStart = p0.getSelectionStart();
                break;
            }
        }
        int i4 = this.lengthAfterCursor;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = length$ui_text + 1;
            if (p0.getSelectionEnd() + i6 < p0.getLength$ui_text()) {
                length$ui_text = EditCommandKt.isSurrogatePair(p0.get$ui_text((p0.getSelectionEnd() + i6) + (-1)), p0.get$ui_text(p0.getSelectionEnd() + i6)) ? length$ui_text + 2 : i6;
            } else {
                length$ui_text = p0.getLength$ui_text() - p0.getSelectionEnd();
                break;
            }
        }
        p0.delete$ui_text(p0.getSelectionEnd(), p0.getSelectionEnd() + length$ui_text);
        p0.delete$ui_text(p0.getSelectionStart() - selectionStart, p0.getSelectionStart());
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) p0;
        return this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor;
    }

    public final int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.lengthBeforeCursor);
        sb.append(", lengthAfterCursor=");
        sb.append(this.lengthAfterCursor);
        sb.append(')');
        return sb.toString();
    }
}
