package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b*\b\u0001\u0018\u0000 a*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001aB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0003H\u0002¢\u0006\u0004\b!\u0010\"J=\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010 JG\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010(J-\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010\u0014J%\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b0\u00101J)\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u000302H\u0002¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b5\u00101J)\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00028\u00002\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u000302H\u0002¢\u0006\u0004\b6\u00104J3\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u0002072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u00109J/\u0010:\u001a\u0004\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u0002072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b:\u0010;J/\u0010<\u001a\u0004\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u0002072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b?\u0010@J%\u0010A\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\bA\u0010BJ?\u0010C\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u0002072\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u000302H\u0007¢\u0006\u0004\bC\u0010DJ9\u0010E\u001a\u0004\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u0002072\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u000302¢\u0006\u0004\bE\u0010FJ9\u0010G\u001a\u0004\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u0002072\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u000302¢\u0006\u0004\bG\u0010FJ#\u0010H\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\bH\u0010IJ-\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\bJ\u0010KJ9\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00032\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u000302H\u0007¢\u0006\u0004\bL\u0010MJ-\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\bN\u0010KJ9\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00032\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u000302H\u0007¢\u0006\u0004\bO\u0010MR\"\u0010P\u001a\u00020\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010>\"\u0004\bS\u0010TR*\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010[\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", ExifInterface.LONGITUDE_EAST, "", "", "p0", "", "p1", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "p2", "<init>", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(I[Ljava/lang/Object;)V", "", "hasNoCellAt", "(I)Z", "indexOfCellAt$runtime", "(I)I", "elementAtIndex", "(I)Ljava/lang/Object;", "nodeAtIndex", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "addElementAt", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAddElementAt", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "updateNodeAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableUpdateNodeAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "p3", "p4", "makeNodeAtIndex", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableMoveElementToNode", "p5", "makeNode", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "removeCellAtIndex", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableRemoveCellAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionRemoveElementAtIndex", "mutableCollisionRemoveElementAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "(Ljava/lang/Object;)Z", "collisionAdd", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "mutableCollisionAdd", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionRemove", "mutableCollisionRemove", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableCollisionAddAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionRetainAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Ljava/lang/Object;", "mutableCollisionRemoveAll", "calculateSize", "()I", "elementsIdentityEquals", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)Z", "contains", "(ILjava/lang/Object;I)Z", "mutableAddAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableRetainAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Ljava/lang/Object;", "mutableRemoveAll", "containsAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;I)Z", "add", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "remove", "mutableRemove", "bitmap", "I", "getBitmap", "setBitmap", "(I)V", "buffer", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrieNode<E> {
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);

    public TrieNode(int i, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final void setBitmap(int i) {
        this.bitmap = i;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final void setBuffer(Object[] objArr) {
        this.buffer = objArr;
    }

    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final void setOwnedBy(MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    public TrieNode(int i, Object[] objArr) {
        this(i, objArr, null);
    }

    private final boolean hasNoCellAt(int p0) {
        return (p0 & this.bitmap) == 0;
    }

    public final int indexOfCellAt$runtime(int p0) {
        return Integer.bitCount((p0 - 1) & this.bitmap);
    }

    private final E elementAtIndex(int p0) {
        return (E) this.buffer[p0];
    }

    private final TrieNode<E> nodeAtIndex(int p0) {
        Object obj = this.buffer[p0];
        Intrinsics.checkNotNull(obj, "");
        return (TrieNode) obj;
    }

    private final TrieNode<E> addElementAt(int p0, E p1) {
        return new TrieNode<>(p0 | this.bitmap, TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime(p0), p1));
    }

    private final TrieNode<E> mutableAddElementAt(int p0, E p1, MutabilityOwnership p2) {
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(p0);
        if (this.ownedBy == p2) {
            this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, iIndexOfCellAt$runtime, p1);
            this.bitmap = p0 | this.bitmap;
            return this;
        }
        return new TrieNode<>(p0 | this.bitmap, TrieNodeKt.addElementAtIndex(this.buffer, iIndexOfCellAt$runtime, p1), p2);
    }

    private final TrieNode<E> updateNodeAtIndex(int p0, TrieNode<E> p1) {
        Object[] objArr = p1.buffer;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    p1.bitmap = this.bitmap;
                    return p1;
                }
                p1 = (TrieNode<E>) obj;
            }
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[p0] = p1;
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    private final TrieNode<E> mutableUpdateNodeAtIndex(int p0, TrieNode<E> p1, MutabilityOwnership p2) {
        Object[] objArr = p1.buffer;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    p1.bitmap = this.bitmap;
                    return p1;
                }
                p1 = (TrieNode<E>) obj;
            }
        }
        if (this.ownedBy == p2) {
            this.buffer[p0] = p1;
            return this;
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[p0] = p1;
        return new TrieNode<>(this.bitmap, objArrCopyOf, p2);
    }

    private final TrieNode<E> makeNodeAtIndex(int p0, int p1, E p2, int p3, MutabilityOwnership p4) {
        E eElementAtIndex = elementAtIndex(p0);
        return makeNode(eElementAtIndex != null ? eElementAtIndex.hashCode() : 0, eElementAtIndex, p1, p2, p3 + 5, p4);
    }

    private final TrieNode<E> moveElementToNode(int p0, int p1, E p2, int p3) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[p0] = makeNodeAtIndex(p0, p1, p2, p3, null);
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    private final TrieNode<E> mutableMoveElementToNode(int p0, int p1, E p2, int p3, MutabilityOwnership p4) {
        if (this.ownedBy == p4) {
            this.buffer[p0] = makeNodeAtIndex(p0, p1, p2, p3, p4);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[p0] = makeNodeAtIndex(p0, p1, p2, p3, p4);
        return new TrieNode<>(this.bitmap, objArrCopyOf, p4);
    }

    private final TrieNode<E> makeNode(int p0, E p1, int p2, E p3, int p4, MutabilityOwnership p5) {
        Object[] objArr;
        if (p4 > 30) {
            return new TrieNode<>(0, new Object[]{p1, p3}, p5);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(p0, p4);
        int iIndexSegment2 = TrieNodeKt.indexSegment(p2, p4);
        if (iIndexSegment != iIndexSegment2) {
            if (iIndexSegment < iIndexSegment2) {
                objArr = new Object[]{p1, p3};
            } else {
                objArr = new Object[]{p3, p1};
            }
            return new TrieNode<>((1 << iIndexSegment) | (1 << iIndexSegment2), objArr, p5);
        }
        return new TrieNode<>(1 << iIndexSegment, new Object[]{makeNode(p0, p1, p2, p3, p4 + 5, p5)}, p5);
    }

    private final TrieNode<E> removeCellAtIndex(int p0, int p1) {
        return new TrieNode<>(p1 ^ this.bitmap, TrieNodeKt.removeCellAtIndex(this.buffer, p0));
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int p0, int p1, MutabilityOwnership p2) {
        if (this.ownedBy == p2) {
            this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, p0);
            this.bitmap ^= p1;
            return this;
        }
        return new TrieNode<>(p1 ^ this.bitmap, TrieNodeKt.removeCellAtIndex(this.buffer, p0), p2);
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int p0) {
        return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, p0));
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int p0, MutabilityOwnership p1) {
        if (this.ownedBy == p1) {
            this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, p0);
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, p0), p1);
    }

    private final boolean collisionContainsElement(E p0) {
        return ArraysKt.contains((E[]) this.buffer, p0);
    }

    private final TrieNode<E> collisionAdd(E p0) {
        return collisionContainsElement(p0) ? this : new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, p0));
    }

    private final TrieNode<E> mutableCollisionAdd(E p0, PersistentHashSetBuilder<?> p1) {
        if (collisionContainsElement(p0)) {
            return this;
        }
        p1.setSize(p1.size() + 1);
        if (this.ownedBy == p1.getOwnership()) {
            this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, 0, p0);
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, p0), p1.getOwnership());
    }

    private final TrieNode<E> collisionRemove(E p0) {
        int iIndexOf = ArraysKt.indexOf((E[]) this.buffer, p0);
        return iIndexOf != -1 ? collisionRemoveElementAtIndex(iIndexOf) : this;
    }

    private final TrieNode<E> mutableCollisionRemove(E p0, PersistentHashSetBuilder<?> p1) {
        int iIndexOf = ArraysKt.indexOf((E[]) this.buffer, p0);
        if (iIndexOf == -1) {
            return this;
        }
        p1.setSize(p1.size() - 1);
        return mutableCollisionRemoveElementAtIndex(iIndexOf, p1.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> p0, DeltaCounter p1, MutabilityOwnership p2) {
        if (this == p0) {
            p1.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + p0.buffer.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        Object[] objArr2 = p0.buffer;
        int length = this.buffer.length;
        int i = 0;
        int i2 = 0;
        while (i < objArr2.length) {
            CommonFunctionsKt.m3653assert(i2 <= i);
            if (!collisionContainsElement(objArr2[i])) {
                objArrCopyOf[length + i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m3653assert(length + i2 <= objArrCopyOf.length);
            }
            i++;
        }
        int length2 = i2 + this.buffer.length;
        p1.plusAssign(objArrCopyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == p0.buffer.length) {
            return p0;
        }
        if (length2 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        }
        if (Intrinsics.areEqual(this.ownedBy, p2)) {
            this.buffer = objArrCopyOf;
            return this;
        }
        return new TrieNode<>(0, objArrCopyOf, p2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(TrieNode<E> p0, DeltaCounter p1, MutabilityOwnership p2) {
        if (this == p0) {
            p1.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = Intrinsics.areEqual(p2, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, p0.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m3653assert(i2 <= i);
            if (p0.collisionContainsElement(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m3653assert(i2 <= objArr.length);
            }
            i++;
        }
        p1.plusAssign(i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == p0.buffer.length) {
            return p0;
        }
        if (i2 == objArr.length) {
            return new TrieNode(0, objArr, p2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        return new TrieNode(0, objArrCopyOf, p2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(TrieNode<E> p0, DeltaCounter p1, MutabilityOwnership p2) {
        if (this == p0) {
            p1.plusAssign(this.buffer.length);
            return EMPTY;
        }
        Object[] objArr = Intrinsics.areEqual(p2, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m3653assert(i2 <= i);
            if (!p0.collisionContainsElement(objArr2[i])) {
                objArr[i2] = objArr2[i];
                i2++;
                CommonFunctionsKt.m3653assert(i2 <= objArr.length);
            }
            i++;
        }
        p1.plusAssign(this.buffer.length - i2);
        if (i2 == 0) {
            return EMPTY;
        }
        if (i2 == 1) {
            return objArr[0];
        }
        if (i2 == this.buffer.length) {
            return this;
        }
        if (i2 == objArr.length) {
            return new TrieNode(0, objArr, p2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        return new TrieNode(0, objArrCopyOf, p2);
    }

    private final int calculateSize() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int iCalculateSize = 0;
        for (Object obj : this.buffer) {
            iCalculateSize += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
        }
        return iCalculateSize;
    }

    private final boolean elementsIdentityEquals(TrieNode<E> p0) {
        if (this == p0) {
            return true;
        }
        if (this.bitmap != p0.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != p0.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean contains(int p0, E p1, int p2) {
        TrieNode<E> trieNodeNodeAtIndex = this;
        while (true) {
            int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p2);
            if (trieNodeNodeAtIndex.hasNoCellAt(iIndexSegment)) {
                return false;
            }
            int iIndexOfCellAt$runtime = trieNodeNodeAtIndex.indexOfCellAt$runtime(iIndexSegment);
            Object obj = trieNodeNodeAtIndex.buffer[iIndexOfCellAt$runtime];
            if (obj instanceof TrieNode) {
                trieNodeNodeAtIndex = trieNodeNodeAtIndex.nodeAtIndex(iIndexOfCellAt$runtime);
                if (p2 == 30) {
                    return trieNodeNodeAtIndex.collisionContainsElement(p1);
                }
                p2 += 5;
            } else {
                return Intrinsics.areEqual(p1, obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TrieNode<E> mutableAddAll(TrieNode<E> p0, int p1, DeltaCounter p2, PersistentHashSetBuilder<?> p3) {
        Object objMakeNode;
        TrieNode trieNodeMutableAdd;
        if (this == p0) {
            p2.setCount(p2.getCount() + calculateSize());
            return this;
        }
        if (p1 > 30) {
            return mutableCollisionAddAll(p0, p2, p3.getOwnership());
        }
        int i = this.bitmap;
        int i2 = p0.bitmap | i;
        TrieNode<E> trieNode = (i2 == i && Intrinsics.areEqual(this.ownedBy, p3.getOwnership())) ? this : new TrieNode<>(i2, new Object[Integer.bitCount(i2)], p3.getOwnership());
        int i3 = i2;
        int i4 = 0;
        while (i3 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i3);
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iLowestOneBit);
            int iIndexOfCellAt$runtime2 = p0.indexOfCellAt$runtime(iLowestOneBit);
            Object[] objArr = trieNode.buffer;
            if (hasNoCellAt(iLowestOneBit)) {
                objMakeNode = p0.buffer[iIndexOfCellAt$runtime2];
            } else if (p0.hasNoCellAt(iLowestOneBit)) {
                objMakeNode = this.buffer[iIndexOfCellAt$runtime];
            } else {
                Object obj = this.buffer[iIndexOfCellAt$runtime];
                Object obj2 = p0.buffer[iIndexOfCellAt$runtime2];
                boolean z = obj instanceof TrieNode;
                boolean z2 = obj2 instanceof TrieNode;
                if (z && z2) {
                    Intrinsics.checkNotNull(obj, "");
                    Intrinsics.checkNotNull(obj2, "");
                    objMakeNode = ((TrieNode) obj).mutableAddAll((TrieNode) obj2, p1 + 5, p2, p3);
                } else {
                    if (z) {
                        Intrinsics.checkNotNull(obj, "");
                        TrieNode trieNode2 = (TrieNode) obj;
                        int size = p3.size();
                        trieNodeMutableAdd = trieNode2.mutableAdd(obj2 != null ? obj2.hashCode() : 0, obj2, p1 + 5, p3);
                        if (p3.size() == size) {
                            p2.setCount(p2.getCount() + 1);
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        if (z2) {
                            Intrinsics.checkNotNull(obj2, "");
                            TrieNode trieNode3 = (TrieNode) obj2;
                            int size2 = p3.size();
                            trieNodeMutableAdd = trieNode3.mutableAdd(obj != null ? obj.hashCode() : 0, obj, p1 + 5, p3);
                            if (p3.size() == size2) {
                                p2.setCount(p2.getCount() + 1);
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } else if (Intrinsics.areEqual(obj, obj2)) {
                            p2.setCount(p2.getCount() + 1);
                            Unit unit3 = Unit.INSTANCE;
                            objMakeNode = obj;
                        } else {
                            objMakeNode = makeNode(obj != null ? obj.hashCode() : 0, obj, obj2 != null ? obj2.hashCode() : 0, obj2, p1 + 5, p3.getOwnership());
                        }
                        objArr[i4] = objMakeNode;
                        i4++;
                        i3 ^= iLowestOneBit;
                    }
                    objMakeNode = trieNodeMutableAdd;
                }
            }
            objArr[i4] = objMakeNode;
            i4++;
            i3 ^= iLowestOneBit;
        }
        if (elementsIdentityEquals(trieNode)) {
            return this;
        }
        return p0.elementsIdentityEquals(trieNode) ? p0 : trieNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRetainAll(TrieNode<E> p0, int p1, DeltaCounter p2, PersistentHashSetBuilder<?> p3) {
        if (this == p0) {
            p2.plusAssign(calculateSize());
            return this;
        }
        if (p1 > 30) {
            return mutableCollisionRetainAll(p0, p2, p3.getOwnership());
        }
        int i = this.bitmap & p0.bitmap;
        if (i == 0) {
            return EMPTY;
        }
        TrieNode<E> trieNode = (Intrinsics.areEqual(this.ownedBy, p3.getOwnership()) && i == this.bitmap) ? this : new TrieNode<>(i, new Object[Integer.bitCount(i)], p3.getOwnership());
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (i2 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i2);
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iLowestOneBit);
            int iIndexOfCellAt$runtime2 = p0.indexOfCellAt$runtime(iLowestOneBit);
            Object objMutableRetainAll = this.buffer[iIndexOfCellAt$runtime];
            Object obj = p0.buffer[iIndexOfCellAt$runtime2];
            boolean z = objMutableRetainAll instanceof TrieNode;
            boolean z2 = obj instanceof TrieNode;
            if (z && z2) {
                Intrinsics.checkNotNull(objMutableRetainAll, "");
                Intrinsics.checkNotNull(obj, "");
                objMutableRetainAll = ((TrieNode) objMutableRetainAll).mutableRetainAll((TrieNode) obj, p1 + 5, p2, p3);
            } else if (z) {
                Intrinsics.checkNotNull(objMutableRetainAll, "");
                if (((TrieNode) objMutableRetainAll).contains(obj != null ? obj.hashCode() : 0, obj, p1 + 5)) {
                    p2.plusAssign(1);
                    objMutableRetainAll = obj;
                } else {
                    objMutableRetainAll = EMPTY;
                }
            } else if (z2) {
                Intrinsics.checkNotNull(obj, "");
                if (((TrieNode) obj).contains(objMutableRetainAll != null ? objMutableRetainAll.hashCode() : 0, objMutableRetainAll, p1 + 5)) {
                    p2.plusAssign(1);
                } else {
                    objMutableRetainAll = EMPTY;
                }
            } else if (Intrinsics.areEqual(objMutableRetainAll, obj)) {
                p2.plusAssign(1);
            } else {
                objMutableRetainAll = EMPTY;
            }
            if (objMutableRetainAll != EMPTY) {
                i3 |= iLowestOneBit;
            }
            trieNode.buffer[i4] = objMutableRetainAll;
            i4++;
            i2 ^= iLowestOneBit;
        }
        int iBitCount = Integer.bitCount(i3);
        if (i3 == 0) {
            return EMPTY;
        }
        if (i3 == i) {
            if (trieNode.elementsIdentityEquals(this)) {
                return this;
            }
            return trieNode.elementsIdentityEquals(p0) ? p0 : trieNode;
        }
        if (iBitCount == 1 && p1 != 0) {
            Object obj2 = trieNode.buffer[trieNode.indexOfCellAt$runtime(i3)];
            return obj2 instanceof TrieNode ? new TrieNode(i3, new Object[]{obj2}, p3.getOwnership()) : obj2;
        }
        Object[] objArr = new Object[iBitCount];
        Object[] objArr2 = trieNode.buffer;
        int i5 = 0;
        int i6 = 0;
        while (i5 < objArr2.length) {
            CommonFunctionsKt.m3653assert(i6 <= i5);
            if (objArr2[i5] != INSTANCE.getEMPTY$runtime()) {
                objArr[i6] = objArr2[i5];
                i6++;
                CommonFunctionsKt.m3653assert(i6 <= iBitCount);
            }
            i5++;
        }
        return new TrieNode(i3, objArr, p3.getOwnership());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRemoveAll(TrieNode<E> p0, int p1, DeltaCounter p2, PersistentHashSetBuilder<?> p3) {
        TrieNode<E> trieNode;
        TrieNode<E> trieNode2 = p0;
        if (this == trieNode2) {
            p2.plusAssign(calculateSize());
            return EMPTY;
        }
        if (p1 > 30) {
            return mutableCollisionRemoveAll(trieNode2, p2, p3.getOwnership());
        }
        int i = this.bitmap & trieNode2.bitmap;
        if (i != 0) {
            if (Intrinsics.areEqual(this.ownedBy, p3.getOwnership())) {
                trieNode = this;
            } else {
                int i2 = this.bitmap;
                Object[] objArr = this.buffer;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                trieNode = new TrieNode<>(i2, objArrCopyOf, p3.getOwnership());
            }
            int i3 = this.bitmap;
            while (i != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i);
                int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iLowestOneBit);
                int iIndexOfCellAt$runtime2 = trieNode2.indexOfCellAt$runtime(iLowestOneBit);
                Object objMutableRemoveAll = this.buffer[iIndexOfCellAt$runtime];
                Object obj = trieNode2.buffer[iIndexOfCellAt$runtime2];
                boolean z = objMutableRemoveAll instanceof TrieNode;
                boolean z2 = obj instanceof TrieNode;
                if (z && z2) {
                    Intrinsics.checkNotNull(objMutableRemoveAll, "");
                    Intrinsics.checkNotNull(obj, "");
                    objMutableRemoveAll = ((TrieNode) objMutableRemoveAll).mutableRemoveAll((TrieNode) obj, p1 + 5, p2, p3);
                } else if (z) {
                    Intrinsics.checkNotNull(objMutableRemoveAll, "");
                    TrieNode trieNode3 = (TrieNode) objMutableRemoveAll;
                    int size = p3.size();
                    TrieNode trieNodeMutableRemove = trieNode3.mutableRemove(obj != null ? obj.hashCode() : 0, obj, p1 + 5, p3);
                    if (size != p3.size()) {
                        p2.plusAssign(1);
                        Object[] objArr2 = trieNodeMutableRemove.buffer;
                        if (objArr2.length == 1) {
                            objMutableRemoveAll = objArr2[0];
                            if (objMutableRemoveAll instanceof TrieNode) {
                                objMutableRemoveAll = trieNodeMutableRemove;
                            }
                        } else {
                            objMutableRemoveAll = trieNodeMutableRemove;
                        }
                    }
                } else if (z2) {
                    Intrinsics.checkNotNull(obj, "");
                    if (((TrieNode) obj).contains(objMutableRemoveAll != null ? objMutableRemoveAll.hashCode() : 0, objMutableRemoveAll, p1 + 5)) {
                        p2.plusAssign(1);
                        objMutableRemoveAll = EMPTY;
                    }
                } else if (Intrinsics.areEqual(objMutableRemoveAll, obj)) {
                    p2.plusAssign(1);
                    objMutableRemoveAll = EMPTY;
                }
                if (objMutableRemoveAll == EMPTY) {
                    i3 ^= iLowestOneBit;
                }
                trieNode.buffer[iIndexOfCellAt$runtime] = objMutableRemoveAll;
                i ^= iLowestOneBit;
                trieNode2 = p0;
            }
            int iBitCount = Integer.bitCount(i3);
            if (i3 == 0) {
                return EMPTY;
            }
            if (i3 != this.bitmap) {
                if (iBitCount == 1 && p1 != 0) {
                    Object obj2 = trieNode.buffer[trieNode.indexOfCellAt$runtime(i3)];
                    return obj2 instanceof TrieNode ? new TrieNode(i3, new Object[]{obj2}, p3.getOwnership()) : obj2;
                }
                Object[] objArr3 = new Object[iBitCount];
                Object[] objArr4 = trieNode.buffer;
                int i4 = 0;
                int i5 = 0;
                while (i4 < objArr4.length) {
                    CommonFunctionsKt.m3653assert(i5 <= i4);
                    if (objArr4[i4] != INSTANCE.getEMPTY$runtime()) {
                        objArr3[i5] = objArr4[i4];
                        i5++;
                        CommonFunctionsKt.m3653assert(i5 <= iBitCount);
                    }
                    i4++;
                }
                return new TrieNode(i3, objArr3, p3.getOwnership());
            }
            if (!trieNode.elementsIdentityEquals(this)) {
                return trieNode;
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(TrieNode<E> p0, int p1) {
        if (this == p0) {
            return true;
        }
        if (p1 > 30) {
            for (Object obj : p0.buffer) {
                if (!ArraysKt.contains(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i = this.bitmap;
        int i2 = p0.bitmap;
        int i3 = i & i2;
        if (i3 != i2) {
            return false;
        }
        while (i3 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i3);
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iLowestOneBit);
            int iIndexOfCellAt$runtime2 = p0.indexOfCellAt$runtime(iLowestOneBit);
            Object obj2 = this.buffer[iIndexOfCellAt$runtime];
            Object obj3 = p0.buffer[iIndexOfCellAt$runtime2];
            boolean z = obj2 instanceof TrieNode;
            boolean z2 = obj3 instanceof TrieNode;
            if (z && z2) {
                Intrinsics.checkNotNull(obj2, "");
                Intrinsics.checkNotNull(obj3, "");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, p1 + 5)) {
                    return false;
                }
            } else if (z) {
                Intrinsics.checkNotNull(obj2, "");
                if (!((TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, p1 + 5)) {
                    return false;
                }
            } else if (z2 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i3 ^= iLowestOneBit;
        }
        return true;
    }

    public final TrieNode<E> add(int p0, E p1, int p2) {
        TrieNode<E> trieNodeAdd;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p2);
        if (hasNoCellAt(iIndexSegment)) {
            return addElementAt(iIndexSegment, p1);
        }
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime);
            if (p2 == 30) {
                trieNodeAdd = trieNodeNodeAtIndex.collisionAdd(p1);
            } else {
                trieNodeAdd = trieNodeNodeAtIndex.add(p0, p1, p2 + 5);
            }
            if (trieNodeNodeAtIndex != trieNodeAdd) {
                return updateNodeAtIndex(iIndexOfCellAt$runtime, trieNodeAdd);
            }
        } else if (!Intrinsics.areEqual(p1, obj)) {
            return moveElementToNode(iIndexOfCellAt$runtime, p0, p1, p2);
        }
        return this;
    }

    public final TrieNode<E> mutableAdd(int p0, E p1, int p2, PersistentHashSetBuilder<?> p3) {
        TrieNode<E> trieNodeMutableAdd;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p2);
        if (hasNoCellAt(iIndexSegment)) {
            p3.setSize(p3.size() + 1);
            return mutableAddElementAt(iIndexSegment, p1, p3.getOwnership());
        }
        int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime);
            if (p2 == 30) {
                trieNodeMutableAdd = trieNodeNodeAtIndex.mutableCollisionAdd(p1, p3);
            } else {
                trieNodeMutableAdd = trieNodeNodeAtIndex.mutableAdd(p0, p1, p2 + 5, p3);
            }
            if (trieNodeNodeAtIndex != trieNodeMutableAdd) {
                return mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime, trieNodeMutableAdd, p3.getOwnership());
            }
        } else if (!Intrinsics.areEqual(p1, obj)) {
            p3.setSize(p3.size() + 1);
            return mutableMoveElementToNode(iIndexOfCellAt$runtime, p0, p1, p2, p3.getOwnership());
        }
        return this;
    }

    public final TrieNode<E> remove(int p0, E p1, int p2) {
        TrieNode<E> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p2);
        if (!hasNoCellAt(iIndexSegment)) {
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
            Object obj = this.buffer[iIndexOfCellAt$runtime];
            if (obj instanceof TrieNode) {
                TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime);
                if (p2 == 30) {
                    trieNodeRemove = trieNodeNodeAtIndex.collisionRemove(p1);
                } else {
                    trieNodeRemove = trieNodeNodeAtIndex.remove(p0, p1, p2 + 5);
                }
                if (trieNodeNodeAtIndex != trieNodeRemove) {
                    return updateNodeAtIndex(iIndexOfCellAt$runtime, trieNodeRemove);
                }
            } else if (Intrinsics.areEqual(p1, obj)) {
                return removeCellAtIndex(iIndexOfCellAt$runtime, iIndexSegment);
            }
        }
        return this;
    }

    public final TrieNode<E> mutableRemove(int p0, E p1, int p2, PersistentHashSetBuilder<?> p3) {
        TrieNode<E> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p2);
        if (!hasNoCellAt(iIndexSegment)) {
            int iIndexOfCellAt$runtime = indexOfCellAt$runtime(iIndexSegment);
            Object obj = this.buffer[iIndexOfCellAt$runtime];
            if (obj instanceof TrieNode) {
                TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime);
                if (p2 == 30) {
                    trieNodeMutableRemove = trieNodeNodeAtIndex.mutableCollisionRemove(p1, p3);
                } else {
                    trieNodeMutableRemove = trieNodeNodeAtIndex.mutableRemove(p0, p1, p2 + 5, p3);
                }
                if (this.ownedBy == p3.getOwnership() || trieNodeNodeAtIndex != trieNodeMutableRemove) {
                    return mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime, trieNodeMutableRemove, p3.getOwnership());
                }
            } else if (Intrinsics.areEqual(p1, obj)) {
                p3.setSize(p3.size() - 1);
                return mutableRemoveCellAtIndex(iIndexOfCellAt$runtime, iIndexSegment, p3.getOwnership());
            }
        }
        return this;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "getEMPTY$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final TrieNode getEMPTY$runtime() {
            return TrieNode.EMPTY;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
