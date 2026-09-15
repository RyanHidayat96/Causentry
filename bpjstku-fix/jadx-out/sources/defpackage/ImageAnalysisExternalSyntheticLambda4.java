package defpackage;

import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageAnalysisExternalSyntheticLambda4 {
    public static final CameraStateStateError<?, ?, ?> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new CameraStateStateError<>(Object.class, Object.class, Object.class, Collections.singletonList(new CameraProvider(Object.class, Object.class, Object.class, Collections.emptyList(), new isFlipWH(), null)), null);
    public final ArrayMap<ImageAnalysisAbstractAnalyzer, CameraStateStateError<?, ?, ?>> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayMap<>();
    private final AtomicReference<ImageAnalysisAbstractAnalyzer> b = new AtomicReference<>();

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(CameraStateStateError<?, ?, ?> cameraStateStateError) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2.equals(cameraStateStateError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data, TResource, Transcode> CameraStateStateError<Data, TResource, Transcode> TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        CameraStateStateError<Data, TResource, Transcode> cameraStateStateError;
        ImageAnalysisAbstractAnalyzer andSet = this.b.getAndSet(null);
        if (andSet == null) {
            andSet = new ImageAnalysisAbstractAnalyzer();
        }
        andSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cls;
        andSet.b = cls2;
        andSet.TuitionPaymentFragmentbindingInflater1 = cls3;
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            cameraStateStateError = (CameraStateStateError) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(andSet);
        }
        this.b.set(andSet);
        return cameraStateStateError;
    }
}
