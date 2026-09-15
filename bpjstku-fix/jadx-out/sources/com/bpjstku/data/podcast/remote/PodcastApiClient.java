package com.bpjstku.data.podcast.remote;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.podcast.model.request.PodcastLogRequest;
import com.bpjstku.data.podcast.model.request.PodcastRequest;
import com.bpjstku.data.podcast.model.response.PodcastResponse;
import defpackage.deriveCodec;
import kotlin.Metadata;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/podcast/remote/PodcastApiClient;", "", "Lcom/bpjstku/data/podcast/model/request/PodcastRequest;", "p0", "LderiveCodec;", "Lretrofit2/Response;", "Lcom/bpjstku/data/podcast/model/response/PodcastResponse;", "getListVideo", "(Lcom/bpjstku/data/podcast/model/request/PodcastRequest;)LderiveCodec;", "Lcom/bpjstku/data/podcast/model/request/PodcastLogRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "podcastLog", "(Lcom/bpjstku/data/podcast/model/request/PodcastLogRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PodcastApiClient {
    @POST("podcast/video-list")
    deriveCodec<Response<PodcastResponse>> getListVideo(@Body PodcastRequest p0);

    @POST("podcast/insert")
    deriveCodec<Response<BaseItem>> podcastLog(@Body PodcastLogRequest p0);
}
