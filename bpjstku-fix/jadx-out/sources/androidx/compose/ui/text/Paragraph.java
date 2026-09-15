package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0013\u0010\rJ\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u0015J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0016H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000bH&¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020$H&¢\u0006\u0004\b%\u0010&J'\u0010.\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020(2\u0006\u0010*\u001a\u00020)H&¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b/\u0010\nJ'\u00104\u001a\u0002012\u0006\u0010\u0003\u001a\u00020+2\u0006\u0010\u0004\u001a\u0002002\u0006\u0010*\u001a\u00020\u0002H&¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b5\u00106J9\u0010?\u001a\u0002012\u0006\u0010\u0003\u001a\u0002082\b\b\u0002\u0010\u0004\u001a\u0002092\n\b\u0002\u0010*\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;H&¢\u0006\u0004\b=\u0010>JO\u0010?\u001a\u0002012\u0006\u0010\u0003\u001a\u0002082\b\b\u0002\u0010\u0004\u001a\u0002092\n\b\u0002\u0010*\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010C\u001a\u00020BH&¢\u0006\u0004\bD\u0010EJW\u0010?\u001a\u0002012\u0006\u0010\u0003\u001a\u0002082\u0006\u0010\u0004\u001a\u00020F2\b\b\u0002\u0010*\u001a\u00020\u000b2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010G\u001a\u00020BH&¢\u0006\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0014\u0010P\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010KR\u0014\u0010R\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010KR\u0014\u0010T\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010KR\u0014\u0010V\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010KR\u0014\u0010Y\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001c\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0]8'X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\u0082\u0001\u0001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/Paragraph;", "", "", "p0", "p1", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/geometry/Rect;", "getCursorRect", "(I)Landroidx/compose/ui/geometry/Rect;", "", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBaseline", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "(I)I", "", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "getLineForOffset", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/text/TextGranularity;", "Landroidx/compose/ui/text/TextInclusionStrategy;", "p2", "Landroidx/compose/ui/text/TextRange;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForRect", "getBoundingBox", "", "", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "fillBoundingBoxes", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "Landroidx/compose/ui/graphics/Canvas;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/ui/graphics/Shadow;", "Landroidx/compose/ui/text/style/TextDecoration;", "p3", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "p4", "Landroidx/compose/ui/graphics/BlendMode;", "p5", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "p6", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "getWidth", "()F", "width", "getHeight", "height", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getDidExceedMaxLines", "()Z", "didExceedMaxLines", "getLineCount", "()I", "lineCount", "", "getPlaceholderRects", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/text/AndroidParagraph;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Paragraph {
    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q */
    void mo6188fillBoundingBoxes8ffj60Q(long p0, float[] p1, int p2);

    ResolvedTextDirection getBidiRunDirection(int p0);

    Rect getBoundingBox(int p0);

    Rect getCursorRect(int p0);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int p0, boolean p1);

    float getLastBaseline();

    float getLineBaseline(int p0);

    float getLineBottom(int p0);

    int getLineCount();

    int getLineEnd(int p0, boolean p1);

    int getLineForOffset(int p0);

    int getLineForVerticalPosition(float p0);

    float getLineHeight(int p0);

    float getLineLeft(int p0);

    float getLineRight(int p0);

    int getLineStart(int p0);

    float getLineTop(int p0);

    float getLineWidth(int p0);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M */
    int mo6190getOffsetForPositionk4lQ0M(long p0);

    ResolvedTextDirection getParagraphDirection(int p0);

    Path getPathForRange(int p0, int p1);

    List<Rect> getPlaceholderRects();

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI */
    long mo6192getRangeForRect86BmAI(Rect p0, int p1, TextInclusionStrategy p2);

    float getWidth();

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs */
    long mo6193getWordBoundaryjx7JFs(int p0);

    boolean isLineEllipsized(int p0);

    /* JADX INFO: renamed from: paint-LG529CI */
    void mo6194paintLG529CI(Canvas p0, long p1, Shadow p2, TextDecoration p3, DrawStyle p4, int p5);

    /* JADX INFO: renamed from: paint-RPmYEkk */
    void mo6195paintRPmYEkk(Canvas p0, long p1, Shadow p2, TextDecoration p3);

    /* JADX INFO: renamed from: paint-hn5TExg */
    void mo6196painthn5TExg(Canvas p0, Brush p1, float p2, Shadow p3, TextDecoration p4, DrawStyle p5, int p6);

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ int getLineEnd$default(Paragraph paragraph, int i, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return paragraph.getLineEnd(i, z);
    }

    /* JADX INFO: renamed from: paint-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m6246paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
        paragraph.mo6194paintLG529CI(canvas, (i2 & 2) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j, (i2 & 4) != 0 ? null : shadow, (i2 & 8) != 0 ? null : textDecoration, (i2 & 16) == 0 ? drawStyle : null, (i2 & 32) != 0 ? DrawScope.INSTANCE.m4800getDefaultBlendMode0nO6VwU() : i);
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m6247paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
        }
        if ((i & 2) != 0) {
            j = Color.INSTANCE.m4254getUnspecified0d7_KjU();
        }
        paragraph.mo6195paintRPmYEkk(canvas, j, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
    }

    /* JADX INFO: renamed from: paint-hn5TExg$default, reason: not valid java name */
    static /* synthetic */ void m6248painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
        paragraph.mo6196painthn5TExg(canvas, brush, (i2 & 4) != 0 ? Float.NaN : f, (i2 & 8) != 0 ? null : shadow, (i2 & 16) != 0 ? null : textDecoration, (i2 & 32) != 0 ? null : drawStyle, (i2 & 64) != 0 ? DrawScope.INSTANCE.m4800getDefaultBlendMode0nO6VwU() : i);
    }
}
