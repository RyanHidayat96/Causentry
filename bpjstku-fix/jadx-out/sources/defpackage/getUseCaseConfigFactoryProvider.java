package defpackage;

import androidx.core.util.Pools;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getUseCaseConfigFactoryProvider {
    public final setCameraExecutor TuitionPaymentFragmentbindingInflater1;
    public final b b;

    public getUseCaseConfigFactoryProvider(Pools.Pool<List<Throwable>> pool) {
        this(new setCameraExecutor(pool));
    }

    private getUseCaseConfigFactoryProvider(setCameraExecutor setcameraexecutor) {
        this.b = new b();
        this.TuitionPaymentFragmentbindingInflater1 = setcameraexecutor;
    }

    public final List<Class<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(Class<?> cls) {
        List<Class<?>> listB;
        synchronized (this) {
            listB = this.TuitionPaymentFragmentbindingInflater1.b(cls);
        }
        return listB;
    }

    public final <A> List<getSchedulerHandler<A, ?>> TuitionPaymentFragmentbindingInflater1(Class<A> cls) {
        List<getSchedulerHandler<?, ?>> list;
        synchronized (this) {
            b.TuitionPaymentFragmentspecialinlinedviewModeldefault3<?> tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(cls);
            list = tuitionPaymentFragmentspecialinlinedviewModeldefault3 == null ? (List<getSchedulerHandler<A, ?>>) null : tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (list == null) {
                list = (List<getSchedulerHandler<A, ?>>) Collections.unmodifiableList(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cls));
                if (this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.put(cls, new b.TuitionPaymentFragmentspecialinlinedviewModeldefault3<>(list)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(cls)));
                }
            }
        }
        return (List<getSchedulerHandler<A, ?>>) list;
    }

    public static class b {
        public final Map<Class<?>, TuitionPaymentFragmentspecialinlinedviewModeldefault3<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashMap();

        b() {
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            createSRational.TuitionPaymentFragmentbindingInflater1[0] = ExifAttribute.TuitionPaymentFragmentbindingInflater1[0];
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static class TuitionPaymentFragmentspecialinlinedviewModeldefault3<Model> {
            final List<getSchedulerHandler<Model, ?>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            public TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<getSchedulerHandler<Model, ?>> list) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
            }
        }
    }
}
