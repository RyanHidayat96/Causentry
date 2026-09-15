package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes5.dex */
public interface MediaBrowserCompatConnectionCallbackConnectionCallbackInternal extends IInterface {
    public static final String TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "android$support$customtabs$ICustomTabsService".replace(Typography.dollar, '.');

    Bundle extraCommand(String str, Bundle bundle) throws RemoteException;

    boolean isEngagementSignalsApiAvailable(onConnected onconnected, Bundle bundle) throws RemoteException;

    boolean mayLaunchUrl(onConnected onconnected, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean newSession(onConnected onconnected) throws RemoteException;

    boolean newSessionWithExtras(onConnected onconnected, Bundle bundle) throws RemoteException;

    int postMessage(onConnected onconnected, String str, Bundle bundle) throws RemoteException;

    boolean receiveFile(onConnected onconnected, Uri uri, int i, Bundle bundle) throws RemoteException;

    boolean requestPostMessageChannel(onConnected onconnected, Uri uri) throws RemoteException;

    boolean requestPostMessageChannelWithExtras(onConnected onconnected, Uri uri, Bundle bundle) throws RemoteException;

    boolean setEngagementSignalsCallback(onConnected onconnected, IBinder iBinder, Bundle bundle) throws RemoteException;

    boolean updateVisuals(onConnected onconnected, Bundle bundle) throws RemoteException;

    boolean validateRelationship(onConnected onconnected, int i, Uri uri, Bundle bundle) throws RemoteException;

    boolean warmup(long j) throws RemoteException;

    public static abstract class b extends Binder implements MediaBrowserCompatConnectionCallbackConnectionCallbackInternal {
        static final int TRANSACTION_extraCommand = 5;
        static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
        static final int TRANSACTION_mayLaunchUrl = 4;
        static final int TRANSACTION_newSession = 3;
        static final int TRANSACTION_newSessionWithExtras = 10;
        static final int TRANSACTION_postMessage = 8;
        static final int TRANSACTION_receiveFile = 12;
        static final int TRANSACTION_requestPostMessageChannel = 7;
        static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
        static final int TRANSACTION_setEngagementSignalsCallback = 14;
        static final int TRANSACTION_updateVisuals = 6;
        static final int TRANSACTION_validateRelationship = 9;
        static final int TRANSACTION_warmup = 2;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public b() {
            attachInterface(this, TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        public static MediaBrowserCompatConnectionCallbackConnectionCallbackInternal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof MediaBrowserCompatConnectionCallbackConnectionCallbackInternal)) {
                return (MediaBrowserCompatConnectionCallbackConnectionCallbackInternal) iInterfaceQueryLocalInterface;
            }
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(iBinder);
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
            switch (i) {
                case 2:
                    boolean zWarmup = warmup(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zWarmup ? 1 : 0);
                    return true;
                case 3:
                    boolean zNewSession = newSession(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSession ? 1 : 0);
                    return true;
                case 4:
                    boolean zMayLaunchUrl = mayLaunchUrl(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), (Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zMayLaunchUrl ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleExtraCommand = extraCommand(parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    if (bundleExtraCommand != null) {
                        parcel2.writeInt(1);
                        bundleExtraCommand.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    boolean zUpdateVisuals = updateVisuals(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateVisuals ? 1 : 0);
                    return true;
                case 7:
                    boolean zRequestPostMessageChannel = requestPostMessageChannel(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), (Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannel ? 1 : 0);
                    return true;
                case 8:
                    int iPostMessage = postMessage(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(iPostMessage);
                    return true;
                case 9:
                    boolean zValidateRelationship = validateRelationship(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), parcel.readInt(), (Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(zValidateRelationship ? 1 : 0);
                    return true;
                case 10:
                    boolean zNewSessionWithExtras = newSessionWithExtras(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(zNewSessionWithExtras ? 1 : 0);
                    return true;
                case 11:
                    boolean zRequestPostMessageChannelWithExtras = requestPostMessageChannelWithExtras(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), (Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(zRequestPostMessageChannelWithExtras ? 1 : 0);
                    return true;
                case 12:
                    boolean zReceiveFile = receiveFile(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), (Uri) (parcel.readInt() != 0 ? Uri.CREATOR.createFromParcel(parcel) : null), parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(zReceiveFile ? 1 : 0);
                    return true;
                case 13:
                    boolean zIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsEngagementSignalsApiAvailable ? 1 : 0);
                    return true;
                case 14:
                    boolean engagementSignalsCallback = setEngagementSignalsCallback(onConnected.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asInterface(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    parcel2.writeInt(engagementSignalsCallback ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements MediaBrowserCompatConnectionCallbackConnectionCallbackInternal {
            private IBinder TuitionPaymentFragmentbindingInflater1;

            TuitionPaymentFragmentspecialinlinedviewModeldefault2(IBinder iBinder) {
                this.TuitionPaymentFragmentbindingInflater1 = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.TuitionPaymentFragmentbindingInflater1;
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean warmup(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeLong(j);
                    this.TuitionPaymentFragmentbindingInflater1.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean newSession(onConnected onconnected) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    this.TuitionPaymentFragmentbindingInflater1.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean newSessionWithExtras(onConnected onconnected, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean mayLaunchUrl(onConnected onconnected, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (list == null) {
                        parcelObtain.writeInt(-1);
                    } else {
                        int size = list.size();
                        parcelObtain.writeInt(size);
                        for (int i = 0; i < size; i++) {
                            Bundle bundle2 = list.get(i);
                            if (bundle2 != null) {
                                parcelObtain.writeInt(1);
                                bundle2.writeToParcel(parcelObtain, 0);
                            } else {
                                parcelObtain.writeInt(0);
                            }
                        }
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final Bundle extraCommand(String str, Bundle bundle) throws RemoteException {
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
                    this.TuitionPaymentFragmentbindingInflater1.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) (parcelObtain2.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcelObtain2) : null);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean updateVisuals(onConnected onconnected, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean requestPostMessageChannel(onConnected onconnected, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean requestPostMessageChannelWithExtras(onConnected onconnected, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final int postMessage(onConnected onconnected, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean validateRelationship(onConnected onconnected, int i, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    parcelObtain.writeInt(i);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean receiveFile(onConnected onconnected, Uri uri, int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeInt(i);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean isEngagementSignalsApiAvailable(onConnected onconnected, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // defpackage.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal
            public final boolean setEngagementSignalsCallback(onConnected onconnected, IBinder iBinder, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    parcelObtain.writeStrongInterface(onconnected);
                    parcelObtain.writeStrongBinder(iBinder);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.TuitionPaymentFragmentbindingInflater1.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
