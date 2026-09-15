package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
public final class Config {
    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Object objComparator;
        if (!(iterable instanceof SortedSet)) {
            if (!(iterable instanceof getCaptureConfig)) {
                return false;
            }
            objComparator = ((getCaptureConfig) iterable).comparator();
        } else {
            objComparator = ((SortedSet) iterable).comparator();
            if (objComparator == null) {
                objComparator = setVideoStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }
        return comparator.equals(objComparator);
    }
}
