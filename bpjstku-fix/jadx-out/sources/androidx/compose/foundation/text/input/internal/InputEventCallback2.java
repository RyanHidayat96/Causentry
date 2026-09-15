package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.ui.text.input.EditCommand;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000bH&ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012H&¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "", "Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "p0", "", "onConnectionClosed", "(Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;)V", "", "Landroidx/compose/ui/text/input/EditCommand;", "onEditCommands", "(Ljava/util/List;)V", "Landroidx/compose/ui/text/input/ImeAction;", "onImeAction-KlQnJC8", "(I)V", "onImeAction", "Landroid/view/KeyEvent;", "onKeyEvent", "(Landroid/view/KeyEvent;)V", "", "p1", "p2", "p3", "p4", "p5", "onRequestCursorAnchorInfo", "(ZZZZZZ)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface InputEventCallback2 {
    void onConnectionClosed(RecordingInputConnection p0);

    void onEditCommands(List<? extends EditCommand> p0);

    /* JADX INFO: renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void mo1494onImeActionKlQnJC8(int p0);

    void onKeyEvent(KeyEvent p0);

    void onRequestCursorAnchorInfo(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5);
}
