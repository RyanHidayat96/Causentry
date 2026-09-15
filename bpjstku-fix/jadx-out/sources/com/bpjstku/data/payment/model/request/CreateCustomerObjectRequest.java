package com.bpjstku.data.payment.model.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJF\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/request/CreateCustomerObjectRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "idCustomerObjectResponse", "Ljava/lang/String;", "getIdCustomerObjectResponse", "email", "getEmail", "mobileNumber", "getMobileNumber", "givenNames", "getGivenNames", "surNames", "getSurNames"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateCustomerObjectRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("given_names")
    private final String givenNames;

    @SerializedName("reference_id")
    private final String idCustomerObjectResponse;

    @SerializedName("mobile_number")
    private final String mobileNumber;

    @SerializedName("surname")
    private final String surNames;

    public CreateCustomerObjectRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.idCustomerObjectResponse = str;
        this.email = str2;
        this.mobileNumber = str3;
        this.givenNames = str4;
        this.surNames = str5;
    }

    public final String getIdCustomerObjectResponse() {
        return this.idCustomerObjectResponse;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getGivenNames() {
        return this.givenNames;
    }

    public final String getSurNames() {
        return this.surNames;
    }

    public static /* synthetic */ CreateCustomerObjectRequest copy$default(CreateCustomerObjectRequest createCustomerObjectRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCustomerObjectRequest.idCustomerObjectResponse;
        }
        if ((i & 2) != 0) {
            str2 = createCustomerObjectRequest.email;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = createCustomerObjectRequest.mobileNumber;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = createCustomerObjectRequest.givenNames;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = createCustomerObjectRequest.surNames;
        }
        return createCustomerObjectRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdCustomerObjectResponse() {
        return this.idCustomerObjectResponse;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGivenNames() {
        return this.givenNames;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSurNames() {
        return this.surNames;
    }

    public final CreateCustomerObjectRequest copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        return new CreateCustomerObjectRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CreateCustomerObjectRequest)) {
            return false;
        }
        CreateCustomerObjectRequest createCustomerObjectRequest = (CreateCustomerObjectRequest) p0;
        return Intrinsics.areEqual(this.idCustomerObjectResponse, createCustomerObjectRequest.idCustomerObjectResponse) && Intrinsics.areEqual(this.email, createCustomerObjectRequest.email) && Intrinsics.areEqual(this.mobileNumber, createCustomerObjectRequest.mobileNumber) && Intrinsics.areEqual(this.givenNames, createCustomerObjectRequest.givenNames) && Intrinsics.areEqual(this.surNames, createCustomerObjectRequest.surNames);
    }

    public final int hashCode() {
        int iHashCode = this.idCustomerObjectResponse.hashCode();
        int iHashCode2 = this.email.hashCode();
        int iHashCode3 = this.mobileNumber.hashCode();
        String str = this.givenNames;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.surNames;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.idCustomerObjectResponse;
        String str2 = this.email;
        String str3 = this.mobileNumber;
        String str4 = this.givenNames;
        String str5 = this.surNames;
        StringBuilder sb = new StringBuilder("CreateCustomerObjectRequest(idCustomerObjectResponse=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", mobileNumber=");
        sb.append(str3);
        sb.append(", givenNames=");
        sb.append(str4);
        sb.append(", surNames=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
