package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\r\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\rH\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\f\u001a\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0012\u001a'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u001b\u0010\u0010\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0015\"\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0019\u001a\u001f\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u001a\u001a'\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u001b\u001a\u001b\u0010\u0017\u001a\u00020\u00012\n\u0010\u0004\u001a\u00020\u0015\"\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u001c\"\u001a\u0010\u001d\u001a\u00020\u00158\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableLongSet;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/LongSet;", "buildLongSet", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/LongSet;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/LongSet;", "emptyLongSet", "()Landroidx/collection/LongSet;", "", "hash", "(J)I", "longSetOf", "(J)Landroidx/collection/LongSet;", "(JJ)Landroidx/collection/LongSet;", "p2", "(JJJ)Landroidx/collection/LongSet;", "", "([J)Landroidx/collection/LongSet;", "mutableLongSetOf", "()Landroidx/collection/MutableLongSet;", "(J)Landroidx/collection/MutableLongSet;", "(JJ)Landroidx/collection/MutableLongSet;", "(JJJ)Landroidx/collection/MutableLongSet;", "([J)Landroidx/collection/MutableLongSet;", "EmptyLongArray", "[J", "getEmptyLongArray", "()[J", "EmptyLongSet", "Landroidx/collection/MutableLongSet;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LongSetKt {
    private static final MutableLongSet EmptyLongSet = new MutableLongSet(0);
    private static final long[] EmptyLongArray = new long[0];

    public static final long[] getEmptyLongArray() {
        return EmptyLongArray;
    }

    public static final LongSet emptyLongSet() {
        return EmptyLongSet;
    }

    public static final LongSet longSetOf() {
        return EmptyLongSet;
    }

    public static final LongSet longSetOf(long j) {
        return mutableLongSetOf(j);
    }

    public static final LongSet longSetOf(long j, long j2) {
        return mutableLongSetOf(j, j2);
    }

    public static final LongSet longSetOf(long j, long j2, long j3) {
        return mutableLongSetOf(j, j2, j3);
    }

    public static final LongSet longSetOf(long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        MutableLongSet mutableLongSet = new MutableLongSet(jArr.length);
        mutableLongSet.plusAssign(jArr);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf() {
        return new MutableLongSet(0, 1, null);
    }

    public static final MutableLongSet mutableLongSetOf(long j) {
        MutableLongSet mutableLongSet = new MutableLongSet(1);
        mutableLongSet.plusAssign(j);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long j, long j2) {
        MutableLongSet mutableLongSet = new MutableLongSet(2);
        mutableLongSet.plusAssign(j);
        mutableLongSet.plusAssign(j2);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long j, long j2, long j3) {
        MutableLongSet mutableLongSet = new MutableLongSet(3);
        mutableLongSet.plusAssign(j);
        mutableLongSet.plusAssign(j2);
        mutableLongSet.plusAssign(j3);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        MutableLongSet mutableLongSet = new MutableLongSet(jArr.length);
        mutableLongSet.plusAssign(jArr);
        return mutableLongSet;
    }

    public static final LongSet buildLongSet(Function1<? super MutableLongSet, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableLongSet mutableLongSet = new MutableLongSet(0, 1, null);
        function1.invoke(mutableLongSet);
        return mutableLongSet;
    }

    public static final LongSet buildLongSet(int i, Function1<? super MutableLongSet, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableLongSet mutableLongSet = new MutableLongSet(i);
        function1.invoke(mutableLongSet);
        return mutableLongSet;
    }

    public static final int hash(long j) {
        int iHashCode = Long.hashCode(j) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }
}
