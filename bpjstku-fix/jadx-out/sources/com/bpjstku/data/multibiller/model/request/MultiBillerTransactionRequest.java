package com.bpjstku.data.multibiller.model.request;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/bpjstku/data/multibiller/model/request/MultiBillerTransactionRequest;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/multibiller/model/request/MultiBillerTransactionRequest;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "externalCustomerId", "Ljava/lang/String;", "getExternalCustomerId", "name", "getName", "email", "getEmail", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "nik", "getNik"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiBillerTransactionRequest {
    public static final int $stable = 0;

    @SerializedName("email")
    private final String email;

    @SerializedName("external_customer_id")
    private final String externalCustomerId;

    @SerializedName("name")
    private final String name;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("phone_number")
    private final String phoneNumber;

    public MultiBillerTransactionRequest(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.externalCustomerId = str;
        this.name = str2;
        this.email = str3;
        this.phoneNumber = str4;
        this.nik = str5;
    }

    public final String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getNik() {
        return this.nik;
    }

    public static /* synthetic */ MultiBillerTransactionRequest copy$default(MultiBillerTransactionRequest multiBillerTransactionRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiBillerTransactionRequest.externalCustomerId;
        }
        if ((i & 2) != 0) {
            str2 = multiBillerTransactionRequest.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = multiBillerTransactionRequest.email;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = multiBillerTransactionRequest.phoneNumber;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = multiBillerTransactionRequest.nik;
        }
        return multiBillerTransactionRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExternalCustomerId() {
        return this.externalCustomerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNik() {
        return this.nik;
    }

    public final MultiBillerTransactionRequest copy(String p0, String p1, String p2, String p3, String p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        return new MultiBillerTransactionRequest(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MultiBillerTransactionRequest)) {
            return false;
        }
        MultiBillerTransactionRequest multiBillerTransactionRequest = (MultiBillerTransactionRequest) p0;
        return Intrinsics.areEqual(this.externalCustomerId, multiBillerTransactionRequest.externalCustomerId) && Intrinsics.areEqual(this.name, multiBillerTransactionRequest.name) && Intrinsics.areEqual(this.email, multiBillerTransactionRequest.email) && Intrinsics.areEqual(this.phoneNumber, multiBillerTransactionRequest.phoneNumber) && Intrinsics.areEqual(this.nik, multiBillerTransactionRequest.nik);
    }

    public final int hashCode() {
        return (((((((this.externalCustomerId.hashCode() * 31) + this.name.hashCode()) * 31) + this.email.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.nik.hashCode();
    }

    public final String toString() {
        String str = this.externalCustomerId;
        String str2 = this.name;
        String str3 = this.email;
        String str4 = this.phoneNumber;
        String str5 = this.nik;
        StringBuilder sb = new StringBuilder("MultiBillerTransactionRequest(externalCustomerId=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(", phoneNumber=");
        sb.append(str4);
        sb.append(", nik=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
