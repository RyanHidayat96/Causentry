package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.content.PlatformTransferableContent;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.ui.platform.AndroidClipboardManager_androidKt;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\b\u001a\u00020\u0007*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u001a\u0010\u000f\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0013\u0010\f"}, d2 = {"Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "Landroid/view/inputmethod/ExtractedText;", "toExtractedText", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;)Landroid/view/inputmethod/ExtractedText;", "Landroidx/core/view/inputmethod/InputContentInfoCompat;", "Landroid/os/Bundle;", "p0", "Landroidx/compose/foundation/content/TransferableContent;", "toTransferableContent", "(Landroidx/core/view/inputmethod/InputContentInfoCompat;Landroid/os/Bundle;)Landroidx/compose/foundation/content/TransferableContent;", "", "DEBUG_CLASS", "Ljava/lang/String;", StatelessInputConnection_androidKt.EXTRA_INPUT_CONTENT_INFO, "", "SIC_DEBUG", "Z", "getSIC_DEBUG$annotations", "()V", "STATELESS_TAG"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StatelessInputConnection_androidKt {
    private static final String DEBUG_CLASS = "StatelessInputConnection";
    private static final String EXTRA_INPUT_CONTENT_INFO = "EXTRA_INPUT_CONTENT_INFO";
    public static final boolean SIC_DEBUG = false;
    private static final String STATELESS_TAG = "StatelessIC";

    public static /* synthetic */ void getSIC_DEBUG$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText toExtractedText(TextFieldCharSequence textFieldCharSequence) {
        ExtractedText extractedText = new ExtractedText();
        TextFieldCharSequence textFieldCharSequence2 = textFieldCharSequence;
        extractedText.text = textFieldCharSequence2;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldCharSequence.length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m6395getMinimpl(textFieldCharSequence.getSelection());
        extractedText.selectionEnd = TextRange.m6394getMaximpl(textFieldCharSequence.getSelection());
        extractedText.flags = !StringsKt.contains$default((CharSequence) textFieldCharSequence2, '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }

    public static final TransferableContent toTransferableContent(InputContentInfoCompat inputContentInfoCompat, Bundle bundle) {
        ClipEntry clipEntry = AndroidClipboardManager_androidKt.toClipEntry(new ClipData(inputContentInfoCompat.getDescription(), new ClipData.Item(inputContentInfoCompat.getContentUri())));
        int iM659getKeyboardkB6V9T0 = TransferableContent.Source.INSTANCE.m659getKeyboardkB6V9T0();
        ClipMetadata clipMetadata = AndroidClipboardManager_androidKt.toClipMetadata(inputContentInfoCompat.getDescription());
        Uri linkUri = inputContentInfoCompat.getLinkUri();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        return new TransferableContent(clipEntry, clipMetadata, iM659getKeyboardkB6V9T0, new PlatformTransferableContent(linkUri, bundle), null);
    }
}
