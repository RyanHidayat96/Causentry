package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class isFrontFacing extends CameraFilters {
    private /* synthetic */ CameraMode TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public isFrontFacing(CameraMode cameraMode) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cameraMode;
    }

    @Override // defpackage.CameraFilters
    public final void b() {
        synchronized (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.g) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onTransact.get() > 0 && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.onTransact.decrementAndGet() > 0) {
                CameraInfoInternal cameraInfoInternal = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                Object[] objArr = new Object[0];
                if (Log.isLoggable("PlayCore", 4)) {
                    CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Leaving the connection open for other ongoing calls.", objArr);
                }
                return;
            }
            CameraMode cameraMode = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (cameraMode.notify != null) {
                CameraInfoInternal cameraInfoInternal2 = cameraMode.TuitionPaymentFragmentbindingInflater1;
                Object[] objArr2 = new Object[0];
                if (Log.isLoggable("PlayCore", 4)) {
                    CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "Unbind from service.", objArr2);
                }
                CameraMode cameraMode2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                cameraMode2.b.unbindService(cameraMode2.INotificationSideChannel);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f111a = false;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.notify = null;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannel = null;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }
    }
}
