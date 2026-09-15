package androidx.compose.ui.text.input;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0005R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "p1", "p2", "", "replace", "(IILjava/lang/String;)V", "", "get", "(I)C", "toString", "()Ljava/lang/String;", "text", "Ljava/lang/String;", "getText", "setText", "Landroidx/compose/ui/text/input/GapBuffer;", "buffer", "Landroidx/compose/ui/text/input/GapBuffer;", "bufStart", "I", "bufEnd", "getLength", "()I", "length", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PartialGapBuffer {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private String text;
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    public PartialGapBuffer(String str) {
        this.text = str;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public final void replace(int p0, int p1, String p2) {
        while (true) {
            if (p0 > p1) {
                StringBuilder sb = new StringBuilder("start index must be less than or equal to end index: ");
                sb.append(p0);
                sb.append(" > ");
                sb.append(p1);
                InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            if (p0 < 0) {
                InlineClassHelperKt.throwIllegalArgumentException("start must be non-negative, but was ".concat(String.valueOf(p0)));
            }
            GapBuffer gapBuffer = this.buffer;
            if (gapBuffer == null) {
                int iMax = Math.max(255, p2.length() + 128);
                char[] cArr = new char[iMax];
                int iMin = Math.min(p0, 64);
                int iMin2 = Math.min(this.text.length() - p1, 64);
                int i = p0 - iMin;
                GapBuffer_jvmKt.toCharArray(this.text, cArr, 0, i, p0);
                int i2 = iMax - iMin2;
                int i3 = iMin2 + p1;
                GapBuffer_jvmKt.toCharArray(this.text, cArr, i2, p1, i3);
                GapBufferKt.toCharArray(p2, cArr, iMin);
                this.buffer = new GapBuffer(cArr, iMin + p2.length(), i2);
                this.bufStart = i;
                this.bufEnd = i3;
                return;
            }
            int i4 = this.bufStart;
            int i5 = p0 - i4;
            int i6 = p1 - i4;
            if (i5 < 0 || i6 > gapBuffer.length()) {
                this.text = toString();
                this.buffer = null;
                this.bufStart = -1;
                this.bufEnd = -1;
            } else {
                gapBuffer.replace(i5, i6, p2);
                return;
            }
        }
    }

    public final char get(int p0) {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.charAt(p0);
        }
        if (p0 < this.bufStart) {
            return this.text.charAt(p0);
        }
        int length = gapBuffer.length();
        int i = this.bufStart;
        if (p0 < length + i) {
            return gapBuffer.get(p0 - i);
        }
        return this.text.charAt(p0 - ((length - this.bufEnd) + i));
    }

    public final String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        String str = this.text;
        sb.append((CharSequence) str, this.bufEnd, str.length());
        return sb.toString();
    }
}
