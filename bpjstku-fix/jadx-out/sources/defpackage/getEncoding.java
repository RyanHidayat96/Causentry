package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
interface getEncoding {
    int TuitionPaymentFragmentbindingInflater1() throws IOException;

    Bitmap TuitionPaymentFragmentbindingInflater1(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException;

    void b();

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements getEncoding {
        private final CameraUnavailableException TuitionPaymentFragmentbindingInflater1;
        private final ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private final List<ImageHeaderParser> b;

        @Override // defpackage.getEncoding
        public final void b() {
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ByteBuffer byteBuffer, List<ImageHeaderParser> list, CameraUnavailableException cameraUnavailableException) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = byteBuffer;
            this.b = list;
            this.TuitionPaymentFragmentbindingInflater1 = cameraUnavailableException;
        }

        @Override // defpackage.getEncoding
        public final ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException {
            List<ImageHeaderParser> list = this.b;
            ByteBuffer byteBufferTuitionPaymentFragmentbindingInflater1 = setOutputImageRotationEnabled.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (byteBufferTuitionPaymentFragmentbindingInflater1 == null) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            return hasCameraTransform.TuitionPaymentFragmentbindingInflater1(list, new hasCameraTransform.AnonymousClass4(byteBufferTuitionPaymentFragmentbindingInflater1));
        }

        @Override // defpackage.getEncoding
        public final int TuitionPaymentFragmentbindingInflater1() throws IOException {
            List<ImageHeaderParser> list = this.b;
            ByteBuffer byteBufferTuitionPaymentFragmentbindingInflater1 = setOutputImageRotationEnabled.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            CameraUnavailableException cameraUnavailableException = this.TuitionPaymentFragmentbindingInflater1;
            if (byteBufferTuitionPaymentFragmentbindingInflater1 == null) {
                return -1;
            }
            return hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(list, new hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3() { // from class: hasCameraTransform.2
                private /* synthetic */ ByteBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                private /* synthetic */ CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault3;

                public AnonymousClass2() {
                    byteBuffer = byteBufferTuitionPaymentFragmentbindingInflater1;
                    cameraUnavailableException = cameraUnavailableException;
                }

                @Override // hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageHeaderParser imageHeaderParser) throws IOException {
                    try {
                        return imageHeaderParser.TuitionPaymentFragmentbindingInflater1(byteBuffer, cameraUnavailableException);
                    } finally {
                        setOutputImageRotationEnabled.TuitionPaymentFragmentbindingInflater1(byteBuffer);
                    }
                }
            });
        }

        @Override // defpackage.getEncoding
        public final Bitmap TuitionPaymentFragmentbindingInflater1(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(setOutputImageRotationEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(setOutputImageRotationEnabled.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)), null, options);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements getEncoding {
        private final CameraEffectTargets TuitionPaymentFragmentbindingInflater1;
        private final CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final List<ImageHeaderParser> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(InputStream inputStream, List<ImageHeaderParser> list, CameraUnavailableException cameraUnavailableException) {
            if (cameraUnavailableException == null) {
                throw new NullPointerException("Argument must not be null");
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraUnavailableException;
            if (list != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
                this.TuitionPaymentFragmentbindingInflater1 = new CameraEffectTargets(inputStream, cameraUnavailableException);
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }

        @Override // defpackage.getEncoding
        public final Bitmap TuitionPaymentFragmentbindingInflater1(BitmapFactory.Options options) throws IOException {
            CameraEffectTargets cameraEffectTargets = this.TuitionPaymentFragmentbindingInflater1;
            cameraEffectTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3.reset();
            return BitmapFactory.decodeStream(cameraEffectTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null, options);
        }

        @Override // defpackage.getEncoding
        public final ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException {
            List<ImageHeaderParser> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            CameraEffectTargets cameraEffectTargets = this.TuitionPaymentFragmentbindingInflater1;
            cameraEffectTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3.reset();
            return hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(list, cameraEffectTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        @Override // defpackage.getEncoding
        public final int TuitionPaymentFragmentbindingInflater1() throws IOException {
            List<ImageHeaderParser> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            CameraEffectTargets cameraEffectTargets = this.TuitionPaymentFragmentbindingInflater1;
            cameraEffectTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3.reset();
            return hasCameraTransform.TuitionPaymentFragmentbindingInflater1(list, cameraEffectTargets.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        @Override // defpackage.getEncoding
        public final void b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = recyclableBufferedInputStream.TuitionPaymentFragmentbindingInflater1.length;
            }
        }
    }

    public static final class b implements getEncoding {
        private final List<ImageHeaderParser> TuitionPaymentFragmentbindingInflater1;
        private final ParcelFileDescriptorRewinder TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final CameraUnavailableException b;

        @Override // defpackage.getEncoding
        public final void b() {
        }

        b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, CameraUnavailableException cameraUnavailableException) {
            if (cameraUnavailableException == null) {
                throw new NullPointerException("Argument must not be null");
            }
            this.b = cameraUnavailableException;
            if (list != null) {
                this.TuitionPaymentFragmentbindingInflater1 = list;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }

        @Override // defpackage.getEncoding
        public final Bitmap TuitionPaymentFragmentbindingInflater1(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.rewind().getFileDescriptor(), null, options);
        }

        @Override // defpackage.getEncoding
        public final ImageHeaderParser.ImageType TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException {
            return hasCameraTransform.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, new hasCameraTransform.AnonymousClass3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b));
        }

        @Override // defpackage.getEncoding
        public final int TuitionPaymentFragmentbindingInflater1() throws IOException {
            return hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, new hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3() { // from class: hasCameraTransform.10
                private /* synthetic */ CameraUnavailableException TuitionPaymentFragmentspecialinlinedviewModeldefault2;

                public AnonymousClass10() {
                    cameraUnavailableException = cameraUnavailableException;
                }

                @Override // hasCameraTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3
                public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageHeaderParser imageHeaderParser) throws Throwable {
                    RecyclableBufferedInputStream recyclableBufferedInputStream;
                    try {
                        recyclableBufferedInputStream = new RecyclableBufferedInputStream(new FileInputStream(parcelFileDescriptorRewinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.rewind().getFileDescriptor()), cameraUnavailableException);
                        try {
                            int iTuitionPaymentFragmentbindingInflater1 = imageHeaderParser.TuitionPaymentFragmentbindingInflater1(recyclableBufferedInputStream, cameraUnavailableException);
                            recyclableBufferedInputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            parcelFileDescriptorRewinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.rewind();
                            return iTuitionPaymentFragmentbindingInflater1;
                        } catch (Throwable th) {
                            th = th;
                            if (recyclableBufferedInputStream != null) {
                                recyclableBufferedInputStream.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            }
                            parcelFileDescriptorRewinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3.rewind();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        recyclableBufferedInputStream = null;
                    }
                }
            });
        }
    }
}
