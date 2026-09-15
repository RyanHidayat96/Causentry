package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00038CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"", "DefaultCacheSize", "I", "Landroidx/compose/ui/text/style/TextOverflow;", "", "isEllipsis-MW5-ApA", "(I)Z", "isEllipsis"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextMeasurerKt {
    private static final int DefaultCacheSize = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m6375isEllipsisMW5ApA(int i) {
        return TextOverflow.m6861equalsimpl0(i, TextOverflow.INSTANCE.m6871getEllipsisgIe3tQ8()) || TextOverflow.m6861equalsimpl0(i, TextOverflow.INSTANCE.m6873getStartEllipsisgIe3tQ8()) || TextOverflow.m6861equalsimpl0(i, TextOverflow.INSTANCE.m6872getMiddleEllipsisgIe3tQ8());
    }
}
