package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\t\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u000f\u001a\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0010\u001a'\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0012\u001a\u001b\u0010\r\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0013\"\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0014\u001a\u0010\u0010\u0015\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0017\u001a\u001f\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0018\u001a'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0019\u001a\u001c\u0010\u0015\u001a\u00020\u00012\n\u0010\u0004\u001a\u00020\u0013\"\u00020\u000eH\u0087\b¢\u0006\u0004\b\u0015\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableLongList;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/LongList;", "buildLongList", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/LongList;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/LongList;", "emptyLongList", "()Landroidx/collection/LongList;", "longListOf", "", "(J)Landroidx/collection/LongList;", "(JJ)Landroidx/collection/LongList;", "p2", "(JJJ)Landroidx/collection/LongList;", "", "([J)Landroidx/collection/LongList;", "mutableLongListOf", "()Landroidx/collection/MutableLongList;", "(J)Landroidx/collection/MutableLongList;", "(JJ)Landroidx/collection/MutableLongList;", "(JJJ)Landroidx/collection/MutableLongList;", "([J)Landroidx/collection/MutableLongList;", "EmptyLongList", "Landroidx/collection/LongList;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LongListKt {
    private static final LongList EmptyLongList = new MutableLongList(0);

    public static final LongList emptyLongList() {
        return EmptyLongList;
    }

    public static final LongList longListOf() {
        return EmptyLongList;
    }

    public static final LongList longListOf(long j) {
        return mutableLongListOf(j);
    }

    public static final LongList longListOf(long j, long j2) {
        return mutableLongListOf(j, j2);
    }

    public static final LongList longListOf(long j, long j2, long j3) {
        return mutableLongListOf(j, j2, j3);
    }

    public static final LongList longListOf(long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        MutableLongList mutableLongList = new MutableLongList(jArr.length);
        mutableLongList.addAll(mutableLongList._size, jArr);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf() {
        return new MutableLongList(0, 1, null);
    }

    public static final MutableLongList mutableLongListOf(long j) {
        MutableLongList mutableLongList = new MutableLongList(1);
        mutableLongList.add(j);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long j, long j2) {
        MutableLongList mutableLongList = new MutableLongList(2);
        mutableLongList.add(j);
        mutableLongList.add(j2);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long j, long j2, long j3) {
        MutableLongList mutableLongList = new MutableLongList(3);
        mutableLongList.add(j);
        mutableLongList.add(j2);
        mutableLongList.add(j3);
        return mutableLongList;
    }

    public static final MutableLongList mutableLongListOf(long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        MutableLongList mutableLongList = new MutableLongList(jArr.length);
        mutableLongList.addAll(mutableLongList._size, jArr);
        return mutableLongList;
    }

    public static final LongList buildLongList(Function1<? super MutableLongList, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableLongList mutableLongList = new MutableLongList(0, 1, null);
        function1.invoke(mutableLongList);
        return mutableLongList;
    }

    public static final LongList buildLongList(int i, Function1<? super MutableLongList, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableLongList mutableLongList = new MutableLongList(i);
        function1.invoke(mutableLongList);
        return mutableLongList;
    }
}
