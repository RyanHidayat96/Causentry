package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00028\u00008\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "p0", "p1", "p2", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;Ljava/lang/Object;)V", "withValue", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "withPrevious", "withNext", "value", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "previous", "getPrevious", "next", "getNext", "", "getHasNext", "()Z", "hasNext", "getHasPrevious", "hasPrevious"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LinkedValue<V> {
    public static final int $stable = 8;
    private final Object next;
    private final Object previous;
    private final V value;

    public LinkedValue(V v, Object obj, Object obj2) {
        this.value = v;
        this.previous = obj;
        this.next = obj2;
    }

    public final Object getNext() {
        return this.next;
    }

    public final Object getPrevious() {
        return this.previous;
    }

    public final V getValue() {
        return this.value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinkedValue(V v) {
        EndOfChain endOfChain = EndOfChain.INSTANCE;
        this(v, endOfChain, endOfChain);
    }

    public LinkedValue(V v, Object obj) {
        this(v, obj, EndOfChain.INSTANCE);
    }

    public final LinkedValue<V> withValue(V p0) {
        return new LinkedValue<>(p0, this.previous, this.next);
    }

    public final LinkedValue<V> withPrevious(Object p0) {
        return new LinkedValue<>(this.value, p0, this.next);
    }

    public final LinkedValue<V> withNext(Object p0) {
        return new LinkedValue<>(this.value, this.previous, p0);
    }

    public final boolean getHasNext() {
        return this.next != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != EndOfChain.INSTANCE;
    }
}
