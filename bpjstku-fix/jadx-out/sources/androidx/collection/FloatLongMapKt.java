package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u0016\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0010\u001a/\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0013\u001a?\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0016\u001aO\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\r\u0010\u0019\u001a_\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\r\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001f\u001a/\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010 \u001a?\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010!\u001aO\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\"\u001a_\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010#\"\u0014\u0010$\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableFloatLongMap;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/FloatLongMap;", "buildFloatLongMap", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatLongMap;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatLongMap;", "emptyFloatLongMap", "()Landroidx/collection/FloatLongMap;", "floatLongMapOf", "", "", "(FJ)Landroidx/collection/FloatLongMap;", "p2", "p3", "(FJFJ)Landroidx/collection/FloatLongMap;", "p4", "p5", "(FJFJFJ)Landroidx/collection/FloatLongMap;", "p6", "p7", "(FJFJFJFJ)Landroidx/collection/FloatLongMap;", "p8", "p9", "(FJFJFJFJFJ)Landroidx/collection/FloatLongMap;", "mutableFloatLongMapOf", "()Landroidx/collection/MutableFloatLongMap;", "(FJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJFJ)Landroidx/collection/MutableFloatLongMap;", "(FJFJFJFJFJ)Landroidx/collection/MutableFloatLongMap;", "EmptyFloatLongMap", "Landroidx/collection/MutableFloatLongMap;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatLongMapKt {
    private static final MutableFloatLongMap EmptyFloatLongMap = new MutableFloatLongMap(0);

    public static final FloatLongMap emptyFloatLongMap() {
        return EmptyFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf() {
        return EmptyFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f, long j) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f, long j, float f2, long j2) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f, long j, float f2, long j2, float f3, long j3) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4, float f5, long j5) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        mutableFloatLongMap.set(f5, j5);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf() {
        return new MutableFloatLongMap(0, 1, null);
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2, float f3, long j3) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float f, long j, float f2, long j2, float f3, long j3, float f4, long j4, float f5, long j5) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        mutableFloatLongMap.set(f, j);
        mutableFloatLongMap.set(f2, j2);
        mutableFloatLongMap.set(f3, j3);
        mutableFloatLongMap.set(f4, j4);
        mutableFloatLongMap.set(f5, j5);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap buildFloatLongMap(Function1<? super MutableFloatLongMap, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, null);
        function1.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap buildFloatLongMap(int i, Function1<? super MutableFloatLongMap, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(i);
        function1.invoke(mutableFloatLongMap);
        return mutableFloatLongMap;
    }
}
