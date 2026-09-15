package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.ToCharArray_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00038\u0007ø\u0001\u0000¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0016R\u001d\u0010,\u001a\u00020\u00038\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "", "p0", "Landroidx/compose/ui/text/TextRange;", "p1", "p2", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/input/TextHighlightType;", "p3", "<init>", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/text/TextRange;Lkotlin/Pair;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "contentEquals", "(Ljava/lang/CharSequence;)Z", "", "equals", "(Ljava/lang/Object;)Z", "", "", "get", "(I)C", "hashCode", "()I", "shouldShowSelection", "()Z", "subSequence", "(II)Ljava/lang/CharSequence;", "", "", "toCharArray", "([CIII)V", "", "toString", "()Ljava/lang/String;", "composition", "Landroidx/compose/ui/text/TextRange;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "highlight", "Lkotlin/Pair;", "getHighlight", "()Lkotlin/Pair;", "getLength", "length", "selection", "J", "getSelection-d9O1mEE", "()J", "text", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldCharSequence implements CharSequence {
    public static final int $stable = 8;
    private final TextRange composition;
    private final Pair<TextHighlightType, TextRange> highlight;
    private final long selection;
    private final CharSequence text;

    private TextFieldCharSequence(CharSequence charSequence, long j, TextRange textRange, Pair<TextHighlightType, TextRange> pair) {
        this.text = charSequence instanceof TextFieldCharSequence ? ((TextFieldCharSequence) charSequence).text : charSequence;
        this.selection = TextRangeKt.m6403coerceIn8ffj60Q(j, 0, charSequence.length());
        this.composition = textRange != null ? TextRange.m6385boximpl(TextRangeKt.m6403coerceIn8ffj60Q(textRange.getPackedValue(), 0, charSequence.length())) : null;
        this.highlight = pair != null ? Pair.copy$default(pair, null, TextRange.m6385boximpl(TextRangeKt.m6403coerceIn8ffj60Q(pair.getSecond().getPackedValue(), 0, charSequence.length())), 1, null) : null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getLength();
    }

    public /* synthetic */ TextFieldCharSequence(String str, long j, TextRange textRange, Pair pair, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? TextRange.INSTANCE.m6402getZerod9O1mEE() : j, (i & 4) != 0 ? null : textRange, (i & 8) != 0 ? null : pair, null);
    }

    public final int getLength() {
        return this.text.length();
    }

    public final CharSequence getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: getSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getSelection() {
        return this.selection;
    }

    /* JADX INFO: renamed from: getComposition-MzsxiRA, reason: not valid java name and from getter */
    public final TextRange getComposition() {
        return this.composition;
    }

    public final Pair<TextHighlightType, TextRange> getHighlight() {
        return this.highlight;
    }

    public final char get(int p0) {
        return this.text.charAt(p0);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int p0, int p1) {
        return this.text.subSequence(p0, p1);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.text.toString();
    }

    public final boolean contentEquals(CharSequence p0) {
        return StringsKt.contentEquals(this.text, p0);
    }

    public final void toCharArray(char[] p0, int p1, int p2, int p3) {
        ToCharArray_androidKt.toCharArray(this.text, p0, p1, p2, p3);
    }

    public final boolean shouldShowSelection() {
        return this.highlight == null;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass()) {
            return false;
        }
        TextFieldCharSequence textFieldCharSequence = (TextFieldCharSequence) p0;
        return TextRange.m6390equalsimpl0(this.selection, textFieldCharSequence.selection) && Intrinsics.areEqual(this.composition, textFieldCharSequence.composition) && Intrinsics.areEqual(this.highlight, textFieldCharSequence.highlight) && contentEquals(textFieldCharSequence.text);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode();
        int iM6398hashCodeimpl = TextRange.m6398hashCodeimpl(this.selection);
        TextRange textRange = this.composition;
        int iM6398hashCodeimpl2 = textRange != null ? TextRange.m6398hashCodeimpl(textRange.getPackedValue()) : 0;
        Pair<TextHighlightType, TextRange> pair = this.highlight;
        return (((((iHashCode * 31) + iM6398hashCodeimpl) * 31) + iM6398hashCodeimpl2) * 31) + (pair != null ? pair.hashCode() : 0);
    }

    public /* synthetic */ TextFieldCharSequence(CharSequence charSequence, long j, TextRange textRange, Pair pair, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, j, textRange, pair);
    }
}
