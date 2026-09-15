package androidx.compose.foundation.text;

import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutMeasureScope;", "", "<init>", "()V", "", "p0", "p1", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "p2", "Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;", "layout", "(IILkotlin/jvm/functions/Function0;)Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextRangeLayoutMeasureScope {
    public static final int $stable = 0;

    public final TextRangeLayoutMeasureResult layout(int p0, int p1, Function0<IntOffset> p2) {
        return new TextRangeLayoutMeasureResult(p0, p1, p2);
    }
}
