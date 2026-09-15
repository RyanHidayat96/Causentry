package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public interface MediaBrowserCompatCustomActionCallback extends IInterface {
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace(Typography.dollar, '.');

    void onExtraCallback(String str, Bundle bundle) throws RemoteException;

    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends Binder implements MediaBrowserCompatCustomActionCallback {
        static final int TRANSACTION_onExtraCallback = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            attachInterface(this, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public static MediaBrowserCompatCustomActionCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof MediaBrowserCompatCustomActionCallback)) {
                return (MediaBrowserCompatCustomActionCallback) iInterfaceQueryLocalInterface;
            }
            return new C0003TuitionPaymentFragmentspecialinlinedviewModeldefault3(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                onExtraCallback(parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionCallback$TuitionPaymentFragmentspecialinlinedviewModeldefault3$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: collision with other inner class name */
        static class C0003TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements MediaBrowserCompatCustomActionCallback {
            private IBinder TuitionPaymentFragmentbindingInflater1;

            C0003TuitionPaymentFragmentspecialinlinedviewModeldefault3(IBinder iBinder) {
                this.TuitionPaymentFragmentbindingInflater1 = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.TuitionPaymentFragmentbindingInflater1;
            }

            @Override // defpackage.MediaBrowserCompatCustomActionCallback
            public final void onExtraCallback(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
