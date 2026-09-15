package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class is10BitHdr implements Camera<InputStream, Bitmap> {
    private final CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final getLayoutSettings TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.Camera
    public final /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(InputStream inputStream, getTargetRotation gettargetrotation) throws IOException {
        return getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public is10BitHdr(getLayoutSettings getlayoutsettings, CameraUnavailableException cameraUnavailableException) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getlayoutsettings;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cameraUnavailableException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.Camera
    public Resource<Bitmap> TuitionPaymentFragmentbindingInflater1(InputStream inputStream, int i, int i2, getTargetRotation gettargetrotation) throws IOException {
        boolean z;
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
        ImageAnalysisOutputImageFormat imageAnalysisOutputImageFormatTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ImageAnalysisOutputImageFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recyclableBufferedInputStream);
        createHelperBuffer createhelperbuffer = new createHelperBuffer(imageAnalysisOutputImageFormatTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(recyclableBufferedInputStream, imageAnalysisOutputImageFormatTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        try {
            getLayoutSettings getlayoutsettings = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Resource<Bitmap> resourceB = getlayoutsettings.b(new getEncoding.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createhelperbuffer, getlayoutsettings.f950a, getlayoutsettings.TuitionPaymentFragmentbindingInflater1), i, i2, gettargetrotation, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            imageAnalysisOutputImageFormatTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            imageAnalysisOutputImageFormatTuitionPaymentFragmentspecialinlinedviewModeldefault2.b = null;
            Queue<ImageAnalysisOutputImageFormat> queue = ImageAnalysisOutputImageFormat.TuitionPaymentFragmentbindingInflater1;
            synchronized (queue) {
                queue.offer(imageAnalysisOutputImageFormatTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            return resourceB;
        } finally {
            imageAnalysisOutputImageFormatTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
            imageAnalysisOutputImageFormatTuitionPaymentFragmentspecialinlinedviewModeldefault2.b = null;
            Queue<ImageAnalysisOutputImageFormat> queue2 = ImageAnalysisOutputImageFormat.TuitionPaymentFragmentbindingInflater1;
            synchronized (queue2) {
                queue2.offer(imageAnalysisOutputImageFormatTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                if (z) {
                    recyclableBufferedInputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            }
        }
    }

    static class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private final RecyclableBufferedInputStream TuitionPaymentFragmentbindingInflater1;
        private final ImageAnalysisOutputImageFormat b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(RecyclableBufferedInputStream recyclableBufferedInputStream, ImageAnalysisOutputImageFormat imageAnalysisOutputImageFormat) {
            this.TuitionPaymentFragmentbindingInflater1 = recyclableBufferedInputStream;
            this.b = imageAnalysisOutputImageFormat;
        }

        @Override // getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.TuitionPaymentFragmentbindingInflater1;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = recyclableBufferedInputStream.TuitionPaymentFragmentbindingInflater1.length;
            }
        }

        @Override // getLayoutSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BitmapPool bitmapPool, Bitmap bitmap) throws IOException {
            IOException iOException = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (iOException != null) {
                if (bitmap != null) {
                    bitmapPool.TuitionPaymentFragmentbindingInflater1(bitmap);
                    throw iOException;
                }
                throw iOException;
            }
        }
    }
}
