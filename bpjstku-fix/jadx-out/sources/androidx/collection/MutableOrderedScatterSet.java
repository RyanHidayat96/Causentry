package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000b\u0010\u000fJ\u001d\u0010\u000b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\u001b\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u000b\u0010\u0013J\u001b\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u000b\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001d\u0010\u0018J\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020%H\u0002¢\u0006\u0004\b#\u0010&J\u000f\u0010'\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010\u0018J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b(\u0010\u0006J\u0017\u0010)\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010\u0006J\u0018\u0010*\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b*\u0010+J\u001e\u0010*\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002¢\u0006\u0004\b*\u0010,J\u001e\u0010*\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b*\u0010-J\u001e\u0010*\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002¢\u0006\u0004\b*\u0010.J \u0010*\u001a\u00020\u00162\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010H\u0086\u0002¢\u0006\u0004\b*\u0010/J\u001e\u0010*\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002¢\u0006\u0004\b*\u00100J\u001e\u0010*\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002¢\u0006\u0004\b*\u00101J\u0018\u00102\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b2\u0010\u0006J\u0018\u00103\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b3\u0010+J\u001e\u00103\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0086\u0002¢\u0006\u0004\b3\u0010,J\u001e\u00103\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b3\u0010-J\u001e\u00103\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0086\u0002¢\u0006\u0004\b3\u0010.J \u00103\u001a\u00020\u00162\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010H\u0086\u0002¢\u0006\u0004\b3\u0010/J\u001e\u00103\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0002¢\u0006\u0004\b3\u00100J\u001e\u00103\u001a\u00020\u00162\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002¢\u0006\u0004\b3\u00101J\u0015\u00104\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b4\u0010\tJ\u001b\u00105\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b5\u0010\fJ\u001b\u00105\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b5\u0010\rJ\u001b\u00105\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b5\u0010\u000fJ\u001d\u00105\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0010¢\u0006\u0004\b5\u0010\u0011J\u001b\u00105\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b5\u0010\u0013J\u001b\u00105\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b5\u0010\u0015J\u0017\u00106\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b6\u0010\u0006J'\u00108\u001a\u00020\u00162\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000707H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0082\b¢\u0006\u0004\b:\u0010\u0006J\u0017\u0010;\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b;\u0010\u0006J'\u0010<\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000707H\u0086\bø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001b\u0010<\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b<\u0010\rJ\u001b\u0010<\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b<\u0010\u000fJ\u001b\u0010<\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000>¢\u0006\u0004\b<\u0010?J\u000f\u0010@\u001a\u00020\u0003H\u0007¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\bB\u0010\u0006R\u0016\u0010C\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010D\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/MutableOrderedScatterSet;", ExifInterface.LONGITUDE_EAST, "Landroidx/collection/OrderedScatterSet;", "", "p0", "<init>", "(I)V", "", "add", "(Ljava/lang/Object;)Z", "Landroidx/collection/ObjectList;", "addAll", "(Landroidx/collection/ObjectList;)Z", "(Landroidx/collection/OrderedScatterSet;)Z", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)Z", "", "([Ljava/lang/Object;)Z", "", "(Ljava/lang/Iterable;)Z", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Z", "", "adjustStorage$collection", "()V", "", "asMutableSet", "()Ljava/util/Set;", "clear", "dropDeletes$collection", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "findFirstAvailableSlot", "(I)I", "", "fixupNodes", "([I)V", "", "([J)V", "initializeGrowth", "initializeMetadata", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "(Landroidx/collection/ObjectList;)V", "(Landroidx/collection/OrderedScatterSet;)V", "(Landroidx/collection/ScatterSet;)V", "([Ljava/lang/Object;)V", "(Ljava/lang/Iterable;)V", "(Lkotlin/sequences/Sequence;)V", "moveNodeToHead", "plusAssign", "remove", "removeAll", "removeElementAt", "Lkotlin/Function1;", "removeIf", "(Lkotlin/jvm/functions/Function1;)V", "removeNode", "resizeStorage$collection", "retainAll", "(Lkotlin/jvm/functions/Function1;)Z", "", "(Ljava/util/Collection;)Z", "trim", "()I", "trimToSize", "growthLimit", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {
    private int growthLimit;

    public /* synthetic */ MutableOrderedScatterSet(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableOrderedScatterSet(int i) {
        super(null);
        if (i < 0) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    private final void initializeStorage(int p0) {
        long[] emptyNodes;
        int iMax = p0 > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(p0)) : 0;
        this._capacity = iMax;
        initializeMetadata(iMax);
        this.elements = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            emptyNodes = new long[iMax];
            ArraysKt.fill$default(emptyNodes, 4611686018427387903L, 0, 0, 6, (Object) null);
        }
        this.nodes = emptyNodes;
    }

    private final void initializeMetadata(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((p0 + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.metadata = jArr;
        long[] jArr2 = this.metadata;
        int i = p0 >> 3;
        long j = 255 << ((p0 & 7) << 3);
        jArr2[i] = (jArr2[i] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final boolean add(E p0) {
        int size = get_size();
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(p0);
        this.elements[iFindAbsoluteInsertIndex] = p0;
        this.nodes[iFindAbsoluteInsertIndex] = (((long) this.head) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (this.head != Integer.MAX_VALUE) {
            this.nodes[this.head] = ((SieveCacheKt.NodeLinkMask & ((long) iFindAbsoluteInsertIndex)) << 31) | (this.nodes[this.head] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
        return get_size() != size;
    }

    public final void plusAssign(E p0) {
        int iFindAbsoluteInsertIndex = findAbsoluteInsertIndex(p0);
        this.elements[iFindAbsoluteInsertIndex] = p0;
        this.nodes[iFindAbsoluteInsertIndex] = (((long) this.head) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (this.head != Integer.MAX_VALUE) {
            this.nodes[this.head] = ((SieveCacheKt.NodeLinkMask & ((long) iFindAbsoluteInsertIndex)) << 31) | (this.nodes[this.head] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = iFindAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindAbsoluteInsertIndex;
        }
    }

    public final boolean addAll(E[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        plusAssign((Object[]) p0);
        return size != get_size();
    }

    public final boolean addAll(Iterable<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        plusAssign((Iterable) p0);
        return size != get_size();
    }

    public final boolean addAll(Sequence<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        plusAssign((Sequence) p0);
        return size != get_size();
    }

    public final boolean addAll(OrderedScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        plusAssign((OrderedScatterSet) p0);
        return size != get_size();
    }

    public final boolean addAll(ScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        plusAssign((ScatterSet) p0);
        return size != get_size();
    }

    public final boolean addAll(ObjectList<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        plusAssign((ObjectList) p0);
        return size != get_size();
    }

    public final boolean remove(E p0) {
        int iNumberOfTrailingZeros;
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = this;
        int iHashCode = (p0 != null ? p0.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = mutableOrderedScatterSet._capacity;
        int i3 = (i >>> 7) & i2;
        int i4 = 0;
        loop0: while (true) {
            long[] jArr = mutableOrderedScatterSet.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = (((long) (i & 127)) * ScatterMapKt.BitmaskLsb) ^ j;
            int i7 = i;
            for (long j3 = (~j2) & (j2 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i3) & i2;
                if (Intrinsics.areEqual(mutableOrderedScatterSet.elements[iNumberOfTrailingZeros], p0)) {
                    break loop0;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
            i = i7;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            removeElementAt(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void minusAssign(E p0) {
        int iNumberOfTrailingZeros;
        MutableOrderedScatterSet<E> mutableOrderedScatterSet = this;
        int i = 0;
        int iHashCode = (p0 != null ? p0.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = mutableOrderedScatterSet._capacity;
        int i4 = i2 >>> 7;
        loop0: while (true) {
            int i5 = i4 & i3;
            long[] jArr = mutableOrderedScatterSet.metadata;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) (i2 & 127)) * ScatterMapKt.BitmaskLsb) ^ j;
            for (long j3 = (j2 - ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (Intrinsics.areEqual(mutableOrderedScatterSet.elements[iNumberOfTrailingZeros], p0)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i += 8;
                i4 = i5 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            removeElementAt(iNumberOfTrailingZeros);
        }
    }

    public final boolean removeAll(E[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        minusAssign((Object[]) p0);
        return size != get_size();
    }

    public final boolean removeAll(Sequence<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        minusAssign((Sequence) p0);
        return size != get_size();
    }

    public final boolean removeAll(Iterable<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        minusAssign((Iterable) p0);
        return size != get_size();
    }

    public final boolean removeAll(OrderedScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        minusAssign((OrderedScatterSet) p0);
        return size != get_size();
    }

    public final boolean removeAll(ScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        minusAssign((ScatterSet) p0);
        return size != get_size();
    }

    public final boolean removeAll(ObjectList<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = get_size();
        minusAssign((ObjectList) p0);
        return size != get_size();
    }

    public final void removeIf(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
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
                        int i4 = (i << 3) + i3;
                        if (p0.invoke(objArr[i4]).booleanValue()) {
                            removeElementAt(i4);
                        }
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

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[LOOP:0: B:5:0x0019->B:17:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a A[EDGE_INSN: B:24:0x005a->B:18:0x005a BREAK  A[LOOP:0: B:5:0x0019->B:17:0x0057], SYNTHETIC] */
    public final boolean retainAll(Collection<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CollectionsKt.contains(p0, objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this._size;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0019->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0019->B:17:0x0054], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(OrderedScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!p0.contains(objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this._size;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0019->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0019->B:17:0x0054], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!p0.contains(objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != this._size;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005c A[LOOP:0: B:5:0x001b->B:17:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[EDGE_INSN: B:24:0x005f->B:18:0x005f BREAK  A[LOOP:0: B:5:0x001b->B:17:0x005c], SYNTHETIC] */
    public final boolean retainAll(Function1<? super E, Boolean> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = this.elements;
        int size = get_size();
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (!p0.invoke(objArr[i4]).booleanValue()) {
                                removeElementAt(i4);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return size != get_size();
    }

    public final void removeElementAt(int p0) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = p0 >> 3;
        int i3 = (p0 & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((p0 - 7) & i) + (i & 7)) >> 3] = j;
        this.elements[p0] = null;
        long[] jArr2 = this.nodes;
        long j2 = jArr2[p0];
        int i4 = (int) ((j2 >> 31) & SieveCacheKt.NodeLinkMask);
        int i5 = (int) (j2 & SieveCacheKt.NodeLinkMask);
        if (i4 != Integer.MAX_VALUE) {
            jArr2[i4] = (jArr2[i4] & SieveCacheKt.NodeMetaAndPreviousMask) | (((long) i5) & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i5;
        }
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = ((((long) i4) & SieveCacheKt.NodeLinkMask) << 31) | (SieveCacheKt.NodeMetaAndNextMask & jArr2[i5]);
        } else {
            this.tail = i4;
        }
        jArr2[p0] = 4611686018427387903L;
    }

    private final void moveNodeToHead(int p0) {
        this.nodes[p0] = (((long) this.head) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (this.head != Integer.MAX_VALUE) {
            this.nodes[this.head] = ((SieveCacheKt.NodeLinkMask & ((long) p0)) << 31) | (this.nodes[this.head] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = p0;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = p0;
        }
    }

    private final void removeNode(int p0) {
        long[] jArr = this.nodes;
        long j = jArr[p0];
        int i = (int) ((j >> 31) & SieveCacheKt.NodeLinkMask);
        int i2 = (int) (j & SieveCacheKt.NodeLinkMask);
        if (i == Integer.MAX_VALUE) {
            this.head = i2;
        } else {
            jArr[i] = (jArr[i] & SieveCacheKt.NodeMetaAndPreviousMask) | (((long) i2) & SieveCacheKt.NodeLinkMask);
        }
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((((long) i) & SieveCacheKt.NodeLinkMask) << 31) | (SieveCacheKt.NodeMetaAndNextMask & jArr[i2]);
        } else {
            this.tail = i;
        }
        jArr[p0] = 4611686018427387903L;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != ScatterMapKt.EmptyGroup) {
            ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        ArraysKt.fill(this.elements, (Object) null, 0, this._capacity);
        ArraysKt.fill$default(this.nodes, 4611686018427387903L, 0, 0, 6, (Object) null);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        initializeGrowth();
    }

    private final int findFirstAvailableSlot(int p0) {
        int i = this._capacity;
        int i2 = p0 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    public final int trim() {
        int i = this._capacity;
        int iNormalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (iNormalizeCapacity >= i) {
            return 0;
        }
        resizeStorage$collection(iNormalizeCapacity);
        return i - this._capacity;
    }

    public final void trimToSize(int p0) {
        long[] jArr = this.nodes;
        int i = this.head;
        while (i != Integer.MAX_VALUE && this._size > p0 && this._size != 0) {
            int i2 = (int) (jArr[i] & SieveCacheKt.NodeLinkMask);
            removeElementAt(i);
            i = i2;
        }
    }

    public final void adjustStorage$collection() {
        if (this._capacity > 8 && Long.compare(ULong.m8203constructorimpl(ULong.m8203constructorimpl(this._size) * 32) ^ Long.MIN_VALUE, ULong.m8203constructorimpl(ULong.m8203constructorimpl(this._capacity) * 25) ^ Long.MIN_VALUE) <= 0) {
            dropDeletes$collection();
        } else {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        }
    }

    public final void dropDeletes$collection() {
        long[] jArr;
        long[] jArr2;
        long j;
        int i;
        long[] jArr3 = this.metadata;
        if (jArr3 == null) {
            return;
        }
        int i2 = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr4 = this.nodes;
        long[] jArr5 = new long[i2];
        long j2 = 9223372034707292159L;
        int i3 = 0;
        ArraysKt.fill(jArr5, 9223372034707292159L, 0, i2);
        for (int i4 = 0; i4 < ((i2 + 7) >> 3); i4++) {
            long j3 = jArr3[i4] & (-9187201950435737472L);
            jArr3[i4] = (-72340172838076674L) & ((~j3) + (j3 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr3);
        int i5 = lastIndex - 1;
        jArr3[i5] = (jArr3[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr3[lastIndex] = jArr3[0];
        int i6 = 0;
        while (i6 != i2) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j4 = (jArr3[i7] >> i8) & 255;
            if (j4 != 128 && j4 == 254) {
                Object obj = objArr[i6];
                int iHashCode = (obj != null ? obj.hashCode() : i3) * ScatterMapKt.MurmurHashC1;
                int i9 = iHashCode ^ (iHashCode << 16);
                int i10 = i9 >>> 7;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i10);
                int i11 = i10 & i2;
                if (((iFindFirstAvailableSlot - i11) & i2) / 8 == ((i6 - i11) & i2) / 8) {
                    jArr3[i7] = (((long) (i9 & 127)) << i8) | (jArr3[i7] & (~(255 << i8)));
                    if (jArr5[i6] == 9223372034707292159L) {
                        long j5 = i6;
                        jArr5[i6] = j5 | (j5 << 32);
                    }
                    jArr3[jArr3.length - 1] = jArr3[0];
                    i6++;
                    j2 = 9223372034707292159L;
                    i3 = 0;
                } else {
                    j = 9223372034707292159L;
                    int i12 = iFindFirstAvailableSlot >> 3;
                    long j6 = jArr3[i12];
                    int i13 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j6 >> i13) & 255) == 128) {
                        jArr = jArr4;
                        jArr2 = jArr5;
                        jArr3[i12] = (j6 & (~(255 << i13))) | (((long) (i9 & 127)) << i13);
                        jArr3[i7] = (jArr3[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[iFindFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = null;
                        jArr[iFindFirstAvailableSlot] = jArr[i6];
                        jArr[i6] = 4611686018427387903L;
                        int i14 = (int) ((jArr2[i6] >> 32) & 4294967295L);
                        if (i14 != Integer.MAX_VALUE) {
                            jArr2[i14] = (jArr2[i14] & (-4294967296L)) | ((long) iFindFirstAvailableSlot);
                            jArr2[i6] = (jArr2[i6] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr2[i6] = ((long) iFindFirstAvailableSlot) | 9223372032559808512L;
                        }
                        jArr2[iFindFirstAvailableSlot] = (((long) i6) << 32) | SieveCacheKt.NodeLinkMask;
                    } else {
                        jArr = jArr4;
                        jArr2 = jArr5;
                        jArr3[i12] = (((long) (i9 & 127)) << i13) | (j6 & (~(255 << i13)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i6];
                        objArr[i6] = obj2;
                        long j7 = jArr[iFindFirstAvailableSlot];
                        jArr[iFindFirstAvailableSlot] = jArr[i6];
                        jArr[i6] = j7;
                        int i15 = (int) ((jArr2[i6] >> 32) & 4294967295L);
                        if (i15 != Integer.MAX_VALUE) {
                            long j8 = iFindFirstAvailableSlot;
                            jArr2[i15] = (jArr2[i15] & (-4294967296L)) | j8;
                            jArr2[i6] = (jArr2[i6] & 4294967295L) | (j8 << 32);
                        } else {
                            long j9 = iFindFirstAvailableSlot;
                            jArr2[i6] = j9 | (j9 << 32);
                            i15 = i6;
                        }
                        jArr2[iFindFirstAvailableSlot] = (((long) i15) << 32) | ((long) i6);
                        i6--;
                    }
                    i = 0;
                    jArr3[jArr3.length - 1] = jArr3[0];
                    i6++;
                    i3 = i;
                    j2 = j;
                    jArr4 = jArr;
                    jArr5 = jArr2;
                }
            } else {
                jArr = jArr4;
                jArr2 = jArr5;
                j = j2;
                i = i3;
                i6++;
                i3 = i;
                j2 = j;
                jArr4 = jArr;
                jArr5 = jArr2;
            }
        }
        initializeGrowth();
        fixupNodes(jArr5);
    }

    public final void resizeStorage$collection(int p0) {
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        int i = this._capacity;
        int[] iArr = new int[i];
        initializeStorage(p0);
        long[] jArr3 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr4 = this.nodes;
        int i2 = this._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i3];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i4 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i4 >>> 7);
                long j = i4 & 127;
                int i5 = iFindFirstAvailableSlot >> 3;
                int i6 = (iFindFirstAvailableSlot & 7) << 3;
                long j2 = (jArr3[i5] & (~(255 << i6))) | (j << i6);
                jArr3[i5] = j2;
                jArr3[(((iFindFirstAvailableSlot - 7) & i2) + (i2 & 7)) >> 3] = j2;
                objArr2[iFindFirstAvailableSlot] = obj;
                jArr4[iFindFirstAvailableSlot] = jArr2[i3];
                iArr[i3] = iFindFirstAvailableSlot;
            }
            i3++;
            jArr = jArr;
            objArr = objArr;
        }
        fixupNodes(iArr);
    }

    private final void fixupNodes(long[] p0) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) ((j >> 31) & SieveCacheKt.NodeLinkMask);
            int i4 = (int) (j & SieveCacheKt.NodeLinkMask);
            long j2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (p0[i3] & 4294967295L);
            if (i4 != Integer.MAX_VALUE) {
                i2 = (int) (4294967295L & p0[i4]);
            }
            jArr[i] = ((long) i2) | (((j & SieveCacheKt.NodeMetaMask) | j2) << 31);
            i++;
        }
        if (this.head != Integer.MAX_VALUE) {
            this.head = (int) (p0[this.head] & 4294967295L);
        }
        if (this.tail != Integer.MAX_VALUE) {
            this.tail = (int) (p0[this.tail] & 4294967295L);
        }
    }

    private final void fixupNodes(int[] p0) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) ((j >> 31) & SieveCacheKt.NodeLinkMask);
            int i4 = (int) (j & SieveCacheKt.NodeLinkMask);
            long j2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p0[i3];
            if (i4 != Integer.MAX_VALUE) {
                i2 = p0[i4];
            }
            jArr[i] = (((j & SieveCacheKt.NodeMetaMask) | j2) << 31) | ((long) i2);
            i++;
        }
        if (this.head != Integer.MAX_VALUE) {
            this.head = p0[this.head];
        }
        if (this.tail != Integer.MAX_VALUE) {
            this.tail = p0[this.tail];
        }
    }

    public final Set<E> asMutableSet() {
        return new MutableOrderedSetWrapper(this);
    }

    public final void plusAssign(E[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (E e2 : p0) {
            plusAssign(e2);
        }
    }

    public final void plusAssign(Iterable<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }

    public final void plusAssign(Sequence<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            plusAssign(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(OrderedScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.elements;
        long[] jArr = p0.nodes;
        int i = p0.tail;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & SieveCacheKt.NodeLinkMask);
            plusAssign(objArr[i]);
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> p0) {
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
                        plusAssign(objArr[(i << 3) + i3]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ObjectList<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.content;
        int i = p0._size;
        for (int i2 = 0; i2 < i; i2++) {
            plusAssign(objArr[i2]);
        }
    }

    public final void minusAssign(E[] p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        for (E e2 : p0) {
            minusAssign(e2);
        }
    }

    public final void minusAssign(Sequence<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    public final void minusAssign(Iterable<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Iterator<? extends E> it = p0.iterator();
        while (it.hasNext()) {
            minusAssign(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(OrderedScatterSet<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.elements;
        long[] jArr = p0.nodes;
        int i = p0.tail;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & SieveCacheKt.NodeLinkMask);
            minusAssign(objArr[i]);
            i = i2;
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
                        minusAssign(objArr[(i << 3) + i3]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        Object[] objArr = p0.content;
        int i = p0._size;
        for (int i2 = 0; i2 < i; i2++) {
            minusAssign(objArr[i2]);
        }
    }

    private final int findAbsoluteInsertIndex(E p0) {
        int iHashCode = (p0 != null ? p0.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * ScatterMapKt.BitmaskLsb);
            for (long j4 = (j3 - ScatterMapKt.BitmaskLsb) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], p0)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i10 = iFindFirstAvailableSlot >> 3;
                int i11 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit -= ((this.metadata[i10] >> i11) & 255) == 128 ? 1 : 0;
                long[] jArr2 = this.metadata;
                int i12 = this._capacity;
                long j5 = ((~(255 << i11)) & jArr2[i10]) | (j2 << i11);
                jArr2[i10] = j5;
                jArr2[(((iFindFirstAvailableSlot - 7) & i12) + (i12 & 7)) >> 3] = j5;
                return iFindFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public MutableOrderedScatterSet() {
        this(0, 1, null);
    }
}
