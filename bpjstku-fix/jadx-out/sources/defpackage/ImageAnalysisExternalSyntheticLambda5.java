package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageAnalysisExternalSyntheticLambda5 {
    public final List<TuitionPaymentFragmentspecialinlinedviewModeldefault2<?>> TuitionPaymentFragmentbindingInflater1 = new ArrayList();

    public final <Z> CameraEffect<Z> b(Class<Z> cls) {
        synchronized (this) {
            int size = this.TuitionPaymentFragmentbindingInflater1.size();
            for (int i = 0; i < size; i++) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2<?> tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentbindingInflater1.get(i);
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.isAssignableFrom(cls)) {
                    return (CameraEffect<Z>) tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                }
            }
            return null;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> {
        final Class<T> TuitionPaymentFragmentbindingInflater1;
        final CameraEffect<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<T> cls, CameraEffect<T> cameraEffect) {
            this.TuitionPaymentFragmentbindingInflater1 = cls;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraEffect;
        }
    }
}
