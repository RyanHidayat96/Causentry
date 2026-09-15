package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0010\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u000f\u0010\u0010JE\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u000f\u0010\u0015J7\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JI\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010!JA\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J?\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010#J)\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020&0%H\u0017¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0017¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010\u0006\u001a\u00020\bH\u0017¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0006\u001a\u00020\bH\u0002¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b1\u00102J%\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0017¢\u0006\u0004\b3\u0010\u0015JA\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b4\u00105R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u001a\u00109\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u000eR\u0014\u0010<\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010:"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "", "", "p0", "p1", "", "p2", "p3", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "rootSize", "()I", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "pushFilledTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "pushTail", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "insertIntoTail", "([Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "p4", "insertIntoRoot", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "removeAt", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeFromTailAt", "([Ljava/lang/Object;III)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "pullLastBufferFromRoot", "([Ljava/lang/Object;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "pullLastBuffer", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "removeFromRootAt", "Lkotlin/Function1;", "", "removeAll", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "", "listIterator", "(I)Ljava/util/ListIterator;", "bufferFor", "(I)[Ljava/lang/Object;", "get", "(I)Ljava/lang/Object;", "set", "setInRoot", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "root", "[Ljava/lang/Object;", "tail", "size", "I", "getSize", "rootShift"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PersistentVector<E> extends AbstractPersistentList<E> implements PersistentList<E> {
    public static final int $stable = 8;
    private final Object[] root;
    private final int rootShift;
    private final int size;
    private final Object[] tail;

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.size;
    }

    public PersistentVector(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i;
        this.rootShift = i2;
        if (size() <= 32) {
            StringBuilder sb = new StringBuilder("Trie-based persistent vector should have at least 33 elements, got ");
            sb.append(size());
            PreconditionsKt.throwIllegalArgumentException(sb.toString());
        }
        CommonFunctionsKt.m3653assert(size() - UtilsKt.rootSize(size()) <= RangesKt.coerceAtMost(objArr2.length, 32));
    }

    private final int rootSize() {
        return UtilsKt.rootSize(size());
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final PersistentList<E> add(E p0) {
        int size = size() - rootSize();
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            objArrCopyOf[size] = p0;
            return new PersistentVector(this.root, objArrCopyOf, size() + 1, this.rootShift);
        }
        return pushFilledTail(this.root, this.tail, UtilsKt.presizedBufferWith(p0));
    }

    private final PersistentVector<E> pushFilledTail(Object[] p0, Object[] p1, Object[] p2) {
        int size = size();
        int i = this.rootShift;
        if ((size >> 5) > (1 << i)) {
            Object[] objArrPresizedBufferWith = UtilsKt.presizedBufferWith(p0);
            int i2 = this.rootShift + 5;
            return new PersistentVector<>(pushTail(objArrPresizedBufferWith, i2, p1), p2, size() + 1, i2);
        }
        return new PersistentVector<>(pushTail(p0, i, p1), p2, size() + 1, this.rootShift);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    private final Object[] pushTail(Object[] p0, int p1, Object[] p2) {
        Object[] objArrCopyOf;
        int iIndexSegment = UtilsKt.indexSegment(size() - 1, p1);
        if (p0 != null) {
            objArrCopyOf = Arrays.copyOf(p0, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (p1 == 5) {
            objArrCopyOf[iIndexSegment] = p2;
            return objArrCopyOf;
        }
        objArrCopyOf[iIndexSegment] = pushTail((Object[]) objArrCopyOf[iIndexSegment], p1 - 5, p2);
        return objArrCopyOf;
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList<E> add(int p0, E p1) {
        ListImplementation.checkPositionIndex$runtime(p0, size());
        if (p0 == size()) {
            return add((Object) p1);
        }
        int iRootSize = rootSize();
        if (p0 >= iRootSize) {
            return insertIntoTail(this.root, p0 - iRootSize, p1);
        }
        ObjectRef objectRef = new ObjectRef(null);
        return insertIntoTail(insertIntoRoot(this.root, this.rootShift, p0, p1, objectRef), 0, objectRef.getValue());
    }

    private final PersistentVector<E> insertIntoTail(Object[] p0, int p1, Object p2) {
        int size = size() - rootSize();
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        if (size < 32) {
            ArraysKt.copyInto(this.tail, objArrCopyOf, p1 + 1, p1, size);
            objArrCopyOf[p1] = p2;
            return new PersistentVector<>(p0, objArrCopyOf, size() + 1, this.rootShift);
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        ArraysKt.copyInto(objArr, objArrCopyOf, p1 + 1, p1, size - 1);
        objArrCopyOf[p1] = p2;
        return pushFilledTail(p0, objArrCopyOf, UtilsKt.presizedBufferWith(obj));
    }

    private final Object[] insertIntoRoot(Object[] p0, int p1, int p2, Object p3, ObjectRef p4) {
        Object[] objArrCopyOf;
        int iIndexSegment = UtilsKt.indexSegment(p2, p1);
        if (p1 == 0) {
            if (iIndexSegment != 0) {
                objArrCopyOf = Arrays.copyOf(p0, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            } else {
                objArrCopyOf = new Object[32];
            }
            ArraysKt.copyInto(p0, objArrCopyOf, iIndexSegment + 1, iIndexSegment, 31);
            p4.setValue(p0[31]);
            objArrCopyOf[iIndexSegment] = p3;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(p0, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "");
        int i = p1 - 5;
        Object obj = p0[iIndexSegment];
        Intrinsics.checkNotNull(obj, "");
        objArrCopyOf2[iIndexSegment] = insertIntoRoot((Object[]) obj, i, p2, p3, p4);
        while (true) {
            iIndexSegment++;
            if (iIndexSegment >= 32 || objArrCopyOf2[iIndexSegment] == null) {
                break;
            }
            Object obj2 = p0[iIndexSegment];
            Intrinsics.checkNotNull(obj2, "");
            objArrCopyOf2[iIndexSegment] = insertIntoRoot((Object[]) obj2, i, 0, p4.getValue(), p4);
        }
        return objArrCopyOf2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList<E> removeAt(int p0) {
        ListImplementation.checkElementIndex$runtime(p0, size());
        int iRootSize = rootSize();
        if (p0 >= iRootSize) {
            return removeFromTailAt(this.root, iRootSize, this.rootShift, p0 - iRootSize);
        }
        return removeFromTailAt(removeFromRootAt(this.root, this.rootShift, p0, new ObjectRef(this.tail[0])), iRootSize, this.rootShift, 0);
    }

    private final PersistentList<E> removeFromTailAt(Object[] p0, int p1, int p2, int p3) {
        int size = size() - p1;
        CommonFunctionsKt.m3653assert(p3 < size);
        if (size == 1) {
            return pullLastBufferFromRoot(p0, p1, p2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        int i = size - 1;
        if (p3 < i) {
            ArraysKt.copyInto(this.tail, objArrCopyOf, p3, p3 + 1, size);
        }
        objArrCopyOf[i] = null;
        return new PersistentVector(p0, objArrCopyOf, (p1 + size) - 1, p2);
    }

    private final PersistentList<E> pullLastBufferFromRoot(Object[] p0, int p1, int p2) {
        if (p2 == 0) {
            if (p0.length == 33) {
                p0 = Arrays.copyOf(p0, 32);
                Intrinsics.checkNotNullExpressionValue(p0, "");
            }
            return new SmallPersistentVector(p0);
        }
        ObjectRef objectRef = new ObjectRef(null);
        Object[] objArrPullLastBuffer = pullLastBuffer(p0, p2, p1 - 1, objectRef);
        Intrinsics.checkNotNull(objArrPullLastBuffer);
        Object value = objectRef.getValue();
        Intrinsics.checkNotNull(value, "");
        Object[] objArr = (Object[]) value;
        if (objArrPullLastBuffer[1] == null) {
            Object obj = objArrPullLastBuffer[0];
            Intrinsics.checkNotNull(obj, "");
            return new PersistentVector((Object[]) obj, objArr, p1, p2 - 5);
        }
        return new PersistentVector(objArrPullLastBuffer, objArr, p1, p2);
    }

    private final Object[] pullLastBuffer(Object[] p0, int p1, int p2, ObjectRef p3) {
        Object[] objArrPullLastBuffer;
        int iIndexSegment = UtilsKt.indexSegment(p2, p1);
        if (p1 == 5) {
            p3.setValue(p0[iIndexSegment]);
            objArrPullLastBuffer = null;
        } else {
            Object obj = p0[iIndexSegment];
            Intrinsics.checkNotNull(obj, "");
            objArrPullLastBuffer = pullLastBuffer((Object[]) obj, p1 - 5, p2, p3);
        }
        if (objArrPullLastBuffer == null && iIndexSegment == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(p0, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[iIndexSegment] = objArrPullLastBuffer;
        return objArrCopyOf;
    }

    private final Object[] removeFromRootAt(Object[] p0, int p1, int p2, ObjectRef p3) {
        Object[] objArrCopyOf;
        int iIndexSegment = UtilsKt.indexSegment(p2, p1);
        if (p1 == 0) {
            if (iIndexSegment != 0) {
                objArrCopyOf = Arrays.copyOf(p0, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            } else {
                objArrCopyOf = new Object[32];
            }
            ArraysKt.copyInto(p0, objArrCopyOf, iIndexSegment, iIndexSegment + 1, 32);
            objArrCopyOf[31] = p3.getValue();
            p3.setValue(p0[iIndexSegment]);
            return objArrCopyOf;
        }
        int iIndexSegment2 = p0[31] == null ? UtilsKt.indexSegment(rootSize() - 1, p1) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(p0, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "");
        int i = p1 - 5;
        int i2 = iIndexSegment + 1;
        if (i2 <= iIndexSegment2) {
            while (true) {
                Object obj = objArrCopyOf2[iIndexSegment2];
                Intrinsics.checkNotNull(obj, "");
                objArrCopyOf2[iIndexSegment2] = removeFromRootAt((Object[]) obj, i, 0, p3);
                if (iIndexSegment2 == i2) {
                    break;
                }
                iIndexSegment2--;
            }
        }
        Object obj2 = objArrCopyOf2[iIndexSegment];
        Intrinsics.checkNotNull(obj2, "");
        objArrCopyOf2[iIndexSegment] = removeFromRootAt((Object[]) obj2, i, p2, p3);
        return objArrCopyOf2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final PersistentList<E> removeAll(Function1<? super E, Boolean> p0) {
        PersistentVectorBuilder<E> persistentVectorBuilderBuilder = builder();
        persistentVectorBuilderBuilder.removeAllWithPredicate(p0);
        return persistentVectorBuilderBuilder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final PersistentVectorBuilder<E> builder() {
        return new PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int p0) {
        ListImplementation.checkPositionIndex$runtime(p0, size());
        return new PersistentVectorIterator(this.root, this.tail, p0, size(), (this.rootShift / 5) + 1);
    }

    private final Object[] bufferFor(int p0) {
        if (rootSize() <= p0) {
            return this.tail;
        }
        Object[] objArr = this.root;
        for (int i = this.rootShift; i > 0; i -= 5) {
            Object[] objArr2 = objArr[UtilsKt.indexSegment(p0, i)];
            Intrinsics.checkNotNull(objArr2, "");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final E get(int p0) {
        ListImplementation.checkElementIndex$runtime(p0, size());
        return (E) bufferFor(p0)[p0 & 31];
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList<E> set(int p0, E p1) {
        ListImplementation.checkElementIndex$runtime(p0, size());
        if (rootSize() <= p0) {
            Object[] objArrCopyOf = Arrays.copyOf(this.tail, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            objArrCopyOf[p0 & 31] = p1;
            return new PersistentVector(this.root, objArrCopyOf, size(), this.rootShift);
        }
        return new PersistentVector(setInRoot(this.root, this.rootShift, p0, p1), this.tail, size(), this.rootShift);
    }

    private final Object[] setInRoot(Object[] p0, int p1, int p2, Object p3) {
        int iIndexSegment = UtilsKt.indexSegment(p2, p1);
        Object[] objArrCopyOf = Arrays.copyOf(p0, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        if (p1 == 0) {
            objArrCopyOf[iIndexSegment] = p3;
            return objArrCopyOf;
        }
        Object obj = objArrCopyOf[iIndexSegment];
        Intrinsics.checkNotNull(obj, "");
        objArrCopyOf[iIndexSegment] = setInRoot((Object[]) obj, p1 - 5, p2, p3);
        return objArrCopyOf;
    }
}
