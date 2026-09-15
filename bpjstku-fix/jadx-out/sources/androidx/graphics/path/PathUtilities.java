package androidx.graphics.path;

import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0002\u0010\b"}, d2 = {"Landroid/graphics/Path;", "Landroidx/graphics/path/PathIterator;", "iterator", "(Landroid/graphics/Path;)Landroidx/graphics/path/PathIterator;", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "p0", "", "p1", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)Landroidx/graphics/path/PathIterator;"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PathUtilities {
    public static final PathIterator iterator(Path path) {
        Intrinsics.checkNotNullParameter(path, "");
        return new PathIterator(path, null, 0.0f, 6, null);
    }

    public static /* synthetic */ PathIterator iterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.25f;
        }
        return iterator(path, conicEvaluation, f);
    }

    public static final PathIterator iterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(conicEvaluation, "");
        return new PathIterator(path, conicEvaluation, f);
    }
}
