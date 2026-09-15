package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.programinfo.model.request.ProgramInfoRequest;
import com.bpjstku.domain.programinfo.ProgramUseCase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class isUltraHdrOn extends ViewModel {
    private final ProgramUseCase TuitionPaymentFragmentbindingInflater1;
    private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<r8lambdadPEOltVNxwFUffOSXiaKZsPUiI>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public isUltraHdrOn(ProgramUseCase programUseCase, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(programUseCase, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentbindingInflater1 = programUseCase;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<r8lambdadPEOltVNxwFUffOSXiaKZsPUiI>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<r8lambdadPEOltVNxwFUffOSXiaKZsPUiI>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.geProgram(new ProgramInfoRequest(str))));
        final getRequiredMaxBitDepth getrequiredmaxbitdepth = new getRequiredMaxBitDepth(this);
        logToString logtostring = new logToString() { // from class: CamcorderProfileHelper
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                getrequiredmaxbitdepth.invoke(obj);
            }
        };
        final Function1 function1 = new Function1() { // from class: getCameraMode
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isUltraHdrOn.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isPreviewStabilizationOn
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(isUltraHdrOn isultrahdron, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, isultrahdron.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isUltraHdrOn isultrahdron, r8lambdadPEOltVNxwFUffOSXiaKZsPUiI r8lambdadpeoltvnxwfuffosxiakzspuii) {
        MutableLiveData<VirtualCameraAdapter1<r8lambdadPEOltVNxwFUffOSXiaKZsPUiI>> mutableLiveData = isultrahdron.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(r8lambdadpeoltvnxwfuffosxiakzspuii));
        return Unit.INSTANCE;
    }
}
