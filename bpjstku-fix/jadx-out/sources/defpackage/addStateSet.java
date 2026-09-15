package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.complaint.model.request.ComplaintHistoryRequest;
import com.bpjstku.domain.complaint.model.ComplaintDetail;
import com.bpjstku.domain.complaint.model.ComplaintHistory;
import com.bpjstku.domain.user.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class addStateSet extends ViewModel {
    public final String TuitionPaymentFragmentbindingInflater1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final r8lambda54BeH8ZsBru0CXI2CCSP2syNys TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<ComplaintDetail>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final MutableLiveData<VirtualCameraAdapter1<List<ComplaintHistory>>> b;
    public final registerlambda1 d;

    public addStateSet(r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys, acquireBuffer acquirebuffer, registerlambda1 registerlambda1Var) {
        Intrinsics.checkNotNullParameter(r8lambda54beh8zsbru0cxi2ccsp2synys, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r8lambda54beh8zsbru0cxi2ccsp2synys;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        this.d = registerlambda1Var;
        this.TuitionPaymentFragmentbindingInflater1 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        MutableLiveData<VirtualCameraAdapter1<List<ComplaintHistory>>> mutableLiveData = new MutableLiveData<>();
        this.b = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<ComplaintDetail>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        MutableLiveData<VirtualCameraAdapter1<List<ComplaintHistory>>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys r8lambda54beh8zsbru0cxi2ccsp2synys = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        User userAsBinder = this.d.asBinder();
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(r8lambda54beh8zsbru0cxi2ccsp2synys.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ComplaintHistoryRequest(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(companion2, String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null), this.TuitionPaymentFragmentbindingInflater1)))));
        final Function1 function1 = new Function1() { // from class: newDrawable
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addStateSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: isTransitionReversed
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getKeyframeIdAt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return addStateSet.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: indexOfKeyframe
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(addStateSet addstateset, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, addstateset.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(addStateSet addstateset, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, addstateset.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(addStateSet addstateset, ComplaintDetail complaintDetail) {
        MutableLiveData<VirtualCameraAdapter1<ComplaintDetail>> mutableLiveData = addstateset.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(complaintDetail));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(addStateSet addstateset, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<ComplaintHistory>>> mutableLiveData = addstateset.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }
}
