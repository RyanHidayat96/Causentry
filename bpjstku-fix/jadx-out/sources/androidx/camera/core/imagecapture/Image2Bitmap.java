package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class Image2Bitmap implements Operation<Packet<ImageProxy>, Bitmap> {
    @Override // androidx.camera.core.processing.Operation
    public Bitmap apply(Packet<ImageProxy> packet) throws Throwable {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        Bitmap bitmapRotateBitmap;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = null;
        try {
            try {
                if (packet.getFormat() == 35) {
                    ImageProxy data = packet.getData();
                    boolean z = packet.getRotationDegrees() % 180 != 0;
                    safeCloseImageReaderProxy = new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(z ? data.getHeight() : data.getWidth(), z ? data.getWidth() : data.getHeight(), 1, 2));
                    try {
                        ImageProxy imageProxyConvertYUVToRGB = ImageProcessingUtil.convertYUVToRGB(data, safeCloseImageReaderProxy, ByteBuffer.allocateDirect(data.getWidth() * data.getHeight() * 4), packet.getRotationDegrees(), false);
                        data.close();
                        if (imageProxyConvertYUVToRGB == null) {
                            throw new ImageCaptureException(0, "Can't covert YUV to RGB", null);
                        }
                        Bitmap bitmapCreateBitmapFromImageProxy = ImageUtil.createBitmapFromImageProxy(imageProxyConvertYUVToRGB);
                        imageProxyConvertYUVToRGB.close();
                        bitmapRotateBitmap = bitmapCreateBitmapFromImageProxy;
                        safeCloseImageReaderProxy2 = safeCloseImageReaderProxy;
                    } catch (UnsupportedOperationException e2) {
                        e = e2;
                        String str = packet.getFormat() == 35 ? "YUV" : "JPEG";
                        StringBuilder sb = new StringBuilder("Can't convert ");
                        sb.append(str);
                        sb.append(" to bitmap");
                        throw new ImageCaptureException(0, sb.toString(), e);
                    } catch (Throwable th) {
                        th = th;
                        if (safeCloseImageReaderProxy != null) {
                            safeCloseImageReaderProxy.close();
                        }
                        throw th;
                    }
                } else if (packet.getFormat() == 256) {
                    ImageProxy data2 = packet.getData();
                    Bitmap bitmapCreateBitmapFromImageProxy2 = ImageUtil.createBitmapFromImageProxy(data2);
                    data2.close();
                    bitmapRotateBitmap = ImageUtil.rotateBitmap(bitmapCreateBitmapFromImageProxy2, packet.getRotationDegrees());
                } else {
                    StringBuilder sb2 = new StringBuilder("Invalid postview image format : ");
                    sb2.append(packet.getFormat());
                    throw new IllegalArgumentException(sb2.toString());
                }
                if (safeCloseImageReaderProxy2 != null) {
                    safeCloseImageReaderProxy2.close();
                }
                return bitmapRotateBitmap;
            } catch (UnsupportedOperationException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
            safeCloseImageReaderProxy = null;
        }
    }
}
