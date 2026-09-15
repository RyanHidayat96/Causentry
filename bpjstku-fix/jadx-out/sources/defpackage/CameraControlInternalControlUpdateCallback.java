package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public final class CameraControlInternalControlUpdateCallback extends CameraDeviceSurfaceManagerProvider implements CameraFiltersExternalSyntheticLambda1 {
    CameraControlInternalControlUpdateCallback(IBinder iBinder) {
        super(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.CameraFiltersExternalSyntheticLambda1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, Bundle bundle, CameraFiltersExternalSyntheticLambda0 cameraFiltersExternalSyntheticLambda0) throws RemoteException {
        Parcel parcelTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        parcelTuitionPaymentFragmentspecialinlinedviewModeldefault2.writeString(str);
        parcelTuitionPaymentFragmentspecialinlinedviewModeldefault2.writeInt(1);
        bundle.writeToParcel(parcelTuitionPaymentFragmentspecialinlinedviewModeldefault2, 0);
        parcelTuitionPaymentFragmentspecialinlinedviewModeldefault2.writeStrongBinder(cameraFiltersExternalSyntheticLambda0);
        TuitionPaymentFragmentbindingInflater1(parcelTuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}
