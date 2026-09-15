package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0016\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000f\u001a/\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u0012\u001a?\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u0015\u001aO\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u0018\u001a_\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001c\u0010\u001e\u001a/\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001c\u0010\u001f\u001a?\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001c\u0010 \u001aO\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001c\u0010!\u001a_\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001c\u0010\"\"\u0014\u0010#\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableFloatIntMap;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/FloatIntMap;", "buildFloatIntMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatIntMap;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatIntMap;", "emptyFloatIntMap", "()Landroidx/collection/FloatIntMap;", "floatIntMapOf", "", "(FI)Landroidx/collection/FloatIntMap;", "p2", "p3", "(FIFI)Landroidx/collection/FloatIntMap;", "p4", "p5", "(FIFIFI)Landroidx/collection/FloatIntMap;", "p6", "p7", "(FIFIFIFI)Landroidx/collection/FloatIntMap;", "p8", "p9", "(FIFIFIFIFI)Landroidx/collection/FloatIntMap;", "mutableFloatIntMapOf", "()Landroidx/collection/MutableFloatIntMap;", "(FI)Landroidx/collection/MutableFloatIntMap;", "(FIFI)Landroidx/collection/MutableFloatIntMap;", "(FIFIFI)Landroidx/collection/MutableFloatIntMap;", "(FIFIFIFI)Landroidx/collection/MutableFloatIntMap;", "(FIFIFIFIFI)Landroidx/collection/MutableFloatIntMap;", "EmptyFloatIntMap", "Landroidx/collection/MutableFloatIntMap;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatIntMapKt {
    private static final MutableFloatIntMap EmptyFloatIntMap = new MutableFloatIntMap(0);

    public static final FloatIntMap emptyFloatIntMap() {
        return EmptyFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf() {
        return EmptyFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f, int i) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f, int i, float f2, int i2) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f, int i, float f2, int i2, float f3, int i3) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap floatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4, float f5, int i5) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        mutableFloatIntMap.set(f5, i5);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf() {
        return new MutableFloatIntMap(0, 1, null);
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int i) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2, float f3, int i3) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        return mutableFloatIntMap;
    }

    public static final MutableFloatIntMap mutableFloatIntMapOf(float f, int i, float f2, int i2, float f3, int i3, float f4, int i4, float f5, int i5) {
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        mutableFloatIntMap.set(f, i);
        mutableFloatIntMap.set(f2, i2);
        mutableFloatIntMap.set(f3, i3);
        mutableFloatIntMap.set(f4, i4);
        mutableFloatIntMap.set(f5, i5);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap buildFloatIntMap(Function1<? super MutableFloatIntMap, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(0, 1, null);
        function1.invoke(mutableFloatIntMap);
        return mutableFloatIntMap;
    }

    public static final FloatIntMap buildFloatIntMap(int i, Function1<? super MutableFloatIntMap, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableFloatIntMap mutableFloatIntMap = new MutableFloatIntMap(i);
        function1.invoke(mutableFloatIntMap);
        return mutableFloatIntMap;
    }
}
