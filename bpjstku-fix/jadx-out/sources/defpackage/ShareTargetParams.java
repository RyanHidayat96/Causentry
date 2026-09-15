package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.podcast.model.request.PodcastLogRequest;
import com.bpjstku.domain.podcast.model.PodcastVideoList;
import com.bpjstku.domain.user.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareTargetParams extends ViewModel {
    public final addCallback TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public PodcastVideoList TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final MutableLiveData<VirtualCameraAdapter1<List<PodcastVideoList>>> asInterface;
    public boolean b;
    public final registerlambda1 d;

    public ShareTargetParams(addCallback addcallback, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(addcallback, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentbindingInflater1 = addcallback;
        this.d = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<List<PodcastVideoList>>> mutableLiveData = new MutableLiveData<>();
        this.asInterface = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.d.asBinder();
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new PodcastLogRequest(str, str2, String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null), "", str3))));
        final Function1 function1 = new Function1() { // from class: SplashScreenVersion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareTargetParams.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (BaseItem) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: lambdadefaultConfig1
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: Camera2ConfigExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ShareTargetParams.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: lambdadefaultConfig0
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ShareTargetParams shareTargetParams, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, shareTargetParams.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(ShareTargetParams shareTargetParams, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = shareTargetParams.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(MutableLiveData mutableLiveData, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, mutableLiveData);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(MutableLiveData mutableLiveData, List list) {
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

    public static /* synthetic */ Unit b(ShareTargetParams shareTargetParams, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<PodcastVideoList>>> mutableLiveData = shareTargetParams.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(ShareTargetParams shareTargetParams, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, shareTargetParams.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }
}
