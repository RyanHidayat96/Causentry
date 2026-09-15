package defpackage;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class yuvImageToJpegByteArray {
    Camera TuitionPaymentFragmentbindingInflater1;
    EncoderProfilesProxyImmutableEncoderProfilesProxy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    sizeToVertexes TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    Camera.CameraInfo TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    shouldCropImage f1429a;
    Context asBinder;
    shouldCropImage asInterface;
    private String cancel;
    public ImageUtilCodecFailedExceptionFailureType d;
    boolean g;
    public CameraSettings notify = new CameraSettings();
    int onTransact = -1;
    final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Camera.PreviewCallback {
        shouldCropImage TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        RingBuffer b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            shouldCropImage shouldcropimage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            RingBuffer ringBuffer = this.b;
            if (shouldcropimage == null || ringBuffer == null) {
                if (ringBuffer != null) {
                    ringBuffer.TuitionPaymentFragmentbindingInflater1();
                }
            } else {
                try {
                    if (bArr == null) {
                        throw new NullPointerException("No preview data received");
                    }
                    ringBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new isJpegFormats(bArr, shouldcropimage.TuitionPaymentFragmentbindingInflater1, shouldcropimage.TuitionPaymentFragmentspecialinlinedviewModeldefault2, camera.getParameters().getPreviewFormat(), yuvImageToJpegByteArray.this.onTransact));
                } catch (RuntimeException unused) {
                    ringBuffer.TuitionPaymentFragmentbindingInflater1();
                }
            }
        }
    }

    public yuvImageToJpegByteArray(Context context) {
        this.asBinder = context;
    }

    public final void TuitionPaymentFragmentbindingInflater1(boolean z) {
        if (this.TuitionPaymentFragmentbindingInflater1 != null) {
            try {
                if (z != TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                    sizeToVertexes sizetovertexes = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (sizetovertexes != null) {
                        sizetovertexes.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    }
                    Camera.Parameters parameters = this.TuitionPaymentFragmentbindingInflater1.getParameters();
                    Identifier.TuitionPaymentFragmentspecialinlinedviewModeldefault3(parameters, z);
                    boolean z2 = this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    this.TuitionPaymentFragmentbindingInflater1.setParameters(parameters);
                    sizeToVertexes sizetovertexes2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (sizetovertexes2 != null) {
                        sizetovertexes2.TuitionPaymentFragmentbindingInflater1();
                    }
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        String flashMode;
        Camera.Parameters parameters = this.TuitionPaymentFragmentbindingInflater1.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        Camera.Parameters parameters = this.TuitionPaymentFragmentbindingInflater1.getParameters();
        String str = this.cancel;
        if (str == null) {
            this.cancel = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        if (parameters == null) {
            return;
        }
        parameters.flatten();
        Identifier.b(parameters, this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault2, z);
        if (!z) {
            Identifier.TuitionPaymentFragmentspecialinlinedviewModeldefault3(parameters, false);
            boolean z2 = this.notify.d;
            boolean z3 = this.notify.TuitionPaymentFragmentbindingInflater1;
            boolean z4 = this.notify.asBinder;
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new shouldCropImage(previewSize.width, previewSize.height));
            }
        } else {
            for (Camera.Size size : supportedPreviewSizes) {
                arrayList.add(new shouldCropImage(size.width, size.height));
            }
        }
        shouldCropImage shouldcropimage = null;
        if (arrayList.size() == 0) {
            this.f1429a = null;
        } else {
            ImageUtilCodecFailedExceptionFailureType imageUtilCodecFailedExceptionFailureType = this.d;
            int i = this.onTransact;
            if (i == -1) {
                throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
            }
            boolean z5 = i % 180 != 0;
            shouldCropImage shouldcropimage2 = imageUtilCodecFailedExceptionFailureType.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (shouldcropimage2 != null) {
                shouldcropimage = z5 ? new shouldCropImage(shouldcropimage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, shouldcropimage2.TuitionPaymentFragmentbindingInflater1) : shouldcropimage2;
            }
            getArea getarea = imageUtilCodecFailedExceptionFailureType.b;
            if (shouldcropimage != null) {
                Collections.sort(arrayList, new Comparator<shouldCropImage>() { // from class: getArea.3
                    private /* synthetic */ shouldCropImage b;

                    AnonymousClass3() {
                        shouldcropimage = shouldcropimage;
                    }

                    @Override // java.util.Comparator
                    public final /* bridge */ /* synthetic */ int compare(shouldCropImage shouldcropimage3, shouldCropImage shouldcropimage4) {
                        return Float.compare(getArea.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldcropimage4, shouldcropimage), getArea.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldcropimage3, shouldcropimage));
                    }
                });
            }
            Objects.toString(shouldcropimage);
            arrayList.toString();
            shouldCropImage shouldcropimage3 = (shouldCropImage) arrayList.get(0);
            this.f1429a = shouldcropimage3;
            parameters.setPreviewSize(shouldcropimage3.TuitionPaymentFragmentbindingInflater1, this.f1429a.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
        if (Build.DEVICE.equals("glass-1")) {
            Identifier.TuitionPaymentFragmentspecialinlinedviewModeldefault3(parameters);
        }
        parameters.flatten();
        this.TuitionPaymentFragmentbindingInflater1.setParameters(parameters);
    }
}
