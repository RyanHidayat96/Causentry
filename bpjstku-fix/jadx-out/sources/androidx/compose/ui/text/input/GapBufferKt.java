package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "p0", "", "p1", "", "toCharArray", "(Ljava/lang/String;[CI)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GapBufferKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void toCharArray(String str, char[] cArr, int i) {
        GapBuffer_jvmKt.toCharArray(str, cArr, i, 0, str.length());
    }
}
