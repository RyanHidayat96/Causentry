package com.google.common.collect;

import defpackage.getVideoStabilizationMode;
import defpackage.setVideoStabilization;
import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes4.dex */
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Serializable {
    private static final Range<Comparable> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Range<>(Cut.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), Cut.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    private static final long serialVersionUID = 0;
    public final Cut<C> lowerBound;
    public final Cut<C> upperBound;

    public static <C extends Comparable<?>> setVideoStabilization<Range<C>> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return (setVideoStabilization<Range<C>>) RangeLexOrdering.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static <C extends Comparable<?>> Range<C> b(Cut<C> cut, Cut<C> cut2) {
        return new Range<>(cut, cut2);
    }

    public static <C extends Comparable<?>> Range<C> TuitionPaymentFragmentspecialinlinedviewModeldefault2(C c, C c2) {
        return new Range<>(Cut.TuitionPaymentFragmentspecialinlinedviewModeldefault2(c), Cut.TuitionPaymentFragmentspecialinlinedviewModeldefault1(c2));
    }

    public static <C extends Comparable<?>> Range<C> TuitionPaymentFragmentbindingInflater1(C c, C c2) {
        return new Range<>(Cut.TuitionPaymentFragmentspecialinlinedviewModeldefault2(c), Cut.TuitionPaymentFragmentspecialinlinedviewModeldefault2(c2));
    }

    public static <C extends Comparable<?>> Range<C> b(C c) {
        return new Range<>(Cut.TuitionPaymentFragmentspecialinlinedviewModeldefault2(c), Cut.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
    }

    public static <C extends Comparable<?>> Range<C> b() {
        return (Range<C>) TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    private Range(Cut<C> cut, Cut<C> cut2) {
        this.lowerBound = cut;
        this.upperBound = cut2;
        if (cut.compareTo(cut2) > 0 || cut == Cut.TuitionPaymentFragmentspecialinlinedviewModeldefault3() || cut2 == Cut.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            cut.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb2);
            sb2.append("..");
            cut2.TuitionPaymentFragmentbindingInflater1(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.lowerBound.equals(range.lowerBound) && this.upperBound.equals(range.upperBound);
    }

    public final int hashCode() {
        return (this.lowerBound.hashCode() * 31) + this.upperBound.hashCode();
    }

    public final String toString() {
        Cut<C> cut = this.lowerBound;
        Cut<C> cut2 = this.upperBound;
        StringBuilder sb = new StringBuilder(16);
        cut.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb);
        sb.append("..");
        cut2.TuitionPaymentFragmentbindingInflater1(sb);
        return sb.toString();
    }

    final Object readResolve() {
        Range<Comparable> range = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return equals(range) ? range : this;
    }

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    static class RangeLexOrdering extends setVideoStabilization<Range<?>> implements Serializable {
        static final setVideoStabilization<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new RangeLexOrdering();
        private static final long serialVersionUID = 0;

        private RangeLexOrdering() {
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(Object obj, Object obj2) {
            Range range = (Range) obj;
            Range range2 = (Range) obj2;
            return getVideoStabilizationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3().TuitionPaymentFragmentspecialinlinedviewModeldefault1(range.lowerBound, range2.lowerBound).TuitionPaymentFragmentspecialinlinedviewModeldefault1(range.upperBound, range2.upperBound).b();
        }
    }
}
