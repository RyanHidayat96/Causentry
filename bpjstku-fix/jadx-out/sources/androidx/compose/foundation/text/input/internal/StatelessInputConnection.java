package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001a\u00020\n2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u000eH\u0016¢\u0006\u0004\b(\u0010\u0010J\u000f\u0010)\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010\u0010J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010\u0010J\u0017\u0010+\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b+\u0010,J!\u0010/\u001a\u00020.2\b\u0010\u0003\u001a\u0004\u0018\u00010-2\u0006\u0010\u0005\u001a\u00020\u0012H\u0017¢\u0006\u0004\b/\u00100J\u0011\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0012H\u0017¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0012H\u0017¢\u0006\u0004\b8\u00107J\u0017\u0010:\u001a\u00020\n2\u0006\u0010\u0003\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b<\u0010\u0014J\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\b=\u0010\u0014J+\u0010A\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020>2\b\u0010\u0005\u001a\u0004\u0018\u00010?2\b\u0010\u001c\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bA\u0010BJ#\u0010C\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u0001092\b\u0010\u0005\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\bC\u0010DJ!\u0010G\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020E2\b\u0010\u0005\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0012H\u0016¢\u0006\u0004\bK\u0010\u0014J\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0012H\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¢\u0006\u0004\bQ\u0010&J!\u0010R\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¢\u0006\u0004\bR\u0010$J\u001f\u0010S\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0012H\u0016¢\u0006\u0004\bS\u0010&R\u0016\u0010T\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\bV\u0010W\u0012\u0004\bX\u0010\u0016R+\u0010Z\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b0Y8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010d\u001a\u00020a8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c"}, d2 = {"Landroidx/compose/foundation/text/input/internal/StatelessInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "p0", "Landroid/view/inputmethod/EditorInfo;", "p1", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextInputSession;Landroid/view/inputmethod/EditorInfo;)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "", "Lkotlin/ExtensionFunctionType;", "addEditCommandWithBatch", "(Lkotlin/jvm/functions/Function1;)V", "", "beginBatchEdit", "()Z", "beginBatchEditInternal", "", "clearMetaKeyStates", "(I)Z", "closeConnection", "()V", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/InputContentInfo;", "Landroid/os/Bundle;", "p2", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "", "commitText", "(Ljava/lang/CharSequence;I)Z", "deleteSurroundingText", "(II)Z", "deleteSurroundingTextInCodePoints", "endBatchEdit", "endBatchEditInternal", "finishComposingText", "getCursorCapsMode", "(I)I", "Landroid/view/inputmethod/ExtractedTextRequest;", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "getSelectedText", "(I)Ljava/lang/CharSequence;", "getTextAfterCursor", "(II)Ljava/lang/CharSequence;", "getTextBeforeCursor", "", "logDebug", "(Ljava/lang/String;)V", "performContextMenuAction", "performEditorAction", "Landroid/view/inputmethod/HandwritingGesture;", "Ljava/util/concurrent/Executor;", "Ljava/util/function/IntConsumer;", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "reportFullscreenMode", "(Z)Z", "requestCursorUpdates", "Landroid/view/KeyEvent;", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "sendSynthesizedKeyEvent", "(I)V", "setComposingRegion", "setComposingText", "setSelection", "batchDepth", "I", "commitContentDelegateInputConnection", "Landroid/view/inputmethod/InputConnection;", "getCommitContentDelegateInputConnection$annotations", "Landroidx/compose/runtime/collection/MutableVector;", "editCommands", "Landroidx/compose/runtime/collection/MutableVector;", "session", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "Landroidx/compose/foundation/text/input/internal/StatelessInputConnection$terminalInputConnection$1;", "terminalInputConnection", "Landroidx/compose/foundation/text/input/internal/StatelessInputConnection$terminalInputConnection$1;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "text"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StatelessInputConnection implements InputConnection {
    public static final int $stable = 8;
    private int batchDepth;
    private final InputConnection commitContentDelegateInputConnection;
    private final MutableVector<Function1<EditingBuffer, Unit>> editCommands = new MutableVector<>(new Function1[16], 0);
    private final TextInputSession session;
    private final StatelessInputConnection$terminalInputConnection$1 terminalInputConnection;

    private static /* synthetic */ void getCommitContentDelegateInputConnection$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDebug(String p0) {
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo p0) {
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1] */
    public StatelessInputConnection(TextInputSession textInputSession, EditorInfo editorInfo) {
        this.session = textInputSession;
        ?? r3 = new InputConnectionWrapper(this) { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$terminalInputConnection$1
            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitContent(InputContentInfo p0, int p1, Bundle p2) {
                return false;
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean performPrivateCommand(String p0, Bundle p1) {
                return true;
            }

            {
                super(this, false);
            }
        };
        this.terminalInputConnection = r3;
        this.commitContentDelegateInputConnection = InputConnectionCompat.createWrapper((InputConnection) r3, editorInfo, new InputConnectionCompat.OnCommitContentListener() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection$commitContentDelegateInputConnection$1
            @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
            public final boolean onCommitContent(InputContentInfoCompat p0, int p1, Bundle p2) {
                if (Build.VERSION.SDK_INT >= 25 && (p1 & 1) != 0) {
                    try {
                        p0.requestPermission();
                        Object objUnwrap = p0.unwrap();
                        Intrinsics.checkNotNull(objUnwrap, "");
                        Parcelable parcelable = (Parcelable) objUnwrap;
                        p2 = p2 == null ? new Bundle() : new Bundle(p2);
                        p2.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
                    } catch (Exception e2) {
                        this.this$0.logDebug("Can't insert content from IME; requestPermission() failed, ".concat(String.valueOf(e2)));
                        return false;
                    }
                }
                return this.this$0.session.onCommitContent(StatelessInputConnection_androidKt.toTransferableContent(p0, p2));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldCharSequence getText() {
        return this.session.getText();
    }

    private final void addEditCommandWithBatch(Function1<? super EditingBuffer, Unit> p0) {
        beginBatchEditInternal();
        try {
            this.editCommands.add(p0);
        } finally {
            endBatchEditInternal();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        logDebug("beginBatchEdit()");
        return beginBatchEditInternal();
    }

    private final boolean beginBatchEditInternal() {
        this.batchDepth++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        logDebug("endBatchEdit()");
        return endBatchEditInternal();
    }

    private final boolean endBatchEditInternal() {
        int i = this.batchDepth - 1;
        this.batchDepth = i;
        if (i == 0 && this.editCommands.isNotEmpty()) {
            this.session.requestEdit(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.endBatchEditInternal.1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                    invoke2(editingBuffer);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(EditingBuffer editingBuffer) {
                    MutableVector mutableVector = StatelessInputConnection.this.editCommands;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        Object[] content = mutableVector.getContent();
                        int i2 = 0;
                        do {
                            ((Function1) content[i2]).invoke(editingBuffer);
                            i2++;
                        } while (i2 < size);
                    }
                }

                {
                    super(1);
                }
            });
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        logDebug("closeConnection()");
        this.editCommands.clear();
        this.batchDepth = 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(final CharSequence p0, final int p1) {
        StringBuilder sb = new StringBuilder("commitText(\"");
        sb.append((Object) p0);
        sb.append("\", ");
        sb.append(p1);
        sb.append(')');
        logDebug(sb.toString());
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.commitText.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.commitText(editingBuffer, String.valueOf(p0), p1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(final int p0, final int p1) {
        StringBuilder sb = new StringBuilder("setComposingRegion(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append(')');
        logDebug(sb.toString());
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.setComposingRegion.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.setComposingRegion(editingBuffer, p0, p1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(final CharSequence p0, final int p1) {
        StringBuilder sb = new StringBuilder("setComposingText(\"");
        sb.append((Object) p0);
        sb.append("\", ");
        sb.append(p1);
        sb.append(')');
        logDebug(sb.toString());
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.setComposingText.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.setComposingText(editingBuffer, String.valueOf(p0), p1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(final int p0, final int p1) {
        StringBuilder sb = new StringBuilder("deleteSurroundingTextInCodePoints(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append(')');
        logDebug(sb.toString());
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.deleteSurroundingTextInCodePoints.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.deleteSurroundingTextInCodePoints(editingBuffer, p0, p1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(final int p0, final int p1) {
        StringBuilder sb = new StringBuilder("deleteSurroundingText(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append(')');
        logDebug(sb.toString());
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.deleteSurroundingText.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.deleteSurroundingText(editingBuffer, p0, p1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(final int p0, final int p1) {
        StringBuilder sb = new StringBuilder("setSelection(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append(')');
        logDebug(sb.toString());
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.setSelection.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                editingBuffer.setSelection(p0, p1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        logDebug("finishComposingText()");
        addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.finishComposingText.1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                invoke2(editingBuffer);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(EditingBuffer editingBuffer) {
                EditCommandKt.finishComposingText(editingBuffer);
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent p0) {
        StringBuilder sb = new StringBuilder("sendKeyEvent(");
        sb.append(p0);
        sb.append(')');
        logDebug(sb.toString());
        this.session.sendKeyEvent(p0);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int p0, int p1) {
        String string = TextFieldCharSequenceKt.getTextBeforeSelection(getText(), p0).toString();
        StringBuilder sb = new StringBuilder("getTextBeforeCursor(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append("): ");
        sb.append(string);
        logDebug(sb.toString());
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int p0, int p1) {
        String string = TextFieldCharSequenceKt.getTextAfterSelection(getText(), p0).toString();
        StringBuilder sb = new StringBuilder("getTextAfterCursor(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append("): ");
        sb.append(string);
        logDebug(sb.toString());
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int p0) {
        String string = TextRange.m6391getCollapsedimpl(getText().getSelection()) ? null : TextFieldCharSequenceKt.getSelectedText(getText()).toString();
        StringBuilder sb = new StringBuilder("getSelectedText(");
        sb.append(p0);
        sb.append("): ");
        sb.append((Object) string);
        logDebug(sb.toString());
        return string;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int p0) {
        StringBuilder sb = new StringBuilder("requestCursorUpdates(");
        sb.append(p0);
        sb.append(')');
        logDebug(sb.toString());
        this.session.requestCursorUpdates(p0);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture p0, Executor p1, IntConsumer p2) {
        StringBuilder sb = new StringBuilder("performHandwritingGesture(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append(", ");
        sb.append(p2);
        sb.append(')');
        logDebug(sb.toString());
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        Api34PerformHandwritingGestureImpl.INSTANCE.performHandwritingGesture(this.session, p0, p1, p2);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture p0, CancellationSignal p1) {
        StringBuilder sb = new StringBuilder("previewHandwritingGesture(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append(')');
        logDebug(sb.toString());
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        return Api34PerformHandwritingGestureImpl.INSTANCE.previewHandwritingGesture(this.session, p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest p0, int p1) {
        StringBuilder sb = new StringBuilder("getExtractedText(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append(')');
        logDebug(sb.toString());
        return StatelessInputConnection_androidKt.toExtractedText(getText());
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int p0) {
        StringBuilder sb = new StringBuilder("getCursorCapsMode(");
        sb.append(p0);
        sb.append(')');
        logDebug(sb.toString());
        return TextUtils.getCapsMode(getText(), TextRange.m6395getMinimpl(getText().getSelection()), p0);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int p0) {
        StringBuilder sb = new StringBuilder("performContextMenuAction(");
        sb.append(p0);
        sb.append(')');
        logDebug(sb.toString());
        switch (p0) {
            case R.id.selectAll:
                addEditCommandWithBatch(new Function1<EditingBuffer, Unit>() { // from class: androidx.compose.foundation.text.input.internal.StatelessInputConnection.performContextMenuAction.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(EditingBuffer editingBuffer) {
                        invoke2(editingBuffer);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(EditingBuffer editingBuffer) {
                        editingBuffer.setSelection(0, StatelessInputConnection.this.getText().length());
                    }

                    {
                        super(1);
                    }
                });
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
        return false;
    }

    private final void sendSynthesizedKeyEvent(int p0) {
        sendKeyEvent(new KeyEvent(0, p0));
        sendKeyEvent(new KeyEvent(1, p0));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int p0) {
        int iM6579getDefaulteUduSuo;
        StringBuilder sb = new StringBuilder("performEditorAction(");
        sb.append(p0);
        sb.append(')');
        logDebug(sb.toString());
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
                    logDebug("IME sent an unrecognized editor action: ".concat(String.valueOf(p0)));
                    iM6579getDefaulteUduSuo = ImeAction.INSTANCE.m6579getDefaulteUduSuo();
                    break;
            }
        }
        this.session.mo1457onImeActionKlQnJC8(iM6579getDefaulteUduSuo);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo p0) {
        StringBuilder sb = new StringBuilder("commitCompletion(");
        sb.append((Object) (p0 != null ? p0.getText() : null));
        sb.append(')');
        logDebug(sb.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        logDebug("getHandler()");
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int p0) {
        StringBuilder sb = new StringBuilder("clearMetaKeyStates(");
        sb.append(p0);
        sb.append(')');
        logDebug(sb.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean p0) {
        StringBuilder sb = new StringBuilder("reportFullscreenMode(");
        sb.append(p0);
        sb.append(')');
        logDebug(sb.toString());
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String p0, Bundle p1) {
        StringBuilder sb = new StringBuilder("performPrivateCommand(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append(')');
        logDebug(sb.toString());
        return this.commitContentDelegateInputConnection.performPrivateCommand(p0, p1);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo p0, int p1, Bundle p2) {
        StringBuilder sb = new StringBuilder("commitContent(");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        sb.append(", ");
        sb.append(p2);
        sb.append(')');
        logDebug(sb.toString());
        if (Build.VERSION.SDK_INT >= 25) {
            return Api25CommitContentImpl.INSTANCE.commitContent(this.commitContentDelegateInputConnection, p0, p1, p2);
        }
        return false;
    }
}
