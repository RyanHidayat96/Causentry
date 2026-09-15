package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes6.dex */
public final class rotateBitmap {
    int TuitionPaymentFragmentbindingInflater1;
    public inverseRational TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public WindowManager TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public OrientationEventListener b;

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, inverseRational inverserational) {
        OrientationEventListener orientationEventListener = this.b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.b = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        Context applicationContext = context.getApplicationContext();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = inverserational;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = (WindowManager) applicationContext.getSystemService("window");
        OrientationEventListener orientationEventListener2 = new OrientationEventListener(applicationContext) { // from class: rotateBitmap.4
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                int rotation;
                WindowManager windowManager = rotateBitmap.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                inverseRational inverserational2 = rotateBitmap.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (rotateBitmap.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || inverserational2 == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == rotateBitmap.this.TuitionPaymentFragmentbindingInflater1) {
                    return;
                }
                rotateBitmap.this.TuitionPaymentFragmentbindingInflater1 = rotation;
                inverserational2.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        };
        this.b = orientationEventListener2;
        orientationEventListener2.enable();
        this.TuitionPaymentFragmentbindingInflater1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getDefaultDisplay().getRotation();
    }
}
