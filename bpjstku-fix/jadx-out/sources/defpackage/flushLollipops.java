package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.banner.model.request.BannerRequest;
import com.bpjstku.domain.banner.model.Banner;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class flushLollipops extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<List<Banner>>> TuitionPaymentFragmentbindingInflater1;
    private final ActivityViewModelLazyKtviewModels3 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final acquireBuffer b;

    public flushLollipops(ActivityViewModelLazyKtviewModels3 activityViewModelLazyKtviewModels3, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(activityViewModelLazyKtviewModels3, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = activityViewModelLazyKtviewModels3;
        this.b = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<List<Banner>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(BannerRequest bannerRequest) {
        Intrinsics.checkNotNullParameter(bannerRequest, "");
        MutableLiveData<VirtualCameraAdapter1<List<Banner>>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(bannerRequest)));
        final Function1 function1 = new Function1() { // from class: flushMarshmallows
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return flushLollipops.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: flushNougats
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: flush
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return flushLollipops.b(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ToolbarActionBar
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.b.isDisposed()) {
            return;
        }
        this.b.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(flushLollipops flushlollipops, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<Banner>>> mutableLiveData = flushlollipops.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(flushLollipops flushlollipops, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, flushlollipops.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }
}
