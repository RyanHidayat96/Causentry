package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.rd.draw.data.Orientation;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoValue_AudioSpecBuilder extends AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1 {
    public AutoValue_AudioSpecBuilder(Paint paint, AudioStats audioStats) {
        super(paint, audioStats);
    }

    @Override // defpackage.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal1
    public final void b(Canvas canvas, ProcessCameraProviderCompanionExternalSyntheticLambda0 processCameraProviderCompanionExternalSyntheticLambda0, int i, int i2) {
        if (processCameraProviderCompanionExternalSyntheticLambda0 instanceof ProcessCameraProviderExtKt) {
            ProcessCameraProviderExtKt processCameraProviderExtKt = (ProcessCameraProviderExtKt) processCameraProviderCompanionExternalSyntheticLambda0;
            int i3 = processCameraProviderExtKt.TuitionPaymentFragmentbindingInflater1;
            int i4 = processCameraProviderExtKt.b;
            int i5 = processCameraProviderExtKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1 / 2;
            int i6 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStub;
            int i7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.write;
            int i8 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INotificationSideChannelStubProxy;
            AudioStats audioStats = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (audioStats.INotificationSideChannel == null) {
                audioStats.INotificationSideChannel = Orientation.HORIZONTAL;
            }
            if (audioStats.INotificationSideChannel == Orientation.HORIZONTAL) {
                this.b.left = i3;
                this.b.right = i4;
                this.b.top = i2 - i5;
                this.b.bottom = i5 + i2;
            } else {
                this.b.left = i - i5;
                this.b.right = i5 + i;
                this.b.top = i3;
                this.b.bottom = i4;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i7);
            float f = i;
            float f2 = i2;
            float f3 = i6;
            canvas.drawCircle(f, f2, f3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setColor(i8);
            canvas.drawRoundRect(this.b, f3, f3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }
}
