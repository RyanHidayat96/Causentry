package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdData;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b$\u0018\u00002\u00020\u0001:\u0001<Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R\u001c\u0010/\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001e\u001a\u0004\b0\u0010 R\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u001cR\u001c\u00104\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u00108\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "p0", "", "p1", "Landroid/net/Uri;", "p2", "p3", "", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "p4", "Ljava/time/Instant;", "p5", "p6", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "p7", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "p8", "<init>", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;Ljava/time/Instant;Ljava/time/Instant;Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "activationTime", "Ljava/time/Instant;", "getActivationTime", "()Ljava/time/Instant;", "ads", "Ljava/util/List;", "getAds", "()Ljava/util/List;", "biddingLogicUri", "Landroid/net/Uri;", "getBiddingLogicUri", "()Landroid/net/Uri;", "buyer", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "getBuyer", "()Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "dailyUpdateUri", "getDailyUpdateUri", "expirationTime", "getExpirationTime", "name", "Ljava/lang/String;", "getName", "trustedBiddingSignals", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "getTrustedBiddingSignals", "()Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "userBiddingSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "getUserBiddingSignals", "()Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomAudience {
    private final Instant activationTime;
    private final List<AdData> ads;
    private final Uri biddingLogicUri;
    private final AdTechIdentifier buyer;
    private final Uri dailyUpdateUri;
    private final Instant expirationTime;
    private final String name;
    private final TrustedBiddingData trustedBiddingSignals;
    private final AdSelectionSignals userBiddingSignals;

    public CustomAudience(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List<AdData> list, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData) {
        Intrinsics.checkNotNullParameter(adTechIdentifier, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(uri2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.buyer = adTechIdentifier;
        this.name = str;
        this.dailyUpdateUri = uri;
        this.biddingLogicUri = uri2;
        this.ads = list;
        this.activationTime = instant;
        this.expirationTime = instant2;
        this.userBiddingSignals = adSelectionSignals;
        this.trustedBiddingSignals = trustedBiddingData;
    }

    public /* synthetic */ CustomAudience(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adTechIdentifier, str, uri, uri2, list, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : instant2, (i & 128) != 0 ? null : adSelectionSignals, (i & 256) != 0 ? null : trustedBiddingData);
    }

    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    public final Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    public final List<AdData> getAds() {
        return this.ads;
    }

    public final Instant getActivationTime() {
        return this.activationTime;
    }

    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    public final AdSelectionSignals getUserBiddingSignals() {
        return this.userBiddingSignals;
    }

    public final TrustedBiddingData getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) p0;
        return Intrinsics.areEqual(this.buyer, customAudience.buyer) && Intrinsics.areEqual(this.name, customAudience.name) && Intrinsics.areEqual(this.activationTime, customAudience.activationTime) && Intrinsics.areEqual(this.expirationTime, customAudience.expirationTime) && Intrinsics.areEqual(this.dailyUpdateUri, customAudience.dailyUpdateUri) && Intrinsics.areEqual(this.userBiddingSignals, customAudience.userBiddingSignals) && Intrinsics.areEqual(this.trustedBiddingSignals, customAudience.trustedBiddingSignals) && Intrinsics.areEqual(this.ads, customAudience.ads);
    }

    public final int hashCode() {
        int iHashCode = this.buyer.hashCode();
        int iHashCode2 = this.name.hashCode();
        Instant instant = this.activationTime;
        int iHashCode3 = instant != null ? instant.hashCode() : 0;
        Instant instant2 = this.expirationTime;
        int iHashCode4 = instant2 != null ? instant2.hashCode() : 0;
        int iHashCode5 = this.dailyUpdateUri.hashCode();
        AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        int iHashCode6 = adSelectionSignals != null ? adSelectionSignals.hashCode() : 0;
        TrustedBiddingData trustedBiddingData = this.trustedBiddingSignals;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (trustedBiddingData != null ? trustedBiddingData.hashCode() : 0)) * 31) + this.biddingLogicUri.hashCode()) * 31) + this.ads.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAudience: buyer=");
        sb.append(this.biddingLogicUri);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", activationTime=");
        sb.append(this.activationTime);
        sb.append(", expirationTime=");
        sb.append(this.expirationTime);
        sb.append(", dailyUpdateUri=");
        sb.append(this.dailyUpdateUri);
        sb.append(", userBiddingSignals=");
        sb.append(this.userBiddingSignals);
        sb.append(", trustedBiddingSignals=");
        sb.append(this.trustedBiddingSignals);
        sb.append(", biddingLogicUri=");
        sb.append(this.biddingLogicUri);
        sb.append(", ads=");
        sb.append(this.ads);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00103"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "p0", "", "p1", "Landroid/net/Uri;", "p2", "p3", "", "Landroidx/privacysandbox/ads/adservices/common/AdData;", "p4", "<init>", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;)V", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "build", "()Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "Ljava/time/Instant;", "setActivationTime", "(Ljava/time/Instant;)Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "setAds", "(Ljava/util/List;)Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "setBiddingLogicUri", "(Landroid/net/Uri;)Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "setBuyer", "(Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;)Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "setDailyUpdateUri", "setExpirationTime", "setName", "(Ljava/lang/String;)Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "setTrustedBiddingData", "(Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;)Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;", "setUserBiddingSignals", "(Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;)Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience$Builder;", "activationTime", "Ljava/time/Instant;", "ads", "Ljava/util/List;", "biddingLogicUri", "Landroid/net/Uri;", "buyer", "Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "dailyUpdateUri", "expirationTime", "name", "Ljava/lang/String;", "trustedBiddingData", "Landroidx/privacysandbox/ads/adservices/customaudience/TrustedBiddingData;", "userBiddingSignals", "Landroidx/privacysandbox/ads/adservices/common/AdSelectionSignals;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private Instant activationTime;
        private List<AdData> ads;
        private Uri biddingLogicUri;
        private AdTechIdentifier buyer;
        private Uri dailyUpdateUri;
        private Instant expirationTime;
        private String name;
        private TrustedBiddingData trustedBiddingData;
        private AdSelectionSignals userBiddingSignals;

        public Builder(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List<AdData> list) {
            Intrinsics.checkNotNullParameter(adTechIdentifier, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(uri2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.buyer = adTechIdentifier;
            this.name = str;
            this.dailyUpdateUri = uri;
            this.biddingLogicUri = uri2;
            this.ads = list;
        }

        public final Builder setBuyer(AdTechIdentifier p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.buyer = p0;
            return this;
        }

        public final Builder setName(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.name = p0;
            return this;
        }

        public final Builder setActivationTime(Instant p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.activationTime = p0;
            return this;
        }

        public final Builder setExpirationTime(Instant p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.expirationTime = p0;
            return this;
        }

        public final Builder setDailyUpdateUri(Uri p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.dailyUpdateUri = p0;
            return this;
        }

        public final Builder setUserBiddingSignals(AdSelectionSignals p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.userBiddingSignals = p0;
            return this;
        }

        public final Builder setTrustedBiddingData(TrustedBiddingData p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.trustedBiddingData = p0;
            return this;
        }

        public final Builder setBiddingLogicUri(Uri p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.biddingLogicUri = p0;
            return this;
        }

        public final Builder setAds(List<AdData> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.ads = p0;
            return this;
        }

        public final CustomAudience build() {
            return new CustomAudience(this.buyer, this.name, this.dailyUpdateUri, this.biddingLogicUri, this.ads, this.activationTime, this.expirationTime, this.userBiddingSignals, this.trustedBiddingData);
        }
    }
}
