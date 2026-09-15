package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "", "p0", "<init>", "(Ljava/lang/CharSequence;)V", "", "contentEquals", "(Ljava/lang/CharSequence;)Z", "", "", "get", "(I)C", "p1", "p2", "p3", "p4", "", "replace", "(IILjava/lang/CharSequence;II)V", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "bufEnd", "I", "bufStart", "Landroidx/compose/foundation/text/input/internal/GapBuffer;", "buffer", "Landroidx/compose/foundation/text/input/internal/GapBuffer;", "getLength", "()I", "length", "text", "Ljava/lang/CharSequence;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PartialGapBuffer implements CharSequence {
    public static final int BUF_SIZE = 255;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 64;
    private GapBuffer buffer;
    private CharSequence text;
    public static final int $stable = 8;
    private int bufStart = -1;
    private int bufEnd = -1;

    public PartialGapBuffer(CharSequence charSequence) {
        this.text = charSequence;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return get(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getLength();
    }

    public final int getLength() {
        GapBuffer gapBuffer = this.buffer;
        return gapBuffer == null ? this.text.length() : (this.text.length() - (this.bufEnd - this.bufStart)) + gapBuffer.length();
    }

    public static /* synthetic */ void replace$default(PartialGapBuffer partialGapBuffer, int i, int i2, CharSequence charSequence, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = charSequence.length();
        }
        partialGapBuffer.replace(i, i2, charSequence, i6, i4);
    }

    public final void replace(int p0, int p1, CharSequence p2, int p3, int p4) {
        while (p0 <= p1) {
            if (p3 > p4) {
                StringBuilder sb = new StringBuilder("textStart=");
                sb.append(p3);
                sb.append(" > textEnd=");
                sb.append(p4);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            if (p0 < 0) {
                throw new IllegalArgumentException("start must be non-negative, but was ".concat(String.valueOf(p0)).toString());
            }
            if (p3 < 0) {
                throw new IllegalArgumentException("textStart must be non-negative, but was ".concat(String.valueOf(p3)).toString());
            }
            GapBuffer gapBuffer = this.buffer;
            int i = p4 - p3;
            if (gapBuffer == null) {
                int iMax = Math.max(255, i + 128);
                char[] cArr = new char[iMax];
                int iMin = Math.min(p0, 64);
                int iMin2 = Math.min(this.text.length() - p1, 64);
                int i2 = p0 - iMin;
                ToCharArray_androidKt.toCharArray(this.text, cArr, 0, i2, p0);
                int i3 = iMax - iMin2;
                int i4 = iMin2 + p1;
                ToCharArray_androidKt.toCharArray(this.text, cArr, i3, p1, i4);
                ToCharArray_androidKt.toCharArray(p2, cArr, iMin, p3, p4);
                this.buffer = new GapBuffer(cArr, iMin + i, i3);
                this.bufStart = i2;
                this.bufEnd = i4;
                return;
            }
            int i5 = this.bufStart;
            int i6 = p0 - i5;
            int i7 = p1 - i5;
            if (i6 < 0 || i7 > gapBuffer.length()) {
                this.text = toString();
                this.buffer = null;
                this.bufStart = -1;
                this.bufEnd = -1;
            } else {
                gapBuffer.replace(i6, i7, p2, p3, p4);
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder("start=");
        sb2.append(p0);
        sb2.append(" > end=");
        sb2.append(p1);
        throw new IllegalArgumentException(sb2.toString().toString());
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

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int p0, int p1) {
        return toString().subSequence(p0, p1);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        GapBuffer gapBuffer = this.buffer;
        if (gapBuffer == null) {
            return this.text.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.text, 0, this.bufStart);
        gapBuffer.append(sb);
        CharSequence charSequence = this.text;
        sb.append(charSequence, this.bufEnd, charSequence.length());
        return sb.toString();
    }

    public final boolean contentEquals(CharSequence p0) {
        return Intrinsics.areEqual(toString(), p0.toString());
    }
}
