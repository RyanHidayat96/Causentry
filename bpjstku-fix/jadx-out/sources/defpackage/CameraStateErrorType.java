package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraStateErrorType<Z> implements Resource<Z>, createImageReaderProxy.TuitionPaymentFragmentbindingInflater1 {
    private static final Pools.Pool<CameraStateErrorType<?>> TuitionPaymentFragmentbindingInflater1 = createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(20, new createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1<CameraStateErrorType<?>>() { // from class: CameraStateErrorType.1
        @Override // createImageReaderProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ CameraStateErrorType<?> TuitionPaymentFragmentbindingInflater1() {
            return new CameraStateErrorType<>();
        }
    });
    private final attach TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new attach.TuitionPaymentFragmentbindingInflater1();
    private Resource<Z> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public static <Z> CameraStateErrorType<Z> b(Resource<Z> resource) {
        CameraStateErrorType<Z> cameraStateErrorType = (CameraStateErrorType) TuitionPaymentFragmentbindingInflater1.acquire();
        if (cameraStateErrorType == null) {
            throw new NullPointerException("Argument must not be null");
        }
        ((CameraStateErrorType) cameraStateErrorType).b = false;
        ((CameraStateErrorType) cameraStateErrorType).TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
        ((CameraStateErrorType) cameraStateErrorType).TuitionPaymentFragmentspecialinlinedviewModeldefault2 = resource;
        return cameraStateErrorType;
    }

    CameraStateErrorType() {
    }

    public final void b() {
        synchronized (this) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                throw new IllegalStateException("Already unlocked");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
            if (this.b) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class<Z> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Z TuitionPaymentFragmentbindingInflater1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        synchronized (this) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.b = true;
            if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                TuitionPaymentFragmentbindingInflater1.release(this);
            }
        }
    }

    @Override // createImageReaderProxy.TuitionPaymentFragmentbindingInflater1
    public final attach e_() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
