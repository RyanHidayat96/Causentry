package androidx.privacysandbox.ads.adservices.adid;

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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/adid/AdId;", "getAdId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AdIdManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public abstract Object getAdId(Continuation<? super AdId> continuation);

    @JvmStatic
    public static final AdIdManager obtain(Context context) {
        return INSTANCE.obtain(context);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManager$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;", "obtain", "(Landroid/content/Context;)Landroidx/privacysandbox/ads/adservices/adid/AdIdManager;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final AdIdManager obtain(final Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (AdServicesInfo.INSTANCE.adServicesVersion() >= 4) {
                return new AdIdManagerApi33Ext4Impl(p0);
            }
            if (AdServicesInfo.INSTANCE.extServicesVersionS() >= 9) {
                return (AdIdManager) BackCompatManager.INSTANCE.getManager(p0, "AdIdManager", new Function1<Context, AdIdManagerApi31Ext9Impl>() { // from class: androidx.privacysandbox.ads.adservices.adid.AdIdManager$Companion$obtain$1
                    @Override // kotlin.jvm.functions.Function1
                    public final AdIdManagerApi31Ext9Impl invoke(Context context) {
                        Intrinsics.checkNotNullParameter(context, "");
                        return new AdIdManagerApi31Ext9Impl(p0);
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
