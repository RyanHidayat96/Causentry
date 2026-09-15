package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes.dex */
public final class onSkipToPrevious {
    private static final PathMeasure b = new PathMeasure();
    private static final Path TuitionPaymentFragmentbindingInflater1 = new Path();
    private static final Path g = new Path();
    private static final float[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new float[4];
    private static final float TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (float) (Math.sqrt(2.0d) / 2.0d);
    private static float TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1.0f;

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2, int i3) {
        if (i < 4) {
            return false;
        }
        if (i > 4) {
            return true;
        }
        if (i2 < 4) {
            return false;
        }
        return i2 > 4 || i3 >= 0;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static Path b(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void TuitionPaymentFragmentbindingInflater1(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float TuitionPaymentFragmentspecialinlinedviewModeldefault2(Matrix matrix) {
        float[] fArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean b(Matrix matrix) {
        float[] fArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = b;
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            int i = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i > 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i - 1;
                return;
            }
            return;
        }
        if (length >= 1.0f && Math.abs((f2 - f) - 1.0f) >= 0.01d) {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float fMin = Math.min(f4, f5) + f6;
            float fMax = Math.max(f4, f5) + f6;
            if (fMin >= length && fMax >= length) {
                fMin = onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fMin, length);
                fMax = onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                int i2 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
                if (i2 > 0) {
                    prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i2 - 1;
                    return;
                }
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            Path path2 = TuitionPaymentFragmentbindingInflater1;
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                Path path3 = g;
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                Path path4 = g;
                path4.reset();
                pathMeasure.getSegment(fMin + length, length, path4, true);
                path2.addPath(path4);
            }
            path.set(path2);
            int i3 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
            if (i3 > 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i3 - 1;
                return;
            }
            return;
        }
        int i4 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i4 > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i4 - 1;
        }
    }

    public static float TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1.0f) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Resources.getSystem().getDisplayMetrics().density;
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static float TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap b(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, RectF rectF, Paint paint) {
        canvas.saveLayer(rectF, paint);
        int i = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i - 1;
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Path path, isSessionReady issessionready) {
        if (issessionready == null || issessionready.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(path, ((onAudioInfoChanged) issessionready.TuitionPaymentFragmentbindingInflater1).d() / 100.0f, ((onAudioInfoChanged) issessionready.TuitionPaymentFragmentspecialinlinedviewModeldefault2).d() / 100.0f, ((onAudioInfoChanged) issessionready.b).d() / 360.0f);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Canvas canvas, RectF rectF, Paint paint) {
        canvas.saveLayer(rectF, paint);
        int i = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i - 1;
        }
    }
}
