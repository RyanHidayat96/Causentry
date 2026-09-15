package defpackage;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import com.bpjstku.R;
import com.journeyapps.barcodescanner.camera.CameraSettings;

/* JADX INFO: loaded from: classes6.dex */
public final class isCropAspectRatioHasEffect {
    public yuvImageToJpegByteArray TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public ImageUtilCodecFailedExceptionFailureType asBinder;
    public Handler asInterface;
    public ImageUtilCodecFailedException b;
    public getFailureType onTransact;
    public boolean d = false;
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    public CameraSettings TuitionPaymentFragmentbindingInflater1 = new CameraSettings();
    private Runnable cancelAll = new Runnable() { // from class: isCropAspectRatioHasEffect.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                yuvImageToJpegByteArray yuvimagetojpegbytearray = isCropAspectRatioHasEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int iTuitionPaymentFragmentbindingInflater1 = getIoExecutor.TuitionPaymentFragmentbindingInflater1(yuvimagetojpegbytearray.notify.f837a);
                Camera cameraOpen = iTuitionPaymentFragmentbindingInflater1 == -1 ? null : Camera.open(iTuitionPaymentFragmentbindingInflater1);
                yuvimagetojpegbytearray.TuitionPaymentFragmentbindingInflater1 = cameraOpen;
                if (cameraOpen == null) {
                    throw new RuntimeException("Failed to open camera");
                }
                int iTuitionPaymentFragmentbindingInflater2 = getIoExecutor.TuitionPaymentFragmentbindingInflater1(yuvimagetojpegbytearray.notify.f837a);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                yuvimagetojpegbytearray.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = cameraInfo;
                Camera.getCameraInfo(iTuitionPaymentFragmentbindingInflater2, cameraInfo);
            } catch (Exception e2) {
                Handler handler = isCropAspectRatioHasEffect.this.asInterface;
                if (handler != null) {
                    handler.obtainMessage(R.id.zxing_camera_error, e2).sendToTarget();
                }
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f1219a = new Runnable() { // from class: isCropAspectRatioHasEffect.2
        @Override // java.lang.Runnable
        public final void run() {
            shouldCropImage shouldcropimage;
            int i;
            int i2;
            try {
                yuvImageToJpegByteArray yuvimagetojpegbytearray = isCropAspectRatioHasEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (yuvimagetojpegbytearray.TuitionPaymentFragmentbindingInflater1 == null) {
                    throw new RuntimeException("Camera not open");
                }
                try {
                    int i3 = yuvimagetojpegbytearray.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (i3 != 0) {
                        if (i3 == 1) {
                            i = 90;
                        } else if (i3 != 2) {
                            i = i3 != 3 ? 0 : 270;
                        } else {
                            i = 180;
                        }
                    }
                    if (yuvimagetojpegbytearray.TuitionPaymentFragmentspecialinlinedviewModeldefault3.facing == 1) {
                        i2 = (360 - ((yuvimagetojpegbytearray.TuitionPaymentFragmentspecialinlinedviewModeldefault3.orientation + i) % 360)) % 360;
                    } else {
                        i2 = ((yuvimagetojpegbytearray.TuitionPaymentFragmentspecialinlinedviewModeldefault3.orientation - i) + 360) % 360;
                    }
                    yuvimagetojpegbytearray.onTransact = i2;
                    yuvimagetojpegbytearray.TuitionPaymentFragmentbindingInflater1.setDisplayOrientation(i2);
                } catch (Exception unused) {
                }
                try {
                    try {
                        yuvimagetojpegbytearray.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    yuvimagetojpegbytearray.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
                }
                Camera.Size previewSize = yuvimagetojpegbytearray.TuitionPaymentFragmentbindingInflater1.getParameters().getPreviewSize();
                if (previewSize == null) {
                    yuvimagetojpegbytearray.asInterface = yuvimagetojpegbytearray.f1429a;
                } else {
                    yuvimagetojpegbytearray.asInterface = new shouldCropImage(previewSize.width, previewSize.height);
                }
                yuvimagetojpegbytearray.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = yuvimagetojpegbytearray.asInterface;
                if (isCropAspectRatioHasEffect.this.asInterface != null) {
                    Handler handler = isCropAspectRatioHasEffect.this.asInterface;
                    yuvImageToJpegByteArray yuvimagetojpegbytearray2 = isCropAspectRatioHasEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (yuvimagetojpegbytearray2.asInterface == null) {
                        shouldcropimage = null;
                    } else {
                        int i4 = yuvimagetojpegbytearray2.onTransact;
                        if (i4 == -1) {
                            throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
                        }
                        if (i4 % 180 != 0) {
                            shouldCropImage shouldcropimage2 = yuvimagetojpegbytearray2.asInterface;
                            shouldcropimage = new shouldCropImage(shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, shouldcropimage2.TuitionPaymentFragmentbindingInflater1);
                        } else {
                            shouldcropimage = yuvimagetojpegbytearray2.asInterface;
                        }
                    }
                    handler.obtainMessage(R.id.zxing_prewiew_size_ready, shouldcropimage).sendToTarget();
                }
            } catch (Exception e2) {
                Handler handler2 = isCropAspectRatioHasEffect.this.asInterface;
                if (handler2 != null) {
                    handler2.obtainMessage(R.id.zxing_camera_error, e2).sendToTarget();
                }
            }
        }
    };
    public Runnable g = new Runnable() { // from class: isCropAspectRatioHasEffect.5
        @Override // java.lang.Runnable
        public final void run() {
            try {
                yuvImageToJpegByteArray yuvimagetojpegbytearray = isCropAspectRatioHasEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                getFailureType getfailuretype = isCropAspectRatioHasEffect.this.onTransact;
                Camera camera = yuvimagetojpegbytearray.TuitionPaymentFragmentbindingInflater1;
                SurfaceHolder surfaceHolder = getfailuretype.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (surfaceHolder != null) {
                    camera.setPreviewDisplay(surfaceHolder);
                } else {
                    camera.setPreviewTexture(getfailuretype.TuitionPaymentFragmentbindingInflater1);
                }
                yuvImageToJpegByteArray yuvimagetojpegbytearray2 = isCropAspectRatioHasEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Camera camera2 = yuvimagetojpegbytearray2.TuitionPaymentFragmentbindingInflater1;
                if (camera2 == null || yuvimagetojpegbytearray2.g) {
                    return;
                }
                camera2.startPreview();
                yuvimagetojpegbytearray2.g = true;
                yuvimagetojpegbytearray2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new sizeToVertexes(yuvimagetojpegbytearray2.TuitionPaymentFragmentbindingInflater1, yuvimagetojpegbytearray2.notify);
                EncoderProfilesProxyImmutableEncoderProfilesProxy encoderProfilesProxyImmutableEncoderProfilesProxy = new EncoderProfilesProxyImmutableEncoderProfilesProxy(yuvimagetojpegbytearray2.asBinder, yuvimagetojpegbytearray2, yuvimagetojpegbytearray2.notify);
                yuvimagetojpegbytearray2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = encoderProfilesProxyImmutableEncoderProfilesProxy;
                boolean z = encoderProfilesProxyImmutableEncoderProfilesProxy.TuitionPaymentFragmentbindingInflater1.b;
            } catch (Exception e2) {
                Handler handler = isCropAspectRatioHasEffect.this.asInterface;
                if (handler != null) {
                    handler.obtainMessage(R.id.zxing_camera_error, e2).sendToTarget();
                }
            }
        }
    };
    public Runnable TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Runnable() { // from class: isCropAspectRatioHasEffect.6
        @Override // java.lang.Runnable
        public final void run() {
            try {
                yuvImageToJpegByteArray yuvimagetojpegbytearray = isCropAspectRatioHasEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sizeToVertexes sizetovertexes = yuvimagetojpegbytearray.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (sizetovertexes != null) {
                    sizetovertexes.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    yuvimagetojpegbytearray.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                }
                EncoderProfilesProxyImmutableEncoderProfilesProxy encoderProfilesProxyImmutableEncoderProfilesProxy = yuvimagetojpegbytearray.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (encoderProfilesProxyImmutableEncoderProfilesProxy != null) {
                    if (encoderProfilesProxyImmutableEncoderProfilesProxy.b != null) {
                        ((SensorManager) encoderProfilesProxyImmutableEncoderProfilesProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getSystemService("sensor")).unregisterListener(encoderProfilesProxyImmutableEncoderProfilesProxy);
                        encoderProfilesProxyImmutableEncoderProfilesProxy.b = null;
                    }
                    yuvimagetojpegbytearray.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                }
                Camera camera = yuvimagetojpegbytearray.TuitionPaymentFragmentbindingInflater1;
                if (camera != null && yuvimagetojpegbytearray.g) {
                    camera.stopPreview();
                    yuvimagetojpegbytearray.b.b = null;
                    yuvimagetojpegbytearray.g = false;
                }
                yuvImageToJpegByteArray yuvimagetojpegbytearray2 = isCropAspectRatioHasEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Camera camera2 = yuvimagetojpegbytearray2.TuitionPaymentFragmentbindingInflater1;
                if (camera2 != null) {
                    camera2.release();
                    yuvimagetojpegbytearray2.TuitionPaymentFragmentbindingInflater1 = null;
                }
            } catch (Exception unused) {
            }
            isCropAspectRatioHasEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            isCropAspectRatioHasEffect.this.asInterface.sendEmptyMessage(R.id.zxing_camera_closed);
            ImageUtilCodecFailedException imageUtilCodecFailedException = isCropAspectRatioHasEffect.this.b;
            synchronized (imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                int i = imageUtilCodecFailedException.b - 1;
                imageUtilCodecFailedException.b = i;
                if (i == 0) {
                    synchronized (imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        imageUtilCodecFailedException.TuitionPaymentFragmentbindingInflater1.quit();
                        imageUtilCodecFailedException.TuitionPaymentFragmentbindingInflater1 = null;
                        imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                    }
                }
            }
        }
    };

    public isCropAspectRatioHasEffect(Context context) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
        if (ImageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            ImageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ImageUtilCodecFailedException();
        }
        this.b = ImageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        yuvImageToJpegByteArray yuvimagetojpegbytearray = new yuvImageToJpegByteArray(context);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = yuvimagetojpegbytearray;
        yuvimagetojpegbytearray.notify = this.TuitionPaymentFragmentbindingInflater1;
    }

    public final void b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.d = true;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
            ImageUtilCodecFailedException imageUtilCodecFailedException = this.b;
            Runnable runnable = this.cancelAll;
            synchronized (imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                imageUtilCodecFailedException.b++;
                synchronized (imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(runnable);
                }
            }
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    public final void TuitionPaymentFragmentbindingInflater1(final RingBuffer ringBuffer) {
        if (this.d) {
            ImageUtilCodecFailedException imageUtilCodecFailedException = this.b;
            Runnable runnable = new Runnable() { // from class: isCropAspectRatioHasEffect.3
                @Override // java.lang.Runnable
                public final void run() {
                    yuvImageToJpegByteArray yuvimagetojpegbytearray = isCropAspectRatioHasEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    RingBuffer ringBuffer2 = ringBuffer;
                    Camera camera = yuvimagetojpegbytearray.TuitionPaymentFragmentbindingInflater1;
                    if (camera == null || !yuvimagetojpegbytearray.g) {
                        return;
                    }
                    yuvimagetojpegbytearray.b.b = ringBuffer2;
                    camera.setOneShotPreviewCallback(yuvimagetojpegbytearray.b);
                }
            };
            synchronized (imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(runnable);
            }
            return;
        }
        throw new IllegalStateException("CameraInstance is not open");
    }

    public final void TuitionPaymentFragmentbindingInflater1(final boolean z) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (this.d) {
                ImageUtilCodecFailedException imageUtilCodecFailedException = this.b;
                Runnable runnable = new Runnable() { // from class: isCropAspectRatioHasEffect.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        isCropAspectRatioHasEffect.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(z);
                    }
                };
                synchronized (imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    imageUtilCodecFailedException.TuitionPaymentFragmentspecialinlinedviewModeldefault2.post(runnable);
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }
}
