package defpackage;

import android.provider.Settings;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.user.model.request.ForgotPasswd;
import com.bpjstku.data.user.model.request.ForgotPasswordByEmailRequest;
import com.bpjstku.data.user.model.response.ForgotPasswordItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cleanupAutoSizePresetSizes extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<ForgotPasswordItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public cleanupAutoSizePresetSizes(registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<ForgotPasswordItem>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    public final void b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MutableLiveData<VirtualCameraAdapter1<ForgotPasswordItem>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        registerlambda1 registerlambda1Var = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String string = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(registerlambda1Var.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ForgotPasswordByEmailRequest(str, string, str2))));
        final Function1 function1 = new Function1() { // from class: getTextViewMethod
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cleanupAutoSizePresetSizes.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (ForgotPasswordItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: findLargestTextSizeWhichFits
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setupAutoSizeUniformPresetSizes
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cleanupAutoSizePresetSizes.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: suggestedSizeFitsInSpace
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<ForgotPasswordItem>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        registerlambda1 registerlambda1Var = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String string = Settings.Secure.getString(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getContentResolver(), "android_id");
        Intrinsics.checkExpressionValueIsNotNull(string, "");
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(registerlambda1Var.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ForgotPasswd(str, string))));
        final Function1 function1 = new Function1() { // from class: setupAutoSizeUniformPresetSizesConfiguration
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cleanupAutoSizePresetSizes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (ForgotPasswordItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: setupAutoSizeText
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setRawTextSize
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return cleanupAutoSizePresetSizes.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: initTempTextPaint
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(cleanupAutoSizePresetSizes cleanupautosizepresetsizes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, cleanupautosizepresetsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(cleanupAutoSizePresetSizes cleanupautosizepresetsizes, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, cleanupautosizepresetsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(cleanupAutoSizePresetSizes cleanupautosizepresetsizes, ForgotPasswordItem forgotPasswordItem) {
        MutableLiveData<VirtualCameraAdapter1<ForgotPasswordItem>> mutableLiveData = cleanupautosizepresetsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(forgotPasswordItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(cleanupAutoSizePresetSizes cleanupautosizepresetsizes, ForgotPasswordItem forgotPasswordItem) {
        MutableLiveData<VirtualCameraAdapter1<ForgotPasswordItem>> mutableLiveData = cleanupautosizepresetsizes.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(forgotPasswordItem));
        return Unit.INSTANCE;
    }
}
