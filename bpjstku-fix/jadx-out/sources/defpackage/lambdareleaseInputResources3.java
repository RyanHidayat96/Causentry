package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdareleaseInputResources3 {
    public static final String TuitionPaymentFragmentbindingInflater1;
    public final matchAndPropagateImage TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final BitmapEffect TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final Application TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final CameraCapturePipeline asInterface;
    public CameraRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1 b;
    public final addEffect d;
    public final AtomicBoolean g = new AtomicBoolean(false);

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append("AppStartController");
        TuitionPaymentFragmentbindingInflater1 = sb.toString();
    }

    public lambdareleaseInputResources3(addEffect addeffect, matchAndPropagateImage matchandpropagateimage, CameraCapturePipeline cameraCapturePipeline, Application application) {
        this.d = addeffect;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = matchandpropagateimage;
        this.asInterface = cameraCapturePipeline;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = application;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new BitmapEffect(this, addeffect);
    }

    public final void TuitionPaymentFragmentbindingInflater1(setViewPort setviewport, String str) {
        if (this.g.compareAndSet(false, true)) {
            this.b.TuitionPaymentFragmentbindingInflater1 = setviewport;
            this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            CameraRequest cameraRequest = new CameraRequest(this.b, (byte) 0);
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                ViewPort.TuitionPaymentFragmentspecialinlinedviewModeldefault2("AppStart action completed: ".concat(String.valueOf(cameraRequest)));
            }
            this.asInterface.TuitionPaymentFragmentbindingInflater1(cameraRequest);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.unregisterActivityLifecycleCallbacks(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }
}
