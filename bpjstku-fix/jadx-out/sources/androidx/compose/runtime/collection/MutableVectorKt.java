package androidx.compose.runtime.collection;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\t\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\b\u001a(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0006\b\u0000\u0010\u000f\u0018\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001aG\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0006\b\u0000\u0010\u000f\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\u0011\u0010\u0014\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0006\b\u0000\u0010\u000f\u0018\u0001H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a2\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0006\b\u0000\u0010\u000f\u0018\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0017\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0018"}, d2 = {"", "", "p0", "", "checkIndex", "(Ljava/util/List;I)V", "p1", "throwListIndexOutOfBoundsException", "(II)V", "checkSubIndex", "(Ljava/util/List;II)V", "throwOutOfRangeException", "throwNegativeIndexException", "(I)V", "throwReversedIndicesException", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/collection/MutableVector;", "MutableVector", "(I)Landroidx/compose/runtime/collection/MutableVector;", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/collection/MutableVector;", "mutableVectorOf", "()Landroidx/compose/runtime/collection/MutableVector;", "", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MutableVectorKt {
    public static final void checkIndex(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            throwListIndexOutOfBoundsException(i, size);
        }
    }

    private static final void throwListIndexOutOfBoundsException(int i, int i2) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" is out of bounds. The list has ");
        sb.append(i2);
        sb.append(" elements.");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static final void checkSubIndex(List<?> list, int i, int i2) {
        if (i > i2) {
            throwReversedIndicesException(i, i2);
        }
        if (i < 0) {
            throwNegativeIndexException(i);
        }
        if (i2 > list.size()) {
            throwOutOfRangeException(i2, list.size());
        }
    }

    private static final void throwOutOfRangeException(int i, int i2) {
        StringBuilder sb = new StringBuilder("toIndex (");
        sb.append(i);
        sb.append(") is more than than the list size (");
        sb.append(i2);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private static final void throwNegativeIndexException(int i) {
        StringBuilder sb = new StringBuilder("fromIndex (");
        sb.append(i);
        sb.append(") is less than 0.");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private static final void throwReversedIndicesException(int i, int i2) {
        StringBuilder sb = new StringBuilder("Indices are out of order. fromIndex (");
        sb.append(i);
        sb.append(") is greater than toIndex (");
        sb.append(i2);
        sb.append(").");
        throw new IllegalArgumentException(sb.toString());
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i) {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector<>(new Object[i], 0);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 16;
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[i], 0);
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i, Function1<? super Integer, ? extends T> function1) {
        Intrinsics.reifiedOperationMarker(0, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = function1.invoke(Integer.valueOf(i2));
        }
        return new MutableVector<>(objArr, i);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        return new MutableVector<>(tArr, tArr.length);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector<>(new Object[16], 0);
    }
}
