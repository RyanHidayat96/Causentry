package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u001f\b\u0007\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0005\u001a\u00028\u0000H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0007¢\u0006\u0004\b\"\u0010#J1\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b&\u0012\u0004\u0012\u00020\t0%H\u0086\b¢\u0006\u0004\b'\u0010(J.\u0010+\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00028\u00002\u0017\u0010\b\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b&\u0012\u0004\u0012\u00020\u00100%¢\u0006\u0004\b*\u0010(J\u001a\u0010,\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105\u0088\u00014\u0092\u0001\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004"}, d2 = {"Landroidx/compose/runtime/collection/MultiValueMap;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/collection/MutableScatterMap;", "p0", "constructor-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/MutableScatterMap;", "p1", "", "add-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V", "add", "clear-impl", "(Landroidx/collection/MutableScatterMap;)V", "clear", "", "contains-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z", "contains", "Landroidx/collection/ObjectList;", "get-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "get", "isEmpty-impl", "(Landroidx/collection/MutableScatterMap;)Z", "isEmpty", "isNotEmpty-impl", "isNotEmpty", "removeLast-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Ljava/lang/Object;", "removeLast", "removeFirst-impl", "removeFirst", "values-impl", "(Landroidx/collection/MutableScatterMap;)Landroidx/collection/ObjectList;", "values", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "forEachValue-impl", "(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "forEachValue", "removeValueIf-impl", "removeValueIf", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "map", "Landroidx/collection/MutableScatterMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class MultiValueMap<K, V> {
    private final MutableScatterMap<Object, Object> map;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> MutableScatterMap<Object, Object> m3615constructorimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }

    private /* synthetic */ MultiValueMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m3616constructorimpl$default(MutableScatterMap mutableScatterMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        if ((i & 1) != 0) {
            mutableScatterMap = new MutableScatterMap(0, i2, null);
        }
        return m3615constructorimpl(mutableScatterMap);
    }

    /* JADX INFO: renamed from: clear-impl, reason: not valid java name */
    public static final void m3614clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m3617containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k) {
        return mutableScatterMap.contains(k);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final ObjectList<V> m3621getimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k) {
        Object obj = mutableScatterMap.get(k);
        if (obj == null) {
            return ObjectListKt.emptyObjectList();
        }
        return obj instanceof MutableObjectList ? (ObjectList) obj : ObjectListKt.objectListOf(obj);
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m3623isEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isEmpty();
    }

    /* JADX INFO: renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m3624isNotEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: removeLast-impl, reason: not valid java name */
    public static final V m3626removeLastimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k) {
        V v = (V) mutableScatterMap.get(k);
        if (v == 0) {
            return null;
        }
        if (v instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) v;
            V v2 = (V) ExtensionsKt.removeLast(mutableObjectList);
            Intrinsics.checkNotNull(v2, "");
            if (mutableObjectList.isEmpty()) {
                mutableScatterMap.remove(k);
            }
            if (mutableObjectList.getSize() == 1) {
                mutableScatterMap.set(k, mutableObjectList.first());
            }
            return v2;
        }
        mutableScatterMap.remove(k);
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: removeFirst-impl, reason: not valid java name */
    public static final V m3625removeFirstimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k) {
        V v = (V) mutableScatterMap.get(k);
        if (v == 0) {
            return null;
        }
        if (v instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) v;
            V v2 = (V) mutableObjectList.removeAt(0);
            if (mutableObjectList.isEmpty()) {
                mutableScatterMap.remove(k);
            }
            if (mutableObjectList.getSize() == 1) {
                mutableScatterMap.set(k, mutableObjectList.first());
            }
            return v2;
        }
        mutableScatterMap.remove(k);
        return v;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0068 A[LOOP:0: B:9:0x001f->B:22:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[EDGE_INSN: B:26:0x006b->B:23:0x006b BREAK  A[LOOP:0: B:9:0x001f->B:22:0x0068], SYNTHETIC] */
    /* JADX INFO: renamed from: values-impl, reason: not valid java name */
    public static final ObjectList<V> m3629valuesimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        if (mutableScatterMap.isEmpty()) {
            return ObjectListKt.emptyObjectList();
        }
        MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
        MutableScatterMap<Object, Object> mutableScatterMap2 = mutableScatterMap;
        Object[] objArr = mutableScatterMap2.values;
        long[] jArr = mutableScatterMap2.metadata;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof MutableObjectList) {
                                Intrinsics.checkNotNull(obj, "");
                                mutableObjectList.addAll((MutableObjectList) obj);
                            } else {
                                Intrinsics.checkNotNull(obj, "");
                                mutableObjectList.add(obj);
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
        return mutableObjectList;
    }

    /* JADX INFO: renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m3620forEachValueimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k, Function1<? super V, Unit> function1) {
        Object obj = mutableScatterMap.get(k);
        if (obj != null) {
            if (obj instanceof MutableObjectList) {
                ObjectList objectList = (ObjectList) obj;
                Object[] objArr = objectList.content;
                int i = objectList._size;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj2 = objArr[i2];
                    Intrinsics.checkNotNull(obj2, "");
                    function1.invoke(obj2);
                }
                return;
            }
            function1.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: removeValueIf-impl, reason: not valid java name */
    public static final void m3627removeValueIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k, Function1<? super V, Boolean> function1) {
        Object obj = mutableScatterMap.get(k);
        if (obj != null) {
            if (obj instanceof MutableObjectList) {
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                int i = mutableObjectList._size;
                Object[] objArr = mutableObjectList.content;
                int i2 = 0;
                IntRange intRangeUntil = RangesKt.until(0, mutableObjectList._size);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first <= last) {
                    while (true) {
                        objArr[first - i2] = objArr[first];
                        if (function1.invoke(objArr[first]).booleanValue()) {
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
                mutableObjectList._size -= i2;
                if (mutableObjectList.isEmpty()) {
                    mutableScatterMap.remove(k);
                }
                if (mutableObjectList.getSize() == 0) {
                    mutableScatterMap.set(k, mutableObjectList.first());
                    return;
                }
                return;
            }
            if (function1.invoke(obj).booleanValue()) {
                mutableScatterMap.remove(k);
            }
        }
    }

    /* JADX INFO: renamed from: add-impl, reason: not valid java name */
    public static final void m3612addimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k, V v) {
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(k);
        boolean z = iFindInsertIndex < 0;
        Object obj = z ? null : mutableScatterMap.values[iFindInsertIndex];
        TypeIntrinsics.isMutableList(obj);
        if (obj != null) {
            if (obj instanceof MutableObjectList) {
                Intrinsics.checkNotNull(obj, "");
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                mutableObjectList.add(v);
                v = (V) mutableObjectList;
            } else {
                v = (V) ObjectListKt.mutableObjectListOf(obj, v);
            }
        }
        if (z) {
            int i = ~iFindInsertIndex;
            mutableScatterMap.keys[i] = k;
            mutableScatterMap.values[i] = v;
            return;
        }
        mutableScatterMap.values[iFindInsertIndex] = v;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MultiValueMap m3613boximpl(MutableScatterMap mutableScatterMap) {
        return new MultiValueMap(mutableScatterMap);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3618equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof MultiValueMap) && Intrinsics.areEqual(mutableScatterMap, ((MultiValueMap) obj).getMap());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3619equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return Intrinsics.areEqual(mutableScatterMap, mutableScatterMap2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3622hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3628toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        StringBuilder sb = new StringBuilder("MultiValueMap(map=");
        sb.append(mutableScatterMap);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        return m3618equalsimpl(this.map, p0);
    }

    public final int hashCode() {
        return m3622hashCodeimpl(this.map);
    }

    public final String toString() {
        return m3628toStringimpl(this.map);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ MutableScatterMap getMap() {
        return this.map;
    }
}
