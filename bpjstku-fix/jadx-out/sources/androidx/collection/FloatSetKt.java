package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u000f\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u000f\u001a\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0010\u001a'\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0012\u001a\u001b\u0010\r\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0013\"\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0014\u001a\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u000eH\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0019\u001a\u001f\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u001a\u001a'\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u001b\u001a\u001b\u0010\u0017\u001a\u00020\u00012\n\u0010\u0004\u001a\u00020\u0013\"\u00020\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u001c\"\u001a\u0010\u001d\u001a\u00020\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0014\u0010!\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableFloatSet;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/FloatSet;", "buildFloatSet", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatSet;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatSet;", "emptyFloatSet", "()Landroidx/collection/FloatSet;", "floatSetOf", "", "(F)Landroidx/collection/FloatSet;", "(FF)Landroidx/collection/FloatSet;", "p2", "(FFF)Landroidx/collection/FloatSet;", "", "([F)Landroidx/collection/FloatSet;", "hash", "(F)I", "mutableFloatSetOf", "()Landroidx/collection/MutableFloatSet;", "(F)Landroidx/collection/MutableFloatSet;", "(FF)Landroidx/collection/MutableFloatSet;", "(FFF)Landroidx/collection/MutableFloatSet;", "([F)Landroidx/collection/MutableFloatSet;", "EmptyFloatArray", "[F", "getEmptyFloatArray", "()[F", "EmptyFloatSet", "Landroidx/collection/MutableFloatSet;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatSetKt {
    private static final MutableFloatSet EmptyFloatSet = new MutableFloatSet(0);
    private static final float[] EmptyFloatArray = new float[0];

    public static final float[] getEmptyFloatArray() {
        return EmptyFloatArray;
    }

    public static final FloatSet emptyFloatSet() {
        return EmptyFloatSet;
    }

    public static final FloatSet floatSetOf() {
        return EmptyFloatSet;
    }

    public static final FloatSet floatSetOf(float f) {
        return mutableFloatSetOf(f);
    }

    public static final FloatSet floatSetOf(float f, float f2) {
        return mutableFloatSetOf(f, f2);
    }

    public static final FloatSet floatSetOf(float f, float f2, float f3) {
        return mutableFloatSetOf(f, f2, f3);
    }

    public static final FloatSet floatSetOf(float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(fArr.length);
        mutableFloatSet.plusAssign(fArr);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf() {
        return new MutableFloatSet(0, 1, null);
    }

    public static final MutableFloatSet mutableFloatSetOf(float f) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(1);
        mutableFloatSet.plusAssign(f);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float f, float f2) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(2);
        mutableFloatSet.plusAssign(f);
        mutableFloatSet.plusAssign(f2);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float f, float f2, float f3) {
        MutableFloatSet mutableFloatSet = new MutableFloatSet(3);
        mutableFloatSet.plusAssign(f);
        mutableFloatSet.plusAssign(f2);
        mutableFloatSet.plusAssign(f3);
        return mutableFloatSet;
    }

    public static final MutableFloatSet mutableFloatSetOf(float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(fArr.length);
        mutableFloatSet.plusAssign(fArr);
        return mutableFloatSet;
    }

    public static final FloatSet buildFloatSet(Function1<? super MutableFloatSet, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(0, 1, null);
        function1.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    public static final FloatSet buildFloatSet(int i, Function1<? super MutableFloatSet, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableFloatSet mutableFloatSet = new MutableFloatSet(i);
        function1.invoke(mutableFloatSet);
        return mutableFloatSet;
    }

    public static final int hash(float f) {
        int iHashCode = Float.hashCode(f) * ScatterMapKt.MurmurHashC1;
        return iHashCode ^ (iHashCode << 16);
    }
}
