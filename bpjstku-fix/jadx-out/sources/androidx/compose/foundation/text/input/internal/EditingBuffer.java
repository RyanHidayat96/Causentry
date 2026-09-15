package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 L2\u00020\u0001:\u0001LB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\rJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\rJ(\u0010 \u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b!\u0010\rJ\u000f\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H\u0017¢\u0006\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u00048Gø\u0001\u0001¢\u0006\u0006\u001a\u0004\b+\u0010,R$\u0010.\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u00102\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R$\u00107\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00101\"\u0004\b5\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004\u0018\u00010;8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b \u0010@R\u0011\u0010B\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\bA\u00101R\u0014\u0010E\u001a\u00020\u00048Gø\u0001\u0001¢\u0006\u0006\u001a\u0004\bC\u0010DR*\u0010F\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@CX\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010/\u001a\u0004\bG\u00101\"\u0004\bH\u00106R*\u0010I\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0007@CX\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101\"\u0004\bK\u00106\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "", "", "p0", "Landroidx/compose/ui/text/TextRange;", "p1", "<init>", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "", "checkRange", "(II)V", "clearHighlight", "()V", "commitComposition", "delete", "", "get", "(I)C", "", "hasComposition", "()Z", "", "p2", "replace", "(IILjava/lang/CharSequence;)V", "setComposition", "Landroidx/compose/foundation/text/input/TextHighlightType;", "setHighlight-K7f2yys", "(III)V", "setHighlight", "setSelection", "toAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "toString", "()Ljava/lang/String;", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "changeTracker", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "getChangeTracker", "()Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "composition", "compositionEnd", "I", "getCompositionEnd", "()I", "compositionStart", "getCompositionStart", "getCursor", "setCursor", "(I)V", "cursor", "Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "gapBuffer", "Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "Lkotlin/Pair;", "highlight", "Lkotlin/Pair;", "getHighlight", "()Lkotlin/Pair;", "(Lkotlin/Pair;)V", "getLength", "length", "getSelection-d9O1mEE", "()J", "selection", "selectionEnd", "getSelectionEnd", "setSelectionEnd", "selectionStart", "getSelectionStart", "setSelectionStart", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private final ChangeTracker changeTracker;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private Pair<TextHighlightType, TextRange> highlight;
    private int selectionEnd;
    private int selectionStart;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    private EditingBuffer(AnnotatedString annotatedString, long j) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.changeTracker = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
        this.selectionStart = TextRange.m6397getStartimpl(j);
        this.selectionEnd = TextRange.m6392getEndimpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        checkRange(TextRange.m6397getStartimpl(j), TextRange.m6392getEndimpl(j));
    }

    public final ChangeTracker getChangeTracker() {
        return this.changeTracker;
    }

    public final int getSelectionStart() {
        return this.selectionStart;
    }

    private final void setSelectionStart(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Cannot set selectionStart to a negative value: ".concat(String.valueOf(i)).toString());
        }
        this.selectionStart = i;
        this.highlight = null;
    }

    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    private final void setSelectionEnd(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Cannot set selectionEnd to a negative value: ".concat(String.valueOf(i)).toString());
        }
        this.selectionEnd = i;
        this.highlight = null;
    }

    public final Pair<TextHighlightType, TextRange> getHighlight() {
        return this.highlight;
    }

    public final void setHighlight(Pair<TextHighlightType, TextRange> pair) {
        this.highlight = pair;
    }

    public final int getCompositionStart() {
        return this.compositionStart;
    }

    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    public final boolean hasComposition() {
        return this.compositionStart != -1;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name */
    public final TextRange m1462getCompositionMzsxiRA() {
        if (hasComposition()) {
            return TextRange.m6385boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name */
    public final long m1463getSelectiond9O1mEE() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getCursor() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final void setCursor(int i) {
        setSelection(i, i);
    }

    public final char get(int p0) {
        return this.gapBuffer.charAt(p0);
    }

    public final int getLength() {
        return this.gapBuffer.length();
    }

    private EditingBuffer(String str, long j) {
        this(new AnnotatedString(str, null, null, 6, null), j, (DefaultConstructorMarker) null);
    }

    public final void replace(int p0, int p1, CharSequence p2) {
        checkRange(p0, p1);
        int iMin = Math.min(p0, p1);
        int iMax = Math.max(p0, p1);
        int i = 0;
        int i2 = iMin;
        while (i2 < iMax && i < p2.length() && p2.charAt(i) == this.gapBuffer.charAt(i2)) {
            i++;
            i2++;
        }
        int length = p2.length();
        int i3 = iMax;
        while (i3 > iMin && length > i && p2.charAt(length - 1) == this.gapBuffer.charAt(i3 - 1)) {
            length--;
            i3--;
        }
        this.changeTracker.trackChange(i2, i3, length - i);
        PartialGapBuffer.replace$default(this.gapBuffer, iMin, iMax, p2, 0, 0, 24, null);
        setSelectionStart(p2.length() + iMin);
        setSelectionEnd(iMin + p2.length());
        this.compositionStart = -1;
        this.compositionEnd = -1;
        this.highlight = null;
    }

    public final void delete(int p0, int p1) {
        checkRange(p0, p1);
        long jTextRange = TextRangeKt.TextRange(p0, p1);
        this.changeTracker.trackChange(p0, p1, 0);
        PartialGapBuffer.replace$default(this.gapBuffer, TextRange.m6395getMinimpl(jTextRange), TextRange.m6394getMaximpl(jTextRange), "", 0, 0, 24, null);
        long jM1465updateRangeAfterDeletepWDy79M = EditingBufferKt.m1465updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m6397getStartimpl(jM1465updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m6392getEndimpl(jM1465updateRangeAfterDeletepWDy79M));
        if (hasComposition()) {
            long jM1465updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m1465updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m6391getCollapsedimpl(jM1465updateRangeAfterDeletepWDy79M2)) {
                commitComposition();
            } else {
                this.compositionStart = TextRange.m6395getMinimpl(jM1465updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m6394getMaximpl(jM1465updateRangeAfterDeletepWDy79M2);
            }
        }
        this.highlight = null;
    }

    public final void setSelection(int p0, int p1) {
        int iCoerceIn = RangesKt.coerceIn(p0, 0, getLength());
        int iCoerceIn2 = RangesKt.coerceIn(p1, 0, getLength());
        setSelectionStart(iCoerceIn);
        setSelectionEnd(iCoerceIn2);
    }

    /* JADX INFO: renamed from: setHighlight-K7f2yys, reason: not valid java name */
    public final void m1464setHighlightK7f2yys(int p0, int p1, int p2) {
        if (p1 >= p2) {
            StringBuilder sb = new StringBuilder("Do not set reversed or empty range: ");
            sb.append(p1);
            sb.append(" > ");
            sb.append(p2);
            throw new IllegalArgumentException(sb.toString());
        }
        this.highlight = new Pair<>(TextHighlightType.m1434boximpl(p0), TextRange.m6385boximpl(TextRangeKt.TextRange(RangesKt.coerceIn(p1, 0, getLength()), RangesKt.coerceIn(p2, 0, getLength()))));
    }

    public final void clearHighlight() {
        this.highlight = null;
    }

    public final void setComposition(int p0, int p1) {
        if (p0 < 0 || p0 > this.gapBuffer.length()) {
            StringBuilder sb = new StringBuilder("start (");
            sb.append(p0);
            sb.append(") offset is outside of text region ");
            sb.append(this.gapBuffer.length());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (p1 < 0 || p1 > this.gapBuffer.length()) {
            StringBuilder sb2 = new StringBuilder("end (");
            sb2.append(p1);
            sb2.append(") offset is outside of text region ");
            sb2.append(this.gapBuffer.length());
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (p0 >= p1) {
            StringBuilder sb3 = new StringBuilder("Do not set reversed or empty range: ");
            sb3.append(p0);
            sb3.append(" > ");
            sb3.append(p1);
            throw new IllegalArgumentException(sb3.toString());
        }
        this.compositionStart = p0;
        this.compositionEnd = p1;
    }

    public final void commitComposition() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final String toString() {
        return this.gapBuffer.toString();
    }

    public final AnnotatedString toAnnotatedString() {
        return new AnnotatedString(toString(), null, null, 6, null);
    }

    private final void checkRange(int p0, int p1) {
        if (p0 < 0 || p0 > this.gapBuffer.length()) {
            StringBuilder sb = new StringBuilder("start (");
            sb.append(p0);
            sb.append(") offset is outside of text region ");
            sb.append(this.gapBuffer.length());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (p1 < 0 || p1 > this.gapBuffer.length()) {
            StringBuilder sb2 = new StringBuilder("end (");
            sb2.append(p1);
            sb2.append(") offset is outside of text region ");
            sb2.append(this.gapBuffer.length());
            throw new IndexOutOfBoundsException(sb2.toString());
        }
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }

    public /* synthetic */ EditingBuffer(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }
}
