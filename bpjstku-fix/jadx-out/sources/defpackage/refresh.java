package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.promo.model.request.MerchantRequest;
import com.bpjstku.data.promo.model.request.OrderMerchant;
import com.bpjstku.data.promo.model.request.SearchMerchant;
import com.bpjstku.data.promo.model.request.VoucherRequest;
import com.bpjstku.data.promo.model.response.RedeemResponse;
import com.bpjstku.domain.promo.model.CategoryMerchant;
import com.bpjstku.domain.promo.model.DetailMerchant;
import com.bpjstku.domain.promo.model.ListMerchant;
import com.bpjstku.domain.promo.model.ProvinceMerchant;
import com.bpjstku.domain.promo.model.VoucherItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class refresh extends ViewModel {
    private final PreferenceManager INotificationSideChannel;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> TuitionPaymentFragmentbindingInflater1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<List<CategoryMerchant>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<DetailMerchant>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<VirtualCameraAdapter1<RedeemResponse>> f1337a;
    public final MutableLiveData<VirtualCameraAdapter1<List<VoucherItem>>> asBinder;
    public final registerlambda1 asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<DetailMerchant>> b;
    private final MutableLiveData<VirtualCameraAdapter1<List<ProvinceMerchant>>> cancel;
    public final addCallbackdefault d;
    public final MutableLiveData<VirtualCameraAdapter1<List<ListMerchant>>> g;

    public refresh(addCallbackdefault addcallbackdefault, PreferenceManager preferenceManager, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(addcallbackdefault, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.d = addcallbackdefault;
        this.INotificationSideChannel = preferenceManager;
        this.asInterface = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<List<CategoryMerchant>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<List<ProvinceMerchant>>> mutableLiveData2 = new MutableLiveData<>();
        this.cancel = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<DetailMerchant>> mutableLiveData3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<List<ListMerchant>>> mutableLiveData4 = new MutableLiveData<>();
        this.g = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<List<VoucherItem>>> mutableLiveData5 = new MutableLiveData<>();
        this.asBinder = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<RedeemResponse>> mutableLiveData6 = new MutableLiveData<>();
        this.f1337a = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<DetailMerchant>> mutableLiveData7 = new MutableLiveData<>();
        this.b = mutableLiveData7;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData8 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData8;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion7 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData7.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion8 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData8.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void b(int i, int i2, List<SearchMerchant> list, List<OrderMerchant> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        MutableLiveData<VirtualCameraAdapter1<List<ListMerchant>>> mutableLiveData = this.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new MerchantRequest(list, String.valueOf(i), String.valueOf(i2), list2))));
        final Function1 function1 = new Function1() { // from class: failCancelFuture
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refresh.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getFovAdjustedPoint
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getMeteringRectangles
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refresh.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: findSupportedHdrMatch
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final MutableLiveData<VirtualCameraAdapter1<List<ListMerchant>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, int i2, List<SearchMerchant> list, List<OrderMerchant> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        final MutableLiveData<VirtualCameraAdapter1<List<ListMerchant>>> mutableLiveData = new MutableLiveData<>();
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new MerchantRequest(list, String.valueOf(i), String.valueOf(i2), list2))));
        final Function1 function1 = new Function1() { // from class: resolveDynamicRange
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refresh.b(mutableLiveData, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: updateConstraints
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: is10BitDynamicRangeSupported
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refresh.TuitionPaymentFragmentbindingInflater1(mutableLiveData, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getRecommended10BitDynamicRange
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return mutableLiveData;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, List<SearchMerchant> list, List<OrderMerchant> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        MutableLiveData<VirtualCameraAdapter1<List<VoucherItem>>> mutableLiveData = this.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new VoucherRequest(String.valueOf(i), String.valueOf(i2), "JMO", list, list2))));
        final Function1 function1 = new Function1() { // from class: getExposureCompensationRange
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refresh.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: clearAutoFocusTimeoutHandle
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getExposureCompensationStep
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return refresh.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isExposureCompensationSupported
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(refresh refreshVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, refreshVar.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(refresh refreshVar, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CategoryMerchant>>> mutableLiveData = refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(refresh refreshVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, refreshVar.g);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(refresh refreshVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(MutableLiveData mutableLiveData, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, mutableLiveData);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(refresh refreshVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, refreshVar.asBinder);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(refresh refreshVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, refreshVar.f1337a);
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(refresh refreshVar, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<VoucherItem>>> mutableLiveData = refreshVar.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(MutableLiveData mutableLiveData, List list) {
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(refresh refreshVar, DetailMerchant detailMerchant) {
        MutableLiveData<VirtualCameraAdapter1<DetailMerchant>> mutableLiveData = refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(detailMerchant));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(refresh refreshVar, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<ListMerchant>>> mutableLiveData = refreshVar.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(MutableLiveData mutableLiveData, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, mutableLiveData);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(refresh refreshVar, DetailMerchant detailMerchant) {
        MutableLiveData<VirtualCameraAdapter1<DetailMerchant>> mutableLiveData = refreshVar.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(detailMerchant));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(refresh refreshVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, refreshVar.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(refresh refreshVar, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, refreshVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(refresh refreshVar, BaseItem baseItem) {
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData = refreshVar.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(refresh refreshVar, RedeemResponse redeemResponse) {
        MutableLiveData<VirtualCameraAdapter1<RedeemResponse>> mutableLiveData = refreshVar.f1337a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(redeemResponse));
        return Unit.INSTANCE;
    }
}
