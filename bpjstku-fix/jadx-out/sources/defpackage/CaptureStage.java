package defpackage;

import com.google.common.collect.AbstractIterator;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class CaptureStage {

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault2<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
        public abstract mergeOptionValue<E> iterator();

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(byte b) {
            this();
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }
    }

    public static <E> TuitionPaymentFragmentspecialinlinedviewModeldefault2<E> TuitionPaymentFragmentspecialinlinedviewModeldefault1(final Set<? extends E> set, final Set<? extends E> set2) {
        if (set == null) {
            throw new NullPointerException("set1");
        }
        if (set2 != null) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault2<E>() { // from class: CaptureStage.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super((byte) 0);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final int size() {
                    int size = set.size();
                    Iterator<E> it = set2.iterator();
                    while (it.hasNext()) {
                        if (!set.contains(it.next())) {
                            size++;
                        }
                    }
                    return size;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean isEmpty() {
                    return set.isEmpty() && set2.isEmpty();
                }

                /* JADX INFO: renamed from: CaptureStage$4$1, reason: invalid class name */
                final class AnonymousClass1 extends AbstractIterator<E> {
                    private Iterator<? extends E> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    private Iterator<? extends E> b;

                    AnonymousClass1() {
                        this.b = set.iterator();
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = set2.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public final E b() {
                        if (this.b.hasNext()) {
                            return this.b.next();
                        }
                        while (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hasNext()) {
                            E next = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.next();
                            if (!set.contains(next)) {
                                return next;
                            }
                        }
                        return TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    }
                }

                @Override // CaptureStage.TuitionPaymentFragmentspecialinlinedviewModeldefault2
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1 */
                public final mergeOptionValue<E> iterator() {
                    return new AnonymousClass1();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public final boolean contains(Object obj) {
                    return set.contains(obj) || set2.contains(obj);
                }

                @Override // CaptureStage.TuitionPaymentFragmentspecialinlinedviewModeldefault2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final /* synthetic */ Iterator iterator() {
                    return new AnonymousClass1();
                }
            };
        }
        throw new NullPointerException("set2");
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
