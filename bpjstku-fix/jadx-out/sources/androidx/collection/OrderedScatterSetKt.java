package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\b\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\f\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u000e\u001a\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0003\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0011\u001a3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0012\u001a/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r\"\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0013\"\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {ExifInterface.LONGITUDE_EAST, "Landroidx/collection/OrderedScatterSet;", "emptyOrderedScatterSet", "()Landroidx/collection/OrderedScatterSet;", "Landroidx/collection/MutableOrderedScatterSet;", "mutableOrderedScatterSetOf", "()Landroidx/collection/MutableOrderedScatterSet;", "p0", "(Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "p1", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "", "([Ljava/lang/Object;)Landroidx/collection/MutableOrderedScatterSet;", "orderedScatterSetOf", "(Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "([Ljava/lang/Object;)Landroidx/collection/OrderedScatterSet;", "", "EmptyOrderedScatterSet", "Landroidx/collection/MutableOrderedScatterSet;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OrderedScatterSetKt {
    private static final MutableOrderedScatterSet<Object> EmptyOrderedScatterSet = new MutableOrderedScatterSet<>(0);

    public static final <E> OrderedScatterSet<E> emptyOrderedScatterSet() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        Intrinsics.checkNotNull(mutableOrderedScatterSet, "");
        return mutableOrderedScatterSet;
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf() {
        MutableOrderedScatterSet<Object> mutableOrderedScatterSet = EmptyOrderedScatterSet;
        Intrinsics.checkNotNull(mutableOrderedScatterSet, "");
        return mutableOrderedScatterSet;
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e2) {
        return mutableOrderedScatterSetOf(e2);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e2, E e3) {
        return mutableOrderedScatterSetOf(e2, e3);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E e2, E e3, E e4) {
        return mutableOrderedScatterSetOf(e2, e3, e4);
    }

    public static final <E> OrderedScatterSet<E> orderedScatterSetOf(E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "");
        MutableOrderedScatterSet mutableOrderedScatterSet = new MutableOrderedScatterSet(eArr.length);
        mutableOrderedScatterSet.plusAssign((Object[]) eArr);
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf() {
        return new MutableOrderedScatterSet<>(0, 1, null);
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e2) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(1);
        mutableOrderedScatterSet.plusAssign(e2);
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e2, E e3) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(2);
        mutableOrderedScatterSet.plusAssign(e2);
        mutableOrderedScatterSet.plusAssign(e3);
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E e2, E e3, E e4) {
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(3);
        mutableOrderedScatterSet.plusAssign(e2);
        mutableOrderedScatterSet.plusAssign(e3);
        mutableOrderedScatterSet.plusAssign(e4);
        return mutableOrderedScatterSet;
    }

    public static final <E> MutableOrderedScatterSet<E> mutableOrderedScatterSetOf(E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "");
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = new MutableOrderedScatterSet<>(eArr.length);
        mutableOrderedScatterSet.plusAssign((Object[]) eArr);
        return mutableOrderedScatterSet;
    }
}
