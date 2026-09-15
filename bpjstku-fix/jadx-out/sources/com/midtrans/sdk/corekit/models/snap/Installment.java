package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class Installment {
    public boolean required;

    @SerializedName("terms")
    public Map<String, ArrayList<Integer>> terms;

    public Map<String, ArrayList<Integer>> getTerms() {
        return this.terms;
    }

    public boolean isRequired() {
        return this.required;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }

    public void setTerms(Map<String, ArrayList<Integer>> map) {
        this.terms = map;
    }
}
