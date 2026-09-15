package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public interface MediaBrowserCompatConnectionCallbackStubApi21 extends IInterface {
    public static final String TuitionPaymentFragmentbindingInflater1 = "android$support$customtabs$IPostMessageService".replace(Typography.dollar, '.');

    void onMessageChannelReady(onConnected onconnected, Bundle bundle) throws RemoteException;

    void onPostMessage(onConnected onconnected, String str, Bundle bundle) throws RemoteException;

    public static abstract class b extends Binder implements MediaBrowserCompatConnectionCallbackStubApi21 {
        static final int TRANSACTION_onMessageChannelReady = 2;
        static final int TRANSACTION_onPostMessage = 3;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public b() {
            attachInterface(this, TuitionPaymentFragmentbindingInflater1);
        }

        public static MediaBrowserCompatConnectionCallbackStubApi21 asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(TuitionPaymentFragmentbindingInflater1);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof MediaBrowserCompatConnectionCallbackStubApi21)) {
                return (MediaBrowserCompatConnectionCallbackStubApi21) iInterfaceQueryLocalInterface;
            }
            return new TuitionPaymentFragmentbindingInflater1(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = TuitionPaymentFragmentbindingInflater1;
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                onMessageChannelReady(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
            } else if (i == 3) {
                onPostMessage(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class TuitionPaymentFragmentbindingInflater1 implements MediaBrowserCompatConnectionCallbackStubApi21 {
            private IBinder TuitionPaymentFragmentspecialinlinedviewModeldefault1;

            TuitionPaymentFragmentbindingInflater1(IBinder iBinder) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackStubApi21
            public final void onMessageChannelReady(onConnected onconnected, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentbindingInflater1);
                    parcelObtain.writeStrongInterface(onconnected);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackStubApi21
            public final void onPostMessage(onConnected onconnected, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentbindingInflater1);
                    parcelObtain.writeStrongInterface(onconnected);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
