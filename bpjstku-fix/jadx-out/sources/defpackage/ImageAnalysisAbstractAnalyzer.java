package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageAnalysisAbstractAnalyzer {
    public Class<?> TuitionPaymentFragmentbindingInflater1;
    public Class<?> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public Class<?> b;

    public ImageAnalysisAbstractAnalyzer() {
    }

    public ImageAnalysisAbstractAnalyzer(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cls;
        this.b = cls2;
        this.TuitionPaymentFragmentbindingInflater1 = cls3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiClassKey{first=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(", second=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = (ImageAnalysisAbstractAnalyzer) obj;
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(imageAnalysisAbstractAnalyzer.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && this.b.equals(imageAnalysisAbstractAnalyzer.b) && getUpdatedCropRect.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, imageAnalysisAbstractAnalyzer.TuitionPaymentFragmentbindingInflater1);
    }

    public final int hashCode() {
        int iHashCode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        int iHashCode2 = this.b.hashCode();
        Class<?> cls = this.TuitionPaymentFragmentbindingInflater1;
        return (((iHashCode * 31) + iHashCode2) * 31) + (cls != null ? cls.hashCode() : 0);
    }
}
