package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* JADX INFO: loaded from: classes4.dex */
public final class FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternal extends BitmapDrawable {
    private static final Paint b = new Paint();
    private final float TuitionPaymentFragmentbindingInflater1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Drawable asBinder;
    private final Picasso.LoadedFrom asInterface;
    private long d;

    /* JADX WARN: Multi-variable type inference failed */
    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ImageView imageView, Context context, Bitmap bitmap, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternal(context, bitmap, drawable, loadedFrom, z, z2));
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    private FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternal(Context context, Bitmap bitmap, Drawable drawable, Picasso.LoadedFrom loadedFrom, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 255;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z2;
        this.TuitionPaymentFragmentbindingInflater1 = context.getResources().getDisplayMetrics().density;
        this.asInterface = loadedFrom;
        if (loadedFrom == Picasso.LoadedFrom.MEMORY || z) {
            return;
        }
        this.asBinder = drawable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        this.d = SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            super.draw(canvas);
        } else {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.d) / 200.0f;
            if (fUptimeMillis >= 1.0f) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = false;
                this.asBinder = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.asBinder;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * fUptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            Paint paint = b;
            paint.setColor(-1);
            canvas.drawPath(TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) (this.TuitionPaymentFragmentbindingInflater1 * 16.0f)), paint);
            paint.setColor(this.asInterface.debugColor);
            canvas.drawPath(TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) (this.TuitionPaymentFragmentbindingInflater1 * 15.0f)), paint);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        Drawable drawable = this.asBinder;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.asBinder;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.asBinder;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    private static Path TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        float f = i;
        path.lineTo(f, 0.0f);
        path.lineTo(0.0f, f);
        return path;
    }
}
