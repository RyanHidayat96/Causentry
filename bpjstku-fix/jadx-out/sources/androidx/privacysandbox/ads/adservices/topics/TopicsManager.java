package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import androidx.privacysandbox.ads.adservices.internal.BackCompatManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "p0", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "getTopics", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TopicsManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract Object getTopics(GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation);

    @JvmStatic
    public static final TopicsManager obtain(Context context) {
        return INSTANCE.obtain(context);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManager$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "obtain", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final TopicsManager obtain(final Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (AdServicesInfo.INSTANCE.adServicesVersion() >= 11) {
                return new TopicsManagerApi33Ext11Impl(p0);
            }
            if (AdServicesInfo.INSTANCE.adServicesVersion() >= 5) {
                return new TopicsManagerApi33Ext5Impl(p0);
            }
            if (AdServicesInfo.INSTANCE.adServicesVersion() == 4) {
                return new TopicsManagerApi33Ext4Impl(p0);
            }
            if (AdServicesInfo.INSTANCE.extServicesVersionS() >= 11) {
                return (TopicsManager) BackCompatManager.INSTANCE.getManager(p0, "TopicsManager", new Function1<Context, TopicsManagerApi31Ext11Impl>() { // from class: androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion$obtain$1
                    @Override // kotlin.jvm.functions.Function1
                    public final TopicsManagerApi31Ext11Impl invoke(Context context) {
                        Intrinsics.checkNotNullParameter(context, "");
                        return new TopicsManagerApi31Ext11Impl(p0);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            }
            if (AdServicesInfo.INSTANCE.extServicesVersionS() >= 9) {
                return (TopicsManager) BackCompatManager.INSTANCE.getManager(p0, "TopicsManager", new Function1<Context, TopicsManagerApi31Ext9Impl>() { // from class: androidx.privacysandbox.ads.adservices.topics.TopicsManager$Companion$obtain$2
                    @Override // kotlin.jvm.functions.Function1
                    public final TopicsManagerApi31Ext9Impl invoke(Context context) {
                        Intrinsics.checkNotNullParameter(context, "");
                        return new TopicsManagerApi31Ext9Impl(p0);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            }
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
