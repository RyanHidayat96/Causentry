package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.mlt.model.request.MltRequest;
import com.bpjstku.domain.mlt.model.MltItem;
import com.bpjstku.domain.user.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaonVerticalScrollEvent0 extends ViewModel {
    private final onLaunchlambda1 TuitionPaymentFragmentbindingInflater1;
    private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final MutableLiveData<VirtualCameraAdapter1<MltItem>> b;

    public lambdaonVerticalScrollEvent0(onLaunchlambda1 onlaunchlambda1, acquireBuffer acquirebuffer, registerlambda1 registerlambda1Var) {
        Intrinsics.checkNotNullParameter(onlaunchlambda1, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        this.TuitionPaymentFragmentbindingInflater1 = onlaunchlambda1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = acquirebuffer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = registerlambda1Var;
        MutableLiveData<VirtualCameraAdapter1<MltItem>> mutableLiveData = new MutableLiveData<>();
        this.b = mutableLiveData;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    public final void b() {
        MutableLiveData<VirtualCameraAdapter1<MltItem>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder();
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(new MltRequest(String.valueOf(userAsBinder != null ? userAsBinder.b : null), String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null), String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null), "JMOANDROID"))));
        final Function1 function1 = new Function1() { // from class: CustomTabsSession1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaonVerticalScrollEvent0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (MltItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: lambdaonGreatestScrollPercentageIncreased1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: lambdaonSessionEnded2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaonVerticalScrollEvent0.TuitionPaymentFragmentbindingInflater1(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onVerticalScrollEvent
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(lambdaonVerticalScrollEvent0 lambdaonverticalscrollevent0, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, lambdaonverticalscrollevent0.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaonVerticalScrollEvent0 lambdaonverticalscrollevent0, MltItem mltItem) {
        MutableLiveData<VirtualCameraAdapter1<MltItem>> mutableLiveData = lambdaonverticalscrollevent0.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(mltItem));
        return Unit.INSTANCE;
    }
}
