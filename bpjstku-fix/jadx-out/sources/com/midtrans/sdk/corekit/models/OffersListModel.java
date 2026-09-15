package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class OffersListModel implements Serializable {

    @SerializedName("bins")
    private ArrayList<String> bins;
    private String description;

    @SerializedName("discount_percentage")
    private int discountPercentage;

    @SerializedName("installment_terms")
    private List<String> duration;

    @SerializedName("title")
    private String offerName;

    public ArrayList<String> getBins() {
        return this.bins;
    }

    public String getDescription() {
        return this.description;
    }

    public int getDiscountPercentage() {
        return this.discountPercentage;
    }

    public List<String> getDuration() {
        return this.duration;
    }

    public String getOfferName() {
        return this.offerName;
    }

    public void setBins(ArrayList<String> arrayList) {
        this.bins = arrayList;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDiscountPercentage(int i) {
        this.discountPercentage = i;
    }

    public void setDuration(List<String> list) {
        this.duration = list;
    }

    public void setOfferName(String str) {
        this.offerName = str;
    }
}
