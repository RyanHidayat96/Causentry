package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public class CameraDeviceSurfaceManagerProvider implements IInterface {
    private final String TuitionPaymentFragmentbindingInflater1 = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";
    private final IBinder TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    protected final void TuitionPaymentFragmentbindingInflater1(Parcel parcel) throws RemoteException {
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.TuitionPaymentFragmentbindingInflater1);
        return parcelObtain;
    }

    protected CameraDeviceSurfaceManagerProvider(IBinder iBinder) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
