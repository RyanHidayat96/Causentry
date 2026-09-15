package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\r\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0011\u001a'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u001b\u0010\u000f\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0014\"\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0018\u001a\u001f\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0019\u001a'\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u001a\u001a\u001b\u0010\u0016\u001a\u00020\u00012\n\u0010\u0004\u001a\u00020\u0014\"\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u001b\"\u001a\u0010\u001c\u001a\u00020\u00148\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0014\u0010 \u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableIntSet;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/IntSet;", "buildIntSet", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntSet;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntSet;", "emptyIntSet", "()Landroidx/collection/IntSet;", "hash", "(I)I", "intSetOf", "(I)Landroidx/collection/IntSet;", "(II)Landroidx/collection/IntSet;", "p2", "(III)Landroidx/collection/IntSet;", "", "([I)Landroidx/collection/IntSet;", "mutableIntSetOf", "()Landroidx/collection/MutableIntSet;", "(I)Landroidx/collection/MutableIntSet;", "(II)Landroidx/collection/MutableIntSet;", "(III)Landroidx/collection/MutableIntSet;", "([I)Landroidx/collection/MutableIntSet;", "EmptyIntArray", "[I", "getEmptyIntArray", "()[I", "EmptyIntSet", "Landroidx/collection/MutableIntSet;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntSetKt {
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);
    private static final int[] EmptyIntArray = new int[0];

    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    public static final IntSet intSetOf(int i) {
        return mutableIntSetOf(i);
    }

    public static final IntSet intSetOf(int i, int i2) {
        return mutableIntSetOf(i, i2);
    }

    public static final IntSet intSetOf(int i, int i2, int i3) {
        return mutableIntSetOf(i, i2, i3);
    }

    public static final IntSet intSetOf(int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        MutableIntSet mutableIntSet = new MutableIntSet(iArr.length);
        mutableIntSet.plusAssign(iArr);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, null);
    }

    public static final MutableIntSet mutableIntSetOf(int i) {
        MutableIntSet mutableIntSet = new MutableIntSet(1);
        mutableIntSet.plusAssign(i);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int i, int i2) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        mutableIntSet.plusAssign(i);
        mutableIntSet.plusAssign(i2);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int i, int i2, int i3) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        mutableIntSet.plusAssign(i);
        mutableIntSet.plusAssign(i2);
        mutableIntSet.plusAssign(i3);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        MutableIntSet mutableIntSet = new MutableIntSet(iArr.length);
        mutableIntSet.plusAssign(iArr);
        return mutableIntSet;
    }

    public static final IntSet buildIntSet(Function1<? super MutableIntSet, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        function1.invoke(mutableIntSet);
        return mutableIntSet;
    }

    public static final IntSet buildIntSet(int i, Function1<? super MutableIntSet, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableIntSet mutableIntSet = new MutableIntSet(i);
        function1.invoke(mutableIntSet);
        return mutableIntSet;
    }

    public static final int hash(int i) {
        int iHashCode = Integer.hashCode(i) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }
}
