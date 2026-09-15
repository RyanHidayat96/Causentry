package defpackage;

import com.bpjstku.data.news.NewsRepository;
import com.bpjstku.data.news.model.request.NewsRequest;
import com.bpjstku.data.news.model.response.NewsItem;
import com.bpjstku.domain.news.model.News;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaqS1cldBgQdRb0InzIVn5XXJnx0Q implements ComponentDialogExternalSyntheticLambda0 {
    private final NewsRepository TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public r8lambdaqS1cldBgQdRb0InzIVn5XXJnx0Q(NewsRepository newsRepository) {
        Intrinsics.checkNotNullParameter(newsRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = newsRepository;
    }

    @Override // defpackage.ComponentDialogExternalSyntheticLambda0
    public final deriveCodec<List<News>> b(int i, int i2) {
        deriveCodec<List<NewsItem>> news = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getNews(new NewsRequest(String.valueOf(i), String.valueOf(i2)));
        final Function1 function1 = new Function1() { // from class: getLifecycleRegistry
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r8lambdaqS1cldBgQdRb0InzIVn5XXJnx0Q.TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: onStart
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return r8lambdaqS1cldBgQdRb0InzIVn5XXJnx0Q.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(news, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault3(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<NewsItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (NewsItem newsItem : list2) {
            Intrinsics.checkNotNullParameter(newsItem, "");
            String content = newsItem.getContent();
            if (content == null) {
                content = "";
            }
            String datePublish = newsItem.getDatePublish();
            if (datePublish == null) {
                datePublish = "";
            }
            String imagePath = newsItem.getImagePath();
            if (imagePath == null) {
                imagePath = "";
            }
            String title = newsItem.getTitle();
            if (title == null) {
                title = "";
            }
            arrayList.add(new News(content, datePublish, imagePath, title));
        }
        return arrayList;
    }

    public static /* synthetic */ List TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }
}
