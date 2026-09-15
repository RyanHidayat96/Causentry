package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setTargetRotation {
    public final List<TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>> b = new ArrayList();

    public final <T> getSensorToBufferTransform<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<T> cls) {
        synchronized (this) {
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault1<?> tuitionPaymentFragmentspecialinlinedviewModeldefault1 : this.b) {
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isAssignableFrom(cls)) {
                    return (getSensorToBufferTransform<T>) tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                }
            }
            return null;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> {
        final getSensorToBufferTransform<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Class<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(Class<T> cls, getSensorToBufferTransform<T> getsensortobuffertransform) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cls;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getsensortobuffertransform;
        }
    }
}
