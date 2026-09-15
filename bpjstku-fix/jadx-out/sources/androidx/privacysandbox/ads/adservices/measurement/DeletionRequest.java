package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002+*BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u0015R \u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001a\u0010(\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "", "", "p0", "p1", "Ljava/time/Instant;", "p2", "p3", "", "Landroid/net/Uri;", "p4", "p5", "<init>", "(IILjava/time/Instant;Ljava/time/Instant;Ljava/util/List;Ljava/util/List;)V", "Landroid/adservices/measurement/DeletionRequest;", "convertToAdServices$ads_adservices_release", "()Landroid/adservices/measurement/DeletionRequest;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "deletionMode", "I", "getDeletionMode", "domainUris", "Ljava/util/List;", "getDomainUris", "()Ljava/util/List;", "end", "Ljava/time/Instant;", "getEnd", "()Ljava/time/Instant;", "matchBehavior", "getMatchBehavior", "originUris", "getOriginUris", "start", "getStart", "Companion", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeletionRequest {
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    private final int deletionMode;
    private final List<Uri> domainUris;
    private final Instant end;
    private final int matchBehavior;
    private final List<Uri> originUris;
    private final Instant start;

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i, int i2, Instant instant, Instant instant2, List<? extends Uri> list, List<? extends Uri> list2) {
        Intrinsics.checkNotNullParameter(instant, "");
        Intrinsics.checkNotNullParameter(instant2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.deletionMode = i;
        this.matchBehavior = i2;
        this.start = instant;
        this.end = instant2;
        this.domainUris = list;
        this.originUris = list2;
    }

    public final int getDeletionMode() {
        return this.deletionMode;
    }

    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeletionRequest(int i, int i2, Instant instant, Instant instant2, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Instant instant3;
        Instant instant4;
        if ((i3 & 4) != 0) {
            Instant instant5 = Instant.MIN;
            Intrinsics.checkNotNullExpressionValue(instant5, "");
            instant3 = instant5;
        } else {
            instant3 = instant;
        }
        if ((i3 & 8) != 0) {
            Instant instant6 = Instant.MAX;
            Intrinsics.checkNotNullExpressionValue(instant6, "");
            instant4 = instant6;
        } else {
            instant4 = instant2;
        }
        this(i, i2, instant3, instant4, (i3 & 16) != 0 ? CollectionsKt.emptyList() : list, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final Instant getStart() {
        return this.start;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final List<Uri> getDomainUris() {
        return this.domainUris;
    }

    public final List<Uri> getOriginUris() {
        return this.originUris;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.deletionMode);
        int iHashCode2 = this.domainUris.hashCode();
        int iHashCode3 = this.originUris.hashCode();
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + Integer.hashCode(this.matchBehavior);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) p0;
        return this.deletionMode == deletionRequest.deletionMode && Intrinsics.areEqual(new HashSet(this.domainUris), new HashSet(deletionRequest.domainUris)) && Intrinsics.areEqual(new HashSet(this.originUris), new HashSet(deletionRequest.originUris)) && Intrinsics.areEqual(this.start, deletionRequest.start) && Intrinsics.areEqual(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior;
    }

    public final String toString() {
        String str = this.deletionMode == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA";
        String str2 = this.matchBehavior == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE";
        StringBuilder sb = new StringBuilder("DeletionRequest { DeletionMode=");
        sb.append(str);
        sb.append(", MatchBehavior=");
        sb.append(str2);
        sb.append(", Start=");
        sb.append(this.start);
        sb.append(", End=");
        sb.append(this.end);
        sb.append(", DomainUris=");
        sb.append(this.domainUris);
        sb.append(", OriginUris=");
        sb.append(this.originUris);
        sb.append(" }");
        return sb.toString();
    }

    public final android.adservices.measurement.DeletionRequest convertToAdServices$ads_adservices_release() {
        android.adservices.measurement.DeletionRequest deletionRequestBuild = new android.adservices.measurement.DeletionRequest.Builder().setDeletionMode(this.deletionMode).setMatchBehavior(this.matchBehavior).setStart(this.start).setEnd(this.end).setDomainUris(this.domainUris).setOriginUris(this.originUris).build();
        Intrinsics.checkNotNullExpressionValue(deletionRequestBuild, "");
        return deletionRequestBuild;
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018"}, d2 = {"Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Builder;", "", "", "p0", "p1", "<init>", "(II)V", "Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "build", "()Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest;", "", "Landroid/net/Uri;", "setDomainUris", "(Ljava/util/List;)Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Builder;", "Ljava/time/Instant;", "setEnd", "(Ljava/time/Instant;)Landroidx/privacysandbox/ads/adservices/measurement/DeletionRequest$Builder;", "setOriginUris", "setStart", "deletionMode", "I", "domainUris", "Ljava/util/List;", "end", "Ljava/time/Instant;", "matchBehavior", "originUris", "start"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final int deletionMode;
        private List<? extends Uri> domainUris;
        private Instant end;
        private final int matchBehavior;
        private List<? extends Uri> originUris;
        private Instant start;

        public Builder(int i, int i2) {
            this.deletionMode = i;
            this.matchBehavior = i2;
            Instant instant = Instant.MIN;
            Intrinsics.checkNotNullExpressionValue(instant, "");
            this.start = instant;
            Instant instant2 = Instant.MAX;
            Intrinsics.checkNotNullExpressionValue(instant2, "");
            this.end = instant2;
            this.domainUris = CollectionsKt.emptyList();
            this.originUris = CollectionsKt.emptyList();
        }

        public final Builder setStart(Instant p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.start = p0;
            return this;
        }

        public final Builder setEnd(Instant p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.end = p0;
            return this;
        }

        public final Builder setDomainUris(List<? extends Uri> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.domainUris = p0;
            return this;
        }

        public final Builder setOriginUris(List<? extends Uri> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.originUris = p0;
            return this;
        }

        public final DeletionRequest build() {
            return new DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }
    }
}
