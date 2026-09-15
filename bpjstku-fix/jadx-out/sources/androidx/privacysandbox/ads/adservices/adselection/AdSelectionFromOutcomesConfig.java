package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ExperimentalFeatures.Ext10OptIn
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/AdSelectionFromOutcomesConfig;", "", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "p0", "", "", "p1", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "p2", "Landroid/net/Uri;", "p3", "<init>", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Ljava/util/List;Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;Landroid/net/Uri;)V", "Landroid/adservices/adselection/AdSelectionFromOutcomesConfig;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/adselection/AdSelectionFromOutcomesConfig;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "adSelectionIds", "Ljava/util/List;", "getAdSelectionIds", "()Ljava/util/List;", "adSelectionSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "getAdSelectionSignals", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "selectionLogicUri", "Landroid/net/Uri;", "getSelectionLogicUri", "()Landroid/net/Uri;", "setSelectionLogicUri", "(Landroid/net/Uri;)V", "seller", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getSeller", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdSelectionFromOutcomesConfig {
    private final List<Long> adSelectionIds;
    private final AdSelectionSignals adSelectionSignals;
    private Uri selectionLogicUri;
    private final AdTechIdentifier seller;

    public AdSelectionFromOutcomesConfig(AdTechIdentifier adTechIdentifier, List<Long> list, AdSelectionSignals adSelectionSignals, Uri uri) {
        Intrinsics.checkNotNullParameter(adTechIdentifier, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(adSelectionSignals, "");
        Intrinsics.checkNotNullParameter(uri, "");
        this.seller = adTechIdentifier;
        this.adSelectionIds = list;
        this.adSelectionSignals = adSelectionSignals;
        this.selectionLogicUri = uri;
    }

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public final List<Long> getAdSelectionIds() {
        return this.adSelectionIds;
    }

    public final AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    public final Uri getSelectionLogicUri() {
        return this.selectionLogicUri;
    }

    public final void setSelectionLogicUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        this.selectionLogicUri = uri;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AdSelectionFromOutcomesConfig)) {
            return false;
        }
        AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig = (AdSelectionFromOutcomesConfig) p0;
        return Intrinsics.areEqual(this.seller, adSelectionFromOutcomesConfig.seller) && Intrinsics.areEqual(this.adSelectionIds, adSelectionFromOutcomesConfig.adSelectionIds) && Intrinsics.areEqual(this.adSelectionSignals, adSelectionFromOutcomesConfig.adSelectionSignals) && Intrinsics.areEqual(this.selectionLogicUri, adSelectionFromOutcomesConfig.selectionLogicUri);
    }

    public final int hashCode() {
        int iHashCode = this.seller.hashCode();
        return (((((iHashCode * 31) + this.adSelectionIds.hashCode()) * 31) + this.adSelectionSignals.hashCode()) * 31) + this.selectionLogicUri.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdSelectionFromOutcomesConfig: seller=");
        sb.append(this.seller);
        sb.append(", adSelectionIds='");
        sb.append(this.adSelectionIds);
        sb.append("', adSelectionSignals=");
        sb.append(this.adSelectionSignals);
        sb.append(", selectionLogicUri=");
        sb.append(this.selectionLogicUri);
        return sb.toString();
    }

    public final android.adservices.adselection.AdSelectionFromOutcomesConfig convertToAdServices$ads_adservices_release() {
        android.adservices.adselection.AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfigBuild = new android.adservices.adselection.AdSelectionFromOutcomesConfig.Builder().setSelectionSignals(this.adSelectionSignals.convertToAdServices$ads_adservices_release()).setAdSelectionIds(this.adSelectionIds).setSelectionLogicUri(this.selectionLogicUri).setSeller(this.seller.convertToAdServices$ads_adservices_release()).build();
        Intrinsics.checkNotNullExpressionValue(adSelectionFromOutcomesConfigBuild, "");
        return adSelectionFromOutcomesConfigBuild;
    }
}
