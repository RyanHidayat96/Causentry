package com.midtrans.sdk.corekit.models.snap;

import com.google.gson.annotations.SerializedName;
import com.midtrans.sdk.corekit.utilities.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class CreditCard {
    public static final String MIGS = "migs";

    @Deprecated
    public static final String RBA = "rba";
    public String authentication;
    public String bank;

    @SerializedName("blacklist_bins")
    public List<String> blacklistBins;
    public String channel;

    @SerializedName("installment")
    public Installment installment;

    @SerializedName("save_card")
    public boolean saveCard;

    @SerializedName("saved_tokens")
    public List<SavedToken> savedTokens;
    public boolean secure;

    @SerializedName("token_id")
    public String tokenId;
    public String type;

    @SerializedName("whitelist_bins")
    public ArrayList<String> whitelistBins;

    public String getAuthentication() {
        return this.authentication;
    }

    public String getBank() {
        return this.bank;
    }

    public List<String> getBlacklistBins() {
        return this.blacklistBins;
    }

    public String getChannel() {
        return this.channel;
    }

    public Installment getInstallment() {
        return this.installment;
    }

    public List<SavedToken> getSavedTokens() {
        return this.savedTokens;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public String getType() {
        return this.type;
    }

    public ArrayList<String> getWhitelistBins() {
        return this.whitelistBins;
    }

    public boolean isSaveCard() {
        return this.saveCard;
    }

    public boolean isSecure() {
        return this.secure;
    }

    public void setAuthentication(String str) {
        boolean z = str != null && str.equals(Authentication.AUTH_3DS);
        this.secure = z;
        this.authentication = Utils.mappingToCreditCardAuthentication(str, z);
    }

    public void setBank(String str) {
        this.bank = str;
    }

    public void setBlacklistBins(List<String> list) {
        this.blacklistBins = list;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setInstallment(Installment installment) {
        this.installment = installment;
    }

    public void setSaveCard(boolean z) {
        this.saveCard = z;
    }

    public void setSavedTokens(List<SavedToken> list) {
        this.savedTokens = list;
    }

    public void setTokenId(String str) {
        this.tokenId = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setWhiteListBins(ArrayList<String> arrayList) {
        this.whitelistBins = arrayList;
    }
}
