package com.bpjstku.data.queueing;

import com.bpjstku.data.queueing.model.request.AntrianOnlineUrlRequest;
import com.bpjstku.data.queueing.model.request.GetDataAntrianRequest;
import com.bpjstku.data.queueing.model.request.InsertAntrianRequest;
import com.bpjstku.data.queueing.model.request.NearestOfficeRequest;
import com.bpjstku.data.queueing.model.request.QuotaBookingRequest;
import com.bpjstku.data.queueing.model.response.AntrianOnlineUrlResponse;
import com.bpjstku.data.queueing.model.response.GetDataAntrianResponse;
import com.bpjstku.data.queueing.model.response.InsertAntrianResponse;
import com.bpjstku.data.queueing.model.response.NearestOfficeResponse;
import com.bpjstku.data.queueing.model.response.QuotaBookingResponse;
import com.bpjstku.data.queueing.remote.QueueingApi;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u001aJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\u0006\u0010\u0003\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010#8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'"}, d2 = {"Lcom/bpjstku/data/queueing/QueueingDataStore;", "Lcom/bpjstku/data/queueing/QueueingRepository;", "Lcom/bpjstku/data/queueing/remote/QueueingApi;", "p0", "<init>", "(Lcom/bpjstku/data/queueing/remote/QueueingApi;)V", "Lcom/bpjstku/data/queueing/model/request/NearestOfficeRequest;", "LderiveCodec;", "Lcom/bpjstku/data/queueing/model/response/NearestOfficeResponse;", "getNearestOffice", "(Lcom/bpjstku/data/queueing/model/request/NearestOfficeRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/QuotaBookingRequest;", "Lcom/bpjstku/data/queueing/model/response/QuotaBookingResponse;", "getQuotaBooking", "(Lcom/bpjstku/data/queueing/model/request/QuotaBookingRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;", "Lcom/bpjstku/data/queueing/model/response/InsertAntrianResponse;", "insertAntrian", "(Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/queueing/model/request/InsertAntrianRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;", "Lcom/bpjstku/data/queueing/model/response/GetDataAntrianResponse;", "getDataAntrian", "(Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/queueing/model/request/GetDataAntrianRequest;)LderiveCodec;", "Lcom/bpjstku/data/queueing/model/request/AntrianOnlineUrlRequest;", "Lcom/bpjstku/data/queueing/model/response/AntrianOnlineUrlResponse;", "getAntrianOnlineUrl", "(Lcom/bpjstku/data/queueing/model/request/AntrianOnlineUrlRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/queueing/remote/QueueingApi;", "getWebService", "()Lcom/bpjstku/data/queueing/remote/QueueingApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueueingDataStore implements QueueingRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final QueueingApi webService;

    public QueueingDataStore(QueueingApi queueingApi) {
        Intrinsics.checkNotNullParameter(queueingApi, "");
        this.webService = queueingApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7708getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final QueueingApi m7709getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.queueing.QueueingRepository
    public final deriveCodec<NearestOfficeResponse> getNearestOffice(NearestOfficeRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<NearestOfficeResponse>> nearestOffice = m7709getWebService().getNearestOffice(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(nearestOffice, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueueingDataStore.getNearestOffice$lambda$0((NearestOfficeResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return QueueingDataStore.getNearestOffice$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NearestOfficeResponse getNearestOffice$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (NearestOfficeResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.queueing.QueueingRepository
    public final deriveCodec<QuotaBookingResponse> getQuotaBooking(QuotaBookingRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<QuotaBookingResponse>> quotaBooking = m7709getWebService().getQuotaBooking(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(quotaBooking, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueueingDataStore.getQuotaBooking$lambda$2((QuotaBookingResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return QueueingDataStore.getQuotaBooking$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuotaBookingResponse getQuotaBooking$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (QuotaBookingResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.queueing.QueueingRepository
    public final deriveCodec<InsertAntrianResponse> insertAntrian(InsertAntrianRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<InsertAntrianResponse>> derivecodecInsertAntrian = m7709getWebService().insertAntrian(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecInsertAntrian, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueueingDataStore.insertAntrian$lambda$4((InsertAntrianResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return QueueingDataStore.insertAntrian$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InsertAntrianResponse insertAntrian$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InsertAntrianResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.queueing.QueueingRepository
    public final deriveCodec<InsertAntrianResponse> insertAntrian(String p0, InsertAntrianRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<InsertAntrianResponse>> derivecodecInsertAntrian = m7709getWebService().insertAntrian(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecInsertAntrian, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueueingDataStore.insertAntrian$lambda$6((InsertAntrianResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda7
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -889170665;

            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return QueueingDataStore.insertAntrian$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InsertAntrianResponse insertAntrian$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InsertAntrianResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.queueing.QueueingRepository
    public final deriveCodec<GetDataAntrianResponse> getDataAntrian(GetDataAntrianRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<GetDataAntrianResponse>> dataAntrian = m7709getWebService().getDataAntrian(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(dataAntrian, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueueingDataStore.getDataAntrian$lambda$8((GetDataAntrianResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return QueueingDataStore.getDataAntrian$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetDataAntrianResponse getDataAntrian$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetDataAntrianResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.queueing.QueueingRepository
    public final deriveCodec<GetDataAntrianResponse> getDataAntrian(String p0, GetDataAntrianRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<GetDataAntrianResponse>> dataAntrian = m7709getWebService().getDataAntrian(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(dataAntrian, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda8
            public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2015932032;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueueingDataStore.getDataAntrian$lambda$10((GetDataAntrianResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda9
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return QueueingDataStore.getDataAntrian$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetDataAntrianResponse getDataAntrian$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (GetDataAntrianResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.queueing.QueueingRepository
    public final deriveCodec<AntrianOnlineUrlResponse> getAntrianOnlineUrl(AntrianOnlineUrlRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<AntrianOnlineUrlResponse>> antrianOnlineUrl = m7709getWebService().getAntrianOnlineUrl(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(antrianOnlineUrl, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueueingDataStore.getAntrianOnlineUrl$lambda$12((AntrianOnlineUrlResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.queueing.QueueingDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return QueueingDataStore.getAntrianOnlineUrl$lambda$13(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AntrianOnlineUrlResponse getAntrianOnlineUrl$lambda$13(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AntrianOnlineUrlResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AntrianOnlineUrlResponse getAntrianOnlineUrl$lambda$12(AntrianOnlineUrlResponse antrianOnlineUrlResponse) {
        Intrinsics.checkNotNullParameter(antrianOnlineUrlResponse, "");
        return antrianOnlineUrlResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetDataAntrianResponse getDataAntrian$lambda$10(GetDataAntrianResponse getDataAntrianResponse) {
        Intrinsics.checkNotNullParameter(getDataAntrianResponse, "");
        return getDataAntrianResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetDataAntrianResponse getDataAntrian$lambda$8(GetDataAntrianResponse getDataAntrianResponse) {
        Intrinsics.checkNotNullParameter(getDataAntrianResponse, "");
        return getDataAntrianResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NearestOfficeResponse getNearestOffice$lambda$0(NearestOfficeResponse nearestOfficeResponse) {
        Intrinsics.checkNotNullParameter(nearestOfficeResponse, "");
        return nearestOfficeResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuotaBookingResponse getQuotaBooking$lambda$2(QuotaBookingResponse quotaBookingResponse) {
        Intrinsics.checkNotNullParameter(quotaBookingResponse, "");
        return quotaBookingResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InsertAntrianResponse insertAntrian$lambda$4(InsertAntrianResponse insertAntrianResponse) {
        Intrinsics.checkNotNullParameter(insertAntrianResponse, "");
        return insertAntrianResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InsertAntrianResponse insertAntrian$lambda$6(InsertAntrianResponse insertAntrianResponse) {
        Intrinsics.checkNotNullParameter(insertAntrianResponse, "");
        return insertAntrianResponse;
    }
}
