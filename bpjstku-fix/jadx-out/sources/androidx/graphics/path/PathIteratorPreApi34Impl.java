package androidx.graphics.path;

import android.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u000eH\u0082 ¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u000eH\u0083 ¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000bH\u0083 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0083 ¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0083 ¢\u0006\u0004\b\u001f\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000eH\u0083 ¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0017¢\u0006\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'"}, d2 = {"Landroidx/graphics/path/PathIteratorPreApi34Impl;", "Landroidx/graphics/path/PathIteratorImpl;", "Landroid/graphics/Path;", "p0", "Landroidx/graphics/path/PathIterator$ConicEvaluation;", "p1", "", "p2", "<init>", "(Landroid/graphics/Path;Landroidx/graphics/path/PathIterator$ConicEvaluation;F)V", "", "", "calculateSize", "(Z)I", "", "createInternalPathIterator", "(Landroid/graphics/Path;IF)J", "", "destroyInternalPathIterator", "(J)V", "finalize", "()V", "hasNext", "()Z", "internalPathIteratorHasNext", "(J)Z", "", "internalPathIteratorNext", "(J[FI)I", "internalPathIteratorPeek", "(J)I", "internalPathIteratorRawSize", "internalPathIteratorSize", "Landroidx/graphics/path/PathSegment$Type;", "next", "([FI)Landroidx/graphics/path/PathSegment$Type;", "peek", "()Landroidx/graphics/path/PathSegment$Type;", "internalPathIterator", "J"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathIteratorPreApi34Impl extends PathIteratorImpl {
    private final long internalPathIterator;

    private final native long createInternalPathIterator(Path p0, int p1, float p2);

    private final native void destroyInternalPathIterator(long p0);

    private final native boolean internalPathIteratorHasNext(long p0);

    private final native int internalPathIteratorNext(long p0, float[] p1, int p2);

    private final native int internalPathIteratorPeek(long p0);

    private final native int internalPathIteratorRawSize(long p0);

    private final native int internalPathIteratorSize(long p0);

    public /* synthetic */ PathIteratorPreApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(path, (i & 2) != 0 ? PathIterator.ConicEvaluation.AsQuadratics : conicEvaluation, (i & 4) != 0 ? 0.25f : f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathIteratorPreApi34Impl(Path path, PathIterator.ConicEvaluation conicEvaluation, float f) {
        super(path, conicEvaluation, f);
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(conicEvaluation, "");
        this.internalPathIterator = createInternalPathIterator(path, conicEvaluation.ordinal(), f);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final int calculateSize(boolean p0) {
        if (!p0 || getConicEvaluation() == PathIterator.ConicEvaluation.AsConic) {
            return internalPathIteratorRawSize(this.internalPathIterator);
        }
        return internalPathIteratorSize(this.internalPathIterator);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final boolean hasNext() {
        return internalPathIteratorHasNext(this.internalPathIterator);
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final PathSegment.Type peek() {
        return PathIteratorImplKt.PathSegmentTypes[internalPathIteratorPeek(this.internalPathIterator)];
    }

    @Override // androidx.graphics.path.PathIteratorImpl
    public final PathSegment.Type next(float[] p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return PathIteratorImplKt.PathSegmentTypes[internalPathIteratorNext(this.internalPathIterator, p0, p1)];
    }

    protected final void finalize() {
        destroyInternalPathIterator(this.internalPathIterator);
    }
}
