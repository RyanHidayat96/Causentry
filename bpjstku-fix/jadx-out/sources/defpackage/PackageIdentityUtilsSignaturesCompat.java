package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.notification.model.request.NotificationListRequest;
import com.bpjstku.domain.notification.NotificationUseCase;
import com.bpjstku.domain.notification.model.Notification;
import com.bpjstku.domain.user.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PackageIdentityUtilsSignaturesCompat extends ViewModel {
    public final acquireBuffer TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<List<Notification>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final NotificationUseCase TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<getDefaultDarkScrimannotations>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final registerlambda1 asInterface;
    public final PreferenceManager b;
    public final MutableLiveData<VirtualCameraAdapter1<getDefaultDarkScrimannotations>> d;

    public PackageIdentityUtilsSignaturesCompat(PreferenceManager preferenceManager, NotificationUseCase notificationUseCase, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        Intrinsics.checkNotNullParameter(notificationUseCase, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.b = preferenceManager;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = notificationUseCase;
        this.asInterface = registerlambda1Var;
        this.TuitionPaymentFragmentbindingInflater1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<List<Notification>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<getDefaultDarkScrimannotations>> mutableLiveData2 = new MutableLiveData<>();
        this.d = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<getDefaultDarkScrimannotations>> mutableLiveData3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData3;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData2.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData3.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    public final void b(int i) {
        String str;
        MutableLiveData<VirtualCameraAdapter1<List<Notification>>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        NotificationListRequest notificationListRequest = new NotificationListRequest(String.valueOf(i), "20");
        User userAsBinder = this.asInterface.asBinder();
        if (userAsBinder == null || (str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) {
            str = "";
        }
        notificationListRequest.setEmail(str);
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getNotifications(notificationListRequest)));
        final Function1 function1 = new Function1() { // from class: packageMatchesToken
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PackageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: compare
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getFingerprint
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PackageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentbindingInflater1(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getFingerprintCount
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentbindingInflater1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.dispose();
    }

    public static /* synthetic */ Unit b(PackageIdentityUtilsSignaturesCompat packageIdentityUtilsSignaturesCompat, getDefaultDarkScrimannotations getdefaultdarkscrimannotations) {
        MutableLiveData<VirtualCameraAdapter1<getDefaultDarkScrimannotations>> mutableLiveData = packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(getdefaultdarkscrimannotations));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PackageIdentityUtilsSignaturesCompat packageIdentityUtilsSignaturesCompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PackageIdentityUtilsSignaturesCompat packageIdentityUtilsSignaturesCompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, packageIdentityUtilsSignaturesCompat.d);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PackageIdentityUtilsSignaturesCompat packageIdentityUtilsSignaturesCompat, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PackageIdentityUtilsSignaturesCompat packageIdentityUtilsSignaturesCompat, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<Notification>>> mutableLiveData = packageIdentityUtilsSignaturesCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(MutableLiveData mutableLiveData, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        } else {
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(MutableLiveData mutableLiveData, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, mutableLiveData);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PackageIdentityUtilsSignaturesCompat packageIdentityUtilsSignaturesCompat, getDefaultDarkScrimannotations getdefaultdarkscrimannotations) {
        MutableLiveData<VirtualCameraAdapter1<getDefaultDarkScrimannotations>> mutableLiveData = packageIdentityUtilsSignaturesCompat.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(getdefaultdarkscrimannotations));
        return Unit.INSTANCE;
    }
}
