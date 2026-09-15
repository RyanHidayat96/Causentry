package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.MatrixKt;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\"\u0010\u0007\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u001d\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001aR0\u0010\u001c\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0004\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0004\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010(\u001a\u00020#8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010%"}, d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Landroid/graphics/Matrix;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "reset", "()V", "invalidate", "Landroidx/compose/ui/graphics/Matrix;", "calculateMatrix-GrdbGEg", "(Ljava/lang/Object;)[F", "calculateMatrix", "calculateInverseMatrix-bWbORWo", "calculateInverseMatrix", "Landroidx/compose/ui/geometry/MutableRect;", "p1", "map", "(Ljava/lang/Object;Landroidx/compose/ui/geometry/MutableRect;)V", "mapInverse", "Landroidx/compose/ui/geometry/Offset;", "map-R5De75A", "(Ljava/lang/Object;J)J", "mapInverse-R5De75A", "getMatrix", "Lkotlin/jvm/functions/Function2;", "androidMatrixCache", "Landroid/graphics/Matrix;", "matrixCache", "[F", "inverseMatrixCache", "", "isDirty", "Z", "isInverseDirty", "isInverseValid", "isIdentity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;
    private Matrix androidMatrixCache;
    private final Function2<T, Matrix, Unit> getMatrix;
    private boolean isDirty;
    private boolean isInverseDirty;
    private float[] matrixCache = androidx.compose.ui.graphics.Matrix.m4461constructorimpl$default(null, 1, null);
    private float[] inverseMatrixCache = androidx.compose.ui.graphics.Matrix.m4461constructorimpl$default(null, 1, null);
    private boolean isInverseValid = true;
    private boolean isIdentity = true;

    /* JADX WARN: Multi-variable type inference failed */
    public LayerMatrixCache(Function2<? super T, ? super Matrix, Unit> function2) {
        this.getMatrix = function2;
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.ui.graphics.Matrix.m4470resetimpl(this.matrixCache);
        androidx.compose.ui.graphics.Matrix.m4470resetimpl(this.inverseMatrixCache);
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    /* JADX INFO: renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m6087calculateMatrixGrdbGEg(T p0) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(p0, matrix);
        AndroidMatrixConversions_androidKt.m4087setFromtUYjHk(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = MatrixKt.m4486isIdentity58bKbWc(fArr);
        return fArr;
    }

    /* JADX INFO: renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m6086calculateInverseMatrixbWbORWo(T p0) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m6084invertToJiSxe2E(m6087calculateMatrixGrdbGEg(p0), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    public final void map(T p0, MutableRect p1) {
        float[] fArrM6087calculateMatrixGrdbGEg = m6087calculateMatrixGrdbGEg(p0);
        if (this.isIdentity) {
            return;
        }
        androidx.compose.ui.graphics.Matrix.m4469mapimpl(fArrM6087calculateMatrixGrdbGEg, p1);
    }

    public final void mapInverse(T p0, MutableRect p1) {
        float[] fArrM6086calculateInverseMatrixbWbORWo = m6086calculateInverseMatrixbWbORWo(p0);
        if (fArrM6086calculateInverseMatrixbWbORWo == null) {
            p1.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.isIdentity) {
                return;
            }
            androidx.compose.ui.graphics.Matrix.m4469mapimpl(fArrM6086calculateInverseMatrixbWbORWo, p1);
        }
    }

    /* JADX INFO: renamed from: map-R5De75A, reason: not valid java name */
    public final long m6088mapR5De75A(T p0, long p1) {
        return !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m4467mapMKHz9U(m6087calculateMatrixGrdbGEg(p0), p1) : p1;
    }

    /* JADX INFO: renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m6089mapInverseR5De75A(T p0, long p1) {
        float[] fArrM6086calculateInverseMatrixbWbORWo = m6086calculateInverseMatrixbWbORWo(p0);
        if (fArrM6086calculateInverseMatrixbWbORWo == null) {
            return Offset.INSTANCE.m3988getInfiniteF1C5BW0();
        }
        return !this.isIdentity ? androidx.compose.ui.graphics.Matrix.m4467mapMKHz9U(fArrM6086calculateInverseMatrixbWbORWo, p1) : p1;
    }
}
