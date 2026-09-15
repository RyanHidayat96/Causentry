package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.R;
import com.bpjstku.data.lib.exception.RefreshTokenExpiredException;
import com.bpjstku.data.lib.exception.UnauthorisedException;
import com.bpjstku.presentation.membership.login.LoginActivity;
import com.google.gson.JsonSyntaxException;
import com.nbs.nucleo.utils.exception.ApiException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class setRccState {
    public static final <T> void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th, MutableLiveData<VirtualCameraAdapter1<T>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (th instanceof ApiException) {
            VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
            ApiException apiException = (ApiException) th;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(th, Intrinsics.areEqual(apiException.getApiError().getB(), "Invalid Response") ? ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_invalid_response) : apiException.getApiError().getB()));
            return;
        }
        if (th instanceof SocketTimeoutException) {
            VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(th, ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_no_internet_socket)));
            return;
        }
        if (th instanceof IOException) {
            VirtualCameraAdapter1.Companion bVar3 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(th, ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_no_internet_revamp)));
            return;
        }
        if (th instanceof JsonSyntaxException) {
            VirtualCameraAdapter1.Companion bVar4 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(th, ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_error_occured_revamp)));
            return;
        }
        if (th instanceof UnauthorisedException) {
            VirtualCameraAdapter1.Companion bVar5 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_message_session_ends)));
        } else if (th instanceof RefreshTokenExpiredException) {
            LoginActivity.Companion companion = LoginActivity.INSTANCE;
            LoginActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), null, false, 6);
        } else {
            th.printStackTrace();
            VirtualCameraAdapter1.Companion bVar6 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(th, ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getString(R.string.error_unable_to_connect_server)));
        }
    }

    public static /* synthetic */ void b() {
        AudioExecutor1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = Class.forName("getOnBackInvokedDispatcher").getDeclaredField("TuitionPaymentFragmentbindingInflater1");
    }
}
