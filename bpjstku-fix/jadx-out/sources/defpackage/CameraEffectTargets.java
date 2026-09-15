package defpackage;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraEffectTargets implements getOutputOption<InputStream> {
    public final RecyclableBufferedInputStream TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public CameraEffectTargets(InputStream inputStream, CameraUnavailableException cameraUnavailableException) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, cameraUnavailableException);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // defpackage.getOutputOption
    public final void TuitionPaymentFragmentbindingInflater1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1<InputStream> {
        private final CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        @Override // getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final /* synthetic */ getOutputOption<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault2(InputStream inputStream) {
            return new CameraEffectTargets(inputStream, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        public TuitionPaymentFragmentbindingInflater1(CameraUnavailableException cameraUnavailableException) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraUnavailableException;
        }

        @Override // getOutputOption.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final Class<InputStream> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return InputStream.class;
        }
    }

    @Override // defpackage.getOutputOption
    public final /* synthetic */ InputStream TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.reset();
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
