package androidx.FastestIyy;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f261a;
    public final float b;
    public final float c;
    public final float d;

    public G(ArrayList arrayList) {
        float f = 0.0f;
        this.f261a = 0.0f;
        this.b = 0.0f;
        this.c = Float.MAX_VALUE;
        this.d = -3.4028235E38f;
        Float[] fArr = (Float[]) arrayList.toArray(new Float[0]);
        int length = fArr.length;
        Arrays.sort(fArr);
        for (Float f2 : fArr) {
            float fFloatValue = f2.floatValue();
            f += fFloatValue;
            this.c = Float.min(this.c, fFloatValue);
            this.d = Float.max(this.d, fFloatValue);
        }
        this.b = f / length;
        int i = length / 2;
        if (length % 2 == 0) {
            Float f3 = fArr[i];
            Float f4 = fArr[i - 1];
        } else {
            Float f5 = fArr[i];
        }
        this.f261a = this.d - this.c;
    }
}
