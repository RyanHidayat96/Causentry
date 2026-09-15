package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.util.Size;

/* JADX INFO: loaded from: classes5.dex */
public final class OutputTransform {
    final Matrix mMatrix;
    final Size mViewPortSize;

    public OutputTransform(Matrix matrix, Size size) {
        this.mMatrix = matrix;
        this.mViewPortSize = size;
    }

    public final Matrix getMatrix() {
        return this.mMatrix;
    }

    final Size getViewPortSize() {
        return this.mViewPortSize;
    }
}
