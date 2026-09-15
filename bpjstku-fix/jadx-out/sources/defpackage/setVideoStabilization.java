package defpackage;

import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.NaturalOrdering;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setVideoStabilization<T> implements Comparator<T> {
    public static <C extends Comparable> setVideoStabilization<C> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return NaturalOrdering.b;
    }

    public static <T> setVideoStabilization<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1(Comparator<T> comparator) {
        return new ComparatorOrdering(comparator);
    }
}
