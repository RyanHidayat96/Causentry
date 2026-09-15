package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.ExifInterface;
import coil.decode.ExifOrientationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"LMediaBrowserCompatApi21ConnectionCallbackProxy;", "", "<init>", "()V", "", "p0", "LRotationProvider1;", "p1", "Lcoil/decode/ExifOrientationPolicy;", "p2", "LMediaBrowserCompatApi21SubscriptionCallbackProxy;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;LRotationProvider1;Lcoil/decode/ExifOrientationPolicy;)LMediaBrowserCompatApi21SubscriptionCallbackProxy;", "Landroid/graphics/Bitmap;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Landroid/graphics/Bitmap;LMediaBrowserCompatApi21SubscriptionCallbackProxy;)Landroid/graphics/Bitmap;", "Landroid/graphics/Paint;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Landroid/graphics/Paint;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaBrowserCompatApi21ConnectionCallbackProxy {
    public static final MediaBrowserCompatApi21ConnectionCallbackProxy INSTANCE = new MediaBrowserCompatApi21ConnectionCallbackProxy();
    private static final Paint TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Paint(3);

    private MediaBrowserCompatApi21ConnectionCallbackProxy() {
    }

    public static MediaBrowserCompatApi21SubscriptionCallbackProxy TuitionPaymentFragmentbindingInflater1(String p0, RotationProvider1 p1, ExifOrientationPolicy p2) {
        if (MediaBrowserCompatApi26.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p2, p0)) {
            ExifInterface exifInterface = new ExifInterface(new MediaBrowserCompatApi21SubscriptionCallback(p1.g().a()));
            return new MediaBrowserCompatApi21SubscriptionCallbackProxy(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
        }
        return MediaBrowserCompatApi21SubscriptionCallbackProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bitmap p0, MediaBrowserCompatApi21SubscriptionCallbackProxy p1) {
        Bitmap bitmapCreateBitmap;
        if (!p1.getB() && !MediaBrowserCompatApi26.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p1)) {
            return p0;
        }
        Matrix matrix = new Matrix();
        float width = p0.getWidth() / 2.0f;
        float height = p0.getHeight() / 2.0f;
        if (p1.getB()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (MediaBrowserCompatApi26.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p1)) {
            matrix.postRotate(p1.getTuitionPaymentFragmentspecialinlinedviewModeldefault2(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, p0.getWidth(), p0.getHeight());
        matrix.mapRect(rectF);
        if (rectF.left != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-rectF.left, -rectF.top);
        }
        if (MediaBrowserCompatApi26.b(p1)) {
            bitmapCreateBitmap = Bitmap.createBitmap(p0.getHeight(), p0.getWidth(), fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0));
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), fastForward.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0));
        }
        new Canvas(bitmapCreateBitmap).drawBitmap(p0, matrix, TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.recycle();
        return bitmapCreateBitmap;
    }
}
