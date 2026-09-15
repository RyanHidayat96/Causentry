package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/InputEventCallback2;", "", "", "Landroidx/compose/ui/text/input/EditCommand;", "p0", "", "onEditCommands", "(Ljava/util/List;)V", "Landroidx/compose/ui/text/input/ImeAction;", "onImeAction-KlQnJC8", "(I)V", "onImeAction", "Landroid/view/KeyEvent;", "onKeyEvent", "(Landroid/view/KeyEvent;)V", "", "p1", "p2", "p3", "p4", "p5", "onRequestCursorAnchorInfo", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/RecordingInputConnection;", "onConnectionClosed", "(Landroidx/compose/ui/text/input/RecordingInputConnection;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InputEventCallback2 {
    void onConnectionClosed(RecordingInputConnection p0);

    void onEditCommands(List<? extends EditCommand> p0);

    /* JADX INFO: renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    void mo6598onImeActionKlQnJC8(int p0);

    void onKeyEvent(KeyEvent p0);

    void onRequestCursorAnchorInfo(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5);
}
