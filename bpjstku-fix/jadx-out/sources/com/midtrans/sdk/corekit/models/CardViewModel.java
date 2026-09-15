package com.midtrans.sdk.corekit.models;

/* JADX INFO: loaded from: classes6.dex */
public class CardViewModel {
    private SaveCardRequest cardDetail;
    private boolean isSelected;

    public CardViewModel(SaveCardRequest saveCardRequest) {
        setCardDetail(saveCardRequest);
        setIsSelected(false);
    }

    public SaveCardRequest getCardDetail() {
        return this.cardDetail;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCardDetail(SaveCardRequest saveCardRequest) {
        this.cardDetail = saveCardRequest;
    }

    public void setIsSelected(boolean z) {
        this.isSelected = z;
    }
}
