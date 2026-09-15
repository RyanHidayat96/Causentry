package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.syariah.model.response.SyariahMembershipCheckItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.syariah.model.FaqSyariah;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class createCaptureSession extends ViewModel {
    public final acquireBuffer TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<InputStream>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final ContextAware TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<List<FaqSyariah>>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> asBinder;
    public final MutableLiveData<VirtualCameraAdapter1<SyariahMembershipCheckItem>> b;

    public createCaptureSession(ContextAware contextAware, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(contextAware, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = contextAware;
        this.TuitionPaymentFragmentbindingInflater1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = new MutableLiveData<>();
        this.asBinder = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<List<FaqSyariah>>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<InputStream>> mutableLiveData3 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<SyariahMembershipCheckItem>> mutableLiveData4 = new MutableLiveData<>();
        this.b = mutableLiveData4;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentbindingInflater1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(createCaptureSession createcapturesession, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, createcapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(createCaptureSession createcapturesession, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, createcapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(createCaptureSession createcapturesession, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, createcapturesession.asBinder);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(createCaptureSession createcapturesession, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<FaqSyariah>>> mutableLiveData = createcapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(createCaptureSession createcapturesession, SyariahMembershipCheckItem syariahMembershipCheckItem) {
        MutableLiveData<VirtualCameraAdapter1<SyariahMembershipCheckItem>> mutableLiveData = createcapturesession.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(syariahMembershipCheckItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(createCaptureSession createcapturesession, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = createcapturesession.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(createCaptureSession createcapturesession, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, createcapturesession.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(createCaptureSession createcapturesession, InputStream inputStream) {
        MutableLiveData<VirtualCameraAdapter1<InputStream>> mutableLiveData = createcapturesession.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(inputStream));
        return Unit.INSTANCE;
    }
}
