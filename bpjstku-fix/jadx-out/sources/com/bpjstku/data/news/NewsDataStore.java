package com.bpjstku.data.news;

import com.bpjstku.data.news.model.request.NewsRequest;
import com.bpjstku.data.news.model.response.NewsItem;
import com.bpjstku.data.news.model.response.NewsResponse;
import com.bpjstku.data.news.remote.NewsApi;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/bpjstku/data/news/NewsDataStore;", "Lcom/bpjstku/data/news/NewsRepository;", "Lcom/bpjstku/data/news/remote/NewsApi;", "p0", "<init>", "(Lcom/bpjstku/data/news/remote/NewsApi;)V", "Lcom/bpjstku/data/news/model/request/NewsRequest;", "LderiveCodec;", "", "Lcom/bpjstku/data/news/model/response/NewsItem;", "getNews", "(Lcom/bpjstku/data/news/model/request/NewsRequest;)LderiveCodec;", "webService", "Lcom/bpjstku/data/news/remote/NewsApi;", "getWebService", "()Lcom/bpjstku/data/news/remote/NewsApi;", "", "dbService", "Ljava/lang/Void;", "getDbService", "()Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NewsDataStore implements NewsRepository {
    public static final int $stable = 8;
    private final Void dbService;
    private final NewsApi webService;

    public NewsDataStore(NewsApi newsApi) {
        Intrinsics.checkNotNullParameter(newsApi, "");
        this.webService = newsApi;
    }

    /* JADX INFO: renamed from: getDbService, reason: collision with other method in class */
    public final /* bridge */ /* synthetic */ mergeChildrenConfigs m7657getDbService() {
        return (mergeChildrenConfigs) getDbService();
    }

    /* JADX INFO: renamed from: getWebService, reason: from getter and merged with bridge method [inline-methods] */
    public final NewsApi m7658getWebService() {
        return this.webService;
    }

    public final Void getDbService() {
        return this.dbService;
    }

    @Override // com.bpjstku.data.news.NewsRepository
    public final deriveCodec<List<NewsItem>> getNews(NewsRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        deriveCodec<Response<NewsResponse>> news = m7658getWebService().getNews(p0);
        unbind unbindVar = new unbind();
        share.b(unbindVar, "lift is null");
        setBufferSizeInBytes setbuffersizeinbytes = new setBufferSizeInBytes(news, unbindVar);
        final Function1 function1 = new Function1() { // from class: com.bpjstku.data.news.NewsDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewsDataStore.getNews$lambda$0((NewsResponse) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: com.bpjstku.data.news.NewsDataStore$$ExternalSyntheticLambda1
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return NewsDataStore.getNews$lambda$1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(setbuffersizeinbytes, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getNews$lambda$0(NewsResponse newsResponse) {
        Intrinsics.checkNotNullParameter(newsResponse, "");
        return newsResponse.getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getNews$lambda$1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }
}
