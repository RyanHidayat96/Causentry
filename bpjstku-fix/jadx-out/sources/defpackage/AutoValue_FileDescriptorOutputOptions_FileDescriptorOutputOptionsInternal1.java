package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes5.dex */
public class AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1 extends AudioStatsAudioState {
    public RectF b;

    public AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1(Paint paint, AudioStats audioStats) {
        super(paint, audioStats);
        this.b = new RectF();
    }

    public void b(Canvas canvas, ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda0, int i, int i2) {
        if (processCameraProviderCompanionExternalSyntheticLambda0 instanceof ProcessCameraProvidergetOrCreateCameraXInstance1111) {
            ProcessCameraProvidergetOrCreateCameraXInstance1111 processCameraProvidergetOrCreateCameraXInstance1111 = (ProcessCameraProvidergetOrCreateCameraXInstance1111) processCameraProviderCompanionExternalSyntheticLambda0;
            int i3 = processCameraProvidergetOrCreateCameraXInstance1111.TuitionPaymentFragmentbindingInflater1;
            int i4 = processCameraProvidergetOrCreateCameraXInstance1111.b;
            int i5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
            int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
            int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
            AudioStats audioStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (audioStats.INotificationSideChannel == null) {
                audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats.INotificationSideChannel == Orientation.HORIZONTAL) {
                this.b.left = i3;
                this.b.right = i4;
                this.b.top = i2 - i5;
                this.b.bottom = i2 + i5;
            } else {
                this.b.left = i - i5;
                this.b.right = i + i5;
                this.b.top = i3;
                this.b.bottom = i4;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i6);
            float f = i;
            float f2 = i2;
            float f3 = i5;
            canvas.drawCircle(f, f2, f3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i7);
            canvas.drawRoundRect(this.b, f3, f3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }
}
