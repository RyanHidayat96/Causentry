package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpersKt;
import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 _2\u00020\u0001:\u0001_B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00062\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u0016\u001a\u00020\u00002\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00002\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0017J \u0010\u001b\u001a\u00020\u000f2\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0086\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0013¢\u0006\u0004\b!\u0010 J\r\u0010\"\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010 J\r\u0010#\u001a\u00020\u0013¢\u0006\u0004\b#\u0010 J\r\u0010$\u001a\u00020\u0013¢\u0006\u0004\b$\u0010 J\r\u0010%\u001a\u00020\u0013¢\u0006\u0004\b%\u0010 J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010\u0015J\u000f\u0010)\u001a\u00020\u0000H\u0007¢\u0006\u0004\b)\u0010\u001eJ\u000f\u0010*\u001a\u00020\u0000H\u0007¢\u0006\u0004\b*\u0010\u001eJ\u000f\u0010+\u001a\u00020\u0000H\u0007¢\u0006\u0004\b+\u0010\u001eJ\u000f\u0010,\u001a\u00020\u0000H\u0007¢\u0006\u0004\b,\u0010\u001eJ\u000f\u0010-\u001a\u00020\u0000H\u0002¢\u0006\u0004\b-\u0010\u001eJ\u000f\u0010.\u001a\u00020\u0000H\u0007¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u00020\u0000H\u0002¢\u0006\u0004\b/\u0010\u001eJ\u000f\u00100\u001a\u00020\u0000H\u0002¢\u0006\u0004\b0\u0010\u001eJ\u000f\u00101\u001a\u00020\u0000H\u0007¢\u0006\u0004\b1\u0010\u001eJ\u000f\u00102\u001a\u00020\u0000H\u0002¢\u0006\u0004\b2\u0010\u001eJ\u000f\u00103\u001a\u00020\u0000H\u0007¢\u0006\u0004\b3\u0010\u001eJ\u000f\u00104\u001a\u00020\u0000H\u0007¢\u0006\u0004\b4\u0010\u001eJ\u000f\u00105\u001a\u00020\u0000H\u0007¢\u0006\u0004\b5\u0010\u001eJ\u000f\u00106\u001a\u00020\u0000H\u0007¢\u0006\u0004\b6\u0010\u001eJ\u000f\u00107\u001a\u00020\u0000H\u0007¢\u0006\u0004\b7\u0010\u001eJ\u000f\u00108\u001a\u00020\u0000H\u0007¢\u0006\u0004\b8\u0010\u001eJ\u000f\u00109\u001a\u00020\u0000H\u0007¢\u0006\u0004\b9\u0010\u001eJ\u000f\u0010:\u001a\u00020\u0000H\u0007¢\u0006\u0004\b:\u0010\u001eJ\u000f\u0010;\u001a\u00020\u0000H\u0007¢\u0006\u0004\b;\u0010\u001eJ\u000f\u0010<\u001a\u00020\u0000H\u0007¢\u0006\u0004\b<\u0010\u001eJ\u000f\u0010=\u001a\u00020\u0000H\u0007¢\u0006\u0004\b=\u0010\u001eJ\u000f\u0010>\u001a\u00020\u0000H\u0007¢\u0006\u0004\b>\u0010\u001eJ\u0017\u0010?\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020\u0013*\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\bA\u0010BJ\u001d\u0010C\u001a\u00020\u0013*\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\bC\u0010BJ\u001e\u0010D\u001a\u00020\u0013*\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0013H\u0082\u0010¢\u0006\u0004\bD\u0010BJ\u001e\u0010E\u001a\u00020\u0013*\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0013H\u0082\u0010¢\u0006\u0004\bE\u0010BJ\u001b\u0010F\u001a\u00020\u0013*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\bF\u0010BR\u001a\u0010H\u001a\u00020G8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR%\u0010N\u001a\u00020\u001a8\u0007@\u0007X\u0087\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010]\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b]\u0010^\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "p0", "Landroidx/compose/ui/text/TextLayoutResult;", "p1", "", "p2", "", "p3", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "p4", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextLayoutResult;ZFLandroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;)V", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "applyIfNotEmpty", "(ZLkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "", "charOffset", "(I)I", "collapseLeftOr", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "collapseRightOr", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextRange;", "deleteIfSelectedOr", "(Lkotlin/jvm/functions/Function0;)V", "deselect", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelection;", "getLineEndByOffset", "()I", "getLineStartByOffset", "getNextCharacterIndex", "getNextWordOffset", "getPrecedingCharacterIndex", "getPreviousWordOffset", "isLtr", "()Z", "jumpByPagesOffset", "moveCursorDownByLine", "moveCursorDownByPage", "moveCursorLeft", "moveCursorLeftByWord", "moveCursorNext", "moveCursorNextByParagraph", "moveCursorNextByWord", "moveCursorPrev", "moveCursorPrevByParagraph", "moveCursorPrevByWord", "moveCursorRight", "moveCursorRightByWord", "moveCursorToEnd", "moveCursorToHome", "moveCursorToLineEnd", "moveCursorToLineLeftSide", "moveCursorToLineRightSide", "moveCursorToLineStart", "moveCursorUpByLine", "moveCursorUpByPage", "selectAll", "selectMovement", "setCursor", "(I)V", "getLineEndByOffsetForLayout", "(Landroidx/compose/ui/text/TextLayoutResult;I)I", "getLineStartByOffsetForLayout", "getNextWordOffsetForLayout", "getPrevWordOffsetForLayout", "jumpByLinesOffset", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "initialValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getInitialValue", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "isFromSoftKeyboard", "Z", "selection", "J", "getSelection-d9O1mEE", "()J", "setSelection-5zc-tL8", "(J)V", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "text", "Ljava/lang/String;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "textPreparedSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldPreparedSelectionState;", "visibleTextLayoutHeight", "F", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldPreparedSelection {
    public static final int NoCharacterFound = -1;
    private final TextFieldCharSequence initialValue;
    private final boolean isFromSoftKeyboard;
    private long selection;
    private final TransformedTextFieldState state;
    private final String text;
    private final TextLayoutResult textLayoutResult;
    private final TextFieldPreparedSelectionState textPreparedSelectionState;
    private final float visibleTextLayoutHeight;
    public static final int $stable = 8;

    public TextFieldPreparedSelection(TransformedTextFieldState transformedTextFieldState, TextLayoutResult textLayoutResult, boolean z, float f, TextFieldPreparedSelectionState textFieldPreparedSelectionState) {
        this.state = transformedTextFieldState;
        this.textLayoutResult = textLayoutResult;
        this.isFromSoftKeyboard = z;
        this.visibleTextLayoutHeight = f;
        this.textPreparedSelectionState = textFieldPreparedSelectionState;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            this.initialValue = visualText;
            this.selection = visualText.getSelection();
            this.text = visualText.toString();
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public final TextFieldCharSequence getInitialValue() {
        return this.initialValue;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1576setSelection5zctL8(long j) {
        this.selection = j;
    }

    public final void deleteIfSelectedOr(Function0<TextRange> p0) {
        if (!TextRange.m6391getCollapsedimpl(getSelection())) {
            TransformedTextFieldState.m1547replaceTextM8tDOmk$default(this.state, "", getSelection(), null, !this.isFromSoftKeyboard, 4, null);
            return;
        }
        TextRange textRangeInvoke = p0.invoke();
        if (textRangeInvoke != null) {
            TransformedTextFieldState.m1547replaceTextM8tDOmk$default(this.state, "", textRangeInvoke.getPackedValue(), null, !this.isFromSoftKeyboard, 4, null);
        }
    }

    private final int jumpByPagesOffset(int p0) {
        int iM6392getEndimpl = TextRange.m6392getEndimpl(this.initialValue.getSelection());
        if (this.textLayoutResult == null || Float.isNaN(this.visibleTextLayoutHeight)) {
            return iM6392getEndimpl;
        }
        Rect rectTranslate = this.textLayoutResult.getCursorRect(iM6392getEndimpl).translate(0.0f, this.visibleTextLayoutHeight * p0);
        float lineBottom = this.textLayoutResult.getLineBottom(this.textLayoutResult.getLineForVerticalPosition(rectTranslate.getTop()));
        if (Math.abs(rectTranslate.getTop() - lineBottom) > Math.abs(rectTranslate.getBottom() - lineBottom)) {
            return this.textLayoutResult.m6367getOffsetForPositionk4lQ0M(rectTranslate.m4009getTopLeftF1C5BW0());
        }
        return this.textLayoutResult.m6367getOffsetForPositionk4lQ0M(rectTranslate.m4002getBottomLeftF1C5BW0());
    }

    private final TextFieldPreparedSelection applyIfNotEmpty(boolean p0, Function1<? super TextFieldPreparedSelection, Unit> p1) {
        if (p0) {
            this.textPreparedSelectionState.resetCachedX();
        }
        if (this.text.length() > 0) {
            p1.invoke(this);
        }
        return this;
    }

    static /* synthetic */ TextFieldPreparedSelection applyIfNotEmpty$default(TextFieldPreparedSelection textFieldPreparedSelection, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0 || z) {
            textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        }
        if (textFieldPreparedSelection.text.length() > 0) {
            function1.invoke(textFieldPreparedSelection);
        }
        return textFieldPreparedSelection;
    }

    private final void setCursor(int p0) {
        this.selection = TextRangeKt.TextRange(p0, p0);
    }

    public final int getPrecedingCharacterIndex() {
        return StringHelpers_androidKt.findPrecedingBreak(this.text, TextRange.m6392getEndimpl(this.selection));
    }

    public final int getNextCharacterIndex() {
        return StringHelpers_androidKt.findFollowingBreak(this.text, TextRange.m6392getEndimpl(this.selection));
    }

    public final int getNextWordOffset() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult != null ? getNextWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length();
    }

    public final int getPreviousWordOffset() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return getPrevWordOffsetForLayout$default(this, textLayoutResult, 0, 1, null);
        }
        return 0;
    }

    public final TextFieldPreparedSelection moveCursorUpByLine() {
        if (this.textLayoutResult != null && this.text.length() > 0) {
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            Intrinsics.checkNotNull(textLayoutResult);
            setCursor(jumpByLinesOffset(textLayoutResult, -1));
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorDownByLine() {
        if (this.textLayoutResult != null && this.text.length() > 0) {
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            Intrinsics.checkNotNull(textLayoutResult);
            setCursor(jumpByLinesOffset(textLayoutResult, 1));
        }
        return this;
    }

    public final int getLineStartByOffset() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return getLineStartByOffsetForLayout$default(this, textLayoutResult, 0, 1, null);
        }
        return 0;
    }

    public final int getLineEndByOffset() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult != null ? getLineEndByOffsetForLayout$default(this, textLayoutResult, 0, 1, null) : this.text.length();
    }

    private final boolean isLtr() {
        ResolvedTextDirection paragraphDirection;
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return textLayoutResult == null || (paragraphDirection = textLayoutResult.getParagraphDirection(TextRange.m6392getEndimpl(this.selection))) == null || paragraphDirection == ResolvedTextDirection.Ltr;
    }

    static /* synthetic */ int getNextWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m6392getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getNextWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getNextWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i < this.initialValue.length()) {
            long jM6369getWordBoundaryjx7JFs = textLayoutResult.m6369getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m6392getEndimpl(jM6369getWordBoundaryjx7JFs) > i) {
                return TextRange.m6392getEndimpl(jM6369getWordBoundaryjx7JFs);
            }
            i++;
        }
        return this.initialValue.length();
    }

    static /* synthetic */ int getPrevWordOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m6392getEndimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getPrevWordOffsetForLayout(textLayoutResult, i);
    }

    private final int getPrevWordOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        while (i > 0) {
            long jM6369getWordBoundaryjx7JFs = textLayoutResult.m6369getWordBoundaryjx7JFs(charOffset(i));
            if (TextRange.m6397getStartimpl(jM6369getWordBoundaryjx7JFs) < i) {
                return TextRange.m6397getStartimpl(jM6369getWordBoundaryjx7JFs);
            }
            i--;
        }
        return 0;
    }

    static /* synthetic */ int getLineStartByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m6395getMinimpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineStartByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineStartByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return textLayoutResult.getLineStart(textLayoutResult.getLineForOffset(i));
    }

    static /* synthetic */ int getLineEndByOffsetForLayout$default(TextFieldPreparedSelection textFieldPreparedSelection, TextLayoutResult textLayoutResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = TextRange.m6394getMaximpl(textFieldPreparedSelection.selection);
        }
        return textFieldPreparedSelection.getLineEndByOffsetForLayout(textLayoutResult, i);
    }

    private final int getLineEndByOffsetForLayout(TextLayoutResult textLayoutResult, int i) {
        return textLayoutResult.getLineEnd(textLayoutResult.getLineForOffset(i), true);
    }

    private final int jumpByLinesOffset(TextLayoutResult textLayoutResult, int i) {
        int iM6392getEndimpl = TextRange.m6392getEndimpl(this.selection);
        if (Float.isNaN(this.textPreparedSelectionState.getCachedX())) {
            this.textPreparedSelectionState.setCachedX(textLayoutResult.getCursorRect(iM6392getEndimpl).getLeft());
        }
        int lineForOffset = textLayoutResult.getLineForOffset(iM6392getEndimpl) + i;
        if (lineForOffset < 0) {
            return 0;
        }
        if (lineForOffset >= textLayoutResult.getLineCount()) {
            return this.text.length();
        }
        float lineBottom = textLayoutResult.getLineBottom(lineForOffset);
        float cachedX = this.textPreparedSelectionState.getCachedX();
        if ((isLtr() && cachedX >= textLayoutResult.getLineRight(lineForOffset)) || (!isLtr() && cachedX <= textLayoutResult.getLineLeft(lineForOffset))) {
            return textLayoutResult.getLineEnd(lineForOffset, true);
        }
        return textLayoutResult.m6367getOffsetForPositionk4lQ0M(OffsetKt.Offset(cachedX, lineBottom - 1.0f));
    }

    private final int charOffset(int p0) {
        return RangesKt.coerceAtMost(p0, this.text.length() - 1);
    }

    public final TextFieldPreparedSelection moveCursorUpByPage() {
        if (this.text.length() > 0) {
            setCursor(jumpByPagesOffset(-1));
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorDownByPage() {
        if (this.text.length() > 0) {
            setCursor(jumpByPagesOffset(1));
        }
        return this;
    }

    public final TextFieldPreparedSelection selectAll() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(0, this.text.length());
        }
        return this;
    }

    public final TextFieldPreparedSelection deselect() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(TextRange.m6392getEndimpl(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorLeft() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorPrev();
                return this;
            }
            moveCursorNext();
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorRight() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorNext();
                return this;
            }
            moveCursorPrev();
        }
        return this;
    }

    public final TextFieldPreparedSelection collapseLeftOr(Function1<? super TextFieldPreparedSelection, Unit> p0) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m6391getCollapsedimpl(this.selection)) {
                p0.invoke(this);
                return this;
            }
            if (isLtr()) {
                setCursor(TextRange.m6395getMinimpl(this.selection));
                return this;
            }
            setCursor(TextRange.m6394getMaximpl(this.selection));
        }
        return this;
    }

    public final TextFieldPreparedSelection collapseRightOr(Function1<? super TextFieldPreparedSelection, Unit> p0) {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (TextRange.m6391getCollapsedimpl(this.selection)) {
                p0.invoke(this);
                return this;
            }
            if (isLtr()) {
                setCursor(TextRange.m6394getMaximpl(this.selection));
                return this;
            }
            setCursor(TextRange.m6395getMinimpl(this.selection));
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorPrev() {
        int iM6392getEndimpl;
        int iCalculateAdjacentCursorPosition;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0 && (iCalculateAdjacentCursorPosition = TextPreparedSelectionKt.calculateAdjacentCursorPosition(this.text, (iM6392getEndimpl = TextRange.m6392getEndimpl(this.selection)), false, this.state)) != iM6392getEndimpl) {
            setCursor(iCalculateAdjacentCursorPosition);
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorNext() {
        int iM6392getEndimpl;
        int iCalculateAdjacentCursorPosition;
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0 && (iCalculateAdjacentCursorPosition = TextPreparedSelectionKt.calculateAdjacentCursorPosition(this.text, (iM6392getEndimpl = TextRange.m6392getEndimpl(this.selection)), true, this.state)) != iM6392getEndimpl) {
            setCursor(iCalculateAdjacentCursorPosition);
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToHome() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(0);
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(this.text.length());
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorLeftByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorPrevByWord();
                return this;
            }
            moveCursorNextByWord();
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorRightByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorNextByWord();
                return this;
            }
            moveCursorPrevByWord();
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorNextByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getNextWordOffset());
        }
        return this;
    }

    private final TextFieldPreparedSelection moveCursorPrevByWord() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getPreviousWordOffset());
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorPrevByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, TextRange.m6395getMinimpl(this.selection));
            if (iFindParagraphStart == TextRange.m6395getMinimpl(this.selection) && iFindParagraphStart != 0) {
                iFindParagraphStart = StringHelpersKt.findParagraphStart(this.text, iFindParagraphStart - 1);
            }
            setCursor(iFindParagraphStart);
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorNextByParagraph() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            int iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, TextRange.m6394getMaximpl(this.selection));
            if (iFindParagraphEnd == TextRange.m6394getMaximpl(this.selection) && iFindParagraphEnd != this.text.length()) {
                iFindParagraphEnd = StringHelpersKt.findParagraphEnd(this.text, iFindParagraphEnd + 1);
            }
            setCursor(iFindParagraphEnd);
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineStart() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getLineStartByOffset());
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineEnd() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            setCursor(getLineEndByOffset());
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineLeftSide() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorToLineStart();
                return this;
            }
            moveCursorToLineEnd();
        }
        return this;
    }

    public final TextFieldPreparedSelection moveCursorToLineRightSide() {
        this.textPreparedSelectionState.resetCachedX();
        if (this.text.length() > 0) {
            if (isLtr()) {
                moveCursorToLineEnd();
                return this;
            }
            moveCursorToLineStart();
        }
        return this;
    }

    public final TextFieldPreparedSelection selectMovement() {
        if (this.text.length() > 0) {
            this.selection = TextRangeKt.TextRange(TextRange.m6397getStartimpl(this.initialValue.getSelection()), TextRange.m6392getEndimpl(this.selection));
        }
        return this;
    }
}
