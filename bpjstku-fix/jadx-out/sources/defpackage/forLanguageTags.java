package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.user.model.request.ForgotPasswordByPhoneRequest;
import com.bpjstku.data.user.model.request.ValidationOtpRequest;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import com.bpjstku.domain.user.model.ValidationOtp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class forLanguageTags extends ViewModel {
    private final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<ValidationOtp>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final MutableLiveData<VirtualCameraAdapter1<ForgotPasswordItem>> b;

    public forLanguageTags(registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<ForgotPasswordItem>> mutableLiveData = new MutableLiveData<>();
        this.b = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<ValidationOtp>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData2;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData2.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MutableLiveData<VirtualCameraAdapter1<ForgotPasswordItem>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.b(new ForgotPasswordByPhoneRequest(str, str2))));
        final Function1 function1 = new Function1() { // from class: setFontVariationSettings
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return forLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (ForgotPasswordItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: AppCompatTextHelperApi26Impl
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: access1201
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return forLanguageTags.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: access201
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(ValidationOtpRequest validationOtpRequest) {
        Intrinsics.checkNotNullParameter(validationOtpRequest, "");
        MutableLiveData<VirtualCameraAdapter1<ValidationOtp>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(validationOtpRequest)));
        final Function1 function1 = new Function1() { // from class: AppCompatTextHelperApi24Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return forLanguageTags.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ValidationOtp) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: AppCompatTextView
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: AppCompatTextHelperApi28Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return forLanguageTags.b(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: access1001
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
    }

    public static /* synthetic */ Unit b(forLanguageTags forlanguagetags, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, forlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(forLanguageTags forlanguagetags, ValidationOtp validationOtp) {
        MutableLiveData<VirtualCameraAdapter1<ValidationOtp>> mutableLiveData = forlanguagetags.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(validationOtp));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(forLanguageTags forlanguagetags, ForgotPasswordItem forgotPasswordItem) {
        MutableLiveData<VirtualCameraAdapter1<ForgotPasswordItem>> mutableLiveData = forlanguagetags.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(forgotPasswordItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(forLanguageTags forlanguagetags, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, forlanguagetags.b);
        return Unit.INSTANCE;
    }
}
