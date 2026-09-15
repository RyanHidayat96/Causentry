package kotlin.ranges;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\n*\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\u0004\u0010\u000b\u001a\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u0006*\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b\u0007\u0010\f\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\r0\n*\u00020\r2\u0006\u0010\u0002\u001a\u00020\rH\u0087\u0002¢\u0006\u0004\b\u0004\u0010\u000e\u001a\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\u0006*\u00020\r2\u0006\u0010\u0002\u001a\u00020\rH\u0087\u0002¢\u0006\u0004\b\u0007\u0010\u000f\u001aB\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0010\"\u0018\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0011*\u00028\u00012\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0015\u001aB\u0010\u0014\u001a\u00020\u0013\"\b\b\u0000\u0010\u0001*\u00020\u0010\"\u0018\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0011*\u00028\u00012\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H\u0087\n¢\u0006\u0004\b\u0014\u0010\u0016\u001a\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "p0", "Lkotlin/ranges/ClosedRange;", "rangeTo", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/ClosedRange;", "Lkotlin/ranges/OpenEndRange;", "rangeUntil", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/OpenEndRange;", "", "Lkotlin/ranges/ClosedFloatingPointRange;", "(DD)Lkotlin/ranges/ClosedFloatingPointRange;", "(DD)Lkotlin/ranges/OpenEndRange;", "", "(FF)Lkotlin/ranges/ClosedFloatingPointRange;", "(FF)Lkotlin/ranges/OpenEndRange;", "", "", "R", "", "contains", "(Lkotlin/ranges/ClosedRange;Ljava/lang/Object;)Z", "(Lkotlin/ranges/OpenEndRange;Ljava/lang/Object;)Z", "", "p1", "", "checkStepIsPositive", "(ZLjava/lang/Number;)V"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
public class RangesKt__RangesKt {
    public static final <T extends Comparable<? super T>> ClosedRange<T> rangeTo(T t, T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return new ComparableRange(t, t2);
    }

    public static final <T extends Comparable<? super T>> OpenEndRange<T> rangeUntil(T t, T t2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(t2, "");
        return new ComparableOpenEndRange(t, t2);
    }

    public static final ClosedFloatingPointRange<Double> rangeTo(double d, double d2) {
        return new ClosedDoubleRange(d, d2);
    }

    public static final OpenEndRange<Double> rangeUntil(double d, double d2) {
        return new OpenEndDoubleRange(d, d2);
    }

    public static final ClosedFloatingPointRange<Float> rangeTo(float f, float f2) {
        return new ClosedFloatRange(f, f2);
    }

    public static final OpenEndRange<Float> rangeUntil(float f, float f2) {
        return new OpenEndFloatRange(f, f2);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/ClosedRange<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    private static final boolean contains(ClosedRange closedRange, Object obj) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        return obj != null && closedRange.contains((Comparable) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/OpenEndRange<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    private static final boolean contains(OpenEndRange openEndRange, Object obj) {
        Intrinsics.checkNotNullParameter(openEndRange, "");
        return obj != null && openEndRange.contains((Comparable) obj);
    }

    public static final void checkStepIsPositive(boolean z, Number number) {
        Intrinsics.checkNotNullParameter(number, "");
        if (z) {
            return;
        }
        StringBuilder sb = new StringBuilder("Step must be positive, was: ");
        sb.append(number);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
}
