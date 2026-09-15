package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.rd.animation.type.AnimationType;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_AudioSpec extends AudioStatsAudioState {
    private Paint TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public AutoValue_AudioSpec(Paint paint, AudioStats audioStats) {
        super(paint, audioStats);
        Paint paint2 = new Paint();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setAntiAlias(true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setStrokeWidth(audioStats.IconCompatParcelizer);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, int i, boolean z, int i2, int i3) {
        Paint paint;
        float f = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
        int i4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.IconCompatParcelizer;
        float f2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.RemoteActionCompatParcelizer;
        int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
        int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
        int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.connect;
        AudioStats audioStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (audioStats.b == null) {
            audioStats.b = AnimationType.NONE;
        }
        AnimationType animationType = audioStats.b;
        if ((animationType == AnimationType.SCALE && !z) || (animationType == AnimationType.SCALE_DOWN && z)) {
            f *= f2;
        }
        if (i != i7) {
            i5 = i6;
        }
        if (animationType == AnimationType.FILL && i != i7) {
            paint = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            paint.setStrokeWidth(i4);
        } else {
            paint = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        paint.setColor(i5);
        canvas.drawCircle(i2, i3, f, paint);
    }
}
