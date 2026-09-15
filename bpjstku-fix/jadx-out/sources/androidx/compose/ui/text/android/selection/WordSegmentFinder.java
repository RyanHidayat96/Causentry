package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordSegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "", "p0", "Landroidx/compose/ui/text/android/selection/WordIterator;", "p1", "<init>", "(Ljava/lang/CharSequence;Landroidx/compose/ui/text/android/selection/WordIterator;)V", "", "previousStartBoundary", "(I)I", "previousEndBoundary", "nextStartBoundary", "nextEndBoundary", "text", "Ljava/lang/CharSequence;", "wordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WordSegmentFinder implements SegmentFinder {
    public static final int $stable = 8;
    private final CharSequence text;
    private final WordIterator wordIterator;

    public WordSegmentFinder(CharSequence charSequence, WordIterator wordIterator) {
        this.text = charSequence;
        this.wordIterator = wordIterator;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int previousStartBoundary(int p0) {
        do {
            p0 = this.wordIterator.prevBoundary(p0);
            if (p0 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(p0)));
        return p0;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int previousEndBoundary(int p0) {
        do {
            p0 = this.wordIterator.prevBoundary(p0);
            if (p0 == -1 || p0 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(p0 - 1)));
        return p0;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int nextStartBoundary(int p0) {
        do {
            p0 = this.wordIterator.nextBoundary(p0);
            if (p0 == -1 || p0 == this.text.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(p0)));
        return p0;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int nextEndBoundary(int p0) {
        do {
            p0 = this.wordIterator.nextBoundary(p0);
            if (p0 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(p0 - 1)));
        return p0;
    }
}
