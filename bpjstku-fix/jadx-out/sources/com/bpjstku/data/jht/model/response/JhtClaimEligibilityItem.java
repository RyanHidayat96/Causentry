package com.bpjstku.data.jht.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityItem;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/jht/model/response/JhtClaimEligibilityItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "statusCode", "Ljava/lang/String;", "getStatusCode", "message", "getMessage", "branchOfficeChannelName", "getBranchOfficeChannelName", "signature", "getSignature", "eligibleReactivationBpu", "getEligibleReactivationBpu"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class JhtClaimEligibilityItem {
    public static final int $stable = 0;

    @SerializedName("branchOfficeChannelName")
    private final String branchOfficeChannelName;

    @SerializedName("eligibleReactivationBpu")
    private final String eligibleReactivationBpu;

    @SerializedName("message")
    private final String message;

    @SerializedName("signature")
    private final String signature;

    @SerializedName("statusCode")
    private final String statusCode;

    public JhtClaimEligibilityItem(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.statusCode = str;
        this.message = str2;
        this.branchOfficeChannelName = str3;
        this.signature = str4;
        this.eligibleReactivationBpu = str5;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getBranchOfficeChannelName() {
        return this.branchOfficeChannelName;
    }

    public final String getSignature() {
        return this.signature;
    }

    public final String getEligibleReactivationBpu() {
        return this.eligibleReactivationBpu;
    }

    public static /* synthetic */ JhtClaimEligibilityItem copy$default(JhtClaimEligibilityItem jhtClaimEligibilityItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jhtClaimEligibilityItem.statusCode;
        }
        if ((i & 2) != 0) {
            str2 = jhtClaimEligibilityItem.message;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = jhtClaimEligibilityItem.branchOfficeChannelName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = jhtClaimEligibilityItem.signature;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = jhtClaimEligibilityItem.eligibleReactivationBpu;
        }
        return jhtClaimEligibilityItem.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBranchOfficeChannelName() {
        return this.branchOfficeChannelName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEligibleReactivationBpu() {
        return this.eligibleReactivationBpu;
    }

    public final JhtClaimEligibilityItem copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new JhtClaimEligibilityItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof JhtClaimEligibilityItem)) {
            return false;
        }
        JhtClaimEligibilityItem jhtClaimEligibilityItem = (JhtClaimEligibilityItem) p0;
        return Intrinsics.areEqual(this.statusCode, jhtClaimEligibilityItem.statusCode) && Intrinsics.areEqual(this.message, jhtClaimEligibilityItem.message) && Intrinsics.areEqual(this.branchOfficeChannelName, jhtClaimEligibilityItem.branchOfficeChannelName) && Intrinsics.areEqual(this.signature, jhtClaimEligibilityItem.signature) && Intrinsics.areEqual(this.eligibleReactivationBpu, jhtClaimEligibilityItem.eligibleReactivationBpu);
    }

    public final int hashCode() {
        return (((((((this.statusCode.hashCode() * 31) + this.message.hashCode()) * 31) + this.branchOfficeChannelName.hashCode()) * 31) + this.signature.hashCode()) * 31) + this.eligibleReactivationBpu.hashCode();
    }

    public final String toString() {
        String str = this.statusCode;
        String str2 = this.message;
        String str3 = this.branchOfficeChannelName;
        String str4 = this.signature;
        String str5 = this.eligibleReactivationBpu;
        StringBuilder sb = new StringBuilder("JhtClaimEligibilityItem(statusCode=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", branchOfficeChannelName=");
        sb.append(str3);
        sb.append(", signature=");
        sb.append(str4);
        sb.append(", eligibleReactivationBpu=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
