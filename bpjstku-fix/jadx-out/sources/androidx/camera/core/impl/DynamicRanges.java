package androidx.camera.core.impl;

import androidx.camera.core.DynamicRange;
import androidx.core.util.Preconditions;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ%\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\tJ1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/core/impl/DynamicRanges;", "", "<init>", "()V", "Landroidx/camera/core/DynamicRange;", "p0", "p1", "", "canMatchBitDepth", "(Landroidx/camera/core/DynamicRange;Landroidx/camera/core/DynamicRange;)Z", "canMatchEncoding", "", "canResolve", "(Landroidx/camera/core/DynamicRange;Ljava/util/Set;)Z", "canResolveUnderSpecifiedTo", "findAllPossibleMatches", "(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DynamicRanges {
    public static final DynamicRanges INSTANCE = new DynamicRanges();

    private DynamicRanges() {
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[RETURN] */
    @JvmStatic
    public static final boolean canResolve(DynamicRange p0, Set<DynamicRange> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0.isFullySpecified()) {
            return p1.contains(p0);
        }
        for (Object obj : p1) {
            if (INSTANCE.canResolveUnderSpecifiedTo(p0, (DynamicRange) obj)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final Set<DynamicRange> findAllPossibleMatches(Set<DynamicRange> p0, Set<DynamicRange> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0.isEmpty()) {
            throw new IllegalArgumentException("Candidate dynamic range set must contain at least 1 candidate dynamic range.");
        }
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (DynamicRange dynamicRange : p0) {
            if (dynamicRange.isFullySpecified()) {
                if (p1.contains(dynamicRange)) {
                    setCreateSetBuilder.add(dynamicRange);
                }
            } else {
                for (DynamicRange dynamicRange2 : p1) {
                    if (INSTANCE.canResolveUnderSpecifiedTo(dynamicRange, dynamicRange2)) {
                        setCreateSetBuilder.add(dynamicRange2);
                    }
                }
            }
        }
        return SetsKt.build(setCreateSetBuilder);
    }

    private final boolean canResolveUnderSpecifiedTo(DynamicRange p0, DynamicRange p1) {
        return canMatchBitDepth(p0, p1) && canMatchEncoding(p0, p1);
    }

    private final boolean canMatchBitDepth(DynamicRange p0, DynamicRange p1) {
        Preconditions.checkState(p1.isFullySpecified(), "Fully specified range is not actually fully specified.");
        return p0.getBitDepth() == 0 || p0.getBitDepth() == p1.getBitDepth();
    }

    private final boolean canMatchEncoding(DynamicRange p0, DynamicRange p1) {
        Preconditions.checkState(p1.isFullySpecified(), "Fully specified range is not actually fully specified.");
        int encoding = p0.getEncoding();
        if (encoding == 0) {
            return true;
        }
        int encoding2 = p1.getEncoding();
        return (encoding == 2 && encoding2 != 1) || encoding == encoding2;
    }
}
