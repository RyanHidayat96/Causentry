package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u001fH\u0016¢\u0006\u0004\b!\u0010\"J%\u0010(\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020$2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020$H\u0016¢\u0006\u0004\b)\u0010*J%\u0010-\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020,2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0%H\u0016¢\u0006\u0004\b-\u0010.J%\u00100\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020/2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\n0%H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020 H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00102\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u000204H\u0016¢\u0006\u0004\b2\u00105J\u000f\u00106\u001a\u00020\u0011H\u0016¢\u0006\u0004\b6\u0010\u0013Jd\u0010<\u001a\u00020\u0011\"\n\b\u0000\u00108\u0018\u0001*\u000207*\u0002072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u0000092\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u001f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110%2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u001fH\u0082\b¢\u0006\u0004\b:\u0010;J0\u0010@\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u00108\u0018\u0001*\u00020=*\u0002072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0082\b¢\u0006\u0004\b>\u0010?J\u0011\u0010A\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\bA\u0010BJ\u0011\u0010C\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u0004\u0018\u00010E*\u000207H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020$H\u0002¢\u0006\u0004\bH\u0010*R\u0014\u0010J\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010N\u001a\u00020 8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010D\"\u0004\bQ\u00103R\u0014\u0010S\u001a\u00020R8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001a\u0010V\u001a\u00020U8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020]8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R \u0010c\u001a\b\u0012\u0004\u0012\u00020b0a8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR.\u0010g\u001a\u0004\u0018\u00010 2\b\u0010\u0003\u001a\u0004\u0018\u00010 8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bg\u0010O\u001a\u0004\bh\u0010D\"\u0004\bi\u00103R*\u0010j\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n8\u0017@WX\u0097\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bj\u0010l\"\u0004\bm\u0010\u0016"}, d2 = {"Landroidx/compose/ui/focus/FocusOwnerImpl;", "Landroidx/compose/ui/focus/FocusOwner;", "Landroidx/compose/ui/focus/PlatformFocusOwner;", "p0", "Landroidx/compose/ui/node/Owner;", "p1", "<init>", "(Landroidx/compose/ui/focus/PlatformFocusOwner;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/focus/FocusDirection;", "Landroidx/compose/ui/geometry/Rect;", "", "requestOwnerFocus-7o62pno", "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", "requestOwnerFocus", "takeFocus-aToIllA", "(ILandroidx/compose/ui/geometry/Rect;)Z", "takeFocus", "", "releaseFocus", "()V", "clearOwnerFocus", "clearFocus", "(Z)V", "p2", "p3", "clearFocus-I7lrPNg", "(ZZZI)Z", "(ZZ)Z", "moveFocus-3ESFkO8", "(I)Z", "moveFocus", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusTargetNode;", "focusSearch-ULY8qGw", "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "focusSearch", "Landroidx/compose/ui/input/key/KeyEvent;", "Lkotlin/Function0;", "dispatchKeyEvent-YhN2O0w", "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z", "dispatchKeyEvent", "dispatchInterceptedSoftKeyboardEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "dispatchInterceptedSoftKeyboardEvent", "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;", "dispatchRotaryEvent", "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lkotlin/jvm/functions/Function0;)Z", "Landroidx/compose/ui/input/indirect/IndirectTouchEvent;", "dispatchIndirectTouchEvent", "(Landroidx/compose/ui/input/indirect/IndirectTouchEvent;Lkotlin/jvm/functions/Function0;)Z", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "scheduleInvalidationForOwner", "Landroidx/compose/ui/node/DelegatableNode;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/NodeKind;", "traverseAncestorsIncludingSelf-QFhIj7k", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "traverseAncestorsIncludingSelf", "", "nearestAncestorIncludingSelf-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "nearestAncestorIncludingSelf", "getFocusRect", "()Landroidx/compose/ui/geometry/Rect;", "findFocusTargetNode", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/Modifier$Node;", "lastLocalKeyInputNode", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;", "validateKeyEvent-ZmokQxo", "validateKeyEvent", "platformFocusOwner", "Landroidx/compose/ui/focus/PlatformFocusOwner;", "owner", "Landroidx/compose/ui/node/Owner;", "rootFocusNode", "Landroidx/compose/ui/focus/FocusTargetNode;", "getRootFocusNode$ui_release", "setRootFocusNode$ui_release", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "focusInvalidationManager", "Landroidx/compose/ui/focus/FocusInvalidationManager;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "Landroidx/collection/MutableLongSet;", "keysCurrentlyDown", "Landroidx/collection/MutableLongSet;", "Landroidx/compose/ui/focus/FocusState;", "getRootState", "()Landroidx/compose/ui/focus/FocusState;", "rootState", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/ui/focus/FocusListener;", "listeners", "Landroidx/collection/MutableObjectList;", "getListeners", "()Landroidx/collection/MutableObjectList;", "activeFocusTargetNode", "getActiveFocusTargetNode", "setActiveFocusTargetNode", "isFocusCaptured", "Z", "()Z", "setFocusCaptured"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;
    private FocusTargetNode activeFocusTargetNode;
    private final FocusInvalidationManager focusInvalidationManager;
    private boolean isFocusCaptured;
    private MutableLongSet keysCurrentlyDown;
    private final Owner owner;
    private final PlatformFocusOwner platformFocusOwner;
    private FocusTargetNode rootFocusNode = new FocusTargetNode(Focusability.INSTANCE.m3909getNeverLCbbffg(), null, null, 6, null);
    private final Modifier modifier = new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final boolean equals(Object p0) {
            return p0 == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void update(FocusTargetNode p0) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* JADX INFO: renamed from: create */
        public final FocusTargetNode getNode() {
            return this.this$0.getRootFocusNode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public final int hashCode() {
            return this.this$0.getRootFocusNode().hashCode();
        }
    };
    private final MutableObjectList<FocusListener> listeners = new MutableObjectList<>(1);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FocusOwnerImpl(PlatformFocusOwner platformFocusOwner, Owner owner) {
        this.platformFocusOwner = platformFocusOwner;
        this.owner = owner;
        this.focusInvalidationManager = new FocusInvalidationManager(this, owner);
    }

    /* JADX INFO: renamed from: getRootFocusNode$ui_release, reason: from getter */
    public final FocusTargetNode getRootFocusNode() {
        return this.rootFocusNode;
    }

    public final void setRootFocusNode$ui_release(FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: requestOwnerFocus-7o62pno */
    public final boolean mo3873requestOwnerFocus7o62pno(FocusDirection p0, Rect p1) {
        return this.platformFocusOwner.mo3916requestOwnerFocus7o62pno(p0, p1);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: takeFocus-aToIllA */
    public final boolean mo3874takeFocusaToIllA(final int p0, Rect p1) {
        Boolean boolMo3872focusSearchULY8qGw = mo3872focusSearchULY8qGw(p0, p1, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo3885requestFocus3ESFkO8(p0));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (boolMo3872focusSearchULY8qGw != null) {
            return boolMo3872focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void clearOwnerFocus() {
        this.platformFocusOwner.clearOwnerFocus();
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public final void clearFocus(boolean p0) {
        mo3869clearFocusI7lrPNg(p0, true, true, FocusDirection.INSTANCE.m3859getExitdhqQ8s());
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: clearFocus-I7lrPNg */
    public final boolean mo3869clearFocusI7lrPNg(boolean p0, boolean p1, boolean p2, int p3) {
        boolean zClearFocus;
        if (!p0) {
            int i = WhenMappings.$EnumSwitchMapping$0[FocusTransactionsKt.m3892performCustomClearFocusMxy_nc0(this.rootFocusNode, p3).ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                zClearFocus = false;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                zClearFocus = clearFocus(p0, p1);
            }
        } else {
            zClearFocus = clearFocus(p0, p1);
        }
        if (zClearFocus && p2) {
            clearOwnerFocus();
        }
        return zClearFocus;
    }

    static /* synthetic */ boolean clearFocus$default(FocusOwnerImpl focusOwnerImpl, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return focusOwnerImpl.clearFocus(z, z2);
    }

    private final boolean clearFocus(boolean p0, boolean p1) {
        NodeChain nodes;
        if (getActiveFocusTargetNode() == null) {
            return true;
        }
        if (getIsFocusCaptured() && !p0) {
            return false;
        }
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        setActiveFocusTargetNode(null);
        if (p1 && activeFocusTargetNode != null) {
            activeFocusTargetNode.dispatchFocusCallbacks$ui_release(getIsFocusCaptured() ? FocusStateImpl.Captured : FocusStateImpl.Active, FocusStateImpl.Inactive);
            FocusTargetNode focusTargetNode = activeFocusTargetNode;
            int iM5928constructorimpl = NodeKind.m5928constructorimpl(1024);
            if (!focusTargetNode.getNode().getIsAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node parent = focusTargetNode.getNode().getParent();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            while (layoutNodeRequireLayoutNode != null) {
                if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & iM5928constructorimpl) != 0) {
                    while (parent != null) {
                        if ((parent.getKindSet() & iM5928constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            Modifier.Node nodePop = parent;
                            while (nodePop != null) {
                                if (nodePop instanceof FocusTargetNode) {
                                    ((FocusTargetNode) nodePop).dispatchFocusCallbacks$ui_release(FocusStateImpl.ActiveParent, FocusStateImpl.Inactive);
                                } else if ((nodePop.getKindSet() & iM5928constructorimpl) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i = 0;
                                    for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                        if ((delegate.getKindSet() & iM5928constructorimpl) != 0) {
                                            i++;
                                            if (i == 1) {
                                                nodePop = delegate;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(nodePop);
                                                    }
                                                    nodePop = null;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate);
                                                }
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        parent = parent.getParent();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.FocusManager
    /* JADX INFO: renamed from: moveFocus-3ESFkO8 */
    public final boolean mo3867moveFocus3ESFkO8(final int p0) {
        if (ComposeUiFlags.isViewFocusFixEnabled && this.platformFocusOwner.mo3915moveFocusInChildren3ESFkO8(p0)) {
            return true;
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = Boolean.FALSE;
        FocusTargetNode activeFocusTargetNode = getActiveFocusTargetNode();
        Boolean boolMo3872focusSearchULY8qGw = mo3872focusSearchULY8qGw(p0, this.platformFocusOwner.getEmbeddedViewFocusRect(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                objectRef.element = Boolean.valueOf(focusTargetNode.mo3885requestFocus3ESFkO8(p0));
                return objectRef.element;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (Intrinsics.areEqual(boolMo3872focusSearchULY8qGw, Boolean.TRUE) && activeFocusTargetNode != getActiveFocusTargetNode()) {
            return true;
        }
        if (boolMo3872focusSearchULY8qGw != null && objectRef.element != null) {
            if (boolMo3872focusSearchULY8qGw.booleanValue() && ((Boolean) objectRef.element).booleanValue()) {
                return true;
            }
            if (FocusOwnerImplKt.m3878is1dFocusSearch3ESFkO8(p0)) {
                return mo3869clearFocusI7lrPNg(false, true, false, p0) && mo3874takeFocusaToIllA(p0, null);
            }
            if (!ComposeUiFlags.isViewFocusFixEnabled && this.platformFocusOwner.mo3915moveFocusInChildren3ESFkO8(p0)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: focusSearch-ULY8qGw */
    public final Boolean mo3872focusSearchULY8qGw(int p0, Rect p1, final Function1<? super FocusTargetNode, Boolean> p2) {
        final FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            FocusRequester focusRequesterM3898customFocusSearchOMvw8 = FocusTraversalKt.m3898customFocusSearchOMvw8(focusTargetNodeFindFocusTargetNode, p0, this.owner.getLayoutDirection());
            if (Intrinsics.areEqual(focusRequesterM3898customFocusSearchOMvw8, FocusRequester.INSTANCE.getCancel())) {
                return null;
            }
            if (Intrinsics.areEqual(focusRequesterM3898customFocusSearchOMvw8, FocusRequester.INSTANCE.getRedirect$ui_release())) {
                FocusTargetNode focusTargetNodeFindFocusTargetNode2 = findFocusTargetNode();
                if (focusTargetNodeFindFocusTargetNode2 != null) {
                    return p2.invoke(focusTargetNodeFindFocusTargetNode2);
                }
                return null;
            }
            if (!Intrinsics.areEqual(focusRequesterM3898customFocusSearchOMvw8, FocusRequester.INSTANCE.getDefault())) {
                return Boolean.valueOf(focusRequesterM3898customFocusSearchOMvw8.findFocusTargetNode$ui_release(p2));
            }
        } else {
            focusTargetNodeFindFocusTargetNode = null;
        }
        return FocusTraversalKt.m3899focusSearch0X8WOeE(this.rootFocusNode, p0, this.owner.getLayoutDirection(), p1, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean zBooleanValue;
                if (Intrinsics.areEqual(focusTargetNode, focusTargetNodeFindFocusTargetNode)) {
                    zBooleanValue = false;
                } else {
                    if (Intrinsics.areEqual(focusTargetNode, this.getRootFocusNode())) {
                        throw new IllegalStateException("Focus search landed at the root.".toString());
                    }
                    zBooleanValue = p2.invoke(focusTargetNode).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public final boolean mo3870dispatchInterceptedSoftKeyboardEventZmokQxo(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.mo3870dispatchInterceptedSoftKeyboardEventZmokQxo(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean dispatchRotaryEvent(androidx.compose.ui.input.rotary.RotaryScrollEvent r17, kotlin.jvm.functions.Function0<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.dispatchRotaryEvent(androidx.compose.ui.input.rotary.RotaryScrollEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.compose.ui.Modifier$Node] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    public final boolean dispatchIndirectTouchEvent(androidx.compose.ui.input.indirect.IndirectTouchEvent r17, kotlin.jvm.functions.Function0<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.dispatchIndirectTouchEvent(androidx.compose.ui.input.indirect.IndirectTouchEvent, kotlin.jvm.functions.Function0):boolean");
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void scheduleInvalidation(FocusTargetNode p0) {
        this.focusInvalidationManager.scheduleInvalidation(p0);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void scheduleInvalidation(FocusEventModifierNode p0) {
        this.focusInvalidationManager.scheduleInvalidation(p0);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void scheduleInvalidationForOwner() {
        this.focusInvalidationManager.scheduleInvalidation();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final Rect getFocusRect() {
        FocusTargetNode focusTargetNodeFindFocusTargetNode = findFocusTargetNode();
        if (focusTargetNodeFindFocusTargetNode != null) {
            return FocusTraversalKt.focusRect(focusTargetNodeFindFocusTargetNode);
        }
        return null;
    }

    private final FocusTargetNode findFocusTargetNode() {
        return FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final MutableObjectList<FocusListener> getListeners() {
        return this.listeners;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final FocusTargetNode getActiveFocusTargetNode() {
        return this.activeFocusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void setActiveFocusTargetNode(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = this.activeFocusTargetNode;
        this.activeFocusTargetNode = focusTargetNode;
        if (focusTargetNode == null || focusTargetNode2 != focusTargetNode) {
            setFocusCaptured(false);
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled) {
            MutableObjectList<FocusListener> listeners = getListeners();
            Object[] objArr = listeners.content;
            int i = listeners._size;
            for (int i2 = 0; i2 < i; i2++) {
                ((FocusListener) objArr[i2]).onFocusChanged(focusTargetNode2, focusTargetNode);
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: isFocusCaptured, reason: from getter */
    public final boolean getIsFocusCaptured() {
        return this.isFocusCaptured;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public final void setFocusCaptured(boolean z) {
        if (z && getActiveFocusTargetNode() == null) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot capture focus when the active focus target node is unset");
        }
        this.isFocusCaptured = z;
    }

    /* JADX INFO: renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m3877validateKeyEventZmokQxo(KeyEvent p0) {
        long jM5364getKeyZmokQxo = KeyEvent_androidKt.m5364getKeyZmokQxo(p0);
        int iM5365getTypeZmokQxo = KeyEvent_androidKt.m5365getTypeZmokQxo(p0);
        if (KeyEventType.m5357equalsimpl0(iM5365getTypeZmokQxo, KeyEventType.INSTANCE.m5361getKeyDownCS__XNY())) {
            MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (mutableLongSet == null) {
                mutableLongSet = new MutableLongSet(3);
                this.keysCurrentlyDown = mutableLongSet;
            }
            mutableLongSet.plusAssign(jM5364getKeyZmokQxo);
        } else if (KeyEventType.m5357equalsimpl0(iM5365getTypeZmokQxo, KeyEventType.INSTANCE.m5362getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 == null || !mutableLongSet2.contains(jM5364getKeyZmokQxo)) {
                return false;
            }
            MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
            if (mutableLongSet3 != null) {
                mutableLongSet3.remove(jM5364getKeyZmokQxo);
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x018d A[Catch: all -> 0x03bd, TryCatch #0 {all -> 0x03bd, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0036, B:118:0x0195, B:120:0x01a5, B:121:0x01a8, B:123:0x01b7, B:126:0x01c8, B:134:0x01d9, B:135:0x01e0, B:158:0x0225, B:136:0x01e4, B:141:0x01ef, B:143:0x01f9, B:145:0x0200, B:147:0x0204, B:149:0x020a, B:152:0x0215, B:155:0x021b, B:156:0x021e, B:159:0x022a, B:160:0x022f, B:162:0x0235, B:164:0x023b, B:167:0x0246, B:169:0x0250, B:175:0x0266, B:176:0x0268, B:177:0x0278, B:179:0x027c, B:181:0x0282, B:210:0x02ec, B:185:0x0290, B:187:0x029b, B:189:0x02a1, B:191:0x02ac, B:193:0x02b3, B:195:0x02b7, B:196:0x02bc, B:198:0x02c2, B:199:0x02c9, B:201:0x02d1, B:203:0x02d7, B:204:0x02da, B:205:0x02dc, B:207:0x02e2, B:208:0x02e5, B:211:0x02f7, B:215:0x0307, B:216:0x0317, B:218:0x031b, B:220:0x0321, B:249:0x038b, B:224:0x032f, B:226:0x033a, B:228:0x0340, B:230:0x034b, B:232:0x0352, B:234:0x0356, B:235:0x035b, B:237:0x0361, B:238:0x0368, B:240:0x0370, B:242:0x0376, B:243:0x0379, B:244:0x037b, B:246:0x0381, B:247:0x0384, B:251:0x0398, B:253:0x03a2, B:258:0x03b5, B:259:0x03b7, B:18:0x0041, B:20:0x0051, B:21:0x0054, B:23:0x005e, B:26:0x006f, B:33:0x007e, B:38:0x0089, B:40:0x0093, B:42:0x009a, B:44:0x009e, B:46:0x00a4, B:49:0x00af, B:52:0x00b5, B:53:0x00b8, B:55:0x00bf, B:64:0x00dd, B:66:0x00e1, B:56:0x00c4, B:57:0x00c9, B:59:0x00cf, B:61:0x00d5, B:67:0x00e7, B:69:0x00f9, B:70:0x00fc, B:72:0x010a, B:75:0x011b, B:82:0x012a, B:87:0x0135, B:89:0x013f, B:91:0x0146, B:93:0x014a, B:95:0x0150, B:98:0x015b, B:101:0x0161, B:102:0x0164, B:104:0x016b, B:113:0x0189, B:115:0x018d, B:105:0x0170, B:106:0x0175, B:108:0x017b, B:110:0x0181), top: B:265:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0192  */
    /* JADX WARN: Code duplicated, block: B:342:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0189 A[EDGE_INSN: B:343:0x0189->B:113:0x0189 BREAK  A[LOOP:14: B:71:0x0108->B:347:0x0108, LOOP_LABEL: LOOP:14: B:71:0x0108->B:347:0x0108], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e7 A[Catch: all -> 0x03bd, TryCatch #0 {all -> 0x03bd, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0036, B:118:0x0195, B:120:0x01a5, B:121:0x01a8, B:123:0x01b7, B:126:0x01c8, B:134:0x01d9, B:135:0x01e0, B:158:0x0225, B:136:0x01e4, B:141:0x01ef, B:143:0x01f9, B:145:0x0200, B:147:0x0204, B:149:0x020a, B:152:0x0215, B:155:0x021b, B:156:0x021e, B:159:0x022a, B:160:0x022f, B:162:0x0235, B:164:0x023b, B:167:0x0246, B:169:0x0250, B:175:0x0266, B:176:0x0268, B:177:0x0278, B:179:0x027c, B:181:0x0282, B:210:0x02ec, B:185:0x0290, B:187:0x029b, B:189:0x02a1, B:191:0x02ac, B:193:0x02b3, B:195:0x02b7, B:196:0x02bc, B:198:0x02c2, B:199:0x02c9, B:201:0x02d1, B:203:0x02d7, B:204:0x02da, B:205:0x02dc, B:207:0x02e2, B:208:0x02e5, B:211:0x02f7, B:215:0x0307, B:216:0x0317, B:218:0x031b, B:220:0x0321, B:249:0x038b, B:224:0x032f, B:226:0x033a, B:228:0x0340, B:230:0x034b, B:232:0x0352, B:234:0x0356, B:235:0x035b, B:237:0x0361, B:238:0x0368, B:240:0x0370, B:242:0x0376, B:243:0x0379, B:244:0x037b, B:246:0x0381, B:247:0x0384, B:251:0x0398, B:253:0x03a2, B:258:0x03b5, B:259:0x03b7, B:18:0x0041, B:20:0x0051, B:21:0x0054, B:23:0x005e, B:26:0x006f, B:33:0x007e, B:38:0x0089, B:40:0x0093, B:42:0x009a, B:44:0x009e, B:46:0x00a4, B:49:0x00af, B:52:0x00b5, B:53:0x00b8, B:55:0x00bf, B:64:0x00dd, B:66:0x00e1, B:56:0x00c4, B:57:0x00c9, B:59:0x00cf, B:61:0x00d5, B:67:0x00e7, B:69:0x00f9, B:70:0x00fc, B:72:0x010a, B:75:0x011b, B:82:0x012a, B:87:0x0135, B:89:0x013f, B:91:0x0146, B:93:0x014a, B:95:0x0150, B:98:0x015b, B:101:0x0161, B:102:0x0164, B:104:0x016b, B:113:0x0189, B:115:0x018d, B:105:0x0170, B:106:0x0175, B:108:0x017b, B:110:0x0181), top: B:265:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f9 A[Catch: all -> 0x03bd, TryCatch #0 {all -> 0x03bd, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0036, B:118:0x0195, B:120:0x01a5, B:121:0x01a8, B:123:0x01b7, B:126:0x01c8, B:134:0x01d9, B:135:0x01e0, B:158:0x0225, B:136:0x01e4, B:141:0x01ef, B:143:0x01f9, B:145:0x0200, B:147:0x0204, B:149:0x020a, B:152:0x0215, B:155:0x021b, B:156:0x021e, B:159:0x022a, B:160:0x022f, B:162:0x0235, B:164:0x023b, B:167:0x0246, B:169:0x0250, B:175:0x0266, B:176:0x0268, B:177:0x0278, B:179:0x027c, B:181:0x0282, B:210:0x02ec, B:185:0x0290, B:187:0x029b, B:189:0x02a1, B:191:0x02ac, B:193:0x02b3, B:195:0x02b7, B:196:0x02bc, B:198:0x02c2, B:199:0x02c9, B:201:0x02d1, B:203:0x02d7, B:204:0x02da, B:205:0x02dc, B:207:0x02e2, B:208:0x02e5, B:211:0x02f7, B:215:0x0307, B:216:0x0317, B:218:0x031b, B:220:0x0321, B:249:0x038b, B:224:0x032f, B:226:0x033a, B:228:0x0340, B:230:0x034b, B:232:0x0352, B:234:0x0356, B:235:0x035b, B:237:0x0361, B:238:0x0368, B:240:0x0370, B:242:0x0376, B:243:0x0379, B:244:0x037b, B:246:0x0381, B:247:0x0384, B:251:0x0398, B:253:0x03a2, B:258:0x03b5, B:259:0x03b7, B:18:0x0041, B:20:0x0051, B:21:0x0054, B:23:0x005e, B:26:0x006f, B:33:0x007e, B:38:0x0089, B:40:0x0093, B:42:0x009a, B:44:0x009e, B:46:0x00a4, B:49:0x00af, B:52:0x00b5, B:53:0x00b8, B:55:0x00bf, B:64:0x00dd, B:66:0x00e1, B:56:0x00c4, B:57:0x00c9, B:59:0x00cf, B:61:0x00d5, B:67:0x00e7, B:69:0x00f9, B:70:0x00fc, B:72:0x010a, B:75:0x011b, B:82:0x012a, B:87:0x0135, B:89:0x013f, B:91:0x0146, B:93:0x014a, B:95:0x0150, B:98:0x015b, B:101:0x0161, B:102:0x0164, B:104:0x016b, B:113:0x0189, B:115:0x018d, B:105:0x0170, B:106:0x0175, B:108:0x017b, B:110:0x0181), top: B:265:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x010a A[Catch: all -> 0x03bd, TryCatch #0 {all -> 0x03bd, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0036, B:118:0x0195, B:120:0x01a5, B:121:0x01a8, B:123:0x01b7, B:126:0x01c8, B:134:0x01d9, B:135:0x01e0, B:158:0x0225, B:136:0x01e4, B:141:0x01ef, B:143:0x01f9, B:145:0x0200, B:147:0x0204, B:149:0x020a, B:152:0x0215, B:155:0x021b, B:156:0x021e, B:159:0x022a, B:160:0x022f, B:162:0x0235, B:164:0x023b, B:167:0x0246, B:169:0x0250, B:175:0x0266, B:176:0x0268, B:177:0x0278, B:179:0x027c, B:181:0x0282, B:210:0x02ec, B:185:0x0290, B:187:0x029b, B:189:0x02a1, B:191:0x02ac, B:193:0x02b3, B:195:0x02b7, B:196:0x02bc, B:198:0x02c2, B:199:0x02c9, B:201:0x02d1, B:203:0x02d7, B:204:0x02da, B:205:0x02dc, B:207:0x02e2, B:208:0x02e5, B:211:0x02f7, B:215:0x0307, B:216:0x0317, B:218:0x031b, B:220:0x0321, B:249:0x038b, B:224:0x032f, B:226:0x033a, B:228:0x0340, B:230:0x034b, B:232:0x0352, B:234:0x0356, B:235:0x035b, B:237:0x0361, B:238:0x0368, B:240:0x0370, B:242:0x0376, B:243:0x0379, B:244:0x037b, B:246:0x0381, B:247:0x0384, B:251:0x0398, B:253:0x03a2, B:258:0x03b5, B:259:0x03b7, B:18:0x0041, B:20:0x0051, B:21:0x0054, B:23:0x005e, B:26:0x006f, B:33:0x007e, B:38:0x0089, B:40:0x0093, B:42:0x009a, B:44:0x009e, B:46:0x00a4, B:49:0x00af, B:52:0x00b5, B:53:0x00b8, B:55:0x00bf, B:64:0x00dd, B:66:0x00e1, B:56:0x00c4, B:57:0x00c9, B:59:0x00cf, B:61:0x00d5, B:67:0x00e7, B:69:0x00f9, B:70:0x00fc, B:72:0x010a, B:75:0x011b, B:82:0x012a, B:87:0x0135, B:89:0x013f, B:91:0x0146, B:93:0x014a, B:95:0x0150, B:98:0x015b, B:101:0x0161, B:102:0x0164, B:104:0x016b, B:113:0x0189, B:115:0x018d, B:105:0x0170, B:106:0x0175, B:108:0x017b, B:110:0x0181), top: B:265:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0119 A[ADDED_TO_REGION, LOOP:15: B:74:0x0119->B:105:0x0170, LOOP_START, PHI: r10
  0x0119: PHI (r10v9 androidx.compose.ui.Modifier$Node) = (r10v4 androidx.compose.ui.Modifier$Node), (r10v10 androidx.compose.ui.Modifier$Node) binds: [B:73:0x0117, B:105:0x0170] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x011b A[Catch: all -> 0x03bd, TRY_LEAVE, TryCatch #0 {all -> 0x03bd, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0036, B:118:0x0195, B:120:0x01a5, B:121:0x01a8, B:123:0x01b7, B:126:0x01c8, B:134:0x01d9, B:135:0x01e0, B:158:0x0225, B:136:0x01e4, B:141:0x01ef, B:143:0x01f9, B:145:0x0200, B:147:0x0204, B:149:0x020a, B:152:0x0215, B:155:0x021b, B:156:0x021e, B:159:0x022a, B:160:0x022f, B:162:0x0235, B:164:0x023b, B:167:0x0246, B:169:0x0250, B:175:0x0266, B:176:0x0268, B:177:0x0278, B:179:0x027c, B:181:0x0282, B:210:0x02ec, B:185:0x0290, B:187:0x029b, B:189:0x02a1, B:191:0x02ac, B:193:0x02b3, B:195:0x02b7, B:196:0x02bc, B:198:0x02c2, B:199:0x02c9, B:201:0x02d1, B:203:0x02d7, B:204:0x02da, B:205:0x02dc, B:207:0x02e2, B:208:0x02e5, B:211:0x02f7, B:215:0x0307, B:216:0x0317, B:218:0x031b, B:220:0x0321, B:249:0x038b, B:224:0x032f, B:226:0x033a, B:228:0x0340, B:230:0x034b, B:232:0x0352, B:234:0x0356, B:235:0x035b, B:237:0x0361, B:238:0x0368, B:240:0x0370, B:242:0x0376, B:243:0x0379, B:244:0x037b, B:246:0x0381, B:247:0x0384, B:251:0x0398, B:253:0x03a2, B:258:0x03b5, B:259:0x03b7, B:18:0x0041, B:20:0x0051, B:21:0x0054, B:23:0x005e, B:26:0x006f, B:33:0x007e, B:38:0x0089, B:40:0x0093, B:42:0x009a, B:44:0x009e, B:46:0x00a4, B:49:0x00af, B:52:0x00b5, B:53:0x00b8, B:55:0x00bf, B:64:0x00dd, B:66:0x00e1, B:56:0x00c4, B:57:0x00c9, B:59:0x00cf, B:61:0x00d5, B:67:0x00e7, B:69:0x00f9, B:70:0x00fc, B:72:0x010a, B:75:0x011b, B:82:0x012a, B:87:0x0135, B:89:0x013f, B:91:0x0146, B:93:0x014a, B:95:0x0150, B:98:0x015b, B:101:0x0161, B:102:0x0164, B:104:0x016b, B:113:0x0189, B:115:0x018d, B:105:0x0170, B:106:0x0175, B:108:0x017b, B:110:0x0181), top: B:265:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x0126  */
    /* JADX WARN: Code duplicated, block: B:82:0x012a A[Catch: all -> 0x03bd, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x03bd, blocks: (B:3:0x0009, B:5:0x0012, B:8:0x001d, B:12:0x0027, B:15:0x0036, B:118:0x0195, B:120:0x01a5, B:121:0x01a8, B:123:0x01b7, B:126:0x01c8, B:134:0x01d9, B:135:0x01e0, B:158:0x0225, B:136:0x01e4, B:141:0x01ef, B:143:0x01f9, B:145:0x0200, B:147:0x0204, B:149:0x020a, B:152:0x0215, B:155:0x021b, B:156:0x021e, B:159:0x022a, B:160:0x022f, B:162:0x0235, B:164:0x023b, B:167:0x0246, B:169:0x0250, B:175:0x0266, B:176:0x0268, B:177:0x0278, B:179:0x027c, B:181:0x0282, B:210:0x02ec, B:185:0x0290, B:187:0x029b, B:189:0x02a1, B:191:0x02ac, B:193:0x02b3, B:195:0x02b7, B:196:0x02bc, B:198:0x02c2, B:199:0x02c9, B:201:0x02d1, B:203:0x02d7, B:204:0x02da, B:205:0x02dc, B:207:0x02e2, B:208:0x02e5, B:211:0x02f7, B:215:0x0307, B:216:0x0317, B:218:0x031b, B:220:0x0321, B:249:0x038b, B:224:0x032f, B:226:0x033a, B:228:0x0340, B:230:0x034b, B:232:0x0352, B:234:0x0356, B:235:0x035b, B:237:0x0361, B:238:0x0368, B:240:0x0370, B:242:0x0376, B:243:0x0379, B:244:0x037b, B:246:0x0381, B:247:0x0384, B:251:0x0398, B:253:0x03a2, B:258:0x03b5, B:259:0x03b7, B:18:0x0041, B:20:0x0051, B:21:0x0054, B:23:0x005e, B:26:0x006f, B:33:0x007e, B:38:0x0089, B:40:0x0093, B:42:0x009a, B:44:0x009e, B:46:0x00a4, B:49:0x00af, B:52:0x00b5, B:53:0x00b8, B:55:0x00bf, B:64:0x00dd, B:66:0x00e1, B:56:0x00c4, B:57:0x00c9, B:59:0x00cf, B:61:0x00d5, B:67:0x00e7, B:69:0x00f9, B:70:0x00fc, B:72:0x010a, B:75:0x011b, B:82:0x012a, B:87:0x0135, B:89:0x013f, B:91:0x0146, B:93:0x014a, B:95:0x0150, B:98:0x015b, B:101:0x0161, B:102:0x0164, B:104:0x016b, B:113:0x0189, B:115:0x018d, B:105:0x0170, B:106:0x0175, B:108:0x017b, B:110:0x0181), top: B:265:0x0009 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v61 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v20, types: [T] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v25, types: [T] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r4v21, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v31, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v40, types: [T, androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v50, types: [T, androidx.compose.ui.Modifier$Node, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v9, types: [T, androidx.compose.ui.Modifier$Node] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w */
    public final boolean mo3871dispatchKeyEventYhN2O0w(android.view.KeyEvent r17, kotlin.jvm.functions.Function0<java.lang.Boolean> r18) {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.mo3871dispatchKeyEventYhN2O0w(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX INFO: renamed from: traverseAncestorsIncludingSelf-QFhIj7k, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m3876traverseAncestorsIncludingSelfQFhIj7k(DelegatableNode delegatableNode, int i, Function1<? super T, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function2) {
        int i2;
        int size;
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i) != 0) {
                        Modifier.Node nodePop = parent;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (nodePop instanceof Object) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(nodePop);
                            } else if ((nodePop.getKindSet() & i) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate = ((DelegatingNode) nodePop).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop = delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                nodePop = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
            while (true) {
                int i4 = size - 1;
                function1.invoke((Object) arrayList.get(size));
                if (i4 < 0) {
                    break;
                } else {
                    size = i4;
                }
            }
        }
        Modifier.Node node = delegatableNode.getNode();
        MutableVector mutableVector2 = null;
        while (node != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (node instanceof Object) {
                function1.invoke(node);
            } else if ((node.getKindSet() & i) != 0 && (node instanceof DelegatingNode)) {
                int i5 = 0;
                for (Modifier.Node delegate2 = ((DelegatingNode) node).getDelegate(); delegate2 != null; delegate2 = delegate2.getChild()) {
                    if ((delegate2.getKindSet() & i) != 0) {
                        i5++;
                        if (i5 == 1) {
                            node = delegate2;
                        } else {
                            if (mutableVector2 == null) {
                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                if (mutableVector2 != null) {
                                    mutableVector2.add(node);
                                }
                                node = null;
                            }
                            if (mutableVector2 != null) {
                                mutableVector2.add(delegate2);
                            }
                        }
                    }
                }
                if (i5 != 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector2);
        }
        function0.invoke();
        Modifier.Node node2 = delegatableNode.getNode();
        MutableVector mutableVector3 = null;
        while (node2 != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (node2 instanceof Object) {
                function2.invoke(node2);
            } else if ((node2.getKindSet() & i) != 0 && (node2 instanceof DelegatingNode)) {
                int i6 = 0;
                for (Modifier.Node delegate3 = ((DelegatingNode) node2).getDelegate(); delegate3 != null; delegate3 = delegate3.getChild()) {
                    if ((delegate3.getKindSet() & i) != 0) {
                        i6++;
                        if (i6 == 1) {
                            node2 = delegate3;
                        } else {
                            if (mutableVector3 == null) {
                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node2 != null) {
                                if (mutableVector3 != null) {
                                    mutableVector3.add(node2);
                                }
                                node2 = null;
                            }
                            if (mutableVector3 != null) {
                                mutableVector3.add(delegate3);
                            }
                        }
                    }
                }
                if (i6 != 1) {
                }
            }
            node2 = DelegatableNodeKt.pop(mutableVector3);
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (i2 = 0; i2 < size2; i2++) {
                function2.invoke((Object) arrayList.get(i2));
            }
        }
    }

    /* JADX INFO: renamed from: nearestAncestorIncludingSelf-64DMado, reason: not valid java name */
    private final /* synthetic */ <T> T m3875nearestAncestorIncludingSelf64DMado(DelegatableNode delegatableNode, int i) {
        NodeChain nodes;
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes().getHead().getAggregateChildKindSet() & i) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i) != 0) {
                        Object obj = (T) node;
                        MutableVector mutableVector = null;
                        while (obj != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (obj instanceof Object) {
                                return (T) obj;
                            }
                            if ((((Modifier.Node) obj).getKindSet() & i) != 0 && (obj instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate = obj.getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                    if ((delegate.getKindSet() & i) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            obj = (T) delegate;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (obj != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(obj);
                                                }
                                                obj = (T) null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate);
                                            }
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            obj = (T) DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail();
        }
        return null;
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int iM5928constructorimpl = NodeKind.m5928constructorimpl(1024) | NodeKind.m5928constructorimpl(8192);
        if (!delegatableNode.getNode().getIsAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet() & iM5928constructorimpl) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iM5928constructorimpl) != 0) {
                    if ((NodeKind.m5928constructorimpl(1024) & child.getKindSet()) != 0) {
                        return node2;
                    }
                    node2 = child;
                }
            }
        }
        return node2;
    }
}
