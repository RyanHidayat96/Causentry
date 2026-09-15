package androidx.graphics.path;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0014\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/graphics/path/ConicConverter;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "", "p3", "", "convert", "([FFFI)V", "p4", "internalConicToQuadratics", "([FI[FFF)I", "", "nextQuadratic", "([FI)Z", "currentQuadratic", "I", "getCurrentQuadratic", "()I", "setCurrentQuadratic", "(I)V", "quadraticCount", "getQuadraticCount", "quadraticData", "[F"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConicConverter {
    private int currentQuadratic;
    private int quadraticCount;
    private float[] quadraticData = new float[130];

    private final native int internalConicToQuadratics(float[] p0, int p1, float[] p2, float p3, float p4);

    public final int getQuadraticCount() {
        return this.quadraticCount;
    }

    public final int getCurrentQuadratic() {
        return this.currentQuadratic;
    }

    public final void setCurrentQuadratic(int i) {
        this.currentQuadratic = i;
    }

    public static /* synthetic */ boolean nextQuadratic$default(ConicConverter conicConverter, float[] fArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return conicConverter.nextQuadratic(fArr, i);
    }

    public final boolean nextQuadratic(float[] p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        int i = this.currentQuadratic;
        if (i >= this.quadraticCount) {
            return false;
        }
        int i2 = i * 4;
        float[] fArr = this.quadraticData;
        p0[p1] = fArr[i2];
        p0[p1 + 1] = fArr[i2 + 1];
        p0[p1 + 2] = fArr[i2 + 2];
        p0[p1 + 3] = fArr[i2 + 3];
        p0[p1 + 4] = fArr[i2 + 4];
        p0[p1 + 5] = fArr[i2 + 5];
        this.currentQuadratic = i + 1;
        return true;
    }

    public static /* synthetic */ void convert$default(ConicConverter conicConverter, float[] fArr, float f, float f2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        conicConverter.convert(fArr, f, f2, i);
    }

    public final void convert(float[] p0, float p1, float p2, int p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        int iInternalConicToQuadratics = internalConicToQuadratics(p0, p3, this.quadraticData, p1, p2);
        this.quadraticCount = iInternalConicToQuadratics;
        int i = (iInternalConicToQuadratics * 4) + 2;
        if (i > this.quadraticData.length) {
            float[] fArr = new float[i];
            this.quadraticData = fArr;
            this.quadraticCount = internalConicToQuadratics(p0, p3, fArr, p1, p2);
        }
        this.currentQuadratic = 0;
    }
}
