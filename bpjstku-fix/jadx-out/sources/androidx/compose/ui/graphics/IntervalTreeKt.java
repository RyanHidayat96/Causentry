package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\"\"\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0083T¢\u0006\u0006\n\u0004\b\t\u0010\b*\f\b\u0002\u0010\n\"\u00020\u00062\u00020\u0006"}, d2 = {"Landroidx/compose/ui/graphics/Interval;", "", "EmptyInterval", "Landroidx/compose/ui/graphics/Interval;", "getEmptyInterval", "()Landroidx/compose/ui/graphics/Interval;", "", "TreeColorRed", "I", "TreeColorBlack", "TreeColor"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntervalTreeKt {
    private static final Interval<Object> EmptyInterval = new Interval<>(Float.MAX_VALUE, Float.MIN_VALUE, null);
    private static final int TreeColorBlack = 1;
    private static final int TreeColorRed = 0;

    public static final Interval<Object> getEmptyInterval() {
        return EmptyInterval;
    }
}
