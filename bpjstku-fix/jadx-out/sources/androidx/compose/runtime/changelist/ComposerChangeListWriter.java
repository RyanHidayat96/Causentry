package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.IntStack;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.internal.IntRef;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008a\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ&\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0086\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u0019H\u0086\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020!¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020!¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020!¢\u0006\u0004\b%\u0010#J\u001f\u0010&\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'J'\u0010)\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u000f¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b-\u0010\u0011J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\nJ\u0017\u0010/\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u0010\nJ\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\nJ\r\u00103\u001a\u00020\b¢\u0006\u0004\b3\u0010\nJ\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\nJ\u001d\u00106\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u000205¢\u0006\u0004\b6\u00107J%\u00106\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u0002052\u0006\u0010(\u001a\u000208¢\u0006\u0004\b6\u00109J\u0015\u0010:\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b:\u0010\u0011J)\u0010=\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\b0;2\u0006\u0010\u0005\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b?\u00100J@\u0010D\u001a\u00020\b\"\u0004\b\u0000\u0010@\"\u0004\b\u0001\u0010A2\u0006\u0010\u0003\u001a\u00028\u00012\u001d\u0010\u0005\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0B¢\u0006\u0002\bC¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000f¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020\b¢\u0006\u0004\bJ\u0010\nJ\r\u0010K\u001a\u00020\b¢\u0006\u0004\bK\u0010\nJ\u001d\u0010L\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\bL\u0010GJ\u000f\u0010M\u001a\u00020\bH\u0002¢\u0006\u0004\bM\u0010\nJ\u001f\u0010N\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\bN\u0010GJ'\u0010O\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\bO\u0010IJ\r\u0010P\u001a\u00020\b¢\u0006\u0004\bP\u0010\nJ\u0017\u0010Q\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bQ\u00100J\u000f\u0010R\u001a\u00020\bH\u0002¢\u0006\u0004\bR\u0010\nJ\u001b\u0010S\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0004\bS\u0010\u001dJ\u001d\u0010U\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020T2\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u00020\b2\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010W2\u0006\u0010\u0005\u001a\u00020T¢\u0006\u0004\bX\u0010YJ/\u0010^\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010Z2\u0006\u0010\u0005\u001a\u00020[2\u0006\u0010(\u001a\u00020\\2\u0006\u0010]\u001a\u00020\\¢\u0006\u0004\b^\u0010_J%\u0010a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020`2\u0006\u0010\u0005\u001a\u00020[2\u0006\u0010(\u001a\u00020\\¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020\b¢\u0006\u0004\bc\u0010\nJ!\u0010d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010T¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\b¢\u0006\u0004\bf\u0010\nJ\r\u0010g\u001a\u00020\b¢\u0006\u0004\bg\u0010\nJ\r\u0010h\u001a\u00020\b¢\u0006\u0004\bh\u0010\nR\u0014\u0010i\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\"\u0010k\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u0014\u0010t\u001a\u00020q8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0016\u0010u\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010x\u001a\u00020w8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\"\u0010z\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bz\u0010v\u001a\u0004\b{\u0010|\"\u0004\b}\u0010\u000eR\u0016\u0010~\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0080\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR \u0010\u0082\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0081\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0084\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u007fR\u0018\u0010\u0085\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u007fR\u0018\u0010\u0086\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u007fR\u0018\u0010\u0087\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u007fR\u0013\u0010\u0089\u0001\u001a\u00020\f8G¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010|"}, d2 = {"Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "", "Landroidx/compose/runtime/ComposerImpl;", "p0", "Landroidx/compose/runtime/changelist/ChangeList;", "p1", "<init>", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/ChangeList;)V", "", "pushApplierOperationPreamble", "()V", "pushSlotEditingOperationPreamble", "", "pushSlotTableOperationPreamble", "(Z)V", "", "moveReaderRelativeTo", "(I)V", "moveReaderToAbsolute", "recordSlotEditing", "ensureRootStarted", "Landroidx/compose/runtime/Anchor;", "ensureGroupStarted", "(Landroidx/compose/runtime/Anchor;)V", "realizeOperationLocation", "Lkotlin/Function0;", "withChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;Lkotlin/jvm/functions/Function0;)V", "withoutImplicitRootStart", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/RememberObserverHolder;", "remember", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "Landroidx/compose/runtime/RecomposeScopeImpl;", "rememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "startResumingScope", "endResumingScope", "updateValue", "(Ljava/lang/Object;I)V", "p2", "updateAnchoredValue", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "appendValue", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "trimValues", "resetSlots", "updateAuxData", "(Ljava/lang/Object;)V", "endRoot", "endCurrentGroup", "skipToEndOfCurrentGroup", "removeCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "insertSlots", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/FixupList;", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/FixupList;)V", "moveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "endCompositionScope", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composition;)V", "useNode", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "updateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeNode", "(II)V", "moveNode", "(III)V", "releaseMovableContent", "endNodeMovement", "endNodeMovementAndDeleteNode", "realizeNodeMovementOperations", "realizeRemoveNode", "realizeMoveNode", "moveUp", "moveDown", "pushPendingUpsAndDowns", "sideEffect", "Landroidx/compose/runtime/internal/IntRef;", "determineMovableContentNodeIndex", "(Landroidx/compose/runtime/internal/IntRef;Landroidx/compose/runtime/Anchor;)V", "", "copyNodesToNewAnchorLocation", "(Ljava/util/List;Landroidx/compose/runtime/internal/IntRef;)V", "Landroidx/compose/runtime/MovableContentState;", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/MovableContentStateReference;", "p3", "copySlotTableToAnchorLocation", "(Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/ControlledComposition;", "releaseMovableGroupAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/MovableContentStateReference;)V", "endMovableContentPlacement", "includeOperationsIn", "(Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/internal/IntRef;)V", "finalizeComposition", "resetTransientState", "deactivateCurrentGroup", "composer", "Landroidx/compose/runtime/ComposerImpl;", "changeList", "Landroidx/compose/runtime/changelist/ChangeList;", "getChangeList", "()Landroidx/compose/runtime/changelist/ChangeList;", "setChangeList", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "Landroidx/compose/runtime/SlotReader;", "getReader", "()Landroidx/compose/runtime/SlotReader;", "reader", "startedGroup", "Z", "Landroidx/compose/runtime/IntStack;", "startedGroups", "Landroidx/compose/runtime/IntStack;", "implicitRootStart", "getImplicitRootStart", "()Z", "setImplicitRootStart", "writersReaderDelta", "I", "pendingUps", "Landroidx/compose/runtime/Stack;", "pendingDownNodes", "Ljava/util/ArrayList;", "removeFrom", "moveFrom", "moveTo", "moveCount", "getPastParent", "pastParent", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposerChangeListWriter {
    private static final int invalidGroupLocation = -2;
    private ChangeList changeList;
    private final ComposerImpl composer;
    private int moveCount;
    private int pendingUps;
    private boolean startedGroup;
    private int writersReaderDelta;
    public static final int $stable = 8;
    private final IntStack startedGroups = new IntStack();
    private boolean implicitRootStart = true;
    private final ArrayList<T> pendingDownNodes = Stack.m3520constructorimpl$default(null, 1, null);
    private int removeFrom = -1;
    private int moveFrom = -1;
    private int moveTo = -1;

    public ComposerChangeListWriter(ComposerImpl composerImpl, ChangeList changeList) {
        this.composer = composerImpl;
        this.changeList = changeList;
    }

    public final ChangeList getChangeList() {
        return this.changeList;
    }

    public final void setChangeList(ChangeList changeList) {
        this.changeList = changeList;
    }

    private final SlotReader getReader() {
        return this.composer.getReader();
    }

    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void setImplicitRootStart(boolean z) {
        this.implicitRootStart = z;
    }

    private final void pushApplierOperationPreamble() {
        pushPendingUpsAndDowns();
    }

    private final void pushSlotEditingOperationPreamble() {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
    }

    static /* synthetic */ void pushSlotTableOperationPreamble$default(ComposerChangeListWriter composerChangeListWriter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerChangeListWriter.pushSlotTableOperationPreamble(z);
    }

    private final void pushSlotTableOperationPreamble(boolean p0) {
        realizeOperationLocation(p0);
    }

    public final void moveReaderRelativeTo(int p0) {
        this.writersReaderDelta += p0 - getReader().getCurrentGroup();
    }

    public final void moveReaderToAbsolute(int p0) {
        this.writersReaderDelta = p0;
    }

    public final void recordSlotEditing() {
        SlotReader reader;
        int parent;
        if (getReader().getGroupsSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (reader = getReader()).getParent())) {
            return;
        }
        ensureRootStarted();
        if (parent > 0) {
            Anchor anchor = reader.anchor(parent);
            this.startedGroups.push(parent);
            ensureGroupStarted(anchor);
        }
    }

    private final void ensureRootStarted() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureRootStarted();
        this.startedGroup = true;
    }

    private final void ensureGroupStarted(Anchor p0) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushEnsureGroupStarted(p0);
        this.startedGroup = true;
    }

    static /* synthetic */ void realizeOperationLocation$default(ComposerChangeListWriter composerChangeListWriter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        composerChangeListWriter.realizeOperationLocation(z);
    }

    private final void realizeOperationLocation(boolean p0) {
        int parent = p0 ? getReader().getParent() : getReader().getCurrentGroup();
        int i = parent - this.writersReaderDelta;
        if (i < 0) {
            ComposerKt.composeImmediateRuntimeError("Tried to seek backward");
        }
        if (i > 0) {
            this.changeList.pushAdvanceSlotsBy(i);
            this.writersReaderDelta = parent;
        }
    }

    public final boolean getPastParent() {
        return getReader().getParent() - this.writersReaderDelta < 0;
    }

    public final void withChangeList(ChangeList p0, Function0<Unit> p1) {
        ChangeList changeList = getChangeList();
        try {
            setChangeList(p0);
            p1.invoke();
        } finally {
            setChangeList(changeList);
        }
    }

    public final void withoutImplicitRootStart(Function0<Unit> p0) {
        boolean implicitRootStart = getImplicitRootStart();
        try {
            setImplicitRootStart(false);
            p0.invoke();
        } finally {
            setImplicitRootStart(implicitRootStart);
        }
    }

    public final void remember(RememberObserverHolder p0) {
        this.changeList.pushRemember(p0);
    }

    public final void rememberPausingScope(RecomposeScopeImpl p0) {
        this.changeList.pushRememberPausingScope(p0);
    }

    public final void startResumingScope(RecomposeScopeImpl p0) {
        this.changeList.pushStartResumingScope(p0);
    }

    public final void endResumingScope(RecomposeScopeImpl p0) {
        this.changeList.pushEndResumingScope(p0);
    }

    public final void updateValue(Object p0, int p1) {
        pushSlotTableOperationPreamble(true);
        this.changeList.pushUpdateValue(p0, p1);
    }

    public final void updateAnchoredValue(Object p0, Anchor p1, int p2) {
        this.changeList.pushUpdateAnchoredValue(p0, p1, p2);
    }

    public final void appendValue(Anchor p0, Object p1) {
        this.changeList.pushAppendValue(p0, p1);
    }

    public final void trimValues(int p0) {
        if (p0 > 0) {
            pushSlotEditingOperationPreamble();
            this.changeList.pushTrimValues(p0);
        }
    }

    public final void resetSlots() {
        this.changeList.pushResetSlots();
    }

    public final void updateAuxData(Object p0) {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushUpdateAuxData(p0);
    }

    public final void endRoot() {
        if (this.startedGroup) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.changeList.pushEndCurrentGroup();
            this.startedGroup = false;
        }
    }

    public final void endCurrentGroup() {
        int parent = getReader().getParent();
        if (this.startedGroups.peekOr(-1) > parent) {
            ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup");
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            pushSlotTableOperationPreamble$default(this, false, 1, null);
            this.startedGroups.pop();
            this.changeList.pushEndCurrentGroup();
        }
    }

    public final void skipToEndOfCurrentGroup() {
        this.changeList.pushSkipToEndOfCurrentGroup();
    }

    public final void removeCurrentGroup() {
        pushSlotEditingOperationPreamble();
        this.changeList.pushRemoveCurrentGroup();
        this.writersReaderDelta += getReader().getGroupSize();
    }

    public final void insertSlots(Anchor p0, SlotTable p1) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(p0, p1);
    }

    public final void insertSlots(Anchor p0, SlotTable p1, FixupList p2) {
        pushPendingUpsAndDowns();
        pushSlotEditingOperationPreamble();
        realizeNodeMovementOperations();
        this.changeList.pushInsertSlots(p0, p1, p2);
    }

    public final void moveCurrentGroup(int p0) {
        pushSlotEditingOperationPreamble();
        this.changeList.pushMoveCurrentGroup(p0);
    }

    public final void endCompositionScope(Function1<? super Composition, Unit> p0, Composition p1) {
        this.changeList.pushEndCompositionScope(p0, p1);
    }

    public final void useNode(Object p0) {
        pushApplierOperationPreamble();
        this.changeList.pushUseNode(p0);
    }

    public final <T, V> void updateNode(V p0, Function2<? super T, ? super V, Unit> p1) {
        pushApplierOperationPreamble();
        this.changeList.pushUpdateNode(p0, p1);
    }

    public final void removeNode(int p0, int p1) {
        if (p1 > 0) {
            if (p0 < 0) {
                ComposerKt.composeImmediateRuntimeError("Invalid remove index ".concat(String.valueOf(p0)));
            }
            if (this.removeFrom == p0) {
                this.moveCount += p1;
                return;
            }
            realizeNodeMovementOperations();
            this.removeFrom = p0;
            this.moveCount = p1;
        }
    }

    public final void moveNode(int p0, int p1, int p2) {
        if (p2 > 0) {
            int i = this.moveCount;
            if (i > 0 && this.moveFrom == p0 - i && this.moveTo == p1 - i) {
                this.moveCount = i + p2;
                return;
            }
            realizeNodeMovementOperations();
            this.moveFrom = p0;
            this.moveTo = p1;
            this.moveCount = p2;
        }
    }

    public final void releaseMovableContent() {
        pushPendingUpsAndDowns();
        if (this.startedGroup) {
            skipToEndOfCurrentGroup();
            endRoot();
        }
    }

    public final void endNodeMovement() {
        realizeNodeMovementOperations();
    }

    public final void endNodeMovementAndDeleteNode(int p0, int p1) {
        endNodeMovement();
        pushPendingUpsAndDowns();
        int iNodeCount = getReader().isNode(p1) ? 1 : getReader().nodeCount(p1);
        if (iNodeCount > 0) {
            removeNode(p0, iNodeCount);
        }
    }

    private final void realizeNodeMovementOperations() {
        int i = this.moveCount;
        if (i > 0) {
            int i2 = this.removeFrom;
            if (i2 >= 0) {
                realizeRemoveNode(i2, i);
                this.removeFrom = -1;
            } else {
                realizeMoveNode(this.moveTo, this.moveFrom, i);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void realizeRemoveNode(int p0, int p1) {
        pushApplierOperationPreamble();
        this.changeList.pushRemoveNode(p0, p1);
    }

    private final void realizeMoveNode(int p0, int p1, int p2) {
        pushApplierOperationPreamble();
        this.changeList.pushMoveNode(p0, p1, p2);
    }

    public final void moveUp() {
        realizeNodeMovementOperations();
        if (Stack.m3526isNotEmptyimpl(this.pendingDownNodes)) {
            Stack.m3529popimpl(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void moveDown(Object p0) {
        realizeNodeMovementOperations();
        Stack.m3530pushimpl(this.pendingDownNodes, p0);
    }

    private final void pushPendingUpsAndDowns() {
        int i = this.pendingUps;
        if (i > 0) {
            this.changeList.pushUps(i);
            this.pendingUps = 0;
        }
        if (Stack.m3526isNotEmptyimpl(this.pendingDownNodes)) {
            this.changeList.pushDowns(Stack.m3531toArrayimpl(this.pendingDownNodes));
            Stack.m3518clearimpl(this.pendingDownNodes);
        }
    }

    public final void sideEffect(Function0<Unit> p0) {
        this.changeList.pushSideEffect(p0);
    }

    public final void determineMovableContentNodeIndex(IntRef p0, Anchor p1) {
        pushPendingUpsAndDowns();
        this.changeList.pushDetermineMovableContentNodeIndex(p0, p1);
    }

    public final void copyNodesToNewAnchorLocation(List<? extends Object> p0, IntRef p1) {
        this.changeList.pushCopyNodesToNewAnchorLocation(p0, p1);
    }

    public final void copySlotTableToAnchorLocation(MovableContentState p0, CompositionContext p1, MovableContentStateReference p2, MovableContentStateReference p3) {
        this.changeList.pushCopySlotTableToAnchorLocation(p0, p1, p2, p3);
    }

    public final void releaseMovableGroupAtCurrent(ControlledComposition p0, CompositionContext p1, MovableContentStateReference p2) {
        this.changeList.pushReleaseMovableGroupAtCurrent(p0, p1, p2);
    }

    public final void endMovableContentPlacement() {
        this.changeList.pushEndMovableContentPlacement();
        this.writersReaderDelta = 0;
    }

    public static /* synthetic */ void includeOperationsIn$default(ComposerChangeListWriter composerChangeListWriter, ChangeList changeList, IntRef intRef, int i, Object obj) {
        if ((i & 2) != 0) {
            intRef = null;
        }
        composerChangeListWriter.includeOperationsIn(changeList, intRef);
    }

    public final void includeOperationsIn(ChangeList p0, IntRef p1) {
        this.changeList.pushExecuteOperationsIn(p0, p1);
    }

    public final void finalizeComposition() {
        pushPendingUpsAndDowns();
        if (this.startedGroups.tos == 0) {
            return;
        }
        ComposerKt.composeImmediateRuntimeError("Missed recording an endGroup()");
    }

    public final void resetTransientState() {
        this.startedGroup = false;
        this.startedGroups.clear();
        this.writersReaderDelta = 0;
        this.implicitRootStart = true;
        this.pendingUps = 0;
        Stack.m3518clearimpl(this.pendingDownNodes);
        this.removeFrom = -1;
        this.moveFrom = -1;
        this.moveTo = -1;
        this.moveCount = 0;
    }

    public final void deactivateCurrentGroup() {
        pushSlotTableOperationPreamble$default(this, false, 1, null);
        this.changeList.pushDeactivateCurrentGroup();
    }
}
