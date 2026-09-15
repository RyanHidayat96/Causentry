package com.midtrans.sdk.corekit.models;

import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.midtrans.sdk.corekit.core.Constants;
import defpackage.ResolutionSelectorAllowedResolutionMode;
import defpackage.StateObservable;
import defpackage.StateObservableErrorWrapper;
import defpackage.getAllowedResolutionMode;
import defpackage.getOutputConfigId;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TransactionResponse implements Serializable {

    @SerializedName("va_numbers")
    private List<VaNumber> accountNumbers;

    @SerializedName("alfamart_expire_time")
    private String alfamartExpireTime;

    @SerializedName("approval_code")
    private String approvalCode;
    private String bank;

    @SerializedName("bca_expiration")
    private String bcaExpiration;

    @SerializedName("bca_klikbca_expire_time")
    private String bcaKlikBcaExpiration;

    @SerializedName("bca_va_number")
    private String bcaVaNumber;

    @SerializedName("bni_expiration")
    private String bniExpiration;

    @SerializedName("bni_va_number")
    private String bniVaNumber;

    @SerializedName("bri_expiration")
    private String briExpiration;

    @SerializedName("bri_va_number")
    private String briVaNumber;

    @SerializedName("biller_code")
    private String companyCode;
    private String currency;

    @SerializedName("deeplink_url")
    private String deeplinkUrl;
    private String eci;

    @SerializedName("finish_redirect_url")
    private String finishRedirectUrl;

    @SerializedName("fraud_status")
    private String fraudStatus;

    @SerializedName("gopay_expiration")
    private String gopayExpiration;

    @SerializedName("gopay_expiration_raw")
    private String gopayExpirationRaw;

    @SerializedName("gross_amount")
    private String grossAmount;

    @SerializedName("indomaret_expire_time")
    private String indomaretExpireTime;

    @SerializedName("installment_term")
    private String installmentTerm;

    @SerializedName("kioson_expire_time")
    private String kiosonExpireTime;

    @SerializedName("billpayment_expiration")
    private String mandiriBillExpiration;

    @SerializedName("masked_card")
    private String maskedCard;

    @SerializedName("order_id")
    private String orderId;

    @SerializedName("bill_key")
    private String paymentCode;

    @SerializedName("payment_code")
    private String paymentCodeResponse;

    @SerializedName(FirebaseAnalytics.Param.PAYMENT_TYPE)
    private String paymentType;

    @SerializedName("pdf_url")
    private String pdfUrl;

    @SerializedName("permata_expiration")
    private String permataExpiration;

    @SerializedName("permata_va_number")
    private String permataVANumber;

    @SerializedName("point_balance")
    private float pointBalance;

    @SerializedName("point_balance_amount")
    private String pointBalanceAmount;

    @SerializedName("point_redeem_amount")
    private float pointRedeemAmount;

    @SerializedName("qr_code_url")
    private String qrCodeUrl;

    @SerializedName("qris_url")
    private String qrisUrl;

    @SerializedName(Constants.WEBVIEW_REDIRECT_URL)
    private String redirectUrl;

    @SerializedName("saved_token_id")
    private String savedTokenId;

    @SerializedName("saved_token_id_expired_at")
    private String savedTokenIdExpiredAt;

    @SerializedName("secure_token")
    private boolean secureToken;

    @SerializedName("status_code")
    private String statusCode;

    @SerializedName("status_message")
    private String statusMessage;

    @SerializedName(FirebaseAnalytics.Param.TRANSACTION_ID)
    private String transactionId;

    @SerializedName("transaction_status")
    private String transactionStatus;

    @SerializedName("transaction_time")
    private String transactionTime;

    @SerializedName("uob_ezpay_deeplink_url")
    private String uobDeeplinkUrl;

    @SerializedName("uob_ezpay_web_url")
    private String uobWebUrl;

    @SerializedName("validation_messages")
    private ArrayList<String> validationMessages;

    @SerializedName("xl_expiration")
    private String xlTunaiExpiration;

    @SerializedName("xl_tunai_merchant_id")
    private String xlTunaiMerchantId;

    @SerializedName("xl_tunai_order_id")
    private String xlTunaiOrderId;

    public TransactionResponse() {
    }

    public TransactionResponse(String str) {
        this.statusMessage = str;
    }

    public TransactionResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.statusCode = str;
        this.statusMessage = str2;
        this.transactionId = str3;
        this.orderId = str4;
        this.grossAmount = str5;
        this.paymentType = str6;
        this.transactionTime = str7;
        this.transactionStatus = str8;
        this.installmentTerm = str9;
    }

    public List<VaNumber> getAccountNumbers() {
        return this.accountNumbers;
    }

    public String getAlfamartExpireTime() {
        return this.alfamartExpireTime;
    }

    public String getApprovalCode() {
        return this.approvalCode;
    }

    public String getBank() {
        return this.bank;
    }

    public String getBcaExpiration() {
        return this.bcaExpiration;
    }

    public String getBcaKlikBcaExpiration() {
        return this.bcaKlikBcaExpiration;
    }

    public String getBcaVaNumber() {
        return this.bcaVaNumber;
    }

    public String getBniExpiration() {
        return this.bniExpiration;
    }

    public String getBniVaNumber() {
        return this.bniVaNumber;
    }

    public String getBriExpiration() {
        return this.briExpiration;
    }

    public String getBriVaNumber() {
        return this.briVaNumber;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    public String getEci() {
        return this.eci;
    }

    public String getFinishRedirectUrl() {
        return this.finishRedirectUrl;
    }

    public String getFraudStatus() {
        return TextUtils.isEmpty(this.fraudStatus) ? "" : this.fraudStatus;
    }

    public String getGopayExpiration() {
        return this.gopayExpiration;
    }

    public String getGopayExpirationRaw() {
        return this.gopayExpirationRaw;
    }

    public String getGrossAmount() {
        return this.grossAmount;
    }

    public String getIndomaretExpireTime() {
        return this.indomaretExpireTime;
    }

    public String getInstallmentTerm() {
        return this.installmentTerm;
    }

    public String getKiosonExpireTime() {
        return this.kiosonExpireTime;
    }

    public String getMandiriBillExpiration() {
        return this.mandiriBillExpiration;
    }

    public String getMaskedCard() {
        return this.maskedCard;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPaymentCode() {
        return this.paymentCode;
    }

    public String getPaymentCodeResponse() {
        return this.paymentCodeResponse;
    }

    public String getPaymentType() {
        return TextUtils.isEmpty(this.paymentType) ? "" : this.paymentType;
    }

    public String getPdfUrl() {
        return this.pdfUrl;
    }

    public String getPermataExpiration() {
        return this.permataExpiration;
    }

    public String getPermataVANumber() {
        return this.permataVANumber;
    }

    public float getPointBalance() {
        return this.pointBalance;
    }

    public String getPointBalanceAmount() {
        return this.pointBalanceAmount;
    }

    public float getPointRedeemAmount() {
        return this.pointRedeemAmount;
    }

    public String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public String getQrisUrl() {
        return this.qrisUrl;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public String getSavedTokenId() {
        return TextUtils.isEmpty(this.savedTokenId) ? "" : this.savedTokenId;
    }

    public String getSavedTokenIdExpiredAt() {
        return this.savedTokenIdExpiredAt;
    }

    public String getStatusCode() {
        return TextUtils.isEmpty(this.statusCode) ? "" : this.statusCode;
    }

    public String getStatusMessage() {
        return TextUtils.isEmpty(this.statusMessage) ? "" : this.statusMessage;
    }

    public String getString() {
        try {
            return new Gson().toJson(this);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public String getTransactionStatus() {
        return TextUtils.isEmpty(this.transactionStatus) ? "" : this.transactionStatus;
    }

    public String getTransactionTime() {
        return TextUtils.isEmpty(this.transactionTime) ? "" : this.transactionTime;
    }

    public String getUobDeeplinkUrl() {
        return this.uobDeeplinkUrl;
    }

    public String getUobWebUrl() {
        return this.uobWebUrl;
    }

    public ArrayList<String> getValidationMessages() {
        return this.validationMessages;
    }

    public String getXlTunaiExpiration() {
        return this.xlTunaiExpiration;
    }

    public String getXlTunaiMerchantId() {
        return this.xlTunaiMerchantId;
    }

    public String getXlTunaiOrderId() {
        return this.xlTunaiOrderId;
    }

    public boolean isSecureToken() {
        return this.secureToken;
    }

    public void setAccountNumbers(List<VaNumber> list) {
        this.accountNumbers = list;
    }

    public void setAlfamartExpireTime(String str) {
        this.alfamartExpireTime = str;
    }

    public void setApprovalCode(String str) {
        this.approvalCode = str;
    }

    public void setBank(String str) {
        this.bank = str;
    }

    public void setBcaExpiration(String str) {
        this.bcaExpiration = str;
    }

    public void setBcaKlikBcaExpiration(String str) {
        this.bcaKlikBcaExpiration = str;
    }

    public void setBcaVaNumber(String str) {
        this.bcaVaNumber = str;
    }

    public void setBniExpiration(String str) {
        this.bniExpiration = str;
    }

    public void setBniVaNumber(String str) {
        this.bniVaNumber = str;
    }

    public void setBriExpiration(String str) {
        this.briExpiration = str;
    }

    public void setBriVaNumber(String str) {
        this.briVaNumber = str;
    }

    public void setCompanyCode(String str) {
        this.companyCode = str;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setDeeplinkUrl(String str) {
        this.deeplinkUrl = str;
    }

    public void setEci(String str) {
        this.eci = str;
    }

    public void setFinishRedirectUrl(String str) {
        this.finishRedirectUrl = str;
    }

    public void setFraudStatus(String str) {
        this.fraudStatus = str;
    }

    public void setGopayExpiration(String str) {
        this.gopayExpiration = str;
    }

    public void setGopayExpirationRaw(String str) {
        this.gopayExpirationRaw = str;
    }

    public void setGrossAmount(String str) {
        this.grossAmount = str;
    }

    public void setIndomaretExpireTime(String str) {
        this.indomaretExpireTime = str;
    }

    public void setInstallmentTerm(String str) {
        this.installmentTerm = str;
    }

    public void setKiosonExpireTime(String str) {
        this.kiosonExpireTime = str;
    }

    public void setMandiriBillExpiration(String str) {
        this.mandiriBillExpiration = str;
    }

    public void setMaskedCard(String str) {
        this.maskedCard = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPaymentCode(String str) {
        this.paymentCode = str;
    }

    public void setPaymentCodeResponse(String str) {
        this.paymentCodeResponse = str;
    }

    public void setPaymentType(String str) {
        this.paymentType = str;
    }

    public void setPdfUrl(String str) {
        this.pdfUrl = str;
    }

    public void setPermataExpiration(String str) {
        this.permataExpiration = str;
    }

    public void setPermataVANumber(String str) {
        this.permataVANumber = str;
    }

    public void setPointBalance(float f) {
        this.pointBalance = f;
    }

    public void setPointBalanceAmount(String str) {
        this.pointBalanceAmount = str;
    }

    public void setPointRedeemAmount(float f) {
        this.pointRedeemAmount = f;
    }

    public void setQrCodeUrl(String str) {
        this.qrCodeUrl = str;
    }

    public void setQrisUrl(String str) {
        this.qrisUrl = str;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public void setSavedTokenId(String str) {
        this.savedTokenId = str;
    }

    public void setSavedTokenIdExpiredAt(String str) {
        this.savedTokenIdExpiredAt = str;
    }

    public void setSecureToken(boolean z) {
        this.secureToken = z;
    }

    public void setStatusCode(String str) {
        this.statusCode = str;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public void setTransactionId(String str) {
        this.transactionId = str;
    }

    public void setTransactionStatus(String str) {
        this.transactionStatus = str;
    }

    public void setTransactionTime(String str) {
        this.transactionTime = str;
    }

    public void setUobDeeplinkUrl(String str) {
        this.uobDeeplinkUrl = str;
    }

    public void setUobWebUrl(String str) {
        this.uobWebUrl = str;
    }

    public void setValidationMessages(ArrayList<String> arrayList) {
        this.validationMessages = arrayList;
    }

    public void setXlTunaiExpiration(String str) {
        this.xlTunaiExpiration = str;
    }

    public void setXlTunaiMerchantId(String str) {
        this.xlTunaiMerchantId = str;
    }

    public void setXlTunaiOrderId(String str) {
        this.xlTunaiOrderId = str;
    }

    public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Gson gson, JsonWriter jsonWriter, StateObservableErrorWrapper stateObservableErrorWrapper) throws IOException {
        jsonWriter.beginObject();
        TuitionPaymentFragmentbindingInflater1(gson, jsonWriter, stateObservableErrorWrapper);
        jsonWriter.endObject();
    }

    protected final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Gson gson, JsonWriter jsonWriter, StateObservableErrorWrapper stateObservableErrorWrapper) throws IOException {
        if (this != this.accountNumbers) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 195);
            getAllowedResolutionMode getallowedresolutionmode = new getAllowedResolutionMode();
            List<VaNumber> list = this.accountNumbers;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, getallowedresolutionmode, list).write(jsonWriter, list);
        }
        if (this != this.alfamartExpireTime) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 39);
            jsonWriter.value(this.alfamartExpireTime);
        }
        if (this != this.approvalCode) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 36);
            jsonWriter.value(this.approvalCode);
        }
        if (this != this.bank) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 8);
            jsonWriter.value(this.bank);
        }
        if (this != this.bcaExpiration) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 181);
            jsonWriter.value(this.bcaExpiration);
        }
        if (this != this.bcaKlikBcaExpiration) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 163);
            jsonWriter.value(this.bcaKlikBcaExpiration);
        }
        if (this != this.bcaVaNumber) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 100);
            jsonWriter.value(this.bcaVaNumber);
        }
        if (this != this.bniExpiration) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 229);
            jsonWriter.value(this.bniExpiration);
        }
        if (this != this.bniVaNumber) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 93);
            jsonWriter.value(this.bniVaNumber);
        }
        if (this != this.briExpiration) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 161);
            jsonWriter.value(this.briExpiration);
        }
        if (this != this.briVaNumber) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 18);
            jsonWriter.value(this.briVaNumber);
        }
        if (this != this.companyCode) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 160);
            jsonWriter.value(this.companyCode);
        }
        if (this != this.currency) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 142);
            jsonWriter.value(this.currency);
        }
        if (this != this.deeplinkUrl) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 182);
            jsonWriter.value(this.deeplinkUrl);
        }
        if (this != this.eci) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 83);
            jsonWriter.value(this.eci);
        }
        if (this != this.finishRedirectUrl) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 127);
            jsonWriter.value(this.finishRedirectUrl);
        }
        if (this != this.fraudStatus) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 2);
            jsonWriter.value(this.fraudStatus);
        }
        if (this != this.gopayExpiration) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 40);
            jsonWriter.value(this.gopayExpiration);
        }
        if (this != this.gopayExpirationRaw) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 96);
            jsonWriter.value(this.gopayExpirationRaw);
        }
        if (this != this.grossAmount) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 225);
            jsonWriter.value(this.grossAmount);
        }
        if (this != this.indomaretExpireTime) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 33);
            jsonWriter.value(this.indomaretExpireTime);
        }
        if (this != this.installmentTerm) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 172);
            jsonWriter.value(this.installmentTerm);
        }
        if (this != this.kiosonExpireTime) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 164);
            jsonWriter.value(this.kiosonExpireTime);
        }
        if (this != this.mandiriBillExpiration) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 202);
            jsonWriter.value(this.mandiriBillExpiration);
        }
        if (this != this.maskedCard) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 98);
            jsonWriter.value(this.maskedCard);
        }
        if (this != this.orderId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 236);
            jsonWriter.value(this.orderId);
        }
        if (this != this.paymentCode) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 28);
            jsonWriter.value(this.paymentCode);
        }
        if (this != this.paymentCodeResponse) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 71);
            jsonWriter.value(this.paymentCodeResponse);
        }
        if (this != this.paymentType) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 133);
            jsonWriter.value(this.paymentType);
        }
        if (this != this.pdfUrl) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 158);
            jsonWriter.value(this.pdfUrl);
        }
        if (this != this.permataExpiration) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 122);
            jsonWriter.value(this.permataExpiration);
        }
        if (this != this.permataVANumber) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, ModuleDescriptor.MODULE_VERSION);
            jsonWriter.value(this.permataVANumber);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 171);
        Class cls = Float.TYPE;
        Float fValueOf = Float.valueOf(this.pointBalance);
        getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, cls, fValueOf).write(jsonWriter, fValueOf);
        if (this != this.pointBalanceAmount) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 214);
            jsonWriter.value(this.pointBalanceAmount);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 32);
        Class cls2 = Float.TYPE;
        Float fValueOf2 = Float.valueOf(this.pointRedeemAmount);
        getOutputConfigId.TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, cls2, fValueOf2).write(jsonWriter, fValueOf2);
        if (this != this.qrCodeUrl) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 167);
            jsonWriter.value(this.qrCodeUrl);
        }
        if (this != this.qrisUrl) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 220);
            jsonWriter.value(this.qrisUrl);
        }
        if (this != this.redirectUrl) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 77);
            jsonWriter.value(this.redirectUrl);
        }
        if (this != this.savedTokenId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 185);
            jsonWriter.value(this.savedTokenId);
        }
        if (this != this.savedTokenIdExpiredAt) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 10);
            jsonWriter.value(this.savedTokenIdExpiredAt);
        }
        stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 203);
        jsonWriter.value(this.secureToken);
        if (this != this.statusCode) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 118);
            jsonWriter.value(this.statusCode);
        }
        if (this != this.statusMessage) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 165);
            jsonWriter.value(this.statusMessage);
        }
        if (this != this.transactionId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 184);
            jsonWriter.value(this.transactionId);
        }
        if (this != this.transactionStatus) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 232);
            jsonWriter.value(this.transactionStatus);
        }
        if (this != this.transactionTime) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 169);
            jsonWriter.value(this.transactionTime);
        }
        if (this != this.uobDeeplinkUrl) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 97);
            jsonWriter.value(this.uobDeeplinkUrl);
        }
        if (this != this.uobWebUrl) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 13);
            jsonWriter.value(this.uobWebUrl);
        }
        if (this != this.validationMessages) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 11);
            ResolutionSelectorAllowedResolutionMode resolutionSelectorAllowedResolutionMode = new ResolutionSelectorAllowedResolutionMode();
            ArrayList<String> arrayList = this.validationMessages;
            getOutputConfigId.TuitionPaymentFragmentbindingInflater1(gson, resolutionSelectorAllowedResolutionMode, arrayList).write(jsonWriter, arrayList);
        }
        if (this != this.xlTunaiExpiration) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 50);
            jsonWriter.value(this.xlTunaiExpiration);
        }
        if (this != this.xlTunaiMerchantId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 241);
            jsonWriter.value(this.xlTunaiMerchantId);
        }
        if (this != this.xlTunaiOrderId) {
            stateObservableErrorWrapper.TuitionPaymentFragmentbindingInflater1(jsonWriter, 148);
            jsonWriter.value(this.xlTunaiOrderId);
        }
    }

    public final /* synthetic */ void b(Gson gson, JsonReader jsonReader, StateObservable stateObservable) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(gson, jsonReader, stateObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jsonReader));
        }
        jsonReader.endObject();
    }

    protected final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Gson gson, JsonReader jsonReader, int i) throws IOException {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        switch (i) {
            case 6:
                if (!z) {
                    this.transactionId = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.transactionId = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.transactionId = jsonReader.nextString();
                }
                break;
            case 7:
                if (!z) {
                    this.uobWebUrl = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.uobWebUrl = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.uobWebUrl = jsonReader.nextString();
                }
                break;
            case 13:
                if (!z) {
                    this.grossAmount = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.grossAmount = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.grossAmount = jsonReader.nextString();
                }
                break;
            case 17:
                if (!z) {
                    this.bank = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bank = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.bank = jsonReader.nextString();
                }
                break;
            case 19:
                if (!z) {
                    this.paymentType = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.paymentType = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.paymentType = jsonReader.nextString();
                }
                break;
            case 23:
                if (!z) {
                    this.paymentCode = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.paymentCode = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.paymentCode = jsonReader.nextString();
                }
                break;
            case 29:
                if (!z) {
                    this.installmentTerm = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.installmentTerm = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.installmentTerm = jsonReader.nextString();
                }
                break;
            case 31:
                if (!z) {
                    this.xlTunaiOrderId = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.xlTunaiOrderId = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.xlTunaiOrderId = jsonReader.nextString();
                }
                break;
            case 42:
                if (!z) {
                    this.eci = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.eci = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.eci = jsonReader.nextString();
                }
                break;
            case 43:
                if (!z) {
                    this.approvalCode = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.approvalCode = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.approvalCode = jsonReader.nextString();
                }
                break;
            case 46:
                if (!z) {
                    this.pointBalanceAmount = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pointBalanceAmount = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.pointBalanceAmount = jsonReader.nextString();
                }
                break;
            case 48:
                if (!z) {
                    this.finishRedirectUrl = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.finishRedirectUrl = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.finishRedirectUrl = jsonReader.nextString();
                }
                break;
            case 52:
                if (!z) {
                    this.transactionTime = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.transactionTime = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.transactionTime = jsonReader.nextString();
                }
                break;
            case 53:
                if (!z) {
                    this.qrCodeUrl = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.qrCodeUrl = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.qrCodeUrl = jsonReader.nextString();
                }
                break;
            case 54:
                if (!z) {
                    this.briVaNumber = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.briVaNumber = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.briVaNumber = jsonReader.nextString();
                }
                break;
            case 57:
                if (!z) {
                    this.redirectUrl = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.redirectUrl = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.redirectUrl = jsonReader.nextString();
                }
                break;
            case 58:
                if (!z) {
                    this.bcaVaNumber = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bcaVaNumber = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.bcaVaNumber = jsonReader.nextString();
                }
                break;
            case 71:
                if (!z) {
                    this.bniVaNumber = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bniVaNumber = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.bniVaNumber = jsonReader.nextString();
                }
                break;
            case 79:
                if (!z) {
                    jsonReader.nextNull();
                } else {
                    this.secureToken = ((Boolean) gson.getAdapter(Boolean.class).read(jsonReader)).booleanValue();
                }
                break;
            case 81:
                if (!z) {
                    this.briExpiration = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.briExpiration = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.briExpiration = jsonReader.nextString();
                }
                break;
            case 87:
                if (!z) {
                    this.bcaExpiration = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bcaExpiration = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.bcaExpiration = jsonReader.nextString();
                }
                break;
            case 89:
                if (!z) {
                    this.kiosonExpireTime = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.kiosonExpireTime = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.kiosonExpireTime = jsonReader.nextString();
                }
                break;
            case 90:
                if (!z) {
                    this.paymentCodeResponse = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.paymentCodeResponse = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.paymentCodeResponse = jsonReader.nextString();
                }
                break;
            case 106:
                if (!z) {
                    this.xlTunaiMerchantId = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.xlTunaiMerchantId = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.xlTunaiMerchantId = jsonReader.nextString();
                }
                break;
            case 109:
                if (!z) {
                    this.gopayExpirationRaw = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.gopayExpirationRaw = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.gopayExpirationRaw = jsonReader.nextString();
                }
                break;
            case 110:
                if (!z) {
                    this.fraudStatus = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.fraudStatus = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.fraudStatus = jsonReader.nextString();
                }
                break;
            case 112:
                if (!z) {
                    this.bniExpiration = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bniExpiration = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.bniExpiration = jsonReader.nextString();
                }
                break;
            case 114:
                if (!z) {
                    this.uobDeeplinkUrl = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.uobDeeplinkUrl = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.uobDeeplinkUrl = jsonReader.nextString();
                }
                break;
            case 115:
                if (!z) {
                    this.statusCode = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.statusCode = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.statusCode = jsonReader.nextString();
                }
                break;
            case 123:
                if (!z) {
                    this.gopayExpiration = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.gopayExpiration = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.gopayExpiration = jsonReader.nextString();
                }
                break;
            case 132:
                if (!z) {
                    this.savedTokenIdExpiredAt = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.savedTokenIdExpiredAt = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.savedTokenIdExpiredAt = jsonReader.nextString();
                }
                break;
            case 137:
                if (!z) {
                    this.companyCode = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.companyCode = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.companyCode = jsonReader.nextString();
                }
                break;
            case 141:
                if (!z) {
                    this.alfamartExpireTime = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.alfamartExpireTime = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.alfamartExpireTime = jsonReader.nextString();
                }
                break;
            case 147:
                if (!z) {
                    this.mandiriBillExpiration = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.mandiriBillExpiration = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.mandiriBillExpiration = jsonReader.nextString();
                }
                break;
            case 152:
                if (!z) {
                    this.accountNumbers = null;
                    jsonReader.nextNull();
                } else {
                    this.accountNumbers = (List) gson.getAdapter(new getAllowedResolutionMode()).read(jsonReader);
                }
                break;
            case 159:
                if (!z) {
                    this.deeplinkUrl = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.deeplinkUrl = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.deeplinkUrl = jsonReader.nextString();
                }
                break;
            case 167:
                if (!z) {
                    this.statusMessage = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.statusMessage = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.statusMessage = jsonReader.nextString();
                }
                break;
            case 171:
                if (!z) {
                    this.qrisUrl = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.qrisUrl = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.qrisUrl = jsonReader.nextString();
                }
                break;
            case 172:
                if (!z) {
                    this.xlTunaiExpiration = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.xlTunaiExpiration = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.xlTunaiExpiration = jsonReader.nextString();
                }
                break;
            case 175:
                if (!z) {
                    this.savedTokenId = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.savedTokenId = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.savedTokenId = jsonReader.nextString();
                }
                break;
            case 178:
                if (!z) {
                    this.bcaKlikBcaExpiration = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.bcaKlikBcaExpiration = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.bcaKlikBcaExpiration = jsonReader.nextString();
                }
                break;
            case 181:
                if (!z) {
                    jsonReader.nextNull();
                } else {
                    this.pointRedeemAmount = ((Float) gson.getAdapter(Float.class).read(jsonReader)).floatValue();
                }
                break;
            case 183:
                if (!z) {
                    this.indomaretExpireTime = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.indomaretExpireTime = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.indomaretExpireTime = jsonReader.nextString();
                }
                break;
            case 195:
                if (!z) {
                    this.orderId = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.orderId = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.orderId = jsonReader.nextString();
                }
                break;
            case 198:
                if (!z) {
                    this.maskedCard = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.maskedCard = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.maskedCard = jsonReader.nextString();
                }
                break;
            case 200:
                if (!z) {
                    this.permataExpiration = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.permataExpiration = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.permataExpiration = jsonReader.nextString();
                }
                break;
            case 210:
                if (!z) {
                    this.permataVANumber = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.permataVANumber = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.permataVANumber = jsonReader.nextString();
                }
                break;
            case 216:
                if (!z) {
                    this.pdfUrl = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.pdfUrl = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.pdfUrl = jsonReader.nextString();
                }
                break;
            case 225:
                if (!z) {
                    this.currency = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.currency = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.currency = jsonReader.nextString();
                }
                break;
            case 227:
                if (!z) {
                    this.transactionStatus = null;
                    jsonReader.nextNull();
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    this.transactionStatus = Boolean.toString(jsonReader.nextBoolean());
                } else {
                    this.transactionStatus = jsonReader.nextString();
                }
                break;
            case 228:
                if (!z) {
                    jsonReader.nextNull();
                } else {
                    this.pointBalance = ((Float) gson.getAdapter(Float.class).read(jsonReader)).floatValue();
                }
                break;
            case 236:
                if (!z) {
                    this.validationMessages = null;
                    jsonReader.nextNull();
                } else {
                    this.validationMessages = (ArrayList) gson.getAdapter(new ResolutionSelectorAllowedResolutionMode()).read(jsonReader);
                }
                break;
            default:
                jsonReader.skipValue();
                break;
        }
    }
}
