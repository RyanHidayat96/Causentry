package com.bpjstku.data.payment.model.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/bpjstku/data/payment/model/response/DirectDebitFieldProperties;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/DirectDebitFieldProperties;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "cardExpiry", "Ljava/lang/String;", "getCardExpiry", "cardLastFour", "getCardLastFour", "email", "getEmail", "mobileNumber", "getMobileNumber"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DirectDebitFieldProperties {
    public static final int $stable = 0;

    @SerializedName("card_expiry")
    private final String cardExpiry;

    @SerializedName("card_last_four")
    private final String cardLastFour;

    @SerializedName("email")
    private final String email;

    @SerializedName("mobileNumber")
    private final String mobileNumber;

    public DirectDebitFieldProperties(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.cardExpiry = str;
        this.cardLastFour = str2;
        this.email = str3;
        this.mobileNumber = str4;
    }

    public final String getCardExpiry() {
        return this.cardExpiry;
    }

    public final String getCardLastFour() {
        return this.cardLastFour;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public static /* synthetic */ DirectDebitFieldProperties copy$default(DirectDebitFieldProperties directDebitFieldProperties, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = directDebitFieldProperties.cardExpiry;
        }
        if ((i & 2) != 0) {
            str2 = directDebitFieldProperties.cardLastFour;
        }
        if ((i & 4) != 0) {
            str3 = directDebitFieldProperties.email;
        }
        if ((i & 8) != 0) {
            str4 = directDebitFieldProperties.mobileNumber;
        }
        return directDebitFieldProperties.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardExpiry() {
        return this.cardExpiry;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardLastFour() {
        return this.cardLastFour;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final DirectDebitFieldProperties copy(String p0, String p1, String p2, String p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new DirectDebitFieldProperties(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DirectDebitFieldProperties)) {
            return false;
        }
        DirectDebitFieldProperties directDebitFieldProperties = (DirectDebitFieldProperties) p0;
        return Intrinsics.areEqual(this.cardExpiry, directDebitFieldProperties.cardExpiry) && Intrinsics.areEqual(this.cardLastFour, directDebitFieldProperties.cardLastFour) && Intrinsics.areEqual(this.email, directDebitFieldProperties.email) && Intrinsics.areEqual(this.mobileNumber, directDebitFieldProperties.mobileNumber);
    }

    public final int hashCode() {
        return (((((this.cardExpiry.hashCode() * 31) + this.cardLastFour.hashCode()) * 31) + this.email.hashCode()) * 31) + this.mobileNumber.hashCode();
    }

    public final String toString() {
        String str = this.cardExpiry;
        String str2 = this.cardLastFour;
        String str3 = this.email;
        String str4 = this.mobileNumber;
        StringBuilder sb = new StringBuilder("DirectDebitFieldProperties(cardExpiry=");
        sb.append(str);
        sb.append(", cardLastFour=");
        sb.append(str2);
        sb.append(", email=");
        sb.append(str3);
        sb.append(", mobileNumber=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
