package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0080\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R*\u0010$\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0001@CX\u0081\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010*\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0001@CX\u0081\u000e¢\u0006\u0012\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R$\u0010-\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'R$\u0010/\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'R\u0016\u00103\u001a\u0004\u0018\u00010\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R$\u00109\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8A@AX\u0080\u000e¢\u0006\f\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R\u0014\u0010;\u001a\u00020\r8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010'"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "Landroidx/compose/ui/text/AnnotatedString;", "p0", "Landroidx/compose/ui/text/TextRange;", "p1", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasComposition$ui_text", "()Z", "", "", "get$ui_text", "(I)C", "p2", "", "replace$ui_text", "(IILandroidx/compose/ui/text/AnnotatedString;)V", "(IILjava/lang/String;)V", "delete$ui_text", "(II)V", "setSelection$ui_text", "setComposition$ui_text", "cancelComposition$ui_text", "()V", "commitComposition$ui_text", "toString", "()Ljava/lang/String;", "toAnnotatedString$ui_text", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "selectionStart", "I", "getSelectionStart$ui_text", "()I", "setSelectionStart", "(I)V", "selectionEnd", "getSelectionEnd$ui_text", "setSelectionEnd", "compositionStart", "getCompositionStart$ui_text", "compositionEnd", "getCompositionEnd$ui_text", "getComposition-MzsxiRA$ui_text", "()Landroidx/compose/ui/text/TextRange;", "composition", "getSelection-d9O1mEE$ui_text", "()J", "selection", "getCursor$ui_text", "setCursor$ui_text", "cursor", "getLength$ui_text", "length", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EditingBuffer {
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;
    public static final int $stable = 8;

    private EditingBuffer(AnnotatedString annotatedString, long j) {
        this.gapBuffer = new PartialGapBuffer(annotatedString.getText());
        this.selectionStart = TextRange.m6395getMinimpl(j);
        this.selectionEnd = TextRange.m6394getMaximpl(j);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int iM6395getMinimpl = TextRange.m6395getMinimpl(j);
        int iM6394getMaximpl = TextRange.m6394getMaximpl(j);
        if (iM6395getMinimpl < 0 || iM6395getMinimpl > annotatedString.length()) {
            StringBuilder sb = new StringBuilder("start (");
            sb.append(iM6395getMinimpl);
            sb.append(") offset is outside of text region ");
            sb.append(annotatedString.length());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (iM6394getMaximpl < 0 || iM6394getMaximpl > annotatedString.length()) {
            StringBuilder sb2 = new StringBuilder("end (");
            sb2.append(iM6394getMaximpl);
            sb2.append(") offset is outside of text region ");
            sb2.append(annotatedString.length());
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (iM6395getMinimpl <= iM6394getMaximpl) {
            return;
        }
        StringBuilder sb3 = new StringBuilder("Do not set reversed range: ");
        sb3.append(iM6395getMinimpl);
        sb3.append(" > ");
        sb3.append(iM6394getMaximpl);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* JADX INFO: renamed from: getSelectionStart$ui_text, reason: from getter */
    public final int getSelectionStart() {
        return this.selectionStart;
    }

    private final void setSelectionStart(int i) {
        if (i < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionStart to a negative value: ".concat(String.valueOf(i)));
        }
        this.selectionStart = i;
    }

    /* JADX INFO: renamed from: getSelectionEnd$ui_text, reason: from getter */
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }

    private final void setSelectionEnd(int i) {
        if (i < 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot set selectionEnd to a negative value: ".concat(String.valueOf(i)));
        }
        this.selectionEnd = i;
    }

    /* JADX INFO: renamed from: getCompositionStart$ui_text, reason: from getter */
    public final int getCompositionStart() {
        return this.compositionStart;
    }

    /* JADX INFO: renamed from: getCompositionEnd$ui_text, reason: from getter */
    public final int getCompositionEnd() {
        return this.compositionEnd;
    }

    public final boolean hasComposition$ui_text() {
        return this.compositionStart != -1;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA$ui_text, reason: not valid java name */
    public final TextRange m6560getCompositionMzsxiRA$ui_text() {
        if (hasComposition$ui_text()) {
            return TextRange.m6385boximpl(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd));
        }
        return null;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE$ui_text, reason: not valid java name */
    public final long m6561getSelectiond9O1mEE$ui_text() {
        return TextRangeKt.TextRange(this.selectionStart, this.selectionEnd);
    }

    public final int getCursor$ui_text() {
        int i = this.selectionStart;
        int i2 = this.selectionEnd;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final void setCursor$ui_text(int i) {
        setSelection$ui_text(i, i);
    }

    public final char get$ui_text(int p0) {
        return this.gapBuffer.get(p0);
    }

    public final int getLength$ui_text() {
        return this.gapBuffer.getLength();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EditingBuffer(String str, long j) {
        this(new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), j, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public final void replace$ui_text(int p0, int p1, AnnotatedString p2) {
        replace$ui_text(p0, p1, p2.getText());
    }

    public final void replace$ui_text(int p0, int p1, String p2) {
        if (p0 < 0 || p0 > this.gapBuffer.getLength()) {
            StringBuilder sb = new StringBuilder("start (");
            sb.append(p0);
            sb.append(") offset is outside of text region ");
            sb.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (p1 < 0 || p1 > this.gapBuffer.getLength()) {
            StringBuilder sb2 = new StringBuilder("end (");
            sb2.append(p1);
            sb2.append(") offset is outside of text region ");
            sb2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (p0 > p1) {
            StringBuilder sb3 = new StringBuilder("Do not set reversed range: ");
            sb3.append(p0);
            sb3.append(" > ");
            sb3.append(p1);
            throw new IllegalArgumentException(sb3.toString());
        }
        this.gapBuffer.replace(p0, p1, p2);
        setSelectionStart(p2.length() + p0);
        setSelectionEnd(p0 + p2.length());
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text(int p0, int p1) {
        long jTextRange = TextRangeKt.TextRange(p0, p1);
        this.gapBuffer.replace(p0, p1, "");
        long jM6562updateRangeAfterDeletepWDy79M = EditingBufferKt.m6562updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), jTextRange);
        setSelectionStart(TextRange.m6395getMinimpl(jM6562updateRangeAfterDeletepWDy79M));
        setSelectionEnd(TextRange.m6394getMaximpl(jM6562updateRangeAfterDeletepWDy79M));
        if (hasComposition$ui_text()) {
            long jM6562updateRangeAfterDeletepWDy79M2 = EditingBufferKt.m6562updateRangeAfterDeletepWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), jTextRange);
            if (TextRange.m6391getCollapsedimpl(jM6562updateRangeAfterDeletepWDy79M2)) {
                commitComposition$ui_text();
            } else {
                this.compositionStart = TextRange.m6395getMinimpl(jM6562updateRangeAfterDeletepWDy79M2);
                this.compositionEnd = TextRange.m6394getMaximpl(jM6562updateRangeAfterDeletepWDy79M2);
            }
        }
    }

    public final void setSelection$ui_text(int p0, int p1) {
        if (p0 < 0 || p0 > this.gapBuffer.getLength()) {
            StringBuilder sb = new StringBuilder("start (");
            sb.append(p0);
            sb.append(") offset is outside of text region ");
            sb.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (p1 < 0 || p1 > this.gapBuffer.getLength()) {
            StringBuilder sb2 = new StringBuilder("end (");
            sb2.append(p1);
            sb2.append(") offset is outside of text region ");
            sb2.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (p0 > p1) {
            StringBuilder sb3 = new StringBuilder("Do not set reversed range: ");
            sb3.append(p0);
            sb3.append(" > ");
            sb3.append(p1);
            throw new IllegalArgumentException(sb3.toString());
        }
        setSelectionStart(p0);
        setSelectionEnd(p1);
    }

    public final void setComposition$ui_text(int p0, int p1) {
        if (p0 < 0 || p0 > this.gapBuffer.getLength()) {
            StringBuilder sb = new StringBuilder("start (");
            sb.append(p0);
            sb.append(") offset is outside of text region ");
            sb.append(this.gapBuffer.getLength());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (p1 < 0 || p1 > this.gapBuffer.getLength()) {
            StringBuilder sb2 = new StringBuilder("end (");
            sb2.append(p1);
            sb2.append(") offset is outside of text region ");
            sb2.append(this.gapBuffer.getLength());
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

    public final void cancelComposition$ui_text() {
        replace$ui_text(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final String toString() {
        return this.gapBuffer.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnnotatedString toAnnotatedString$ui_text() {
        return new AnnotatedString(toString(), null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ EditingBuffer(AnnotatedString annotatedString, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j);
    }

    public /* synthetic */ EditingBuffer(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j);
    }
}
