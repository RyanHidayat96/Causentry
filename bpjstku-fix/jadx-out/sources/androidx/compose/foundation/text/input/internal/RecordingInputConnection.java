package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u001a\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00172\b\u0010\u0007\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010\u0015J\u000f\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b-\u0010\u0015J\u001e\u0010/\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110.H\u0082\b¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\u0015J\u0017\u00102\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b2\u00103J!\u00106\u001a\u0002052\b\u0010\u0003\u001a\u0004\u0018\u0001042\u0006\u0010\u0005\u001a\u00020\u0017H\u0017¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u0004\u0018\u00010&2\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0017H\u0017¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0017H\u0017¢\u0006\u0004\b?\u0010>J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\bC\u0010\u0019J\u0017\u0010D\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\bD\u0010\u0019J+\u0010H\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020E2\b\u0010\u0005\u001a\u0004\u0018\u00010F2\b\u0010\u0007\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ#\u0010J\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010@2\b\u0010\u0005\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\bJ\u0010KJ!\u0010N\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020L2\b\u0010\u0005\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\bR\u0010\u0019J\u0017\u0010T\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020SH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\bV\u0010WJ\u001f\u0010X\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\bX\u0010*J!\u0010Y\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010&2\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\bY\u0010(J\u001f\u0010Z\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\bZ\u0010*J\u001d\u0010\\\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020[¢\u0006\u0004\b\\\u0010]R\u0017\u0010^\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010\u0015R\u0016\u0010a\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010bR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00100d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010g\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bk\u0010_R\u0016\u0010l\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010_R\u001c\u0010m\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u001c\u0010q\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR*\u0010u\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0001@AX\u0081\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001c\u0010{\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~"}, d2 = {"Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "p0", "Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "p1", "", "p2", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "p3", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "p4", "Landroidx/compose/ui/platform/ViewConfiguration;", "p5", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/InputEventCallback2;ZLandroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;)V", "Landroidx/compose/ui/text/input/EditCommand;", "", "addEditCommandWithBatch", "(Landroidx/compose/ui/text/input/EditCommand;)V", "beginBatchEdit", "()Z", "beginBatchEditInternal", "", "clearMetaKeyStates", "(I)Z", "closeConnection", "()V", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/InputContentInfo;", "Landroid/os/Bundle;", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "", "commitText", "(Ljava/lang/CharSequence;I)Z", "deleteSurroundingText", "(II)Z", "deleteSurroundingTextInCodePoints", "endBatchEdit", "endBatchEditInternal", "Lkotlin/Function0;", "ensureActive", "(Lkotlin/jvm/functions/Function0;)Z", "finishComposingText", "getCursorCapsMode", "(I)I", "Landroid/view/inputmethod/ExtractedTextRequest;", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "getSelectedText", "(I)Ljava/lang/CharSequence;", "getTextAfterCursor", "(II)Ljava/lang/CharSequence;", "getTextBeforeCursor", "", "logDebug", "(Ljava/lang/String;)V", "performContextMenuAction", "performEditorAction", "Landroid/view/inputmethod/HandwritingGesture;", "Ljava/util/concurrent/Executor;", "Ljava/util/function/IntConsumer;", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "reportFullscreenMode", "(Z)Z", "requestCursorUpdates", "Landroid/view/KeyEvent;", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "sendSynthesizedKeyEvent", "(I)V", "setComposingRegion", "setComposingText", "setSelection", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "updateInputState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "autoCorrect", "Z", "getAutoCorrect", "batchDepth", "I", "currentExtractedTextRequestToken", "", "editCommands", "Ljava/util/List;", "eventCallback", "Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "getEventCallback", "()Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "extractedTextMonitorMode", "isActive", "legacyTextFieldState", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "textFieldSelectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getTextFieldSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextFieldValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setTextFieldValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final List<EditCommand> editCommands;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive;
    private final LegacyTextFieldState legacyTextFieldState;
    private final TextFieldSelectionManager textFieldSelectionManager;
    private TextFieldValue textFieldValue;
    private final ViewConfiguration viewConfiguration;

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

    public RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration) {
        this.eventCallback = inputEventCallback2;
        this.autoCorrect = z;
        this.legacyTextFieldState = legacyTextFieldState;
        this.textFieldSelectionManager = textFieldSelectionManager;
        this.viewConfiguration = viewConfiguration;
        this.textFieldValue = textFieldValue;
        this.editCommands = new ArrayList();
        this.isActive = true;
    }

    public /* synthetic */ RecordingInputConnection(TextFieldValue textFieldValue, InputEventCallback2 inputEventCallback2, boolean z, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, ViewConfiguration viewConfiguration, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldValue, inputEventCallback2, z, (i & 8) != 0 ? null : legacyTextFieldState, (i & 16) != 0 ? null : textFieldSelectionManager, (i & 32) != 0 ? null : viewConfiguration);
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.legacyTextFieldState;
    }

    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.textFieldSelectionManager;
    }

    public final ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX INFO: renamed from: getTextFieldValue$foundation_release, reason: from getter */
    public final TextFieldValue getTextFieldValue() {
        return this.textFieldValue;
    }

    public final void setTextFieldValue$foundation_release(TextFieldValue textFieldValue) {
        this.textFieldValue = textFieldValue;
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
            setTextFieldValue$foundation_release(p0);
            if (this.extractedTextMonitorMode) {
                p1.updateExtractedText(this.currentExtractedTextRequestToken, RecordingInputConnection_androidKt.toExtractedText(p0));
            }
            TextRange composition = p0.getComposition();
            int iM6395getMinimpl = composition != null ? TextRange.m6395getMinimpl(composition.getPackedValue()) : -1;
            TextRange composition2 = p0.getComposition();
            p1.updateSelection(TextRange.m6395getMinimpl(p0.getSelection()), TextRange.m6394getMaximpl(p0.getSelection()), iM6395getMinimpl, composition2 != null ? TextRange.m6394getMaximpl(composition2.getPackedValue()) : -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addEditCommandWithBatch(EditCommand p0) {
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
        return TextFieldValueKt.getTextBeforeSelection(this.textFieldValue, p0).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int p0, int p1) {
        return TextFieldValueKt.getTextAfterSelection(this.textFieldValue, p0).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int p0) {
        if (TextRange.m6391getCollapsedimpl(this.textFieldValue.getSelection())) {
            return null;
        }
        return TextFieldValueKt.getSelectedText(this.textFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest p0, int p1) {
        boolean z = (p1 & 1) != 0;
        this.extractedTextMonitorMode = z;
        if (z) {
            this.currentExtractedTextRequestToken = p0 != null ? p0.token : 0;
        }
        return RecordingInputConnection_androidKt.toExtractedText(this.textFieldValue);
    }

    private final void sendSynthesizedKeyEvent(int p0) {
        sendKeyEvent(new KeyEvent(0, p0));
        sendKeyEvent(new KeyEvent(1, p0));
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture p0, Executor p1, IntConsumer p2) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34LegacyPerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, p0, this.viewConfiguration, p1, p2, new Function1<EditCommand, Unit>() { // from class: androidx.compose.foundation.text.input.internal.RecordingInputConnection.performHandwritingGesture.1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(EditCommand editCommand) {
                    invoke2(editCommand);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EditCommand editCommand) {
                    RecordingInputConnection.this.addEditCommandWithBatch(editCommand);
                }

                {
                    super(1);
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture p0, CancellationSignal p1) {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34LegacyPerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.legacyTextFieldState, this.textFieldSelectionManager, p0, p1);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int p0) {
        return TextUtils.getCapsMode(this.textFieldValue.getText(), TextRange.m6395getMinimpl(this.textFieldValue.getSelection()), p0);
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
                    addEditCommandWithBatch(new SetSelectionCommand(0, this.textFieldValue.getText().length()));
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
        this.eventCallback.mo1494onImeActionKlQnJC8(iM6579getDefaulteUduSuo);
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
