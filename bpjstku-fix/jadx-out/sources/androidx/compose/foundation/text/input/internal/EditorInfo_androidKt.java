package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a@\u0010\u0011\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"", "p0", "p1", "", "hasFlag", "(II)Z", "Landroid/view/inputmethod/EditorInfo;", "", "Landroidx/compose/ui/text/TextRange;", "Landroidx/compose/ui/text/input/ImeOptions;", "p2", "", "", "p3", "", "update-pLxbY9I", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "update"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class EditorInfo_androidKt {
    private static final boolean hasFlag(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: update-pLxbY9I$default, reason: not valid java name */
    public static /* synthetic */ void m1467updatepLxbY9I$default(EditorInfo editorInfo, CharSequence charSequence, long j, ImeOptions imeOptions, String[] strArr, int i, Object obj) {
        if ((i & 8) != 0) {
            strArr = null;
        }
        m1466updatepLxbY9I(editorInfo, charSequence, j, imeOptions, strArr);
    }

    /* JADX INFO: renamed from: update-pLxbY9I, reason: not valid java name */
    public static final void m1466updatepLxbY9I(EditorInfo editorInfo, CharSequence charSequence, long j, ImeOptions imeOptions, String[] strArr) {
        int i;
        String privateImeOptions;
        int imeAction = imeOptions.getImeAction();
        int i2 = 3;
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
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo, imeOptions.getHintLocales());
        int keyboardType = imeOptions.getKeyboardType();
        if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6640getTextPjHm6EE())) {
            i2 = 1;
        } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6633getAsciiPjHm6EE())) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6636getNumberPjHm6EE())) {
            i2 = 2;
        } else if (!KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6639getPhonePjHm6EE())) {
            if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6642getUriPjHm6EE())) {
                i2 = 17;
            } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6635getEmailPjHm6EE())) {
                i2 = 33;
            } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6638getPasswordPjHm6EE())) {
                i2 = 129;
            } else if (KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6637getNumberPasswordPjHm6EE())) {
                i2 = 18;
            } else {
                if (!KeyboardType.m6619equalsimpl0(keyboardType, KeyboardType.INSTANCE.m6634getDecimalPjHm6EE())) {
                    throw new IllegalStateException("Invalid Keyboard Type".toString());
                }
                i2 = 8194;
            }
        }
        editorInfo.inputType = i2;
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
        editorInfo.initialSelStart = TextRange.m6397getStartimpl(j);
        editorInfo.initialSelEnd = TextRange.m6392getEndimpl(j);
        EditorInfoCompat.setInitialSurroundingText(editorInfo, charSequence);
        if (strArr != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
        }
        editorInfo.imeOptions |= 33554432;
        if (StylusHandwriting_androidKt.isStylusHandwritingSupported() && !KeyboardType.m6619equalsimpl0(imeOptions.getKeyboardType(), KeyboardType.INSTANCE.m6638getPasswordPjHm6EE()) && !KeyboardType.m6619equalsimpl0(imeOptions.getKeyboardType(), KeyboardType.INSTANCE.m6637getNumberPasswordPjHm6EE())) {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, true);
            EditorInfoApi34.INSTANCE.setHandwritingGestures(editorInfo);
        } else {
            EditorInfoCompat.setStylusHandwritingEnabled(editorInfo, false);
        }
    }
}
