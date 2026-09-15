package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B#\b\u0016\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00028\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0018\u001a\u00028\u0002\"\n\b\u0002\u0010\u0017*\u0004\u0018\u00018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00028\u0002H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0001¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u0016J'\u0010&\u001a\u00020\t2\u0016\u0010\u0004\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b&\u0010\u0006J!\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\u0016J\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u0013J\u001f\u0010(\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010$J!\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010\u0016J'\u0010+\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u00012\u0006\u0010,\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010-J\u001f\u0010.\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0016¢\u0006\u0004\b0\u0010\u001aJ\u000f\u00102\u001a\u000201H\u0017¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b4\u0010$R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u00100\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010;"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "p0", "<init>", "(Landroidx/collection/SimpleArrayMap;)V", "", "(I)V", "", "clear", "()V", "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "ensureCapacity", "equals", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "p1", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "getOrDefaultInternal", "hashCode", "()I", "indexOf", "(Ljava/lang/Object;I)I", "indexOfKey", "(Ljava/lang/Object;)I", "indexOfNull", "__restricted$indexOfValue", "isEmpty", "()Z", "keyAt", "(I)Ljava/lang/Object;", "put", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "size", "", "toString", "()Ljava/lang/String;", "valueAt", "", "array", "[Ljava/lang/Object;", "", "hashes", "[I", "I"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SimpleArrayMap<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap(int i) {
        int[] iArr;
        Object[] objArr;
        if (i == 0) {
            iArr = ContainerHelpersKt.EMPTY_INTS;
        } else {
            iArr = new int[i];
        }
        this.hashes = iArr;
        if (i == 0) {
            objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            objArr = new Object[i << 1];
        }
        this.array = objArr;
    }

    public /* synthetic */ SimpleArrayMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }

    private final int indexOf(K p0, int p1) {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i, p1);
        if (iBinarySearch < 0 || Intrinsics.areEqual(p0, this.array[iBinarySearch << 1])) {
            return iBinarySearch;
        }
        int i2 = iBinarySearch + 1;
        while (i2 < i && this.hashes[i2] == p1) {
            if (Intrinsics.areEqual(p0, this.array[i2 << 1])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iBinarySearch - 1; i3 >= 0 && this.hashes[i3] == p1; i3--) {
            if (Intrinsics.areEqual(p0, this.array[i3 << 1])) {
                return i3;
            }
        }
        return ~i2;
    }

    private final int indexOfNull() {
        int i = this.size;
        if (i == 0) {
            return -1;
        }
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.hashes, i, 0);
        if (iBinarySearch < 0 || this.array[iBinarySearch << 1] == null) {
            return iBinarySearch;
        }
        int i2 = iBinarySearch + 1;
        while (i2 < i && this.hashes[i2] == 0) {
            if (this.array[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iBinarySearch - 1; i3 >= 0 && this.hashes[i3] == 0; i3--) {
            if (this.array[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public void ensureCapacity(int p0) {
        int i = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < p0) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, p0);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, p0 * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            this.array = objArrCopyOf;
        }
        if (this.size != i) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K p0) {
        return indexOfKey(p0) >= 0;
    }

    public int indexOfKey(K p0) {
        if (p0 == null) {
            return indexOfNull();
        }
        return indexOf(p0, p0.hashCode());
    }

    public final int __restricted$indexOfValue(V p0) {
        int i = this.size * 2;
        Object[] objArr = this.array;
        if (p0 == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (Intrinsics.areEqual(p0, objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(V p0) {
        return __restricted$indexOfValue(p0) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object p0, T p1) {
        int iIndexOfKey = indexOfKey(p0);
        return iIndexOfKey >= 0 ? (T) this.array[(iIndexOfKey << 1) + 1] : p1;
    }

    public K keyAt(int p0) {
        if (p0 < 0 || p0 >= this.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(String.valueOf(p0)));
        }
        return (K) this.array[p0 << 1];
    }

    public V valueAt(int p0) {
        if (p0 < 0 || p0 >= this.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(String.valueOf(p0)));
        }
        return (V) this.array[(p0 << 1) + 1];
    }

    public V setValueAt(int p0, V p1) {
        if (p0 < 0 || p0 >= this.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(String.valueOf(p0)));
        }
        int i = (p0 << 1) + 1;
        Object[] objArr = this.array;
        V v = (V) objArr[i];
        objArr[i] = p1;
        return v;
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public V put(K p0, V p1) {
        int i = this.size;
        int iHashCode = p0 != null ? p0.hashCode() : 0;
        int iIndexOf = p0 != null ? indexOf(p0, iHashCode) : indexOfNull();
        if (iIndexOf >= 0) {
            int i2 = (iIndexOf << 1) + 1;
            Object[] objArr = this.array;
            V v = (V) objArr[i2];
            objArr[i2] = p1;
            return v;
        }
        int i3 = ~iIndexOf;
        int[] iArr = this.hashes;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i4 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            this.array = objArrCopyOf;
            if (i != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.hashes;
            int i5 = i3 + 1;
            ArraysKt.copyInto(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.array;
            ArraysKt.copyInto(objArr2, objArr2, i5 << 1, i3 << 1, this.size << 1);
        }
        int i6 = this.size;
        if (i == i6) {
            int[] iArr3 = this.hashes;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.array;
                int i7 = i3 << 1;
                objArr3[i7] = p0;
                objArr3[i7 + 1] = p1;
                this.size = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = p0.size;
        ensureCapacity(this.size + i);
        if (this.size != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(p0.keyAt(i2), p0.valueAt(i2));
            }
        } else if (i > 0) {
            ArraysKt.copyInto(p0.hashes, this.hashes, 0, 0, i);
            ArraysKt.copyInto(p0.array, this.array, 0, 0, i << 1);
            this.size = i;
        }
    }

    public V putIfAbsent(K p0, V p1) {
        V v = get(p0);
        return v == null ? put(p0, p1) : v;
    }

    public V remove(K p0) {
        int iIndexOfKey = indexOfKey(p0);
        if (iIndexOfKey >= 0) {
            return removeAt(iIndexOfKey);
        }
        return null;
    }

    public boolean remove(K p0, V p1) {
        int iIndexOfKey = indexOfKey(p0);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(p1, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public V removeAt(int p0) {
        if (p0 < 0 || p0 >= this.size) {
            RuntimeHelpersKt.throwIllegalArgumentException("Expected index to be within 0..size()-1, but was ".concat(String.valueOf(p0)));
        }
        Object[] objArr = this.array;
        int i = p0 << 1;
        V v = (V) objArr[i + 1];
        int i2 = this.size;
        if (i2 <= 1) {
            clear();
            return v;
        }
        int i3 = i2 - 1;
        int[] iArr = this.hashes;
        if (iArr.length > 8 && i2 < iArr.length / 3) {
            int i4 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i4 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            this.array = objArrCopyOf;
            if (i2 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (p0 > 0) {
                ArraysKt.copyInto(iArr, this.hashes, 0, 0, p0);
                ArraysKt.copyInto(objArr, this.array, 0, 0, i);
            }
            if (p0 < i3) {
                int i5 = p0 + 1;
                ArraysKt.copyInto(iArr, this.hashes, p0, i5, i2);
                ArraysKt.copyInto(objArr, this.array, i, i5 << 1, i2 << 1);
            }
        } else {
            if (p0 < i3) {
                int i6 = p0 + 1;
                ArraysKt.copyInto(iArr, iArr, p0, i6, i2);
                Object[] objArr2 = this.array;
                ArraysKt.copyInto(objArr2, objArr2, i, i6 << 1, i2 << 1);
            }
            Object[] objArr3 = this.array;
            int i7 = i3 << 1;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        }
        if (i2 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i3;
        return v;
    }

    public V replace(K p0, V p1) {
        int iIndexOfKey = indexOfKey(p0);
        if (iIndexOfKey >= 0) {
            return setValueAt(iIndexOfKey, p1);
        }
        return null;
    }

    public boolean replace(K p0, V p1, V p2) {
        int iIndexOfKey = indexOfKey(p0);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(p1, valueAt(iIndexOfKey))) {
            return false;
        }
        setValueAt(iIndexOfKey, p2);
        return true;
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        try {
            if (p0 instanceof SimpleArrayMap) {
                if (getSize() != ((SimpleArrayMap) p0).getSize()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) p0;
                int i = this.size;
                for (int i2 = 0; i2 < i; i2++) {
                    K kKeyAt = keyAt(i2);
                    V vValueAt = valueAt(i2);
                    Object obj = simpleArrayMap.get(kKeyAt);
                    if (vValueAt == null) {
                        if (obj != null || !simpleArrayMap.containsKey(kKeyAt)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(vValueAt, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(p0 instanceof Map) || getSize() != ((Map) p0).size()) {
                return false;
            }
            int i3 = this.size;
            for (int i4 = 0; i4 < i3; i4++) {
                K kKeyAt2 = keyAt(i4);
                V vValueAt2 = valueAt(i4);
                Object obj2 = ((Map) p0).get(kKeyAt2);
                if (vValueAt2 == null) {
                    if (obj2 != null || !((Map) p0).containsKey(kKeyAt2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(vValueAt2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i = this.size;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K kKeyAt = keyAt(i2);
            if (kKeyAt != sb) {
                sb.append(kKeyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vValueAt = valueAt(i2);
            if (vValueAt != sb) {
                sb.append(vValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public V get(K p0) {
        int iIndexOfKey = indexOfKey(p0);
        if (iIndexOfKey >= 0) {
            return (V) this.array[(iIndexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(Object p0, V p1) {
        int iIndexOfKey = indexOfKey(p0);
        return iIndexOfKey >= 0 ? (V) this.array[(iIndexOfKey << 1) + 1] : p1;
    }

    public SimpleArrayMap() {
        this(0, 1, null);
    }
}
