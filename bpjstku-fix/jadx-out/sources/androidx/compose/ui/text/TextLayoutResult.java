package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\fJ\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b!\u0010 J\u0015\u0010%\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b'\u0010(J\u0015\u0010,\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b-\u0010(J\u001f\u0010/\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b/\u00100J#\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0017¢\u0006\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u0011\u0010O\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bP\u0010NR\u0011\u0010S\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\bR\u0010NR\"\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0T8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0011\u0010Z\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\bY\u00107"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "p0", "Landroidx/compose/ui/text/MultiParagraph;", "p1", "Landroidx/compose/ui/unit/IntSize;", "p2", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "getLineStart", "(I)I", "", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "", "getLineTop", "(I)F", "getLineBaseline", "getLineBottom", "getLineLeft", "getLineRight", "getLineForOffset", "getLineForVerticalPosition", "(F)I", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "copy-O0kMr_c", "(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;", "copy", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "layoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "getLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "multiParagraph", "Landroidx/compose/ui/text/MultiParagraph;", "getMultiParagraph", "()Landroidx/compose/ui/text/MultiParagraph;", "size", "J", "getSize-YbymL2g", "()J", "firstBaseline", "F", "getFirstBaseline", "()F", "lastBaseline", "getLastBaseline", "getDidOverflowHeight", "()Z", "didOverflowHeight", "getDidOverflowWidth", "didOverflowWidth", "getHasVisualOverflow", "hasVisualOverflow", "", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "getLineCount", "lineCount"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;
    private final TextLayoutInput layoutInput;
    private final MultiParagraph multiParagraph;
    private final List<Rect> placeholderRects;
    private final long size;

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }

    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public final boolean getDidOverflowHeight() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float) ((int) (this.size & 4294967295L))) < this.multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float) ((int) (this.size >> 32))) < this.multiParagraph.getWidth();
    }

    public final boolean getHasVisualOverflow() {
        return getDidOverflowWidth() || getDidOverflowHeight();
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineStart(int p0) {
        return this.multiParagraph.getLineStart(p0);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResult.getLineEnd(i, z);
    }

    public final int getLineEnd(int p0, boolean p1) {
        return this.multiParagraph.getLineEnd(p0, p1);
    }

    public final boolean isLineEllipsized(int p0) {
        return this.multiParagraph.isLineEllipsized(p0);
    }

    public final float getLineTop(int p0) {
        return this.multiParagraph.getLineTop(p0);
    }

    public final float getLineBaseline(int p0) {
        return this.multiParagraph.getLineBaseline(p0);
    }

    public final float getLineBottom(int p0) {
        return this.multiParagraph.getLineBottom(p0);
    }

    public final float getLineLeft(int p0) {
        return this.multiParagraph.getLineLeft(p0);
    }

    public final float getLineRight(int p0) {
        return this.multiParagraph.getLineRight(p0);
    }

    public final int getLineForOffset(int p0) {
        return this.multiParagraph.getLineForOffset(p0);
    }

    public final int getLineForVerticalPosition(float p0) {
        return this.multiParagraph.getLineForVerticalPosition(p0);
    }

    public final float getHorizontalPosition(int p0, boolean p1) {
        return this.multiParagraph.getHorizontalPosition(p0, p1);
    }

    public final ResolvedTextDirection getParagraphDirection(int p0) {
        return this.multiParagraph.getParagraphDirection(p0);
    }

    public final ResolvedTextDirection getBidiRunDirection(int p0) {
        return this.multiParagraph.getBidiRunDirection(p0);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m6367getOffsetForPositionk4lQ0M(long p0) {
        return this.multiParagraph.m6238getOffsetForPositionk4lQ0M(p0);
    }

    public final Rect getBoundingBox(int p0) {
        return this.multiParagraph.getBoundingBox(p0);
    }

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m6369getWordBoundaryjx7JFs(int p0) {
        return this.multiParagraph.m6240getWordBoundaryjx7JFs(p0);
    }

    public final Rect getCursorRect(int p0) {
        return this.multiParagraph.getCursorRect(p0);
    }

    public final Path getPathForRange(int p0, int p1) {
        return this.multiParagraph.getPathForRange(p0, p1);
    }

    /* JADX INFO: renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m6365copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i & 2) != 0) {
            j = textLayoutResult.size;
        }
        return textLayoutResult.m6366copyO0kMr_c(textLayoutInput, j);
    }

    /* JADX INFO: renamed from: copy-O0kMr_c, reason: not valid java name */
    public final TextLayoutResult m6366copyO0kMr_c(TextLayoutInput p0, long p1) {
        return new TextLayoutResult(p0, this.multiParagraph, p1, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) p0;
        return Intrinsics.areEqual(this.layoutInput, textLayoutResult.layoutInput) && Intrinsics.areEqual(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.m7104equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && Intrinsics.areEqual(this.placeholderRects, textLayoutResult.placeholderRects);
    }

    public final int hashCode() {
        int iHashCode = this.layoutInput.hashCode();
        int iHashCode2 = this.multiParagraph.hashCode();
        int iM7107hashCodeimpl = IntSize.m7107hashCodeimpl(this.size);
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iM7107hashCodeimpl) * 31) + Float.hashCode(this.firstBaseline)) * 31) + Float.hashCode(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutResult(layoutInput=");
        sb.append(this.layoutInput);
        sb.append(", multiParagraph=");
        sb.append(this.multiParagraph);
        sb.append(", size=");
        sb.append((Object) IntSize.m7109toStringimpl(this.size));
        sb.append(", firstBaseline=");
        sb.append(this.firstBaseline);
        sb.append(", lastBaseline=");
        sb.append(this.lastBaseline);
        sb.append(", placeholderRects=");
        sb.append(this.placeholderRects);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(textLayoutInput, multiParagraph, j);
    }
}
