package com.bpjstku.data.podcast.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/bpjstku/data/podcast/model/response/PodcastDetailResponse;", "", "Lcom/bpjstku/data/podcast/model/response/DetailPodcast;", "p0", "<init>", "(Lcom/bpjstku/data/podcast/model/response/DetailPodcast;)V", "component1", "()Lcom/bpjstku/data/podcast/model/response/DetailPodcast;", "copy", "(Lcom/bpjstku/data/podcast/model/response/DetailPodcast;)Lcom/bpjstku/data/podcast/model/response/PodcastDetailResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bpjstku/data/podcast/model/response/DetailPodcast;", "getData"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PodcastDetailResponse {
    public static final int $stable = 0;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final DetailPodcast data;

    public PodcastDetailResponse(DetailPodcast detailPodcast) {
        Intrinsics.checkNotNullParameter(detailPodcast, "");
        this.data = detailPodcast;
    }

    public final DetailPodcast getData() {
        return this.data;
    }

    public static /* synthetic */ PodcastDetailResponse copy$default(PodcastDetailResponse podcastDetailResponse, DetailPodcast detailPodcast, int i, Object obj) {
        if ((i & 1) != 0) {
            detailPodcast = podcastDetailResponse.data;
        }
        return podcastDetailResponse.copy(detailPodcast);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DetailPodcast getData() {
        return this.data;
    }

    public final PodcastDetailResponse copy(DetailPodcast p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new PodcastDetailResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof PodcastDetailResponse) && Intrinsics.areEqual(this.data, ((PodcastDetailResponse) p0).data);
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final String toString() {
        DetailPodcast detailPodcast = this.data;
        StringBuilder sb = new StringBuilder("PodcastDetailResponse(data=");
        sb.append(detailPodcast);
        sb.append(")");
        return sb.toString();
    }
}
