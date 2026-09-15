package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u000b\b\u0001\u0018\u0000 ,*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001,B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0006\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0017J%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\r\u0010\u0018J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0006\u001a\u00020\tH\u0017¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b$\u0010%J%\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00028\u0000H\u0017¢\u0006\u0004\b&\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "", "", "p0", "<init>", "([Ljava/lang/Object;)V", "", "bufferOfSize", "(I)[Ljava/lang/Object;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "add", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/Function1;", "", "removeAll", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "p1", "(ILjava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeAt", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "buffer", "[Ljava/lang/Object;", "getSize", "()I", "size", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {
    private final Object[] buffer;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);

    public SmallPersistentVector(Object[] objArr) {
        this.buffer = objArr;
        CommonFunctionsKt.m3653assert(objArr.length <= 32);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final /* bridge */ /* synthetic */ PersistentCollection addAll(Collection collection) {
        return addAll(collection);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.buffer.length;
    }

    private final Object[] bufferOfSize(int p0) {
        return new Object[p0];
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final PersistentList<E> add(E p0) {
        if (size() < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            objArrCopyOf[size()] = p0;
            return new SmallPersistentVector(objArrCopyOf);
        }
        return new PersistentVector(this.buffer, UtilsKt.presizedBufferWith(p0), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final PersistentList<E> addAll(Collection<? extends E> p0) {
        if (size() + p0.size() <= 32) {
            Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() + p0.size());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            int size = size();
            Iterator<? extends E> it = p0.iterator();
            while (it.hasNext()) {
                objArrCopyOf[size] = it.next();
                size++;
            }
            return new SmallPersistentVector(objArrCopyOf);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(p0);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final PersistentList<E> removeAll(Function1<? super E, Boolean> p0) {
        Object[] objArrCopyOf = this.buffer;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.buffer[i];
            if (p0.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr = this.buffer;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return EMPTY;
        }
        return new SmallPersistentVector(ArraysKt.copyOfRange(objArrCopyOf, 0, size));
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList<E> addAll(int p0, Collection<? extends E> p1) {
        ListImplementation.checkPositionIndex$runtime(p0, size());
        if (size() + p1.size() <= 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + p1.size());
            ArraysKt.copyInto$default(this.buffer, objArrBufferOfSize, 0, 0, p0, 6, (Object) null);
            ArraysKt.copyInto(this.buffer, objArrBufferOfSize, p1.size() + p0, p0, size());
            Iterator<? extends E> it = p1.iterator();
            while (it.hasNext()) {
                objArrBufferOfSize[p0] = it.next();
                p0++;
            }
            return new SmallPersistentVector(objArrBufferOfSize);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(p0, p1);
        return builder.build();
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList<E> add(int p0, E p1) {
        ListImplementation.checkPositionIndex$runtime(p0, size());
        if (p0 == size()) {
            return add((Object) p1);
        }
        if (size() < 32) {
            Object[] objArrBufferOfSize = bufferOfSize(size() + 1);
            ArraysKt.copyInto$default(this.buffer, objArrBufferOfSize, 0, 0, p0, 6, (Object) null);
            ArraysKt.copyInto(this.buffer, objArrBufferOfSize, p0 + 1, p0, size());
            objArrBufferOfSize[p0] = p1;
            return new SmallPersistentVector(objArrBufferOfSize);
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        ArraysKt.copyInto(this.buffer, objArrCopyOf, p0 + 1, p0, size() - 1);
        objArrCopyOf[p0] = p1;
        return new PersistentVector(objArrCopyOf, UtilsKt.presizedBufferWith(this.buffer[31]), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList<E> removeAt(int p0) {
        ListImplementation.checkElementIndex$runtime(p0, size());
        if (size() == 1) {
            return EMPTY;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.buffer, size() - 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        ArraysKt.copyInto(this.buffer, objArrCopyOf, p0, p0 + 1, size());
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object p0) {
        return ArraysKt.indexOf(this.buffer, p0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object p0) {
        return ArraysKt.lastIndexOf(this.buffer, p0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int p0) {
        ListImplementation.checkPositionIndex$runtime(p0, size());
        return new BufferIterator(this.buffer, p0, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final E get(int p0) {
        ListImplementation.checkElementIndex$runtime(p0, size());
        return (E) this.buffer[p0];
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final PersistentList<E> set(int p0, E p1) {
        ListImplementation.checkElementIndex$runtime(p0, size());
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[p0] = p1;
        return new SmallPersistentVector(objArrCopyOf);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "getEMPTY", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
