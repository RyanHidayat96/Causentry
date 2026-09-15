package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\u000b\u001a!\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\n"}, d2 = {"", "Landroidx/compose/ui/text/TextRange;", "p0", "", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "substring", "", "p1", "TextRange", "(II)J", "(I)J", "coerceIn-8ffj60Q", "(JII)J", "coerceIn", "", "packWithCheck"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextRangeKt {
    /* JADX INFO: renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m6404substringFDrldGo(CharSequence charSequence, long j) {
        return charSequence.subSequence(TextRange.m6395getMinimpl(j), TextRange.m6394getMaximpl(j)).toString();
    }

    public static final long TextRange(int i, int i2) {
        return TextRange.m6386constructorimpl(packWithCheck(i, i2));
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }

    /* JADX INFO: renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m6403coerceIn8ffj60Q(long j, int i, int i2) {
        int iM6397getStartimpl = TextRange.m6397getStartimpl(j);
        if (iM6397getStartimpl < i) {
            iM6397getStartimpl = i;
        }
        if (iM6397getStartimpl > i2) {
            iM6397getStartimpl = i2;
        }
        int iM6392getEndimpl = TextRange.m6392getEndimpl(j);
        if (iM6392getEndimpl >= i) {
            i = iM6392getEndimpl;
        }
        if (i <= i2) {
            i2 = i;
        }
        return (iM6397getStartimpl == TextRange.m6397getStartimpl(j) && i2 == TextRange.m6392getEndimpl(j)) ? j : TextRange(iM6397getStartimpl, i2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("start and end cannot be negative. [start: ");
            sb.append(i);
            sb.append(", end: ");
            sb.append(i2);
            sb.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }
}
