package androidx.compose.foundation.text.modifiers;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005"}, d2 = {"", "DefaultWidthCharCount", "I", "", "EmptyTextReplacement", "Ljava/lang/String;", "TwoLineTextReplacement"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MinLinesConstrainerKt {
    private static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement;
    private static final String TwoLineTextReplacement;

    static {
        String strRepeat = StringsKt.repeat("H", 10);
        EmptyTextReplacement = strRepeat;
        StringBuilder sb = new StringBuilder();
        sb.append(strRepeat);
        sb.append('\n');
        sb.append(strRepeat);
        TwoLineTextReplacement = sb.toString();
    }
}
