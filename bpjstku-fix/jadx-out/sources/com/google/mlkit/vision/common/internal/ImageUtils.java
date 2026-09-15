package com.google.mlkit.vision.common.internal;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public class ImageUtils {
    private static final GmsLogger zza = new GmsLogger("MLKitImageUtils", "");
    private static ImageUtils zzb = new ImageUtils();

    public IObjectWrapper getImageDataWrapper(InputImage inputImage) throws MlKitException {
        int format = inputImage.getFormat();
        if (format == -1) {
            return ObjectWrapper.wrap((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal()));
        }
        if (format != 17) {
            if (format == 35) {
                return ObjectWrapper.wrap(inputImage.getMediaImage());
            }
            if (format != 842094169) {
                int format2 = inputImage.getFormat();
                StringBuilder sb = new StringBuilder("Unsupported image format: ");
                sb.append(format2);
                throw new MlKitException(sb.toString(), 3);
            }
        }
        return ObjectWrapper.wrap((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer()));
    }

    public int getMobileVisionImageFormat(InputImage inputImage) {
        return inputImage.getFormat();
    }

    public int getMobileVisionImageSize(InputImage inputImage) {
        if (inputImage.getFormat() == -1) {
            return ((Bitmap) Preconditions.checkNotNull(inputImage.getBitmapInternal())).getAllocationByteCount();
        }
        if (inputImage.getFormat() == 17 || inputImage.getFormat() == 842094169) {
            return ((ByteBuffer) Preconditions.checkNotNull(inputImage.getByteBuffer())).limit();
        }
        if (inputImage.getFormat() != 35) {
            return 0;
        }
        return (((Image.Plane[]) Preconditions.checkNotNull(inputImage.getPlanes()))[0].getBuffer().limit() * 3) / 2;
    }

    public Matrix getUprightRotationMatrix(int i, int i2, int i3) {
        if (i3 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
        matrix.postRotate(i3 * 90);
        int i4 = i3 % 2;
        int i5 = i4 != 0 ? i2 : i;
        if (i4 == 0) {
            i = i2;
        }
        matrix.postTranslate(i5 / 2.0f, i / 2.0f);
        return matrix;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b6 A[Catch: FileNotFoundException -> 0x00cd, TryCatch #4 {FileNotFoundException -> 0x00cd, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0016, B:31:0x0071, B:32:0x0086, B:44:0x00b6, B:46:0x00c0, B:34:0x008a, B:35:0x008e, B:36:0x0095, B:37:0x0099, B:38:0x00a0, B:39:0x00a4, B:41:0x00ab, B:30:0x006b, B:28:0x0056, B:48:0x00c5, B:49:0x00cc), top: B:61:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final Bitmap zza(ContentResolver contentResolver, Uri uri) throws IOException {
        ExifInterface exifInterface;
        Matrix matrix;
        Bitmap bitmapCreateBitmap;
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri);
            if (bitmap == null) {
                throw new IOException("The image Uri could not be resolved.");
            }
            int attributeInt = 0;
            Matrix matrix2 = null;
            if (FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) || "file".equals(uri.getScheme())) {
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            exifInterface = new ExifInterface(inputStreamOpenInputStream);
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        exifInterface = null;
                    }
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e2) {
                            e = e2;
                            zza.e("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(String.valueOf(uri))), e);
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    exifInterface = null;
                }
                if (exifInterface != null) {
                    attributeInt = exifInterface.getAttributeInt(ExifInterface.TAG_ORIENTATION, 1);
                }
            }
            Matrix matrix3 = new Matrix();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            switch (attributeInt) {
                case 2:
                    matrix2 = new Matrix();
                    matrix2.postScale(-1.0f, 1.0f);
                    matrix = matrix2;
                    if (matrix != null || bitmap == (bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true))) {
                        return bitmap;
                    }
                    bitmap.recycle();
                    return bitmapCreateBitmap;
                case 3:
                    matrix3.postRotate(180.0f);
                    break;
                case 4:
                    matrix3.postScale(1.0f, -1.0f);
                    break;
                case 5:
                    matrix3.postRotate(90.0f);
                    matrix3.postScale(-1.0f, 1.0f);
                    break;
                case 6:
                    matrix3.postRotate(90.0f);
                    break;
                case 7:
                    matrix3.postRotate(-90.0f);
                    matrix3.postScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix3.postRotate(-90.0f);
                    break;
                default:
                    matrix = matrix2;
                    if (matrix != null) {
                        return bitmap;
                    }
                    return bitmap;
            }
            matrix = matrix3;
            if (matrix != null) {
                return bitmap;
            }
            return bitmap;
        } catch (FileNotFoundException e4) {
            zza.e("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(String.valueOf(uri))), e4);
            throw e4;
        }
    }

    private ImageUtils() {
    }

    public static ImageUtils getInstance() {
        return zzb;
    }
}
