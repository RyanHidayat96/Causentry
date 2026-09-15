package com.midtrans.sdk.corekit.models.promo;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class Promo implements Cloneable {

    @SerializedName("bins")
    private List<String> bins;

    @SerializedName("calculated_discount_amount")
    private double calculatedDiscountAmount;

    @SerializedName("discount_type")
    private String discountType;

    @SerializedName("discounted_gross_amount")
    private double discountedGrossAmount;

    @SerializedName(FirebaseAnalytics.Param.END_DATE)
    private String endDate;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private long f844id;

    @SerializedName("name")
    private String name;

    @SerializedName("payment_types")
    private List<String> paymentTypes;

    @SerializedName("promo_code")
    private String promoCode;

    @SerializedName("promo_token")
    private String promoToken;
    private boolean selected;

    @SerializedName("sponsor_message_en")
    private String sponsorMessageEn;

    @SerializedName("sponsor_message_id")
    private String sponsorMessageId;

    @SerializedName("sponsor_name")
    private String sponsorName;

    @SerializedName(FirebaseAnalytics.Param.START_DATE)
    private String startDate;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public List<String> getBins() {
        return this.bins;
    }

    public double getCalculatedDiscountAmount() {
        return this.calculatedDiscountAmount;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public double getDiscountedGrossAmount() {
        return this.discountedGrossAmount;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public long getId() {
        return this.f844id;
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPaymentTypes() {
        return this.paymentTypes;
    }

    public String getPromoCode() {
        return this.promoCode;
    }

    public String getPromoToken() {
        return this.promoToken;
    }

    public String getSponsorMessageEn() {
        return this.sponsorMessageEn;
    }

    public String getSponsorMessageId() {
        return this.sponsorMessageId;
    }

    public String getSponsorName() {
        return this.sponsorName;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }
}
