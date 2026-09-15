package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001a\u0010\bJ\u001e\u0010\u001d\u001a\u00020\u00062\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\tH\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020#H\u0000ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\rH\u0001¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\rH\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0000¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u0010\bJ\u001a\u00102\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b1\u0010\u000bJ\u0017\u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0004\b6\u0010\u000bJ\u000f\u00108\u001a\u00020\u0006H\u0000¢\u0006\u0004\b8\u0010\bJ\u0017\u00109\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b9\u0010\u000fJB\u0010A\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@R$\u0010C\u001a\u0004\u0018\u00010B8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR2\u0010N\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\t8G@CX\u0087\u008e\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010\u001cR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0019\u0010R\u001a\u00020\t8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bR\u0010SR\u0019\u0010T\u001a\u00020\t8\u0002@\u0002X\u0083\u000eø\u0001\u0001¢\u0006\u0006\n\u0004\bT\u0010SR/\u0010[\u001a\u0004\u0018\u00010U2\b\u0010\u0003\u001a\u0004\u0018\u00010U8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010J\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR+\u0010_\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\\\u0010J\u001a\u0004\b]\u0010.\"\u0004\b^\u0010\u000fR+\u0010c\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010J\u001a\u0004\ba\u0010.\"\u0004\bb\u0010\u000fR$\u0010e\u001a\u0004\u0018\u00010d8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010l\u001a\u0004\u0018\u00010k8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010s\u001a\u00020r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\"\u0010x\u001a\u00020w8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR6\u0010\u0081\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0080\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020O8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R,\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R,\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001e\u0010\u009a\u0001\u001a\u00020\u00178\u0001X\u0081\u0004¢\u0006\u000f\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010\u0019R\u0019\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00108AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R!\u0010 \u0001\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R1\u0010©\u0001\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138A@AX\u0081\u008e\u0002¢\u0006\u0017\n\u0005\b¤\u0001\u0010J\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R*\u0010«\u0001\u001a\u00030ª\u00018\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "Landroidx/compose/foundation/text/UndoManager;", "p0", "<init>", "(Landroidx/compose/foundation/text/UndoManager;)V", "", "clearPreviewHighlight$foundation_release", "()V", "Landroidx/compose/ui/geometry/Offset;", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "contextMenuOpenAdjustment", "", "copy$foundation_release", "(Z)V", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "p1", "Landroidx/compose/ui/text/input/TextFieldValue;", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "createTextFieldValue", "Landroidx/compose/foundation/text/TextDragObserver;", "cursorDragObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "cut$foundation_release", "deselect-_kEHs6E$foundation_release", "(Landroidx/compose/ui/geometry/Offset;)V", "deselect", "enterSelectionMode$foundation_release", "exitSelectionMode$foundation_release", "Landroidx/compose/ui/geometry/Rect;", "getContentRect", "()Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/Density;", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getCursorPosition", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "getHandlePosition", "handleDragObserver$foundation_release", "(Z)Landroidx/compose/foundation/text/TextDragObserver;", "hideSelectionToolbar$foundation_release", "isTextChanged$foundation_release", "()Z", "paste$foundation_release", "selectAll$foundation_release", "setDeletionPreviewHighlight-5zc-tL8$foundation_release", "setDeletionPreviewHighlight", "Landroidx/compose/foundation/text/HandleState;", "setHandleState", "(Landroidx/compose/foundation/text/HandleState;)V", "setSelectionPreviewHighlight-5zc-tL8$foundation_release", "setSelectionPreviewHighlight", "showSelectionToolbar$foundation_release", "updateFloatingToolbar", "p2", "p3", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "p4", "p5", "updateSelection-8UEBfa8", "(Landroidx/compose/ui/text/input/TextFieldValue;JZZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "updateSelection", "Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "currentDragPosition", "", "dragBeginOffsetInText", "Ljava/lang/Integer;", "dragBeginPosition", "J", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle$delegate", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "editable$delegate", "getEditable", "setEditable", "editable", "enabled$delegate", "getEnabled", "setEnabled", "enabled", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "Lkotlin/Function1;", "onValueChange", "Lkotlin/jvm/functions/Function1;", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "previousRawDragOffset", "I", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "Landroidx/compose/foundation/text/LegacyTextFieldState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "getTransformedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "transformedText", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "value$delegate", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TextFieldSelectionManager {
    public static final int $stable = 8;
    private ClipboardManager clipboardManager;

    /* JADX INFO: renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    /* JADX INFO: renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* JADX INFO: renamed from: editable$delegate, reason: from kotlin metadata */
    private final MutableState editable;

    /* JADX INFO: renamed from: enabled$delegate, reason: from kotlin metadata */
    private final MutableState enabled;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1<? super TextFieldValue, Unit> onValueChange;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private LegacyTextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;

    /* JADX INFO: renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;
    private VisualTransformation visualTransformation;

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }
        };
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = VisualTransformation.INSTANCE.getNone();
        Boolean bool = Boolean.TRUE;
        this.editable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.enabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.dragBeginPosition = Offset.INSTANCE.m3990getZeroF1C5BW0();
        this.dragTotalDistance = Offset.INSTANCE.m3990getZeroF1C5BW0();
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public final void mo1379onDownk4lQ0M(long p0) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public final void mo1381onStartk4lQ0M(long p0) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                if (this.this$0.getEnabled() && this.this$0.getDraggingHandle() == null) {
                    this.this$0.setDraggingHandle(Handle.SelectionEnd);
                    this.this$0.previousRawDragOffset = -1;
                    this.this$0.hideSelectionToolbar$foundation_release();
                    LegacyTextFieldState state = this.this$0.getState();
                    if (state == null || (layoutResult2 = state.getLayoutResult()) == null || !layoutResult2.m1413isPositionOnTextk4lQ0M(p0)) {
                        LegacyTextFieldState state2 = this.this$0.getState();
                        if (state2 != null && (layoutResult = state2.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                            int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.m1411getOffsetForPosition3MmeM6k$default(layoutResult, p0, false, 2, null));
                            TextFieldValue textFieldValueM1715createTextFieldValueFDrldGo = textFieldSelectionManager.m1715createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation_release(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo4992performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5009getTextHandleMove5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange$foundation_release().invoke(textFieldValueM1715createTextFieldValueFDrldGo);
                        }
                    } else {
                        if (this.this$0.getValue$foundation_release().getText().length() == 0) {
                            return;
                        }
                        this.this$0.enterSelectionMode$foundation_release(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                        this.this$0.dragBeginOffsetInText = Integer.valueOf(TextRange.m6397getStartimpl(textFieldSelectionManager2.m1718updateSelection8UEBfa8(TextFieldValue.m6643copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation_release(), (AnnotatedString) null, TextRange.INSTANCE.m6402getZerod9O1mEE(), (TextRange) null, 5, (Object) null), p0, true, false, SelectionAdjustment.INSTANCE.getWord(), true)));
                    }
                    this.this$0.setHandleState(HandleState.None);
                    this.this$0.dragBeginPosition = p0;
                    TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                    textFieldSelectionManager3.m1717setCurrentDragPosition_kEHs6E(Offset.m3963boximpl(textFieldSelectionManager3.dragBeginPosition));
                    this.this$0.dragTotalDistance = Offset.INSTANCE.m3990getZeroF1C5BW0();
                }
            }

            /* JADX WARN: Code duplicated, block: B:20:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:23:0x00c2  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public final void mo1380onDragk4lQ0M(long p0) {
                TextLayoutResultProxy layoutResult;
                Integer num;
                int iM1412getOffsetForPosition3MmeM6k;
                long jM1718updateSelection8UEBfa8;
                SelectionAdjustment word;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m3979plusMKHz9U(textFieldSelectionManager.dragTotalDistance, p0);
                LegacyTextFieldState state = this.this$0.getState();
                if (state != null && (layoutResult = state.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                    textFieldSelectionManager2.m1717setCurrentDragPosition_kEHs6E(Offset.m3963boximpl(Offset.m3979plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                    if (textFieldSelectionManager2.dragBeginOffsetInText != null) {
                        num = textFieldSelectionManager2.dragBeginOffsetInText;
                        if (num != null) {
                            iM1412getOffsetForPosition3MmeM6k = num.intValue();
                        } else {
                            iM1412getOffsetForPosition3MmeM6k = layoutResult.m1412getOffsetForPosition3MmeM6k(textFieldSelectionManager2.dragBeginPosition, false);
                        }
                        Offset offsetM1721getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1721getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(offsetM1721getCurrentDragPosition_m7T9E);
                        int iM1412getOffsetForPosition3MmeM6k2 = layoutResult.m1412getOffsetForPosition3MmeM6k(offsetM1721getCurrentDragPosition_m7T9E.m3984unboximpl(), false);
                        if (textFieldSelectionManager2.dragBeginOffsetInText != null) {
                        }
                        TextFieldValue value$foundation_release = textFieldSelectionManager2.getValue$foundation_release();
                        Offset offsetM1721getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m1721getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(offsetM1721getCurrentDragPosition_m7T9E2);
                        jM1718updateSelection8UEBfa8 = textFieldSelectionManager2.m1718updateSelection8UEBfa8(value$foundation_release, offsetM1721getCurrentDragPosition_m7T9E2.m3984unboximpl(), false, false, SelectionAdjustment.INSTANCE.getWord(), true);
                    } else {
                        Offset offsetM1721getCurrentDragPosition_m7T9E3 = textFieldSelectionManager2.m1721getCurrentDragPosition_m7T9E();
                        Intrinsics.checkNotNull(offsetM1721getCurrentDragPosition_m7T9E3);
                        if (layoutResult.m1413isPositionOnTextk4lQ0M(offsetM1721getCurrentDragPosition_m7T9E3.m3984unboximpl())) {
                            num = textFieldSelectionManager2.dragBeginOffsetInText;
                            if (num != null) {
                                iM1412getOffsetForPosition3MmeM6k = num.intValue();
                            } else {
                                iM1412getOffsetForPosition3MmeM6k = layoutResult.m1412getOffsetForPosition3MmeM6k(textFieldSelectionManager2.dragBeginPosition, false);
                            }
                            Offset offsetM1721getCurrentDragPosition_m7T9E4 = textFieldSelectionManager2.m1721getCurrentDragPosition_m7T9E();
                            Intrinsics.checkNotNull(offsetM1721getCurrentDragPosition_m7T9E4);
                            int iM1412getOffsetForPosition3MmeM6k3 = layoutResult.m1412getOffsetForPosition3MmeM6k(offsetM1721getCurrentDragPosition_m7T9E4.m3984unboximpl(), false);
                            if (textFieldSelectionManager2.dragBeginOffsetInText != null && iM1412getOffsetForPosition3MmeM6k == iM1412getOffsetForPosition3MmeM6k3) {
                                return;
                            }
                            TextFieldValue value$foundation_release2 = textFieldSelectionManager2.getValue$foundation_release();
                            Offset offsetM1721getCurrentDragPosition_m7T9E5 = textFieldSelectionManager2.m1721getCurrentDragPosition_m7T9E();
                            Intrinsics.checkNotNull(offsetM1721getCurrentDragPosition_m7T9E5);
                            jM1718updateSelection8UEBfa8 = textFieldSelectionManager2.m1718updateSelection8UEBfa8(value$foundation_release2, offsetM1721getCurrentDragPosition_m7T9E5.m3984unboximpl(), false, false, SelectionAdjustment.INSTANCE.getWord(), true);
                        } else {
                            int iTransformedToOriginal = textFieldSelectionManager2.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.m1411getOffsetForPosition3MmeM6k$default(layoutResult, textFieldSelectionManager2.dragBeginPosition, false, 2, null));
                            OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                            Offset offsetM1721getCurrentDragPosition_m7T9E6 = textFieldSelectionManager2.m1721getCurrentDragPosition_m7T9E();
                            Intrinsics.checkNotNull(offsetM1721getCurrentDragPosition_m7T9E6);
                            if (iTransformedToOriginal == offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1411getOffsetForPosition3MmeM6k$default(layoutResult, offsetM1721getCurrentDragPosition_m7T9E6.m3984unboximpl(), false, 2, null))) {
                                word = SelectionAdjustment.INSTANCE.getNone();
                            } else {
                                word = SelectionAdjustment.INSTANCE.getWord();
                            }
                            TextFieldValue value$foundation_release3 = textFieldSelectionManager2.getValue$foundation_release();
                            Offset offsetM1721getCurrentDragPosition_m7T9E7 = textFieldSelectionManager2.m1721getCurrentDragPosition_m7T9E();
                            Intrinsics.checkNotNull(offsetM1721getCurrentDragPosition_m7T9E7);
                            jM1718updateSelection8UEBfa8 = textFieldSelectionManager2.m1718updateSelection8UEBfa8(value$foundation_release3, offsetM1721getCurrentDragPosition_m7T9E7.m3984unboximpl(), false, false, word, true);
                        }
                    }
                    TextRange.m6385boximpl(jM1718updateSelection8UEBfa8);
                }
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
                onEnd();
            }

            private final void onEnd() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1717setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
                this.this$0.dragBeginOffsetInText = null;
                boolean zM6391getCollapsedimpl = TextRange.m6391getCollapsedimpl(this.this$0.getValue$foundation_release().getSelection());
                this.this$0.setHandleState(zM6391getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setShowSelectionHandleStart(!zM6391getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
                }
                LegacyTextFieldState state2 = this.this$0.getState();
                if (state2 != null) {
                    state2.setShowSelectionHandleEnd(!zM6391getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, false));
                }
                LegacyTextFieldState state3 = this.this$0.getState();
                if (state3 == null) {
                    return;
                }
                state3.setShowCursorHandle(zM6391getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final void onDragDone() {
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtend-k-4lQ0M */
            public final boolean mo1594onExtendk4lQ0M(long p0) {
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || state.getLayoutResult() == null || !this.this$0.getEnabled()) {
                    return false;
                }
                this.this$0.previousRawDragOffset = -1;
                updateMouseSelection(this.this$0.getValue$foundation_release(), p0, false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
            public final boolean mo1595onExtendDragk4lQ0M(long p0) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), p0, false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onStart-3MmeM6k */
            public final boolean mo1596onStart3MmeM6k(long p0, SelectionAdjustment p1) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                this.this$0.dragBeginPosition = p0;
                this.this$0.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(this.this$0, false, 1, null);
                updateMouseSelection(this.this$0.getValue$foundation_release(), this.this$0.dragBeginPosition, true, p1);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onDrag-3MmeM6k */
            public final boolean mo1593onDrag3MmeM6k(long p0, SelectionAdjustment p1) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), p0, false, p1);
                return true;
            }

            public final void updateMouseSelection(TextFieldValue p0, long p1, boolean p2, SelectionAdjustment p3) {
                this.this$0.setHandleState(TextRange.m6391getCollapsedimpl(this.this$0.m1718updateSelection8UEBfa8(p0, p1, p2, false, p3, false)) ? HandleState.Cursor : HandleState.Selection);
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : undoManager);
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX INFO: renamed from: getOffsetMapping$foundation_release, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$foundation_release(Function1<? super TextFieldValue, Unit> function1) {
        this.onValueChange = function1;
    }

    /* JADX INFO: renamed from: getState$foundation_release, reason: from getter */
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final void setState$foundation_release(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value.getValue();
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        this.value.setValue(textFieldValue);
    }

    public final AnnotatedString getTransformedText$foundation_release() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    /* JADX INFO: renamed from: getVisualTransformation$foundation_release, reason: from getter */
    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    /* JADX INFO: renamed from: getClipboardManager$foundation_release, reason: from getter */
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final boolean getEditable() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    public final void setEditable(boolean z) {
        this.editable.setValue(Boolean.valueOf(z));
    }

    public final boolean getEnabled() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    public final void setEnabled(boolean z) {
        this.enabled.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1717setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1721getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* JADX INFO: renamed from: getTouchSelectionObserver$foundation_release, reason: from getter */
    public final TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    /* JADX INFO: renamed from: getMouseSelectionObserver$foundation_release, reason: from getter */
    public final MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean p0) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public final void mo1381onStartk4lQ0M(long p1) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public final void mo1379onDownk4lQ0M(long p1) {
                TextLayoutResultProxy layoutResult;
                this.this$0.setDraggingHandle(p0 ? Handle.SelectionStart : Handle.SelectionEnd);
                long jM1664getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1664getAdjustedCoordinatesk4lQ0M(this.this$0.m1723getHandlePositiontuRUvjQ$foundation_release(p0));
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long jM1415translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m1415translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM1664getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM1415translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                this.this$0.m1717setCurrentDragPosition_kEHs6E(Offset.m3963boximpl(jM1415translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m3990getZeroF1C5BW0();
                this.this$0.previousRawDragOffset = -1;
                LegacyTextFieldState state2 = this.this$0.getState();
                if (state2 != null) {
                    state2.setInTouchMode(true);
                }
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1717setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public final void mo1380onDragk4lQ0M(long p1) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m3979plusMKHz9U(textFieldSelectionManager.dragTotalDistance, p1);
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m1717setCurrentDragPosition_kEHs6E(Offset.m3963boximpl(Offset.m3979plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, this.this$0.dragTotalDistance)));
                TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                TextFieldValue value$foundation_release = textFieldSelectionManager3.getValue$foundation_release();
                Offset offsetM1721getCurrentDragPosition_m7T9E = this.this$0.m1721getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(offsetM1721getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.m1718updateSelection8UEBfa8(value$foundation_release, offsetM1721getCurrentDragPosition_m7T9E.m3984unboximpl(), false, p0, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), true);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1717setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }
        };
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public final void mo1379onDownk4lQ0M(long p0) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1717setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public final void mo1381onStartk4lQ0M(long p0) {
                TextLayoutResultProxy layoutResult;
                long jM1664getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1664getAdjustedCoordinatesk4lQ0M(this.this$0.m1723getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long jM1415translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m1415translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM1664getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM1415translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                this.this$0.m1717setCurrentDragPosition_kEHs6E(Offset.m3963boximpl(jM1415translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m3990getZeroF1C5BW0();
                this.this$0.setDraggingHandle(Handle.Cursor);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public final void mo1380onDragk4lQ0M(long p0) {
                TextLayoutResultProxy layoutResult;
                HapticFeedback hapticFeedBack;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m3979plusMKHz9U(textFieldSelectionManager.dragTotalDistance, p0);
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m1717setCurrentDragPosition_kEHs6E(Offset.m3963boximpl(Offset.m3979plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                Offset offsetM1721getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1721getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(offsetM1721getCurrentDragPosition_m7T9E);
                int iTransformedToOriginal = offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1411getOffsetForPosition3MmeM6k$default(layoutResult, offsetM1721getCurrentDragPosition_m7T9E.m3984unboximpl(), false, 2, null));
                long jTextRange = TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
                if (TextRange.m6390equalsimpl0(jTextRange, textFieldSelectionManager2.getValue$foundation_release().getSelection())) {
                    return;
                }
                LegacyTextFieldState state2 = textFieldSelectionManager2.getState();
                if ((state2 == null || state2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo4992performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5009getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager2.getOnValueChange$foundation_release().invoke(textFieldSelectionManager2.m1715createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), jTextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1717setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation_release(z);
    }

    public final void enterSelectionMode$foundation_release(boolean p0) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(p0);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m1716deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i, Object obj) {
        if ((i & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1720deselect_kEHs6E$foundation_release(offset);
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m1720deselect_kEHs6E$foundation_release(Offset p0) {
        int iM6394getMaximpl;
        if (!TextRange.m6391getCollapsedimpl(getValue$foundation_release().getSelection())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            if (p0 != null && layoutResult != null) {
                iM6394getMaximpl = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1411getOffsetForPosition3MmeM6k$default(layoutResult, p0.m3984unboximpl(), false, 2, null));
            } else {
                iM6394getMaximpl = TextRange.m6394getMaximpl(getValue$foundation_release().getSelection());
            }
            this.onValueChange.invoke(TextFieldValue.m6643copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(iM6394getMaximpl), (TextRange) null, 5, (Object) null));
        }
        setHandleState((p0 == null || getValue$foundation_release().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    /* JADX INFO: renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m1725setSelectionPreviewHighlight5zctL8$foundation_release(long p0) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1342setSelectionPreviewHighlightRange5zctL8(p0);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1339setDeletionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m6402getZerod9O1mEE());
        }
        if (TextRange.m6391getCollapsedimpl(p0)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    /* JADX INFO: renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m1724setDeletionPreviewHighlight5zctL8$foundation_release(long p0) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1339setDeletionPreviewHighlightRange5zctL8(p0);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1342setSelectionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m6402getZerod9O1mEE());
        }
        if (TextRange.m6391getCollapsedimpl(p0)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void clearPreviewHighlight$foundation_release() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1339setDeletionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m6402getZerod9O1mEE());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 == null) {
            return;
        }
        legacyTextFieldState2.m1342setSelectionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m6402getZerod9O1mEE());
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    public final void copy$foundation_release(boolean p0) {
        if (TextRange.m6391getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (p0) {
            int iM6394getMaximpl = TextRange.m6394getMaximpl(getValue$foundation_release().getSelection());
            this.onValueChange.invoke(m1715createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iM6394getMaximpl, iM6394getMaximpl)));
            setHandleState(HandleState.None);
        }
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null) {
            return;
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM6395getMinimpl = TextRange.m6395getMinimpl(getValue$foundation_release().getSelection()) + text.length();
        this.onValueChange.invoke(m1715createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM6395getMinimpl, iM6395getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void cut$foundation_release() {
        if (TextRange.m6391getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM6395getMinimpl = TextRange.m6395getMinimpl(getValue$foundation_release().getSelection());
        this.onValueChange.invoke(m1715createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM6395getMinimpl, iM6395getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue textFieldValueM1715createTextFieldValueFDrldGo = m1715createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(textFieldValueM1715createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m6643copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, textFieldValueM1715createTextFieldValueFDrldGo.getSelection(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    /* JADX INFO: renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1723getHandlePositiontuRUvjQ$foundation_release(boolean p0) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.INSTANCE.m3989getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation_release = getTransformedText$foundation_release();
        if (transformedText$foundation_release == null) {
            return Offset.INSTANCE.m3989getUnspecifiedF1C5BW0();
        }
        if (!Intrinsics.areEqual(transformedText$foundation_release.getText(), value.getLayoutInput().getText().getText())) {
            return Offset.INSTANCE.m3989getUnspecifiedF1C5BW0();
        }
        long selection = getValue$foundation_release().getSelection();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(p0 ? TextRange.m6397getStartimpl(selection) : TextRange.m6392getEndimpl(selection)), p0, TextRange.m6396getReversedimpl(getValue$foundation_release().getSelection()));
    }

    /* JADX INFO: renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1722getCursorPositiontuRUvjQ$foundation_release(Density p0) {
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m6397getStartimpl(getValue$foundation_release().getSelection()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(RangesKt.coerceIn(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset(cursorRect.getLeft() + (p0.mo694toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2.0f), cursorRect.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean p0) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.setShowFloatingToolbar(p0);
        }
        if (p0) {
            showSelectionToolbar$foundation_release();
        } else {
            hideSelectionToolbar$foundation_release();
        }
    }

    public final void showSelectionToolbar$foundation_release() {
        ClipboardManager clipboardManager;
        if (getEnabled()) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            if (legacyTextFieldState == null || legacyTextFieldState.isInTouchMode()) {
                boolean z = this.visualTransformation instanceof PasswordVisualTransformation;
                Function0<Unit> function0 = (TextRange.m6391getCollapsedimpl(getValue$foundation_release().getSelection()) || z) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TextFieldSelectionManager.copy$foundation_release$default(this.this$0, false, 1, null);
                        this.this$0.hideSelectionToolbar$foundation_release();
                    }

                    {
                        super(0);
                    }
                };
                Function0<Unit> function1 = (TextRange.m6391getCollapsedimpl(getValue$foundation_release().getSelection()) || !getEditable() || z) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.cut$foundation_release();
                        this.this$0.hideSelectionToolbar$foundation_release();
                    }

                    {
                        super(0);
                    }
                };
                Function0<Unit> function2 = (getEditable() && (clipboardManager = this.clipboardManager) != null && clipboardManager.hasText()) ? new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.paste$foundation_release();
                        this.this$0.hideSelectionToolbar$foundation_release();
                    }

                    {
                        super(0);
                    }
                } : null;
                Function0<Unit> function3 = TextRange.m6393getLengthimpl(getValue$foundation_release().getSelection()) != getValue$foundation_release().getText().length() ? new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.selectAll$foundation_release();
                    }

                    {
                        super(0);
                    }
                } : null;
                TextToolbar textToolbar = this.textToolbar;
                if (textToolbar != null) {
                    textToolbar.showMenu(getContentRect(), function0, function2, function1, function3);
                }
            }
        }
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    /* JADX INFO: renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m1719contextMenuOpenAdjustmentk4lQ0M(long p0) {
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return;
        }
        if (TextRange.m6388containsimpl(getValue$foundation_release().getSelection(), TextLayoutResultProxy.m1411getOffsetForPosition3MmeM6k$default(layoutResult, p0, false, 2, null))) {
            return;
        }
        this.previousRawDragOffset = -1;
        m1718updateSelection8UEBfa8(getValue$foundation_release(), p0, true, false, SelectionAdjustment.INSTANCE.getWord(), false);
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    private final Rect getContentRect() {
        float fM3975getYimpl;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getIsLayoutResultStale()) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m6397getStartimpl(getValue$foundation_release().getSelection()));
                int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m6392getEndimpl(getValue$foundation_release().getSelection()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long jM3990getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m3990getZeroF1C5BW0() : layoutCoordinates4.mo5648localToRootMKHz9U(m1723getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long jM3990getZeroF1C5BW1 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m3990getZeroF1C5BW0() : layoutCoordinates3.mo5648localToRootMKHz9U(m1723getHandlePositiontuRUvjQ$foundation_release(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float fM3975getYimpl2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) == null) {
                    fM3975getYimpl = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    fM3975getYimpl = Offset.m3975getYimpl(layoutCoordinates2.mo5648localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())));
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    fM3975getYimpl2 = Offset.m3975getYimpl(layoutCoordinates.mo5648localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())));
                }
                return new Rect(Math.min(Offset.m3974getXimpl(jM3990getZeroF1C5BW0), Offset.m3974getXimpl(jM3990getZeroF1C5BW1)), Math.min(fM3975getYimpl, fM3975getYimpl2), Math.max(Offset.m3974getXimpl(jM3990getZeroF1C5BW0), Offset.m3974getXimpl(jM3990getZeroF1C5BW1)), Math.max(Offset.m3975getYimpl(jM3990getZeroF1C5BW0), Offset.m3975getYimpl(jM3990getZeroF1C5BW1)) + (Dp.m6935constructorimpl(25.0f) * legacyTextFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.INSTANCE.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: updateSelection-8UEBfa8, reason: not valid java name */
    public final long m1718updateSelection8UEBfa8(TextFieldValue p0, long p1, boolean p2, boolean p3, SelectionAdjustment p4, boolean p5) {
        TextLayoutResultProxy layoutResult;
        HapticFeedback hapticFeedback;
        int i;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.INSTANCE.m6402getZerod9O1mEE();
        }
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m6397getStartimpl(p0.getSelection())), this.offsetMapping.originalToTransformed(TextRange.m6392getEndimpl(p0.getSelection())));
        boolean z = false;
        int iM1412getOffsetForPosition3MmeM6k = layoutResult.m1412getOffsetForPosition3MmeM6k(p1, false);
        int iM6397getStartimpl = (p3 || p2) ? iM1412getOffsetForPosition3MmeM6k : TextRange.m6397getStartimpl(jTextRange);
        int iM6392getEndimpl = (!p3 || p2) ? iM1412getOffsetForPosition3MmeM6k : TextRange.m6392getEndimpl(jTextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        int i2 = -1;
        if (!p2 && selectionLayout != null && (i = this.previousRawDragOffset) != -1) {
            i2 = i;
        }
        SelectionLayout selectionLayoutM1667getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m1667getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), iM6397getStartimpl, iM6392getEndimpl, i2, jTextRange, p2, p3);
        if (!selectionLayoutM1667getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return p0.getSelection();
        }
        this.previousSelectionLayout = selectionLayoutM1667getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = iM1412getOffsetForPosition3MmeM6k;
        Selection selectionAdjust = p4.adjust(selectionLayoutM1667getTextFieldSelectionLayoutRcvTLA);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(selectionAdjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(selectionAdjust.getEnd().getOffset()));
        if (TextRange.m6390equalsimpl0(jTextRange2, p0.getSelection())) {
            return p0.getSelection();
        }
        boolean z2 = TextRange.m6396getReversedimpl(jTextRange2) != TextRange.m6396getReversedimpl(p0.getSelection()) && TextRange.m6390equalsimpl0(TextRangeKt.TextRange(TextRange.m6392getEndimpl(jTextRange2), TextRange.m6397getStartimpl(jTextRange2)), p0.getSelection());
        boolean z3 = TextRange.m6391getCollapsedimpl(jTextRange2) && TextRange.m6391getCollapsedimpl(p0.getSelection());
        if (p5 && p0.getText().length() > 0 && !z2 && !z3 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo4992performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m5009getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m1715createTextFieldValueFDrldGo(p0.getAnnotatedString(), jTextRange2));
        if (!p5) {
            updateFloatingToolbar(!TextRange.m6391getCollapsedimpl(jTextRange2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(p5);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!TextRange.m6391getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!TextRange.m6391getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 == null) {
            return jTextRange2;
        }
        if (TextRange.m6391getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true)) {
            z = true;
        }
        legacyTextFieldState5.setShowCursorHandle(z);
        return jTextRange2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(HandleState p0) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == p0) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.setHandleState(p0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m1715createTextFieldValueFDrldGo(AnnotatedString p0, long p1) {
        return new TextFieldValue(p0, p1, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
