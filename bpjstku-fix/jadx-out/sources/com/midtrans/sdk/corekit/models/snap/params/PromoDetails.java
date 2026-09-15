package com.midtrans.sdk.corekit.models.snap.params;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class PromoDetails {

    @SerializedName("discounted_gross_amount")
    private Double discountedGrossAmount;

    @SerializedName("promo_id")
    private Long promoId;

    public PromoDetails(Long l, Double d) {
        this.promoId = l;
        this.discountedGrossAmount = d;
    }
}
