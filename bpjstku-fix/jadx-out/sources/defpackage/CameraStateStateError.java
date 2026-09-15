package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraStateStateError<Data, ResourceType, Transcode> {
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Class<Data> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final List<? extends CameraProvider<Data, ResourceType, Transcode>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Pools.Pool<List<Throwable>> b;

    public CameraStateStateError(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<CameraProvider<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cls;
        this.b = pool;
        if (!list.isEmpty()) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
            StringBuilder sb = new StringBuilder("Failed LoadPath{");
            sb.append(cls.getSimpleName());
            sb.append("->");
            sb.append(cls2.getSimpleName());
            sb.append("->");
            sb.append(cls3.getSimpleName());
            sb.append("}");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final Resource<Transcode> TuitionPaymentFragmentspecialinlinedviewModeldefault3(getOutputOption<Data> getoutputoption, getTargetRotation gettargetrotation, int i, int i2, CameraProvider.TuitionPaymentFragmentbindingInflater1<ResourceType> tuitionPaymentFragmentbindingInflater1) throws GlideException {
        List<Throwable> listAcquire = this.b.acquire();
        if (listAcquire != null) {
            List<Throwable> list = listAcquire;
            try {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(getoutputoption, gettargetrotation, i, i2, tuitionPaymentFragmentbindingInflater1, list);
            } finally {
                this.b.release(list);
            }
        }
        throw new NullPointerException("Argument must not be null");
    }

    private Resource<Transcode> TuitionPaymentFragmentspecialinlinedviewModeldefault3(getOutputOption<Data> getoutputoption, getTargetRotation gettargetrotation, int i, int i2, CameraProvider.TuitionPaymentFragmentbindingInflater1<ResourceType> tuitionPaymentFragmentbindingInflater1, List<Throwable> list) throws GlideException {
        int size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
        Resource<Transcode> resourceB = null;
        for (int i3 = 0; i3 < size; i3++) {
            CameraProvider<Data, ResourceType, Transcode> cameraProvider = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i3);
            try {
                resourceB = cameraProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(cameraProvider.TuitionPaymentFragmentbindingInflater1(getoutputoption, i, i2, gettargetrotation)), gettargetrotation);
            } catch (GlideException e2) {
                list.add(e2);
            }
            if (resourceB != null) {
                break;
            }
        }
        if (resourceB != null) {
            return resourceB;
        }
        throw new GlideException(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
