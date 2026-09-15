package androidx.compose.foundation.text.input.internal;

import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH&¢\u0006\u0004\b\u0015\u0010\nJ(\u0010\u0019\u001a\u00020\b2\u0017\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\b0\u0016¢\u0006\u0002\b\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u001bH&¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TextInputSession;", "", "Landroidx/compose/foundation/content/TransferableContent;", "p0", "", "onCommitContent", "(Landroidx/compose/foundation/content/TransferableContent;)Z", "Landroidx/compose/ui/text/input/ImeAction;", "", "onImeAction-KlQnJC8", "(I)V", "onImeAction", "Landroid/view/inputmethod/HandwritingGesture;", "", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "p1", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "requestCursorUpdates", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "Lkotlin/ExtensionFunctionType;", "requestEdit", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/KeyEvent;", "sendKeyEvent", "(Landroid/view/KeyEvent;)V", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "text"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TextInputSession {
    TextFieldCharSequence getText();

    boolean onCommitContent(TransferableContent p0);

    /* JADX INFO: renamed from: onImeAction-KlQnJC8 */
    void mo1457onImeActionKlQnJC8(int p0);

    int performHandwritingGesture(HandwritingGesture p0);

    boolean previewHandwritingGesture(PreviewableHandwritingGesture p0, CancellationSignal p1);

    void requestCursorUpdates(int p0);

    void requestEdit(Function1<? super EditingBuffer, Unit> p0);

    void sendKeyEvent(KeyEvent p0);
}
