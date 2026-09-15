package com.midtrans.sdk.corekit.models.snap;

/* JADX INFO: loaded from: classes6.dex */
public class PaymentOptions {
    private boolean creditCard3dSecure;
    private boolean saveCard;

    public PaymentOptions() {
    }

    public PaymentOptions(boolean z, boolean z2) {
        setCreditCard3dSecure(z);
        setSaveCard(z2);
    }

    public boolean isCreditCard3dSecure() {
        return this.creditCard3dSecure;
    }

    public boolean isSaveCard() {
        return this.saveCard;
    }

    public void setCreditCard3dSecure(boolean z) {
        this.creditCard3dSecure = z;
    }

    public void setSaveCard(boolean z) {
        this.saveCard = z;
    }
}
