package defpackage;

import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.office.OfficeRepository;
import com.bpjstku.data.office.model.request.BranchOfficeDefaultSelectedRequest;
import com.bpjstku.data.office.model.request.BranchOfficeRequest;
import com.bpjstku.data.office.model.request.NearestBranchOfficeRequest;
import com.bpjstku.data.office.model.response.BranchOfficeDefaultSelectedResponse;
import com.bpjstku.data.office.model.response.BranchOfficeItem;
import com.bpjstku.data.office.model.response.BranchPioneerOfficeItem;
import com.bpjstku.data.office.model.response.RegionalOfficeItem;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.domain.branchoffice.model.RegionalOffice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityViewModelLazyKtviewModels2 implements getFrameTimeMillis {
    private final OfficeRepository b;

    public ActivityViewModelLazyKtviewModels2(OfficeRepository officeRepository) {
        Intrinsics.checkNotNullParameter(officeRepository, "");
        this.b = officeRepository;
    }

    @Override // defpackage.getFrameTimeMillis
    public final deriveCodec<List<RegionalOffice>> TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<RegionalOfficeItem>> branchOffice = this.b.getBranchOffice(baseRequest);
        final Function1 function1 = new Function1() { // from class: viewModelsdefault
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityViewModelLazyKtviewModels2.b((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: Api26Impl
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ActivityViewModelLazyKtviewModels2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(branchOffice, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getFrameTimeMillis
    public final deriveCodec<List<RegionalOffice>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<RegionalOfficeItem>> regionalOffice = this.b.getRegionalOffice(baseRequest);
        BackEventCompat backEventCompat = new BackEventCompat(new Function1() { // from class: ActivityViewModelLazyKtviewModels4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityViewModelLazyKtviewModels2.TuitionPaymentFragmentspecialinlinedviewModeldefault1((List) obj);
            }
        });
        share.b(backEventCompat, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(regionalOffice, backEventCompat);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getFrameTimeMillis
    public final deriveCodec<List<Office>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "");
        deriveCodec<List<BranchPioneerOfficeItem>> branchPioneerOffices = this.b.getBranchPioneerOffices(baseRequest);
        final Function1 function1 = new Function1() { // from class: getSwipeEdge
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityViewModelLazyKtviewModels2.TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getProgress
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ActivityViewModelLazyKtviewModels2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(branchPioneerOffices, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getFrameTimeMillis
    public final deriveCodec<List<Office>> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BranchOfficeRequest branchOfficeRequest) {
        Intrinsics.checkNotNullParameter(branchOfficeRequest, "");
        deriveCodec<List<BranchOfficeItem>> branchOfficeByRegion = this.b.getBranchOfficeByRegion(branchOfficeRequest);
        final Function1 function1 = new Function1() { // from class: getTouchY
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityViewModelLazyKtviewModels2.TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: getTouchX
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ActivityViewModelLazyKtviewModels2.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(branchOfficeByRegion, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getFrameTimeMillis
    public final deriveCodec<Office> TuitionPaymentFragmentspecialinlinedviewModeldefault3(NearestBranchOfficeRequest nearestBranchOfficeRequest) {
        Intrinsics.checkNotNullParameter(nearestBranchOfficeRequest, "");
        deriveCodec<BranchOfficeItem> nearestBranchOffice = this.b.getNearestBranchOffice(nearestBranchOfficeRequest);
        final Function1 function1 = new Function1() { // from class: setPipParamsSourceRectHint
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityViewModelLazyKtviewModels2.TuitionPaymentFragmentbindingInflater1((BranchOfficeItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ActivityViewModelLazyKtviewModelsfactoryPromise1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ActivityViewModelLazyKtviewModels2.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(nearestBranchOffice, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.getFrameTimeMillis
    public final deriveCodec<BranchOfficeDefaultSelectedResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault1(BranchOfficeDefaultSelectedRequest branchOfficeDefaultSelectedRequest) {
        Intrinsics.checkNotNullParameter(branchOfficeDefaultSelectedRequest, "");
        deriveCodec<BranchOfficeDefaultSelectedResponse> branchDefaultSelected = this.b.getBranchDefaultSelected(branchOfficeDefaultSelectedRequest);
        final Function1 function1 = new Function1() { // from class: ActivityViewModelLazyKtviewModels1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ActivityViewModelLazyKtviewModels2.TuitionPaymentFragmentspecialinlinedviewModeldefault2((BranchOfficeDefaultSelectedResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: ActivityViewModelLazyKtviewModelsfactoryPromise2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ActivityViewModelLazyKtviewModels2.d(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(branchDefaultSelected, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ Office TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Office) function1.invoke(obj);
    }

    public static /* synthetic */ List b(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ComponentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((RegionalOfficeItem) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ Office TuitionPaymentFragmentbindingInflater1(BranchOfficeItem branchOfficeItem) {
        Intrinsics.checkNotNullParameter(branchOfficeItem, "");
        return ComponentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2(branchOfficeItem);
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault2(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ComponentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault2((BranchOfficeItem) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<BranchPioneerOfficeItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BranchPioneerOfficeItem branchPioneerOfficeItem : list2) {
            Intrinsics.checkNotNullParameter(branchPioneerOfficeItem, "");
            String address = branchPioneerOfficeItem.getAddress();
            String str = address == null ? "" : address;
            String code = branchPioneerOfficeItem.getCode();
            String str2 = code == null ? "" : code;
            String officeName = branchPioneerOfficeItem.getOfficeName();
            arrayList.add(new Office(str, str2, 0.0d, 0.0d, officeName == null ? "" : officeName));
        }
        return arrayList;
    }

    public static /* synthetic */ BranchOfficeDefaultSelectedResponse TuitionPaymentFragmentspecialinlinedviewModeldefault2(BranchOfficeDefaultSelectedResponse branchOfficeDefaultSelectedResponse) {
        Intrinsics.checkNotNullParameter(branchOfficeDefaultSelectedResponse, "");
        return branchOfficeDefaultSelectedResponse;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ComponentActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault3((RegionalOfficeItem) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ BranchOfficeDefaultSelectedResponse d(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BranchOfficeDefaultSelectedResponse) function1.invoke(obj);
    }
}
