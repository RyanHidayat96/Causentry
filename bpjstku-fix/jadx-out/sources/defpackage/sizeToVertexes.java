package defpackage;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public final class sizeToVertexes {
    private static final Collection<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Camera TuitionPaymentFragmentbindingInflater1;
    private final Handler.Callback TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Camera.AutoFocusCallback TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f1404a;
    private boolean asBinder;
    private final boolean asInterface;
    private int b = 1;
    private boolean g;

    static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(sizeToVertexes sizetovertexes) {
        sizetovertexes.g = false;
        return false;
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public sizeToVertexes(Camera camera, CameraSettings cameraSettings) {
        Handler.Callback callback = new Handler.Callback() { // from class: sizeToVertexes.4
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                if (message.what != sizeToVertexes.this.b) {
                    return false;
                }
                sizeToVertexes.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                return true;
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = callback;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Camera.AutoFocusCallback() { // from class: sizeToVertexes.3
            @Override // android.hardware.Camera.AutoFocusCallback
            public final void onAutoFocus(boolean z, Camera camera2) {
                sizeToVertexes.this.f1404a.post(new Runnable() { // from class: sizeToVertexes.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        sizeToVertexes.TuitionPaymentFragmentbindingInflater1(sizeToVertexes.this);
                        sizeToVertexes.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                });
            }
        };
        this.f1404a = new Handler(callback);
        this.TuitionPaymentFragmentbindingInflater1 = camera;
        this.asInterface = cameraSettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && TuitionPaymentFragmentspecialinlinedviewModeldefault2.contains(camera.getParameters().getFocusMode());
        this.asBinder = false;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        synchronized (this) {
            if (!this.asBinder && !this.f1404a.hasMessages(this.b)) {
                Handler handler = this.f1404a;
                handler.sendMessageDelayed(handler.obtainMessage(this.b), 2000L);
            }
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        this.asBinder = false;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (!this.asInterface || this.asBinder || this.g) {
            return;
        }
        try {
            this.TuitionPaymentFragmentbindingInflater1.autoFocus(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            this.g = true;
        } catch (RuntimeException unused) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.asBinder = true;
        this.g = false;
        this.f1404a.removeMessages(this.b);
        if (this.asInterface) {
            try {
                this.TuitionPaymentFragmentbindingInflater1.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }
}
