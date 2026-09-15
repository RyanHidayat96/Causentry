package com.midtrans.sdk.corekit.core;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public class SdkCoreFlowBuilder extends BaseSdkBuilder<SdkCoreFlowBuilder> {
    public SdkCoreFlowBuilder() {
        this.flow = BaseSdkBuilder.CORE_FLOW;
    }

    private SdkCoreFlowBuilder(Context context, String str, String str2) {
        this.context = context.getApplicationContext();
        this.clientKey = str;
        this.merchantServerUrl = str2;
        this.flow = BaseSdkBuilder.CORE_FLOW;
    }

    public static SdkCoreFlowBuilder init() {
        return new SdkCoreFlowBuilder();
    }

    @Deprecated
    public static SdkCoreFlowBuilder init(Context context, String str, String str2) {
        return new SdkCoreFlowBuilder(context, str, str2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.midtrans.sdk.corekit.core.BaseSdkBuilder
    public SdkCoreFlowBuilder enableLog(boolean z) {
        this.enableLog = z;
        return this;
    }

    public SdkCoreFlowBuilder setClientKey(String str) {
        this.clientKey = str;
        return this;
    }

    public SdkCoreFlowBuilder setContext(Context context) {
        this.context = context;
        return this;
    }

    public SdkCoreFlowBuilder setMerchantBaseUrl(String str) {
        this.merchantServerUrl = str;
        return this;
    }
}
