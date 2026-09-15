package androidx.privacysandbox.ads.adservices.adid;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerApi33Ext4Impl;", "Landroidx/privacysandbox/ads/adservices/adid/AdIdManagerImplCommon;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdIdManagerApi33Ext4Impl extends AdIdManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public AdIdManagerApi33Ext4Impl(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService((Class<Object>) android.adservices.adid.AdIdManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "");
        super((android.adservices.adid.AdIdManager) systemService);
    }
}
