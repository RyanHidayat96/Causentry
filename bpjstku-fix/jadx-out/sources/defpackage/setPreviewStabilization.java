package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class setPreviewStabilization {
    public static <T> List<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).cancel();
        }
        if (!(list instanceof TuitionPaymentFragmentbindingInflater1)) {
            if (list instanceof RandomAccess) {
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(list);
            }
            return new TuitionPaymentFragmentbindingInflater1(list);
        }
        return ((TuitionPaymentFragmentbindingInflater1) list).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    static class TuitionPaymentFragmentbindingInflater1<T> extends AbstractList<T> {
        final List<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentbindingInflater1(List<T> list) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, T t) {
            List<T> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int size = size();
            if (i >= 0 && i <= size) {
                list.add(size - i, t);
                return;
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, size, FirebaseAnalytics.Param.INDEX));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            List<T> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int size = size();
            if (i >= 0 && i < size) {
                return list.remove((size - 1) - i);
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, size, FirebaseAnalytics.Param.INDEX));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i, T t) {
            List<T> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int size = size();
            if (i >= 0 && i < size) {
                return list.set((size - 1) - i, t);
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, size, FirebaseAnalytics.Param.INDEX));
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            List<T> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int size = size();
            if (i >= 0 && i < size) {
                return list.get((size - 1) - i);
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, size, FirebaseAnalytics.Param.INDEX));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i, int i2) {
            int size = size();
            if (i >= 0 && i2 >= i && i2 <= size) {
                List<T> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int size2 = size();
                if (i2 < 0 || i2 > size2) {
                    throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i2, size2, FirebaseAnalytics.Param.INDEX));
                }
                int i3 = size2 - i2;
                int size3 = size();
                if (i >= 0 && i <= size3) {
                    return setPreviewStabilization.TuitionPaymentFragmentspecialinlinedviewModeldefault3(list.subList(i3, size3 - i));
                }
                throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, size3, FirebaseAnalytics.Param.INDEX));
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentbindingInflater1(i, i2, size));
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            int size = size();
            if (i >= 0 && i <= size) {
                final ListIterator<T> listIterator = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.listIterator(size - i);
                return new ListIterator<T>(this) { // from class: setPreviewStabilization.TuitionPaymentFragmentbindingInflater1.5
                    private /* synthetic */ TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

                    {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this;
                    }

                    @Override // java.util.ListIterator
                    public final void add(T t) {
                        listIterator.add(t);
                        listIterator.previous();
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                    }

                    @Override // java.util.ListIterator, java.util.Iterator
                    public final boolean hasNext() {
                        return listIterator.hasPrevious();
                    }

                    @Override // java.util.ListIterator
                    public final boolean hasPrevious() {
                        return listIterator.hasNext();
                    }

                    @Override // java.util.ListIterator, java.util.Iterator
                    public final T next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                        return (T) listIterator.previous();
                    }

                    @Override // java.util.ListIterator
                    public final int nextIndex() {
                        TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        int iNextIndex = listIterator.nextIndex();
                        int size2 = tuitionPaymentFragmentbindingInflater1.size();
                        if (iNextIndex < 0 || iNextIndex > size2) {
                            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iNextIndex, size2, FirebaseAnalytics.Param.INDEX));
                        }
                        return size2 - iNextIndex;
                    }

                    @Override // java.util.ListIterator
                    public final T previous() {
                        if (!hasPrevious()) {
                            throw new NoSuchElementException();
                        }
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                        return (T) listIterator.next();
                    }

                    @Override // java.util.ListIterator
                    public final int previousIndex() {
                        return nextIndex() - 1;
                    }

                    @Override // java.util.ListIterator, java.util.Iterator
                    public final void remove() {
                        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            listIterator.remove();
                            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                            return;
                        }
                        throw new IllegalStateException("no calls to next() since the last call to remove()");
                    }

                    @Override // java.util.ListIterator
                    public final void set(T t) {
                        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                            listIterator.set(t);
                            return;
                        }
                        throw new IllegalStateException();
                    }
                };
            }
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, size, FirebaseAnalytics.Param.INDEX));
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> extends TuitionPaymentFragmentbindingInflater1<T> implements RandomAccess {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(List<T> list) {
            super(list);
        }
    }
}
