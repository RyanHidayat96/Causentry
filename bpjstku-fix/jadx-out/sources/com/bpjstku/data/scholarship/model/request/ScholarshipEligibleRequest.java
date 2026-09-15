package com.bpjstku.data.scholarship.model.request;

import com.bpjstku.data.lib.model.BaseRequest;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\"\u0010\u0017\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/scholarship/model/request/ScholarshipEligibleRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "email", "Ljava/lang/String;", "getEmail", "channelModId", "getChannelModId", "setChannelModId", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScholarshipEligibleRequest extends BaseRequest {
    public static final int $stable = 8;

    @SerializedName("channelId")
    private String channelModId;

    @SerializedName("email")
    private final String email;

    public final String getEmail() {
        return this.email;
    }

    public final String getChannelModId() {
        return this.channelModId;
    }

    public final void setChannelModId(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelModId = str;
    }

    public /* synthetic */ ScholarshipEligibleRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "40" : str2);
    }

    public ScholarshipEligibleRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.email = str;
        this.channelModId = str2;
    }

    public static /* synthetic */ ScholarshipEligibleRequest copy$default(ScholarshipEligibleRequest scholarshipEligibleRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scholarshipEligibleRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = scholarshipEligibleRequest.channelModId;
        }
        return scholarshipEligibleRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelModId() {
        return this.channelModId;
    }

    public final ScholarshipEligibleRequest copy(String p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        return new ScholarshipEligibleRequest(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ScholarshipEligibleRequest)) {
            return false;
        }
        ScholarshipEligibleRequest scholarshipEligibleRequest = (ScholarshipEligibleRequest) p0;
        return Intrinsics.areEqual(this.email, scholarshipEligibleRequest.email) && Intrinsics.areEqual(this.channelModId, scholarshipEligibleRequest.channelModId);
    }

    public final int hashCode() {
        return (this.email.hashCode() * 31) + this.channelModId.hashCode();
    }

    public final String toString() {
        String str = this.email;
        String str2 = this.channelModId;
        StringBuilder sb = new StringBuilder("ScholarshipEligibleRequest(email=");
        sb.append(str);
        sb.append(", channelModId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
