package androidx.compose.ui.text.platform;

import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0018\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u001e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R(\u0010)\u001a\u00020\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0004\b)\u0010*\u0012\u0004\b.\u0010\u001d\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u000eR\u0018\u0010/\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u00101\u001a\u0004\u0018\u00010\u00138\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u0010\u001d\u001a\u0004\b3\u00104\"\u0004\b5\u00106R2\u0010;\u001a\u0012\u0012\f\u0012\n\u0018\u000109j\u0004\u0018\u0001`:\u0018\u0001088\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010A\u001a\u0004\u0018\u00010\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0018\n\u0004\bA\u0010B\u0012\u0004\bG\u0010\u001d\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010IR$\u0010N\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020&8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "", "p0", "", "p1", "<init>", "(IF)V", "Landroidx/compose/ui/text/style/TextDecoration;", "", "setTextDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "Landroidx/compose/ui/graphics/Shadow;", "setShadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "Landroidx/compose/ui/graphics/Color;", "setColor-8_81llA", "(J)V", "setColor", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/geometry/Size;", "p2", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setBrush", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "setDrawStyle", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "clearShader", "()V", "Landroidx/compose/ui/graphics/Paint;", "backingComposePaint", "Landroidx/compose/ui/graphics/Paint;", "getComposePaint", "()Landroidx/compose/ui/graphics/Paint;", "composePaint", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/BlendMode;", "backingBlendMode", "I", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text", "getShadow$ui_text$annotations", "lastColor", "Landroidx/compose/ui/graphics/Color;", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush$ui_text", "()Landroidx/compose/ui/graphics/Brush;", "setBrush$ui_text", "(Landroidx/compose/ui/graphics/Brush;)V", "getBrush$ui_text$annotations", "Landroidx/compose/runtime/State;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "shaderState", "Landroidx/compose/runtime/State;", "getShaderState$ui_text", "()Landroidx/compose/runtime/State;", "setShaderState$ui_text", "(Landroidx/compose/runtime/State;)V", "brushSize", "Landroidx/compose/ui/geometry/Size;", "getBrushSize-VsRJwc0$ui_text", "()Landroidx/compose/ui/geometry/Size;", "setBrushSize-iaC8Vc4$ui_text", "(Landroidx/compose/ui/geometry/Size;)V", "getBrushSize-VsRJwc0$ui_text$annotations", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    private int backingBlendMode;
    private Paint backingComposePaint;
    private Brush brush;
    private Size brushSize;
    private DrawStyle drawStyle;
    private Color lastColor;
    private State<? extends Shader> shaderState;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public static /* synthetic */ void getBrush$ui_text$annotations() {
    }

    /* JADX INFO: renamed from: getBrushSize-VsRJwc0$ui_text$annotations, reason: not valid java name */
    public static /* synthetic */ void m6662getBrushSizeVsRJwc0$ui_text$annotations() {
    }

    public static /* synthetic */ void getShadow$ui_text$annotations() {
    }

    public AndroidTextPaint(int i, float f) {
        super(i);
        ((TextPaint) this).density = f;
        this.textDecoration = TextDecoration.INSTANCE.getNone();
        this.backingBlendMode = DrawScope.INSTANCE.m4800getDefaultBlendMode0nO6VwU();
        this.shadow = Shadow.INSTANCE.getNone();
    }

    private final Paint getComposePaint() {
        Paint paint = this.backingComposePaint;
        if (paint != null) {
            return paint;
        }
        Paint paintAsComposePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.backingComposePaint = paintAsComposePaint;
        return paintAsComposePaint;
    }

    /* JADX INFO: renamed from: getShadow$ui_text, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    public final void setShadow$ui_text(Shadow shadow) {
        this.shadow = shadow;
    }

    /* JADX INFO: renamed from: getBrush$ui_text, reason: from getter */
    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush$ui_text(Brush brush) {
        this.brush = brush;
    }

    public final State<Shader> getShaderState$ui_text() {
        return this.shaderState;
    }

    public final void setShaderState$ui_text(State<? extends Shader> state) {
        this.shaderState = state;
    }

    /* JADX INFO: renamed from: getBrushSize-VsRJwc0$ui_text, reason: not valid java name and from getter */
    public final Size getBrushSize() {
        return this.brushSize;
    }

    /* JADX INFO: renamed from: setBrushSize-iaC8Vc4$ui_text, reason: not valid java name */
    public final void m6668setBrushSizeiaC8Vc4$ui_text(Size size) {
        this.brushSize = size;
    }

    public final void setTextDecoration(TextDecoration p0) {
        if (p0 == null || Intrinsics.areEqual(this.textDecoration, p0)) {
            return;
        }
        this.textDecoration = p0;
        setUnderlineText(p0.contains(TextDecoration.INSTANCE.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(TextDecoration.INSTANCE.getLineThrough()));
    }

    public final void setShadow(Shadow p0) {
        if (p0 == null || Intrinsics.areEqual(this.shadow, p0)) {
            return;
        }
        this.shadow = p0;
        if (Intrinsics.areEqual(p0, Shadow.INSTANCE.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Float.intBitsToFloat((int) (this.shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (this.shadow.getOffset() & 4294967295L)), ColorKt.m4272toArgb8_81llA(this.shadow.getColor()));
        }
    }

    /* JADX INFO: renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m6669setColor8_81llA(long p0) {
        Color color = this.lastColor;
        if ((color != null && Color.m4219equalsimpl0(color.m4228unboximpl(), p0)) || p0 == 16) {
            return;
        }
        this.lastColor = Color.m4208boximpl(p0);
        setColor(ColorKt.m4272toArgb8_81llA(p0));
        clearShader();
    }

    /* JADX INFO: renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m6663setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        androidTextPaint.m6667setBrush12SF9DM(brush, j, f);
    }

    /* JADX INFO: renamed from: setBrush-12SF9DM, reason: not valid java name */
    public final void m6667setBrush12SF9DM(final Brush p0, final long p1, float p2) {
        Size size;
        if (p0 == null) {
            clearShader();
            return;
        }
        if (p0 instanceof SolidColor) {
            m6669setColor8_81llA(TextDrawStyleKt.m6839modulateDxMtmZc(((SolidColor) p0).getValue(), p2));
            return;
        }
        if (!(p0 instanceof ShaderBrush)) {
            throw new NoWhenBranchMatchedException();
        }
        if ((!Intrinsics.areEqual(this.brush, p0) || (size = this.brushSize) == null || !Size.m4039equalsimpl0(size.m4048unboximpl(), p1)) && p1 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.brush = p0;
            this.brushSize = Size.m4031boximpl(p1);
            this.shaderState = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.ui.text.platform.AndroidTextPaint$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AndroidTextPaint.setBrush_12SF9DM$lambda$1(p0, p1);
                }
            });
        }
        Paint composePaint = getComposePaint();
        State<? extends Shader> state = this.shaderState;
        composePaint.setShader(state != null ? state.getValue() : null);
        this.lastColor = null;
        AndroidTextPaint_androidKt.setAlpha(this, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader setBrush_12SF9DM$lambda$1(Brush brush, long j) {
        return ((ShaderBrush) brush).mo4187createShaderuvyYCjk(j);
    }

    public final void setDrawStyle(DrawStyle p0) {
        if (p0 == null || Intrinsics.areEqual(this.drawStyle, p0)) {
            return;
        }
        this.drawStyle = p0;
        if (Intrinsics.areEqual(p0, Fill.INSTANCE)) {
            setStyle(android.graphics.Paint.Style.FILL);
            return;
        }
        if (!(p0 instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        getComposePaint().mo4099setStylek9PVt8s(PaintingStyle.INSTANCE.m4499getStrokeTiuSbCo());
        Stroke stroke = (Stroke) p0;
        getComposePaint().setStrokeWidth(stroke.getWidth());
        getComposePaint().setStrokeMiterLimit(stroke.getMiter());
        getComposePaint().mo4098setStrokeJoinWw9F2mQ(stroke.getJoin());
        getComposePaint().mo4097setStrokeCapBeK7IIE(stroke.getCap());
        getComposePaint().setPathEffect(stroke.getPathEffect());
    }

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public final int getBackingBlendMode() {
        return this.backingBlendMode;
    }

    /* JADX INFO: renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m6666setBlendModes9anfk8(int i) {
        if (BlendMode.m4128equalsimpl0(i, this.backingBlendMode)) {
            return;
        }
        getComposePaint().mo4094setBlendModes9anfk8(i);
        this.backingBlendMode = i;
    }

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }
}
