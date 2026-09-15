package com.bpjstku.data.ewallet.motionpay;

import com.bpjstku.data.ewallet.motionpay.model.request.MotionCheckConnectRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionLinkingRequest;
import com.bpjstku.data.ewallet.motionpay.model.request.MotionUnlinkRequest;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionCheckConnectResponse;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionLinkingResponse;
import com.bpjstku.data.ewallet.motionpay.model.response.MotionUser;
import com.bpjstku.data.ewallet.motionpay.remote.MotionApi;
import com.bpjstku.domain.general.model.BaseModel;
import defpackage.Api23Impl;
import defpackage.Camera2InteropExtender;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0003\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/bpjstku/data/ewallet/motionpay/MotionDataStore;", "Lcom/bpjstku/data/ewallet/motionpay/MotionRepository;", "Lcom/bpjstku/data/ewallet/motionpay/remote/MotionApi;", "p0", "<init>", "(Lcom/bpjstku/data/ewallet/motionpay/remote/MotionApi;)V", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionLinkingRequest;", "LderiveCodec;", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionLinkingResponse;", "linkAccount", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionLinkingRequest;)LderiveCodec;", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionCheckConnectRequest;", "Lcom/bpjstku/data/ewallet/motionpay/model/response/MotionCheckConnectResponse;", "checkConnect", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionCheckConnectRequest;)LderiveCodec;", "Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionUnlinkRequest;", "Lcom/bpjstku/domain/general/model/BaseModel;", "unLinkAccountMpay", "(Lcom/bpjstku/data/ewallet/motionpay/model/request/MotionUnlinkRequest;)LderiveCodec;", "LmergeChildrenConfigs;", "dbService", "LmergeChildrenConfigs;", "getDbService", "()LmergeChildrenConfigs;", "webService", "Lcom/bpjstku/data/ewallet/motionpay/remote/MotionApi;", "getWebService", "()Lcom/bpjstku/data/ewallet/motionpay/remote/MotionApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MotionDataStore implements MotionRepository {
    public static final int $stable = 8;
    private final mergeChildrenConfigs dbService;
    private final MotionApi webService;

    public MotionDataStore(MotionApi motionApi) {
        Intrinsics.checkNotNullParameter(motionApi, "");
        this.webService = motionApi;
    }

    public final mergeChildrenConfigs getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final MotionApi m7607getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.ewallet.motionpay.MotionRepository
    public final deriveCodec<MotionLinkingResponse> linkAccount(MotionLinkingRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<MotionLinkingResponse>> derivecodecLinkAccount = m7607getWebService().linkAccount(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecLinkAccount, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.ewallet.motionpay.MotionDataStore$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MotionDataStore.linkAccount$lambda$0((MotionLinkingResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.ewallet.motionpay.MotionDataStore$$ExternalSyntheticLambda5
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return MotionDataStore.linkAccount$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionLinkingResponse linkAccount$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MotionLinkingResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionLinkingResponse linkAccount$lambda$0(MotionLinkingResponse motionLinkingResponse) {
        Intrinsics.checkNotNullParameter(motionLinkingResponse, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        motionLinkingResponse.setMessage(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionLinkingResponse.getMessage()));
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        motionLinkingResponse.setMsgCode(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionLinkingResponse.getMsgCode()));
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        motionLinkingResponse.setUrl(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionLinkingResponse.getUrl()));
        return motionLinkingResponse;
    }

    @Override // com.bpjstku.data.ewallet.motionpay.MotionRepository
    public final deriveCodec<MotionCheckConnectResponse> checkConnect(MotionCheckConnectRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<MotionCheckConnectResponse>> derivecodecCheckConnect = m7607getWebService().checkConnect(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckConnect, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.ewallet.motionpay.MotionDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MotionDataStore.checkConnect$lambda$3((MotionCheckConnectResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.ewallet.motionpay.MotionDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return MotionDataStore.checkConnect$lambda$4(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionCheckConnectResponse checkConnect$lambda$4(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MotionCheckConnectResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionCheckConnectResponse checkConnect$lambda$3(MotionCheckConnectResponse motionCheckConnectResponse) {
        Intrinsics.checkNotNullParameter(motionCheckConnectResponse, "");
        Camera2InteropExtender.Companion companion = Camera2InteropExtender.INSTANCE;
        motionCheckConnectResponse.setExists(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionCheckConnectResponse.isExists()));
        Camera2InteropExtender.Companion companion2 = Camera2InteropExtender.INSTANCE;
        motionCheckConnectResponse.setCash(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionCheckConnectResponse.getCash()));
        Camera2InteropExtender.Companion companion3 = Camera2InteropExtender.INSTANCE;
        motionCheckConnectResponse.setPoint(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionCheckConnectResponse.getPoint()));
        Camera2InteropExtender.Companion companion4 = Camera2InteropExtender.INSTANCE;
        motionCheckConnectResponse.setMessage(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(motionCheckConnectResponse.getMessage()));
        MotionUser user = motionCheckConnectResponse.getUser();
        if (user != null) {
            Camera2InteropExtender.Companion companion5 = Camera2InteropExtender.INSTANCE;
            user.setFullname(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(user.getFullname()));
            Camera2InteropExtender.Companion companion6 = Camera2InteropExtender.INSTANCE;
            user.setPhone(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(user.getPhone()));
            Camera2InteropExtender.Companion companion7 = Camera2InteropExtender.INSTANCE;
            user.setType(Camera2InteropExtender.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1(user.getType()));
        }
        return motionCheckConnectResponse;
    }

    @Override // com.bpjstku.data.ewallet.motionpay.MotionRepository
    public final deriveCodec<BaseModel> unLinkAccountMpay(MotionUnlinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseModel>> derivecodecUnlinkMpay = m7607getWebService().unlinkMpay(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecUnlinkMpay, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.ewallet.motionpay.MotionDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MotionDataStore.unLinkAccountMpay$lambda$5((BaseModel) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.ewallet.motionpay.MotionDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return MotionDataStore.unLinkAccountMpay$lambda$6(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseModel unLinkAccountMpay$lambda$6(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseModel) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseModel unLinkAccountMpay$lambda$5(BaseModel baseModel) {
        Intrinsics.checkNotNullParameter(baseModel, "");
        return baseModel;
    }
}
