package androidx.compose.foundation.text.input.internal.undo;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 !*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001!B1\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u001c"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "p0", "p1", "", "p2", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "", "clearHistory", "()V", "record", "(Ljava/lang/Object;)V", "redo", "()Ljava/lang/Object;", "undo", "", "getCanRedo$foundation_release", "()Z", "canRedo", "getCanUndo$foundation_release", "canUndo", "capacity", "I", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "redoStack", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getSize", "()I", "size", "undoStack", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UndoManager<T> {
    private final int capacity;
    private SnapshotStateList<T> redoStack;
    private SnapshotStateList<T> undoStack;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public UndoManager(List<? extends T> list, List<? extends T> list2, int i) {
        this.capacity = i;
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(list);
        this.undoStack = snapshotStateList;
        SnapshotStateList<T> snapshotStateList2 = new SnapshotStateList<>();
        snapshotStateList2.addAll(list2);
        this.redoStack = snapshotStateList2;
        if (i < 0) {
            throw new IllegalArgumentException("Capacity must be a positive integer".toString());
        }
        if (getSize() <= i) {
            return;
        }
        StringBuilder sb = new StringBuilder("Initial list of undo and redo operations have a size=(");
        sb.append(getSize());
        sb.append(") greater than the given capacity=(");
        sb.append(i);
        sb.append(").");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public /* synthetic */ UndoManager(List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 4) != 0 ? 100 : i);
    }

    public final boolean getCanUndo$foundation_release() {
        return !this.undoStack.isEmpty();
    }

    public final boolean getCanRedo$foundation_release() {
        return !this.redoStack.isEmpty();
    }

    public final int getSize() {
        return this.undoStack.size() + this.redoStack.size();
    }

    public final void record(T p0) {
        this.redoStack.clear();
        while (getSize() > this.capacity - 1) {
            CollectionsKt.removeFirst(this.undoStack);
        }
        this.undoStack.add(p0);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final T undo() {
        if (!getCanUndo$foundation_release()) {
            throw new IllegalStateException("It's an error to call undo while there is nothing to undo. Please first check `canUndo` value before calling the `undo` function.".toString());
        }
        T t = (T) CollectionsKt.removeLast(this.undoStack);
        this.redoStack.add(t);
        return t;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final T redo() {
        if (!getCanRedo$foundation_release()) {
            throw new IllegalStateException("It's an error to call redo while there is nothing to redo. Please first check `canRedo` value before calling the `redo` function.".toString());
        }
        T t = (T) CollectionsKt.removeLast(this.redoStack);
        this.undoStack.add(t);
        return t;
    }

    public final void clearHistory() {
        this.undoStack.clear();
        this.redoStack.clear();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/UndoManager$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/saveable/Saver;", "p0", "Landroidx/compose/foundation/text/input/internal/undo/UndoManager;", "createSaver", "(Landroidx/compose/runtime/saveable/Saver;)Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final /* synthetic */ <T> Saver<UndoManager<T>, Object> createSaver(final Saver<T, Object> p0) {
            Intrinsics.needClassReification();
            return new Saver<UndoManager<T>, Object>() { // from class: androidx.compose.foundation.text.input.internal.undo.UndoManager$Companion$createSaver$1
                @Override // androidx.compose.runtime.saveable.Saver
                public final Object save(SaverScope saverScope, UndoManager<T> undoManager) {
                    Saver<T, Object> saver = p0;
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    listCreateListBuilder.add(Integer.valueOf(((UndoManager) undoManager).capacity));
                    listCreateListBuilder.add(Integer.valueOf(((UndoManager) undoManager).undoStack.size()));
                    listCreateListBuilder.add(Integer.valueOf(((UndoManager) undoManager).redoStack.size()));
                    SnapshotStateList snapshotStateList = ((UndoManager) undoManager).undoStack;
                    int size = snapshotStateList.size();
                    for (int i = 0; i < size; i++) {
                        listCreateListBuilder.add(saver.save(saverScope, snapshotStateList.get(i)));
                    }
                    SnapshotStateList snapshotStateList2 = ((UndoManager) undoManager).redoStack;
                    int size2 = snapshotStateList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        listCreateListBuilder.add(saver.save(saverScope, snapshotStateList2.get(i2)));
                    }
                    return CollectionsKt.build(listCreateListBuilder);
                }

                @Override // androidx.compose.runtime.saveable.Saver
                public final UndoManager<T> restore(Object p1) {
                    Intrinsics.checkNotNull(p1, "");
                    List list = (List) p1;
                    int iIntValue = ((Number) list.get(0)).intValue();
                    int iIntValue2 = ((Number) list.get(1)).intValue();
                    int iIntValue3 = ((Number) list.get(2)).intValue();
                    Saver<T, Object> saver = p0;
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    int i = 3;
                    while (i < iIntValue2 + 3) {
                        T tRestore = saver.restore(list.get(i));
                        Intrinsics.checkNotNull(tRestore);
                        listCreateListBuilder.add(tRestore);
                        i++;
                    }
                    List listBuild = CollectionsKt.build(listCreateListBuilder);
                    Saver<T, Object> saver2 = p0;
                    List listCreateListBuilder2 = CollectionsKt.createListBuilder();
                    while (i < iIntValue2 + iIntValue3 + 3) {
                        T tRestore2 = saver2.restore(list.get(i));
                        Intrinsics.checkNotNull(tRestore2);
                        listCreateListBuilder2.add(tRestore2);
                        i++;
                    }
                    return new UndoManager<>(listBuild, CollectionsKt.build(listCreateListBuilder2), iIntValue);
                }
            };
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UndoManager() {
        this(null, null, 0, 7, null);
    }
}
