package kotlin.collections;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a>\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u001d\u0010\u0001\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001aF\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0001\u001a\u00020\f2\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000e\u001a\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0005H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0001\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0011\u001a)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0014\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aK\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u00002\u001a\u0010\u0001\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0018j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u00192\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0014\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "p0", "", "setOf", "(Ljava/lang/Object;)Ljava/util/Set;", ExifInterface.LONGITUDE_EAST, "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "buildSetInternal", "(Lkotlin/jvm/functions/Function1;)Ljava/util/Set;", "", "p1", "(ILkotlin/jvm/functions/Function1;)Ljava/util/Set;", "createSetBuilder", "()Ljava/util/Set;", "(I)Ljava/util/Set;", "build", "(Ljava/util/Set;)Ljava/util/Set;", "", "Ljava/util/TreeSet;", "sortedSetOf", "([Ljava/lang/Object;)Ljava/util/TreeSet;", "Ljava/util/Comparator;", "Lkotlin/cancelAll;", "(Ljava/util/Comparator;[Ljava/lang/Object;)Ljava/util/TreeSet;"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
public class SetsKt__SetsJVMKt {
    public static final <T> Set<T> setOf(T t) {
        Set<T> setSingleton = Collections.singleton(t);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "");
        return setSingleton;
    }

    private static final <E> Set<E> buildSetInternal(Function1<? super Set<E>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        function1.invoke(setCreateSetBuilder);
        return SetsKt.build(setCreateSetBuilder);
    }

    private static final <E> Set<E> buildSetInternal(int i, Function1<? super Set<E>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Set setCreateSetBuilder = SetsKt.createSetBuilder(i);
        function1.invoke(setCreateSetBuilder);
        return SetsKt.build(setCreateSetBuilder);
    }

    public static final <E> Set<E> createSetBuilder() {
        return new SetBuilder();
    }

    public static final <E> Set<E> createSetBuilder(int i) {
        return new SetBuilder(i);
    }

    public static final <E> Set<E> build(Set<E> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return ((SetBuilder) set).build();
    }

    public static final <T> TreeSet<T> sortedSetOf(T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (TreeSet) ArraysKt.toCollection(tArr, new TreeSet());
    }

    public static final <T> TreeSet<T> sortedSetOf(Comparator<? super T> comparator, T... tArr) {
        Intrinsics.checkNotNullParameter(comparator, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        return (TreeSet) ArraysKt.toCollection(tArr, new TreeSet(comparator));
    }
}
