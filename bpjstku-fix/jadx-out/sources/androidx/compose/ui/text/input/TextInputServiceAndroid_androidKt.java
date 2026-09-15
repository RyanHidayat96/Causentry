package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.EmojiCompat;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "updateWithEmojiCompat", "(Landroid/view/inputmethod/EditorInfo;)V", "Landroidx/compose/ui/text/input/ImeOptions;", "p0", "Landroidx/compose/ui/text/input/TextFieldValue;", "p1", "update", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "asExecutor", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "", "", "hasFlag", "(II)Z", "", "DEBUG_CLASS", "Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWithEmojiCompat(EditorInfo editorInfo) {
        if (EmojiCompat.isConfigured()) {
            EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }

    public static final void update(EditorInfo editorInfo, ImeOptions imeOptions, TextFieldValue textFieldValue) {
        int i;
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        if (ImeAction.m6566equalsimpl0(imeAction, ImeAction.INSTANCE.m6579getDefaulteUduSuo())) {
            i = !imeOptions.getSingleLine() ? 0 : 6;
        } else if (ImeAction.m6566equalsimpl0(imeAction, ImeAction.INSTANCE.m6583getNoneeUduSuo())) {
            i = 1;
        } else if (ImeAction.m6566equalsimpl0(imeAction, ImeAction.INSTANCE.m6581getGoeUduSuo())) {
            i = 2;
        } else if (ImeAction.m6566equalsimpl0(imeAction, ImeAction.INSTANCE.m6582getNexteUduSuo())) {
            i = 5;
        } else if (ImeAction.m6566equalsimpl0(imeAction, ImeAction.INSTANCE.m6584getPreviouseUduSuo())) {
            i = 7;
        } else if (ImeAction.m6566equalsimpl0(imeAction, ImeAction.INSTANCE.m6585getSearcheUduSuo())) {
            i = 3;
        } else if (ImeAction.m6566equalsimpl0(imeAction, ImeAction.INSTANCE.m6586getSendeUduSuo())) {
            i = 4;
        } else {
            if (!ImeAction.m6566equalsimpl0(imeAction, ImeAction.INSTANCE.m6580getDoneeUduSuo())) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
        }
        editorInfo.imeOptions = i;
        PlatformImeOptions platformImeOptions = imeOptions.getPlatformImeOptions();
        if (platformImeOptions != null && (privateImeOptions = platformImeOptions.getPrivateImeOptions()) != null) {
            editorInfo.privateImeOptions = privateImeOptions;
        }
        int keyboardType = imeOptions.getKeyboardType();
        if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6640getTextPjHm6EE())) {
            editorInfo.inputType = 1;
        } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6633getAsciiPjHm6EE())) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6636getNumberPjHm6EE())) {
            editorInfo.inputType = 2;
        } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6639getPhonePjHm6EE())) {
            editorInfo.inputType = 3;
        } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6642getUriPjHm6EE())) {
            editorInfo.inputType = 17;
        } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6635getEmailPjHm6EE())) {
            editorInfo.inputType = 33;
        } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6638getPasswordPjHm6EE())) {
            editorInfo.inputType = 129;
        } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6637getNumberPasswordPjHm6EE())) {
            editorInfo.inputType = 18;
        } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6634getDecimalPjHm6EE())) {
            editorInfo.inputType = 8194;
        } else {
            throw new IllegalStateException("Invalid Keyboard Type".toString());
        }
        if (!imeOptions.getSingleLine() && hasFlag(editorInfo.inputType, 1)) {
            editorInfo.inputType |= 131072;
            if (ImeAction.m6566equalsimpl0(imeOptions.getImeAction(), ImeAction.INSTANCE.m6579getDefaulteUduSuo())) {
                editorInfo.imeOptions |= BasicMeasure.EXACTLY;
            }
        }
        if (hasFlag(editorInfo.inputType, 1)) {
            int capitalization = imeOptions.getCapitalization();
            if (KeyboardCapitalization.m6602equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m6611getCharactersIUNYP9k())) {
                editorInfo.inputType |= 4096;
            } else if (KeyboardCapitalization.m6602equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m6615getWordsIUNYP9k())) {
                editorInfo.inputType |= 8192;
            } else if (KeyboardCapitalization.m6602equalsimpl0(capitalization, KeyboardCapitalization.INSTANCE.m6613getSentencesIUNYP9k())) {
                editorInfo.inputType |= 16384;
            }
            if (imeOptions.getAutoCorrect()) {
                editorInfo.inputType |= 32768;
            }
        }
        editorInfo.initialSelStart = TextRange.m6397getStartimpl(textFieldValue.getSelection());
        editorInfo.initialSelEnd = TextRange.m6392getEndimpl(textFieldValue.getSelection());
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textFieldValue.getText());
        editorInfo.imeOptions |= 33554432;
    }

    public static final Executor asExecutor(final Choreographer choreographer) {
        return new Executor() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                TextInputServiceAndroid_androidKt.asExecutor$lambda$2(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asExecutor$lambda$2(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt$$ExternalSyntheticLambda0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
