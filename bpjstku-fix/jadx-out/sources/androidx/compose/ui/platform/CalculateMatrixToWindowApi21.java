package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\u0011\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/ui/platform/CalculateMatrixToWindowApi21;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "Landroidx/compose/ui/graphics/Matrix;", "p0", "<init>", "([FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/view/View;", "p1", "", "calculateMatrixToWindow-EL8BTi8", "(Landroid/view/View;[F)V", "calculateMatrixToWindow", "transformMatrixToWindow-EL8BTi8", "transformMatrixToWindow", "Landroid/graphics/Matrix;", "preConcat-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "preConcat", "", "preTranslate-3XD1CNM", "([FFF)V", "preTranslate", "tmpMatrix", "[F", "", "tmpLocation", "[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* JADX INFO: renamed from: calculateMatrixToWindow-EL8BTi8 */
    public final void mo6052calculateMatrixToWindowEL8BTi8(View p0, float[] p1) {
        Matrix.m4470resetimpl(p1);
        m6055transformMatrixToWindowEL8BTi8(p0, p1);
    }

    /* JADX INFO: renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m6055transformMatrixToWindowEL8BTi8(View p0, float[] p1) {
        Object parent = p0.getParent();
        if (parent instanceof View) {
            m6055transformMatrixToWindowEL8BTi8((View) parent, p1);
            m6054preTranslate3XD1CNM(p1, -p0.getScrollX(), -p0.getScrollY());
            m6054preTranslate3XD1CNM(p1, p0.getLeft(), p0.getTop());
        } else {
            int[] iArr = this.tmpLocation;
            p0.getLocationInWindow(iArr);
            m6054preTranslate3XD1CNM(p1, -p0.getScrollX(), -p0.getScrollY());
            m6054preTranslate3XD1CNM(p1, iArr[0], iArr[1]);
        }
        android.graphics.Matrix matrix = p0.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m6053preConcattUYjHk(p1, matrix);
    }

    /* JADX INFO: renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m6053preConcattUYjHk(float[] fArr, android.graphics.Matrix matrix) {
        AndroidMatrixConversions_androidKt.m4087setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m6050preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* JADX INFO: renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m6054preTranslate3XD1CNM(float[] fArr, float f, float f2) {
        AndroidComposeView_androidKt.m6051preTranslatecG2Xzmc(fArr, f, f2, this.tmpMatrix);
    }

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(fArr);
    }
}
