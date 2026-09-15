package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SnapPromo {

    @SerializedName("allowed_promo_codes")
    public List<String> allowedPromoCodes;
    public boolean enabled;

    public List<String> getAllowedPromoCodes() {
        return this.allowedPromoCodes;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setAllowedPromoCodes(List<String> list) {
        this.allowedPromoCodes = list;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }
}
