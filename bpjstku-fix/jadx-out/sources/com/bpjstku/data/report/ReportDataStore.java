package com.bpjstku.data.report;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.report.model.request.DataCorrectionRequest;
import com.bpjstku.data.report.model.request.NearestHealthcareRequest;
import com.bpjstku.data.report.model.request.PreloadDataRequest;
import com.bpjstku.data.report.model.request.ReportUnregisteredCompanyRequest;
import com.bpjstku.data.report.model.request.ReportWorkAccidentRequest;
import com.bpjstku.data.report.model.response.HealthcareItem;
import com.bpjstku.data.report.model.response.NearestHealthcareResponse;
import com.bpjstku.data.report.model.response.PreloadDataResponse;
import com.bpjstku.data.report.remote.ReportApi;
import defpackage.Api23Impl;
import defpackage.createCameraSelectorById;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Lcom/bpjstku/data/report/ReportDataStore;", "Lcom/bpjstku/data/report/ReportRepository;", "Lcom/bpjstku/data/report/remote/ReportApi;", "p0", "<init>", "(Lcom/bpjstku/data/report/remote/ReportApi;)V", "Lcom/bpjstku/data/report/model/request/NearestHealthcareRequest;", "LderiveCodec;", "", "Lcom/bpjstku/data/report/model/response/HealthcareItem;", "getNearestHealthcare", "(Lcom/bpjstku/data/report/model/request/NearestHealthcareRequest;)LderiveCodec;", "Lcom/bpjstku/data/report/model/request/DataCorrectionRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postDataCorrection", "(Lcom/bpjstku/data/report/model/request/DataCorrectionRequest;)LderiveCodec;", "Lcom/bpjstku/data/report/model/request/ReportWorkAccidentRequest;", "reportWorkAccident", "(Lcom/bpjstku/data/report/model/request/ReportWorkAccidentRequest;)LderiveCodec;", "Lcom/bpjstku/data/report/model/request/ReportUnregisteredCompanyRequest;", "reportUnregisteredCompany", "(Lcom/bpjstku/data/report/model/request/ReportUnregisteredCompanyRequest;)LderiveCodec;", "Lcom/bpjstku/data/report/model/request/PreloadDataRequest;", "Lcom/bpjstku/data/report/model/response/PreloadDataResponse;", "postPreloadData", "(Lcom/bpjstku/data/report/model/request/PreloadDataRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/report/remote/ReportApi;", "getWebService", "()Lcom/bpjstku/data/report/remote/ReportApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReportDataStore implements ReportRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final ReportApi webService;

    public ReportDataStore(ReportApi reportApi) {
        Intrinsics.checkNotNullParameter(reportApi, "");
        this.webService = reportApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7747getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final ReportApi m7748getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.report.ReportRepository
    public final deriveCodec<List<HealthcareItem>> getNearestHealthcare(NearestHealthcareRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<NearestHealthcareResponse>> nearestHealthcare = m7748getWebService().getNearestHealthcare(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(nearestHealthcare, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportDataStore.getNearestHealthcare$lambda$0((NearestHealthcareResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ReportDataStore.getNearestHealthcare$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getNearestHealthcare$lambda$0(NearestHealthcareResponse nearestHealthcareResponse) {
        Intrinsics.checkNotNullParameter(nearestHealthcareResponse, "");
        return nearestHealthcareResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getNearestHealthcare$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.report.ReportRepository
    public final deriveCodec<BaseItem> postDataCorrection(DataCorrectionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPostDataCorrection = m7748getWebService().postDataCorrection(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostDataCorrection, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportDataStore.postDataCorrection$lambda$2((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ReportDataStore.postDataCorrection$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postDataCorrection$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.report.ReportRepository
    public final deriveCodec<BaseItem> reportWorkAccident(ReportWorkAccidentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ReportApi reportApiM7748getWebService = m7748getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        if (partMap == null) {
            partMap = MapsKt.emptyMap();
        }
        deriveCodec<Response<BaseItem>> derivecodecPostReportWorkAccident = reportApiM7748getWebService.postReportWorkAccident(partMap, createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.getImageFile(), "file"));
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostReportWorkAccident, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportDataStore.reportWorkAccident$lambda$4((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ReportDataStore.reportWorkAccident$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem reportWorkAccident$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.report.ReportRepository
    public final deriveCodec<BaseItem> reportUnregisteredCompany(ReportUnregisteredCompanyRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        ReportApi reportApiM7748getWebService = m7748getWebService();
        Map<String, RequestBody> partMap = p0.getPartMap();
        if (partMap == null) {
            partMap = MapsKt.emptyMap();
        }
        deriveCodec<Response<BaseItem>> derivecodecPostUnregisteredCompany = reportApiM7748getWebService.postUnregisteredCompany(partMap, createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0.getImageFile(), "file"));
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostUnregisteredCompany, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportDataStore.reportUnregisteredCompany$lambda$6((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return ReportDataStore.reportUnregisteredCompany$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem reportUnregisteredCompany$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.report.ReportRepository
    public final deriveCodec<PreloadDataResponse> postPreloadData(PreloadDataRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<PreloadDataResponse>> derivecodecPostPreloadData = m7748getWebService().postPreloadData(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostPreloadData, unbindVar);
        ReportDataStore$$ExternalSyntheticLambda9 reportDataStore$$ExternalSyntheticLambda9 = new ReportDataStore$$ExternalSyntheticLambda9(new Function1() { // from class: com.bpjstku.data.report.ReportDataStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReportDataStore.postPreloadData$lambda$8((PreloadDataResponse) obj);
            }
        });
        share.b(reportDataStore$$ExternalSyntheticLambda9, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, reportDataStore$$ExternalSyntheticLambda9);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreloadDataResponse postPreloadData$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PreloadDataResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem postDataCorrection$lambda$2(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreloadDataResponse postPreloadData$lambda$8(PreloadDataResponse preloadDataResponse) {
        Intrinsics.checkNotNullParameter(preloadDataResponse, "");
        return preloadDataResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem reportUnregisteredCompany$lambda$6(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem reportWorkAccident$lambda$4(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }
}
