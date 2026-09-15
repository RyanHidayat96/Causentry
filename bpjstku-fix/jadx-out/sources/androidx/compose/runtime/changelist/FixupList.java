package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J3\u0010\u0012\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0018\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0003J@\u0010\u001f\u001a\u00020\b\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u000b\u001a\u00028\u00002\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u001d¢\u0006\u0002\b\u001e¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!H\u0017¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0011\u0010*\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/Applier;", "p0", "Landroidx/compose/runtime/SlotWriter;", "p1", "Landroidx/compose/runtime/RememberManager;", "p2", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "p3", "executeAndFlushAllPendingFixups", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;Landroidx/compose/runtime/changelist/OperationErrorContext;)V", "Lkotlin/Function0;", "", "", "Landroidx/compose/runtime/Anchor;", "createAndInsertNode", "(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Anchor;)V", "endNodeInsert", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "updateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "", "toDebugString", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/Operations;", "operations", "Landroidx/compose/runtime/changelist/Operations;", "pendingOperations", "getSize", "()I", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixupList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final int getSize() {
        return this.operations.getOpCodesSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> p0, SlotWriter p1, RememberManager p2, OperationErrorContext p3) {
        if (!this.pendingOperations.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.executeAndFlushAllPendingOperations(p0, p1, p2, p3);
    }

    public final void createAndInsertNode(Function0<? extends Object> p0, int p1, Anchor p2) {
        Operations operations = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations.pushOp(insertNodeFixup);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.InsertNodeFixup insertNodeFixup2 = Operation.InsertNodeFixup.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        Operation.InsertNodeFixup insertNodeFixup3 = Operation.InsertNodeFixup.INSTANCE;
        operationsM3598constructorimpl.intArgs[operationsM3598constructorimpl.intArgsSize - operationsM3598constructorimpl.opCodes[operationsM3598constructorimpl.opCodesSize - 1].getInts()] = p1;
        Operation.InsertNodeFixup insertNodeFixup4 = Operation.InsertNodeFixup.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(1), p2);
        operations.ensureAllArgumentsPushedFor(insertNodeFixup);
        Operations operations2 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        operations2.pushOp(postInsertNodeFixup);
        Operations operationsM3598constructorimpl2 = Operations.WriteScope.m3598constructorimpl(operations2);
        Operation.PostInsertNodeFixup postInsertNodeFixup2 = Operation.PostInsertNodeFixup.INSTANCE;
        operationsM3598constructorimpl2.intArgs[operationsM3598constructorimpl2.intArgsSize - operationsM3598constructorimpl2.opCodes[operationsM3598constructorimpl2.opCodesSize - 1].getInts()] = p1;
        Operation.PostInsertNodeFixup postInsertNodeFixup3 = Operation.PostInsertNodeFixup.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl2, Operation.ObjectParameter.m3574constructorimpl(0), p2);
        operations2.ensureAllArgumentsPushedFor(postInsertNodeFixup);
    }

    public final void endNodeInsert() {
        if (!this.pendingOperations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.popInto(this.operations);
    }

    public final <V, T> void updateNode(V p0, Function2<? super T, ? super V, Unit> p1) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.UpdateNode updateNode2 = Operation.UpdateNode.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        Operation.UpdateNode updateNode3 = Operation.UpdateNode.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(1);
        Intrinsics.checkNotNull(p1, "");
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, iM3574constructorimpl, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(p1, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final String toDebugString(String p0) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FixupList instance containing ");
        sb2.append(getSize());
        sb2.append(" operations");
        sb.append(sb2.toString());
        if (sb.length() > 0) {
            StringBuilder sb3 = new StringBuilder(":\n");
            sb3.append(this.operations.toDebugString(p0));
            sb.append(sb3.toString());
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
