package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface CameraControlInternal1 extends IInterface {
    Bundle TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bundle bundle) throws RemoteException;

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends ProcessingNodeExternalSyntheticLambda3 implements CameraControlInternal1 {

        public static class b extends ProcessingNodeExternalSyntheticLambda2 implements CameraControlInternal1 {
            public b(IBinder iBinder) {
                super(iBinder);
            }

            @Override // defpackage.CameraControlInternal1
            public final Bundle TuitionPaymentFragmentspecialinlinedviewModeldefault2(Bundle bundle) throws RemoteException {
                Parcel parcelTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                parcelTuitionPaymentFragmentspecialinlinedviewModeldefault2.writeInt(1);
                bundle.writeToParcel(parcelTuitionPaymentFragmentspecialinlinedviewModeldefault2, 0);
                Parcel parcelTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(parcelTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                Bundle bundle2 = (Bundle) (parcelTuitionPaymentFragmentspecialinlinedviewModeldefault3.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelTuitionPaymentFragmentspecialinlinedviewModeldefault3));
                parcelTuitionPaymentFragmentspecialinlinedviewModeldefault3.recycle();
                return bundle2;
            }
        }

        @Override // defpackage.ProcessingNodeExternalSyntheticLambda3
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle bundleTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2((Bundle) (parcel.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcel)));
            parcel2.writeNoException();
            if (bundleTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                parcel2.writeInt(0);
            } else {
                parcel2.writeInt(1);
                bundleTuitionPaymentFragmentspecialinlinedviewModeldefault2.writeToParcel(parcel2, 1);
            }
            return true;
        }
    }
}
