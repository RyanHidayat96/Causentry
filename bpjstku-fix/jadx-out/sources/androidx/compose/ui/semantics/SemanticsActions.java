package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R8\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR,\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR,\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rRB\u0010\u0016\u001a*\u0012&\u0012$\u0012 \u0012\u001e\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u0015\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\t0\u00130\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rRA\u0010\u001a\u001a)\u0012%\u0012#\b\u0001\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR2\u0010\u001d\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR2\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR7\u0010\"\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0015\u0012\u0013\u0012\t\u0012\u00070\u0014¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR>\u0010%\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0$0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\rR2\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\rR2\u0010)\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010\rR2\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b,\u0010\rR,\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\rR2\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u000b\u001a\u0004\b0\u0010\rR,\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u000b\u001a\u0004\b2\u0010\rR2\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\u000b\u0012\u0004\b5\u0010\u0003\u001a\u0004\b4\u0010\rR,\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u000b\u001a\u0004\b7\u0010\rR,\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u000b\u001a\u0004\b9\u0010\rR,\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR,\u0010<\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u000b\u001a\u0004\b=\u0010\rR,\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u000b\u001a\u0004\b?\u0010\rR,\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u000b\u001a\u0004\bA\u0010\rR,\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010\u000b\u001a\u0004\bC\u0010\rR&\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020E0D0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u000b\u001a\u0004\bG\u0010\rR,\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010\u000b\u001a\u0004\bI\u0010\rR,\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\u000b\u001a\u0004\bK\u0010\rR,\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010\u000b\u001a\u0004\bM\u0010\rR,\u0010N\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u000b\u001a\u0004\bO\u0010\rR8\u0010P\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u0010\u000b\u001a\u0004\bQ\u0010\r"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "GetTextLayoutResult", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getGetTextLayoutResult", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "OnClick", "getOnClick", "OnLongClick", "getOnLongClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "ScrollBy", "getScrollBy", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/coroutines/Continuation;", "ScrollByOffset", "getScrollByOffset", "", "ScrollToIndex", "getScrollToIndex", "Landroidx/compose/ui/text/AnnotatedString;", "OnAutofillText", "getOnAutofillText", "SetProgress", "getSetProgress", "Lkotlin/Function3;", "SetSelection", "getSetSelection", "SetText", "getSetText", "SetTextSubstitution", "getSetTextSubstitution", "ShowTextSubstitution", "getShowTextSubstitution", "ClearTextSubstitution", "getClearTextSubstitution", "InsertTextAtCursor", "getInsertTextAtCursor", "OnImeAction", "getOnImeAction", "PerformImeAction", "getPerformImeAction", "getPerformImeAction$annotations", "CopyText", "getCopyText", "CutText", "getCutText", "PasteText", "getPasteText", "Expand", "getExpand", "Collapse", "getCollapse", "Dismiss", "getDismiss", "RequestFocus", "getRequestFocus", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "CustomActions", "getCustomActions", "PageUp", "getPageUp", "PageLeft", "getPageLeft", "PageDown", "getPageDown", "PageRight", "getPageRight", "GetScrollViewportLength", "getGetScrollViewportLength"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SemanticsActions {
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult = new SemanticsPropertyKey<>("GetTextLayoutResult", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnClick = new SemanticsPropertyKey<>("OnClick", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnLongClick = new SemanticsPropertyKey<>("OnLongClick", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> ScrollBy = new SemanticsPropertyKey<>("ScrollBy", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<Function2<Offset, Continuation<? super Offset>, Object>> ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", (Function2) null, 2, (DefaultConstructorMarker) null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> ScrollToIndex = new SemanticsPropertyKey<>("ScrollToIndex", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> OnAutofillText = new SemanticsPropertyKey<>("OnAutofillText", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> SetProgress = new SemanticsPropertyKey<>("SetProgress", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> SetSelection = new SemanticsPropertyKey<>("SetSelection", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> SetText = new SemanticsPropertyKey<>("SetText", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> SetTextSubstitution = new SemanticsPropertyKey<>("SetTextSubstitution", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<Boolean, Boolean>>> ShowTextSubstitution = new SemanticsPropertyKey<>("ShowTextSubstitution", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> ClearTextSubstitution = new SemanticsPropertyKey<>("ClearTextSubstitution", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> InsertTextAtCursor = new SemanticsPropertyKey<>("InsertTextAtCursor", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> OnImeAction = new SemanticsPropertyKey<>("PerformImeAction", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PerformImeAction = new SemanticsPropertyKey<>("PerformImeAction", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CopyText = new SemanticsPropertyKey<>("CopyText", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> CutText = new SemanticsPropertyKey<>("CutText", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PasteText = new SemanticsPropertyKey<>("PasteText", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Expand = new SemanticsPropertyKey<>("Expand", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Collapse = new SemanticsPropertyKey<>("Collapse", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> Dismiss = new SemanticsPropertyKey<>("Dismiss", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> RequestFocus = new SemanticsPropertyKey<>("RequestFocus", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions = new SemanticsPropertyKey<>("CustomActions", true);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageUp = new SemanticsPropertyKey<>("PageUp", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageLeft = new SemanticsPropertyKey<>("PageLeft", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageDown = new SemanticsPropertyKey<>("PageDown", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> PageRight = new SemanticsPropertyKey<>("PageRight", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AccessibilityAction<Function1<List<Float>, Boolean>>> GetScrollViewportLength = new SemanticsPropertyKey<>("GetScrollViewportLength", true, SemanticsPropertiesKt.AnonymousClass1.INSTANCE, null, 8, null);
    public static final int $stable = 8;

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use `SemanticsActions.OnImeAction` instead.", replaceWith = @ReplaceWith(expression = "OnImeAction", imports = {"androidx.compose.ui.semantics.SemanticsActions.OnImeAction"}))
    public static /* synthetic */ void getPerformImeAction$annotations() {
    }

    private SemanticsActions() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function2<Float, Float, Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<Function2<Offset, Continuation<? super Offset>, Object>> getScrollByOffset() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Integer, Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getOnAutofillText() {
        return OnAutofillText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Float, Boolean>>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function3<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<Boolean, Boolean>>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<AnnotatedString, Boolean>>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getOnImeAction() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPerformImeAction() {
        return PerformImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function0<Boolean>>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<Function1<List<Float>, Boolean>>> getGetScrollViewportLength() {
        return GetScrollViewportLength;
    }
}
