package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
final class CameraProviderExecutionState implements ServiceConnection {
    final /* synthetic */ CameraMode TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        CameraInfoInternal cameraInfoInternal = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
        Object[] objArr = {componentName};
        if (Log.isLoggable("PlayCore", 4)) {
            CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "ServiceConnectionImpl.onServiceConnected(%s)", objArr);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b().post(new toLabelString(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        CameraInfoInternal cameraInfoInternal = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
        Object[] objArr = {componentName};
        if (Log.isLoggable("PlayCore", 4)) {
            CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "ServiceConnectionImpl.onServiceDisconnected(%s)", objArr);
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b().post(new CameraModeMode(this));
    }
}
