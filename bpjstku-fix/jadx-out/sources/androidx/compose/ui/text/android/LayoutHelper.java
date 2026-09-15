package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u000fJ\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0003\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010-\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001a\u00102\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "Landroid/text/Layout;", "p0", "<init>", "(Landroid/text/Layout;)V", "", "Ljava/text/Bidi;", "analyzeBidi", "(I)Ljava/text/Bidi;", "", "p1", "getParagraphForOffset", "(IZ)I", "getParagraphStart", "(I)I", "getParagraphEnd", "isRtlParagraph", "(I)Z", "p2", "", "getHorizontalPosition", "(IZZ)F", "getLineVisibleEnd", "getDownstreamHorizontal", "(IZ)F", "lineEndToVisibleEnd", "(II)I", "", "Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "getLineBidiRuns$ui_text", "(I)[Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "isLineEndSpace", "(C)Z", "layout", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "", "paragraphEnds", "Ljava/util/List;", "", "paragraphBidi", "", "bidiProcessedParagraphs", "[Z", "", "tmpBuffer", "[C", "paragraphCount", "I", "getParagraphCount", "()I", "BidiRun"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LayoutHelper {
    public static final int $stable = 8;
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    public LayoutHelper(Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iIndexOf$default = StringsKt.indexOf$default(this.layout.getText(), '\n', length, false, 4, (Object) null);
            length = iIndexOf$default < 0 ? this.layout.getText().length() : iIndexOf$default + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    public final Layout getLayout() {
        return this.layout;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    public final Bidi analyzeBidi(int p0) {
        Bidi bidi;
        if (this.bidiProcessedParagraphs[p0]) {
            return this.paragraphBidi.get(p0);
        }
        int iIntValue = p0 == 0 ? 0 : this.paragraphEnds.get(p0 - 1).intValue();
        int iIntValue2 = this.paragraphEnds.get(p0).intValue();
        int i = iIntValue2 - iIntValue;
        char[] cArr = this.tmpBuffer;
        if (cArr == null || cArr.length < i) {
            cArr = new char[i];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i)) {
            bidi = new Bidi(cArr2, 0, null, 0, i, isRtlParagraph(p0) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        this.paragraphBidi.set(p0, bidi);
        this.bidiProcessedParagraphs[p0] = true;
        if (bidi != null) {
            char[] cArr3 = this.tmpBuffer;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.tmpBuffer = cArr2;
        return bidi;
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return layoutHelper.getParagraphForOffset(i, z);
    }

    public final int getParagraphForOffset(int p0, boolean p1) {
        int iBinarySearch$default = CollectionsKt.binarySearch$default(this.paragraphEnds, Integer.valueOf(p0), 0, 0, 6, (Object) null);
        int i = iBinarySearch$default < 0 ? -(iBinarySearch$default + 1) : iBinarySearch$default + 1;
        if (p1 && i > 0) {
            int i2 = i - 1;
            if (p0 == this.paragraphEnds.get(i2).intValue()) {
                return i2;
            }
        }
        return i;
    }

    public final int getParagraphStart(int p0) {
        if (p0 == 0) {
            return 0;
        }
        return this.paragraphEnds.get(p0 - 1).intValue();
    }

    public final int getParagraphEnd(int p0) {
        return this.paragraphEnds.get(p0).intValue();
    }

    public final boolean isRtlParagraph(int p0) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(p0))) == -1;
    }

    public final float getHorizontalPosition(int p0, boolean p1, boolean p2) {
        int iLineEndToVisibleEnd = p0;
        if (!p2) {
            return getDownstreamHorizontal(p0, p1);
        }
        int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout, iLineEndToVisibleEnd, p2);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (iLineEndToVisibleEnd != lineStart && iLineEndToVisibleEnd != lineEnd) {
            return getDownstreamHorizontal(p0, p1);
        }
        if (iLineEndToVisibleEnd == 0 || iLineEndToVisibleEnd == this.layout.getText().length()) {
            return getDownstreamHorizontal(p0, p1);
        }
        int paragraphForOffset = getParagraphForOffset(iLineEndToVisibleEnd, p2);
        boolean zIsRtlParagraph = isRtlParagraph(paragraphForOffset);
        int iLineEndToVisibleEnd2 = lineEndToVisibleEnd(lineEnd, lineStart);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi bidiCreateLineBidi = bidiAnalyzeBidi != null ? bidiAnalyzeBidi.createLineBidi(lineStart - paragraphStart, iLineEndToVisibleEnd2 - paragraphStart) : null;
        boolean z = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (p1 || zIsRtlParagraph == zIsRtlCharAt) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (iLineEndToVisibleEnd == lineStart) {
                z = zIsRtlParagraph;
            } else if (!zIsRtlParagraph) {
                z = true;
            }
            Layout layout = this.layout;
            return z ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i = 0; i < runCount; i++) {
            bidiRunArr[i] = new BidiRun(bidiCreateLineBidi.getRunStart(i) + lineStart, bidiCreateLineBidi.getRunLimit(i) + lineStart, bidiCreateLineBidi.getRunLevel(i) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i2 = 0; i2 < runCount2; i2++) {
            bArr[i2] = (byte) bidiCreateLineBidi.getRunLevel(i2);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i3 = -1;
        if (iLineEndToVisibleEnd == lineStart) {
            for (int i4 = 0; i4 < runCount; i4++) {
                if (bidiRunArr[i4].getStart() == iLineEndToVisibleEnd) {
                    i3 = i4;
                    break;
                }
            }
            BidiRun bidiRun = bidiRunArr[i3];
            if (p1 || zIsRtlParagraph == bidiRun.isRtl()) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (i3 == 0 && zIsRtlParagraph) {
                return this.layout.getLineLeft(lineForOffset);
            }
            if (i3 == ArraysKt.getLastIndex(bidiRunArr) && !zIsRtlParagraph) {
                return this.layout.getLineRight(lineForOffset);
            }
            if (zIsRtlParagraph) {
                return this.layout.getPrimaryHorizontal(bidiRunArr[i3 - 1].getStart());
            }
            return this.layout.getPrimaryHorizontal(bidiRunArr[i3 + 1].getStart());
        }
        if (iLineEndToVisibleEnd > iLineEndToVisibleEnd2) {
            iLineEndToVisibleEnd = lineEndToVisibleEnd(iLineEndToVisibleEnd, lineStart);
        }
        for (int i5 = 0; i5 < runCount; i5++) {
            if (bidiRunArr[i5].getEnd() == iLineEndToVisibleEnd) {
                i3 = i5;
                break;
            }
        }
        BidiRun bidiRun2 = bidiRunArr[i3];
        if (!p1 && zIsRtlParagraph != bidiRun2.isRtl()) {
            zIsRtlParagraph = !zIsRtlParagraph;
        }
        if (i3 == 0 && zIsRtlParagraph) {
            return this.layout.getLineLeft(lineForOffset);
        }
        if (i3 == ArraysKt.getLastIndex(bidiRunArr) && !zIsRtlParagraph) {
            return this.layout.getLineRight(lineForOffset);
        }
        if (zIsRtlParagraph) {
            return this.layout.getPrimaryHorizontal(bidiRunArr[i3 - 1].getEnd());
        }
        return this.layout.getPrimaryHorizontal(bidiRunArr[i3 + 1].getEnd());
    }

    public final int getLineVisibleEnd(int p0) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(p0), this.layout.getLineStart(p0));
    }

    private final float getDownstreamHorizontal(int p0, boolean p1) {
        int iCoerceAtMost = RangesKt.coerceAtMost(p0, this.layout.getLineEnd(this.layout.getLineForOffset(p0)));
        if (p1) {
            return this.layout.getPrimaryHorizontal(iCoerceAtMost);
        }
        return this.layout.getSecondaryHorizontal(iCoerceAtMost);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "", "p0", "p1", "", "p2", "<init>", "(IIZ)V", "component1", "()I", "component2", "component3", "()Z", "copy", "(IIZ)Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "start", "I", "getStart", "end", "getEnd", "isRtl", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BidiRun {
        public static final int $stable = 0;
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i, int i2, boolean z) {
            this.start = i;
            this.end = i2;
            this.isRtl = z;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bidiRun.start;
            }
            if ((i3 & 2) != 0) {
                i2 = bidiRun.end;
            }
            if ((i3 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i, i2, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }

        public final BidiRun copy(int p0, int p1, boolean p2) {
            return new BidiRun(p0, p1, p2);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) p0;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public final int hashCode() {
            return (((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31) + Boolean.hashCode(this.isRtl);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", isRtl=");
            sb.append(this.isRtl);
            sb.append(')');
            return sb.toString();
        }
    }

    private final int lineEndToVisibleEnd(int p0, int p1) {
        while (p0 > p1 && isLineEndSpace(this.layout.getText().charAt(p0 - 1))) {
            p0--;
        }
        return p0;
    }

    public final BidiRun[] getLineBidiRuns$ui_text(int p0) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.layout.getLineStart(p0);
        int lineEnd = this.layout.getLineEnd(p0);
        int paragraphForOffset$default = getParagraphForOffset$default(this, lineStart, false, 2, null);
        int paragraphStart = getParagraphStart(paragraphForOffset$default);
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset$default);
        if (bidiAnalyzeBidi == null || (bidiCreateLineBidi = bidiAnalyzeBidi.createLineBidi(lineStart - paragraphStart, lineEnd - paragraphStart)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i = 0; i < runCount; i++) {
            int runStart = bidiCreateLineBidi.getRunStart(i);
            int runLimit = bidiCreateLineBidi.getRunLimit(i);
            boolean z = true;
            if (bidiCreateLineBidi.getRunLevel(i) % 2 != 1) {
                z = false;
            }
            bidiRunArr[i] = new BidiRun(runStart + lineStart, runLimit + lineStart, z);
        }
        return bidiRunArr;
    }

    public final boolean isLineEndSpace(char p0) {
        if (p0 == ' ' || p0 == '\n' || p0 == 5760) {
            return true;
        }
        return (Intrinsics.compare((int) p0, 8192) >= 0 && Intrinsics.compare((int) p0, 8202) <= 0 && p0 != 8199) || p0 == 8287 || p0 == 12288;
    }
}
