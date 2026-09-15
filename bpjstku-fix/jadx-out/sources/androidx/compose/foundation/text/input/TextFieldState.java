package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.EditingBuffer;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0002Z[B\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\f2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001d\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00132\b\b\u0002\u0010\t\u001a\u00020\u00142\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\u0002\b\u0018H\u0080\b¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001f\u001a\u00020\f2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\f0\u0017¢\u0006\u0002\b\u0018H\u0080\b¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\fH\u0001¢\u0006\u0004\b \u0010!J/\u0010$\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\t\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0000¢\u0006\u0004\b&\u0010\u000eJ\u000f\u0010'\u001a\u00020\u000fH\u0001¢\u0006\u0004\b'\u0010(J4\u0010+\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013H\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020\u0002H\u0017¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\u0013H\u0002¢\u0006\u0004\b.\u0010/R\u0016\u00102\u001a\u0004\u0018\u00010\u00048Gø\u0001\u0001¢\u0006\u0006\u001a\u0004\b0\u00101R+\u00105\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R(\u00109\u001a\u00020\u001b8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010!\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00048Gø\u0001\u0001¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0011\u0010I\u001a\u00020F8G¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010J\u001a\u00020\b8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR \u0010O\u001a\u00020N8GX\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010!\u001a\u0004\bQ\u0010RR+\u0010Y\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\"8A@CX\u0081\u008e\u0002¢\u0006\u0012\n\u0004\bT\u00104\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState;", "", "", "p0", "Landroidx/compose/ui/text/TextRange;", "p1", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/text/input/TextUndoManager;", "p2", "(Ljava/lang/String;JLandroidx/compose/foundation/text/input/TextUndoManager;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "", "addNotifyImeListener$foundation_release", "(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;)V", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "commitEdit", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "Landroidx/compose/foundation/text/input/InputTransformation;", "", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "commitEditAsUser", "(Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "edit", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "p3", "editAsUser$foundation_release", "(Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Lkotlin/jvm/functions/Function1;)V", "editWithNoSideEffects$foundation_release", "finishEditing", "()V", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "recordEditForUndo", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V", "removeNotifyImeListener$foundation_release", "startEdit", "()Landroidx/compose/foundation/text/input/TextFieldBuffer;", "syncMainBufferToTemporaryBuffer-TS3Rm5k$foundation_release", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;Landroidx/compose/ui/text/TextRange;ZZ)V", "syncMainBufferToTemporaryBuffer", "toString", "()Ljava/lang/String;", "updateValueAndNotifyListeners", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "composition", "isEditing$delegate", "Landroidx/compose/runtime/MutableState;", "isEditing", "()Z", "setEditing", "(Z)V", "mainBuffer", "Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "getMainBuffer$foundation_release", "()Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "setMainBuffer$foundation_release", "(Landroidx/compose/foundation/text/input/internal/EditingBuffer;)V", "getMainBuffer$foundation_release$annotations", "Landroidx/compose/runtime/collection/MutableVector;", "notifyImeListeners", "Landroidx/compose/runtime/collection/MutableVector;", "getSelection-d9O1mEE", "()J", "selection", "", "getText", "()Ljava/lang/CharSequence;", "text", "textUndoManager", "Landroidx/compose/foundation/text/input/TextUndoManager;", "getTextUndoManager$foundation_release", "()Landroidx/compose/foundation/text/input/TextUndoManager;", "Landroidx/compose/foundation/text/input/UndoState;", "undoState", "Landroidx/compose/foundation/text/input/UndoState;", "getUndoState", "()Landroidx/compose/foundation/text/input/UndoState;", "getUndoState$annotations", "value$delegate", "getValue$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "setValue", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)V", "value", "NotifyImeListener", "Saver"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: isEditing$delegate, reason: from kotlin metadata */
    private final MutableState isEditing;
    private EditingBuffer mainBuffer;
    private final MutableVector<NotifyImeListener> notifyImeListeners;
    private final TextUndoManager textUndoManager;
    private final UndoState undoState;

    /* JADX INFO: renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "p0", "p1", "", "p2", "", "onChange", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Z)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface NotifyImeListener {
        void onChange(TextFieldCharSequence p0, TextFieldCharSequence p1, boolean p2);
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[TextFieldEditUndoBehavior.ClearHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.MergeIfPossible.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextFieldEditUndoBehavior.NeverMerge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getMainBuffer$foundation_release$annotations() {
    }

    public static /* synthetic */ void getUndoState$annotations() {
    }

    private TextFieldState(String str, long j, TextUndoManager textUndoManager) {
        this.textUndoManager = textUndoManager;
        this.mainBuffer = new EditingBuffer(str, TextRangeKt.m6403coerceIn8ffj60Q(j, 0, str.length()), (DefaultConstructorMarker) null);
        this.isEditing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldCharSequence(str, j, null, null, 12, null), null, 2, null);
        this.undoState = new UndoState(this);
        this.notifyImeListeners = new MutableVector<>(new NotifyImeListener[16], 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextFieldState(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        this(str, (i & 2) != 0 ? TextRangeKt.TextRange(str.length()) : j, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextFieldState(String str, long j) {
        this(str, j, new TextUndoManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: getTextUndoManager$foundation_release, reason: from getter */
    public final TextUndoManager getTextUndoManager() {
        return this.textUndoManager;
    }

    /* JADX INFO: renamed from: getMainBuffer$foundation_release, reason: from getter */
    public final EditingBuffer getMainBuffer() {
        return this.mainBuffer;
    }

    public final void setMainBuffer$foundation_release(EditingBuffer editingBuffer) {
        this.mainBuffer = editingBuffer;
    }

    private final boolean isEditing() {
        return ((Boolean) this.isEditing.getValue()).booleanValue();
    }

    private final void setEditing(boolean z) {
        this.isEditing.setValue(Boolean.valueOf(z));
    }

    private final void setValue(TextFieldCharSequence textFieldCharSequence) {
        this.value.setValue(textFieldCharSequence);
    }

    public final TextFieldCharSequence getValue$foundation_release() {
        return (TextFieldCharSequence) this.value.getValue();
    }

    public final CharSequence getText() {
        return getValue$foundation_release().getText();
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1431getSelectiond9O1mEE() {
        return getValue$foundation_release().getSelection();
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m1430getCompositionMzsxiRA() {
        return getValue$foundation_release().getComposition();
    }

    public final void edit(Function1<? super TextFieldBuffer, Unit> p0) {
        TextFieldBuffer textFieldBufferStartEdit = startEdit();
        try {
            p0.invoke(textFieldBufferStartEdit);
            commitEdit(textFieldBufferStartEdit);
        } finally {
            finishEditing();
        }
    }

    public final String toString() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            StringBuilder sb = new StringBuilder("TextFieldState(selection=");
            sb.append((Object) TextRange.m6400toStringimpl(m1431getSelectiond9O1mEE()));
            sb.append(", text=\"");
            sb.append((Object) getText());
            sb.append("\")");
            return sb.toString();
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    public final UndoState getUndoState() {
        return this.undoState;
    }

    public final TextFieldBuffer startEdit() {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            boolean zIsEditing = isEditing();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            if (zIsEditing) {
                throw new IllegalStateException("TextFieldState does not support concurrent or nested editing.".toString());
            }
            setEditing(true);
            return new TextFieldBuffer(getValue$foundation_release(), null, null, null, 14, null);
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public final void commitEdit(TextFieldBuffer p0) {
        boolean z = p0.getChanges().getChangeCount() > 0;
        boolean zM6390equalsimpl0 = TextRange.m6390equalsimpl0(p0.getSelectionInChars(), this.mainBuffer.m1463getSelectiond9O1mEE());
        if (z) {
            this.textUndoManager.clearHistory();
        }
        m1432syncMainBufferToTemporaryBufferTS3Rm5k$foundation_release(p0, null, z, true ^ zM6390equalsimpl0);
    }

    public final void finishEditing() {
        setEditing(false);
    }

    public static /* synthetic */ void editAsUser$foundation_release$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        function1.invoke(textFieldState.getMainBuffer());
        textFieldState.commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
    }

    public final void editAsUser$foundation_release(InputTransformation p0, boolean p1, TextFieldEditUndoBehavior p2, Function1<? super EditingBuffer, Unit> p3) {
        getMainBuffer().getChangeTracker().clearChanges();
        p3.invoke(getMainBuffer());
        commitEditAsUser(p0, p1, p2);
    }

    public final void editWithNoSideEffects$foundation_release(Function1<? super EditingBuffer, Unit> p0) {
        getMainBuffer().getChangeTracker().clearChanges();
        p0.invoke(getMainBuffer());
        updateValueAndNotifyListeners(getValue$foundation_release(), new TextFieldCharSequence(getMainBuffer().toString(), getMainBuffer().m1463getSelectiond9O1mEE(), getMainBuffer().m1462getCompositionMzsxiRA(), null, 8, null), true);
    }

    static /* synthetic */ void commitEditAsUser$default(TextFieldState textFieldState, InputTransformation inputTransformation, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        textFieldState.commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void commitEditAsUser(InputTransformation p0, boolean p1, TextFieldEditUndoBehavior p2) {
        TextFieldBuffer textFieldBuffer;
        TextFieldCharSequence value$foundation_release = getValue$foundation_release();
        if (this.mainBuffer.getChangeTracker().getChangeCount() == 0 && TextRange.m6390equalsimpl0(value$foundation_release.getSelection(), this.mainBuffer.m1463getSelectiond9O1mEE())) {
            if (Intrinsics.areEqual(value$foundation_release.getComposition(), this.mainBuffer.m1462getCompositionMzsxiRA()) && Intrinsics.areEqual(value$foundation_release.getHighlight(), this.mainBuffer.getHighlight())) {
                return;
            }
            updateValueAndNotifyListeners(getValue$foundation_release(), new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.m1463getSelectiond9O1mEE(), this.mainBuffer.m1462getCompositionMzsxiRA(), this.mainBuffer.getHighlight(), null), p1);
            return;
        }
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(this.mainBuffer.toString(), this.mainBuffer.m1463getSelectiond9O1mEE(), this.mainBuffer.m1462getCompositionMzsxiRA(), this.mainBuffer.getHighlight(), null);
        if (p0 == null) {
            updateValueAndNotifyListeners(value$foundation_release, textFieldCharSequence, p1);
            recordEditForUndo(value$foundation_release, textFieldCharSequence, this.mainBuffer.getChangeTracker(), p2);
            return;
        }
        TextFieldBuffer textFieldBuffer2 = new TextFieldBuffer(textFieldCharSequence, this.mainBuffer.getChangeTracker(), value$foundation_release, null, 8, null);
        p0.transformInput(textFieldBuffer2);
        boolean zContentEquals = StringsKt.contentEquals(textFieldBuffer2.asCharSequence(), textFieldCharSequence);
        boolean zM6390equalsimpl0 = TextRange.m6390equalsimpl0(textFieldBuffer2.getSelectionInChars(), textFieldCharSequence.getSelection());
        if (!zContentEquals || !zM6390equalsimpl0) {
            textFieldBuffer = textFieldBuffer2;
            m1432syncMainBufferToTemporaryBufferTS3Rm5k$foundation_release(textFieldBuffer, null, !zContentEquals, !zM6390equalsimpl0);
        } else {
            textFieldBuffer = textFieldBuffer2;
            updateValueAndNotifyListeners(value$foundation_release, TextFieldBuffer.m1421toTextFieldCharSequenceudt6zUU$foundation_release$default(textFieldBuffer2, 0L, textFieldCharSequence.getComposition(), 1, null), p1);
        }
        recordEditForUndo(value$foundation_release, getValue$foundation_release(), textFieldBuffer.getChanges(), p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateValueAndNotifyListeners(TextFieldCharSequence p0, TextFieldCharSequence p1, boolean p2) {
        setValue(p1);
        finishEditing();
        MutableVector<NotifyImeListener> mutableVector = this.notifyImeListeners;
        int size = mutableVector.getSize();
        if (size > 0) {
            NotifyImeListener[] content = mutableVector.getContent();
            int i = 0;
            do {
                content[i].onChange(p0, p1, p2);
                i++;
            } while (i < size);
        }
    }

    private final void recordEditForUndo(TextFieldCharSequence p0, TextFieldCharSequence p1, TextFieldBuffer.ChangeList p2, TextFieldEditUndoBehavior p3) {
        int i = WhenMappings.$EnumSwitchMapping$0[p3.ordinal()];
        if (i == 1) {
            this.textUndoManager.clearHistory();
        } else if (i == 2) {
            TextUndoManagerKt.recordChanges(this.textUndoManager, p0, p1, p2, true);
        } else {
            if (i != 3) {
                return;
            }
            TextUndoManagerKt.recordChanges(this.textUndoManager, p0, p1, p2, false);
        }
    }

    public final void addNotifyImeListener$foundation_release(NotifyImeListener p0) {
        this.notifyImeListeners.add(p0);
    }

    public final void removeNotifyImeListener$foundation_release(NotifyImeListener p0) {
        this.notifyImeListeners.remove(p0);
    }

    /* JADX INFO: renamed from: syncMainBufferToTemporaryBuffer-TS3Rm5k$foundation_release, reason: not valid java name */
    public final void m1432syncMainBufferToTemporaryBufferTS3Rm5k$foundation_release(TextFieldBuffer p0, TextRange p1, boolean p2, boolean p3) {
        String string = this.mainBuffer.toString();
        TextFieldCharSequence textFieldCharSequence = new TextFieldCharSequence(string, this.mainBuffer.m1463getSelectiond9O1mEE(), this.mainBuffer.m1462getCompositionMzsxiRA(), null, 8, null);
        boolean zAreEqual = Intrinsics.areEqual(p1, this.mainBuffer.m1462getCompositionMzsxiRA());
        if (p2) {
            this.mainBuffer = new EditingBuffer(p0.toString(), p0.getSelectionInChars(), (DefaultConstructorMarker) null);
        } else if (p3) {
            this.mainBuffer.setSelection(TextRange.m6397getStartimpl(p0.getSelectionInChars()), TextRange.m6392getEndimpl(p0.getSelectionInChars()));
        }
        if (p1 == null || TextRange.m6391getCollapsedimpl(p1.getPackedValue())) {
            this.mainBuffer.commitComposition();
        } else {
            this.mainBuffer.setComposition(TextRange.m6395getMinimpl(p1.getPackedValue()), TextRange.m6394getMaximpl(p1.getPackedValue()));
        }
        if (p2 || (!p3 && !zAreEqual)) {
            this.mainBuffer.commitComposition();
        }
        if (p2) {
            string = p0.toString();
        }
        updateValueAndNotifyListeners(textFieldCharSequence, new TextFieldCharSequence(string, this.mainBuffer.m1463getSelectiond9O1mEE(), this.mainBuffer.m1462getCompositionMzsxiRA(), null, 8, null), true);
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u0004\u0018\u00010\u0003*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldState$Saver;", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/input/TextFieldState;", "", "<init>", "()V", "p0", "restore", "(Ljava/lang/Object;)Landroidx/compose/foundation/text/input/TextFieldState;", "Landroidx/compose/runtime/saveable/SaverScope;", "save", "(Landroidx/compose/runtime/saveable/SaverScope;Landroidx/compose/foundation/text/input/TextFieldState;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Saver implements androidx.compose.runtime.saveable.Saver<TextFieldState, Object> {
        public static final int $stable = 0;
        public static final Saver INSTANCE = new Saver();

        private Saver() {
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public final Object save(SaverScope saverScope, TextFieldState textFieldState) {
            String string = textFieldState.getText().toString();
            int iM6397getStartimpl = TextRange.m6397getStartimpl(textFieldState.m1431getSelectiond9O1mEE());
            int iM6392getEndimpl = TextRange.m6392getEndimpl(textFieldState.m1431getSelectiond9O1mEE());
            return CollectionsKt.listOf(string, Integer.valueOf(iM6397getStartimpl), Integer.valueOf(iM6392getEndimpl), TextUndoManager.Companion.Saver.INSTANCE.save(saverScope, textFieldState.getTextUndoManager()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.compose.runtime.saveable.Saver
        public final TextFieldState restore(Object p0) {
            Intrinsics.checkNotNull(p0, "");
            List list = (List) p0;
            Object obj = list.get(0);
            Object obj2 = list.get(1);
            Object obj3 = list.get(2);
            Object obj4 = list.get(3);
            Intrinsics.checkNotNull(obj, "");
            String str = (String) obj;
            Intrinsics.checkNotNull(obj2, "");
            int iIntValue = ((Integer) obj2).intValue();
            Intrinsics.checkNotNull(obj3, "");
            long jTextRange = TextRangeKt.TextRange(iIntValue, ((Integer) obj3).intValue());
            TextUndoManager.Companion.Saver saver = TextUndoManager.Companion.Saver.INSTANCE;
            Intrinsics.checkNotNull(obj4);
            TextUndoManager textUndoManagerRestore = saver.restore(obj4);
            Intrinsics.checkNotNull(textUndoManagerRestore);
            return new TextFieldState(str, jTextRange, textUndoManagerRestore, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ TextFieldState(String str, long j, TextUndoManager textUndoManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, textUndoManager);
    }

    public /* synthetic */ TextFieldState(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }
}
