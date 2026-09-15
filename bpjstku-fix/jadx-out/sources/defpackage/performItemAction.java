package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.ict.model.request.IctTokenRequest;
import com.bpjstku.domain.ict.model.IctTokenModel;
import com.bpjstku.domain.user.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class performItemAction extends ViewModel {
    private final addContentView TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final MutableLiveData<VirtualCameraAdapter1<IctTokenModel>> b;

    public performItemAction(addContentView addcontentview, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(addcontentview, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = addcontentview;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<IctTokenModel>> mutableLiveData = new MutableLiveData<>();
        this.b = mutableLiveData;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<IctTokenModel>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        addContentView addcontentview = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        User userAsBinder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.asBinder();
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(addcontentview.b(new IctTokenRequest(String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null), str))));
        final Function1 function1 = new Function1() { // from class: restorePresenterStates
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return performItemAction.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (IctTokenModel) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new logToString() { // from class: savePresenterStates
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        }, new saveActionViewStates(new Function1() { // from class: restoreActionViewStates
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return performItemAction.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(performItemAction performitemaction, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, performitemaction.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(performItemAction performitemaction, IctTokenModel ictTokenModel) {
        MutableLiveData<VirtualCameraAdapter1<IctTokenModel>> mutableLiveData = performitemaction.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(ictTokenModel));
        return Unit.INSTANCE;
    }
}
