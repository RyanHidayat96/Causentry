package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0016\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u000f\u001a/\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0012\u001a?\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0015\u001aO\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0018\u001a_\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001e\u001a/\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001f\u001a?\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010 \u001aO\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010!\u001a_\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\"\"\u0014\u0010#\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableIntFloatMap;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/IntFloatMap;", "buildIntFloatMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/IntFloatMap;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/IntFloatMap;", "emptyIntFloatMap", "()Landroidx/collection/IntFloatMap;", "intFloatMapOf", "", "(IF)Landroidx/collection/IntFloatMap;", "p2", "p3", "(IFIF)Landroidx/collection/IntFloatMap;", "p4", "p5", "(IFIFIF)Landroidx/collection/IntFloatMap;", "p6", "p7", "(IFIFIFIF)Landroidx/collection/IntFloatMap;", "p8", "p9", "(IFIFIFIFIF)Landroidx/collection/IntFloatMap;", "mutableIntFloatMapOf", "()Landroidx/collection/MutableIntFloatMap;", "(IF)Landroidx/collection/MutableIntFloatMap;", "(IFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIFIF)Landroidx/collection/MutableIntFloatMap;", "(IFIFIFIFIF)Landroidx/collection/MutableIntFloatMap;", "EmptyIntFloatMap", "Landroidx/collection/MutableIntFloatMap;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class IntFloatMapKt {
    private static final MutableIntFloatMap EmptyIntFloatMap = new MutableIntFloatMap(0);

    public static final IntFloatMap emptyIntFloatMap() {
        return EmptyIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf() {
        return EmptyIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf(int i, float f) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf(int i, float f, int i2, float f2) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf(int i, float f, int i2, float f2, int i3, float f3) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf(int i, float f, int i2, float f2, int i3, float f3, int i4, float f4) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        mutableIntFloatMap.set(i4, f4);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap intFloatMapOf(int i, float f, int i2, float f2, int i3, float f3, int i4, float f4, int i5, float f5) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        mutableIntFloatMap.set(i4, f4);
        mutableIntFloatMap.set(i5, f5);
        return mutableIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf() {
        return new MutableIntFloatMap(0, 1, null);
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf(int i, float f) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        return mutableIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i2, float f2) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        return mutableIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i2, float f2, int i3, float f3) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        return mutableIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i2, float f2, int i3, float f3, int i4, float f4) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        mutableIntFloatMap.set(i4, f4);
        return mutableIntFloatMap;
    }

    public static final MutableIntFloatMap mutableIntFloatMapOf(int i, float f, int i2, float f2, int i3, float f3, int i4, float f4, int i5, float f5) {
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        mutableIntFloatMap.set(i, f);
        mutableIntFloatMap.set(i2, f2);
        mutableIntFloatMap.set(i3, f3);
        mutableIntFloatMap.set(i4, f4);
        mutableIntFloatMap.set(i5, f5);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap buildIntFloatMap(Function1<? super MutableIntFloatMap, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(0, 1, null);
        function1.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }

    public static final IntFloatMap buildIntFloatMap(int i, Function1<? super MutableIntFloatMap, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableIntFloatMap mutableIntFloatMap = new MutableIntFloatMap(i);
        function1.invoke(mutableIntFloatMap);
        return mutableIntFloatMap;
    }
}
