package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import defpackage.isVirtualCamera;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0006\b!\u0018\u0000 s2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001sBE\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\r\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u0019J\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0019J\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010\u0019J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b$\u0010%J(\u0010,\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020'2\u0006\u0010\n\u001a\u00020(2\u0006\u0010\f\u001a\u00020)ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020#ø\u0001\u0000¢\u0006\u0004\b-\u0010%J\u0011\u0010/\u001a\u0004\u0018\u00010\u0012H\u0004¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u0010\u0017JP\u00104\u001a\u00020\u00122\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0004ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u0013\u00106\u001a\u00020\u0012*\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0011\u00108\u001a\u00020\u0012*\u000205¢\u0006\u0004\b8\u00107J\u0014\u0010:\u001a\u00020\u0012*\u000209H¦@¢\u0006\u0004\b:\u0010;J\u001f\u0010@\u001a\u00020\u0012*\u00020<2\u0006\u0010\b\u001a\u00020=H\u0084@ø\u0001\u0000¢\u0006\u0004\b>\u0010?R\u0019\u0010A\u001a\u00020=8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bA\u0010BR \u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020E0C8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bF\u0010GR$\u0010H\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b8\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010\u0017R\u0014\u0010L\u001a\u00020K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010IR0\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u001b\u0010g\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010i\u001a\u00020\u000b8\u0007X\u0087D¢\u0006\f\n\u0004\bi\u0010I\u001a\u0004\bj\u0010\u0017R\u0011\u0010l\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\bk\u0010\u0017R\u001a\u0010n\u001a\u00020m8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/TraversableNode;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p0", "Landroidx/compose/foundation/IndicationNodeFactory;", "p1", "", "p2", "", "p3", "Landroidx/compose/ui/semantics/Role;", "p4", "Lkotlin/Function0;", "", "p5", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "delayPressInteraction", "()Z", "disposeInteractions", "()V", "emitHoverEnter", "emitHoverExit", "initializeIndicationAndInteractionSourceIfNeeded", "onAttach", "onCancelPointerInput", "onDetach", "Landroidx/compose/ui/focus/FocusState;", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "resetPointerInputHandler", "()Lkotlin/Unit;", "shouldLazilyCreateIndication", "updateCommon-QzZPfjk", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/IndicationNodeFactory;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)V", "updateCommon", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applyAdditionalSemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "applySemantics", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "clickPointerInput", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/geometry/Offset;", "handlePressInteraction-d-4ec7I", "(Landroidx/compose/foundation/gestures/PressGestureScope;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePressInteraction", "centerOffset", "J", "", "Landroidx/compose/ui/input/key/Key;", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "currentKeyPressInteractions", "Ljava/util/Map;", "enabled", "Z", "getEnabled", "Landroidx/compose/foundation/FocusableInNonTouchMode;", "focusableInNonTouchMode", "Landroidx/compose/foundation/FocusableInNonTouchMode;", "Landroidx/compose/foundation/FocusableNode;", "focusableNode", "Landroidx/compose/foundation/FocusableNode;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "hoverInteraction", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "Landroidx/compose/ui/node/DelegatableNode;", "indicationNode", "Landroidx/compose/ui/node/DelegatableNode;", "indicationNodeFactory", "Landroidx/compose/foundation/IndicationNodeFactory;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "lazilyCreateIndication", "onClick", "Lkotlin/jvm/functions/Function0;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "onClickLabel", "Ljava/lang/String;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pressInteraction", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "role", "Landroidx/compose/ui/semantics/Role;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "", "traverseKey", "Ljava/lang/Object;", "getTraverseKey", "()Ljava/lang/Object;", "userProvidedInteractionSource", "TraverseKey"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, FocusEventModifierNode, SemanticsModifierNode, TraversableNode {
    private long centerOffset;
    private final Map<Key, PressInteraction.Press> currentKeyPressInteractions;
    private boolean enabled;
    private final FocusableInNonTouchMode focusableInNonTouchMode;
    private final FocusableNode focusableNode;
    private HoverInteraction.Enter hoverInteraction;
    private DelegatableNode indicationNode;
    private IndicationNodeFactory indicationNodeFactory;
    private MutableInteractionSource interactionSource;
    private boolean lazilyCreateIndication;
    private Function0<Unit> onClick;
    private String onClickLabel;
    private SuspendingPointerInputModifierNode pointerInputNode;
    private PressInteraction.Press pressInteraction;
    private Role role;
    private final boolean shouldAutoInvalidate;
    private final Object traverseKey;
    private MutableInteractionSource userProvidedInteractionSource;

    /* JADX INFO: renamed from: TraverseKey, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public abstract Object clickPointerInput(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation);

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo531onPreKeyEventZmokQxo(KeyEvent p0) {
        return false;
    }

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, String str, Role role, Function0<Unit> function0) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z;
        this.onClick = function0;
        this.focusableInNonTouchMode = new FocusableInNonTouchMode();
        this.focusableNode = new FocusableNode(this.interactionSource);
        this.currentKeyPressInteractions = new LinkedHashMap();
        this.centerOffset = Offset.INSTANCE.m3990getZeroF1C5BW0();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
        this.traverseKey = INSTANCE;
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    private final boolean shouldLazilyCreateIndication() {
        return this.userProvidedInteractionSource == null && this.indicationNodeFactory != null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX INFO: renamed from: updateCommon-QzZPfjk, reason: not valid java name */
    protected final void m532updateCommonQzZPfjk(MutableInteractionSource p0, IndicationNodeFactory p1, boolean p2, String p3, Role p4, Function0<Unit> p5) {
        boolean z;
        DelegatableNode delegatableNode;
        boolean z2 = true;
        if (Intrinsics.areEqual(this.userProvidedInteractionSource, p0)) {
            z = false;
        } else {
            disposeInteractions();
            this.userProvidedInteractionSource = p0;
            this.interactionSource = p0;
            z = true;
        }
        if (Intrinsics.areEqual(this.indicationNodeFactory, p1)) {
            z2 = z;
        } else {
            this.indicationNodeFactory = p1;
        }
        if (this.enabled != p2) {
            if (p2) {
                delegate(this.focusableInNonTouchMode);
                delegate(this.focusableNode);
            } else {
                undelegate(this.focusableInNonTouchMode);
                undelegate(this.focusableNode);
                disposeInteractions();
            }
            SemanticsModifierNodeKt.invalidateSemantics(this);
            this.enabled = p2;
        }
        if (!Intrinsics.areEqual(this.onClickLabel, p3)) {
            this.onClickLabel = p3;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!Intrinsics.areEqual(this.role, p4)) {
            this.role = p4;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.onClick = p5;
        if (this.lazilyCreateIndication != shouldLazilyCreateIndication()) {
            boolean zShouldLazilyCreateIndication = shouldLazilyCreateIndication();
            this.lazilyCreateIndication = zShouldLazilyCreateIndication;
            if (!zShouldLazilyCreateIndication && this.indicationNode == null) {
                delegatableNode = this.indicationNode;
                if (delegatableNode == null) {
                    if (delegatableNode != null) {
                        undelegate(delegatableNode);
                    }
                    this.indicationNode = null;
                    initializeIndicationAndInteractionSourceIfNeeded();
                } else {
                    if (delegatableNode != null) {
                        undelegate(delegatableNode);
                    }
                    this.indicationNode = null;
                    initializeIndicationAndInteractionSourceIfNeeded();
                }
            } else if (z2) {
                delegatableNode = this.indicationNode;
                if (delegatableNode == null || !this.lazilyCreateIndication) {
                    if (delegatableNode != null) {
                        undelegate(delegatableNode);
                    }
                    this.indicationNode = null;
                    initializeIndicationAndInteractionSourceIfNeeded();
                }
            }
        } else if (z2) {
            delegatableNode = this.indicationNode;
            if (delegatableNode == null) {
                if (delegatableNode != null) {
                    undelegate(delegatableNode);
                }
                this.indicationNode = null;
                initializeIndicationAndInteractionSourceIfNeeded();
            } else {
                if (delegatableNode != null) {
                    undelegate(delegatableNode);
                }
                this.indicationNode = null;
                initializeIndicationAndInteractionSourceIfNeeded();
            }
        }
        this.focusableNode.update(this.interactionSource);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        if (!this.lazilyCreateIndication) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            delegate(this.focusableInNonTouchMode);
            delegate(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
    }

    protected final void disposeInteractions() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = this.pressInteraction;
            if (press != null) {
                mutableInteractionSource.tryEmit(new PressInteraction.Cancel(press));
            }
            HoverInteraction.Enter enter = this.hoverInteraction;
            if (enter != null) {
                mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enter));
            }
            Iterator<T> it = this.currentKeyPressInteractions.values().iterator();
            while (it.hasNext()) {
                mutableInteractionSource.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) it.next()));
            }
        }
        this.pressInteraction = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.clear();
    }

    private final void initializeIndicationAndInteractionSourceIfNeeded() {
        IndicationNodeFactory indicationNodeFactory;
        if (this.indicationNode != null || (indicationNodeFactory = this.indicationNodeFactory) == null) {
            return;
        }
        if (this.interactionSource == null) {
            this.interactionSource = InteractionSourceKt.MutableInteractionSource();
        }
        this.focusableNode.update(this.interactionSource);
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        Intrinsics.checkNotNull(mutableInteractionSource);
        DelegatableNode delegatableNodeCreate = indicationNodeFactory.create(mutableInteractionSource);
        delegate(delegatableNodeCreate);
        this.indicationNode = delegatableNodeCreate;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void mo530onPointerEventH0pRuoY(PointerEvent p0, PointerEventPass p1, long p2) {
        NodeCoordinator coordinator;
        try {
            isVirtualCamera isvirtualcamera = isVirtualCamera.INSTANCE;
            isVirtualCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null);
            isVirtualCamera isvirtualcamera2 = isVirtualCamera.INSTANCE;
            if (isVirtualCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0) && (coordinator = getNode().getCoordinator()) != null && coordinator.getLayoutNode().getNodes().m5889hasH91voCI$ui_release(NodeKind.m5928constructorimpl(8))) {
                isVirtualCamera isvirtualcamera3 = isVirtualCamera.INSTANCE;
                isVirtualCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault2(SemanticsNodeKt.SemanticsNode(coordinator.getLayoutNode(), true).getConfig());
            }
            long jM7112getCenterozmzZPI = IntSizeKt.m7112getCenterozmzZPI(p2);
            this.centerOffset = OffsetKt.Offset(IntOffset.m7063getXimpl(jM7112getCenterozmzZPI), IntOffset.m7064getYimpl(jM7112getCenterozmzZPI));
            initializeIndicationAndInteractionSourceIfNeeded();
            if (this.enabled && p1 == PointerEventPass.Main) {
                int type = p0.getType();
                if (PointerEventType.m5458equalsimpl0(type, PointerEventType.INSTANCE.m5462getEnter7fucELk())) {
                    b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3, null);
                } else if (PointerEventType.m5458equalsimpl0(type, PointerEventType.INSTANCE.m5463getExit7fucELk())) {
                    b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3, null);
                }
            }
            if (this.pointerInputNode == null) {
                this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractClickableNode$onPointerEvent$3(this, null)));
            }
            SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
            if (suspendingPointerInputModifierNode != null) {
                suspendingPointerInputModifierNode.mo530onPointerEventH0pRuoY(p0, p1, p2);
            }
            isVirtualCamera isvirtualcamera4 = isVirtualCamera.INSTANCE;
            if (isVirtualCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, p1)) {
                isVirtualCamera isvirtualcamera5 = isVirtualCamera.INSTANCE;
                isVirtualCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null);
            }
        } catch (Throwable th) {
            isVirtualCamera isvirtualcamera6 = isVirtualCamera.INSTANCE;
            if (isVirtualCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0, p1)) {
                isVirtualCamera isvirtualcamera7 = isVirtualCamera.INSTANCE;
                isVirtualCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault2(null);
            }
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        HoverInteraction.Enter enter;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (enter = this.hoverInteraction) != null) {
            mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enter));
        }
        this.hoverInteraction = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo529onKeyEventZmokQxo(KeyEvent p0) {
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled && Clickable_androidKt.m604isPressZmokQxo(p0)) {
            if (this.currentKeyPressInteractions.containsKey(Key.m5053boximpl(KeyEvent_androidKt.m5364getKeyZmokQxo(p0)))) {
                return false;
            }
            PressInteraction.Press press = new PressInteraction.Press(this.centerOffset, null);
            this.currentKeyPressInteractions.put(Key.m5053boximpl(KeyEvent_androidKt.m5364getKeyZmokQxo(p0)), press);
            if (this.interactionSource != null) {
                b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
            }
            return true;
        }
        if (!this.enabled || !Clickable_androidKt.m602isClickZmokQxo(p0)) {
            return false;
        }
        PressInteraction.Press pressRemove = this.currentKeyPressInteractions.remove(Key.m5053boximpl(KeyEvent_androidKt.m5364getKeyZmokQxo(p0)));
        if (pressRemove != null && this.interactionSource != null) {
            b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2$1(this, pressRemove, null), 3, null);
        }
        this.onClick.invoke();
        return true;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusState p0) {
        if (p0.isFocused()) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            this.focusableNode.onFocusEvent(p0);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            Intrinsics.checkNotNull(role);
            SemanticsPropertiesKt.m6163setRolekuIjeqM(semanticsPropertyReceiver, role.getValue());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new Function0<Boolean>() { // from class: androidx.compose.foundation.AbstractClickableNode.applySemantics.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                AbstractClickableNode.this.getOnClick().invoke();
                return Boolean.TRUE;
            }

            {
                super(0);
            }
        });
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        applyAdditionalSemantics(semanticsPropertyReceiver);
    }

    protected final Unit resetPointerInputHandler() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    protected final Object m528handlePressInteractiond4ec7I(PressGestureScope pressGestureScope, long j, Continuation<? super Unit> continuation) {
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (mutableInteractionSource == null || (objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j, mutableInteractionSource, this, null), continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objTuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean delayPressInteraction() {
        return ClickableKt.hasScrollableContainer(this) || Clickable_androidKt.isComposeRootInScrollableContainer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverEnter() {
        if (this.hoverInteraction == null) {
            HoverInteraction.Enter enter = new HoverInteraction.Enter();
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, enter, null), 3, null);
            }
            this.hoverInteraction = enter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverExit() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, null), 3, null);
            }
            this.hoverInteraction = null;
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.AbstractClickableNode$TraverseKey, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/AbstractClickableNode$TraverseKey;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z, str, role, function0);
    }
}
