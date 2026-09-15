package com.midtrans.sdk.corekit.models;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class OffersResponseModel {

    @SerializedName(FirebaseAnalytics.Param.DISCOUNT)
    private ArrayList<OffersListModel> binpromo = new ArrayList<>();

    @SerializedName("installment")
    private ArrayList<OffersListModel> installments = new ArrayList<>();

    public ArrayList<OffersListModel> getBinpromo() {
        return this.binpromo;
    }

    public ArrayList<OffersListModel> getInstallments() {
        return this.installments;
    }

    public void setBinpromo(ArrayList<OffersListModel> arrayList) {
        this.binpromo = arrayList;
    }

    public void setInstallments(ArrayList<OffersListModel> arrayList) {
        this.installments = arrayList;
    }
}
