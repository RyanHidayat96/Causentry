package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;

/* JADX INFO: loaded from: classes4.dex */
public final class isActive extends fromMediaSession {
    private final float[] INotificationSideChannel;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private binderDied<ColorFilter, ColorFilter> f1216a;
    private final Layer asBinder;
    private final Paint asInterface;
    private final RectF cancel;
    private final Path notify;

    isActive(prepare prepareVar, Layer layer) {
        super(prepareVar, layer);
        this.cancel = new RectF();
        setVolumeTo setvolumeto = new setVolumeTo();
        this.asInterface = setvolumeto;
        this.INotificationSideChannel = new float[8];
        this.notify = new Path();
        this.asBinder = layer;
        setvolumeto.setAlpha(0);
        setvolumeto.setStyle(Paint.Style.FILL);
        setvolumeto.setColor(layer.onTransact);
    }

    @Override // defpackage.fromMediaSession
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.asBinder.onTransact);
        if (iAlpha != 0) {
            int iIntValue = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * (this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1() == null ? 100 : this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1().asInterface().intValue())) / 100.0f) * 255.0f);
            this.asInterface.setAlpha(iIntValue);
            binderDied<ColorFilter, ColorFilter> binderdied = this.f1216a;
            if (binderdied != null) {
                this.asInterface.setColorFilter(binderdied.asInterface());
            }
            if (iIntValue > 0) {
                float[] fArr = this.INotificationSideChannel;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = this.asBinder.INotificationSideChannelStubProxy;
                float[] fArr2 = this.INotificationSideChannel;
                fArr2[3] = 0.0f;
                fArr2[4] = this.asBinder.INotificationSideChannelStubProxy;
                this.INotificationSideChannel[5] = this.asBinder.cancelAll;
                float[] fArr3 = this.INotificationSideChannel;
                fArr3[6] = 0.0f;
                fArr3[7] = this.asBinder.cancelAll;
                matrix.mapPoints(this.INotificationSideChannel);
                this.notify.reset();
                Path path = this.notify;
                float[] fArr4 = this.INotificationSideChannel;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.notify;
                float[] fArr5 = this.INotificationSideChannel;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.notify;
                float[] fArr6 = this.INotificationSideChannel;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.notify;
                float[] fArr7 = this.INotificationSideChannel;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.notify;
                float[] fArr8 = this.INotificationSideChannel;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.notify.close();
                canvas.drawPath(this.notify, this.asInterface);
            }
        }
    }

    @Override // defpackage.fromMediaSession, defpackage.unregisterCallbackListener
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        this.cancel.set(0.0f, 0.0f, this.asBinder.INotificationSideChannelStubProxy, this.asBinder.cancelAll);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.mapRect(this.cancel);
        rectF.set(this.cancel);
    }

    @Override // defpackage.fromMediaSession, defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        super.b(t, mediaSessionCompatCallbackCallbackHandler);
        if (t == registerCallbackListener.TuitionPaymentFragmentbindingInflater1) {
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.f1216a = null;
            } else {
                this.f1216a = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            }
        }
    }
}
