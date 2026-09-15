package com.bpjstku.data.payment.model.response;

import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J>\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u000fR\u001c\u0010 \u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010#\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/bpjstku/data/payment/model/response/GetStatusRecurringPlanResponse;", "", "", "p0", "", "p1", "", "p2", "Lcom/bpjstku/data/payment/model/response/RecurringProfile;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/bpjstku/data/payment/model/response/RecurringProfile;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/bpjstku/data/payment/model/response/RecurringProfile;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/bpjstku/data/payment/model/response/RecurringProfile;)Lcom/bpjstku/data/payment/model/response/GetStatusRecurringPlanResponse;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "message", "Ljava/lang/String;", "getMessage", "isSuccessful", "Ljava/lang/Boolean;", "statusCode", "Ljava/lang/Integer;", "getStatusCode", "recurringProfile", "Lcom/bpjstku/data/payment/model/response/RecurringProfile;", "getRecurringProfile"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GetStatusRecurringPlanResponse {
    public static final int $stable = 8;

    @SerializedName("isSuccessful")
    private final Boolean isSuccessful;

    @SerializedName("message")
    private final String message;

    @SerializedName(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)
    private final RecurringProfile recurringProfile;

    @SerializedName("statusCode")
    private final Integer statusCode;

    public GetStatusRecurringPlanResponse(String str, Boolean bool, Integer num, RecurringProfile recurringProfile) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        this.isSuccessful = bool;
        this.statusCode = num;
        this.recurringProfile = recurringProfile;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final RecurringProfile getRecurringProfile() {
        return this.recurringProfile;
    }

    public static /* synthetic */ GetStatusRecurringPlanResponse copy$default(GetStatusRecurringPlanResponse getStatusRecurringPlanResponse, String str, Boolean bool, Integer num, RecurringProfile recurringProfile, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getStatusRecurringPlanResponse.message;
        }
        if ((i & 2) != 0) {
            bool = getStatusRecurringPlanResponse.isSuccessful;
        }
        if ((i & 4) != 0) {
            num = getStatusRecurringPlanResponse.statusCode;
        }
        if ((i & 8) != 0) {
            recurringProfile = getStatusRecurringPlanResponse.recurringProfile;
        }
        return getStatusRecurringPlanResponse.copy(str, bool, num, recurringProfile);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final RecurringProfile getRecurringProfile() {
        return this.recurringProfile;
    }

    public final GetStatusRecurringPlanResponse copy(String p0, Boolean p1, Integer p2, RecurringProfile p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new GetStatusRecurringPlanResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GetStatusRecurringPlanResponse)) {
            return false;
        }
        GetStatusRecurringPlanResponse getStatusRecurringPlanResponse = (GetStatusRecurringPlanResponse) p0;
        return Intrinsics.areEqual(this.message, getStatusRecurringPlanResponse.message) && Intrinsics.areEqual(this.isSuccessful, getStatusRecurringPlanResponse.isSuccessful) && Intrinsics.areEqual(this.statusCode, getStatusRecurringPlanResponse.statusCode) && Intrinsics.areEqual(this.recurringProfile, getStatusRecurringPlanResponse.recurringProfile);
    }

    public final int hashCode() {
        int iHashCode = this.message.hashCode();
        Boolean bool = this.isSuccessful;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Integer num = this.statusCode;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        RecurringProfile recurringProfile = this.recurringProfile;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (recurringProfile != null ? recurringProfile.hashCode() : 0);
    }

    public final String toString() {
        String str = this.message;
        Boolean bool = this.isSuccessful;
        Integer num = this.statusCode;
        RecurringProfile recurringProfile = this.recurringProfile;
        StringBuilder sb = new StringBuilder("GetStatusRecurringPlanResponse(message=");
        sb.append(str);
        sb.append(", isSuccessful=");
        sb.append(bool);
        sb.append(", statusCode=");
        sb.append(num);
        sb.append(", recurringProfile=");
        sb.append(recurringProfile);
        sb.append(")");
        return sb.toString();
    }
}
