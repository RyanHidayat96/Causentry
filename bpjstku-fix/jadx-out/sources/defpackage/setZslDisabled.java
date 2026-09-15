package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class setZslDisabled {

    public interface b<T> {
        T TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: setZslDisabled$3, reason: invalid class name */
    public class AnonymousClass3<T> implements b<T> {
        private volatile T TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ b TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        public AnonymousClass3(b bVar) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar;
        }

        @Override // setZslDisabled.b
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                synchronized (this) {
                    if (this.TuitionPaymentFragmentbindingInflater1 == null) {
                        T t = (T) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        if (t != null) {
                            this.TuitionPaymentFragmentbindingInflater1 = t;
                        } else {
                            throw new NullPointerException("Argument must not be null");
                        }
                    }
                }
            }
            return this.TuitionPaymentFragmentbindingInflater1;
        }
    }
}
