package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.content.MediaType;
import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.handwriting.StylusHandwritingNode;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequesterModifierNode;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.VideoMimeInfoBuilder;
import defpackage.lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;
import defpackage.setMediaCodecPaused;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.b;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\fB[\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020!H\u0016¢\u0006\u0004\b%\u0010#J\u000f\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010#J\u000f\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010#J\u000f\u0010(\u001a\u00020!H\u0002¢\u0006\u0004\b(\u0010#J\u0017\u0010*\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00106\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u00020!H\u0016¢\u0006\u0004\b7\u0010#J*\u0010=\u001a\u00020!2\u0006\u0010\u000e\u001a\u0002082\u0006\u0010\u0010\u001a\u0002092\u0006\u0010\u0012\u001a\u00020:H\u0016ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\b>\u00105J\u000f\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\u0015H\u0002¢\u0006\u0004\bC\u0010DJa\u0010E\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bE\u0010 J\u0013\u0010G\u001a\u00020!*\u00020FH\u0016¢\u0006\u0004\bG\u0010HR\u001e\u0010J\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010T\u001a\u00020\u00158CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\"\u0010U\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010S\"\u0004\bX\u0010DR$\u0010Y\u001a\u0004\u0018\u00010\u00138\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0018\u0010`\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\"\u0010b\u001a\u00020\u001d8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bh\u0010VR\u0014\u0010i\u001a\u00020\u00158CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010SR$\u0010j\u001a\u0004\u0018\u00010\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bq\u0010rR$\u0010s\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u00188\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0018\u0010w\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bw\u0010aR\u0014\u0010y\u001a\u00020x8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\by\u0010zR\"\u0010{\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b{\u0010V\u001a\u0004\b|\u0010S\"\u0004\b}\u0010DR\u001f\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u007f0~8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0083\u0001\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010SR&\u0010\u0084\u0001\u001a\u00020\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010V\u001a\u0005\b\u0085\u0001\u0010S\"\u0005\b\u0086\u0001\u0010DR\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001f\u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010I8CX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R)\u0010\u0090\u0001\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R)\u0010\u0096\u0001\u001a\u00020\r8\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R)\u0010\u009c\u0001\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R\u001c\u0010£\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/platform/PlatformTextInputModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "p0", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "p1", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "p2", "Landroidx/compose/foundation/text/input/InputTransformation;", "p3", "", "p4", "p5", "Landroidx/compose/foundation/text/KeyboardOptions;", "p6", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "p7", "p8", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "p9", "<init>", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)V", "", "disposeInputSession", "()V", "emitDragExitEvent", "onAttach", "onCancelPointerInput", "onDetach", "onFocusChange", "Landroidx/compose/ui/focus/FocusState;", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed-KlQnJC8", "(I)V", "onImeActionPerformed", "Landroidx/compose/ui/input/key/KeyEvent;", "onKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "onKeyEvent", "onObservedReadsChanged", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onPreKeyEvent-ZmokQxo", "onPreKeyEvent", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "requireKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "startInputSession", "(Z)V", "updateNode", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "LlambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;", "backingStylusHandwritingTrigger", "LlambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "dragAndDropNode", "Landroidx/compose/ui/draganddrop/DragAndDropModifierNode;", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "dragEnterEvent", "Landroidx/compose/foundation/interaction/HoverInteraction$Enter;", "getEditable", "()Z", "editable", "enabled", "Z", "getEnabled", "setEnabled", "filter", "Landroidx/compose/foundation/text/input/InputTransformation;", "getFilter", "()Landroidx/compose/foundation/text/input/InputTransformation;", "setFilter", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "LVideoMimeInfoBuilder;", "inputSessionJob", "LVideoMimeInfoBuilder;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "setInteractionSource", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V", "isElementFocused", "isFocused", "keyboardActionHandler", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "getKeyboardActionHandler", "()Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "setKeyboardActionHandler", "(Landroidx/compose/foundation/text/input/KeyboardActionHandler;)V", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "keyboardActionScope", "Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "getKeyboardOptions", "()Landroidx/compose/foundation/text/KeyboardOptions;", "observeChangesJob", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "pointerInputNode", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "readOnly", "getReadOnly", "setReadOnly", "Lkotlin/Function0;", "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;", "receiveContentConfigurationProvider", "Lkotlin/jvm/functions/Function0;", "getShouldMergeDescendantSemantics", "shouldMergeDescendantSemantics", "singleLine", "getSingleLine", "setSingleLine", "Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "stylusHandwritingNode", "Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "getStylusHandwritingTrigger", "()LlambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl;", "stylusHandwritingTrigger", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "textFieldKeyEventHandler", "Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;", "textFieldSelectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "getTextFieldSelectionState", "()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "setTextFieldSelectionState", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V", "textFieldState", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "getTextFieldState", "()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "setTextFieldState", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V", "textLayoutState", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "getTextLayoutState", "()Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "setTextLayoutState", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/platform/WindowInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements PlatformTextInputModifierNode, SemanticsModifierNode, FocusRequesterModifierNode, FocusEventModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<Unit> backingStylusHandwritingTrigger;
    private HoverInteraction.Enter dragEnterEvent;
    private boolean enabled;
    private InputTransformation filter;
    private VideoMimeInfoBuilder inputSessionJob;
    private MutableInteractionSource interactionSource;
    private boolean isElementFocused;
    private KeyboardActionHandler keyboardActionHandler;
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    private KeyboardOptions keyboardOptions;
    private VideoMimeInfoBuilder observeChangesJob;
    private boolean readOnly;
    private final Function0<ReceiveContentConfiguration> receiveContentConfigurationProvider;
    private boolean singleLine;
    private final StylusHandwritingNode stylusHandwritingNode;
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private WindowInfo windowInfo;
    private final SuspendingPointerInputModifierNode pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new TextFieldDecoratorModifierNode$pointerInputNode$1(this, null)));
    private final DragAndDropModifierNode dragAndDropNode = (DragAndDropModifierNode) delegate(TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode(new Function0<Set<? extends MediaType>>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$1
        @Override // kotlin.jvm.functions.Function0
        public final Set<? extends MediaType> invoke() {
            return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null ? TextFieldDecoratorModifierKt.MediaTypesAll : TextFieldDecoratorModifierKt.MediaTypesText;
        }

        {
            super(0);
        }
    }, new Function2<ClipEntry, ClipMetadata, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$2
        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(ClipEntry clipEntry, ClipMetadata clipMetadata) {
            ClipEntry clipEntry2;
            this.this$0.emitDragExitEvent();
            this.this$0.getTextFieldSelectionState().clearHandleDragging();
            String plainText = TransferableContent_androidKt.readPlainText(clipEntry);
            ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            if (receiveContentConfiguration != null) {
                TransferableContent transferableContentOnReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.INSTANCE.m658getDragAndDropkB6V9T0(), null, 8, null));
                plainText = (transferableContentOnReceive == null || (clipEntry2 = transferableContentOnReceive.getClipEntry()) == null) ? null : TransferableContent_androidKt.readPlainText(clipEntry2);
            }
            if (plainText != null) {
                TransformedTextFieldState.replaceSelectedText$default(this.this$0.getTextFieldState(), plainText, false, null, 6, null);
            }
            return Boolean.TRUE;
        }

        {
            super(2);
        }
    }, new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$3
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
            invoke2(dragAndDropEvent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DragAndDropEvent dragAndDropEvent) {
            if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0) != null) {
                DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(this.this$0, dragAndDropEvent);
            }
        }

        {
            super(1);
        }
    }, (72 & 8) != 0 ? null : null, (72 & 16) != 0 ? null : new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$4
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
            invoke2(dragAndDropEvent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DragAndDropEvent dragAndDropEvent) {
            ReceiveContentListener receiveContentListener;
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
            HoverInteraction.Enter enter = new HoverInteraction.Enter();
            this.this$0.getInteractionSource().tryEmit(enter);
            textFieldDecoratorModifierNode.dragEnterEvent = enter;
            ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                return;
            }
            receiveContentListener.onDragEnter();
        }

        {
            super(1);
        }
    }, (72 & 32) != 0 ? null : new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$5
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Offset offset) {
            m1523invokek4lQ0M(offset.m3984unboximpl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1523invokek4lQ0M(long j) {
            long jM1544fromWindowToDecorationUv8p0NA = TextLayoutStateKt.m1544fromWindowToDecorationUv8p0NA(this.this$0.getTextLayoutState(), j);
            this.this$0.getTextFieldState().m1554selectCharsIn5zctL8(TextRangeKt.TextRange(TextLayoutState.m1534getOffsetForPosition3MmeM6k$default(this.this$0.getTextLayoutState(), jM1544fromWindowToDecorationUv8p0NA, false, 2, null)));
            this.this$0.getTextFieldSelectionState().m1591updateHandleDraggingUv8p0NA(Handle.Cursor, jM1544fromWindowToDecorationUv8p0NA);
        }

        {
            super(1);
        }
    }, (72 & 64) != 0 ? null : null, (72 & 128) != 0 ? null : new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$6
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
            invoke2(dragAndDropEvent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DragAndDropEvent dragAndDropEvent) {
            ReceiveContentListener receiveContentListener;
            this.this$0.emitDragExitEvent();
            this.this$0.getTextFieldSelectionState().clearHandleDragging();
            ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            if (receiveContentConfiguration == null || (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) == null) {
                return;
            }
            receiveContentListener.onDragExit();
        }

        {
            super(1);
        }
    }, (72 & 256) != 0 ? null : new Function1<DragAndDropEvent, Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$dragAndDropNode$7
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(DragAndDropEvent dragAndDropEvent) {
            invoke2(dragAndDropEvent);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DragAndDropEvent dragAndDropEvent) {
            this.this$0.emitDragExitEvent();
        }

        {
            super(1);
        }
    }));

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    public final void setTextFieldState(TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    public final void setTextLayoutState(TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final void setTextFieldSelectionState(TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final InputTransformation getFilter() {
        return this.filter;
    }

    public final void setFilter(InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    public final void setKeyboardActionHandler(KeyboardActionHandler keyboardActionHandler) {
        this.keyboardActionHandler = keyboardActionHandler;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, final KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSource mutableInteractionSource) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z3;
        this.interactionSource = mutableInteractionSource;
        this.stylusHandwritingNode = (StylusHandwritingNode) delegate(new StylusHandwritingNode(new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$stylusHandwritingNode$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl stylusHandwritingTrigger;
                if (!this.this$0.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(this.this$0);
                }
                if (!KeyboardType.m6619equalsimpl0(keyboardOptions.getKeyboardType(), KeyboardType.INSTANCE.m6638getPasswordPjHm6EE()) && !KeyboardType.m6619equalsimpl0(keyboardOptions.getKeyboardType(), KeyboardType.INSTANCE.m6637getNumberPasswordPjHm6EE()) && (stylusHandwritingTrigger = this.this$0.getStylusHandwritingTrigger()) != null) {
                    stylusHandwritingTrigger.TuitionPaymentFragmentspecialinlinedviewModeldefault2(Unit.INSTANCE);
                }
                return Boolean.TRUE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }));
        InputTransformation inputTransformation2 = this.filter;
        this.keyboardOptions = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(inputTransformation2 != null ? inputTransformation2.getKeyboardOptions() : null);
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.receiveContentConfigurationProvider = new Function0<ReceiveContentConfiguration>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ReceiveContentConfiguration invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.this$0);
            }

            {
                super(0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getEditable() {
        return this.enabled && !this.readOnly;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<Unit> getStylusHandwritingTrigger() {
        lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<Unit> lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimpl = this.backingStylusHandwritingTrigger;
        if (lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimpl != null) {
            return lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimpl;
        }
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return null;
        }
        lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<Unit> lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = setMediaCodecPaused.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1, 0, BufferOverflow.DROP_LATEST, 2);
        this.backingStylusHandwritingTrigger = lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return lambdamatchacquisitionsandfreebufferindexes15androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFocused() {
        WindowInfo windowInfo = this.windowInfo;
        return this.isElementFocused && (windowInfo != null && windowInfo.isWindowFocused());
    }

    public final void updateNode(TransformedTextFieldState p0, TextLayoutState p1, TextFieldSelectionState p2, InputTransformation p3, boolean p4, boolean p5, KeyboardOptions p6, KeyboardActionHandler p7, boolean p8, MutableInteractionSource p9) {
        boolean z = this.enabled;
        boolean z2 = z && !this.readOnly;
        boolean z3 = p4 && !p5;
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        KeyboardOptions keyboardOptions = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        this.textFieldState = p0;
        this.textLayoutState = p1;
        this.textFieldSelectionState = p2;
        this.filter = p3;
        this.enabled = p4;
        this.readOnly = p5;
        this.keyboardOptions = p6.fillUnspecifiedValuesWith$foundation_release(p3 != null ? p3.getKeyboardOptions() : null);
        this.keyboardActionHandler = p7;
        this.singleLine = p8;
        this.interactionSource = p9;
        if (z3 != z2 || !Intrinsics.areEqual(p0, transformedTextFieldState) || !Intrinsics.areEqual(this.keyboardOptions, keyboardOptions)) {
            if (z3 && isFocused()) {
                startInputSession(false);
            } else if (!z3) {
                disposeInputSession();
            }
        }
        if (z != p4) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!Intrinsics.areEqual(p2, textFieldSelectionState)) {
            this.pointerInputNode.resetPointerInputHandler();
            this.stylusHandwritingNode.resetPointerInputHandler();
            if (getIsAttached()) {
                p2.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
            }
        }
        if (Intrinsics.areEqual(p9, mutableInteractionSource)) {
            return;
        }
        this.pointerInputNode.resetPointerInputHandler();
        this.stylusHandwritingNode.resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long selection = outputText.getSelection();
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(outputText.toString(), null, null, 6, null));
        SemanticsPropertiesKt.m6164setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, selection);
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, getEditable());
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<TextLayoutResult> list) {
                TextLayoutResult layoutResult = TextFieldDecoratorModifierNode.this.getTextLayoutState().getLayoutResult();
                return Boolean.valueOf(layoutResult != null ? list.add(layoutResult) : false);
            }

            {
                super(1);
            }
        }, 1, null);
        if (getEditable()) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.2
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!TextFieldDecoratorModifierNode.this.getEditable()) {
                        return Boolean.FALSE;
                    }
                    TextFieldDecoratorModifierNode.this.getTextFieldState().replaceAll(annotatedString);
                    return Boolean.TRUE;
                }

                {
                    super(1);
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.3
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(AnnotatedString annotatedString) {
                    if (!TextFieldDecoratorModifierNode.this.getEditable()) {
                        return Boolean.FALSE;
                    }
                    TransformedTextFieldState.replaceSelectedText$default(TextFieldDecoratorModifierNode.this.getTextFieldState(), annotatedString, true, null, 4, null);
                    return Boolean.TRUE;
                }

                {
                    super(1);
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.4
            @Override // kotlin.jvm.functions.Function3
            public final /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
            }

            public final Boolean invoke(int i, int i2, boolean z) {
                TextFieldCharSequence visualText;
                if (z) {
                    visualText = TextFieldDecoratorModifierNode.this.getTextFieldState().getUntransformedText();
                } else {
                    visualText = TextFieldDecoratorModifierNode.this.getTextFieldState().getVisualText();
                }
                long selection2 = visualText.getSelection();
                if (!TextFieldDecoratorModifierNode.this.getEnabled() || Math.min(i, i2) < 0 || Math.max(i, i2) > visualText.length()) {
                    return Boolean.FALSE;
                }
                if (i == TextRange.m6397getStartimpl(selection2) && i2 == TextRange.m6392getEndimpl(selection2)) {
                    return Boolean.TRUE;
                }
                long jTextRange = TextRangeKt.TextRange(i, i2);
                if (z || i == i2) {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.None);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                }
                if (z) {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m1555selectUntransformedCharsIn5zctL8(jTextRange);
                } else {
                    TextFieldDecoratorModifierNode.this.getTextFieldState().m1554selectCharsIn5zctL8(jTextRange);
                }
                return Boolean.TRUE;
            }

            {
                super(3);
            }
        }, 1, null);
        final int iM1333getImeActionOrDefaulteUduSuo$foundation_release = this.keyboardOptions.m1333getImeActionOrDefaulteUduSuo$foundation_release();
        SemanticsPropertiesKt.m6160onImeAction9UiTYpY$default(semanticsPropertyReceiver, iM1333getImeActionOrDefaulteUduSuo$foundation_release, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                TextFieldDecoratorModifierNode.this.m1522onImeActionPerformedKlQnJC8(iM1333getImeActionOrDefaulteUduSuo$foundation_release);
                return Boolean.TRUE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                } else if (!TextFieldDecoratorModifierNode.this.getReadOnly()) {
                    TextFieldDecoratorModifierNode.this.requireKeyboardController().show();
                }
                return Boolean.TRUE;
            }

            {
                super(0);
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                if (!TextFieldDecoratorModifierNode.this.isFocused()) {
                    FocusRequesterModifierNodeKt.requestFocus(TextFieldDecoratorModifierNode.this);
                }
                TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return Boolean.TRUE;
            }

            {
                super(0);
            }
        }, 1, null);
        if (!TextRange.m6391getCollapsedimpl(selection)) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    TextFieldSelectionState.copy$default(TextFieldDecoratorModifierNode.this.getTextFieldSelectionState(), false, 1, null);
                    return Boolean.TRUE;
                }

                {
                    super(0);
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.9
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().cut();
                        return Boolean.TRUE;
                    }

                    {
                        super(0);
                    }
                }, 1, null);
            }
        }
        if (getEditable()) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.applySemantics.10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().paste();
                    return Boolean.TRUE;
                }

                {
                    super(0);
                }
            }, 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusState p0) {
        if (this.isElementFocused == p0.isFocused()) {
            return;
        }
        this.isElementFocused = p0.isFocused();
        onFocusChange();
        if (p0.isFocused()) {
            if (getEditable()) {
                startInputSession(false);
            }
        } else {
            disposeInputSession();
            TransformedTextFieldState transformedTextFieldState = this.textFieldState;
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer().getChangeTracker().clearChanges();
            EditCommandKt.finishComposingText(textFieldState.getMainBuffer());
            textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
            this.textFieldState.collapseSelectionToMax();
        }
        this.stylusHandwritingNode.onFocusEvent(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusChange() {
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() && this.observeChangesJob == null) {
            this.observeChangesJob = b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new C03871(null), 3, null);
        } else {
            if (isFocused()) {
                return;
            }
            VideoMimeInfoBuilder videoMimeInfoBuilder = this.observeChangesJob;
            if (videoMimeInfoBuilder != null) {
                videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
            }
            this.observeChangesJob = null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onFocusChange$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {634}, m = "invokeSuspend", n = {}, s = {})
    static final class C03871 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().observeChanges(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        C03871(Continuation<? super C03871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TextFieldDecoratorModifierNode.this.new C03871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C03871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        this.textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(LayoutCoordinates p0) {
        this.textLayoutState.setDecoratorNodeCoordinates(p0);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public final void mo530onPointerEventH0pRuoY(PointerEvent p0, PointerEventPass p1, long p2) {
        this.stylusHandwritingNode.mo530onPointerEventH0pRuoY(p0, p1, p2);
        this.pointerInputNode.mo530onPointerEventH0pRuoY(p0, p1, p2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        this.stylusHandwritingNode.onCancelPointerInput();
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo */
    public final boolean mo531onPreKeyEventZmokQxo(KeyEvent p0) {
        return this.textFieldKeyEventHandler.mo1455onPreKeyEventMyFupTE(p0, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo */
    public final boolean mo529onKeyEventZmokQxo(KeyEvent p0) {
        return this.textFieldKeyEventHandler.mo1454onKeyEvent6ptp14s(p0, this.textFieldState, this.textLayoutState, this.textFieldSelectionState, this.enabled && !this.readOnly, this.singleLine, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onKeyEvent$1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                textFieldDecoratorModifierNode.m1522onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.getKeyboardOptions().m1333getImeActionOrDefaulteUduSuo$foundation_release());
            }

            {
                super(0);
            }
        });
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.onObservedReadsChanged.1
            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
                TextFieldDecoratorModifierNode.this.onFocusChange();
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInputSession(boolean p0) {
        if (p0 || this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release()) {
            this.inputSessionJob = b.TuitionPaymentFragmentbindingInflater1(getCoroutineScope(), null, null, new C03891(ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3, null);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {TypedValues.TransitionType.TYPE_TRANSITION_FLAGS}, m = "invokeSuspend", n = {}, s = {})
    static final class C03891 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (PlatformTextInputModifierNodeKt.establishTextInputSession(TextFieldDecoratorModifierNode.this, new C00631(TextFieldDecoratorModifierNode.this, this.$receiveContentConfiguration, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {708}, m = "invokeSuspend", n = {}, s = {})
        static final class C00631 extends SuspendLambda implements Function2<PlatformTextInputSessionScope, Continuation<?>, Object> {
            final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TextFieldDecoratorModifierNode this$0;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession((PlatformTextInputSessionScope) this.L$0, this.this$0.getTextFieldState(), this.this$0.getTextLayoutState(), this.this$0.getKeyboardOptions().toImeOptions$foundation_release(this.this$0.getSingleLine()), this.$receiveContentConfiguration, new C00641(this.this$0), this.this$0.getStylusHandwritingTrigger(), (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalViewConfiguration()), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            final /* synthetic */ class C00641 extends FunctionReferenceImpl implements Function1<ImeAction, Unit> {
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(ImeAction imeAction) {
                    m1524invokeKlQnJC8(imeAction.getValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
                public final void m1524invokeKlQnJC8(int i) {
                    ((TextFieldDecoratorModifierNode) this.receiver).m1522onImeActionPerformedKlQnJC8(i);
                }

                C00641(Object obj) {
                    super(1, obj, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00631(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, Continuation<? super C00631> continuation) {
                super(2, continuation);
                this.this$0 = textFieldDecoratorModifierNode;
                this.$receiveContentConfiguration = receiveContentConfiguration;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00631 c00631 = new C00631(this.this$0, this.$receiveContentConfiguration, continuation);
                c00631.L$0 = obj;
                return c00631;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, Continuation<?> continuation) {
                return ((C00631) create(platformTextInputSessionScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03891(ReceiveContentConfiguration receiveContentConfiguration, Continuation<? super C03891> continuation) {
            super(2, continuation);
            this.$receiveContentConfiguration = receiveContentConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TextFieldDecoratorModifierNode.this.new C03891(this.$receiveContentConfiguration, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C03891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void disposeInputSession() {
        VideoMimeInfoBuilder videoMimeInfoBuilder = this.inputSessionJob;
        if (videoMimeInfoBuilder != null) {
            videoMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1((CancellationException) null);
        }
        this.inputSessionJob = null;
        lambdamatchAcquisitionsAndFreeBufferIndexes15androidxcameravideointernalencoderEncoderImpl<Unit> stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.TuitionPaymentFragmentbindingInflater1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitDragExitEvent() {
        HoverInteraction.Enter enter = this.dragEnterEvent;
        if (enter != null) {
            this.interactionSource.tryEmit(new HoverInteraction.Exit(enter));
            this.dragEnterEvent = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final void m1522onImeActionPerformedKlQnJC8(final int p0) {
        KeyboardActionHandler keyboardActionHandler;
        if (ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6583getNoneeUduSuo()) || ImeAction.m6566equalsimpl0(p0, ImeAction.INSTANCE.m6579getDefaulteUduSuo()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            this.keyboardActionScope.mo1319defaultKeyboardActionKlQnJC8(p0);
        } else if (keyboardActionHandler != null) {
            keyboardActionHandler.onKeyboardAction(new Function0<Unit>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onImeActionPerformed$1
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.keyboardActionScope.mo1319defaultKeyboardActionKlQnJC8(p0);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
        }
    }
}
