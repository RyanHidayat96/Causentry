package com.bpjstku.data.jp.remote;

import com.bpjstku.data.jp.model.request.CheckEligibilityJpRequest;
import com.bpjstku.data.jp.model.request.GetCountClaimJpRequest;
import com.bpjstku.data.jp.model.request.GetJpBenefitRequest;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessBegin;
import com.bpjstku.data.jp.model.request.JpVerificationLivenessEnd;
import com.bpjstku.data.jp.model.response.CheckEligibilityJpResponse;
import com.bpjstku.data.jp.model.response.GetCountClaimJpResponse;
import com.bpjstku.data.jp.model.response.GetJpBenefitResponse;
import com.bpjstku.data.jp.model.response.JpVerificationResponse;
import com.bpjstku.data.lib.model.BaseItem;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\b0\u00072\u0006\u0010\u0003\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$"}, d2 = {"Lcom/bpjstku/data/jp/remote/JpApi;", "LunbindChildren;", "Lcom/bpjstku/data/jp/remote/JpApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/jp/remote/JpApiClient;)V", "Lcom/bpjstku/data/jp/model/request/GetCountClaimJpRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/jp/model/response/GetCountClaimJpResponse;", "getCountClaimJp", "(Lcom/bpjstku/data/jp/model/request/GetCountClaimJpRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/CheckEligibilityJpRequest;", "Lcom/bpjstku/data/jp/model/response/CheckEligibilityJpResponse;", "checkEligibility", "(Lcom/bpjstku/data/jp/model/request/CheckEligibilityJpRequest;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/GetJpBenefitRequest;", "Lcom/bpjstku/data/jp/model/response/GetJpBenefitResponse;", "getJpBenefitInformation", "(Lcom/bpjstku/data/jp/model/request/GetJpBenefitRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lokhttp3/MultipartBody$Part;", "p1", "Lcom/bpjstku/data/lib/model/BaseItem;", "insertConfirmationJp", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessBegin;", "Lcom/bpjstku/data/jp/model/response/JpVerificationResponse;", "verificationJpLivenessBegin", "(Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessBegin;)LderiveCodec;", "Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessEnd;", "verificationJpLivenessEnd", "(Lcom/bpjstku/data/jp/model/request/JpVerificationLivenessEnd;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/jp/remote/JpApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JpApi implements unbindChildren, JpApiClient {
    public static final int $stable = 8;
    private final JpApiClient apiClient;

    public JpApi(JpApiClient jpApiClient) {
        Intrinsics.checkNotNullParameter(jpApiClient, "");
        this.apiClient = jpApiClient;
    }

    @Override // com.bpjstku.data.jp.remote.JpApiClient
    public final deriveCodec<Response<GetCountClaimJpResponse>> getCountClaimJp(GetCountClaimJpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getCountClaimJp(p0);
    }

    @Override // com.bpjstku.data.jp.remote.JpApiClient
    public final deriveCodec<Response<CheckEligibilityJpResponse>> checkEligibility(CheckEligibilityJpRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.checkEligibility(p0);
    }

    @Override // com.bpjstku.data.jp.remote.JpApiClient
    public final deriveCodec<Response<GetJpBenefitResponse>> getJpBenefitInformation(GetJpBenefitRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getJpBenefitInformation(p0);
    }

    @Override // com.bpjstku.data.jp.remote.JpApiClient
    public final deriveCodec<Response<BaseItem>> insertConfirmationJp(Map<String, ? extends RequestBody> p0, MultipartBody.Part p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.insertConfirmationJp(p0, p1);
    }

    @Override // com.bpjstku.data.jp.remote.JpApiClient
    public final deriveCodec<Response<JpVerificationResponse>> verificationJpLivenessBegin(JpVerificationLivenessBegin p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verificationJpLivenessBegin(p0);
    }

    @Override // com.bpjstku.data.jp.remote.JpApiClient
    public final deriveCodec<Response<JpVerificationResponse>> verificationJpLivenessEnd(JpVerificationLivenessEnd p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.verificationJpLivenessEnd(p0);
    }
}
