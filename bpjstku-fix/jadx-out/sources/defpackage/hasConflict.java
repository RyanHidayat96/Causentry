package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hasConflict<E> extends mergeOptionValue<E> implements ListIterator<E> {
    protected hasConflict() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e2) {
        throw new UnsupportedOperationException();
    }
}
