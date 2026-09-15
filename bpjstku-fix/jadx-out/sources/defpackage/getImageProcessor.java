package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getImageProcessor {
    private static final getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?> TuitionPaymentFragmentbindingInflater1 = new getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Object>() { // from class: getImageProcessor.2
        @Override // getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final getOutputOption<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) {
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj);
        }

        @Override // getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final Class<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };
    public final Map<Class<?>, getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashMap();

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getOutputOption<Object> {
        private final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.getOutputOption
        public final void TuitionPaymentFragmentbindingInflater1() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = obj;
        }

        @Override // defpackage.getOutputOption
        public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }

    public final <T> getOutputOption<T> b(T t) {
        getOutputOption<T> getoutputoption;
        synchronized (this) {
            try {
                if (t != null) {
                    getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?> tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(t.getClass());
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        for (getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<?> tuitionPaymentFragmentspecialinlinedviewModeldefault2 : this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.values()) {
                            if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2().isAssignableFrom(t.getClass())) {
                                tuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                break;
                            }
                        }
                    }
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentbindingInflater1;
                    }
                    getoutputoption = (getOutputOption<T>) tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(t);
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return getoutputoption;
    }
}
