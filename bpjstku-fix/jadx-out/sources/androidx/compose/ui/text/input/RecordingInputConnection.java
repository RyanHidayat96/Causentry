package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\f\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010!\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010 J\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010 J\u001f\u0010$\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001cH\u0016¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\u0006H\u0016¢\u0006\u0004\b%\u0010\u0015J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001cH\u0017¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001cH\u0017¢\u0006\u0004\b+\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0003\u001a\u00020\u001cH\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010/J!\u00102\u001a\u0002012\b\u0010\u0003\u001a\u0004\u0018\u0001002\u0006\u0010\u0005\u001a\u00020\u001cH\u0017¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001cH\u0016¢\u0006\u0004\b4\u0010/J\u0017\u00105\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001cH\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001cH\u0016¢\u0006\u0004\b7\u0010/J\u0019\u00109\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0019\u0010<\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001cH\u0016¢\u0006\u0004\bA\u0010/J\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u001cH\u0016¢\u0006\u0004\bD\u0010EJ#\u0010H\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010F2\b\u0010\u0005\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ)\u0010K\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020J2\u0006\u0010\u0005\u001a\u00020\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020FH\u0002¢\u0006\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010S\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010\u0015R\u0016\u0010V\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010WR*\u0010X\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010WR\u0016\u0010_\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b_\u0010TR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00110`8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010T"}, d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "p0", "Landroidx/compose/ui/text/input/InputEventCallback2;", "p1", "", "p2", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputEventCallback2;Z)V", "Lkotlin/Function0;", "", "ensureActive", "(Lkotlin/jvm/functions/Function0;)Z", "Landroidx/compose/ui/text/input/InputMethodManager;", "updateInputState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputMethodManager;)V", "Landroidx/compose/ui/text/input/EditCommand;", "addEditCommandWithBatch", "(Landroidx/compose/ui/text/input/EditCommand;)V", "beginBatchEdit", "()Z", "beginBatchEditInternal", "endBatchEdit", "endBatchEditInternal", "closeConnection", "()V", "", "", "commitText", "(Ljava/lang/CharSequence;I)Z", "setComposingRegion", "(II)Z", "setComposingText", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "performContextMenuAction", "sendSynthesizedKeyEvent", "(I)V", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "clearMetaKeyStates", "reportFullscreenMode", "(Z)Z", "getCursorCapsMode", "(I)I", "", "Landroid/os/Bundle;", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "logDebug", "(Ljava/lang/String;)V", "eventCallback", "Landroidx/compose/ui/text/input/InputEventCallback2;", "getEventCallback", "()Landroidx/compose/ui/text/input/InputEventCallback2;", "autoCorrect", "Z", "getAutoCorrect", "batchDepth", "I", "mTextFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMTextFieldValue$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "editCommands", "Ljava/util/List;", "isActive"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private TextFieldValue mTextFieldValue;
    private final List<EditCommand> editCommands = new ArrayList();
    private boolean isActive = true;

    private final void logDebug(String p0) {
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean p0) {
        return false;
    }

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z;
        this.mTextFieldValue = textFieldValue;
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* JADX INFO: renamed from: getMTextFieldValue$ui_release, reason: from getter */
    public final TextFieldValue getMTextFieldValue() {
        return this.mTextFieldValue;
    }

    public final void setMTextFieldValue$ui_release(TextFieldValue textFieldValue) {
        this.mTextFieldValue = textFieldValue;
    }

    private final boolean ensureActive(Function0<Unit> p0) {
        boolean z = this.isActive;
        if (z) {
            p0.invoke();
        }
        return z;
    }

    public final void updateInputState(TextFieldValue p0, InputMethodManager p1) {
        if (this.isActive) {
            setMTextFieldValue$ui_release(p0);
            if (this.extractedTextMonitorMode) {
                p1.updateExtractedText(this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(p0));
            }
            TextRange composition = p0.getComposition();
            int iM6395getMinimpl = composition != null ? TextRange.m6395getMinimpl(composition.getPackedValue()) : -1;
            TextRange composition2 = p0.getComposition();
            p1.updateSelection(TextRange.m6395getMinimpl(p0.getSelection()), TextRange.m6394getMaximpl(p0.getSelection()), iM6395getMinimpl, composition2 != null ? TextRange.m6394getMaximpl(composition2.getPackedValue()) : -1);
        }
    }

    private final void addEditCommandWithBatch(EditCommand p0) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(p0);
        } finally {
            endBatchEditInternal();
        }
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return endBatchEditInternal();
    }

    private final boolean endBatchEditInternal() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.onEditCommands(CollectionsKt.toMutableList((Collection) this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.onConnectionClosed(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int p0, int p1) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, p0).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int p0, int p1) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, p0).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int p0) {
        if (TextRange.m6391getCollapsedimpl(this.mTextFieldValue.getSelection())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest p0, int p1) {
        boolean z = (p1 & 1) != 0;
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = p0 != null ? p0.token : 0;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    private final void sendSynthesizedKeyEvent(int p0) {
        sendKeyEvent(new KeyEvent(0, p0));
        sendKeyEvent(new KeyEvent(1, p0));
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int p0) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.m6395getMinimpl(this.mTextFieldValue.getSelection()), p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.isActive;
        return z ? beginBatchEditInternal() : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence p0, int p1) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new CommitTextCommand(String.valueOf(p0), p1));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int p0, int p1) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingRegionCommand(p0, p1));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence p0, int p1) {
        boolean z = this.isActive;
        if (z) {
            addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(p0), p1));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int p0, int p1) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(p0, p1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int p0, int p1) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new DeleteSurroundingTextCommand(p0, p1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int p0, int p1) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new SetSelectionCommand(p0, p1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        addEditCommandWithBatch(new FinishComposingTextCommand());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent p0) {
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        this.eventCallback.onKeyEvent(p0);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int p0) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = this.isActive;
        if (!z5) {
            return z5;
        }
        boolean z6 = false;
        boolean z7 = (p0 & 1) != 0;
        boolean z8 = (p0 & 2) != 0;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z9 = (p0 & 16) != 0;
            boolean z10 = (p0 & 8) != 0;
            boolean z11 = (p0 & 4) != 0;
            if (Build.VERSION.SDK_INT >= 34 && (p0 & 32) != 0) {
                z6 = true;
            }
            if (z9 || z10 || z11 || z6) {
                z2 = z6;
                z4 = z10;
                z = z11;
                z3 = z9;
            } else if (Build.VERSION.SDK_INT >= 34) {
                z3 = true;
                z4 = true;
                z = true;
                z2 = true;
            } else {
                z2 = z6;
                z3 = true;
                z4 = true;
                z = true;
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        this.eventCallback.onRequestCursorAnchorInfo(z7, z8, z3, z4, z, z2);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int p0) {
        boolean z = this.isActive;
        if (z) {
            z = false;
            switch (p0) {
                case R.id.selectAll:
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.mTextFieldValue.getText().length()));
                    break;
                case R.id.cut:
                    sendSynthesizedKeyEvent(277);
                    break;
                case R.id.copy:
                    sendSynthesizedKeyEvent(278);
                    break;
                case R.id.paste:
                    sendSynthesizedKeyEvent(279);
                    break;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int p0) {
        int iM6579getDefaulteUduSuo;
        boolean z = this.isActive;
        if (!z) {
            return z;
        }
        if (p0 == 0) {
            iM6579getDefaulteUduSuo = ImeAction.INSTANCE.m6579getDefaulteUduSuo();
        } else {
            switch (p0) {
                case 2:
                    iM6579getDefaulteUduSuo = ImeAction.INSTANCE.m6581getGoeUduSuo();
                    break;
                case 3:
                    iM6579getDefaulteUduSuo = ImeAction.INSTANCE.m6585getSearcheUduSuo();
                    break;
                case 4:
                    iM6579getDefaulteUduSuo = ImeAction.INSTANCE.m6586getSendeUduSuo();
                    break;
                case 5:
                    iM6579getDefaulteUduSuo = ImeAction.INSTANCE.m6582getNexteUduSuo();
                    break;
                case 6:
                    iM6579getDefaulteUduSuo = ImeAction.INSTANCE.m6580getDoneeUduSuo();
                    break;
                case 7:
                    iM6579getDefaulteUduSuo = ImeAction.INSTANCE.m6584getPreviouseUduSuo();
                    break;
                default:
                    iM6579getDefaulteUduSuo = ImeAction.INSTANCE.m6579getDefaulteUduSuo();
                    break;
            }
        }
        this.eventCallback.mo6598onImeActionKlQnJC8(iM6579getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo p0) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo p0) {
        boolean z = this.isActive;
        return z ? this.autoCorrect : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int p0) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String p0, Bundle p1) {
        boolean z = this.isActive;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo p0, int p1, Bundle p2) {
        boolean z = this.isActive;
        if (z) {
            return false;
        }
        return z;
    }
}
