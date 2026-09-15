package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\n\u0010\tJ'\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00112\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000e2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0001¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "<init>", "()V", "", "p0", "p1", "", "checkElementIndex$runtime", "(II)V", "checkPositionIndex$runtime", "p2", "checkRangeIndexes$runtime", "(III)V", "", "orderedHashCode$runtime", "(Ljava/util/Collection;)I", "", "orderedEquals$runtime", "(Ljava/util/Collection;Ljava/util/Collection;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ListImplementation {
    public static final int $stable = 0;
    public static final ListImplementation INSTANCE = new ListImplementation();

    private ListImplementation() {
    }

    @JvmStatic
    public static final void checkElementIndex$runtime(int p0, int p1) {
        if (p0 < 0 || p0 >= p1) {
            StringBuilder sb = new StringBuilder("index: ");
            sb.append(p0);
            sb.append(", size: ");
            sb.append(p1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    @JvmStatic
    public static final void checkPositionIndex$runtime(int p0, int p1) {
        if (p0 < 0 || p0 > p1) {
            StringBuilder sb = new StringBuilder("index: ");
            sb.append(p0);
            sb.append(", size: ");
            sb.append(p1);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    @JvmStatic
    public static final void checkRangeIndexes$runtime(int p0, int p1, int p2) {
        if (p0 < 0 || p1 > p2) {
            StringBuilder sb = new StringBuilder("fromIndex: ");
            sb.append(p0);
            sb.append(", toIndex: ");
            sb.append(p1);
            sb.append(", size: ");
            sb.append(p2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (p0 <= p1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("fromIndex: ");
        sb2.append(p0);
        sb2.append(" > toIndex: ");
        sb2.append(p1);
        throw new IllegalArgumentException(sb2.toString());
    }

    @JvmStatic
    public static final int orderedHashCode$runtime(Collection<?> p0) {
        Iterator<?> it = p0.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    @JvmStatic
    public static final boolean orderedEquals$runtime(Collection<?> p0, Collection<?> p1) {
        if (p0.size() != p1.size()) {
            return false;
        }
        Iterator<?> it = p1.iterator();
        Iterator<?> it2 = p0.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.areEqual(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }
}
