package androidx.compose.foundation.text;

import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r"}, d2 = {"Landroidx/compose/foundation/text/TextRangeLayoutMeasureResult;", "", "", "p0", "p1", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "p2", "<init>", "(IILkotlin/jvm/functions/Function0;)V", "height", "I", "getHeight", "()I", "place", "Lkotlin/jvm/functions/Function0;", "getPlace", "()Lkotlin/jvm/functions/Function0;", "width", "getWidth"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextRangeLayoutMeasureResult {
    public static final int $stable = 0;
    private final int height;
    private final Function0<IntOffset> place;
    private final int width;

    public TextRangeLayoutMeasureResult(int i, int i2, Function0<IntOffset> function0) {
        this.width = i;
        this.height = i2;
        this.place = function0;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final Function0<IntOffset> getPlace() {
        return this.place;
    }
}
