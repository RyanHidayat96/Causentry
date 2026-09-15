package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.domain.news.model.News;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PostMessageService1 extends ViewModel {
    final ComponentDialogExternalSyntheticLambda0 TuitionPaymentFragmentbindingInflater1;
    final MutableLiveData<VirtualCameraAdapter1<List<News>>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final acquireBuffer b;

    public PostMessageService1(ComponentDialogExternalSyntheticLambda0 componentDialogExternalSyntheticLambda0, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(componentDialogExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentbindingInflater1 = componentDialogExternalSyntheticLambda0;
        this.b = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<List<News>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2) {
        MutableLiveData<VirtualCameraAdapter1<List<News>>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.b(i, i2)));
        final Function1 function1 = new Function1() { // from class: bindSessionToPostMessageService
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostMessageService1.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: unbindFromContext
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setPackageName
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostMessageService1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onPostMessageServiceConnected
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(MutableLiveData mutableLiveData, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        } else {
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(PostMessageService1 postMessageService1, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            MutableLiveData<VirtualCameraAdapter1<List<News>>> mutableLiveData = postMessageService1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        } else {
            MutableLiveData<VirtualCameraAdapter1<List<News>>> mutableLiveData2 = postMessageService1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(MutableLiveData mutableLiveData, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, mutableLiveData);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PostMessageService1 postMessageService1, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, postMessageService1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }
}
