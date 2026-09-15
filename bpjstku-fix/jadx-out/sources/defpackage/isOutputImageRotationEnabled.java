package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class isOutputImageRotationEnabled {
    public final Set<ImageAnalysisBuilder> TuitionPaymentFragmentbindingInflater1 = Collections.newSetFromMap(new WeakHashMap());
    public final Set<ImageAnalysisBuilder> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new HashSet();
    public boolean b;

    public final boolean TuitionPaymentFragmentbindingInflater1(ImageAnalysisBuilder imageAnalysisBuilder) {
        boolean z = true;
        if (imageAnalysisBuilder == null) {
            return true;
        }
        boolean zRemove = this.TuitionPaymentFragmentbindingInflater1.remove(imageAnalysisBuilder);
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.remove(imageAnalysisBuilder) && !zRemove) {
            z = false;
        }
        if (z) {
            imageAnalysisBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1.size());
        sb.append(", isPaused=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
