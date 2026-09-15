package com.bpjstku.data.report.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.report.model.request.DataCorrectionRequest;
import com.bpjstku.data.report.model.request.NearestHealthcareRequest;
import com.bpjstku.data.report.model.request.PreloadDataRequest;
import com.bpjstku.data.report.model.response.NearestHealthcareResponse;
import com.bpjstku.data.report.model.response.PreloadDataResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J#\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/bpjstku/data/report/remote/ReportApi;", "LunbindChildren;", "Lcom/bpjstku/data/report/remote/ReportApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/report/remote/ReportApiClient;)V", "Lcom/bpjstku/data/report/model/request/NearestHealthcareRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/report/model/response/NearestHealthcareResponse;", "getNearestHealthcare", "(Lcom/bpjstku/data/report/model/request/NearestHealthcareRequest;)LderiveCodec;", "Lcom/bpjstku/data/report/model/request/DataCorrectionRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "postDataCorrection", "(Lcom/bpjstku/data/report/model/request/DataCorrectionRequest;)LderiveCodec;", "", "", "Lokhttp3/RequestBody;", "Lokhttp3/MultipartBody$Part;", "p1", "postReportWorkAccident", "(Ljava/util/Map;Lokhttp3/MultipartBody$Part;)LderiveCodec;", "postUnregisteredCompany", "Lcom/bpjstku/data/report/model/request/PreloadDataRequest;", "Lcom/bpjstku/data/report/model/response/PreloadDataResponse;", "postPreloadData", "(Lcom/bpjstku/data/report/model/request/PreloadDataRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/report/remote/ReportApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReportApi implements unbindChildren, ReportApiClient {
    public static final int $stable = 8;
    private final ReportApiClient apiClient;

    public ReportApi(ReportApiClient reportApiClient) {
        Intrinsics.checkNotNullParameter(reportApiClient, "");
        this.apiClient = reportApiClient;
    }

    @Override // com.bpjstku.data.report.remote.ReportApiClient
    public final deriveCodec<Response<NearestHealthcareResponse>> getNearestHealthcare(NearestHealthcareRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getNearestHealthcare(p0);
    }

    @Override // com.bpjstku.data.report.remote.ReportApiClient
    public final deriveCodec<Response<BaseItem>> postDataCorrection(DataCorrectionRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postDataCorrection(p0);
    }

    @Override // com.bpjstku.data.report.remote.ReportApiClient
    public final deriveCodec<Response<BaseItem>> postReportWorkAccident(Map<String, ? extends RequestBody> p0, MultipartBody.Part p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postReportWorkAccident(p0, p1);
    }

    @Override // com.bpjstku.data.report.remote.ReportApiClient
    public final deriveCodec<Response<BaseItem>> postUnregisteredCompany(Map<String, ? extends RequestBody> p0, MultipartBody.Part p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return this.apiClient.postUnregisteredCompany(p0, p1);
    }

    @Override // com.bpjstku.data.report.remote.ReportApiClient
    public final deriveCodec<Response<PreloadDataResponse>> postPreloadData(PreloadDataRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.postPreloadData(p0);
    }
}
