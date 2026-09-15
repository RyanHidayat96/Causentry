package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003FGHB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\r\u0010\u0010J\u001b\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\r\u0010\u0012J#\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u0013J#\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\r\u0010\u0014J#\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\r\u0010\u0016J\u001b\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\r\u0010\u0018J\u001b\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\r\u0010\u001aJ\u001b\u0010\r\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\r\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0007¢\u0006\u0004\b \u0010\u001eJ\r\u0010!\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b#\u0010\u0006J\u0018\u0010$\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b$\u0010%J\u001e\u0010$\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b$\u0010&J\u001e\u0010$\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0004\b$\u0010'J\u001e\u0010$\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002¢\u0006\u0004\b$\u0010(J\u001e\u0010$\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\u0002¢\u0006\u0004\b$\u0010)J\u001e\u0010$\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002¢\u0006\u0004\b$\u0010*J\u001e\u0010$\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002¢\u0006\u0004\b$\u0010+J\u0018\u0010,\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b,\u0010%J\u001e\u0010,\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b,\u0010&J\u001e\u0010,\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\u0002¢\u0006\u0004\b,\u0010'J\u001e\u0010,\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002¢\u0006\u0004\b,\u0010(J\u001e\u0010,\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086\u0002¢\u0006\u0004\b,\u0010)J\u001e\u0010,\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002¢\u0006\u0004\b,\u0010*J\u001e\u0010,\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b-\u0010\tJ\u001b\u0010.\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b.\u0010\u000eJ\u001b\u0010.\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b.\u0010\u0010J\u001b\u0010.\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b.\u0010\u0012J\u001b\u0010.\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b.\u0010\u0018J\u001b\u0010.\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b.\u0010\u001aJ\u001b\u0010.\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b.\u0010\u001cJ\u0015\u0010/\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J,\u00103\u001a\u00020\u000b2\u0017\u0010\u0004\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b2\u0012\u0004\u0012\u00020\u000701H\u0086\bø\u0001\u0000¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b5\u00106J'\u00108\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001070\u0011H\u0001¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b:\u0010\u000eJ\u001b\u0010:\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b:\u0010\u0012J\u001b\u0010:\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b:\u0010;J\u001b\u0010:\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b:\u0010\u0018J\u001b\u0010:\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b:\u0010\u001cJ \u0010<\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b>\u0010\u0006J\u0017\u0010?\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b?\u0010\u0006R\u0012\u0010B\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001e\u0010D\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/MutableObjectList;", ExifInterface.LONGITUDE_EAST, "Landroidx/collection/ObjectList;", "", "p0", "<init>", "(I)V", "", "add", "(Ljava/lang/Object;)Z", "p1", "", "(ILjava/lang/Object;)V", "addAll", "(Landroidx/collection/ObjectList;)Z", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)Z", "", "([Ljava/lang/Object;)Z", "(ILandroidx/collection/ObjectList;)Z", "(I[Ljava/lang/Object;)Z", "", "(ILjava/util/Collection;)Z", "", "(Ljava/lang/Iterable;)Z", "", "(Ljava/util/List;)Z", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Z", "asList", "()Ljava/util/List;", "", "asMutableList", "clear", "()V", "ensureCapacity", "minusAssign", "(Ljava/lang/Object;)V", "(Landroidx/collection/ObjectList;)V", "(Landroidx/collection/ScatterSet;)V", "([Ljava/lang/Object;)V", "(Ljava/lang/Iterable;)V", "(Ljava/util/List;)V", "(Lkotlin/sequences/Sequence;)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "removeIf", "(Lkotlin/jvm/functions/Function1;)V", "removeRange", "(II)V", "", "resizeStorage", "(I[Ljava/lang/Object;)V", "retainAll", "(Ljava/util/Collection;)Z", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "throwIndexOutOfBoundsInclusiveException", "trim", "getCapacity", "()I", "capacity", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "list", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "MutableObjectListIterator", "ObjectListMutableList", "SubList"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    public MutableObjectList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableObjectList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(E p0) {
        int i = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        this.content[this._size] = p0;
        this._size++;
        return true;
    }

    public final void add(int p0, E p1) {
        if (p0 < 0 || p0 > this._size) {
            throwIndexOutOfBoundsInclusiveException(p0);
        }
        int i = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        Object[] objArr2 = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(objArr2, objArr2, p0 + 1, p0, this._size);
        }
        objArr2[p0] = p1;
        this._size++;
    }

    public final boolean addAll(int p0, E[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            throwIndexOutOfBoundsInclusiveException(p0);
        }
        if (p1.length == 0) {
            return false;
        }
        int length = this._size + p1.length;
        Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        Object[] objArr2 = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(objArr2, objArr2, p1.length + p0, p0, this._size);
        }
        ArraysKt.copyInto$default(p1, objArr2, p0, 0, 0, 12, (Object) null);
        this._size += p1.length;
        return true;
    }

    public final boolean addAll(int p0, Collection<? extends E> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            throwIndexOutOfBoundsInclusiveException(p0);
        }
        int i = 0;
        if (p1.isEmpty()) {
            return false;
        }
        int size = this._size + p1.size();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(objArr2, objArr2, p1.size() + p0, p0, this._size);
        }
        for (Object obj : p1) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            objArr2[i + p0] = obj;
            i++;
        }
        this._size += p1.size();
        return true;
    }

    public final boolean addAll(int p0, ObjectList<E> p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        if (p0 < 0 || p0 > this._size) {
            throwIndexOutOfBoundsInclusiveException(p0);
        }
        if (p1.isEmpty()) {
            return false;
        }
        int i = this._size + p1._size;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        Object[] objArr2 = this.content;
        if (p0 != this._size) {
            ArraysKt.copyInto(objArr2, objArr2, p1._size + p0, p0, this._size);
        }
        ArraysKt.copyInto(p1.content, objArr2, p0, 0, p1._size);
        this._size += p1._size;
        return true;
    }

    private final void throwIndexOutOfBoundsInclusiveException(int p0) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(p0);
        sb.append(" must be in 0..");
        sb.append(this._size);
        RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
    }

    public final boolean addAll(ObjectList<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        plusAssign((ObjectList) p0);
        return i != this._size;
    }

    public final boolean addAll(ScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        plusAssign((ScatterSet) p0);
        return i != this._size;
    }

    public final boolean addAll(E[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        plusAssign((Object[]) p0);
        return i != this._size;
    }

    public final boolean addAll(List<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        plusAssign((List) p0);
        return i != this._size;
    }

    public final boolean addAll(Iterable<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        plusAssign((Iterable) p0);
        return i != this._size;
    }

    public final boolean addAll(Sequence<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        plusAssign((Sequence) p0);
        return i != this._size;
    }

    public final void plusAssign(ObjectList<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.isEmpty()) {
            return;
        }
        int i = this._size + p0._size;
        Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        ArraysKt.copyInto(p0.content, this.content, this._size, 0, p0._size);
        this._size += p0._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.isEmpty()) {
            return;
        }
        int size = this._size + p0.get_size();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = p0.elements;
        long[] jArr = p0.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        add(objArr2[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void plusAssign(E[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.length == 0) {
            return;
        }
        int length = this._size + p0.length;
        Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        ArraysKt.copyInto$default(p0, this.content, this._size, 0, 0, 12, (Object) null);
        this._size += p0.length;
    }

    public final void plusAssign(List<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (p0.isEmpty()) {
            return;
        }
        int i = this._size;
        int size = p0.size() + i;
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        int size2 = p0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = p0.get(i2);
        }
        this._size += p0.size();
    }

    public final void clear() {
        ArraysKt.fill(this.content, (Object) null, 0, this._size);
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableObjectList._size;
        }
        mutableObjectList.trim(i);
    }

    public final void trim(int p0) {
        int iMax = Math.max(p0, this._size);
        if (this.content.length > iMax) {
            Object[] objArrCopyOf = Arrays.copyOf(this.content, iMax);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            this.content = objArrCopyOf;
        }
    }

    public final void ensureCapacity(int p0) {
        Object[] objArr = this.content;
        if (objArr.length < p0) {
            resizeStorage(p0, objArr);
        }
    }

    public final void resizeStorage(int p0, Object[] p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        int length = p1.length;
        this.content = ArraysKt.copyInto(p1, new Object[Math.max(p0, (length * 3) / 2)], 0, 0, length);
    }

    public final void plusAssign(E p0) {
        add(p0);
    }

    public final void minusAssign(E p0) {
        remove(p0);
    }

    public final boolean remove(E p0) {
        int iIndexOf = indexOf(p0);
        if (iIndexOf < 0) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    public final void removeIf(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        Object[] objArr = this.content;
        int i2 = 0;
        IntRange intRangeUntil = RangesKt.until(0, this._size);
        int first = intRangeUntil.getFirst();
        int last = intRangeUntil.getLast();
        if (first <= last) {
            while (true) {
                objArr[first - i2] = objArr[first];
                if (p0.invoke(objArr[first]).booleanValue()) {
                    i2++;
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        ArraysKt.fill(objArr, (Object) null, i - i2, i);
        this._size -= i2;
    }

    public final boolean removeAll(E[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        for (E e2 : p0) {
            remove(e2);
        }
        return i != this._size;
    }

    public final boolean removeAll(ObjectList<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        minusAssign((ObjectList) p0);
        return i != this._size;
    }

    public final boolean removeAll(ScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        minusAssign((ScatterSet) p0);
        return i != this._size;
    }

    public final boolean removeAll(List<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        minusAssign((List) p0);
        return i != this._size;
    }

    public final boolean removeAll(Iterable<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        minusAssign((Iterable) p0);
        return i != this._size;
    }

    public final boolean removeAll(Sequence<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        minusAssign((Sequence) p0);
        return i != this._size;
    }

    public final void minusAssign(List<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            remove(p0.get(i));
        }
    }

    public final E removeAt(int p0) {
        if (p0 < 0 || p0 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(p0);
        }
        Object[] objArr = this.content;
        E e2 = (E) objArr[p0];
        if (p0 != this._size - 1) {
            ArraysKt.copyInto(objArr, objArr, p0, p0 + 1, this._size);
        }
        this._size--;
        objArr[this._size] = null;
        return e2;
    }

    public final void removeRange(int p0, int p1) {
        if (p0 < 0 || p0 > this._size || p1 < 0 || p1 > this._size) {
            StringBuilder sb = new StringBuilder("Start (");
            sb.append(p0);
            sb.append(") and end (");
            sb.append(p1);
            sb.append(") must be in 0..");
            sb.append(this._size);
            RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
        }
        if (p1 < p0) {
            StringBuilder sb2 = new StringBuilder("Start (");
            sb2.append(p0);
            sb2.append(") is more than end (");
            sb2.append(p1);
            sb2.append(')');
            RuntimeHelpersKt.throwIllegalArgumentException(sb2.toString());
        }
        if (p1 != p0) {
            if (p1 < this._size) {
                ArraysKt.copyInto(this.content, this.content, p0, p1, this._size);
            }
            int i = this._size - (p1 - p0);
            ArraysKt.fill(this.content, (Object) null, i, this._size);
            this._size = i;
        }
    }

    public final boolean retainAll(E[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (ArraysKt.indexOf(p0, objArr[i2]) < 0) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ObjectList<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!p0.contains(objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(Collection<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!p0.contains(objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(Iterable<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!CollectionsKt.contains(p0, objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(Sequence<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this._size;
        Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!SequencesKt.contains(p0, objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final E set(int p0, E p1) {
        if (p0 < 0 || p0 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(p0);
        }
        Object[] objArr = this.content;
        E e2 = (E) objArr[p0];
        objArr[p0] = p1;
        return e2;
    }

    @Override // androidx.collection.ObjectList
    public final List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
        this.list = objectListMutableList2;
        return objectListMutableList2;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "p0", "", "p1", "<init>", "(Ljava/util/List;I)V", "", "add", "(Ljava/lang/Object;)V", "", "hasNext", "()Z", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "()I", "previous", "previousIndex", "remove", "()V", "set", "list", "Ljava/util/List;", "prevIndex", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class MutableObjectListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            this.list = list;
            this.prevIndex = i - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            List<T> list = this.list;
            int i = this.prevIndex + 1;
            this.prevIndex = i;
            return list.get(i);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            List<T> list = this.list;
            int i = this.prevIndex;
            this.prevIndex = i - 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator
        public final void add(T p0) {
            List<T> list = this.list;
            int i = this.prevIndex + 1;
            this.prevIndex = i;
            list.add(i, p0);
        }

        @Override // java.util.ListIterator
        public final void set(T p0) {
            this.list.set(this.prevIndex, p0);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\rJ%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0097\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0017¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u0004\u001a\u00020\nH\u0017¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\tJ\u001d\u0010%\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b%\u0010\u0011J\u0017\u0010&\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u0017J\u001d\u0010'\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b'\u0010\u0011J \u0010(\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", ExifInterface.GPS_DIRECTION_TRUE, "", "Landroidx/collection/MutableObjectList;", "p0", "<init>", "(Landroidx/collection/MutableObjectList;)V", "", "add", "(Ljava/lang/Object;)Z", "", "p1", "", "(ILjava/lang/Object;)V", "", "addAll", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "clear", "()V", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "objectList", "Landroidx/collection/MutableObjectList;", "getSize", "()I", "size"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class ObjectListMutableList<T> implements List<T>, KMutableList {
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(MutableObjectList<T> mutableObjectList) {
            Intrinsics.checkNotNullParameter(mutableObjectList, "");
            this.objectList = mutableObjectList;
        }

        @Override // java.util.List
        public final T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return getSize();
        }

        public final int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object p0) {
            return this.objectList.contains(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.objectList.containsAll(p0);
        }

        @Override // java.util.List
        public final T get(int p0) {
            ObjectListKt.checkIndex(this, p0);
            return this.objectList.get(p0);
        }

        @Override // java.util.List
        public final int indexOf(Object p0) {
            return this.objectList.indexOf(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object p0) {
            return this.objectList.lastIndexOf(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T p0) {
            return this.objectList.add(p0);
        }

        @Override // java.util.List
        public final void add(int p0, T p1) {
            this.objectList.add(p0, p1);
        }

        @Override // java.util.List
        public final boolean addAll(int p0, Collection<? extends T> p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            return this.objectList.addAll(p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.objectList.addAll(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int p0) {
            return new MutableObjectListIterator(this, p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object p0) {
            return this.objectList.remove(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.objectList.removeAll(p0);
        }

        public final T removeAt(int p0) {
            ObjectListKt.checkIndex(this, p0);
            return this.objectList.removeAt(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.objectList.retainAll((Collection<? extends T>) p0);
        }

        @Override // java.util.List
        public final T set(int p0, T p1) {
            ObjectListKt.checkIndex(this, p0);
            return this.objectList.set(p0, p1);
        }

        @Override // java.util.List
        public final List<T> subList(int p0, int p1) {
            ObjectListMutableList<T> objectListMutableList = this;
            ObjectListKt.checkSubIndex(objectListMutableList, p0, p1);
            return new SubList(objectListMutableList, p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "");
            return (T[]) CollectionToArray.toArray(this, tArr);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0013\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\rJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u001d\u0010\u0015\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0097\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0017¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\u000bJ\u001d\u0010%\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b%\u0010\u0011J\u0017\u0010&\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010\u0017J\u001d\u0010'\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b'\u0010\u0011J \u0010(\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u0010-"}, d2 = {"Landroidx/collection/MutableObjectList$SubList;", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "", "p1", "p2", "<init>", "(Ljava/util/List;II)V", "", "add", "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "addAll", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "clear", "()V", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "end", "I", "list", "Ljava/util/List;", "getSize", "()I", "size", "start"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class SubList<T> implements List<T>, KMutableList {
        private int end;
        private final List<T> list;
        private final int start;

        public SubList(List<T> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "");
            this.list = list;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.List
        public final T remove(int i) {
            return removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return getSize();
        }

        public final int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object p0) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), p0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int p0) {
            ObjectListKt.checkIndex(this, p0);
            return this.list.get(p0 + this.start);
        }

        @Override // java.util.List
        public final int indexOf(Object p0) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), p0)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object p0) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.list.get(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T p0) {
            List<T> list = this.list;
            int i = this.end;
            this.end = i + 1;
            list.add(i, p0);
            return true;
        }

        @Override // java.util.List
        public final void add(int p0, T p1) {
            this.list.add(p0 + this.start, p1);
            this.end++;
        }

        @Override // java.util.List
        public final boolean addAll(int p0, Collection<? extends T> p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            this.list.addAll(p0 + this.start, p1);
            this.end += p1.size();
            return p1.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.list.addAll(this.end, p0);
            this.end += p0.size();
            return p0.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int p0) {
            return new MutableObjectListIterator(this, p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object p0) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.list.get(i2), p0)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            int i = this.end;
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.end;
        }

        public final T removeAt(int p0) {
            ObjectListKt.checkIndex(this, p0);
            T tRemove = this.list.remove(p0 + this.start);
            this.end--;
            return tRemove;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            int i = this.end;
            int i2 = i - 1;
            int i3 = this.start;
            if (i3 <= i2) {
                while (true) {
                    if (!p0.contains(this.list.get(i2))) {
                        this.list.remove(i2);
                        this.end--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.end;
        }

        @Override // java.util.List
        public final T set(int p0, T p1) {
            ObjectListKt.checkIndex(this, p0);
            return this.list.set(p0 + this.start, p1);
        }

        @Override // java.util.List
        public final List<T> subList(int p0, int p1) {
            SubList<T> subList = this;
            ObjectListKt.checkSubIndex(subList, p0, p1);
            return new SubList(subList, p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "");
            return (T[]) CollectionToArray.toArray(this, tArr);
        }
    }

    public final void plusAssign(Iterable<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(Sequence<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void minusAssign(E[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (E e2 : p0) {
            remove(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.content;
        int i = p0._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.elements;
        long[] jArr = p0.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void minusAssign(Iterable<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(Sequence<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }
}
