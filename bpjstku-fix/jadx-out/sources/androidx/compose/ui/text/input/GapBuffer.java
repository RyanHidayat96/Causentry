package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0003\u001a\u00060\u0016j\u0002`\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001e"}, d2 = {"Landroidx/compose/ui/text/input/GapBuffer;", "", "", "p0", "", "p1", "p2", "<init>", "([CII)V", "gapLength", "()I", "", "get", "(I)C", "", "makeSureAvailableSpace", "(I)V", "delete", "(II)V", "", "replace", "(IILjava/lang/String;)V", "Ljava/lang/StringBuilder;", "Lkotlin/text/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "append", "(Ljava/lang/StringBuilder;)V", "length", "toString", "()Ljava/lang/String;", "capacity", "I", "buffer", "[C", "gapStart", "gapEnd"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] cArr, int i, int i2) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i;
        this.gapEnd = i2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    public final char get(int p0) {
        int i = this.gapStart;
        if (p0 < i) {
            return this.buffer[p0];
        }
        return this.buffer[(p0 - i) + this.gapEnd];
    }

    private final void makeSureAvailableSpace(int p0) {
        if (p0 <= gapLength()) {
            return;
        }
        int iGapLength = gapLength();
        int i = this.capacity;
        do {
            i *= 2;
        } while (i - this.capacity < p0 - iGapLength);
        char[] cArr = new char[i];
        ArraysKt.copyInto(this.buffer, cArr, 0, 0, this.gapStart);
        int i2 = this.capacity;
        int i3 = this.gapEnd;
        int i4 = i2 - i3;
        int i5 = i - i4;
        ArraysKt.copyInto(this.buffer, cArr, i5, i3, i4 + i3);
        this.buffer = cArr;
        this.capacity = i;
        this.gapEnd = i5;
    }

    private final void delete(int p0, int p1) {
        int i = this.gapStart;
        if (p0 < i && p1 <= i) {
            int i2 = i - p1;
            char[] cArr = this.buffer;
            ArraysKt.copyInto(cArr, cArr, this.gapEnd - i2, p1, i);
            this.gapStart = p0;
            this.gapEnd -= i2;
            return;
        }
        if (p0 < i && p1 >= i) {
            this.gapEnd = p1 + gapLength();
            this.gapStart = p0;
            return;
        }
        int iGapLength = p0 + gapLength();
        int iGapLength2 = gapLength();
        int i3 = this.gapEnd;
        char[] cArr2 = this.buffer;
        ArraysKt.copyInto(cArr2, cArr2, this.gapStart, i3, iGapLength);
        this.gapStart += iGapLength - i3;
        this.gapEnd = p1 + iGapLength2;
    }

    public final void replace(int p0, int p1, String p2) {
        makeSureAvailableSpace(p2.length() - (p1 - p0));
        delete(p0, p1);
        GapBufferKt.toCharArray(p2, this.buffer, this.gapStart);
        this.gapStart += p2.length();
    }

    public final void append(StringBuilder p0) {
        p0.append(this.buffer, 0, this.gapStart);
        Intrinsics.checkNotNullExpressionValue(p0, "");
        char[] cArr = this.buffer;
        int i = this.gapEnd;
        p0.append(cArr, i, this.capacity - i);
        Intrinsics.checkNotNullExpressionValue(p0, "");
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
