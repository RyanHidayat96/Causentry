package com.bpjstku.data.podcast;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.podcast.model.request.PodcastLogRequest;
import com.bpjstku.data.podcast.model.request.PodcastRequest;
import com.bpjstku.data.podcast.model.response.PodcastResponse;
import com.bpjstku.data.podcast.model.response.VideoList;
import com.bpjstku.data.podcast.remote.PodcastApi;
import defpackage.Api23Impl;
import defpackage.deriveCodec;
import defpackage.mergeChildrenConfigs;
import defpackage.readableMs;
import defpackage.setBufferSizeInBytes;
import defpackage.share;
import defpackage.unbind;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/bpjstku/data/podcast/PodcastDataStore;", "Lcom/bpjstku/data/podcast/PodcastRepository;", "Lcom/bpjstku/data/podcast/remote/PodcastApi;", "p0", "<init>", "(Lcom/bpjstku/data/podcast/remote/PodcastApi;)V", "Lcom/bpjstku/data/podcast/model/request/PodcastRequest;", "LderiveCodec;", "", "Lcom/bpjstku/data/podcast/model/response/VideoList;", "getListVideo", "(Lcom/bpjstku/data/podcast/model/request/PodcastRequest;)LderiveCodec;", "Lcom/bpjstku/data/podcast/model/request/PodcastLogRequest;", "Lcom/bpjstku/data/lib/model/BaseItem;", "podcastLog", "(Lcom/bpjstku/data/podcast/model/request/PodcastLogRequest;)LderiveCodec;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;", "webService", "Lcom/bpjstku/data/podcast/remote/PodcastApi;", "getWebService", "()Lcom/bpjstku/data/podcast/remote/PodcastApi;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PodcastDataStore implements PodcastRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final PodcastApi webService;

    public PodcastDataStore(PodcastApi podcastApi) {
        Intrinsics.checkNotNullParameter(podcastApi, "");
        this.webService = podcastApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7689getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    public final Void getDbService() {
        return this.dbService;
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final PodcastApi m7690getWebService() {
        return this.webService;
    }

    @Override // com.bpjstku.data.podcast.PodcastRepository
    public final deriveCodec<List<VideoList>> getListVideo(PodcastRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<PodcastResponse>> listVideo = m7690getWebService().getListVideo(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(listVideo, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.podcast.PodcastDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PodcastDataStore.getListVideo$lambda$0((PodcastResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.podcast.PodcastDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PodcastDataStore.getListVideo$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListVideo$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getListVideo$lambda$0(PodcastResponse podcastResponse) {
        Intrinsics.checkNotNullParameter(podcastResponse, "");
        return podcastResponse.getData();
    }

    @Override // com.bpjstku.data.podcast.PodcastRepository
    public final deriveCodec<BaseItem> podcastLog(PodcastLogRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<BaseItem>> derivecodecPodcastLog = m7690getWebService().podcastLog(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(derivecodecPodcastLog, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.podcast.PodcastDataStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PodcastDataStore.podcastLog$lambda$2((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.podcast.PodcastDataStore$$ExternalSyntheticLambda3
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return PodcastDataStore.podcastLog$lambda$3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem podcastLog$lambda$3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BaseItem podcastLog$lambda$2(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }
}
