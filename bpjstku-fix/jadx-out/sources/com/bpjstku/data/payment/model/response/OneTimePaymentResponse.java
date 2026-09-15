package com.bpjstku.data.payment.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\"\u0010\u000fJ\u001d\u0010%\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u001a¢\u0006\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u000fR\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u000fR\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u000fR\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u000fR\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010\u000fR\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010\u000fR\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010\u000fR\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b7\u0010\u000fR\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b9\u0010\u000f"}, d2 = {"Lcom/bpjstku/data/payment/model/response/OneTimePaymentResponse;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bpjstku/data/payment/model/response/OneTimePaymentResponse;", "", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "idOneTimePayment", "Ljava/lang/String;", "getIdOneTimePayment", "externalId", "getExternalId", "userId", "getUserId", "merchantProfileUrl", "getMerchantProfileUrl", "successRedirectUrl", "getSuccessRedirectUrl", "failureRedirectUrl", "getFailureRedirectUrl", NotificationCompat.CATEGORY_STATUS, "getStatus", "invoiceUrl", "getInvoiceUrl", "merchantName", "getMerchantName"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OneTimePaymentResponse implements Parcelable {

    @SerializedName("external_id")
    private final String externalId;

    @SerializedName("failure_redirect_url")
    private final String failureRedirectUrl;

    @SerializedName("id")
    private final String idOneTimePayment;

    @SerializedName("invoice_url")
    private final String invoiceUrl;

    @SerializedName("merchant_name")
    private final String merchantName;

    @SerializedName("merchant_profile_picture_url")
    private final String merchantProfileUrl;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final String status;

    @SerializedName("success_redirect_url")
    private final String successRedirectUrl;

    @SerializedName("user_id")
    private final String userId;
    public static final Parcelable.Creator<OneTimePaymentResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OneTimePaymentResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OneTimePaymentResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OneTimePaymentResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OneTimePaymentResponse[] newArray(int i) {
            return new OneTimePaymentResponse[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public OneTimePaymentResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.idOneTimePayment = str;
        this.externalId = str2;
        this.userId = str3;
        this.merchantProfileUrl = str4;
        this.successRedirectUrl = str5;
        this.failureRedirectUrl = str6;
        this.status = str7;
        this.invoiceUrl = str8;
        this.merchantName = str9;
    }

    public final String getIdOneTimePayment() {
        return this.idOneTimePayment;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getMerchantProfileUrl() {
        return this.merchantProfileUrl;
    }

    public final String getSuccessRedirectUrl() {
        return this.successRedirectUrl;
    }

    public final String getFailureRedirectUrl() {
        return this.failureRedirectUrl;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdOneTimePayment() {
        return this.idOneTimePayment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMerchantProfileUrl() {
        return this.merchantProfileUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuccessRedirectUrl() {
        return this.successRedirectUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFailureRedirectUrl() {
        return this.failureRedirectUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInvoiceUrl() {
        return this.invoiceUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    public final OneTimePaymentResponse copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        return new OneTimePaymentResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof OneTimePaymentResponse)) {
            return false;
        }
        OneTimePaymentResponse oneTimePaymentResponse = (OneTimePaymentResponse) p0;
        return Intrinsics.areEqual(this.idOneTimePayment, oneTimePaymentResponse.idOneTimePayment) && Intrinsics.areEqual(this.externalId, oneTimePaymentResponse.externalId) && Intrinsics.areEqual(this.userId, oneTimePaymentResponse.userId) && Intrinsics.areEqual(this.merchantProfileUrl, oneTimePaymentResponse.merchantProfileUrl) && Intrinsics.areEqual(this.successRedirectUrl, oneTimePaymentResponse.successRedirectUrl) && Intrinsics.areEqual(this.failureRedirectUrl, oneTimePaymentResponse.failureRedirectUrl) && Intrinsics.areEqual(this.status, oneTimePaymentResponse.status) && Intrinsics.areEqual(this.invoiceUrl, oneTimePaymentResponse.invoiceUrl) && Intrinsics.areEqual(this.merchantName, oneTimePaymentResponse.merchantName);
    }

    public final int hashCode() {
        return (((((((((((((((this.idOneTimePayment.hashCode() * 31) + this.externalId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.merchantProfileUrl.hashCode()) * 31) + this.successRedirectUrl.hashCode()) * 31) + this.failureRedirectUrl.hashCode()) * 31) + this.status.hashCode()) * 31) + this.invoiceUrl.hashCode()) * 31) + this.merchantName.hashCode();
    }

    public final String toString() {
        String str = this.idOneTimePayment;
        String str2 = this.externalId;
        String str3 = this.userId;
        String str4 = this.merchantProfileUrl;
        String str5 = this.successRedirectUrl;
        String str6 = this.failureRedirectUrl;
        String str7 = this.status;
        String str8 = this.invoiceUrl;
        String str9 = this.merchantName;
        StringBuilder sb = new StringBuilder("OneTimePaymentResponse(idOneTimePayment=");
        sb.append(str);
        sb.append(", externalId=");
        sb.append(str2);
        sb.append(", userId=");
        sb.append(str3);
        sb.append(", merchantProfileUrl=");
        sb.append(str4);
        sb.append(", successRedirectUrl=");
        sb.append(str5);
        sb.append(", failureRedirectUrl=");
        sb.append(str6);
        sb.append(", status=");
        sb.append(str7);
        sb.append(", invoiceUrl=");
        sb.append(str8);
        sb.append(", merchantName=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.idOneTimePayment);
        p0.writeString(this.externalId);
        p0.writeString(this.userId);
        p0.writeString(this.merchantProfileUrl);
        p0.writeString(this.successRedirectUrl);
        p0.writeString(this.failureRedirectUrl);
        p0.writeString(this.status);
        p0.writeString(this.invoiceUrl);
        p0.writeString(this.merchantName);
    }
}
