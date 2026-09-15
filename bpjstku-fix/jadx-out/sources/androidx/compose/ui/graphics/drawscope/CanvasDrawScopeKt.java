package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.InlineClassHelperKt;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawContext;", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "asDrawTransform", "(Landroidx/compose/ui/graphics/drawscope/DrawContext;)Landroidx/compose/ui/graphics/drawscope/DrawTransform;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CanvasDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform.1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
            public final long mo4724getSizeNHjbRc() {
                return drawContext.mo4719getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
            public final long mo4723getCenterF1C5BW0() {
                return SizeKt.m4053getCenteruvyYCjk(mo4724getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public final void inset(float p0, float p1, float p2, float p3) {
                Canvas canvas = drawContext.getCanvas();
                DrawContext drawContext2 = drawContext;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mo4724getSizeNHjbRc() >> 32));
                long jM4034constructorimpl = Size.m4034constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (mo4724getSizeNHjbRc() & 4294967295L)) - (p3 + p1))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - (p2 + p0))) << 32));
                if (Float.intBitsToFloat((int) (jM4034constructorimpl >> 32)) < 0.0f || Float.intBitsToFloat((int) (jM4034constructorimpl & 4294967295L)) < 0.0f) {
                    InlineClassHelperKt.throwIllegalArgumentException("Width and height must be greater than or equal to zero");
                }
                drawContext2.mo4720setSizeuvyYCjk(jM4034constructorimpl);
                canvas.translate(p0, p1);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: clipRect-N_I0leg, reason: not valid java name */
            public final void mo4722clipRectN_I0leg(float p0, float p1, float p2, float p3, int p4) {
                drawContext.getCanvas().mo4069clipRectN_I0leg(p0, p1, p2, p3, p4);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: clipPath-mtrdD-E, reason: not valid java name */
            public final void mo4721clipPathmtrdDE(Path p0, int p1) {
                drawContext.getCanvas().mo4068clipPathmtrdDE(p0, p1);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public final void translate(float p0, float p1) {
                drawContext.getCanvas().translate(p0, p1);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: rotate-Uv8p0NA, reason: not valid java name */
            public final void mo4725rotateUv8p0NA(float p0, long p1) {
                Canvas canvas = drawContext.getCanvas();
                int i = (int) (p1 >> 32);
                int i2 = (int) (p1 & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                canvas.rotate(p0);
                canvas.translate(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
            public final void mo4726scale0AR0LA0(float p0, float p1, long p2) {
                Canvas canvas = drawContext.getCanvas();
                int i = (int) (p2 >> 32);
                int i2 = (int) (p2 & 4294967295L);
                canvas.translate(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                canvas.scale(p0, p1);
                canvas.translate(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* JADX INFO: renamed from: transform-58bKbWc, reason: not valid java name */
            public final void mo4727transform58bKbWc(float[] p0) {
                drawContext.getCanvas().mo4070concat58bKbWc(p0);
            }
        };
    }
}
