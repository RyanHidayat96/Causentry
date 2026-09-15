package com.midtrans.sdk.corekit.core;

import android.content.Context;
import android.text.TextUtils;
import com.midtrans.sdk.corekit.callback.TransactionFinishedCallback;
import com.midtrans.sdk.corekit.core.themes.BaseColorTheme;
import com.midtrans.sdk.corekit.models.PaymentMethodsModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseSdkBuilder<T> {
    public static final String CORE_FLOW = "core";
    private static final String TAG = "BaseSdkBuilder";
    public static final String UI_FLOW = "ui";
    public static final String WIDGET = "widget";
    public UIKitCustomSetting UIKitCustomSetting;
    public String boldText;
    public BaseColorTheme colorTheme;
    public String defaultText;
    public IScanner externalScanner;
    public String flow;
    public ISdkFlow sdkFlow;
    public ArrayList<PaymentMethodsModel> selectedPaymentMethods;
    public String semiBoldText;
    public TransactionFinishedCallback transactionFinishedCallback;
    public String clientKey = null;
    public Context context = null;
    public boolean enableLog = false;
    public boolean enableBuiltInTokenStorage = true;
    public String merchantServerUrl = null;
    public String merchantName = null;
    public String languageCode = "en";

    public abstract T enableLog(boolean z);

    public MidtransSDK buildSDK() {
        if (isValidData()) {
            return MidtransSDK.delegateInstance(this);
        }
        Logger.e("already performing an transaction");
        return null;
    }

    public boolean isValidData() {
        if (this.clientKey == null || this.context == null) {
            Logger.e("Client key  and context cannot be null or empty. Please set the client key and context", new RuntimeException("Client key  and context cannot be null or empty. Please set the client key and context"));
        }
        if (this.enableBuiltInTokenStorage || !TextUtils.isEmpty(this.merchantServerUrl)) {
            return true;
        }
        Logger.e("Merchant base url cannot be null or empty (required) if you implement your own token storage. Please set your merchant base url to enable your own token storage", new RuntimeException("Merchant base url cannot be null or empty (required) if you implement your own token storage. Please set your merchant base url to enable your own token storage"));
        return true;
    }
}
