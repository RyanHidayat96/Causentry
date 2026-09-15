package androidx.compose.foundation.text.input;

import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "", "getSelectedText", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)Ljava/lang/CharSequence;", "", "p0", "getTextAfterSelection", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;I)Ljava/lang/CharSequence;", "getTextBeforeSelection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TextFieldCharSequenceKt {
    public static final CharSequence getTextBeforeSelection(TextFieldCharSequence textFieldCharSequence, int i) {
        return textFieldCharSequence.subSequence(Math.max(0, TextRange.m6395getMinimpl(textFieldCharSequence.getSelection()) - i), TextRange.m6395getMinimpl(textFieldCharSequence.getSelection()));
    }

    public static final CharSequence getTextAfterSelection(TextFieldCharSequence textFieldCharSequence, int i) {
        return textFieldCharSequence.subSequence(TextRange.m6394getMaximpl(textFieldCharSequence.getSelection()), Math.min(TextRange.m6394getMaximpl(textFieldCharSequence.getSelection()) + i, textFieldCharSequence.length()));
    }

    public static final CharSequence getSelectedText(TextFieldCharSequence textFieldCharSequence) {
        return textFieldCharSequence.subSequence(TextRange.m6395getMinimpl(textFieldCharSequence.getSelection()), TextRange.m6394getMaximpl(textFieldCharSequence.getSelection()));
    }
}
