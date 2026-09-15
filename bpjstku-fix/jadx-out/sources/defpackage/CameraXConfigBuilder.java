package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class CameraXConfigBuilder<Model, Data> implements getSchedulerHandler<Model, Data> {
    private final Pools.Pool<List<Throwable>> TuitionPaymentFragmentbindingInflater1;
    private final List<getSchedulerHandler<Model, Data>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    CameraXConfigBuilder(List<getSchedulerHandler<Model, Data>> list, Pools.Pool<List<Throwable>> pool) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = list;
        this.TuitionPaymentFragmentbindingInflater1 = pool;
    }

    @Override // defpackage.getSchedulerHandler
    public final getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<Data> TuitionPaymentFragmentbindingInflater1(Model model, int i, int i2, getTargetRotation gettargetrotation) {
        getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<Data> TuitionPaymentFragmentbindingInflater1;
        int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.size();
        ArrayList arrayList = new ArrayList(size);
        getCameraControl getcameracontrol = null;
        for (int i3 = 0; i3 < size; i3++) {
            getSchedulerHandler<Model, Data> getschedulerhandler = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i3);
            if (getschedulerhandler.TuitionPaymentFragmentbindingInflater1(model) && (TuitionPaymentFragmentbindingInflater1 = getschedulerhandler.TuitionPaymentFragmentbindingInflater1(model, i, i2, gettargetrotation)) != null) {
                getcameracontrol = TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                arrayList.add(TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }
        if (arrayList.isEmpty() || getcameracontrol == null) {
            return null;
        }
        return new getSchedulerHandler.TuitionPaymentFragmentbindingInflater1<>(getcameracontrol, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList, this.TuitionPaymentFragmentbindingInflater1));
    }

    @Override // defpackage.getSchedulerHandler
    public final boolean TuitionPaymentFragmentbindingInflater1(Model model) {
        Iterator<getSchedulerHandler<Model, Data>> it = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
        while (it.hasNext()) {
            if (it.next().TuitionPaymentFragmentbindingInflater1(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiModelLoader{modelLoaders=");
        sb.append(Arrays.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.toArray()));
        sb.append('}');
        return sb.toString();
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1<Data> implements isUseCasesCombinationSupportedByFramework<Data>, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<Data> {
        private final List<isUseCasesCombinationSupportedByFramework<Data>> TuitionPaymentFragmentbindingInflater1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super Data> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private Priority asInterface;
        private List<Throwable> b;
        private final Pools.Pool<List<Throwable>> g;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<isUseCasesCombinationSupportedByFramework<Data>> list, Pools.Pool<List<Throwable>> pool) {
            this.g = pool;
            if (!list.isEmpty()) {
                this.TuitionPaymentFragmentbindingInflater1 = list;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Priority priority, isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1<? super Data> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.asInterface = priority;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.b = this.g.acquire();
            this.TuitionPaymentFragmentbindingInflater1.get(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault2(priority, this);
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void b() {
            List<Throwable> list = this.b;
            if (list != null) {
                this.g.release(list);
            }
            this.b = null;
            Iterator<isUseCasesCombinationSupportedByFramework<Data>> it = this.TuitionPaymentFragmentbindingInflater1.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            Iterator<isUseCasesCombinationSupportedByFramework<Data>> it = this.TuitionPaymentFragmentbindingInflater1.iterator();
            while (it.hasNext()) {
                it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final Class<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.TuitionPaymentFragmentbindingInflater1.get(0).TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.isUseCasesCombinationSupportedByFramework
        public final DataSource TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentbindingInflater1.get(0).TuitionPaymentFragmentbindingInflater1();
        }

        @Override // isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Data data) {
            if (data != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(data);
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        @Override // isUseCasesCombinationSupportedByFramework.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
            List<Throwable> list = this.b;
            if (list != null) {
                list.add(exc);
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 < this.TuitionPaymentFragmentbindingInflater1.size() - 1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2++;
                TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asInterface, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            } else {
                if (this.b != null) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new GlideException("Fetch failed", new ArrayList(this.b)));
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
        }
    }
}
