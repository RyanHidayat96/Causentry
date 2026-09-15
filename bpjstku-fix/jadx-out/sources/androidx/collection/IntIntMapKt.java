package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u0011\u001a?\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u0014\u001aO\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u0017\u001a_\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001d\u001a/\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001e\u001a?\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010\u001f\u001aO\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010 \u001a_\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001b\u0010!\"\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableIntIntMap;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/IntIntMap;", "buildIntIntMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntIntMap;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntIntMap;", "emptyIntIntMap", "()Landroidx/collection/IntIntMap;", "intIntMapOf", "(II)Landroidx/collection/IntIntMap;", "p2", "p3", "(IIII)Landroidx/collection/IntIntMap;", "p4", "p5", "(IIIIII)Landroidx/collection/IntIntMap;", "p6", "p7", "(IIIIIIII)Landroidx/collection/IntIntMap;", "p8", "p9", "(IIIIIIIIII)Landroidx/collection/IntIntMap;", "mutableIntIntMapOf", "()Landroidx/collection/MutableIntIntMap;", "(II)Landroidx/collection/MutableIntIntMap;", "(IIII)Landroidx/collection/MutableIntIntMap;", "(IIIIII)Landroidx/collection/MutableIntIntMap;", "(IIIIIIII)Landroidx/collection/MutableIntIntMap;", "(IIIIIIIIII)Landroidx/collection/MutableIntIntMap;", "EmptyIntIntMap", "Landroidx/collection/MutableIntIntMap;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntIntMapKt {
    private static final MutableIntIntMap EmptyIntIntMap = new MutableIntIntMap(0);

    public static final IntIntMap emptyIntIntMap() {
        return EmptyIntIntMap;
    }

    public static final IntIntMap intIntMapOf() {
        return EmptyIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i, int i2) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i, int i2, int i3, int i4) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i, int i2, int i3, int i4, int i5, int i6) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        mutableIntIntMap.set(i7, i8);
        return mutableIntIntMap;
    }

    public static final IntIntMap intIntMapOf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        mutableIntIntMap.set(i7, i8);
        mutableIntIntMap.set(i9, i10);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf() {
        return new MutableIntIntMap(0, 1, null);
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i, int i2) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i, int i2, int i3, int i4) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i, int i2, int i3, int i4, int i5, int i6) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        mutableIntIntMap.set(i7, i8);
        return mutableIntIntMap;
    }

    public static final MutableIntIntMap mutableIntIntMapOf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        mutableIntIntMap.set(i, i2);
        mutableIntIntMap.set(i3, i4);
        mutableIntIntMap.set(i5, i6);
        mutableIntIntMap.set(i7, i8);
        mutableIntIntMap.set(i9, i10);
        return mutableIntIntMap;
    }

    public static final IntIntMap buildIntIntMap(Function1<? super MutableIntIntMap, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(0, 1, null);
        function1.invoke(mutableIntIntMap);
        return mutableIntIntMap;
    }

    public static final IntIntMap buildIntIntMap(int i, Function1<? super MutableIntIntMap, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableIntIntMap mutableIntIntMap = new MutableIntIntMap(i);
        function1.invoke(mutableIntIntMap);
        return mutableIntIntMap;
    }
}
