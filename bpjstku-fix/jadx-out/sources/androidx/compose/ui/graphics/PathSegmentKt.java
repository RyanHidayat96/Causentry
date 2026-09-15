package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0001\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/PathSegment;", "DoneSegment", "Landroidx/compose/ui/graphics/PathSegment;", "getDoneSegment", "()Landroidx/compose/ui/graphics/PathSegment;", "CloseSegment", "getCloseSegment"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PathSegmentKt {
    private static final PathSegment DoneSegment = new PathSegment(PathSegment.Type.Done, new float[0], 0.0f);
    private static final PathSegment CloseSegment = new PathSegment(PathSegment.Type.Close, new float[0], 0.0f);

    public static final PathSegment getDoneSegment() {
        return DoneSegment;
    }

    public static final PathSegment getCloseSegment() {
        return CloseSegment;
    }
}
