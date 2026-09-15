package defpackage;

import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraProvider<DataType, ResourceType, Transcode> {
    private final Class<DataType> TuitionPaymentFragmentbindingInflater1;
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Pools.Pool<List<Throwable>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final ForwardingImageProxy<ResourceType, Transcode> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final List<? extends Camera<DataType, ResourceType>> b;

    public interface TuitionPaymentFragmentbindingInflater1<ResourceType> {
        Resource<ResourceType> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Resource<ResourceType> resource);
    }

    public CameraProvider(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends Camera<DataType, ResourceType>> list, ForwardingImageProxy<ResourceType, Transcode> forwardingImageProxy, Pools.Pool<List<Throwable>> pool) {
        this.TuitionPaymentFragmentbindingInflater1 = cls;
        this.b = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = forwardingImageProxy;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = pool;
        StringBuilder sb = new StringBuilder("Failed DecodePath{");
        sb.append(cls.getSimpleName());
        sb.append("->");
        sb.append(cls2.getSimpleName());
        sb.append("->");
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
    }

    final Resource<ResourceType> TuitionPaymentFragmentbindingInflater1(getOutputOption<DataType> getoutputoption, int i, int i2, getTargetRotation gettargetrotation) throws GlideException {
        List<Throwable> listAcquire = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.acquire();
        if (listAcquire != null) {
            List<Throwable> list = listAcquire;
            try {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(getoutputoption, i, i2, gettargetrotation, list);
            } finally {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.release(list);
            }
        }
        throw new NullPointerException("Argument must not be null");
    }

    private Resource<ResourceType> TuitionPaymentFragmentspecialinlinedviewModeldefault3(getOutputOption<DataType> getoutputoption, int i, int i2, getTargetRotation gettargetrotation, List<Throwable> list) throws GlideException {
        int size = this.b.size();
        Resource<ResourceType> resourceTuitionPaymentFragmentbindingInflater1 = null;
        for (int i3 = 0; i3 < size; i3++) {
            Camera<DataType, ResourceType> camera = this.b.get(i3);
            try {
                if (camera.TuitionPaymentFragmentbindingInflater1(getoutputoption.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), gettargetrotation)) {
                    resourceTuitionPaymentFragmentbindingInflater1 = camera.TuitionPaymentFragmentbindingInflater1(getoutputoption.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), i, i2, gettargetrotation);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(camera);
                }
                list.add(e2);
            }
            if (resourceTuitionPaymentFragmentbindingInflater1 != null) {
                break;
            }
        }
        if (resourceTuitionPaymentFragmentbindingInflater1 != null) {
            return resourceTuitionPaymentFragmentbindingInflater1;
        }
        throw new GlideException(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodePath{ dataClass=");
        sb.append(this.TuitionPaymentFragmentbindingInflater1);
        sb.append(", decoders=");
        sb.append(this.b);
        sb.append(", transcoder=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('}');
        return sb.toString();
    }
}
