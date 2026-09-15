package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class toLabelString extends CameraFilters {
    private /* synthetic */ IBinder TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private /* synthetic */ CameraProviderExecutionState b;

    toLabelString(CameraProviderExecutionState cameraProviderExecutionState, IBinder iBinder) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iBinder;
        this.b = cameraProviderExecutionState;
    }

    @Override // defpackage.CameraFilters
    public final void b() throws Throwable {
        CameraFiltersExternalSyntheticLambda1 cameraControlInternalControlUpdateCallback;
        IBinder iBinder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iBinder == null) {
            cameraControlInternalControlUpdateCallback = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
            cameraControlInternalControlUpdateCallback = iInterfaceQueryLocalInterface instanceof CameraFiltersExternalSyntheticLambda1 ? (CameraFiltersExternalSyntheticLambda1) iInterfaceQueryLocalInterface : new CameraControlInternalControlUpdateCallback(iBinder);
        }
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.notify = cameraControlInternalControlUpdateCallback;
        CameraMode cameraMode = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        CameraInfoInternal cameraInfoInternal = cameraMode.TuitionPaymentFragmentbindingInflater1;
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 4)) {
            CameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cameraInfoInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "linkToDeath", objArr);
        }
        try {
            cameraMode.notify.asBinder().linkToDeath(cameraMode.d, 0);
        } catch (RemoteException e2) {
            cameraMode.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(e2, "linkToDeath failed", new Object[0]);
        }
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.f111a = false;
        Iterator it = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
    }
}
