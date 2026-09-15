package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\t\u001a9\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u000f\u001a\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0010\u001a'\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0012\u001a\u001b\u0010\r\u001a\u00020\u00052\n\u0010\u0004\u001a\u00020\u0013\"\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0014\u001a\u0010\u0010\u0015\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0017\u001a\u001f\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0018\u001a'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0019\u001a\u001c\u0010\u0015\u001a\u00020\u00012\n\u0010\u0004\u001a\u00020\u0013\"\u00020\u000eH\u0087\b¢\u0006\u0004\b\u0015\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/collection/MutableFloatList;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/collection/FloatList;", "buildFloatList", "(Lkotlin/jvm/functions/Function1;)Landroidx/collection/FloatList;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Landroidx/collection/FloatList;", "emptyFloatList", "()Landroidx/collection/FloatList;", "floatListOf", "", "(F)Landroidx/collection/FloatList;", "(FF)Landroidx/collection/FloatList;", "p2", "(FFF)Landroidx/collection/FloatList;", "", "([F)Landroidx/collection/FloatList;", "mutableFloatListOf", "()Landroidx/collection/MutableFloatList;", "(F)Landroidx/collection/MutableFloatList;", "(FF)Landroidx/collection/MutableFloatList;", "(FFF)Landroidx/collection/MutableFloatList;", "([F)Landroidx/collection/MutableFloatList;", "EmptyFloatList", "Landroidx/collection/FloatList;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class FloatListKt {
    private static final FloatList EmptyFloatList = new MutableFloatList(0);

    public static final FloatList emptyFloatList() {
        return EmptyFloatList;
    }

    public static final FloatList floatListOf() {
        return EmptyFloatList;
    }

    public static final FloatList floatListOf(float f) {
        return mutableFloatListOf(f);
    }

    public static final FloatList floatListOf(float f, float f2) {
        return mutableFloatListOf(f, f2);
    }

    public static final FloatList floatListOf(float f, float f2, float f3) {
        return mutableFloatListOf(f, f2, f3);
    }

    public static final FloatList floatListOf(float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        MutableFloatList mutableFloatList = new MutableFloatList(fArr.length);
        mutableFloatList.addAll(mutableFloatList._size, fArr);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf() {
        return new MutableFloatList(0, 1, null);
    }

    public static final MutableFloatList mutableFloatListOf(float f) {
        MutableFloatList mutableFloatList = new MutableFloatList(1);
        mutableFloatList.add(f);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float f, float f2) {
        MutableFloatList mutableFloatList = new MutableFloatList(2);
        mutableFloatList.add(f);
        mutableFloatList.add(f2);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float f, float f2, float f3) {
        MutableFloatList mutableFloatList = new MutableFloatList(3);
        mutableFloatList.add(f);
        mutableFloatList.add(f2);
        mutableFloatList.add(f3);
        return mutableFloatList;
    }

    public static final MutableFloatList mutableFloatListOf(float... fArr) {
        Intrinsics.checkNotNullParameter(fArr, "");
        MutableFloatList mutableFloatList = new MutableFloatList(fArr.length);
        mutableFloatList.addAll(mutableFloatList._size, fArr);
        return mutableFloatList;
    }

    public static final FloatList buildFloatList(Function1<? super MutableFloatList, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableFloatList mutableFloatList = new MutableFloatList(0, 1, null);
        function1.invoke(mutableFloatList);
        return mutableFloatList;
    }

    public static final FloatList buildFloatList(int i, Function1<? super MutableFloatList, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        MutableFloatList mutableFloatList = new MutableFloatList(i);
        function1.invoke(mutableFloatList);
        return mutableFloatList;
    }
}
