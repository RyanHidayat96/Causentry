package androidx.compose.runtime.snapshots;

import androidx.exifinterface.media.ExifInterface;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J$\u0010\u0013\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0010R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\"R*\u0010\f\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b\f\u0010\u001f\u0012\u0004\b%\u0010\u0010\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\"R\"\u0010'\u001a\u00020&8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,"}, d2 = {"Landroidx/compose/runtime/snapshots/StateSetIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "p0", "", "p1", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Ljava/util/Iterator;)V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "remove", "()V", "advance", "Lkotlin/Function0;", "modify", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "validateModification", "set", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "getSet", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "current", "Ljava/lang/Object;", "getCurrent", "setCurrent", "(Ljava/lang/Object;)V", "getNext", "setNext", "getNext$annotations", "", "modification", "I", "getModification", "()I", "setModification", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StateSetIterator<T> implements Iterator<T>, KMutableIterator {
    public static final int $stable = 8;
    private T current;
    private final Iterator<T> iterator;
    private int modification;
    private T next;
    private final SnapshotStateSet<T> set;

    public static /* synthetic */ void getNext$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateSetIterator(SnapshotStateSet<T> snapshotStateSet, Iterator<? extends T> it) {
        this.set = snapshotStateSet;
        this.iterator = it;
        this.modification = SnapshotStateSetKt.getModification(snapshotStateSet);
        advance();
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final SnapshotStateSet<T> getSet() {
        return this.set;
    }

    public final T getCurrent() {
        return this.current;
    }

    public final void setCurrent(T t) {
        this.current = t;
    }

    public final T getNext() {
        return this.next;
    }

    public final void setNext(T t) {
        this.next = t;
    }

    public final int getModification() {
        return this.modification;
    }

    public final void setModification(int i) {
        this.modification = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        validateModification();
        advance();
        T t = this.current;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    private final void advance() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    private final <T> T modify(Function0<? extends T> p0) {
        validateModification();
        T tInvoke = p0.invoke();
        this.modification = SnapshotStateSetKt.getModification(this.set);
        return tInvoke;
    }

    private final void validateModification() {
        if (SnapshotStateSetKt.getModification(this.set) != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        validateModification();
        T t = this.current;
        if (t != null) {
            this.set.remove(t);
            this.current = null;
            Unit unit = Unit.INSTANCE;
            this.modification = SnapshotStateSetKt.getModification(this.set);
            return;
        }
        throw new IllegalStateException();
    }
}
