package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\t\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000f\u001a'\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u0011\u001a\u001b\u0010\r\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0012\"\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u0013\u001a\u0010\u0010\u0014\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0016\u001a\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0017\u001a'\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0018\u001a\u001c\u0010\u0014\u001a\u00020\u00012\n\u0010\u0004\u001a\u00020\u0012\"\u00020\bH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableIntList;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/IntList;", "buildIntList", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntList;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntList;", "emptyIntList", "()Landroidx/collection/IntList;", "intListOf", "(I)Landroidx/collection/IntList;", "(II)Landroidx/collection/IntList;", "p2", "(III)Landroidx/collection/IntList;", "", "([I)Landroidx/collection/IntList;", "mutableIntListOf", "()Landroidx/collection/MutableIntList;", "(I)Landroidx/collection/MutableIntList;", "(II)Landroidx/collection/MutableIntList;", "(III)Landroidx/collection/MutableIntList;", "([I)Landroidx/collection/MutableIntList;", "EmptyIntList", "Landroidx/collection/IntList;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntListKt {
    private static final IntList EmptyIntList = new MutableIntList(0);

    public static final IntList emptyIntList() {
        return EmptyIntList;
    }

    public static final IntList intListOf() {
        return EmptyIntList;
    }

    public static final IntList intListOf(int i) {
        return mutableIntListOf(i);
    }

    public static final IntList intListOf(int i, int i2) {
        return mutableIntListOf(i, i2);
    }

    public static final IntList intListOf(int i, int i2, int i3) {
        return mutableIntListOf(i, i2, i3);
    }

    public static final IntList intListOf(int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        mutableIntList.addAll(mutableIntList._size, iArr);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, null);
    }

    public static final MutableIntList mutableIntListOf(int i) {
        MutableIntList mutableIntList = new MutableIntList(1);
        mutableIntList.add(i);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int i, int i2) {
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.add(i);
        mutableIntList.add(i2);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int i, int i2, int i3) {
        MutableIntList mutableIntList = new MutableIntList(3);
        mutableIntList.add(i);
        mutableIntList.add(i2);
        mutableIntList.add(i3);
        return mutableIntList;
    }

    public static final MutableIntList mutableIntListOf(int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        mutableIntList.addAll(mutableIntList._size, iArr);
        return mutableIntList;
    }

    public static final IntList buildIntList(Function1<? super MutableIntList, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableIntList mutableIntList = new MutableIntList(0, 1, null);
        function1.invoke(mutableIntList);
        return mutableIntList;
    }

    public static final IntList buildIntList(int i, Function1<? super MutableIntList, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableIntList mutableIntList = new MutableIntList(i);
        function1.invoke(mutableIntList);
        return mutableIntList;
    }
}
