package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrixFilterHelper;", "", "<init>", "()V", "Landroid/graphics/ColorMatrixColorFilter;", "p0", "Landroidx/compose/ui/graphics/ColorMatrix;", "getColorMatrix-8unuwjk", "(Landroid/graphics/ColorMatrixColorFilter;)[F", "getColorMatrix"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ColorMatrixFilterHelper {
    public static final ColorMatrixFilterHelper INSTANCE = new ColorMatrixFilterHelper();

    private ColorMatrixFilterHelper() {
    }

    /* JADX INFO: renamed from: getColorMatrix-8unuwjk, reason: not valid java name */
    public final float[] m4297getColorMatrix8unuwjk(android.graphics.ColorMatrixColorFilter p0) {
        android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
        p0.getColorMatrix(colorMatrix);
        return ColorMatrix.m4274constructorimpl(colorMatrix.getArray());
    }
}
