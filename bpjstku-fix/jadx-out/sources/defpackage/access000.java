package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.PreferenceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class access000 extends ViewModel {
    private final PreferenceManager TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final ComponentActivityReportFullyDrawnExecutorImplExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<setCurrentRunnable>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final acquireBuffer b;

    public access000(ComponentActivityReportFullyDrawnExecutorImplExternalSyntheticLambda0 componentActivityReportFullyDrawnExecutorImplExternalSyntheticLambda0, PreferenceManager preferenceManager, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(componentActivityReportFullyDrawnExecutorImplExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = componentActivityReportFullyDrawnExecutorImplExternalSyntheticLambda0;
        this.TuitionPaymentFragmentbindingInflater1 = preferenceManager;
        this.b = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<setCurrentRunnable>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MutableLiveData<>();
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        MutableLiveData<VirtualCameraAdapter1<setCurrentRunnable>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
        final Function1 function1 = new Function1() { // from class: MenuItemWrapperICS
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return access000.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (setCurrentRunnable) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: overridesItemVisibility
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setVisibilityListener
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return access000.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onPerformDefaultAction
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit b(access000 access000Var, setCurrentRunnable setcurrentrunnable) {
        MutableLiveData<VirtualCameraAdapter1<setCurrentRunnable>> mutableLiveData = access000Var.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(setcurrentrunnable));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(access000 access000Var, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, access000Var.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }
}
