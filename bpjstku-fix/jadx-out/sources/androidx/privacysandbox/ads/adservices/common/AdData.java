package androidx.privacysandbox.ads.adservices.common;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001:\u0003+,-B5\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rBA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0019R\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0019R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData;", "", "Landroid/net/Uri;", "p0", "", "p1", "", "", "p2", "Landroidx/privacysandbox/ads/adservices/common/AdFilters;", "p3", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/util/Set;Landroidx/privacysandbox/ads/adservices/common/AdFilters;)V", "(Landroid/net/Uri;Ljava/lang/String;)V", "p4", "(Landroid/net/Uri;Ljava/lang/String;Ljava/util/Set;Landroidx/privacysandbox/ads/adservices/common/AdFilters;Ljava/lang/String;)V", "Landroid/adservices/common/AdData;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/common/AdData;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "adCounterKeys", "Ljava/util/Set;", "getAdCounterKeys", "()Ljava/util/Set;", "adFilters", "Landroidx/privacysandbox/ads/adservices/common/AdFilters;", "getAdFilters", "()Landroidx/privacysandbox/ads/adservices/common/AdFilters;", "adRenderId", "Ljava/lang/String;", "getAdRenderId", "metadata", "getMetadata", "renderUri", "Landroid/net/Uri;", "getRenderUri", "()Landroid/net/Uri;", "Ext10Impl", "Ext4Impl", "Ext8Impl"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdData {
    private final Set<Integer> adCounterKeys;
    private final AdFilters adFilters;
    private final String adRenderId;
    private final String metadata;
    private final Uri renderUri;

    @ExperimentalFeatures.Ext10OptIn
    public AdData(Uri uri, String str, Set<Integer> set, AdFilters adFilters, String str2) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.renderUri = uri;
        this.metadata = str;
        this.adCounterKeys = set;
        this.adFilters = adFilters;
        this.adRenderId = str2;
    }

    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public /* synthetic */ AdData(Uri uri, String str, Set set, AdFilters adFilters, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, str, (i & 4) != 0 ? SetsKt.emptySet() : set, (i & 8) != 0 ? null : adFilters, (i & 16) != 0 ? null : str2);
    }

    public final Set<Integer> getAdCounterKeys() {
        return this.adCounterKeys;
    }

    public final AdFilters getAdFilters() {
        return this.adFilters;
    }

    public final String getAdRenderId() {
        return this.adRenderId;
    }

    public /* synthetic */ AdData(Uri uri, String str, Set set, AdFilters adFilters, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, str, (i & 4) != 0 ? SetsKt.emptySet() : set, (i & 8) != 0 ? null : adFilters);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @ExperimentalFeatures.Ext8OptIn
    public AdData(Uri uri, String str, Set<Integer> set, AdFilters adFilters) {
        this(uri, str, set, adFilters, null);
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdData(Uri uri, String str) {
        this(uri, str, SetsKt.emptySet(), null);
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) p0;
        return Intrinsics.areEqual(this.renderUri, adData.renderUri) && Intrinsics.areEqual(this.metadata, adData.metadata) && Intrinsics.areEqual(this.adCounterKeys, adData.adCounterKeys) && Intrinsics.areEqual(this.adFilters, adData.adFilters) && Intrinsics.areEqual(this.adRenderId, adData.adRenderId);
    }

    public final int hashCode() {
        int iHashCode = this.renderUri.hashCode();
        int iHashCode2 = this.metadata.hashCode();
        int iHashCode3 = this.adCounterKeys.hashCode();
        AdFilters adFilters = this.adFilters;
        int iHashCode4 = adFilters != null ? adFilters.hashCode() : 0;
        String str = this.adRenderId;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdData: renderUri=");
        sb.append(this.renderUri);
        sb.append(", metadata='");
        sb.append(this.metadata);
        sb.append("', adCounterKeys=");
        sb.append(this.adCounterKeys);
        sb.append(", adFilters=");
        sb.append(this.adFilters);
        sb.append(", adRenderId=");
        sb.append(this.adRenderId);
        return sb.toString();
    }

    public final android.adservices.common.AdData convertToAdServices$ads_adservices_release() {
        if (AdServicesInfo.INSTANCE.adServicesVersion() >= 10 || AdServicesInfo.INSTANCE.extServicesVersionS() >= 10) {
            return Ext10Impl.INSTANCE.convertAdData(this);
        }
        if (AdServicesInfo.INSTANCE.adServicesVersion() >= 8 || AdServicesInfo.INSTANCE.extServicesVersionS() >= 9) {
            return Ext8Impl.INSTANCE.convertAdData(this);
        }
        return Ext4Impl.INSTANCE.convertAdData(this);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext10Impl;", "", "<init>", "()V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Ext10Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        private Ext10Impl() {
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext10Impl$Companion;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "p0", "Landroid/adservices/common/AdData;", "convertAdData", "(Landroidx/privacysandbox/ads/adservices/common/AdData;)Landroid/adservices/common/AdData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final android.adservices.common.AdData convertAdData(AdData p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                android.adservices.common.AdData.Builder adCounterKeys = new android.adservices.common.AdData.Builder().setMetadata(p0.getMetadata()).setRenderUri(p0.getRenderUri()).setAdCounterKeys(p0.getAdCounterKeys());
                AdFilters adFilters = p0.getAdFilters();
                android.adservices.common.AdData adDataBuild = adCounterKeys.setAdFilters(adFilters != null ? adFilters.convertToAdServices$ads_adservices_release() : null).setAdRenderId(p0.getAdRenderId()).build();
                Intrinsics.checkNotNullExpressionValue(adDataBuild, "");
                return adDataBuild;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext8Impl;", "", "<init>", "()V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Ext8Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        private Ext8Impl() {
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext8Impl$Companion;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "p0", "Landroid/adservices/common/AdData;", "convertAdData", "(Landroidx/privacysandbox/ads/adservices/common/AdData;)Landroid/adservices/common/AdData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final android.adservices.common.AdData convertAdData(AdData p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getAdRenderId();
                android.adservices.common.AdData.Builder adCounterKeys = new android.adservices.common.AdData.Builder().setMetadata(p0.getMetadata()).setRenderUri(p0.getRenderUri()).setAdCounterKeys(p0.getAdCounterKeys());
                AdFilters adFilters = p0.getAdFilters();
                android.adservices.common.AdData adDataBuild = adCounterKeys.setAdFilters(adFilters != null ? adFilters.convertToAdServices$ads_adservices_release() : null).build();
                Intrinsics.checkNotNullExpressionValue(adDataBuild, "");
                return adDataBuild;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext4Impl;", "", "<init>", "()V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Ext4Impl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        private Ext4Impl() {
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdData$Ext4Impl$Companion;", "", "<init>", "()V", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "p0", "Landroid/adservices/common/AdData;", "convertAdData", "(Landroidx/privacysandbox/ads/adservices/common/AdData;)Landroid/adservices/common/AdData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final android.adservices.common.AdData convertAdData(AdData p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                p0.getAdCounterKeys().isEmpty();
                p0.getAdFilters();
                p0.getAdRenderId();
                android.adservices.common.AdData adDataBuild = new android.adservices.common.AdData.Builder().setMetadata(p0.getMetadata()).setRenderUri(p0.getRenderUri()).build();
                Intrinsics.checkNotNullExpressionValue(adDataBuild, "");
                return adDataBuild;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
