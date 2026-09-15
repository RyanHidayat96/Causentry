package defpackage;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.scholarship.model.request.ScholarshipBenefitRequest;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.data.scholarship.model.response.BenefitInfo;
import com.bpjstku.data.scholarship.model.response.ScholarshipDataEligible;
import com.bpjstku.data.scholarship.model.response.ScholarshipEligibleResponse;
import com.bpjstku.domain.scholarship.model.ScholarInsertResult;
import com.bpjstku.domain.scholarship.model.ScholarPerson;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\t\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\t\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020!0\u001e8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00100#0\u001e8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0#0\u001e8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010 R \u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0#0\u001e8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010 R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010!0#0\u001e8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020*0,8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010+R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100,8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010.R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010+R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00150,8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010.R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0#0)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010+R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0#0,8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00150)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010+R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150,8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010."}, d2 = {"LgetRatioByPercentage;", "Landroidx/lifecycle/ViewModel;", "LacquireBuffer;", "p0", "LManagedActivityResultLauncher;", "p1", "<init>", "(LacquireBuffer;LManagedActivityResultLauncher;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()V", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;)V", "Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitRequest;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/data/scholarship/model/request/ScholarshipBenefitRequest;)V", "", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipDataEligible;", "b", "()Ljava/util/List;", "", "", "(Ljava/lang/String;Z)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Z)V", "onCleared", "asBinder", "LacquireBuffer;", "cancelAll", "LManagedActivityResultLauncher;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bpjstku/domain/scholarship/model/ScholarPerson;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/bpjstku/domain/scholarship/model/ScholarPersonDetail;", "g", "LVirtualCameraAdapter1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/bpjstku/data/scholarship/model/response/ScholarshipEligibleResponse;", "a", "Lcom/bpjstku/domain/scholarship/model/ScholarInsertResult;", "asInterface", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "LupdateTextButtonVisibility;", "Llambdastop3androidxcameravideointernalencoderEncoderImpl;", "LstopMediaCodec;", "notify", "LstopMediaCodec;", "d", "onTransact", "INotificationSideChannel", "INotificationSideChannelStub", "RemoteActionCompatParcelizer", "cancel", "INotificationSideChannelStubProxy", "getInterfaceDescriptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getRatioByPercentage extends ViewModel {
    public final stopMediaCodec<List<ScholarshipDataEligible>> INotificationSideChannel;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<Boolean> cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    private final lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ScholarshipEligibleResponse>> notify;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final stopMediaCodec<Boolean> cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final MutableLiveData<ScholarPerson> b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<ScholarPersonDetail>> asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<List<ScholarPerson>>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final lambdastop3androidxcameravideointernalencoderEncoderImpl<updateTextButtonVisibility> a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<VirtualCameraAdapter1<ScholarshipEligibleResponse>> g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<ScholarInsertResult>> asInterface;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final lambdastop3androidxcameravideointernalencoderEncoderImpl<List<ScholarshipDataEligible>> onTransact;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final stopMediaCodec<Boolean> INotificationSideChannelStub;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final ManagedActivityResultLauncher TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final stopMediaCodec<VirtualCameraAdapter1<ScholarshipEligibleResponse>> getInterfaceDescriptor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final MutableLiveData<ScholarPersonDetail> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final stopMediaCodec<updateTextButtonVisibility> d;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final lambdastop3androidxcameravideointernalencoderEncoderImpl<Boolean> RemoteActionCompatParcelizer;

    public static final /* synthetic */ class b implements Observer, FunctionAdapter {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
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

        public static int b() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int i2 = i % 5153993;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i3;
            return i3;
        }
    }

    public getRatioByPercentage(acquireBuffer acquirebuffer, ManagedActivityResultLauncher managedActivityResultLauncher) {
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(managedActivityResultLauncher, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = managedActivityResultLauncher;
        this.b = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = new MutableLiveData<>();
        MutableLiveData<VirtualCameraAdapter1<List<ScholarPerson>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<ScholarshipEligibleResponse>> mutableLiveData2 = new MutableLiveData<>();
        this.g = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<ScholarInsertResult>> mutableLiveData3 = new MutableLiveData<>();
        this.asInterface = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<ScholarPersonDetail>> mutableLiveData4 = new MutableLiveData<>();
        this.asBinder = mutableLiveData4;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<updateTextButtonVisibility> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new updateTextButtonVisibility(null, null, null, false, false, false, 63, null));
        this.a = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.d = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<List<ScholarshipDataEligible>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(CollectionsKt.emptyList());
        this.onTransact = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.INotificationSideChannel = new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
        Boolean bool = Boolean.FALSE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Boolean> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault4 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bool);
        this.cancelAll = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        this.cancel = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<VirtualCameraAdapter1<ScholarshipEligibleResponse>> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault5 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        this.notify = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        this.getInterfaceDescriptor = new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault5, null);
        lambdastop3androidxcameravideointernalencoderEncoderImpl<Boolean> lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault6 = EncoderImplExternalSyntheticLambda14.TuitionPaymentFragmentspecialinlinedviewModeldefault2(bool);
        this.RemoteActionCompatParcelizer = lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        this.INotificationSideChannelStub = new lambdasignalSourceStopped7androidxcameravideointernalencoderEncoderImpl(lambdastop3androidxcameravideointernalencoderencoderimplTuitionPaymentFragmentspecialinlinedviewModeldefault6, null);
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        mutableLiveData2.observeForever(new b(new Function1() { // from class: getPercentageByRatio
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getRatioByPercentage.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        }));
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        Pair pair;
        String upperCase;
        List<ScholarshipDataEligible> listB = b();
        List<ScholarshipDataEligible> list = listB;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) obj;
            if (!Intrinsics.areEqual(scholarshipDataEligible.getStatusKonfirmasi(), "Y")) {
                String descPencarian = scholarshipDataEligible.getDescPencarian();
                if (descPencarian != null) {
                    upperCase = descPencarian.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "");
                } else {
                    upperCase = null;
                }
                if (Intrinsics.areEqual(upperCase, "LAYAK")) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String nik = ((ScholarshipDataEligible) it.next()).getNik();
            if (nik == null) {
                nik = "";
            }
            arrayList3.add(nik);
        }
        Set set = CollectionsKt.toSet(arrayList3);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            String nik2 = ((ScholarshipDataEligible) it2.next()).getNik();
            if (nik2 == null) {
                nik2 = "";
            }
            if (set.contains(nik2)) {
                pair = TuplesKt.to(nik2, Boolean.FALSE);
            } else {
                pair = TuplesKt.to(nik2, Boolean.TRUE);
            }
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.a.b(new updateTextButtonVisibility(listB, null, linkedHashMap, false, false, false, 50, null));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipEligibleRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<ScholarshipEligibleResponse>> mutableLiveData = this.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(p0)));
        final Function1 function1 = new Function1() { // from class: getZoomRatio
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getRatioByPercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (ScholarshipEligibleResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ZoomControlZoomImpl
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ZslControlImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getRatioByPercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: isZslDisabledByFlashMode
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(ScholarshipBenefitRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        MutableLiveData<VirtualCameraAdapter1<ScholarPersonDetail>> mutableLiveData = this.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(p0)));
        final Function1 function1 = new Function1() { // from class: ZoomStateImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getRatioByPercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (ScholarPersonDetail) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: enqueueImageToImageWriter
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: isZslDisabledByUserCaseConfig
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getRatioByPercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getLinearZoom
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private final List<ScholarshipDataEligible> b() {
        List<ScholarshipDataEligible> eligibles;
        BenefitInfo benefitInfo;
        ScholarshipEligibleResponse scholarshipEligibleResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        if (scholarshipEligibleResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null || (eligibles = scholarshipEligibleResponseTuitionPaymentFragmentspecialinlinedviewModeldefault2.getEligibles()) == null) {
            return CollectionsKt.emptyList();
        }
        List<ScholarshipDataEligible> list = eligibles;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ScholarshipDataEligible scholarshipDataEligible : list) {
            Intrinsics.checkNotNullParameter(scholarshipDataEligible, "");
            String strB = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            String statusPencarian = scholarshipDataEligible.getStatusPencarian();
            String statusKonfirmasi = scholarshipDataEligible.getStatusKonfirmasi();
            String descPencarian = scholarshipDataEligible.getDescPencarian();
            String minFaceMatch = scholarshipDataEligible.getMinFaceMatch();
            Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
            String name = scholarshipDataEligible.getName();
            if (name == null) {
                name = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(name, strB);
            Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
            String nik = scholarshipDataEligible.getNik();
            if (nik == null) {
                nik = "";
            }
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault4 = companion2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(nik, strB);
            BenefitInfo benefitInfo2 = scholarshipDataEligible.getBenefitInfo();
            if (benefitInfo2 != null) {
                Intrinsics.checkNotNullParameter(benefitInfo2, "");
                String strB2 = Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
                String recipientName = benefitInfo2.getRecipientName();
                if (recipientName == null) {
                    recipientName = "";
                }
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault5 = companion3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(recipientName, strB2);
                Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
                String participantNik = benefitInfo2.getParticipantNik();
                if (participantNik == null) {
                    participantNik = "";
                }
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault6 = companion4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(participantNik, strB2);
                Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
                String participantName = benefitInfo2.getParticipantName();
                if (participantName == null) {
                    participantName = "";
                }
                String strTuitionPaymentFragmentspecialinlinedviewModeldefault7 = companion5.TuitionPaymentFragmentspecialinlinedviewModeldefault3(participantName, strB2);
                Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
                String participantKpj = benefitInfo2.getParticipantKpj();
                benefitInfo = new BenefitInfo(strTuitionPaymentFragmentspecialinlinedviewModeldefault5, benefitInfo2.getStatus(), strTuitionPaymentFragmentspecialinlinedviewModeldefault6, strTuitionPaymentFragmentspecialinlinedviewModeldefault7, companion6.TuitionPaymentFragmentspecialinlinedviewModeldefault3(participantKpj != null ? participantKpj : "", strB2), benefitInfo2.getScholarshipType(), benefitInfo2.getEducationLevel(), benefitInfo2.getYear(), benefitInfo2.getGradeLevel(), benefitInfo2.getInstitution(), benefitInfo2.getBenefit(), benefitInfo2.getDate(), benefitInfo2.getAge(), benefitInfo2.getRelationName());
            } else {
                benefitInfo = null;
            }
            arrayList.add(new ScholarshipDataEligible(statusPencarian, statusKonfirmasi, descPencarian, minFaceMatch, strTuitionPaymentFragmentspecialinlinedviewModeldefault3, strTuitionPaymentFragmentspecialinlinedviewModeldefault4, benefitInfo, scholarshipDataEligible.getDocuments()));
        }
        return arrayList;
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, boolean p1) {
        boolean z;
        Intrinsics.checkNotNullParameter(p0, "");
        updateTextButtonVisibility updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.a.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        List<ScholarshipDataEligible> list = updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) obj;
            if (Intrinsics.areEqual(scholarshipDataEligible.getStatusPencarian(), "Y") && Intrinsics.areEqual(scholarshipDataEligible.getStatusKonfirmasi(), ExifInterface.GPS_DIRECTION_TRUE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String nik = ((ScholarshipDataEligible) it.next()).getNik();
            if (nik == null) {
                nik = "";
            }
            arrayList3.add(nik);
        }
        Set set = CollectionsKt.toSet(arrayList3);
        if (set.contains(p0)) {
            Map mutableMap = MapsKt.toMutableMap(updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            mutableMap.put(p0, Boolean.valueOf(p1));
            Collection collectionValues = mutableMap.values();
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                return;
            }
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (((Boolean) it2.next()).booleanValue()) {
                    if (mutableMap.isEmpty()) {
                        z = false;
                        break;
                    }
                    Iterator it3 = mutableMap.entrySet().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z = false;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        String str = (String) entry.getKey();
                        boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                        if (set.contains(str) && zBooleanValue) {
                            z = true;
                            break;
                        }
                    }
                    this.a.b(updateTextButtonVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, mutableMap, z, false, false, 51));
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        String nik2 = ((ScholarshipDataEligible) obj2).getNik();
                        if (nik2 == null) {
                            nik2 = "";
                        }
                        if (Intrinsics.areEqual(mutableMap.get(nik2), Boolean.TRUE)) {
                            arrayList4.add(obj2);
                        }
                    }
                    this.onTransact.b(arrayList4);
                    return;
                }
            }
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean p0) {
        updateTextButtonVisibility updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<updateTextButtonVisibility> lambdastop3androidxcameravideointernalencoderencoderimpl = this.a;
        do {
            updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } while (!lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1, updateTextButtonVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, false, p0, false, 47)));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean p0) {
        updateTextButtonVisibility updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        lambdastop3androidxcameravideointernalencoderEncoderImpl<updateTextButtonVisibility> lambdastop3androidxcameravideointernalencoderencoderimpl = this.a;
        do {
            updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } while (!lambdastop3androidxcameravideointernalencoderencoderimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1, updateTextButtonVisibility.TuitionPaymentFragmentspecialinlinedviewModeldefault2(updatetextbuttonvisibilityTuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, false, false, p0, 31)));
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getRatioByPercentage getratiobypercentage, ScholarshipEligibleResponse scholarshipEligibleResponse) {
        MutableLiveData<VirtualCameraAdapter1<ScholarshipEligibleResponse>> mutableLiveData = getratiobypercentage.g;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(scholarshipEligibleResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getRatioByPercentage getratiobypercentage, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getratiobypercentage.g);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getRatioByPercentage getratiobypercentage, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(getRatioByPercentage getratiobypercentage, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getratiobypercentage.asBinder);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getRatioByPercentage getratiobypercentage, ScholarPersonDetail scholarPersonDetail) {
        MutableLiveData<VirtualCameraAdapter1<ScholarPersonDetail>> mutableLiveData = getratiobypercentage.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(scholarPersonDetail));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getRatioByPercentage getratiobypercentage, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<ScholarPerson>>> mutableLiveData = getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getRatioByPercentage getratiobypercentage, VirtualCameraAdapter1 virtualCameraAdapter1) {
        getratiobypercentage.notify.b(virtualCameraAdapter1);
        return Unit.INSTANCE;
    }
}
