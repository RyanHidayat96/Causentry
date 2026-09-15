package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "p0", "p1", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "updateRangeAfterDelete"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class EditingBufferKt {
    /* JADX INFO: renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m6562updateRangeAfterDeletepWDy79M(long j, long j2) {
        int iM6393getLengthimpl;
        int iM6395getMinimpl = TextRange.m6395getMinimpl(j);
        int iM6394getMaximpl = TextRange.m6394getMaximpl(j);
        if (TextRange.m6399intersects5zctL8(j2, j)) {
            if (TextRange.m6387contains5zctL8(j2, j)) {
                iM6395getMinimpl = TextRange.m6395getMinimpl(j2);
                iM6394getMaximpl = iM6395getMinimpl;
            } else {
                if (TextRange.m6387contains5zctL8(j, j2)) {
                    iM6393getLengthimpl = TextRange.m6393getLengthimpl(j2);
                } else if (TextRange.m6388containsimpl(j2, iM6395getMinimpl)) {
                    iM6395getMinimpl = TextRange.m6395getMinimpl(j2);
                    iM6393getLengthimpl = TextRange.m6393getLengthimpl(j2);
                } else {
                    iM6394getMaximpl = TextRange.m6395getMinimpl(j2);
                }
                iM6394getMaximpl -= iM6393getLengthimpl;
            }
        } else if (iM6394getMaximpl > TextRange.m6395getMinimpl(j2)) {
            iM6395getMinimpl -= TextRange.m6393getLengthimpl(j2);
            iM6393getLengthimpl = TextRange.m6393getLengthimpl(j2);
            iM6394getMaximpl -= iM6393getLengthimpl;
        }
        return TextRangeKt.TextRange(iM6395getMinimpl, iM6394getMaximpl);
    }
}
