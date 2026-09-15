package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class setCameraExecutor {
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    private static final getSchedulerHandler<Object, Object> b = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    private final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentbindingInflater1;
    private final List<b<?, ?>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Set<b<?, ?>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Pools.Pool<List<Throwable>> asBinder;

    public setCameraExecutor(Pools.Pool<List<Throwable>> pool) {
        this(pool, TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private setCameraExecutor(Pools.Pool<List<Throwable>> pool, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new HashSet();
        this.asBinder = pool;
        this.TuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public final <Model, Data> void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Class<Model> cls, Class<Data> cls2, getDeviceSurfaceManagerProvider<? extends Model, ? extends Data> getdevicesurfacemanagerprovider, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, getdevicesurfacemanagerprovider);
        List<b<?, ?>> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        list.add(z ? list.size() : 0, bVar);
    }

    final <Model> List<getSchedulerHandler<Model, ?>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<Model> cls) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                for (b<?, ?> bVar : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.contains(bVar) && bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isAssignableFrom(cls)) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(bVar);
                        arrayList.add(TuitionPaymentFragmentspecialinlinedviewModeldefault1(bVar));
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove(bVar);
                    }
                }
            } catch (Throwable th) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
                throw th;
            }
        }
        return arrayList;
    }

    final List<Class<?>> b(Class<?> cls) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                if (!arrayList.contains(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isAssignableFrom(cls)) {
                    arrayList.add(bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }
        }
        return arrayList;
    }

    public final <Model, Data> getSchedulerHandler<Model, Data> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<Model> cls, Class<Data> cls2) {
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (b<?, ?> bVar : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.contains(bVar)) {
                        z = true;
                    } else if (bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isAssignableFrom(cls) && bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isAssignableFrom(cls2)) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.add(bVar);
                        arrayList.add(TuitionPaymentFragmentspecialinlinedviewModeldefault1(bVar));
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.remove(bVar);
                    }
                }
                if (arrayList.size() <= 1) {
                    if (arrayList.size() == 1) {
                        return (getSchedulerHandler) arrayList.get(0);
                    }
                    if (!z) {
                        throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
                    }
                    return (getSchedulerHandler<Model, Data>) b;
                }
                return new CameraXConfigBuilder(arrayList, this.asBinder);
            } catch (Throwable th) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
                throw th;
            }
        }
    }

    private <Model, Data> getSchedulerHandler<Model, Data> TuitionPaymentFragmentspecialinlinedviewModeldefault1(b<?, ?> bVar) {
        getSchedulerHandler getschedulerhandlerTuitionPaymentFragmentspecialinlinedviewModeldefault3 = bVar.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        if (getschedulerhandlerTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
            return getschedulerhandlerTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        throw new NullPointerException("Argument must not be null");
    }

    static class b<Model, Data> {
        final Class<Model> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final Class<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final getDeviceSurfaceManagerProvider<? extends Model, ? extends Data> b;

        public b(Class<Model> cls, Class<Data> cls2, getDeviceSurfaceManagerProvider<? extends Model, ? extends Data> getdevicesurfacemanagerprovider) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cls;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cls2;
            this.b = getdevicesurfacemanagerprovider;
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getSchedulerHandler<Object, Object> {
        @Override // defpackage.getSchedulerHandler
        public final getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<Object> TuitionPaymentFragmentbindingInflater1(Object obj, int i, int i2, getTargetRotation gettargetrotation) {
            return null;
        }

        @Override // defpackage.getSchedulerHandler
        public final boolean TuitionPaymentFragmentbindingInflater1(Object obj) {
            return false;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }
    }
}
