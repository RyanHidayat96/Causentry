package defpackage;

import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.data.podcast.PodcastRepository;
import com.bpjstku.data.podcast.model.request.PodcastLogRequest;
import com.bpjstku.data.podcast.model.request.PodcastRequest;
import com.bpjstku.data.podcast.model.response.VideoList;
import com.bpjstku.domain.podcast.model.PodcastVideoList;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetFallbackOnBackPressedp implements addCallback {
    private final PodcastRepository TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public accessgetFallbackOnBackPressedp(PodcastRepository podcastRepository) {
        Intrinsics.checkNotNullParameter(podcastRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = podcastRepository;
    }

    @Override // defpackage.addCallback
    public final deriveCodec<List<PodcastVideoList>> b(PodcastRequest podcastRequest) {
        Intrinsics.checkNotNullParameter(podcastRequest, "");
        deriveCodec<List<VideoList>> listVideo = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getListVideo(podcastRequest);
        final Function1 function1 = new Function1() { // from class: getEventInput
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return accessgetFallbackOnBackPressedp.TuitionPaymentFragmentbindingInflater1((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: dispatchOnBackCancelled
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return accessgetFallbackOnBackPressedp.b(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(listVideo, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    @Override // defpackage.addCallback
    public final deriveCodec<BaseItem> TuitionPaymentFragmentspecialinlinedviewModeldefault3(PodcastLogRequest podcastLogRequest) {
        Intrinsics.checkNotNullParameter(podcastLogRequest, "");
        deriveCodec<BaseItem> derivecodecPodcastLog = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.podcastLog(podcastLogRequest);
        final Function1 function1 = new Function1() { // from class: addCallbacklambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return accessgetFallbackOnBackPressedp.TuitionPaymentFragmentspecialinlinedviewModeldefault2((BaseItem) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: eventInput_delegatelambda0
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return accessgetFallbackOnBackPressedp.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(derivecodecPodcastLog, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ List b(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (BaseItem) function1.invoke(obj);
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<VideoList> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (VideoList videoList : list2) {
            Intrinsics.checkNotNullParameter(videoList, "");
            String thumbnail = videoList.getThumbnail();
            if (thumbnail == null) {
                thumbnail = "";
            }
            String description = videoList.getDescription();
            if (description == null) {
                description = "";
            }
            String videoId = videoList.getVideoId();
            if (videoId == null) {
                videoId = "";
            }
            String title = videoList.getTitle();
            if (title == null) {
                title = "";
            }
            arrayList.add(new PodcastVideoList(thumbnail, description, videoId, title));
        }
        return arrayList;
    }

    public static /* synthetic */ BaseItem TuitionPaymentFragmentspecialinlinedviewModeldefault2(BaseItem baseItem) {
        Intrinsics.checkNotNullParameter(baseItem, "");
        return baseItem;
    }
}
