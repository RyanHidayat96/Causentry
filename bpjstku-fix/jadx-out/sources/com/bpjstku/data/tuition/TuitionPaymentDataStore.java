package com.bpjstku.data.tuition;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.tuition.model.request.BpuOneMonthTuitionRequest;
import com.bpjstku.data.tuition.model.request.CallbackPaymentTuitionMidtransRequest;
import com.bpjstku.data.tuition.model.request.PaymentHistoryRequest;
import com.bpjstku.data.tuition.model.request.TuitionPaymentRequest;
import com.bpjstku.data.tuition.model.response.BpuOneMonthTuitionResponse;
import com.bpjstku.data.tuition.model.response.BpuPaymentStatusItem;
import com.bpjstku.data.tuition.model.response.PaymentHistoryResponse;
import com.bpjstku.data.tuition.remote.TuitionPaymentApi;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lcom/bpjstku/data/tuition/TuitionPaymentDataStore;", "Lcom/bpjstku/data/tuition/TuitionPaymentRepository;", "Lcom/bpjstku/data/tuition/remote/TuitionPaymentApi;", "p0", "<init>", "(Lcom/bpjstku/data/tuition/remote/TuitionPaymentApi;)V", "Lcom/bpjstku/data/tuition/model/request/TuitionPaymentRequest;", "LderiveCodec;", "Lcom/bpjstku/data/tuition/model/response/BpuPaymentStatusItem;", "getTuitionPayment", "(Lcom/bpjstku/data/tuition/model/request/TuitionPaymentRequest;)LderiveCodec;", "checkBpuPaymentStatus", "Lcom/bpjstku/data/tuition/model/request/PaymentHistoryRequest;", "Lcom/bpjstku/data/tuition/model/response/PaymentHistoryResponse;", "getPaymentHistory", "(Lcom/bpjstku/data/tuition/model/request/PaymentHistoryRequest;)LderiveCodec;", "Lcom/bpjstku/data/tuition/model/request/CallbackPaymentTuitionMidtransRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "callbackPaymentTuitionMidtransRequest", "(Lcom/bpjstku/data/tuition/model/request/CallbackPaymentTuitionMidtransRequest;)LderiveCodec;", "Lcom/bpjstku/data/tuition/model/request/BpuOneMonthTuitionRequest;", "Lcom/bpjstku/data/tuition/model/response/BpuOneMonthTuitionResponse;", "checkBpuOneMonth", "(Lcom/bpjstku/data/tuition/model/request/BpuOneMonthTuitionRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/tuition/remote/TuitionPaymentApi;", "getWebService", "()Lcom/bpjstku/data/tuition/remote/TuitionPaymentApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TuitionPaymentDataStore implements TuitionPaymentRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final TuitionPaymentApi webService;

    public TuitionPaymentDataStore(TuitionPaymentApi tuitionPaymentApi) {
        Intrinsics.checkNotNullParameter(tuitionPaymentApi, "");
        this.webService = tuitionPaymentApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7792getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final TuitionPaymentApi m7793getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.tuition.TuitionPaymentRepository
    public final deriveCodec<BpuPaymentStatusItem> getTuitionPayment(TuitionPaymentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BpuPaymentStatusItem>> tuitionPayment = m7793getWebService().getTuitionPayment(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(tuitionPayment, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.tuition.TuitionPaymentDataStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TuitionPaymentDataStore.getTuitionPayment$lambda$0((BpuPaymentStatusItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.tuition.TuitionPaymentDataStore$$ExternalSyntheticLambda9
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return TuitionPaymentDataStore.getTuitionPayment$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BpuPaymentStatusItem getTuitionPayment$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BpuPaymentStatusItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.tuition.TuitionPaymentRepository
    public final deriveCodec<BpuPaymentStatusItem> checkBpuPaymentStatus(TuitionPaymentRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BpuPaymentStatusItem>> derivecodecCheckBpuPaymentStatus = m7793getWebService().checkBpuPaymentStatus(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckBpuPaymentStatus, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.tuition.TuitionPaymentDataStore$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TuitionPaymentDataStore.checkBpuPaymentStatus$lambda$2((BpuPaymentStatusItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.tuition.TuitionPaymentDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return TuitionPaymentDataStore.checkBpuPaymentStatus$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BpuPaymentStatusItem checkBpuPaymentStatus$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BpuPaymentStatusItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.tuition.TuitionPaymentRepository
    public final deriveCodec<PaymentHistoryResponse> getPaymentHistory(PaymentHistoryRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<PaymentHistoryResponse>> paymentHistory = m7793getWebService().getPaymentHistory(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(paymentHistory, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.tuition.TuitionPaymentDataStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TuitionPaymentDataStore.getPaymentHistory$lambda$4((PaymentHistoryResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.tuition.TuitionPaymentDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return TuitionPaymentDataStore.getPaymentHistory$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentHistoryResponse getPaymentHistory$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (PaymentHistoryResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.tuition.TuitionPaymentRepository
    public final deriveCodec<BaseItem> callbackPaymentTuitionMidtransRequest(CallbackPaymentTuitionMidtransRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecCallbackPaymentTuitionMidtrans = m7793getWebService().callbackPaymentTuitionMidtrans(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCallbackPaymentTuitionMidtrans, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.tuition.TuitionPaymentDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TuitionPaymentDataStore.callbackPaymentTuitionMidtransRequest$lambda$6((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.tuition.TuitionPaymentDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return TuitionPaymentDataStore.callbackPaymentTuitionMidtransRequest$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem callbackPaymentTuitionMidtransRequest$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.tuition.TuitionPaymentRepository
    public final deriveCodec<BpuOneMonthTuitionResponse> checkBpuOneMonth(BpuOneMonthTuitionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BpuOneMonthTuitionResponse>> derivecodecCheckBpuOneMonth = m7793getWebService().checkBpuOneMonth(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckBpuOneMonth, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.tuition.TuitionPaymentDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TuitionPaymentDataStore.checkBpuOneMonth$lambda$8((BpuOneMonthTuitionResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.tuition.TuitionPaymentDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return TuitionPaymentDataStore.checkBpuOneMonth$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BpuOneMonthTuitionResponse checkBpuOneMonth$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BpuOneMonthTuitionResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem callbackPaymentTuitionMidtransRequest$lambda$6(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BpuOneMonthTuitionResponse checkBpuOneMonth$lambda$8(BpuOneMonthTuitionResponse bpuOneMonthTuitionResponse) {
        Intrinsics.checkNotNullParameter(bpuOneMonthTuitionResponse, "");
        return bpuOneMonthTuitionResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BpuPaymentStatusItem checkBpuPaymentStatus$lambda$2(BpuPaymentStatusItem bpuPaymentStatusItem) {
        Intrinsics.checkNotNullParameter(bpuPaymentStatusItem, "");
        return bpuPaymentStatusItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentHistoryResponse getPaymentHistory$lambda$4(PaymentHistoryResponse paymentHistoryResponse) {
        Intrinsics.checkNotNullParameter(paymentHistoryResponse, "");
        return paymentHistoryResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BpuPaymentStatusItem getTuitionPayment$lambda$0(BpuPaymentStatusItem bpuPaymentStatusItem) {
        Intrinsics.checkNotNullParameter(bpuPaymentStatusItem, "");
        return bpuPaymentStatusItem;
    }
}
