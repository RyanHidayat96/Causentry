package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0016\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u000f\u001a/\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0012\u001a?\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0015\u001aO\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0018\u001a_\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001e\u001a/\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001f\u001a?\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010 \u001aO\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010!\u001a_\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\"\"\u0014\u0010#\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableFloatFloatMap;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/FloatFloatMap;", "buildFloatFloatMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatFloatMap;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatFloatMap;", "emptyFloatFloatMap", "()Landroidx/collection/FloatFloatMap;", "floatFloatMapOf", "", "(FF)Landroidx/collection/FloatFloatMap;", "p2", "p3", "(FFFF)Landroidx/collection/FloatFloatMap;", "p4", "p5", "(FFFFFF)Landroidx/collection/FloatFloatMap;", "p6", "p7", "(FFFFFFFF)Landroidx/collection/FloatFloatMap;", "p8", "p9", "(FFFFFFFFFF)Landroidx/collection/FloatFloatMap;", "mutableFloatFloatMapOf", "()Landroidx/collection/MutableFloatFloatMap;", "(FF)Landroidx/collection/MutableFloatFloatMap;", "(FFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFFFF)Landroidx/collection/MutableFloatFloatMap;", "(FFFFFFFFFF)Landroidx/collection/MutableFloatFloatMap;", "EmptyFloatFloatMap", "Landroidx/collection/MutableFloatFloatMap;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatFloatMapKt {
    private static final MutableFloatFloatMap EmptyFloatFloatMap = new MutableFloatFloatMap(0);

    public static final FloatFloatMap emptyFloatFloatMap() {
        return EmptyFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf() {
        return EmptyFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        mutableFloatFloatMap.set(f9, f10);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf() {
        return new MutableFloatFloatMap(0, 1, null);
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        mutableFloatFloatMap.set(f, f2);
        mutableFloatFloatMap.set(f3, f4);
        mutableFloatFloatMap.set(f5, f6);
        mutableFloatFloatMap.set(f7, f8);
        mutableFloatFloatMap.set(f9, f10);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap buildFloatFloatMap(Function1<? super MutableFloatFloatMap, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, null);
        function1.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap buildFloatFloatMap(int i, Function1<? super MutableFloatFloatMap, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(i);
        function1.invoke(mutableFloatFloatMap);
        return mutableFloatFloatMap;
    }
}
