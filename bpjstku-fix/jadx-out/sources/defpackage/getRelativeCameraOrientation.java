package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.util.Objects;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
final class getRelativeCameraOrientation {
    private static final BitmapPool TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new AnonymousClass1();

    /* JADX INFO: renamed from: getRelativeCameraOrientation$1, reason: invalid class name */
    public class AnonymousClass1 extends CameraX {
        @Override // defpackage.CameraX, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool
        public final void TuitionPaymentFragmentbindingInflater1(Bitmap bitmap) {
        }

        AnonymousClass1() {
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            scheduleWithFixedDelay.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = isShutdown.b[0];
        }
    }

    static Resource<Bitmap> TuitionPaymentFragmentspecialinlinedviewModeldefault2(BitmapPool bitmapPool, Drawable drawable, int i, int i2) {
        Bitmap bitmapB;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapB = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapB = null;
        } else {
            bitmapB = b(bitmapPool, current, i, i2);
            z = true;
        }
        if (!z) {
            bitmapPool = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
        return ConcurrentCameraSingleCameraConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bitmapB, bitmapPool);
    }

    private static Bitmap b(BitmapPool bitmapPool, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Objects.toString(drawable);
            }
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Objects.toString(drawable);
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock lockTuitionPaymentFragmentspecialinlinedviewModeldefault1 = ExperimentalCameraInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        lockTuitionPaymentFragmentspecialinlinedviewModeldefault1.lock();
        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = bitmapPool.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } finally {
            lockTuitionPaymentFragmentspecialinlinedviewModeldefault1.unlock();
        }
    }
}
