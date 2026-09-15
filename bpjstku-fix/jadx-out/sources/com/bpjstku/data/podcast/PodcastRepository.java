package com.bpjstku.data.podcast;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.podcast.model.request.PodcastLogRequest;
import com.bpjstku.data.podcast.model.request.PodcastRequest;
import com.bpjstku.data.podcast.model.response.VideoList;
import defpackage.deriveCodec;
import defpackage.getChildrenOutConfigs;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/bpjstku/data/podcast/PodcastRepository;", "LgetChildrenOutConfigs;", "Lcom/bpjstku/data/podcast/model/request/PodcastRequest;", "p0", "LderiveCodec;", "", "Lcom/bpjstku/data/podcast/model/response/VideoList;", "getListVideo", "(Lcom/bpjstku/data/podcast/model/request/PodcastRequest;)LderiveCodec;", "Lcom/bpjstku/data/podcast/model/request/PodcastLogRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "podcastLog", "(Lcom/bpjstku/data/podcast/model/request/PodcastLogRequest;)LderiveCodec;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PodcastRepository extends getChildrenOutConfigs {
    deriveCodec<List<VideoList>> getListVideo(PodcastRequest p0);

    deriveCodec<BaseItem> podcastLog(PodcastLogRequest p0);
}
