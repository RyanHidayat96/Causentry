package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.work.WorkRequest;
import com.koushikdutta.ion.bitmap.BitmapDecodeException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdaonOutputSurface1androidxcameracoreprocessingSurfaceProcessorWithExecutor {
    private calculateInvertedTextureTransform TuitionPaymentFragmentbindingInflater1;
    private DisplayMetrics TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Resources asInterface;
    public getProcessor b;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault3 = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
    private double TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0.14285714285714285d;

    public lambdaonOutputSurface1androidxcameracoreprocessingSurfaceProcessorWithExecutor(calculateInvertedTextureTransform calculateinvertedtexturetransform) {
        Context applicationContext = calculateinvertedtexturetransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getApplicationContext();
        this.TuitionPaymentFragmentbindingInflater1 = calculateinvertedtexturetransform;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new DisplayMetrics();
        ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getMetrics(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        this.asInterface = new Resources(applicationContext.getAssets(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, applicationContext.getResources().getConfiguration());
        this.b = new getProcessor((((ActivityManager) applicationContext.getSystemService("activity")).getMemoryClass() * 1048576) / 7);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2) {
        long memoryClass = (int) (((double) (((ActivityManager) this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getSystemService("activity")).getMemoryClass() * 1048576)) * this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        if (memoryClass != this.b.b()) {
            this.b.b = memoryClass;
        }
        this.b.TuitionPaymentFragmentbindingInflater1(surfaceProcessorNodeExternalSyntheticLambda2.g, surfaceProcessorNodeExternalSyntheticLambda2);
    }

    public final SurfaceProcessorNodeExternalSyntheticLambda2 b(String str) {
        SurfaceProcessorNodeExternalSyntheticLambda2 surfaceProcessorNodeExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (str == null || (surfaceProcessorNodeExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str)) == null) {
            return null;
        }
        if (surfaceProcessorNodeExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 != null && surfaceProcessorNodeExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.isRecycled()) {
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
            return null;
        }
        if (surfaceProcessorNodeExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1.b == null || surfaceProcessorNodeExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 > System.currentTimeMillis()) {
            return surfaceProcessorNodeExternalSyntheticLambda2TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str);
        return null;
    }

    private Point TuitionPaymentFragmentbindingInflater1(int i, int i2) {
        if (i == 0) {
            i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.widthPixels;
        }
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        if (i2 == 0) {
            i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.heightPixels;
        }
        return new Point(i, i2 > 0 ? i2 : Integer.MAX_VALUE);
    }

    public final BitmapFactory.Options b(BitmapFactory.Options options, int i, int i2) throws BitmapDecodeException {
        if (options.outWidth < 0 || options.outHeight < 0) {
            throw new BitmapDecodeException(options.outWidth, options.outHeight);
        }
        Point pointTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(i, i2);
        int iRound = Math.round(Math.max(options.outWidth / pointTuitionPaymentFragmentbindingInflater1.x, options.outHeight / pointTuitionPaymentFragmentbindingInflater1.y));
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = iRound;
        options2.outWidth = options.outWidth;
        options2.outHeight = options.outHeight;
        options2.outMimeType = options.outMimeType;
        return options2;
    }

    public final BitmapFactory.Options TuitionPaymentFragmentbindingInflater1(File file, int i, int i2) throws BitmapDecodeException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.toString(), options);
        return b(options, i, i2);
    }

    public static Bitmap TuitionPaymentFragmentbindingInflater1(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        if (i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap b(Resources resources, int i, BitmapFactory.Options options) {
        InputStream inputStreamOpenRawResource;
        int iB;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                byte[] bArr = new byte[50000];
                iB = lambdaonInputSurface0androidxcameracoreprocessingSurfaceProcessorWithExecutor.b(bArr, 0, inputStreamOpenRawResource.read(bArr));
            } catch (Exception unused) {
                iB = 0;
            }
        } catch (Exception unused2) {
            inputStreamOpenRawResource = null;
        }
        SurfaceEdgeExternalSyntheticLambda3.b(inputStreamOpenRawResource);
        return TuitionPaymentFragmentbindingInflater1(BitmapFactory.decodeResource(resources, i, options), iB);
    }

    public static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault2(InputStream inputStream, BitmapFactory.Options options) throws IOException {
        SurfaceProcessorNodeOut surfaceProcessorNodeOut = new SurfaceProcessorNodeOut(inputStream);
        surfaceProcessorNodeOut.mark(50000);
        int iB = 0;
        try {
            byte[] bArr = new byte[50000];
            iB = lambdaonInputSurface0androidxcameracoreprocessingSurfaceProcessorWithExecutor.b(bArr, 0, surfaceProcessorNodeOut.read(bArr));
        } catch (Exception unused) {
        }
        surfaceProcessorNodeOut.reset();
        return TuitionPaymentFragmentbindingInflater1(BitmapFactory.decodeStream(surfaceProcessorNodeOut, null, options), iB);
    }

    public static Bitmap TuitionPaymentFragmentbindingInflater1(File file, BitmapFactory.Options options) {
        FileInputStream fileInputStream;
        int iB;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[50000];
                iB = lambdaonInputSurface0androidxcameracoreprocessingSurfaceProcessorWithExecutor.b(bArr, 0, fileInputStream.read(bArr));
            } catch (Exception unused) {
                iB = 0;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        }
        SurfaceEdgeExternalSyntheticLambda3.b(fileInputStream);
        return TuitionPaymentFragmentbindingInflater1(BitmapFactory.decodeFile(file.toString(), options), iB);
    }
}
