package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JU\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u00162\u0006\u0010\t\u001a\u00020\u00172\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0007\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J5\u0010#\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020!2\u0006\u0010\t\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r06058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010@\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00060\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bB\u0010AR$\u0010C\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00158\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0018\u0010O\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010P"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyTextInputMethodRequest;", "Landroidx/compose/ui/platform/PlatformTextInputMethodRequest;", "Landroid/view/View;", "p0", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "", "p1", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "p2", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "Landroid/view/inputmethod/EditorInfo;", "Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "createInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "Landroidx/compose/ui/geometry/Rect;", "notifyFocusedRect", "(Landroidx/compose/ui/geometry/Rect;)V", "restartInputImmediately", "()V", "Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "Landroidx/compose/ui/text/input/ImeOptions;", "", "Landroidx/compose/ui/text/input/EditCommand;", "p3", "Landroidx/compose/ui/text/input/ImeAction;", "p4", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "updateState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroidx/compose/ui/text/input/OffsetMapping;", "Landroidx/compose/ui/text/TextLayoutResult;", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection$delegate", "Lkotlin/Lazy;", "getBaseInputConnection", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroidx/compose/foundation/text/input/internal/LegacyCursorAnchorInfoController;", "cursorAnchorInfoController", "Landroidx/compose/foundation/text/input/internal/LegacyCursorAnchorInfoController;", "Landroid/graphics/Rect;", "focusedRect", "Landroid/graphics/Rect;", "getFocusedRect$foundation_release", "()Landroid/graphics/Rect;", "setFocusedRect$foundation_release", "(Landroid/graphics/Rect;)V", "", "Ljava/lang/ref/WeakReference;", "ics", "Ljava/util/List;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "inputMethodManager", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "legacyTextFieldState", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "onEditCommand", "Lkotlin/jvm/functions/Function1;", "onImeActionPerformed", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/text/input/TextFieldValue;", "getState", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacyTextInputMethodRequest implements PlatformTextInputMethodRequest {
    public static final int $stable = 8;
    private final LegacyCursorAnchorInfoController cursorAnchorInfoController;
    private Rect focusedRect;
    private final InputMethodManager inputMethodManager;
    private LegacyTextFieldState legacyTextFieldState;
    private TextFieldSelectionManager textFieldSelectionManager;
    private final View view;
    private ViewConfiguration viewConfiguration;
    private Function1<? super List<? extends EditCommand>, Unit> onEditCommand = new Function1<List<? extends EditCommand>, Unit>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onEditCommand$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends EditCommand> list) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(List<? extends EditCommand> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }
    };
    private Function1<? super ImeAction, Unit> onImeActionPerformed = new Function1<ImeAction, Unit>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$onImeActionPerformed$1
        /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m1495invokeKlQnJC8(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ImeAction imeAction) {
            m1495invokeKlQnJC8(imeAction.getValue());
            return Unit.INSTANCE;
        }
    };
    private TextFieldValue state = new TextFieldValue("", TextRange.INSTANCE.m6402getZerod9O1mEE(), (TextRange) null, 4, (DefaultConstructorMarker) null);
    private ImeOptions imeOptions = ImeOptions.INSTANCE.getDefault();
    private List<WeakReference<RecordingInputConnection>> ics = new ArrayList();

    /* JADX INFO: renamed from: baseInputConnection$delegate, reason: from kotlin metadata */
    private final Lazy baseInputConnection = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<BaseInputConnection>() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest$baseInputConnection$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(this.this$0.getView(), false);
        }

        {
            super(0);
        }
    });

    public LegacyTextInputMethodRequest(View view, Function1<? super Matrix, Unit> function1, InputMethodManager inputMethodManager) {
        this.view = view;
        this.inputMethodManager = inputMethodManager;
        this.cursorAnchorInfoController = new LegacyCursorAnchorInfoController(function1, inputMethodManager);
    }

    public final View getView() {
        return this.view;
    }

    public final TextFieldValue getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection getBaseInputConnection() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX INFO: renamed from: getFocusedRect$foundation_release, reason: from getter */
    public final Rect getFocusedRect() {
        return this.focusedRect;
    }

    public final void setFocusedRect$foundation_release(Rect rect) {
        this.focusedRect = rect;
    }

    public final void startInput(TextFieldValue p0, LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode p1, ImeOptions p2, Function1<? super List<? extends EditCommand>, Unit> p3, Function1<? super ImeAction, Unit> p4) {
        this.state = p0;
        this.imeOptions = p2;
        this.onEditCommand = p3;
        this.onImeActionPerformed = p4;
        this.legacyTextFieldState = p1 != null ? p1.getLegacyTextFieldState() : null;
        this.textFieldSelectionManager = p1 != null ? p1.getTextFieldSelectionManager() : null;
        this.viewConfiguration = p1 != null ? p1.getViewConfiguration() : null;
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public final RecordingInputConnection createInputConnection(EditorInfo p0) {
        EditorInfo_androidKt.m1467updatepLxbY9I$default(p0, this.state.getText(), this.state.getSelection(), this.imeOptions, null, 8, null);
        LegacyPlatformTextInputServiceAdapter_androidKt.updateWithEmojiCompat(p0);
        TextFieldValue textFieldValue = this.state;
        boolean autoCorrect = this.imeOptions.getAutoCorrect();
        RecordingInputConnection recordingInputConnection = new RecordingInputConnection(textFieldValue, new InputEventCallback2() { // from class: androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest.createInputConnection.1
            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void onEditCommands(List<? extends EditCommand> p1) {
                LegacyTextInputMethodRequest.this.onEditCommand.invoke(p1);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
            public final void mo1494onImeActionKlQnJC8(int p1) {
                LegacyTextInputMethodRequest.this.onImeActionPerformed.invoke(ImeAction.m6563boximpl(p1));
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void onKeyEvent(KeyEvent p1) {
                LegacyTextInputMethodRequest.this.getBaseInputConnection().sendKeyEvent(p1);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void onRequestCursorAnchorInfo(boolean p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6) {
                LegacyTextInputMethodRequest.this.cursorAnchorInfoController.requestUpdate(p1, p2, p3, p4, p5, p6);
            }

            @Override // androidx.compose.foundation.text.input.internal.InputEventCallback2
            public final void onConnectionClosed(RecordingInputConnection p1) {
                int size = LegacyTextInputMethodRequest.this.ics.size();
                for (int i = 0; i < size; i++) {
                    if (Intrinsics.areEqual(((WeakReference) LegacyTextInputMethodRequest.this.ics.get(i)).get(), p1)) {
                        LegacyTextInputMethodRequest.this.ics.remove(i);
                        return;
                    }
                }
            }
        }, autoCorrect, this.legacyTextFieldState, this.textFieldSelectionManager, this.viewConfiguration);
        this.ics.add(new WeakReference<>(recordingInputConnection));
        return recordingInputConnection;
    }

    public final void updateState(TextFieldValue p0, TextFieldValue p1) {
        boolean z = (TextRange.m6390equalsimpl0(this.state.getSelection(), p1.getSelection()) && Intrinsics.areEqual(this.state.getComposition(), p1.getComposition())) ? false : true;
        this.state = p1;
        int size = this.ics.size();
        for (int i = 0; i < size; i++) {
            RecordingInputConnection recordingInputConnection = this.ics.get(i).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setTextFieldValue$foundation_release(p1);
            }
        }
        this.cursorAnchorInfoController.invalidate();
        if (Intrinsics.areEqual(p0, p1)) {
            if (z) {
                InputMethodManager inputMethodManager = this.inputMethodManager;
                int iM6395getMinimpl = TextRange.m6395getMinimpl(p1.getSelection());
                int iM6394getMaximpl = TextRange.m6394getMaximpl(p1.getSelection());
                TextRange composition = this.state.getComposition();
                int iM6395getMinimpl2 = composition != null ? TextRange.m6395getMinimpl(composition.getPackedValue()) : -1;
                TextRange composition2 = this.state.getComposition();
                inputMethodManager.updateSelection(iM6395getMinimpl, iM6394getMaximpl, iM6395getMinimpl2, composition2 != null ? TextRange.m6394getMaximpl(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (p0 != null && (!Intrinsics.areEqual(p0.getText(), p1.getText()) || (TextRange.m6390equalsimpl0(p0.getSelection(), p1.getSelection()) && !Intrinsics.areEqual(p0.getComposition(), p1.getComposition())))) {
            restartInputImmediately();
            return;
        }
        int size2 = this.ics.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RecordingInputConnection recordingInputConnection2 = this.ics.get(i2).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.state, this.inputMethodManager);
            }
        }
    }

    public final void notifyFocusedRect(androidx.compose.ui.geometry.Rect p0) {
        Rect rect;
        this.focusedRect = new Rect(MathKt.roundToInt(p0.getLeft()), MathKt.roundToInt(p0.getTop()), MathKt.roundToInt(p0.getRight()), MathKt.roundToInt(p0.getBottom()));
        if (!this.ics.isEmpty() || (rect = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect));
    }

    public final void updateTextLayoutResult(TextFieldValue p0, OffsetMapping p1, TextLayoutResult p2, androidx.compose.ui.geometry.Rect p3, androidx.compose.ui.geometry.Rect p4) {
        this.cursorAnchorInfoController.updateTextLayoutResult(p0, p1, p2, p3, p4);
    }

    private final void restartInputImmediately() {
        this.inputMethodManager.restartInput();
    }
}
