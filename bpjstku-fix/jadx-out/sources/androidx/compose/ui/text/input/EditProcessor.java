package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u0011*\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00198\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/TextFieldValue;", "p0", "Landroidx/compose/ui/text/input/TextInputSession;", "p1", "", "reset", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextInputSession;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "apply", "(Ljava/util/List;)Landroidx/compose/ui/text/input/TextFieldValue;", "toTextFieldValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "", "generateBatchErrorMessage", "(Ljava/util/List;Landroidx/compose/ui/text/input/EditCommand;)Ljava/lang/String;", "toStringForLog", "(Landroidx/compose/ui/text/input/EditCommand;)Ljava/lang/String;", "mBufferState", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMBufferState$ui_text", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "getMBuffer$ui_text", "()Landroidx/compose/ui/text/input/EditingBuffer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EditProcessor {
    public static final int $stable = 8;
    private TextFieldValue mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), TextRange.INSTANCE.m6402getZerod9O1mEE(), (TextRange) null, (DefaultConstructorMarker) null);
    private EditingBuffer mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.getSelection(), (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: getMBufferState$ui_text, reason: from getter */
    public final TextFieldValue getMBufferState() {
        return this.mBufferState;
    }

    /* JADX INFO: renamed from: getMBuffer$ui_text, reason: from getter */
    public final EditingBuffer getMBuffer() {
        return this.mBuffer;
    }

    public final void reset(TextFieldValue p0, TextInputSession p1) {
        boolean zAreEqual = Intrinsics.areEqual(p0.getComposition(), this.mBuffer.m6560getCompositionMzsxiRA$ui_text());
        boolean z = true;
        boolean z2 = false;
        if (!Intrinsics.areEqual(this.mBufferState.getAnnotatedString().getText(), p0.getAnnotatedString().getText())) {
            this.mBuffer = new EditingBuffer(p0.getAnnotatedString(), p0.getSelection(), (DefaultConstructorMarker) null);
        } else {
            if (TextRange.m6390equalsimpl0(this.mBufferState.getSelection(), p0.getSelection())) {
                z = false;
            } else {
                this.mBuffer.setSelection$ui_text(TextRange.m6395getMinimpl(p0.getSelection()), TextRange.m6394getMaximpl(p0.getSelection()));
            }
            z2 = z;
            z = false;
        }
        if (p0.getComposition() == null) {
            this.mBuffer.commitComposition$ui_text();
        } else if (!TextRange.m6391getCollapsedimpl(p0.getComposition().getPackedValue())) {
            this.mBuffer.setComposition$ui_text(TextRange.m6395getMinimpl(p0.getComposition().getPackedValue()), TextRange.m6394getMaximpl(p0.getComposition().getPackedValue()));
        }
        if (z || (!z2 && !zAreEqual)) {
            this.mBuffer.commitComposition$ui_text();
            p0 = TextFieldValue.m6643copy3r_uNRQ$default(p0, (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null);
        }
        TextFieldValue textFieldValue = this.mBufferState;
        this.mBufferState = p0;
        if (p1 != null) {
            p1.updateState(textFieldValue, p0);
        }
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }

    private final String generateBatchErrorMessage(List<? extends EditCommand> p0, final EditCommand p1) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
        sb2.append(this.mBuffer.getLength$ui_text());
        sb2.append(", composition=");
        sb2.append(this.mBuffer.m6560getCompositionMzsxiRA$ui_text());
        sb2.append(", selection=");
        sb2.append((Object) TextRange.m6400toStringimpl(this.mBuffer.m6561getSelectiond9O1mEE$ui_text()));
        sb2.append("):");
        sb.append(sb2.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        CollectionsKt.joinTo(p0, sb, (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) != 0 ? "" : null, (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new Function1() { // from class: androidx.compose.ui.text.input.EditProcessor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EditProcessor.generateBatchErrorMessage$lambda$4$lambda$3(p1, this, (EditCommand) obj);
            }
        });
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence generateBatchErrorMessage$lambda$4$lambda$3(EditCommand editCommand, EditProcessor editProcessor, EditCommand editCommand2) {
        String str = editCommand == editCommand2 ? " > " : "   ";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(editProcessor.toStringForLog(editCommand2));
        return sb.toString();
    }

    private final String toStringForLog(EditCommand editCommand) {
        if (editCommand instanceof CommitTextCommand) {
            StringBuilder sb = new StringBuilder("CommitTextCommand(text.length=");
            CommitTextCommand commitTextCommand = (CommitTextCommand) editCommand;
            sb.append(commitTextCommand.getText().length());
            sb.append(", newCursorPosition=");
            sb.append(commitTextCommand.getNewCursorPosition());
            sb.append(')');
            return sb.toString();
        }
        if (editCommand instanceof SetComposingTextCommand) {
            StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text.length=");
            SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) editCommand;
            sb2.append(setComposingTextCommand.getText().length());
            sb2.append(", newCursorPosition=");
            sb2.append(setComposingTextCommand.getNewCursorPosition());
            sb2.append(')');
            return sb2.toString();
        }
        if (editCommand instanceof SetComposingRegionCommand) {
            return ((SetComposingRegionCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteSurroundingTextCommand) {
            return ((DeleteSurroundingTextCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteSurroundingTextInCodePointsCommand) {
            return ((DeleteSurroundingTextInCodePointsCommand) editCommand).toString();
        }
        if (editCommand instanceof SetSelectionCommand) {
            return ((SetSelectionCommand) editCommand).toString();
        }
        if (editCommand instanceof FinishComposingTextCommand) {
            return ((FinishComposingTextCommand) editCommand).toString();
        }
        if (editCommand instanceof BackspaceCommand) {
            return ((BackspaceCommand) editCommand).toString();
        }
        if (editCommand instanceof MoveCursorCommand) {
            return ((MoveCursorCommand) editCommand).toString();
        }
        if (editCommand instanceof DeleteAllCommand) {
            return ((DeleteAllCommand) editCommand).toString();
        }
        StringBuilder sb3 = new StringBuilder("Unknown EditCommand: ");
        String simpleName = Reflection.getOrCreateKotlinClass(editCommand.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "{anonymous EditCommand}";
        }
        sb3.append(simpleName);
        return sb3.toString();
    }

    public final TextFieldValue apply(List<? extends EditCommand> p0) {
        EditCommand editCommand = null;
        try {
            int size = p0.size();
            int i = 0;
            EditCommand editCommand2 = null;
            while (i < size) {
                try {
                    EditCommand editCommand3 = p0.get(i);
                    try {
                        editCommand3.applyTo(this.mBuffer);
                        i++;
                        editCommand2 = editCommand3;
                    } catch (Exception e2) {
                        e = e2;
                        editCommand = editCommand3;
                        throw new RuntimeException(generateBatchErrorMessage(p0, editCommand), e);
                    }
                } catch (Exception e3) {
                    e = e3;
                    editCommand = editCommand2;
                }
            }
            AnnotatedString annotatedString$ui_text = this.mBuffer.toAnnotatedString$ui_text();
            long jM6561getSelectiond9O1mEE$ui_text = this.mBuffer.m6561getSelectiond9O1mEE$ui_text();
            TextRange textRangeM6385boximpl = TextRange.m6385boximpl(jM6561getSelectiond9O1mEE$ui_text);
            textRangeM6385boximpl.getPackedValue();
            TextRange textRange = TextRange.m6396getReversedimpl(this.mBufferState.getSelection()) ? null : textRangeM6385boximpl;
            TextFieldValue textFieldValue = new TextFieldValue(annotatedString$ui_text, textRange != null ? textRange.getPackedValue() : TextRangeKt.TextRange(TextRange.m6394getMaximpl(jM6561getSelectiond9O1mEE$ui_text), TextRange.m6395getMinimpl(jM6561getSelectiond9O1mEE$ui_text)), this.mBuffer.m6560getCompositionMzsxiRA$ui_text(), (DefaultConstructorMarker) null);
            this.mBufferState = textFieldValue;
            return textFieldValue;
        } catch (Exception e4) {
            e = e4;
        }
    }
}
