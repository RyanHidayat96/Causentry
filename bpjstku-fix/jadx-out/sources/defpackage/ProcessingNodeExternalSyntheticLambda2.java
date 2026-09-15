package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class ProcessingNodeExternalSyntheticLambda2 implements IInterface {
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
    private final IBinder TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public final Parcel TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return parcelObtain;
    }

    public final Parcel TuitionPaymentFragmentspecialinlinedviewModeldefault2(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public ProcessingNodeExternalSyntheticLambda2(IBinder iBinder) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
