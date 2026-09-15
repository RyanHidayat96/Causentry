package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ChangeTracker;
import androidx.compose.foundation.text.input.internal.OffsetMappingCalculator;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001VB3\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0004\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00060\u0001j\u0002`\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b\r\u0010\u0010J-\u0010\r\u001a\u00060\u0001j\u0002`\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\r\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001dJ%\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J;\u0010\"\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020'H\u0002ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020\u0017¢\u0006\u0004\b+\u0010\u0019J\u0017\u0010,\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u000fH\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0017¢\u0006\u0004\b/\u00100J(\u00103\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020'2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010'H\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00058CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001a\u0010@\u001a\u00020<8GX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010\u0019\u001a\u0004\b=\u0010>R\u0011\u0010A\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0016\u0010F\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010J\u001a\u00020'8Gø\u0001\u0001¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010L\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\bK\u0010\u0014R\u001a\u0010M\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR'\u0010S\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020'8G@GX\u0086\u000eø\u0001\u0001¢\u0006\f\u001a\u0004\bQ\u0010I\"\u0004\bR\u0010)R\u0019\u0010T\u001a\u00020'8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bT\u0010U\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Ljava/lang/Appendable;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "p0", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "p1", "p2", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "p3", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/ChangeTracker;Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "", "append", "(C)Ljava/lang/Appendable;", "", "(Ljava/lang/CharSequence;)Ljava/lang/Appendable;", "", "(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;", "asCharSequence", "()Ljava/lang/CharSequence;", "charAt", "(I)C", "", "clearChangeList", "()V", "onTextWillChange", "(III)V", "placeCursorAfterCharAt", "(I)V", "placeCursorBeforeCharAt", "replace", "(IILjava/lang/CharSequence;)V", "p4", "replace$foundation_release", "(IILjava/lang/CharSequence;II)V", "", "requireValidIndex", "(IZZ)V", "Landroidx/compose/ui/text/TextRange;", "requireValidRange-5zc-tL8", "(J)V", "requireValidRange", "revertAllChanges", "setTextIfChanged$foundation_release", "(Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "toTextFieldCharSequence-udt6zUU$foundation_release", "(JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "toTextFieldCharSequence", "backingChangeTracker", "Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "buffer", "Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "getChangeTracker", "()Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "changeTracker", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "getChanges", "()Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "getChanges$annotations", "changes", "hasSelection", "()Z", "getLength", "()I", "length", "offsetMappingCalculator", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "getOriginalSelection-d9O1mEE", "()J", "originalSelection", "getOriginalText", "originalText", "originalValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getOriginalValue$foundation_release", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getSelection-d9O1mEE", "setSelection-5zc-tL8", "selection", "selectionInChars", "J", "ChangeList"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldBuffer implements Appendable {
    public static final int $stable = 8;
    private ChangeTracker backingChangeTracker;
    private final PartialGapBuffer buffer;
    private final OffsetMappingCalculator offsetMappingCalculator;
    private final TextFieldCharSequence originalValue;
    private long selectionInChars;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "", "", "p0", "Landroidx/compose/ui/text/TextRange;", "getOriginalRange--jx7JFs", "(I)J", "getOriginalRange", "getRange--jx7JFs", "getRange", "getChangeCount", "()I", "changeCount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ChangeList {
        int getChangeCount();

        /* JADX INFO: renamed from: getOriginalRange--jx7JFs, reason: not valid java name */
        long mo1426getOriginalRangejx7JFs(int p0);

        /* JADX INFO: renamed from: getRange--jx7JFs, reason: not valid java name */
        long mo1427getRangejx7JFs(int p0);
    }

    public static /* synthetic */ void getChanges$annotations() {
    }

    public TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator) {
        this.originalValue = textFieldCharSequence2;
        this.offsetMappingCalculator = offsetMappingCalculator;
        this.buffer = new PartialGapBuffer(textFieldCharSequence);
        this.backingChangeTracker = changeTracker != null ? new ChangeTracker(changeTracker) : null;
        this.selectionInChars = textFieldCharSequence.getSelection();
    }

    public /* synthetic */ TextFieldBuffer(TextFieldCharSequence textFieldCharSequence, ChangeTracker changeTracker, TextFieldCharSequence textFieldCharSequence2, OffsetMappingCalculator offsetMappingCalculator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldCharSequence, (i & 2) != 0 ? null : changeTracker, (i & 4) != 0 ? textFieldCharSequence : textFieldCharSequence2, (i & 8) != 0 ? null : offsetMappingCalculator);
    }

    /* JADX INFO: renamed from: getOriginalValue$foundation_release, reason: from getter */
    public final TextFieldCharSequence getOriginalValue() {
        return this.originalValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ChangeTracker getChangeTracker() {
        ChangeTracker changeTracker = this.backingChangeTracker;
        if (changeTracker != null) {
            return changeTracker;
        }
        ChangeTracker changeTracker2 = new ChangeTracker(null, 1, 0 == true ? 1 : 0);
        this.backingChangeTracker = changeTracker2;
        return changeTracker2;
    }

    public final int getLength() {
        return this.buffer.length();
    }

    public final CharSequence getOriginalText() {
        return this.originalValue.getText();
    }

    /* JADX INFO: renamed from: getOriginalSelection-d9O1mEE, reason: not valid java name */
    public final long m1422getOriginalSelectiond9O1mEE() {
        return this.originalValue.getSelection();
    }

    public final ChangeList getChanges() {
        return getChangeTracker();
    }

    public final boolean hasSelection() {
        return !TextRange.m6391getCollapsedimpl(getSelectionInChars());
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelectionInChars() {
        return this.selectionInChars;
    }

    /* JADX INFO: renamed from: setSelection-5zc-tL8, reason: not valid java name */
    public final void m1424setSelection5zctL8(long j) {
        m1420requireValidRange5zctL8(j);
        this.selectionInChars = j;
    }

    public final void replace(int p0, int p1, CharSequence p2) {
        replace$foundation_release(p0, p1, p2, 0, p2.length());
    }

    public static /* synthetic */ void replace$foundation_release$default(TextFieldBuffer textFieldBuffer, int i, int i2, CharSequence charSequence, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        textFieldBuffer.replace$foundation_release(i, i2, charSequence, i6, i4);
    }

    public final void replace$foundation_release(int p0, int p1, CharSequence p2, int p3, int p4) {
        if (p0 > p1) {
            StringBuilder sb = new StringBuilder("Expected start=");
            sb.append(p0);
            sb.append(" <= end=");
            sb.append(p1);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (p3 > p4) {
            StringBuilder sb2 = new StringBuilder("Expected textStart=");
            sb2.append(p3);
            sb2.append(" <= textEnd=");
            sb2.append(p4);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        onTextWillChange(p0, p1, p4 - p3);
        this.buffer.replace(p0, p1, p2, p3, p4);
    }

    public final void setTextIfChanged$foundation_release(CharSequence p0) {
        int i;
        int i2;
        int i3;
        int i4;
        PartialGapBuffer partialGapBuffer = this.buffer;
        int length = partialGapBuffer.length();
        int length2 = p0.length();
        int i5 = 0;
        if (partialGapBuffer.length() <= 0 || p0.length() <= 0) {
            i = length;
            i2 = length2;
            i3 = 0;
            i4 = 0;
        } else {
            boolean z = false;
            int i6 = 0;
            boolean z2 = false;
            while (true) {
                if (!z) {
                    if (partialGapBuffer.charAt(i5) == p0.charAt(i6)) {
                        i5++;
                        i6++;
                    } else {
                        z = true;
                    }
                }
                if (!z2) {
                    int i7 = length - 1;
                    int i8 = length2 - 1;
                    if (partialGapBuffer.charAt(i7) == p0.charAt(i8)) {
                        length = i7;
                        length2 = i8;
                    } else {
                        z2 = true;
                    }
                }
                if (i5 >= length || i6 >= length2 || (z && z2)) {
                    break;
                }
            }
            i = length;
            i2 = length2;
            i3 = i5;
            i4 = i6;
        }
        if (i3 < i || i4 < i2) {
            replace$foundation_release(i3, i, p0, i4, i2);
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence p0) {
        if (p0 != null) {
            onTextWillChange(getLength(), getLength(), p0.length());
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), p0, 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence p0, int p1, int p2) {
        if (p0 != null) {
            onTextWillChange(getLength(), getLength(), p2 - p1);
            PartialGapBuffer partialGapBuffer = this.buffer;
            PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), p0.subSequence(p1, p2), 0, 0, 24, null);
        }
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char p0) {
        onTextWillChange(getLength(), getLength(), 1);
        PartialGapBuffer partialGapBuffer = this.buffer;
        PartialGapBuffer.replace$default(partialGapBuffer, partialGapBuffer.length(), this.buffer.length(), String.valueOf(p0), 0, 0, 24, null);
        return this;
    }

    private final void onTextWillChange(int p0, int p1, int p2) {
        int i;
        getChangeTracker().trackChange(p0, p1, p2);
        OffsetMappingCalculator offsetMappingCalculator = this.offsetMappingCalculator;
        if (offsetMappingCalculator != null) {
            offsetMappingCalculator.recordEditOperation(p0, p1, p2);
        }
        int iMin = Math.min(p0, p1);
        int iMax = Math.max(p0, p1);
        int iM6395getMinimpl = TextRange.m6395getMinimpl(getSelectionInChars());
        int iM6394getMaximpl = TextRange.m6394getMaximpl(getSelectionInChars());
        if (iM6394getMaximpl < iMin) {
            return;
        }
        if (iM6395getMinimpl <= iMin && iMax <= iM6394getMaximpl) {
            i = p2 - (iMax - iMin);
            if (iM6395getMinimpl == iM6394getMaximpl) {
                iM6395getMinimpl += i;
            }
            iMin = iM6394getMaximpl + i;
        } else if (iM6395getMinimpl > iMin && iM6394getMaximpl < iMax) {
            iMin += p2;
            iM6395getMinimpl = iMin;
        } else if (iM6395getMinimpl >= iMax) {
            i = p2 - (iMax - iMin);
            iM6395getMinimpl += i;
            iMin = iM6394getMaximpl + i;
        } else if (iMin < iM6395getMinimpl) {
            iM6395getMinimpl = iMin + p2;
            i = p2 - (iMax - iMin);
            iMin = iM6394getMaximpl + i;
        }
        this.selectionInChars = TextRangeKt.TextRange(iM6395getMinimpl, iMin);
    }

    public final char charAt(int p0) {
        return this.buffer.charAt(p0);
    }

    public final String toString() {
        return this.buffer.toString();
    }

    public final CharSequence asCharSequence() {
        return this.buffer;
    }

    private final void clearChangeList() {
        getChangeTracker().clearChanges();
    }

    public final void revertAllChanges() {
        replace(0, getLength(), this.originalValue.toString());
        m1424setSelection5zctL8(this.originalValue.getSelection());
        clearChangeList();
    }

    public final void placeCursorBeforeCharAt(int p0) {
        requireValidIndex(p0, true, false);
        this.selectionInChars = TextRangeKt.TextRange(p0);
    }

    public final void placeCursorAfterCharAt(int p0) {
        requireValidIndex(p0, false, true);
        this.selectionInChars = TextRangeKt.TextRange(RangesKt.coerceAtMost(p0 + 1, getLength()));
    }

    /* JADX INFO: renamed from: toTextFieldCharSequence-udt6zUU$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ TextFieldCharSequence m1421toTextFieldCharSequenceudt6zUU$foundation_release$default(TextFieldBuffer textFieldBuffer, long j, TextRange textRange, int i, Object obj) {
        if ((i & 1) != 0) {
            j = textFieldBuffer.getSelectionInChars();
        }
        if ((i & 2) != 0) {
            textRange = null;
        }
        return textFieldBuffer.m1425toTextFieldCharSequenceudt6zUU$foundation_release(j, textRange);
    }

    /* JADX INFO: renamed from: toTextFieldCharSequence-udt6zUU$foundation_release, reason: not valid java name */
    public final TextFieldCharSequence m1425toTextFieldCharSequenceudt6zUU$foundation_release(long p0, TextRange p1) {
        return new TextFieldCharSequence(this.buffer.toString(), p0, p1, null, 8, null);
    }

    private final void requireValidIndex(int p0, boolean p1, boolean p2) {
        int i = p1 ? 0 : -1;
        int length = p2 ? getLength() : getLength() + 1;
        if (i > p0 || p0 >= length) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(p0);
            sb.append(" to be in [");
            sb.append(i);
            sb.append(", ");
            sb.append(length);
            sb.append(')');
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    /* JADX INFO: renamed from: requireValidRange-5zc-tL8, reason: not valid java name */
    private final void m1420requireValidRange5zctL8(long p0) {
        long jTextRange = TextRangeKt.TextRange(0, getLength());
        if (TextRange.m6387contains5zctL8(jTextRange, p0)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append((Object) TextRange.m6400toStringimpl(p0));
        sb.append(" to be in ");
        sb.append((Object) TextRange.m6400toStringimpl(jTextRange));
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
