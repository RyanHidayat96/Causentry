package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0014\u0010\u0006J\u001a\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010 \u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010\u0017J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\u0006J!\u0010#\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b#\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010\u0006J\u001f\u0010'\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u0017J'\u0010)\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010+J\u001f\u0010,\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010\nJ\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b2\u0010\u0016R\u0016\u00103\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0011\u0010\u001c\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b5\u0010\u001dR\u0016\u00107\u001a\u0002068\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010-\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b-\u00109R\u001e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0:8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"Landroidx/collection/SparseArrayCompat;", ExifInterface.LONGITUDE_EAST, "", "", "p0", "<init>", "(I)V", "p1", "", "append", "(ILjava/lang/Object;)V", "clear", "()V", "clone", "()Landroidx/collection/SparseArrayCompat;", "", "containsKey", "(I)Z", "containsValue", "(Ljava/lang/Object;)Z", "delete", "get", "(I)Ljava/lang/Object;", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "(I)I", "indexOfValue", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "keyAt", "put", "putAll", "(Landroidx/collection/SparseArrayCompat;)V", "putIfAbsent", "remove", "", "(ILjava/lang/Object;)Z", "removeAt", "removeAtRange", "(II)V", "replace", "p2", "(ILjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "size", "()I", "", "toString", "()Ljava/lang/String;", "valueAt", "garbage", "Z", "getIsEmpty", "", UserMetadata.KEYDATA_FILENAME, "[I", "I", "", "values", "[Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SparseArrayCompat<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ int[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public SparseArrayCompat(int i) {
        if (i == 0) {
            this.keys = ContainerHelpersKt.EMPTY_INTS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i);
            this.keys = new int[iIdealIntArraySize];
            this.values = new Object[iIdealIntArraySize];
        }
    }

    public /* synthetic */ SparseArrayCompat(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> m355clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "");
        SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) objClone;
        sparseArrayCompat.keys = (int[]) this.keys.clone();
        sparseArrayCompat.values = (Object[]) this.values.clone();
        return sparseArrayCompat;
    }

    public E get(int p0) {
        return (E) SparseArrayCompatKt.commonGet(this, p0);
    }

    public E get(int p0, E p1) {
        return (E) SparseArrayCompatKt.commonGet(this, p0, p1);
    }

    @Deprecated(message = "Alias for remove(int).", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(int p0) {
        remove(p0);
    }

    public void remove(int p0) {
        SparseArrayCompatKt.commonRemove(this, p0);
    }

    public final boolean getIsEmpty() {
        return isEmpty();
    }

    public boolean remove(int p0, Object p1) {
        int iIndexOfKey = indexOfKey(p0);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(p1, valueAt(iIndexOfKey))) {
            return false;
        }
        removeAt(iIndexOfKey);
        return true;
    }

    public void removeAt(int p0) {
        if (this.values[p0] != SparseArrayCompatKt.DELETED) {
            this.values[p0] = SparseArrayCompatKt.DELETED;
            this.garbage = true;
        }
    }

    public void removeAtRange(int p0, int p1) {
        int iMin = Math.min(p1, p0 + p1);
        while (p0 < iMin) {
            removeAt(p0);
            p0++;
        }
    }

    public E replace(int p0, E p1) {
        int iIndexOfKey = indexOfKey(p0);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e2 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = p1;
        return e2;
    }

    public boolean replace(int p0, E p1, E p2) {
        int iIndexOfKey = indexOfKey(p0);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(this.values[iIndexOfKey], p1)) {
            return false;
        }
        this.values[iIndexOfKey] = p2;
        return true;
    }

    public void put(int p0, E p1) {
        int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, p0);
        if (iBinarySearch >= 0) {
            this.values[iBinarySearch] = p1;
            return;
        }
        int i = ~iBinarySearch;
        if (i < this.size && this.values[i] == SparseArrayCompatKt.DELETED) {
            this.keys[i] = p0;
            this.values[i] = p1;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
            i = ~ContainerHelpersKt.binarySearch(this.keys, this.size, p0);
        }
        int i2 = this.size;
        if (i2 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i2 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            this.values = objArrCopyOf;
        }
        int i3 = this.size;
        if (i3 - i != 0) {
            int[] iArr = this.keys;
            int i4 = i + 1;
            ArraysKt.copyInto(iArr, iArr, i4, i, i3);
            Object[] objArr = this.values;
            ArraysKt.copyInto(objArr, objArr, i4, i, this.size);
        }
        this.keys[i] = p0;
        this.values[i] = p1;
        this.size++;
    }

    public void putAll(SparseArrayCompat<? extends E> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        int size = p0.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = p0.keyAt(i);
            E eValueAt = p0.valueAt(i);
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = eValueAt;
            } else {
                int i2 = ~iBinarySearch;
                if (i2 < this.size && this.values[i2] == SparseArrayCompatKt.DELETED) {
                    this.keys[i2] = iKeyAt;
                    this.values[i2] = eValueAt;
                } else {
                    if (this.garbage && this.size >= this.keys.length) {
                        SparseArrayCompatKt.gc(this);
                        i2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, iKeyAt);
                    }
                    int i3 = this.size;
                    if (i3 >= this.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i3 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
                        this.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                        this.values = objArrCopyOf;
                    }
                    int i4 = this.size;
                    if (i4 - i2 != 0) {
                        int[] iArr = this.keys;
                        int i5 = i2 + 1;
                        ArraysKt.copyInto(iArr, iArr, i5, i2, i4);
                        Object[] objArr = this.values;
                        ArraysKt.copyInto(objArr, objArr, i5, i2, this.size);
                    }
                    this.keys[i2] = iKeyAt;
                    this.values[i2] = eValueAt;
                    this.size++;
                }
            }
        }
    }

    public E putIfAbsent(int p0, E p1) {
        E e2 = (E) SparseArrayCompatKt.commonGet(this, p0);
        if (e2 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, p0);
            if (iBinarySearch >= 0) {
                this.values[iBinarySearch] = p1;
                return e2;
            }
            int i = ~iBinarySearch;
            if (i < this.size && this.values[i] == SparseArrayCompatKt.DELETED) {
                this.keys[i] = p0;
                this.values[i] = p1;
                return e2;
            }
            if (this.garbage && this.size >= this.keys.length) {
                SparseArrayCompatKt.gc(this);
                i = ~ContainerHelpersKt.binarySearch(this.keys, this.size, p0);
            }
            int i2 = this.size;
            if (i2 >= this.keys.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i2 + 1);
                int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
                this.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                this.values = objArrCopyOf;
            }
            int i3 = this.size;
            if (i3 - i != 0) {
                int[] iArr = this.keys;
                int i4 = i + 1;
                ArraysKt.copyInto(iArr, iArr, i4, i, i3);
                Object[] objArr = this.values;
                ArraysKt.copyInto(objArr, objArr, i4, i, this.size);
            }
            this.keys[i] = p0;
            this.values[i] = p1;
            this.size++;
        }
        return e2;
    }

    public int size() {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int keyAt(int p0) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return this.keys[p0];
    }

    public E valueAt(int p0) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        Object[] objArr = this.values;
        if (p0 >= objArr.length) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) objArr[p0];
    }

    public void setValueAt(int p0, E p1) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        this.values[p0] = p1;
    }

    public int indexOfKey(int p0) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, p0);
    }

    public int indexOfValue(E p0) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.values[i2] == p0) {
                return i2;
            }
        }
        return -1;
    }

    public boolean containsKey(int p0) {
        return indexOfKey(p0) >= 0;
    }

    public boolean containsValue(E p0) {
        if (this.garbage) {
            SparseArrayCompatKt.gc(this);
        }
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.values[i2] == p0) {
                if (i2 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void clear() {
        int i = this.size;
        Object[] objArr = this.values;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public void append(int p0, E p1) {
        int i = this.size;
        if (i != 0 && p0 <= this.keys[i - 1]) {
            put(p0, p1);
            return;
        }
        if (this.garbage && i >= this.keys.length) {
            SparseArrayCompatKt.gc(this);
        }
        int i2 = this.size;
        if (i2 >= this.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i2 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            this.values = objArrCopyOf;
        }
        this.keys[i2] = p0;
        this.values[i2] = p1;
        this.size = i2 + 1;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i2));
            sb.append('=');
            E eValueAt = valueAt(i2);
            if (eValueAt != this) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public SparseArrayCompat() {
        this(0, 1, null);
    }
}
