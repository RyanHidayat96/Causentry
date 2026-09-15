package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequestHelper;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "p0", "Landroid/adservices/topics/GetTopicsRequest;", "convertRequestWithRecordObservation$ads_adservices_release", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;)Landroid/adservices/topics/GetTopicsRequest;", "convertRequestWithoutRecordObservation$ads_adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTopicsRequestHelper {
    public static final GetTopicsRequestHelper INSTANCE = new GetTopicsRequestHelper();

    private GetTopicsRequestHelper() {
    }

    public final android.adservices.topics.GetTopicsRequest convertRequestWithRecordObservation$ads_adservices_release(GetTopicsRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = new android.adservices.topics.GetTopicsRequest.Builder().setAdsSdkName(p0.getAdsSdkName()).setShouldRecordObservation(p0.getShouldRecordObservation()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "");
        return getTopicsRequestBuild;
    }

    public final android.adservices.topics.GetTopicsRequest convertRequestWithoutRecordObservation$ads_adservices_release(GetTopicsRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = new android.adservices.topics.GetTopicsRequest.Builder().setAdsSdkName(p0.getAdsSdkName()).build();
        Intrinsics.checkNotNullExpressionValue(getTopicsRequestBuild, "");
        return getTopicsRequestBuild;
    }
}
