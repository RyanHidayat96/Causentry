package com.bpjstku.data.jkp.remote;

import com.bpjstku.data.jkp.model.request.CheckSubmissionJkpRequest;
import com.bpjstku.data.jkp.model.request.JkpClaimTrackRequest;
import com.bpjstku.data.jkp.model.response.JkpClaimTrackItem;
import com.bpjstku.data.jkp.model.response.SubmissionJkpResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/jkp/remote/JkpApi;", "LunbindChildren;", "Lcom/bpjstku/data/jkp/remote/JkpApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/jkp/remote/JkpApiClient;)V", "Lcom/bpjstku/data/jkp/model/request/JkpClaimTrackRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/jkp/model/response/JkpClaimTrackItem;", "postTrackClaim", "(Lcom/bpjstku/data/jkp/model/request/JkpClaimTrackRequest;)LderiveCodec;", "Lcom/bpjstku/data/jkp/model/request/CheckSubmissionJkpRequest;", "Lcom/bpjstku/data/jkp/model/response/SubmissionJkpResponse;", "checkSubmissionJkp", "(Lcom/bpjstku/data/jkp/model/request/CheckSubmissionJkpRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/jkp/remote/JkpApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JkpApi implements unbindChildren, JkpApiClient {
    public static final int $stable = 8;
    private final JkpApiClient apiClient;

    public JkpApi(JkpApiClient jkpApiClient) {
        Intrinsics.checkNotNullParameter(jkpApiClient, "");
        this.apiClient = jkpApiClient;
    }

    @Override // com.bpjstku.data.jkp.remote.JkpApiClient
    public final deriveCodec<Response<JkpClaimTrackItem>> postTrackClaim(JkpClaimTrackRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postTrackClaim(p0);
    }

    @Override // com.bpjstku.data.jkp.remote.JkpApiClient
    public final deriveCodec<Response<SubmissionJkpResponse>> checkSubmissionJkp(CheckSubmissionJkpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkSubmissionJkp(p0);
    }
}
