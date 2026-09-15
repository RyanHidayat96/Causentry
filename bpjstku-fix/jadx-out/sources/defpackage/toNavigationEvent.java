package defpackage;

import com.bpjstku.data.complaint.ComplaintRepository;
import com.bpjstku.data.complaint.model.request.ComplaintDetailRequest;
import com.bpjstku.data.complaint.model.request.ComplaintHistoryRequest;
import com.bpjstku.data.complaint.model.response.ComplaintDetailItem;
import com.bpjstku.data.complaint.model.response.ComplaintHistoryItem;
import com.bpjstku.domain.complaint.model.ComplaintDetail;
import com.bpjstku.domain.complaint.model.ComplaintHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class toNavigationEvent implements r8lambda54BeH8ZsBru0CXI2CCSP2syNys {
    private final ComplaintRepository TuitionPaymentFragmentbindingInflater1;

    public toNavigationEvent(ComplaintRepository complaintRepository) {
        Intrinsics.checkNotNullParameter(complaintRepository, "");
        this.TuitionPaymentFragmentbindingInflater1 = complaintRepository;
    }

    @Override // defpackage.r8lambda54BeH8ZsBru0CXI2CCSP2syNys
    public final deriveCodec<List<ComplaintHistory>> TuitionPaymentFragmentspecialinlinedviewModeldefault3(ComplaintHistoryRequest complaintHistoryRequest) {
        Intrinsics.checkNotNullParameter(complaintHistoryRequest, "");
        deriveCodec<List<ComplaintHistoryItem>> historyComplaint = this.TuitionPaymentFragmentbindingInflater1.getHistoryComplaint(complaintHistoryRequest);
        final Function1 function1 = new Function1() { // from class: BackEventCompatCompanion
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return toNavigationEvent.TuitionPaymentFragmentbindingInflater1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: BackEventCompatSwipeEdge
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return toNavigationEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(historyComplaint, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.r8lambda54BeH8ZsBru0CXI2CCSP2syNys
    public final deriveCodec<ComplaintDetail> TuitionPaymentFragmentspecialinlinedviewModeldefault2(ComplaintDetailRequest complaintDetailRequest) {
        Intrinsics.checkNotNullParameter(complaintDetailRequest, "");
        deriveCodec<ComplaintDetailItem> complaintDetail = this.TuitionPaymentFragmentbindingInflater1.getComplaintDetail(complaintDetailRequest);
        final Function1 function1 = new Function1() { // from class: toBackEvent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return toNavigationEvent.TuitionPaymentFragmentbindingInflater1((ComplaintDetailItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return toNavigationEvent.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(complaintDetail, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.TuitionPaymentFragmentspecialinlinedviewModeldefault3((ComplaintHistoryItem) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ ComplaintDetail TuitionPaymentFragmentbindingInflater1(ComplaintDetailItem complaintDetailItem) {
        Intrinsics.checkNotNullParameter(complaintDetailItem, "");
        return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.TuitionPaymentFragmentbindingInflater1(complaintDetailItem);
    }

    public static /* synthetic */ ComplaintDetail b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ComplaintDetail) function1.invoke(obj);
    }
}
