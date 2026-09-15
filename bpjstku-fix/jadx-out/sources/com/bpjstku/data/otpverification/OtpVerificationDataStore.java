package com.bpjstku.data.otpverification;

import com.bpjstku.data.otpverification.model.request.OtpVerificationActivationRequest;
import com.bpjstku.data.otpverification.model.request.OtpVerificationRequest;
import com.bpjstku.data.otpverification.model.request.OtpVerificationRequestAuth;
import com.bpjstku.data.otpverification.model.response.OtpVerificationResponse;
import com.bpjstku.data.otpverification.model.response.RequestOtpTokenItem;
import com.bpjstku.data.otpverification.remote.OtpVerificationApi;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0011\u0010\rJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!"}, d2 = {"Lcom/bpjstku/data/otpverification/OtpVerificationDataStore;", "Lcom/bpjstku/data/otpverification/OtpVerificationRepository;", "Lcom/bpjstku/data/otpverification/remote/OtpVerificationApi;", "p0", "<init>", "(Lcom/bpjstku/data/otpverification/remote/OtpVerificationApi;)V", "LderiveCodec;", "Lcom/bpjstku/data/otpverification/model/response/RequestOtpTokenItem;", "getAccessToken", "()LderiveCodec;", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;", "Lcom/bpjstku/data/otpverification/model/response/OtpVerificationResponse;", "verifyOtpOld", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;)LderiveCodec;", "", "p1", "(Ljava/lang/String;Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequest;)LderiveCodec;", "verifyOtp", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;", "verifyActivationOtp", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;)LderiveCodec;", "(Ljava/lang/String;Lcom/bpjstku/data/otpverification/model/request/OtpVerificationActivationRequest;)LderiveCodec;", "Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequestAuth;", "verifyOtpAuth", "(Lcom/bpjstku/data/otpverification/model/request/OtpVerificationRequestAuth;)LderiveCodec;", "otpVerificationApi", "Lcom/bpjstku/data/otpverification/remote/OtpVerificationApi;", "LmergeChildrenConfigs;", "getDbService", "()LmergeChildrenConfigs;", "dbService", "webService", "getWebService", "()Lcom/bpjstku/data/otpverification/remote/OtpVerificationApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OtpVerificationDataStore implements OtpVerificationRepository {
    public static final int $stable = 0;
    private final OtpVerificationApi otpVerificationApi;
    private final OtpVerificationApi webService;

    public final mergeChildrenConfigs getDbService() {
        return null;
    }

    public OtpVerificationDataStore(OtpVerificationApi otpVerificationApi) {
        Intrinsics.checkNotNullParameter(otpVerificationApi, "");
        this.otpVerificationApi = otpVerificationApi;
        this.webService = otpVerificationApi;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final OtpVerificationApi m7670getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.otpverification.OtpVerificationRepository
    public final deriveCodec<RequestOtpTokenItem> getAccessToken() {
        deriveCodec<Response<RequestOtpTokenItem>> accessToken = m7670getWebService().getAccessToken();
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(accessToken, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpVerificationDataStore.getAccessToken$lambda$0((RequestOtpTokenItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda4
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OtpVerificationDataStore.getAccessToken$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestOtpTokenItem getAccessToken$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (RequestOtpTokenItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.otpverification.OtpVerificationRepository
    public final deriveCodec<OtpVerificationResponse> verifyOtpOld(OtpVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<OtpVerificationResponse>> derivecodecVerifyOtpOld = m7670getWebService().verifyOtpOld(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyOtpOld, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpVerificationDataStore.verifyOtpOld$lambda$2((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda11
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OtpVerificationDataStore.verifyOtpOld$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyOtpOld$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.otpverification.OtpVerificationRepository
    public final deriveCodec<OtpVerificationResponse> verifyOtpOld(String p0, OtpVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<OtpVerificationResponse>> derivecodecVerifyOtpOld = m7670getWebService().verifyOtpOld(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyOtpOld, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpVerificationDataStore.verifyOtpOld$lambda$4((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda7
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OtpVerificationDataStore.verifyOtpOld$lambda$5(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyOtpOld$lambda$5(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.otpverification.OtpVerificationRepository
    public final deriveCodec<OtpVerificationResponse> verifyOtp(OtpVerificationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<OtpVerificationResponse>> derivecodecVerifyOtp = m7670getWebService().verifyOtp(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyOtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpVerificationDataStore.verifyOtp$lambda$6((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda2
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OtpVerificationDataStore.verifyOtp$lambda$7(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyOtp$lambda$7(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.otpverification.OtpVerificationRepository
    public final deriveCodec<OtpVerificationResponse> verifyOtp(String p0, OtpVerificationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<OtpVerificationResponse>> derivecodecVerifyOtp = m7670getWebService().verifyOtp(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyOtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpVerificationDataStore.verifyOtp$lambda$8((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda9
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OtpVerificationDataStore.verifyOtp$lambda$9(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyOtp$lambda$9(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.otpverification.OtpVerificationRepository
    public final deriveCodec<OtpVerificationResponse> verifyActivationOtp(OtpVerificationActivationRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<OtpVerificationResponse>> derivecodecVerifyActivationOtp = m7670getWebService().verifyActivationOtp(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyActivationOtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpVerificationDataStore.verifyActivationOtp$lambda$10((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda6
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OtpVerificationDataStore.verifyActivationOtp$lambda$11(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyActivationOtp$lambda$11(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.otpverification.OtpVerificationRepository
    public final deriveCodec<OtpVerificationResponse> verifyActivationOtp(String p0, OtpVerificationActivationRequest p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        deriveCodec<Response<OtpVerificationResponse>> derivecodecVerifyActivationOtp = m7670getWebService().verifyActivationOtp(p0, p1);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyActivationOtp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpVerificationDataStore.verifyActivationOtp$lambda$12((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda13
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OtpVerificationDataStore.verifyActivationOtp$lambda$13(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyActivationOtp$lambda$13(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.otpverification.OtpVerificationRepository
    public final deriveCodec<OtpVerificationResponse> verifyOtpAuth(OtpVerificationRequestAuth p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<OtpVerificationResponse>> derivecodecVerifyOtpAuth = m7670getWebService().verifyOtpAuth(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecVerifyOtpAuth, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtpVerificationDataStore.verifyOtpAuth$lambda$14((OtpVerificationResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.otpverification.OtpVerificationDataStore$$ExternalSyntheticLambda15
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return OtpVerificationDataStore.verifyOtpAuth$lambda$15(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyOtpAuth$lambda$15(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (OtpVerificationResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestOtpTokenItem getAccessToken$lambda$0(RequestOtpTokenItem requestOtpTokenItem) {
        Intrinsics.checkNotNullParameter(requestOtpTokenItem, "");
        return requestOtpTokenItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyActivationOtp$lambda$10(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        return otpVerificationResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyActivationOtp$lambda$12(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        return otpVerificationResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyOtp$lambda$6(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        return otpVerificationResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyOtp$lambda$8(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        return otpVerificationResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyOtpAuth$lambda$14(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        return otpVerificationResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyOtpOld$lambda$2(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        return otpVerificationResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OtpVerificationResponse verifyOtpOld$lambda$4(OtpVerificationResponse otpVerificationResponse) {
        Intrinsics.checkNotNullParameter(otpVerificationResponse, "");
        return otpVerificationResponse;
    }
}
