package androidx.privacysandbox.ads.adservices.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010"}, d2 = {"Landroidx/privacysandbox/ads/adservices/common/AdTechIdentifier;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "Landroid/adservices/common/AdTechIdentifier;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/common/AdTechIdentifier;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "identifier", "Ljava/lang/String;", "getIdentifier"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdTechIdentifier {
    private final String identifier;

    public AdTechIdentifier(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.identifier = str;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof AdTechIdentifier) {
            return Intrinsics.areEqual(this.identifier, ((AdTechIdentifier) p0).identifier);
        }
        return false;
    }

    public final int hashCode() {
        return this.identifier.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.identifier);
    }

    public final android.adservices.common.AdTechIdentifier convertToAdServices$ads_adservices_release() {
        android.adservices.common.AdTechIdentifier adTechIdentifierFromString = android.adservices.common.AdTechIdentifier.fromString(this.identifier);
        Intrinsics.checkNotNullExpressionValue(adTechIdentifierFromString, "");
        return adTechIdentifierFromString;
    }
}
