package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 b2\u00020\u0001:\u0002bcB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ3\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00152\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001b\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010$\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0018\u0010'\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b*\u0010&J\u0018\u0010+\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u001dø\u0001\u0000¢\u0006\u0004\b,\u0010)J\u0015\u0010-\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001d¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\f¢\u0006\u0004\b/\u0010\u000eJ\u0015\u00101\u001a\u00020\f2\u0006\u0010\u0003\u001a\u000200¢\u0006\u0004\b1\u00102J)\u00104\u001a\u00020\f2\u0006\u0010\u0003\u001a\u0002002\b\b\u0002\u0010\u0005\u001a\u00020\u00152\b\b\u0002\u0010\u0007\u001a\u000203¢\u0006\u0004\b4\u00105J4\u00108\u001a\u00020\f2\u0006\u0010\u0003\u001a\u0002002\u0006\u0010\u0005\u001a\u00020!2\b\b\u0002\u0010\u0007\u001a\u0002032\b\b\u0002\u0010\t\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b6\u00107J\r\u00109\u001a\u00020\f¢\u0006\u0004\b9\u0010\u000eJ\u0018\u0010<\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0018\u0010>\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b=\u0010;J\u000f\u0010@\u001a\u00020?H\u0017¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\f¢\u0006\u0004\bB\u0010\u000eJ\u0017\u0010C\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bC\u0010DR\u0016\u0010E\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001e\u0010I\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010H\u0018\u00010G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0011\u0010P\u001a\u00020M8G¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010Q\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001e\u0010S\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010H\u0018\u00010G8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010JR+\u0010[\u001a\u00020T2\u0006\u0010\u0003\u001a\u00020T8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0011\u0010_\u001a\u00020M8G¢\u0006\u0006\u001a\u0004\b^\u0010OR\u0011\u0010a\u001a\u00020M8G¢\u0006\u0006\u001a\u0004\b`\u0010O\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "p0", "Landroidx/compose/foundation/text/input/InputTransformation;", "p1", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "p2", "Landroidx/compose/foundation/text/input/OutputTransformation;", "p3", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;)V", "", "collapseSelectionToEnd", "()V", "collapseSelectionToMax", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "", "collectImeNotifications", "(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSelectedText", "", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "Lkotlin/ExtensionFunctionType;", "editUntransformedTextAsUser", "(ZLkotlin/jvm/functions/Function1;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/foundation/text/input/TextHighlightType;", "Landroidx/compose/ui/text/TextRange;", "highlightCharsIn-7RAjNK8", "(IJ)V", "highlightCharsIn", "mapFromTransformed-GEjPoXI", "(J)J", "mapFromTransformed", "mapFromTransformed--jx7JFs", "(I)J", "mapToTransformed-GEjPoXI", "mapToTransformed", "mapToTransformed--jx7JFs", "placeCursorBeforeCharAt", "(I)V", "redo", "", "replaceAll", "(Ljava/lang/CharSequence;)V", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "replaceSelectedText", "(Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V", "replaceText-M8tDOmk", "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Z)V", "replaceText", "selectAll", "selectCharsIn-5zc-tL8", "(J)V", "selectCharsIn", "selectUntransformedCharsIn-5zc-tL8", "selectUntransformedCharsIn", "", "toString", "()Ljava/lang/String;", "undo", "update", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "codepointTransformedText", "Landroidx/compose/runtime/State;", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getOutputText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "outputText", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "outputTransformedText", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "selectionWedgeAffinity$delegate", "Landroidx/compose/runtime/MutableState;", "getSelectionWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "setSelectionWedgeAffinity", "(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)V", "selectionWedgeAffinity", "textFieldState", "Landroidx/compose/foundation/text/input/TextFieldState;", "getUntransformedText", "untransformedText", "getVisualText", "visualText", "Companion", "TransformedText"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransformedTextFieldState {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private final CodepointTransformation codepointTransformation;
    private final State<TransformedText> codepointTransformedText;
    private InputTransformation inputTransformation;
    private final OutputTransformation outputTransformation;
    private final State<TransformedText> outputTransformedText;

    /* JADX INFO: renamed from: selectionWedgeAffinity$delegate, reason: from kotlin metadata */
    private final MutableState selectionWedgeAffinity;
    private final TextFieldState textFieldState;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0, 0}, l = {679}, m = "collectImeNotifications", n = {"this", "notifyImeListener"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformedTextFieldState.this.collectImeNotifications(null, this);
        }
    }

    public TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, final CodepointTransformation codepointTransformation, final OutputTransformation outputTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.outputTransformation = outputTransformation;
        this.outputTransformedText = outputTransformation != null ? SnapshotStateKt.derivedStateOf(new Function0<TransformedText>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$outputTransformedText$1$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TransformedTextFieldState.TransformedText invoke() {
                return TransformedTextFieldState.Companion.calculateTransformedText(this.this$0.textFieldState.getValue$foundation_release(), outputTransformation, this.this$0.getSelectionWedgeAffinity());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }) : null;
        this.codepointTransformedText = codepointTransformation != null ? SnapshotStateKt.derivedStateOf(new Function0<TransformedText>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$codepointTransformedText$1$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TransformedTextFieldState.TransformedText invoke() {
                TextFieldCharSequence value$foundation_release;
                TransformedTextFieldState.TransformedText transformedText;
                TransformedTextFieldState.Companion companion = TransformedTextFieldState.Companion;
                State state = this.this$0.outputTransformedText;
                if (state == null || (transformedText = (TransformedTextFieldState.TransformedText) state.getValue()) == null || (value$foundation_release = transformedText.getText()) == null) {
                    value$foundation_release = this.this$0.textFieldState.getValue$foundation_release();
                }
                return companion.calculateTransformedText(value$foundation_release, codepointTransformation, this.this$0.getSelectionWedgeAffinity());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }) : null;
        this.selectionWedgeAffinity = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SelectionWedgeAffinity(WedgeAffinity.Start), null, 2, null);
    }

    public /* synthetic */ TransformedTextFieldState(TextFieldState textFieldState, InputTransformation inputTransformation, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, (i & 2) != 0 ? null : inputTransformation, (i & 4) != 0 ? null : codepointTransformation, (i & 8) != 0 ? null : outputTransformation);
    }

    public final TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getValue$foundation_release();
    }

    public final TextFieldCharSequence getOutputText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.outputTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getUntransformedText() : text;
    }

    public final TextFieldCharSequence getVisualText() {
        TransformedText value;
        TextFieldCharSequence text;
        State<TransformedText> state = this.codepointTransformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? getOutputText() : text;
    }

    public final SelectionWedgeAffinity getSelectionWedgeAffinity() {
        return (SelectionWedgeAffinity) this.selectionWedgeAffinity.getValue();
    }

    public final void setSelectionWedgeAffinity(SelectionWedgeAffinity selectionWedgeAffinity) {
        this.selectionWedgeAffinity.setValue(selectionWedgeAffinity);
    }

    public final void update(InputTransformation p0) {
        this.inputTransformation = p0;
    }

    public final void placeCursorBeforeCharAt(int p0) {
        m1554selectCharsIn5zctL8(TextRangeKt.TextRange(p0));
    }

    /* JADX INFO: renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1554selectCharsIn5zctL8(long p0) {
        m1555selectUntransformedCharsIn5zctL8(m1550mapFromTransformedGEjPoXI(p0));
    }

    /* JADX INFO: renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1555selectUntransformedCharsIn5zctL8(long p0) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer().setSelection(TextRange.m6397getStartimpl(p0), TextRange.m6392getEndimpl(p0));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX INFO: renamed from: highlightCharsIn-7RAjNK8, reason: not valid java name */
    public final void m1548highlightCharsIn7RAjNK8(int p0, long p1) {
        long jM1550mapFromTransformedGEjPoXI = m1550mapFromTransformedGEjPoXI(p1);
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer().m1464setHighlightK7f2yys(p0, TextRange.m6397getStartimpl(jM1550mapFromTransformedGEjPoXI), TextRange.m6392getEndimpl(jM1550mapFromTransformedGEjPoXI));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void replaceAll(CharSequence p0) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        EditCommandKt.deleteAll(mainBuffer);
        EditCommandKt.commitText(mainBuffer, p0.toString(), 1);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void selectAll() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.setSelection(0, mainBuffer.getLength());
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void deleteSelectedText() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.NeverMerge;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.delete(TextRange.m6395getMinimpl(mainBuffer.m1463getSelectiond9O1mEE()), TextRange.m6394getMaximpl(mainBuffer.m1463getSelectiond9O1mEE()));
        mainBuffer.setSelection(TextRange.m6395getMinimpl(mainBuffer.m1463getSelectiond9O1mEE()), TextRange.m6395getMinimpl(mainBuffer.m1463getSelectiond9O1mEE()));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX INFO: renamed from: replaceText-M8tDOmk$default, reason: not valid java name */
    public static /* synthetic */ void m1547replaceTextM8tDOmk$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, long j, TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = textFieldEditUndoBehavior;
        if ((i & 8) != 0) {
            z = true;
        }
        transformedTextFieldState.m1553replaceTextM8tDOmk(charSequence, j, textFieldEditUndoBehavior2, z);
    }

    /* JADX INFO: renamed from: replaceText-M8tDOmk, reason: not valid java name */
    public final void m1553replaceTextM8tDOmk(CharSequence p0, long p1, TextFieldEditUndoBehavior p2, boolean p3) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        long jM1550mapFromTransformedGEjPoXI = m1550mapFromTransformedGEjPoXI(p1);
        mainBuffer.replace(TextRange.m6395getMinimpl(jM1550mapFromTransformedGEjPoXI), TextRange.m6394getMaximpl(jM1550mapFromTransformedGEjPoXI), p0);
        int iM6395getMinimpl = TextRange.m6395getMinimpl(jM1550mapFromTransformedGEjPoXI) + p0.length();
        mainBuffer.setSelection(iM6395getMinimpl, iM6395getMinimpl);
        textFieldState.commitEditAsUser(inputTransformation, p3, p2);
    }

    public static /* synthetic */ void replaceSelectedText$default(TransformedTextFieldState transformedTextFieldState, CharSequence charSequence, boolean z, TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, z, textFieldEditUndoBehavior);
    }

    public final void replaceSelectedText(CharSequence p0, boolean p1, TextFieldEditUndoBehavior p2) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        if (p1) {
            mainBuffer.commitComposition();
        }
        long jM1463getSelectiond9O1mEE = mainBuffer.m1463getSelectiond9O1mEE();
        mainBuffer.replace(TextRange.m6395getMinimpl(jM1463getSelectiond9O1mEE), TextRange.m6394getMaximpl(jM1463getSelectiond9O1mEE), p0);
        int iM6395getMinimpl = TextRange.m6395getMinimpl(jM1463getSelectiond9O1mEE) + p0.length();
        mainBuffer.setSelection(iM6395getMinimpl, iM6395getMinimpl);
        textFieldState.commitEditAsUser(inputTransformation, true, p2);
    }

    public final void collapseSelectionToMax() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.setSelection(TextRange.m6394getMaximpl(mainBuffer.m1463getSelectiond9O1mEE()), TextRange.m6394getMaximpl(mainBuffer.m1463getSelectiond9O1mEE()));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToEnd() {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.setSelection(TextRange.m6392getEndimpl(mainBuffer.m1463getSelectiond9O1mEE()), TextRange.m6392getEndimpl(mainBuffer.m1463getSelectiond9O1mEE()));
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(TransformedTextFieldState transformedTextFieldState, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        function1.invoke(textFieldState.getMainBuffer());
        textFieldState.commitEditAsUser(inputTransformation, z, textFieldEditUndoBehavior);
    }

    public final void editUntransformedTextAsUser(boolean p0, Function1<? super EditingBuffer, Unit> p1) {
        TextFieldState textFieldState = this.textFieldState;
        InputTransformation inputTransformation = this.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        p1.invoke(textFieldState.getMainBuffer());
        textFieldState.commitEditAsUser(inputTransformation, p0, textFieldEditUndoBehavior);
    }

    /* JADX INFO: renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m1551mapToTransformedjx7JFs(int p0) {
        long jTextRange;
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping2 != null) {
            jTextRange = offsetMapping2.m1501mapFromSourcejx7JFs(p0);
        } else {
            jTextRange = TextRangeKt.TextRange(p0);
        }
        return offsetMapping != null ? Companion.m1559mapToTransformedXGyztTk(jTextRange, offsetMapping, getSelectionWedgeAffinity()) : jTextRange;
    }

    /* JADX INFO: renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m1552mapToTransformedGEjPoXI(long p0) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping2 != null) {
            p0 = Companion.m1560mapToTransformedXGyztTk$default(Companion, p0, offsetMapping2, null, 4, null);
        }
        return offsetMapping != null ? Companion.m1559mapToTransformedXGyztTk(p0, offsetMapping, getSelectionWedgeAffinity()) : p0;
    }

    /* JADX INFO: renamed from: mapFromTransformed--jx7JFs, reason: not valid java name */
    public final long m1549mapFromTransformedjx7JFs(int p0) {
        long jTextRange;
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping != null) {
            jTextRange = offsetMapping.m1500mapFromDestjx7JFs(p0);
        } else {
            jTextRange = TextRangeKt.TextRange(p0);
        }
        return offsetMapping2 != null ? Companion.m1558mapFromTransformedxdX6G0(jTextRange, offsetMapping2) : jTextRange;
    }

    /* JADX INFO: renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m1550mapFromTransformedGEjPoXI(long p0) {
        TransformedText value;
        TransformedText value2;
        State<TransformedText> state = this.outputTransformedText;
        OffsetMappingCalculator offsetMapping = null;
        OffsetMappingCalculator offsetMapping2 = (state == null || (value2 = state.getValue()) == null) ? null : value2.getOffsetMapping();
        State<TransformedText> state2 = this.codepointTransformedText;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMapping = value.getOffsetMapping();
        }
        if (offsetMapping != null) {
            p0 = Companion.m1558mapFromTransformedxdX6G0(p0, offsetMapping);
        }
        return offsetMapping2 != null ? Companion.m1558mapFromTransformedxdX6G0(p0, offsetMapping2) : p0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object collectImeNotifications(final TextFieldState.NotifyImeListener notifyImeListener, Continuation<?> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = notifyImeListener;
            anonymousClass1.label = 1;
            AnonymousClass1 anonymousClass2 = anonymousClass1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(anonymousClass2), 1);
            cancellableContinuationImpl.initCancellability();
            this.textFieldState.addNotifyImeListener$foundation_release(notifyImeListener);
            cancellableContinuationImpl.b((Function1<? super Throwable, Unit>) new Function1<Throwable, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    this.this$0.textFieldState.removeNotifyImeListener$foundation_release(notifyImeListener);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(anonymousClass2);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TransformedTextFieldState)) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState = (TransformedTextFieldState) p0;
        if (Intrinsics.areEqual(this.textFieldState, transformedTextFieldState.textFieldState) && Intrinsics.areEqual(this.codepointTransformation, transformedTextFieldState.codepointTransformation)) {
            return Intrinsics.areEqual(this.outputTransformation, transformedTextFieldState.outputTransformation);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.textFieldState.hashCode();
        CodepointTransformation codepointTransformation = this.codepointTransformation;
        int iHashCode2 = codepointTransformation != null ? codepointTransformation.hashCode() : 0;
        OutputTransformation outputTransformation = this.outputTransformation;
        return (((iHashCode * 31) + iHashCode2) * 31) + (outputTransformation != null ? outputTransformation.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformedTextFieldState(textFieldState=");
        sb.append(this.textFieldState);
        sb.append(", outputTransformation=");
        sb.append(this.outputTransformation);
        sb.append(", outputTransformedText=");
        sb.append(this.outputTransformedText);
        sb.append(", codepointTransformation=");
        sb.append(this.codepointTransformation);
        sb.append(", codepointTransformedText=");
        sb.append(this.codepointTransformedText);
        sb.append(", outputText=\"");
        sb.append((Object) getOutputText());
        sb.append("\", visualText=\"");
        sb.append((Object) getVisualText());
        sb.append("\")");
        return sb.toString();
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÇ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "p0", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "p1", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "component1", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "component2", "()Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "copy", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "offsetMapping", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "getOffsetMapping", "text", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getText"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class TransformedText {
        private final OffsetMappingCalculator offsetMapping;
        private final TextFieldCharSequence text;

        public TransformedText(TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }

        public final TextFieldCharSequence getText() {
            return this.text;
        }

        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        public static /* synthetic */ TransformedText copy$default(TransformedText transformedText, TextFieldCharSequence textFieldCharSequence, OffsetMappingCalculator offsetMappingCalculator, int i, Object obj) {
            if ((i & 1) != 0) {
                textFieldCharSequence = transformedText.text;
            }
            if ((i & 2) != 0) {
                offsetMappingCalculator = transformedText.offsetMapping;
            }
            return transformedText.copy(textFieldCharSequence, offsetMappingCalculator);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TextFieldCharSequence getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        public final TransformedText copy(TextFieldCharSequence p0, OffsetMappingCalculator p1) {
            return new TransformedText(p0, p1);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TransformedText)) {
                return false;
            }
            TransformedText transformedText = (TransformedText) p0;
            return Intrinsics.areEqual(this.text, transformedText.text) && Intrinsics.areEqual(this.offsetMapping, transformedText.offsetMapping);
        }

        public final int hashCode() {
            return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TransformedText(text=");
            sb.append((Object) this.text);
            sb.append(", offsetMapping=");
            sb.append(this.offsetMapping);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0083\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\u000eJ\"\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0010H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "p0", "Landroidx/compose/foundation/text/input/OutputTransformation;", "p1", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "p2", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "calculateTransformedText", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "Landroidx/compose/ui/text/TextRange;", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "mapFromTransformed-xdX6-G0", "(JLandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)J", "mapFromTransformed", "mapToTransformed-XGyztTk", "(JLandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)J", "mapToTransformed"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WedgeAffinity.values().length];
                try {
                    iArr[WedgeAffinity.Start.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WedgeAffinity.End.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final TransformedText calculateTransformedText(TextFieldCharSequence p0, OutputTransformation p1, SelectionWedgeAffinity p2) {
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            TextFieldBuffer textFieldBuffer = new TextFieldBuffer(p0, null, null, offsetMappingCalculator, 6, null);
            p1.transformOutput(textFieldBuffer);
            TextRange textRangeM6385boximpl = null;
            if (textFieldBuffer.getChanges().getChangeCount() == 0) {
                return null;
            }
            long jM1559mapToTransformedXGyztTk = m1559mapToTransformedXGyztTk(p0.getSelection(), offsetMappingCalculator, p2);
            TextRange composition = p0.getComposition();
            if (composition != null) {
                textRangeM6385boximpl = TextRange.m6385boximpl(TransformedTextFieldState.Companion.m1559mapToTransformedXGyztTk(composition.getPackedValue(), offsetMappingCalculator, p2));
            }
            return new TransformedText(textFieldBuffer.m1425toTextFieldCharSequenceudt6zUU$foundation_release(jM1559mapToTransformedXGyztTk, textRangeM6385boximpl), offsetMappingCalculator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final TransformedText calculateTransformedText(TextFieldCharSequence p0, CodepointTransformation p1, SelectionWedgeAffinity p2) {
            TextRange textRangeM6385boximpl;
            OffsetMappingCalculator offsetMappingCalculator = new OffsetMappingCalculator();
            CharSequence visualText = CodepointTransformationKt.toVisualText(p0, p1, offsetMappingCalculator);
            if (visualText == p0) {
                return null;
            }
            long jM1559mapToTransformedXGyztTk = m1559mapToTransformedXGyztTk(p0.getSelection(), offsetMappingCalculator, p2);
            TextRange composition = p0.getComposition();
            if (composition != null) {
                textRangeM6385boximpl = TextRange.m6385boximpl(TransformedTextFieldState.Companion.m1559mapToTransformedXGyztTk(composition.getPackedValue(), offsetMappingCalculator, p2));
            } else {
                textRangeM6385boximpl = null;
            }
            return new TransformedText(new TextFieldCharSequence(visualText, jM1559mapToTransformedXGyztTk, textRangeM6385boximpl, null, 8, null), offsetMappingCalculator);
        }

        /* JADX INFO: renamed from: mapToTransformed-XGyztTk$default, reason: not valid java name */
        static /* synthetic */ long m1560mapToTransformedXGyztTk$default(Companion companion, long j, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity, int i, Object obj) {
            if ((i & 4) != 0) {
                selectionWedgeAffinity = null;
            }
            return companion.m1559mapToTransformedXGyztTk(j, offsetMappingCalculator, selectionWedgeAffinity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        /* JADX INFO: renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
        public final long m1559mapToTransformedXGyztTk(long p0, OffsetMappingCalculator p1, SelectionWedgeAffinity p2) {
            long jTextRange;
            long jM1501mapFromSourcejx7JFs = p1.m1501mapFromSourcejx7JFs(TextRange.m6397getStartimpl(p0));
            long jM1501mapFromSourcejx7JFs2 = TextRange.m6391getCollapsedimpl(p0) ? jM1501mapFromSourcejx7JFs : p1.m1501mapFromSourcejx7JFs(TextRange.m6392getEndimpl(p0));
            int iMin = Math.min(TextRange.m6395getMinimpl(jM1501mapFromSourcejx7JFs), TextRange.m6395getMinimpl(jM1501mapFromSourcejx7JFs2));
            int iMax = Math.max(TextRange.m6394getMaximpl(jM1501mapFromSourcejx7JFs), TextRange.m6394getMaximpl(jM1501mapFromSourcejx7JFs2));
            if (TextRange.m6396getReversedimpl(p0)) {
                jTextRange = TextRangeKt.TextRange(iMax, iMin);
            } else {
                jTextRange = TextRangeKt.TextRange(iMin, iMax);
            }
            if (TextRange.m6391getCollapsedimpl(p0) && !TextRange.m6391getCollapsedimpl(jTextRange)) {
                WedgeAffinity startAffinity = p2 != null ? p2.getStartAffinity() : null;
                int i = startAffinity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[startAffinity.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        return TextRangeKt.TextRange(TextRange.m6397getStartimpl(jTextRange));
                    }
                    if (i == 2) {
                        return TextRangeKt.TextRange(TextRange.m6392getEndimpl(jTextRange));
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return jTextRange;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        /* JADX INFO: renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
        public final long m1558mapFromTransformedxdX6G0(long p0, OffsetMappingCalculator p1) {
            long jM1500mapFromDestjx7JFs = p1.m1500mapFromDestjx7JFs(TextRange.m6397getStartimpl(p0));
            long jM1500mapFromDestjx7JFs2 = TextRange.m6391getCollapsedimpl(p0) ? jM1500mapFromDestjx7JFs : p1.m1500mapFromDestjx7JFs(TextRange.m6392getEndimpl(p0));
            int iMin = Math.min(TextRange.m6395getMinimpl(jM1500mapFromDestjx7JFs), TextRange.m6395getMinimpl(jM1500mapFromDestjx7JFs2));
            int iMax = Math.max(TextRange.m6394getMaximpl(jM1500mapFromDestjx7JFs), TextRange.m6394getMaximpl(jM1500mapFromDestjx7JFs2));
            if (TextRange.m6396getReversedimpl(p0)) {
                return TextRangeKt.TextRange(iMax, iMin);
            }
            return TextRangeKt.TextRange(iMin, iMax);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, OutputTransformation outputTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, outputTransformation, selectionWedgeAffinity);
    }

    @JvmStatic
    private static final TransformedText calculateTransformedText(TextFieldCharSequence textFieldCharSequence, CodepointTransformation codepointTransformation, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.calculateTransformedText(textFieldCharSequence, codepointTransformation, selectionWedgeAffinity);
    }

    @JvmStatic
    /* JADX INFO: renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
    private static final long m1545mapFromTransformedxdX6G0(long j, OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m1558mapFromTransformedxdX6G0(j, offsetMappingCalculator);
    }

    @JvmStatic
    /* JADX INFO: renamed from: mapToTransformed-XGyztTk, reason: not valid java name */
    private static final long m1546mapToTransformedXGyztTk(long j, OffsetMappingCalculator offsetMappingCalculator, SelectionWedgeAffinity selectionWedgeAffinity) {
        return Companion.m1559mapToTransformedXGyztTk(j, offsetMappingCalculator, selectionWedgeAffinity);
    }
}
