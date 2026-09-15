package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ExperimentalRetryPolicy {
    final CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final List<ImageHeaderParser> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ExperimentalRetryPolicy(List<ImageHeaderParser> list, CameraUnavailableException cameraUnavailableException) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraUnavailableException;
    }

    static Resource<Drawable> A_(ImageDecoder.Source source, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new CameraXConfigProvider(i, i2, gettargetrotation));
        if (!(drawableDecodeDrawable instanceof AnimatedImageDrawable)) {
            throw new IOException("Received unexpected drawable type for animated image, failing: ".concat(String.valueOf(drawableDecodeDrawable)));
        }
        return new TuitionPaymentFragmentbindingInflater1((AnimatedImageDrawable) drawableDecodeDrawable);
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements Resource<Drawable> {
        private final AnimatedImageDrawable b;

        TuitionPaymentFragmentbindingInflater1(AnimatedImageDrawable animatedImageDrawable) {
            this.b = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Class<Drawable> TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.b.getIntrinsicWidth() * this.b.getIntrinsicHeight() * getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            this.b.stop();
            this.b.clearAnimationCallbacks();
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final /* synthetic */ Drawable TuitionPaymentFragmentbindingInflater1() {
            return this.b;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Camera<InputStream, Drawable> {
        private final ExperimentalRetryPolicy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.Camera
        public final /* synthetic */ Resource<Drawable> TuitionPaymentFragmentbindingInflater1(InputStream inputStream, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
            return ExperimentalRetryPolicy.A_(ImageDecoder.createSource(setOutputImageRotationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1(inputStream)), i, i2, gettargetrotation);
        }

        @Override // defpackage.Camera
        public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(InputStream inputStream, getTargetRotation gettargetrotation) throws IOException {
            ExperimentalRetryPolicy experimentalRetryPolicy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ImageHeaderParser.ImageType imageTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 = hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(experimentalRetryPolicy.TuitionPaymentFragmentspecialinlinedviewModeldefault3, inputStream, experimentalRetryPolicy.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (imageTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeTuitionPaymentFragmentspecialinlinedviewModeldefault3 == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault1(ExperimentalRetryPolicy experimentalRetryPolicy) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = experimentalRetryPolicy;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Camera<ByteBuffer, Drawable> {
        private final ExperimentalRetryPolicy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        @Override // defpackage.Camera
        public final /* synthetic */ Resource<Drawable> TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
            return ExperimentalRetryPolicy.A_(ImageDecoder.createSource(byteBuffer), i, i2, gettargetrotation);
        }

        @Override // defpackage.Camera
        public final /* bridge */ /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(ByteBuffer byteBuffer, getTargetRotation gettargetrotation) throws IOException {
            ImageHeaderParser.ImageType imageTypeTuitionPaymentFragmentbindingInflater1;
            ByteBuffer byteBuffer2 = byteBuffer;
            List<ImageHeaderParser> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (byteBuffer2 == null) {
                imageTypeTuitionPaymentFragmentbindingInflater1 = ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                imageTypeTuitionPaymentFragmentbindingInflater1 = hasCameraTransform.TuitionPaymentFragmentbindingInflater1(list, new hasCameraTransform.AnonymousClass4(byteBuffer2));
            }
            if (imageTypeTuitionPaymentFragmentbindingInflater1 != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                return Build.VERSION.SDK_INT >= 31 && imageTypeTuitionPaymentFragmentbindingInflater1 == ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            return true;
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(ExperimentalRetryPolicy experimentalRetryPolicy) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = experimentalRetryPolicy;
        }
    }
}
