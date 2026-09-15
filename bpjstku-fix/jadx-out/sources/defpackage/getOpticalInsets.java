package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.user.model.request.LoginRequest;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.domain.user.model.UserAccessToken;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class getOpticalInsets extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<onRestoreInstanceState>> TuitionPaymentFragmentbindingInflater1;
    private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<User>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<UserAccessToken>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final PreferenceManager asInterface;
    public final registerlambda1 b;
    private String g;

    public getOpticalInsets(registerlambda1 registerlambda1Var, PreferenceManager preferenceManager, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.b = registerlambda1Var;
        this.asInterface = preferenceManager;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<User>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData;
        this.TuitionPaymentFragmentbindingInflater1 = new MutableLiveData<>();
        MutableLiveData<VirtualCameraAdapter1<UserAccessToken>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData2;
        this.g = "";
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void b(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8) {
        Intrinsics.checkNotNullParameter(str3, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (((CharSequence) objectRef.element).length() == 0) {
            Intrinsics.checkNotNull(FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener() { // from class: DrawableUtilsApi29Impl
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    getOpticalInsets.TuitionPaymentFragmentspecialinlinedviewModeldefault3(objectRef, this, str, str2, str3, str4, str5, str6, str7, str8, task);
                }
            }));
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2((String) objectRef.element, str, str2, str3, str4, str5, str6, str7, str8);
        }
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        MutableLiveData<VirtualCameraAdapter1<User>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new LoginRequest(str2, str3, str, str4, str5, str6, str7, str8, str9))));
        final Function1 function1 = new Function1() { // from class: forceDrawableStateChange
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOpticalInsets.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (User) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: parseTintMode
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: DrawableUtilsApi18Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getOpticalInsets.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getOpticalBounds
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getOpticalInsets getopticalinsets, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getopticalinsets.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getOpticalInsets getopticalinsets, User user) {
        getopticalinsets.g = PreferenceManager.getString$default(getopticalinsets.asInterface, "LOGIN_STATUS", null, 2, null);
        if (user != null) {
            user.INotificationSideChannelDefault = PreferenceManager.getString$default(getopticalinsets.asInterface, "LOGIN_STATUS", null, 2, null);
        }
        MutableLiveData<VirtualCameraAdapter1<User>> mutableLiveData = getopticalinsets.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(user));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object] */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Ref.ObjectRef objectRef, getOpticalInsets getopticalinsets, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Task task) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter(task, "");
        if (!task.isSuccessful() || (charSequence = (CharSequence) task.getResult()) == null || charSequence.length() == 0) {
            return;
        }
        objectRef.element = task.getResult();
        getopticalinsets.TuitionPaymentFragmentspecialinlinedviewModeldefault2((String) objectRef.element, str, str2, str3, str4, str5, str6, str7, str8);
    }
}
