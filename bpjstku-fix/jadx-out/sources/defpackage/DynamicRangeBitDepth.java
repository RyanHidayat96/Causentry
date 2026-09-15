package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class DynamicRangeBitDepth implements Camera<Bitmap, Bitmap> {
    @Override // defpackage.Camera
    public final /* synthetic */ Resource<Bitmap> TuitionPaymentFragmentbindingInflater1(Bitmap bitmap, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmap);
    }

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(Bitmap bitmap, getTargetRotation gettargetrotation) throws IOException {
        return true;
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Resource<Bitmap> {
        private final Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // com.bumptech.glide.load.engine.Resource
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bitmap bitmap) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Class<Bitmap> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final /* synthetic */ Bitmap TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }
}
