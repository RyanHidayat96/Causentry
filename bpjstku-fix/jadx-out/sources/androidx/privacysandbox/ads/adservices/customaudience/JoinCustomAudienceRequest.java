package androidx.privacysandbox.ads.adservices.customaudience;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/privacysandbox/ads/adservices/customaudience/JoinCustomAudienceRequest;", "", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "p0", "<init>", "(Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "customAudience", "Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;", "getCustomAudience", "()Landroidx/privacysandbox/ads/adservices/customaudience/CustomAudience;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JoinCustomAudienceRequest {
    private final CustomAudience customAudience;

    public JoinCustomAudienceRequest(CustomAudience customAudience) {
        Intrinsics.checkNotNullParameter(customAudience, "");
        this.customAudience = customAudience;
    }

    public final CustomAudience getCustomAudience() {
        return this.customAudience;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof JoinCustomAudienceRequest) {
            return Intrinsics.areEqual(this.customAudience, ((JoinCustomAudienceRequest) p0).customAudience);
        }
        return false;
    }

    public final int hashCode() {
        return this.customAudience.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JoinCustomAudience: customAudience=");
        sb.append(this.customAudience);
        return sb.toString();
    }
}
