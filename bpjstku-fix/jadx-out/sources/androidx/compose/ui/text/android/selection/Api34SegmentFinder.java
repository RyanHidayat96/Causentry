package androidx.compose.ui.text.android.selection;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;", "", "<init>", "()V", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "Landroid/text/SegmentFinder;", "toAndroidSegmentFinder$ui_text", "(Landroidx/compose/ui/text/android/selection/SegmentFinder;)Landroid/text/SegmentFinder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Api34SegmentFinder {
    public static final int $stable = 0;
    public static final Api34SegmentFinder INSTANCE = new Api34SegmentFinder();

    private Api34SegmentFinder() {
    }

    public final android.text.SegmentFinder toAndroidSegmentFinder$ui_text(final SegmentFinder segmentFinder) {
        return new android.text.SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            @Override // android.text.SegmentFinder
            public final int previousStartBoundary(int p0) {
                return segmentFinder.previousStartBoundary(p0);
            }

            @Override // android.text.SegmentFinder
            public final int previousEndBoundary(int p0) {
                return segmentFinder.previousEndBoundary(p0);
            }

            @Override // android.text.SegmentFinder
            public final int nextStartBoundary(int p0) {
                return segmentFinder.nextStartBoundary(p0);
            }

            @Override // android.text.SegmentFinder
            public final int nextEndBoundary(int p0) {
                return segmentFinder.nextEndBoundary(p0);
            }
        };
    }
}
