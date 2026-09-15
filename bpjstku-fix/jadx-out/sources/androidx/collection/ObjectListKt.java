package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\b\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\n\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\f\u001a0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r\"\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u000e\u001a\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0003\u001a#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0011\u001a3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0012\u001a/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r\"\u00028\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0013\u001a\u001f\u0010\u0017\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0007\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0007\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {ExifInterface.LONGITUDE_EAST, "Landroidx/collection/ObjectList;", "emptyObjectList", "()Landroidx/collection/ObjectList;", "Landroidx/collection/MutableObjectList;", "mutableObjectListOf", "()Landroidx/collection/MutableObjectList;", "p0", "(Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "p1", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "", "([Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "objectListOf", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "([Ljava/lang/Object;)Landroidx/collection/ObjectList;", "", "", "", "checkIndex", "(Ljava/util/List;I)V", "checkSubIndex", "(Ljava/util/List;II)V", "", "EmptyArray", "[Ljava/lang/Object;", "EmptyObjectList", "Landroidx/collection/ObjectList;"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ObjectListKt {
    private static final Object[] EmptyArray = new Object[0];
    private static final ObjectList<Object> EmptyObjectList = new MutableObjectList(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkIndex(List<?> list, int i) {
        int size = list.size();
        if (i < 0 || i >= size) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" is out of bounds. The list has ");
            sb.append(size);
            sb.append(" elements.");
            RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkSubIndex(List<?> list, int i, int i2) {
        int size = list.size();
        if (i > i2) {
            StringBuilder sb = new StringBuilder("Indices are out of order. fromIndex (");
            sb.append(i);
            sb.append(") is greater than toIndex (");
            sb.append(i2);
            sb.append(").");
            RuntimeHelpersKt.throwIllegalArgumentException(sb.toString());
        }
        if (i < 0) {
            StringBuilder sb2 = new StringBuilder("fromIndex (");
            sb2.append(i);
            sb2.append(") is less than 0.");
            RuntimeHelpersKt.throwIndexOutOfBoundsException(sb2.toString());
        }
        if (i2 > size) {
            StringBuilder sb3 = new StringBuilder("toIndex (");
            sb3.append(i2);
            sb3.append(") is more than than the list size (");
            sb3.append(size);
            sb3.append(')');
            RuntimeHelpersKt.throwIndexOutOfBoundsException(sb3.toString());
        }
    }

    public static final <E> ObjectList<E> emptyObjectList() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        Intrinsics.checkNotNull(objectList, "");
        return objectList;
    }

    public static final <E> ObjectList<E> objectListOf() {
        ObjectList<E> objectList = (ObjectList<E>) EmptyObjectList;
        Intrinsics.checkNotNull(objectList, "");
        return objectList;
    }

    public static final <E> ObjectList<E> objectListOf(E e2) {
        return mutableObjectListOf(e2);
    }

    public static final <E> ObjectList<E> objectListOf(E e2, E e3) {
        return mutableObjectListOf(e2, e3);
    }

    public static final <E> ObjectList<E> objectListOf(E e2, E e3, E e4) {
        return mutableObjectListOf(e2, e3, e4);
    }

    public static final <E> ObjectList<E> objectListOf(E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "");
        MutableObjectList mutableObjectList = new MutableObjectList(eArr.length);
        mutableObjectList.plusAssign((Object[]) eArr);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf() {
        return new MutableObjectList<>(0, 1, null);
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e2) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(1);
        mutableObjectList.add(e2);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e2, E e3) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(2);
        mutableObjectList.add(e2);
        mutableObjectList.add(e3);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E e2, E e3, E e4) {
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(3);
        mutableObjectList.add(e2);
        mutableObjectList.add(e3);
        mutableObjectList.add(e4);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E... eArr) {
        Intrinsics.checkNotNullParameter(eArr, "");
        MutableObjectList<E> mutableObjectList = new MutableObjectList<>(eArr.length);
        mutableObjectList.plusAssign((Object[]) eArr);
        return mutableObjectList;
    }
}
