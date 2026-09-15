package defpackage;

import androidx.p002lifecycle.MediatorLiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.scholarship.model.request.ScholarshipDataDocumentForInsert;
import com.bpjstku.data.scholarship.model.response.ScholarshipDocumentResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipEducationListResponse;
import com.bpjstku.data.scholarship.model.response.ScholarshipInsertResponse;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.scholarship.model.ScholarBenefit;
import com.bpjstku.domain.scholarship.model.ScholarDocument;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0007X\u0087D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u000b\u001a\f\u0012\b\u0012\u0006*\u00020\u00160\u00160\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u001e\u0010\u001f\u001a\f\u0012\b\u0012\u0006*\u00020\u001d0\u001d0\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0 8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010\u0019\u001a\f\u0012\b\u0012\u0006*\u00020\u00160\u00160\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R$\u0010(\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0+0\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0,0+0\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0014R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0+0\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0014R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010+0\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R&\u00103\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0,0+028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b3\u00104R&\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0,0+058\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u00106R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000208070\u00118\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0014"}, d2 = {"LgenerateUltraHdrSupportedCombinationList;", "Landroidx/lifecycle/ViewModel;", "LacquireBuffer;", "p0", "LManagedActivityResultLauncher;", "p1", "<init>", "(LacquireBuffer;LManagedActivityResultLauncher;)V", "", "onCleared", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LacquireBuffer;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "INotificationSideChannelDefault", "LManagedActivityResultLauncher;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "INotificationSideChannelStub", "Landroidx/lifecycle/MutableLiveData;", "TuitionPaymentFragmentbindingInflater1", "", "b", "I", "d", "Lcom/bpjstku/domain/scholarship/model/ScholarPersonDetail;", "onTransact", "asBinder", "", "asInterface", "g", "Landroidx/lifecycle/MediatorLiveData;", "notify", "Landroidx/lifecycle/MediatorLiveData;", "Ljava/util/ArrayList;", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipDataDocumentForInsert;", "Lkotlin/collections/b;", "cancel", "Ljava/util/ArrayList;", "a", "Lcom/bpjstku/domain/scholarship/model/ScholarDocument;", "INotificationSideChannel", "LVirtualCameraAdapter1;", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEducationListResponse;", "Lcom/bpjstku/domain/scholarship/model/ScholarBenefit;", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipInsertResponse;", "cancelAll", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipDocumentResponse;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "RemoteActionCompatParcelizer", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "LstopMediaCodec;", "LstopMediaCodec;", "", "Ljava/io/File;", "INotificationSideChannelStubProxy"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class generateUltraHdrSupportedCombinationList extends ViewModel {

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public final MutableLiveData<List<File>> INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final ManagedActivityResultLauncher TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final MutableLiveData<CodeNamePair> TuitionPaymentFragmentbindingInflater1;
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<List<ScholarBenefit>>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final MutableLiveData<Integer> d;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final MutableLiveData<ScholarDocument> INotificationSideChannel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> cancel;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<List<ScholarBenefit>>> notify;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<ScholarshipDocumentResponse>> onTransact;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final MutableLiveData<Boolean> g;
    public final int b;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final ArrayList<ScholarshipDataDocumentForInsert> a;
    public final MutableLiveData<VirtualCameraAdapter1<ScholarshipInsertResponse>> cancelAll;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final MutableLiveData<Integer> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final stopMediaCodec<VirtualCameraAdapter1<List<ScholarBenefit>>> INotificationSideChannelStub;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final MediatorLiveData<Boolean> asInterface;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final MutableLiveData<ScholarPersonDetail> asBinder;

    static final /* synthetic */ class b implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentbindingInflater1;

        b(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentbindingInflater1 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentbindingInflater1;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentbindingInflater1.invoke(obj);
        }
    }

    public generateUltraHdrSupportedCombinationList(acquireBuffer acquirebuffer, ManagedActivityResultLauncher managedActivityResultLauncher) {
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(managedActivityResultLauncher, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquirebuffer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = managedActivityResultLauncher;
        MutableLiveData<CodeNamePair> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
        this.b = 2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new MutableLiveData<>(3);
        MutableLiveData<ScholarPersonDetail> mutableLiveData2 = new MutableLiveData<>();
        this.asBinder = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>(Boolean.FALSE);
        this.g = mutableLiveData3;
        MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
        this.asInterface = mediatorLiveData;
        this.d = new MutableLiveData<>(0);
        this.a = new ArrayList<>();
        this.INotificationSideChannel = new MutableLiveData<>();
        MutableLiveData<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> mutableLiveData4 = new MutableLiveData<>();
        this.cancel = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<List<ScholarBenefit>>> mutableLiveData5 = new MutableLiveData<>();
        this.notify = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<ScholarshipInsertResponse>> mutableLiveData6 = new MutableLiveData<>();
        this.cancelAll = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<ScholarshipDocumentResponse>> mutableLiveData7 = new MutableLiveData<>();
        this.onTransact = mutableLiveData7;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<List<ScholarBenefit>>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.RemoteActionCompatParcelizer = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.INotificationSideChannelStub = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.INotificationSideChannelStubProxy = new MutableLiveData<>();
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData7.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        final Function0 function0 = new Function0() { // from class: getRecordSizeByHasProfile
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(generateUltraHdrSupportedCombinationList.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1));
            }
        };
        mediatorLiveData.addSource(mutableLiveData3, new b(new Function1() { // from class: getUseCasesPriorityOrder
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return generateUltraHdrSupportedCombinationList.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, function0);
            }
        }));
        mediatorLiveData.addSource(mutableLiveData2, new b(new Function1() { // from class: getUpdatedMaximumFps
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return generateUltraHdrSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, function0);
            }
        }));
        mediatorLiveData.addSource(mutableLiveData, new b(new Function1() { // from class: getTargetFpsRange
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return generateUltraHdrSupportedCombinationList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, function0);
            }
        }));
        mutableLiveData5.observeForever(new b(new Function1() { // from class: isUltraHdrSupported
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return generateUltraHdrSupportedCombinationList.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, ScholarshipInsertResponse scholarshipInsertResponse) {
        MutableLiveData<VirtualCameraAdapter1<ScholarshipInsertResponse>> mutableLiveData = generateultrahdrsupportedcombinationlist.cancelAll;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(scholarshipInsertResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, generateultrahdrsupportedcombinationlist.cancel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, Function0 function0) {
        generateultrahdrsupportedcombinationlist.asInterface.setValue((Boolean) function0.invoke());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, VirtualCameraAdapter1 virtualCameraAdapter1) {
        generateultrahdrsupportedcombinationlist.RemoteActionCompatParcelizer.b(virtualCameraAdapter1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<ScholarshipEducationListResponse>>> mutableLiveData = generateultrahdrsupportedcombinationlist.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<ScholarBenefit>>> mutableLiveData = generateultrahdrsupportedcombinationlist.notify;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, generateultrahdrsupportedcombinationlist.notify);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, generateultrahdrsupportedcombinationlist.cancelAll);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, Function0 function0) {
        generateultrahdrsupportedcombinationlist.asInterface.setValue((Boolean) function0.invoke());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, Function0 function0) {
        generateultrahdrsupportedcombinationlist.asInterface.setValue((Boolean) function0.invoke());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist) {
        boolean z;
        ScholarPersonDetail value = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        ArrayList<ScholarDocument> arrayListEmptyList = value != null ? value.setCallbacksMessenger : null;
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        Iterator it = arrayListEmptyList.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                ScholarDocument scholarDocument = (ScholarDocument) it.next();
                if (i != 2) {
                    if (scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            z = true;
            break;
        }
        ScholarPersonDetail value2 = generateultrahdrsupportedcombinationlist.asBinder.getValue();
        if ((!Intrinsics.areEqual(value2 != null ? value2.RemoteActionCompatParcelizer : null, "Y") || generateultrahdrsupportedcombinationlist.TuitionPaymentFragmentbindingInflater1.getValue() != null) && z) {
            ScholarPersonDetail value3 = generateultrahdrsupportedcombinationlist.asBinder.getValue();
            ArrayList<ScholarDocument> arrayList = value3 != null ? value3.setCallbacksMessenger : null;
            if (arrayList != null && !arrayList.isEmpty() && Intrinsics.areEqual(generateultrahdrsupportedcombinationlist.g.getValue(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }
}
