package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import com.journeyapps.barcodescanner.camera.CameraSettings;

/* JADX INFO: loaded from: classes6.dex */
public final class EncoderProfilesProxyImmutableEncoderProfilesProxy implements SensorEventListener {
    public CameraSettings TuitionPaymentFragmentbindingInflater1;
    yuvImageToJpegByteArray TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public Context TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private Handler TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Handler();
    public Sensor b;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public EncoderProfilesProxyImmutableEncoderProfilesProxy(Context context, yuvImageToJpegByteArray yuvimagetojpegbytearray, CameraSettings cameraSettings) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = context;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = yuvimagetojpegbytearray;
        this.TuitionPaymentFragmentbindingInflater1 = cameraSettings;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        final boolean z = false;
        float f = sensorEvent.values[0];
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
            if (f <= 45.0f) {
                final boolean z2 = true;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.post(new Runnable() { // from class: EncoderProfilesProxyImmutableEncoderProfilesProxy.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderProfilesProxyImmutableEncoderProfilesProxy.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(z2);
                    }
                });
            } else if (f >= 450.0f) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.post(new Runnable() { // from class: EncoderProfilesProxyImmutableEncoderProfilesProxy.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        EncoderProfilesProxyImmutableEncoderProfilesProxy.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(z);
                    }
                });
            }
        }
    }
}
