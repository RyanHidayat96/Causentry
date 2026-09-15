package defpackage;

import android.util.Log;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class createImageReaderProxy {
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault2<Object> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2<Object>() { // from class: createImageReaderProxy.5
        @Override // createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2
        public final void b(Object obj) {
        }
    };

    public interface TuitionPaymentFragmentbindingInflater1 {
        attach e_();
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> {
        T TuitionPaymentFragmentbindingInflater1();
    }

    public interface TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> {
        void b(T t);
    }

    public static <T extends TuitionPaymentFragmentbindingInflater1> Pools.Pool<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        return new b(new Pools.SynchronizedPool(i), tuitionPaymentFragmentspecialinlinedviewModeldefault1, TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    static final class b<T> implements Pools.Pool<T> {
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final Pools.Pool<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        b(Pools.Pool<T> pool, TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1, TuitionPaymentFragmentspecialinlinedviewModeldefault2<T> tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = pool;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // androidx.core.util.Pools.Pool
        public final T acquire() {
            T tAcquire = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.acquire();
            if (tAcquire == null) {
                tAcquire = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Objects.toString(tAcquire.getClass());
                }
            }
            if (tAcquire instanceof TuitionPaymentFragmentbindingInflater1) {
                ((TuitionPaymentFragmentbindingInflater1) tAcquire).e_().TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
            }
            return tAcquire;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.util.Pools.Pool
        public final boolean release(T t) {
            if (t instanceof TuitionPaymentFragmentbindingInflater1) {
                ((TuitionPaymentFragmentbindingInflater1) t).e_().TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(t);
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.release(t);
        }
    }

    public static <T> Pools.Pool<List<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return new b(new Pools.SynchronizedPool(20), new TuitionPaymentFragmentspecialinlinedviewModeldefault1<List<T>>() { // from class: createImageReaderProxy.4
            @Override // createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1
            public final /* synthetic */ Object TuitionPaymentFragmentbindingInflater1() {
                return new ArrayList();
            }
        }, new TuitionPaymentFragmentspecialinlinedviewModeldefault2<List<T>>() { // from class: createImageReaderProxy.3
            @Override // createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2
            public final /* synthetic */ void b(Object obj) {
                ((List) obj).clear();
            }
        });
    }
}
