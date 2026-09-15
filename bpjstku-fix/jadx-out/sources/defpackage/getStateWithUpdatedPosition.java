package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.model.layer.Layer;

/* JADX INFO: loaded from: classes4.dex */
public final class getStateWithUpdatedPosition extends fromMediaSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private binderDied<ColorFilter, ColorFilter> f986a;
    private final Paint asBinder;
    private final Rect asInterface;
    private final Rect notify;

    getStateWithUpdatedPosition(prepare prepareVar, Layer layer) {
        super(prepareVar, layer);
        this.asBinder = new setVolumeTo(3);
        this.notify = new Rect();
        this.asInterface = new Rect();
    }

    @Override // defpackage.fromMediaSession
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        if (bitmapTuitionPaymentFragmentbindingInflater1 == null || bitmapTuitionPaymentFragmentbindingInflater1.isRecycled()) {
            return;
        }
        float fTuitionPaymentFragmentspecialinlinedviewModeldefault2 = onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        this.asBinder.setAlpha(i);
        binderDied<ColorFilter, ColorFilter> binderdied = this.f986a;
        if (binderdied != null) {
            this.asBinder.setColorFilter(binderdied.asInterface());
        }
        canvas.save();
        canvas.concat(matrix);
        this.notify.set(0, 0, bitmapTuitionPaymentFragmentbindingInflater1.getWidth(), bitmapTuitionPaymentFragmentbindingInflater1.getHeight());
        this.asInterface.set(0, 0, (int) (bitmapTuitionPaymentFragmentbindingInflater1.getWidth() * fTuitionPaymentFragmentspecialinlinedviewModeldefault2), (int) (bitmapTuitionPaymentFragmentbindingInflater1.getHeight() * fTuitionPaymentFragmentspecialinlinedviewModeldefault2));
        canvas.drawBitmap(bitmapTuitionPaymentFragmentbindingInflater1, this.notify, this.asInterface, this.asBinder);
        canvas.restore();
    }

    @Override // defpackage.fromMediaSession, defpackage.unregisterCallbackListener
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        Bitmap bitmapTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
        if (bitmapTuitionPaymentFragmentbindingInflater1 != null) {
            rectF.set(0.0f, 0.0f, bitmapTuitionPaymentFragmentbindingInflater1.getWidth() * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), bitmapTuitionPaymentFragmentbindingInflater1.getHeight() * onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.mapRect(rectF);
        }
    }

    private Bitmap TuitionPaymentFragmentbindingInflater1() {
        MediaControllerCompatMediaControllerImplApi23 mediaControllerCompatMediaControllerImplApi23;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannel;
        prepare prepareVar = this.TuitionPaymentFragmentbindingInflater1;
        if (prepareVar.getCallback() == null) {
            mediaControllerCompatMediaControllerImplApi23 = null;
        } else {
            MediaControllerCompatMediaControllerImplApi23 mediaControllerCompatMediaControllerImplApi24 = prepareVar.asInterface;
            if (mediaControllerCompatMediaControllerImplApi24 != null) {
                Drawable.Callback callback = prepareVar.getCallback();
                Context context = (callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext();
                if ((context != null || mediaControllerCompatMediaControllerImplApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) && !mediaControllerCompatMediaControllerImplApi24.TuitionPaymentFragmentspecialinlinedviewModeldefault3.equals(context)) {
                    prepareVar.asInterface = null;
                }
            }
            if (prepareVar.asInterface == null) {
                prepareVar.asInterface = new MediaControllerCompatMediaControllerImplApi23(prepareVar.getCallback(), prepareVar.asBinder, prepareVar.g, prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2.g);
            }
            mediaControllerCompatMediaControllerImplApi23 = prepareVar.asInterface;
        }
        if (mediaControllerCompatMediaControllerImplApi23 != null) {
            return mediaControllerCompatMediaControllerImplApi23.b(str);
        }
        return null;
    }

    @Override // defpackage.fromMediaSession, defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        super.b(t, mediaSessionCompatCallbackCallbackHandler);
        if (t == registerCallbackListener.TuitionPaymentFragmentbindingInflater1) {
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.f986a = null;
            } else {
                this.f986a = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            }
        }
    }
}
