package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.partners.model.request.GetPartnerRequest;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.partners.model.Partner;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class canPositionSelectorForHoveredItem extends ViewModel {
    public final reportRunnablelambda0 TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<List<Partner>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> b;

    public canPositionSelectorForHoveredItem(reportRunnablelambda0 reportrunnablelambda0, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(reportrunnablelambda0, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentbindingInflater1 = reportrunnablelambda0;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData2 = new MutableLiveData<>();
        this.b = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<List<Partner>>> mutableLiveData3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(GetPartnerRequest getPartnerRequest) {
        Intrinsics.checkNotNullParameter(getPartnerRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<Partner>>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getPartnerRequest)));
        final Function1 function1 = new Function1() { // from class: DropDownListViewApi30Impl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return canPositionSelectorForHoveredItem.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: positionSelectorForHoveredItem
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: drawableHotspotChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return canPositionSelectorForHoveredItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: DropDownListViewPreApi33Impl
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(canPositionSelectorForHoveredItem canpositionselectorforhovereditem, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<Partner>>> mutableLiveData = canpositionselectorforhovereditem.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(canPositionSelectorForHoveredItem canpositionselectorforhovereditem, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, canpositionselectorforhovereditem.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }
}
