package com.bpjstku.data.podcast.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.podcast.model.request.PodcastLogRequest;
import com.bpjstku.data.podcast.model.request.PodcastRequest;
import com.bpjstku.data.podcast.model.response.PodcastResponse;
import defpackage.deriveCodec;
import defpackage.unbindChildren;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/bpjstku/data/podcast/remote/PodcastApi;", "LunbindChildren;", "Lcom/bpjstku/data/podcast/remote/PodcastApiClient;", "p0", "<init>", "(Lcom/bpjstku/data/podcast/remote/PodcastApiClient;)V", "Lcom/bpjstku/data/podcast/model/request/PodcastRequest;", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/podcast/model/response/PodcastResponse;", "getListVideo", "(Lcom/bpjstku/data/podcast/model/request/PodcastRequest;)LderiveCodec;", "Lcom/bpjstku/data/podcast/model/request/PodcastLogRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "podcastLog", "(Lcom/bpjstku/data/podcast/model/request/PodcastLogRequest;)LderiveCodec;", "apiClient", "Lcom/bpjstku/data/podcast/remote/PodcastApiClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PodcastApi implements unbindChildren, PodcastApiClient {
    public static final int $stable = 8;
    private final PodcastApiClient apiClient;

    public PodcastApi(PodcastApiClient podcastApiClient) {
        Intrinsics.checkNotNullParameter(podcastApiClient, "");
        this.apiClient = podcastApiClient;
    }

    @Override // com.bpjstku.data.podcast.remote.PodcastApiClient
    public final deriveCodec<Response<PodcastResponse>> getListVideo(PodcastRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.getListVideo(p0);
    }

    @Override // com.bpjstku.data.podcast.remote.PodcastApiClient
    public final deriveCodec<Response<BaseItem>> podcastLog(PodcastLogRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.apiClient.podcastLog(p0);
    }
}
