package com.bpjstku.data.banner.remote;

import com.bpjstku.data.banner.model.request.BannerRequest;
import com.bpjstku.data.banner.model.response.BannerResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/bpjstku/data/banner/remote/BannerApi;", "LunbindChildren;", "Lcom/bpjstku/data/banner/remote/BannerApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/banner/remote/BannerApiClient;)V", "Lcom/bpjstku/data/banner/model/request/BannerRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/banner/model/response/BannerResponse;", "getBanners", "(Lcom/bpjstku/data/banner/model/request/BannerRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/banner/remote/BannerApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerApi implements unbindChildren, BannerApiClient {
    public static final int $stable = 8;
    private final BannerApiClient apiClient;

    public BannerApi(BannerApiClient bannerApiClient) {
        Intrinsics.checkNotNullParameter(bannerApiClient, "");
        this.apiClient = bannerApiClient;
    }

    @Override // com.bpjstku.data.banner.remote.BannerApiClient
    public final deriveCodec<Response<BannerResponse>> getBanners(BannerRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getBanners(p0);
    }
}
