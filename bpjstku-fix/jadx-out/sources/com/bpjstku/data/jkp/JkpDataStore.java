package com.bpjstku.data.jkp;

import com.bpjstku.data.jkp.model.request.CheckSubmissionJkpRequest;
import com.bpjstku.data.jkp.model.request.JkpClaimTrackRequest;
import com.bpjstku.data.jkp.model.response.JkpClaimTrackItem;
import com.bpjstku.data.jkp.model.response.SubmissionJkpResponse;
import com.bpjstku.data.jkp.remote.JkpApi;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/bpjstku/data/jkp/JkpDataStore;", "Lcom/bpjstku/data/jkp/JkpRepository;", "Lcom/bpjstku/data/jkp/remote/JkpApi;", "p0", "<init>", "(Lcom/bpjstku/data/jkp/remote/JkpApi;)V", "Lcom/bpjstku/data/jkp/model/request/JkpClaimTrackRequest;", "LderiveCodec;", "Lcom/bpjstku/data/jkp/model/response/JkpClaimTrackItem;", "postTrackClaim", "(Lcom/bpjstku/data/jkp/model/request/JkpClaimTrackRequest;)LderiveCodec;", "Lcom/bpjstku/data/jkp/model/request/CheckSubmissionJkpRequest;", "Lcom/bpjstku/data/jkp/model/response/SubmissionJkpResponse;", "checkSubmissionJkp", "(Lcom/bpjstku/data/jkp/model/request/CheckSubmissionJkpRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/jkp/remote/JkpApi;", "getWebService", "()Lcom/bpjstku/data/jkp/remote/JkpApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JkpDataStore implements JkpRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final JkpApi webService;

    public JkpDataStore(JkpApi jkpApi) {
        Intrinsics.checkNotNullParameter(jkpApi, "");
        this.webService = jkpApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7632getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final JkpApi m7633getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.jkp.JkpRepository
    public final deriveCodec<JkpClaimTrackItem> postTrackClaim(JkpClaimTrackRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<JkpClaimTrackItem>> derivecodecPostTrackClaim = m7633getWebService().postTrackClaim(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPostTrackClaim, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jkp.JkpDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkpDataStore.postTrackClaim$lambda$0((JkpClaimTrackItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jkp.JkpDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JkpDataStore.postTrackClaim$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JkpClaimTrackItem postTrackClaim$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JkpClaimTrackItem) function1.invoke(obj);
    }

    @Override // com.bpjstku.data.jkp.JkpRepository
    public final deriveCodec<SubmissionJkpResponse> checkSubmissionJkp(CheckSubmissionJkpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<SubmissionJkpResponse>> derivecodecCheckSubmissionJkp = m7633getWebService().checkSubmissionJkp(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecCheckSubmissionJkp, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.jkp.JkpDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JkpDataStore.checkSubmissionJkp$lambda$2((SubmissionJkpResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.jkp.JkpDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return JkpDataStore.checkSubmissionJkp$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmissionJkpResponse checkSubmissionJkp$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (SubmissionJkpResponse) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubmissionJkpResponse checkSubmissionJkp$lambda$2(SubmissionJkpResponse submissionJkpResponse) {
        Intrinsics.checkNotNullParameter(submissionJkpResponse, "");
        return submissionJkpResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JkpClaimTrackItem postTrackClaim$lambda$0(JkpClaimTrackItem jkpClaimTrackItem) {
        Intrinsics.checkNotNullParameter(jkpClaimTrackItem, "");
        return jkpClaimTrackItem;
    }
}
