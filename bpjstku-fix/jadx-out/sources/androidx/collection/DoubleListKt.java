package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\n\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000e\u001a\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u000f\u001a'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u0011\u001a\u001b\u0010\u000b\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0012\"\u00020\rH\u0007¢\u0006\u0004\b\u000b\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\f\u001a\u0010\u0010\u0015\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0017\u001a\u001f\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0018\u001a'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0019\u001a\u001c\u0010\u0015\u001a\u00020\u00012\n\u0010\u0004\u001a\u00020\u0012\"\u00020\rH\u0087\b¢\u0006\u0004\b\u0015\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableDoubleList;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/DoubleList;", "buildDoubleList", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/DoubleList;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/DoubleList;", "doubleListOf", "()Landroidx/collection/DoubleList;", "", "(D)Landroidx/collection/DoubleList;", "(DD)Landroidx/collection/DoubleList;", "p2", "(DDD)Landroidx/collection/DoubleList;", "", "([D)Landroidx/collection/DoubleList;", "emptyDoubleList", "mutableDoubleListOf", "()Landroidx/collection/MutableDoubleList;", "(D)Landroidx/collection/MutableDoubleList;", "(DD)Landroidx/collection/MutableDoubleList;", "(DDD)Landroidx/collection/MutableDoubleList;", "([D)Landroidx/collection/MutableDoubleList;", "EmptyDoubleList", "Landroidx/collection/DoubleList;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DoubleListKt {
    private static final DoubleList EmptyDoubleList = new MutableDoubleList(0);

    public static final DoubleList emptyDoubleList() {
        return EmptyDoubleList;
    }

    public static final DoubleList doubleListOf() {
        return EmptyDoubleList;
    }

    public static final DoubleList doubleListOf(double d) {
        return mutableDoubleListOf(d);
    }

    public static final DoubleList doubleListOf(double d, double d2) {
        return mutableDoubleListOf(d, d2);
    }

    public static final DoubleList doubleListOf(double d, double d2, double d3) {
        return mutableDoubleListOf(d, d2, d3);
    }

    public static final DoubleList doubleListOf(double... dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(dArr.length);
        mutableDoubleList.addAll(mutableDoubleList._size, dArr);
        return mutableDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf() {
        return new MutableDoubleList(0, 1, null);
    }

    public static final MutableDoubleList mutableDoubleListOf(double d) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(1);
        mutableDoubleList.add(d);
        return mutableDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf(double d, double d2) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(2);
        mutableDoubleList.add(d);
        mutableDoubleList.add(d2);
        return mutableDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf(double d, double d2, double d3) {
        MutableDoubleList mutableDoubleList = new MutableDoubleList(3);
        mutableDoubleList.add(d);
        mutableDoubleList.add(d2);
        mutableDoubleList.add(d3);
        return mutableDoubleList;
    }

    public static final MutableDoubleList mutableDoubleListOf(double... dArr) {
        Intrinsics.checkNotNullParameter(dArr, "");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(dArr.length);
        mutableDoubleList.addAll(mutableDoubleList._size, dArr);
        return mutableDoubleList;
    }

    public static final DoubleList buildDoubleList(Function1<? super MutableDoubleList, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(0, 1, null);
        function1.invoke(mutableDoubleList);
        return mutableDoubleList;
    }

    public static final DoubleList buildDoubleList(int i, Function1<? super MutableDoubleList, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableDoubleList mutableDoubleList = new MutableDoubleList(i);
        function1.invoke(mutableDoubleList);
        return mutableDoubleList;
    }
}
