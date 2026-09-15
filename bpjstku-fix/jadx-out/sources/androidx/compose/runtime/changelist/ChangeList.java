package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J3\u0010\u0012\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010!\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001d¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\u0003J\r\u0010(\u001a\u00020\b¢\u0006\u0004\b(\u0010\u0003J\u0017\u0010)\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\b¢\u0006\u0004\b+\u0010\u0003J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020 ¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0003J\r\u0010/\u001a\u00020\b¢\u0006\u0004\b/\u0010\u0003J\r\u00100\u001a\u00020\b¢\u0006\u0004\b0\u0010\u0003J\u001d\u00102\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020 2\u0006\u0010\r\u001a\u000201¢\u0006\u0004\b2\u00103J%\u00102\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020 2\u0006\u0010\r\u001a\u0002012\u0006\u0010\u000f\u001a\u000204¢\u0006\u0004\b2\u00105J\u0015\u00106\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001d¢\u0006\u0004\b6\u0010&J)\u00109\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\b072\u0006\u0010\r\u001a\u000208¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b;\u0010*J@\u0010@\u001a\u00020\b\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=2\u0006\u0010\u000b\u001a\u00028\u00012\u001d\u0010\r\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0>¢\u0006\u0002\b?¢\u0006\u0004\b@\u0010AJ\u001d\u0010B\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u001d¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u001d¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001d¢\u0006\u0004\bF\u0010&J\u0015\u0010G\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u001d¢\u0006\u0004\bG\u0010&J\u001d\u0010I\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0H¢\u0006\u0004\bI\u0010JJ\u001b\u0010L\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0K¢\u0006\u0004\bL\u0010MJ\u001d\u0010O\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020N2\u0006\u0010\r\u001a\u00020 ¢\u0006\u0004\bO\u0010PJ%\u0010R\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0Q2\u0006\u0010\r\u001a\u00020N¢\u0006\u0004\bR\u0010SJ/\u0010W\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010T2\u0006\u0010\r\u001a\u00020U2\u0006\u0010\u000f\u001a\u00020V2\u0006\u0010\u0011\u001a\u00020V¢\u0006\u0004\bW\u0010XJ%\u0010Z\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020Y2\u0006\u0010\r\u001a\u00020U2\u0006\u0010\u000f\u001a\u00020V¢\u0006\u0004\bZ\u0010[J\r\u0010\\\u001a\u00020\b¢\u0006\u0004\b\\\u0010\u0003J!\u0010]\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010N¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020_2\u0006\u0010\u000b\u001a\u00020_H\u0017¢\u0006\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0011\u0010g\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\be\u0010f"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/Applier;", "p0", "Landroidx/compose/runtime/SlotWriter;", "p1", "Landroidx/compose/runtime/RememberManager;", "p2", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "p3", "executeAndFlushAllPendingChanges", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;Landroidx/compose/runtime/changelist/OperationErrorContext;)V", "Landroidx/compose/runtime/RememberObserverHolder;", "pushRemember", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "pushRememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "pushStartResumingScope", "pushEndResumingScope", "", "", "pushUpdateValue", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/Anchor;", "pushUpdateAnchoredValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "pushAppendValue", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "pushTrimValues", "(I)V", "pushResetSlots", "pushDeactivateCurrentGroup", "pushUpdateAuxData", "(Ljava/lang/Object;)V", "pushEnsureRootStarted", "pushEnsureGroupStarted", "(Landroidx/compose/runtime/Anchor;)V", "pushEndCurrentGroup", "pushSkipToEndOfCurrentGroup", "pushRemoveCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "pushInsertSlots", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", "pushMoveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "pushEndCompositionScope", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composition;)V", "pushUseNode", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "pushUpdateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "pushRemoveNode", "(II)V", "pushMoveNode", "(III)V", "pushAdvanceSlotsBy", "pushUps", "", "pushDowns", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "pushSideEffect", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/internal/IntRef;", "pushDetermineMovableContentNodeIndex", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "pushCopyNodesToNewAnchorLocation", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/MovableContentStateReference;", "pushCopySlotTableToAnchorLocation", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/ControlledComposition;", "pushReleaseMovableGroupAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V", "pushEndMovableContentPlacement", "pushExecuteOperationsIn", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "", "toDebugString", "(Ljava/lang/String;)Ljava/lang/String;", "Landroidx/compose/runtime/changelist/Operations;", "operations", "Landroidx/compose/runtime/changelist/Operations;", "getSize", "()I", "size"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();

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
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> p0, SlotWriter p1, RememberManager p2, OperationErrorContext p3) {
        this.operations.executeAndFlushAllPendingOperations(p0, p1, p2, p3);
    }

    public final void pushRemember(RememberObserverHolder p0) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.Remember remember2 = Operation.Remember.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        operations.ensureAllArgumentsPushedFor(remember);
    }

    public final void pushRememberPausingScope(RecomposeScopeImpl p0) {
        Operations operations = this.operations;
        Operation.RememberPausingScope rememberPausingScope = Operation.RememberPausingScope.INSTANCE;
        operations.pushOp(rememberPausingScope);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.RememberPausingScope rememberPausingScope2 = Operation.RememberPausingScope.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        operations.ensureAllArgumentsPushedFor(rememberPausingScope);
    }

    public final void pushStartResumingScope(RecomposeScopeImpl p0) {
        Operations operations = this.operations;
        Operation.StartResumingScope startResumingScope = Operation.StartResumingScope.INSTANCE;
        operations.pushOp(startResumingScope);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.StartResumingScope startResumingScope2 = Operation.StartResumingScope.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        operations.ensureAllArgumentsPushedFor(startResumingScope);
    }

    public final void pushEndResumingScope(RecomposeScopeImpl p0) {
        Operations operations = this.operations;
        Operation.EndResumingScope endResumingScope = Operation.EndResumingScope.INSTANCE;
        operations.pushOp(endResumingScope);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.EndResumingScope endResumingScope2 = Operation.EndResumingScope.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        operations.ensureAllArgumentsPushedFor(endResumingScope);
    }

    public final void pushUpdateValue(Object p0, int p1) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.UpdateValue updateValue2 = Operation.UpdateValue.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        Operation.UpdateValue updateValue3 = Operation.UpdateValue.INSTANCE;
        operationsM3598constructorimpl.intArgs[operationsM3598constructorimpl.intArgsSize - operationsM3598constructorimpl.opCodes[operationsM3598constructorimpl.opCodesSize - 1].getInts()] = p1;
        operations.ensureAllArgumentsPushedFor(updateValue);
    }

    public final void pushUpdateAnchoredValue(Object p0, Anchor p1, int p2) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.UpdateAnchoredValue updateAnchoredValue2 = Operation.UpdateAnchoredValue.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(0);
        Operation.UpdateAnchoredValue updateAnchoredValue3 = Operation.UpdateAnchoredValue.INSTANCE;
        Operations.WriteScope.m3607setObjects4uCC6AY(operationsM3598constructorimpl, iM3574constructorimpl, p0, Operation.ObjectParameter.m3574constructorimpl(1), p1);
        Operation.UpdateAnchoredValue updateAnchoredValue4 = Operation.UpdateAnchoredValue.INSTANCE;
        operationsM3598constructorimpl.intArgs[operationsM3598constructorimpl.intArgsSize - operationsM3598constructorimpl.opCodes[operationsM3598constructorimpl.opCodesSize - 1].getInts()] = p2;
        operations.ensureAllArgumentsPushedFor(updateAnchoredValue);
    }

    public final void pushAppendValue(Anchor p0, Object p1) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.AppendValue appendValue2 = Operation.AppendValue.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(0);
        Operation.AppendValue appendValue3 = Operation.AppendValue.INSTANCE;
        Operations.WriteScope.m3607setObjects4uCC6AY(operationsM3598constructorimpl, iM3574constructorimpl, p0, Operation.ObjectParameter.m3574constructorimpl(1), p1);
        operations.ensureAllArgumentsPushedFor(appendValue);
    }

    public final void pushTrimValues(int p0) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.TrimParentValues trimParentValues2 = Operation.TrimParentValues.INSTANCE;
        operationsM3598constructorimpl.intArgs[operationsM3598constructorimpl.intArgsSize - operationsM3598constructorimpl.opCodes[operationsM3598constructorimpl.opCodesSize - 1].getInts()] = p0;
        operations.ensureAllArgumentsPushedFor(trimParentValues);
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushUpdateAuxData(Object p0) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.UpdateAuxData updateAuxData2 = Operation.UpdateAuxData.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        operations.ensureAllArgumentsPushedFor(updateAuxData);
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushEnsureGroupStarted(Anchor p0) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.EnsureGroupStarted ensureGroupStarted2 = Operation.EnsureGroupStarted.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        operations.ensureAllArgumentsPushedFor(ensureGroupStarted);
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushInsertSlots(Anchor p0, SlotTable p1) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.InsertSlots insertSlots2 = Operation.InsertSlots.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(0);
        Operation.InsertSlots insertSlots3 = Operation.InsertSlots.INSTANCE;
        Operations.WriteScope.m3607setObjects4uCC6AY(operationsM3598constructorimpl, iM3574constructorimpl, p0, Operation.ObjectParameter.m3574constructorimpl(1), p1);
        operations.ensureAllArgumentsPushedFor(insertSlots);
    }

    public final void pushInsertSlots(Anchor p0, SlotTable p1, FixupList p2) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.InsertSlotsWithFixups insertSlotsWithFixups2 = Operation.InsertSlotsWithFixups.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(0);
        Operation.InsertSlotsWithFixups insertSlotsWithFixups3 = Operation.InsertSlotsWithFixups.INSTANCE;
        int iM3574constructorimpl2 = Operation.ObjectParameter.m3574constructorimpl(1);
        Operation.InsertSlotsWithFixups insertSlotsWithFixups4 = Operation.InsertSlotsWithFixups.INSTANCE;
        Operations.WriteScope.m3609setObjectst7hvbck(operationsM3598constructorimpl, iM3574constructorimpl, p0, iM3574constructorimpl2, p1, Operation.ObjectParameter.m3574constructorimpl(2), p2);
        operations.ensureAllArgumentsPushedFor(insertSlotsWithFixups);
    }

    public final void pushMoveCurrentGroup(int p0) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.MoveCurrentGroup moveCurrentGroup2 = Operation.MoveCurrentGroup.INSTANCE;
        operationsM3598constructorimpl.intArgs[operationsM3598constructorimpl.intArgsSize - operationsM3598constructorimpl.opCodes[operationsM3598constructorimpl.opCodesSize - 1].getInts()] = p0;
        operations.ensureAllArgumentsPushedFor(moveCurrentGroup);
    }

    public final void pushEndCompositionScope(Function1<? super Composition, Unit> p0, Composition p1) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.EndCompositionScope endCompositionScope2 = Operation.EndCompositionScope.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(0);
        Operation.EndCompositionScope endCompositionScope3 = Operation.EndCompositionScope.INSTANCE;
        Operations.WriteScope.m3607setObjects4uCC6AY(operationsM3598constructorimpl, iM3574constructorimpl, p0, Operation.ObjectParameter.m3574constructorimpl(1), p1);
        operations.ensureAllArgumentsPushedFor(endCompositionScope);
    }

    public final void pushUseNode(Object p0) {
        if (p0 instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    public final <T, V> void pushUpdateNode(V p0, Function2<? super T, ? super V, Unit> p1) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.UpdateNode updateNode2 = Operation.UpdateNode.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(0);
        Operation.UpdateNode updateNode3 = Operation.UpdateNode.INSTANCE;
        int iM3574constructorimpl2 = Operation.ObjectParameter.m3574constructorimpl(1);
        Intrinsics.checkNotNull(p1, "");
        Operations.WriteScope.m3607setObjects4uCC6AY(operationsM3598constructorimpl, iM3574constructorimpl, p0, iM3574constructorimpl2, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(p1, 2));
        operations.ensureAllArgumentsPushedFor(updateNode);
    }

    public final void pushRemoveNode(int p0, int p1) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.RemoveNode removeNode2 = Operation.RemoveNode.INSTANCE;
        Operation.RemoveNode removeNode3 = Operation.RemoveNode.INSTANCE;
        int ints = operationsM3598constructorimpl.intArgsSize - operationsM3598constructorimpl.opCodes[operationsM3598constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = operationsM3598constructorimpl.intArgs;
        iArr[ints] = p0;
        iArr[ints + 1] = p1;
        operations.ensureAllArgumentsPushedFor(removeNode);
    }

    public final void pushMoveNode(int p0, int p1, int p2) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.MoveNode moveNode2 = Operation.MoveNode.INSTANCE;
        Operation.MoveNode moveNode3 = Operation.MoveNode.INSTANCE;
        Operation.MoveNode moveNode4 = Operation.MoveNode.INSTANCE;
        int ints = operationsM3598constructorimpl.intArgsSize - operationsM3598constructorimpl.opCodes[operationsM3598constructorimpl.opCodesSize - 1].getInts();
        int[] iArr = operationsM3598constructorimpl.intArgs;
        iArr[ints + 1] = p0;
        iArr[ints] = p1;
        iArr[ints + 2] = p2;
        operations.ensureAllArgumentsPushedFor(moveNode);
    }

    public final void pushAdvanceSlotsBy(int p0) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.AdvanceSlotsBy advanceSlotsBy2 = Operation.AdvanceSlotsBy.INSTANCE;
        operationsM3598constructorimpl.intArgs[operationsM3598constructorimpl.intArgsSize - operationsM3598constructorimpl.opCodes[operationsM3598constructorimpl.opCodesSize - 1].getInts()] = p0;
        operations.ensureAllArgumentsPushedFor(advanceSlotsBy);
    }

    public final void pushUps(int p0) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.Ups ups2 = Operation.Ups.INSTANCE;
        operationsM3598constructorimpl.intArgs[operationsM3598constructorimpl.intArgsSize - operationsM3598constructorimpl.opCodes[operationsM3598constructorimpl.opCodesSize - 1].getInts()] = p0;
        operations.ensureAllArgumentsPushedFor(ups);
    }

    public final void pushDowns(Object[] p0) {
        if (p0.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.Downs downs2 = Operation.Downs.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        operations.ensureAllArgumentsPushedFor(downs);
    }

    public final void pushSideEffect(Function0<Unit> p0) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.SideEffect sideEffect2 = Operation.SideEffect.INSTANCE;
        Operations.WriteScope.m3606setObjectDKhxnng(operationsM3598constructorimpl, Operation.ObjectParameter.m3574constructorimpl(0), p0);
        operations.ensureAllArgumentsPushedFor(sideEffect);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef p0, Anchor p1) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex2 = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(0);
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex3 = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        Operations.WriteScope.m3607setObjects4uCC6AY(operationsM3598constructorimpl, iM3574constructorimpl, p0, Operation.ObjectParameter.m3574constructorimpl(1), p1);
        operations.ensureAllArgumentsPushedFor(determineMovableContentNodeIndex);
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> p0, IntRef p1) {
        if (p0.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation2 = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(1);
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation3 = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        Operations.WriteScope.m3607setObjects4uCC6AY(operationsM3598constructorimpl, iM3574constructorimpl, p0, Operation.ObjectParameter.m3574constructorimpl(0), p1);
        operations.ensureAllArgumentsPushedFor(copyNodesToNewAnchorLocation);
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState p0, CompositionContext p1, MovableContentStateReference p2, MovableContentStateReference p3) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation2 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(0);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation3 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        int iM3574constructorimpl2 = Operation.ObjectParameter.m3574constructorimpl(1);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation4 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        int iM3574constructorimpl3 = Operation.ObjectParameter.m3574constructorimpl(3);
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation5 = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations.WriteScope.m3608setObjectsOGa0p1M(operationsM3598constructorimpl, iM3574constructorimpl, p0, iM3574constructorimpl2, p1, iM3574constructorimpl3, p3, Operation.ObjectParameter.m3574constructorimpl(2), p2);
        operations.ensureAllArgumentsPushedFor(copySlotTableToAnchorLocation);
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition p0, CompositionContext p1, MovableContentStateReference p2) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent2 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(0);
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent3 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        int iM3574constructorimpl2 = Operation.ObjectParameter.m3574constructorimpl(1);
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent4 = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        Operations.WriteScope.m3609setObjectst7hvbck(operationsM3598constructorimpl, iM3574constructorimpl, p0, iM3574constructorimpl2, p1, Operation.ObjectParameter.m3574constructorimpl(2), p2);
        operations.ensureAllArgumentsPushedFor(releaseMovableGroupAtCurrent);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i, Object obj) {
        if ((i & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void pushExecuteOperationsIn(ChangeList p0, IntRef p1) {
        if (p0.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations operationsM3598constructorimpl = Operations.WriteScope.m3598constructorimpl(operations);
            Operation.ApplyChangeList applyChangeList2 = Operation.ApplyChangeList.INSTANCE;
            int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(0);
            Operation.ApplyChangeList applyChangeList3 = Operation.ApplyChangeList.INSTANCE;
            Operations.WriteScope.m3607setObjects4uCC6AY(operationsM3598constructorimpl, iM3574constructorimpl, p0, Operation.ObjectParameter.m3574constructorimpl(1), p1);
            operations.ensureAllArgumentsPushedFor(applyChangeList);
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final String toDebugString(String p0) {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList instance containing ");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.operations.toDebugString(p0));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
