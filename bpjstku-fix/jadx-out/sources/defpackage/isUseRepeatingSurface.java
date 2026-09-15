package defpackage;

import com.google.common.base.Optional;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isUseRepeatingSurface<E> implements Iterable<E> {
    private final Optional<Iterable<E>> TuitionPaymentFragmentbindingInflater1 = Optional.TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    protected isUseRepeatingSurface() {
    }

    public String toString() {
        Iterator<E> it = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this).iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(it.next());
            z = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
