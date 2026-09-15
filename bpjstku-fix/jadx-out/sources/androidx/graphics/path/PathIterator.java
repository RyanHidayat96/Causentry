package androidx.graphics.path;

import android.graphics.Path;
import android.os.Build;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002H\u0097\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00132\b\b\u0002\u0010\u0006\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/graphics/path/PathIterator;", "", "Landroidx/graphics/path/PathSegment;", "Landroid/graphics/Path;", "p0", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "p1", "", "p2", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "", "calculateSize", "(Z)I", "hasNext", "()Z", "next", "()Landroidx/graphics/path/PathSegment;", "", "Landroidx/graphics/path/PathSegment$Type;", "([FI)Landroidx/graphics/path/PathSegment$Type;", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "conicEvaluation", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/graphics/path/PathIterator$ConicEvaluation;", "Landroidx/graphics/path/PathIteratorImpl;", "implementation", "Landroidx/graphics/path/PathIteratorImpl;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "tolerance", "F", "getTolerance", "()F", "ConicEvaluation"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathIterator implements Iterator<PathSegment>, KMappedMarker {
    private final ConicEvaluation conicEvaluation;
    private final PathIteratorImpl implementation;
    private final Path path;
    private final float tolerance;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/graphics/path/PathIterator$ConicEvaluation;", "", "<init>", "(Ljava/lang/String;I)V", "AsConic", "AsQuadratics"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ConicEvaluation {
        AsConic,
        AsQuadratics
    }

    public PathIterator(Path path, ConicEvaluation conicEvaluation, float f) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(conicEvaluation, "");
        this.path = path;
        this.conicEvaluation = conicEvaluation;
        this.tolerance = f;
        this.implementation = Build.VERSION.SDK_INT >= 34 ? new PathIteratorApi34Impl(path, conicEvaluation, f) : new PathIteratorPreApi34Impl(path, conicEvaluation, f);
    }

    public final Path getPath() {
        return this.path;
    }

    public /* synthetic */ PathIterator(Path path, ConicEvaluation conicEvaluation, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i & 2) != 0 ? ConicEvaluation.AsQuadratics : conicEvaluation, (i & 4) != 0 ? 0.25f : f);
    }

    public final ConicEvaluation getConicEvaluation() {
        return this.conicEvaluation;
    }

    public final float getTolerance() {
        return this.tolerance;
    }

    public static /* synthetic */ int calculateSize$default(PathIterator pathIterator, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return pathIterator.calculateSize(z);
    }

    public final int calculateSize(boolean p0) {
        return this.implementation.calculateSize(p0);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.implementation.hasNext();
    }

    public final PathSegment.Type peek() {
        return this.implementation.peek();
    }

    public static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return pathIterator.next(fArr, i);
    }

    public final PathSegment.Type next(float[] p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.implementation.next(p0, p1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final PathSegment next() {
        return this.implementation.next();
    }

    public final PathSegment.Type next(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        return next$default(this, fArr, 0, 2, null);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
