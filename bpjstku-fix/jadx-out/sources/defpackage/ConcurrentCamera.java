package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ConcurrentCamera implements CameraEffect<Bitmap> {
    private static isMirroring<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = isMirroring.TuitionPaymentFragmentbindingInflater1("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
    private static isMirroring<Bitmap.CompressFormat> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = isMirroring.TuitionPaymentFragmentspecialinlinedviewModeldefault3("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    private final CameraUnavailableException TuitionPaymentFragmentbindingInflater1;

    public ConcurrentCamera(CameraUnavailableException cameraUnavailableException) {
        this.TuitionPaymentFragmentbindingInflater1 = cameraUnavailableException;
    }

    @Deprecated
    public ConcurrentCamera() {
        this.TuitionPaymentFragmentbindingInflater1 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.getSensorToBufferTransform
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Resource<Bitmap> resource, File file, getTargetRotation gettargetrotation) throws Throwable {
        OutputStream fileOutputStream;
        boolean z;
        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = resource.TuitionPaymentFragmentbindingInflater1();
        isMirroring<Bitmap.CompressFormat> ismirroring = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring) : ismirroring.b);
        if (compressFormat == null) {
            if (bitmapTuitionPaymentFragmentbindingInflater1.hasAlpha()) {
                compressFormat = Bitmap.CompressFormat.PNG;
            } else {
                compressFormat = Bitmap.CompressFormat.JPEG;
            }
        }
        bitmapTuitionPaymentFragmentbindingInflater1.getWidth();
        bitmapTuitionPaymentFragmentbindingInflater1.getHeight();
        long jTuitionPaymentFragmentbindingInflater1 = setTargetResolution.TuitionPaymentFragmentbindingInflater1();
        isMirroring<Integer> ismirroring2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int iIntValue = ((Integer) (gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring2) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring2) : ismirroring2.b)).intValue();
        OutputStream cameraClosedException = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    cameraClosedException = this.TuitionPaymentFragmentbindingInflater1 != null ? new CameraClosedException(fileOutputStream, this.TuitionPaymentFragmentbindingInflater1) : fileOutputStream;
                    bitmapTuitionPaymentFragmentbindingInflater1.compress(compressFormat, iIntValue, cameraClosedException);
                    cameraClosedException.close();
                    try {
                        cameraClosedException.close();
                    } catch (IOException unused) {
                    }
                    z = true;
                } catch (IOException unused2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    z = false;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (IOException unused5) {
            fileOutputStream = cameraClosedException;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = cameraClosedException;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Objects.toString(compressFormat);
            getUpdatedCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmapTuitionPaymentFragmentbindingInflater1);
            setTargetResolution.TuitionPaymentFragmentbindingInflater1(jTuitionPaymentFragmentbindingInflater1);
            isMirroring<Bitmap.CompressFormat> ismirroring3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Objects.toString(gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.containsKey(ismirroring3) ? gettargetrotation.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get(ismirroring3) : ismirroring3.b);
            bitmapTuitionPaymentFragmentbindingInflater1.hasAlpha();
        }
        return z;
    }

    @Override // defpackage.CameraEffect
    public final EncodeStrategy TuitionPaymentFragmentspecialinlinedviewModeldefault3(getTargetRotation gettargetrotation) {
        return EncodeStrategy.TRANSFORMED;
    }
}
