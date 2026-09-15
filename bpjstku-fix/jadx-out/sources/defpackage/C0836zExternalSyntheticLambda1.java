package defpackage;

import com.bpjstku.data.banner.BannerRepository;
import com.bpjstku.data.banner.model.request.BannerRequest;
import com.bpjstku.data.banner.model.response.BannerItem;
import com.bpjstku.domain.banner.model.Banner;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zExternalSyntheticLambda1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0836zExternalSyntheticLambda1 implements ActivityViewModelLazyKtviewModels3 {
    private final BannerRepository TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public C0836zExternalSyntheticLambda1(BannerRepository bannerRepository) {
        Intrinsics.checkNotNullParameter(bannerRepository, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = bannerRepository;
    }

    @Override // defpackage.ActivityViewModelLazyKtviewModels3
    public final deriveCodec<List<Banner>> b(BannerRequest bannerRequest) {
        Intrinsics.checkNotNullParameter(bannerRequest, "");
        deriveCodec<List<BannerItem>> banners = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getBanners(bannerRequest);
        final Function1 function1 = new Function1() { // from class: zExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C0836zExternalSyntheticLambda1.b((List) obj);
            }
        };
        readableMs readablems = new readableMs() { // from class: viewModels
            @Override // defpackage.readableMs
            public final Object apply(Object obj) {
                return C0836zExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1(function1, obj);
            }
        };
        share.b(readablems, "mapper is null");
        Api23Impl api23Impl = new Api23Impl(banners, readablems);
        Intrinsics.checkNotNullExpressionValue(api23Impl, "");
        return api23Impl;
    }

    public static /* synthetic */ List b(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<BannerItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BannerItem bannerItem : list2) {
            Intrinsics.checkNotNullParameter(bannerItem, "");
            String imageLink = bannerItem.getImageLink();
            if (imageLink == null) {
                imageLink = "";
            }
            String imageName = bannerItem.getImageName();
            if (imageName == null) {
                imageName = "";
            }
            String imagePath = bannerItem.getImagePath();
            if (imagePath == null) {
                imagePath = "";
            }
            arrayList.add(new Banner(imageLink, imageName, imagePath));
        }
        return arrayList;
    }

    public static /* synthetic */ List TuitionPaymentFragmentbindingInflater1(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }
}
